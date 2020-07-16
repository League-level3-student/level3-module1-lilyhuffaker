package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
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
	ArrayList<Character> FullWord = new ArrayList<Character>(); 
	ArrayList<Character> Dashes = new ArrayList<Character>(); 
	
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
		//lives.setLocation(100, 150);
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
		life = 6;
		lives.setText("Lives: "+life);
		String selectedWord = words.pop();
		System.out.println(selectedWord);
		label.setText("");
		int length = selectedWord.length();
		for(int i = 0; i < length; i++) {
			Dashes.add('_');
			label.setText(""+Dashes);
			FullWord.add(selectedWord.charAt(i));
		}
	}
	
	public void updateLives() {
		if(life > 0) {
			life--;
		}
		else {
			JOptionPane.showMessageDialog(null, "You have lost all your lives!");
			String yOrn = JOptionPane.showInputDialog("would you like to play again? (y/n)");
			if(yOrn.contains("y")) {
				setUp();
			}
			else{
				frame.dispose();
			}
		}
		lives.setText("Lives: "+life);
	}
	
	public void Win() {
		JOptionPane.showMessageDialog(null, "Congrats! You won!");
			play();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		if(FullWord.contains(e.getKeyChar())) {
			//Give them a letter
			System.out.println("You got a letter!");
			for(int i = 0; i < FullWord.size(); i++) {
				if(e.getKeyChar() == FullWord.get(i)) {
					//Thats the letter
					Dashes.set(i, e.getKeyChar());
				}
			}
			label.setText(""+Dashes);
			if(!Dashes.contains('_')) {
				Win();
			}
		}
		else {
			updateLives();
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
