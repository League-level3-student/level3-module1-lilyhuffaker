package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton shuffle = new JButton("Shuffle");
	JButton stopSong = new JButton("Stop");
	
	ArrayList<Song> theBoys = new ArrayList<Song>();
	
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		shuffle.addActionListener(this);
		stopSong.addActionListener(this);
		
		panel.add(shuffle);
		panel.add(stopSong);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);
		 
		Song s = new Song("demo.mp3");
		Song d = new Song("demo.mp3");
		Song l = new Song("demo.mp3");
		
		
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random ;music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		
	}
	
	public static void main(String[] args) {
		new _06_IPodShuffle();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonClicked = (JButton)e.getSource();
		int which = 0;
		if(buttonClicked == shuffle) {
			theBoys.add(new Song("demo.mp3"));
			theBoys.add(new Song("demo2.mp3"));
			theBoys.add(new Song("demo3.mp3"));
			int randy = new Random().nextInt(theBoys.size());
			which = randy;
			theBoys.get(which).play();
			System.out.println("song "+which+" is playing");
		}
		if(buttonClicked == stopSong) {
			theBoys.get(which).stop();
			System.out.println("song "+which+" has stopped");
		}
	}
}