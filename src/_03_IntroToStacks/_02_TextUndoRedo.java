package _03_IntroToStacks;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	int labelSize = 0;
	
	char back = undo();
	Stack<Character> character = new Stack<Character>();
	
	static char undo() {
		return (char) '\b';
	}
	public static void main(String[] args) {
		new _02_TextUndoRedo().setUp();
	}
	
	public void setUp() {
		panel.add(label);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.addKeyListener(this);
		frame.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//PUSH THE CHAR ONTO THE LABEL ALSO WTF WHY ARE U SO LAZY
		char letter = e.getKeyChar();
		String text = label.getText();
		// TODO Auto-generated method stub
		if(e.getKeyChar() == back) {
			//label.setText(text);
			///FIX THIS
			label.setText(text);
			
		}
		else {
			character.push(letter);
			label.setText(" ");
			label.setText(label.getText() + character);
			labelSize++;
		}
	} 

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
