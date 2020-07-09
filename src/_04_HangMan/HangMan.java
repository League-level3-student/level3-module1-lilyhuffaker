package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JLabel lives = new JLabel();
	
	Stack<String> words = new Stack<String>();
	int life = 6;
	
	public static void main(String[] args) {
		new HangMan().setUp();
	}
	
	public void setUp() {
		panel.add(label);
		panel.add(lives);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200,200);
		frame.addKeyListener(this);
		frame.setVisible(true);
		
		String answer = JOptionPane.showInputDialog("How many rounds do you want to play? (1-266)");
		int num = Integer.parseInt(answer);
		for(int i = 0; i < num; i++) {
			String word = Utilities.readRandomLineFromFile("dictionary.txt");
			words.push(word);
		}
		play();
	}
	
	public void play() {
		String selectedWord = words.pop();
		label.setText("");
		int length = selectedWord.length();
		for(int i = 0; i < length; i++) {
			label.setText(label.getText()+" _ ");
		}//Work on the key pressed methods
	}
	
	public void updateLives() {
		if(life > 0) {
			life--;
		}
		else {
			JOptionPane.showMessageDialog(null, "You have lost all your lives!");
			String yOrn = JOptionPane.showInputDialog("would you like to play again? (y/n)");
			if(yOrn == "y" || yOrn == "yes" ) {
				setUp();
			}
			else{
				frame.dispose();
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
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
