package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	  JFrame frame = new JFrame();
	  JPanel panel = new JPanel();
	  JButton add = new JButton("Add Name");
	  JButton veiw = new JButton("Veiw Guests");
	  
	  ArrayList<String> names = new ArrayList<String>();
	 
	 public static void main(String[] args) {
		new _02_GuestBook().setUp();
	}
	
	 public void setUp(){
		 add.addActionListener(this);
		 veiw.addActionListener(this);
		 
		 panel.add(add);
		 panel.add(veiw);
		 frame.add(panel);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setSize(500, 500);
		 frame.setVisible(true);
	 }
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonClicked = (JButton)e.getSource();
		
		if(buttonClicked == add) {
			String name = JOptionPane.showInputDialog("Please enter a name");
			names.add(name);
		}
		if(buttonClicked == veiw) {
			for(int i = 1; i < names.size()+1; i++) {
				JOptionPane.showMessageDialog(null, "Guest #"+ i + ": " + names.get(i) + ",");
			}	
		}
	}
}
