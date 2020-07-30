package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	HashMap<Integer, String> log = new HashMap<Integer, String>();
	
	 JFrame frame = new JFrame();
	 JPanel panel = new JPanel();
	 JButton add = new JButton("Add entry");
	 JButton search = new JButton("Search by ID");
	 JButton view = new JButton("View list");
	 JButton remove = new JButton("Remove Entry");
	 
	public static void main(String[] args) {
		new _02_LogSearch().setUp();
	}
	
	public void setUp() {
		add.addActionListener(this);
		view.addActionListener(this);
		search.addActionListener(this);
		remove.addActionListener(this);
		
		panel.add(add);
		panel.add(search);
		panel.add(view);
		panel.add(remove);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonClicked = (JButton)e.getSource();
		
		if(buttonClicked == add) {
			String id = JOptionPane.showInputDialog("Please enter an ID number");
			String name = JOptionPane.showInputDialog("Please enter the name");
			int ID = Integer.parseInt(id);
			log.put(ID, name);
		}
		
		if(buttonClicked == search) {
			String idsearch = JOptionPane.showInputDialog("Please enter an ID number");
			int IDsearch = Integer.parseInt(idsearch);
			if(log.containsKey(IDsearch)) {
				System.out.println(log.get(IDsearch));
			}
			else {
				System.out.println("Invalid ID");
			}
		}
		
		if(buttonClicked == view) {
			for(Integer i : log.keySet()) {
				System.out.println("ID: "+i+" Name: "+log.get(i));
			}
			
		}
		
		if(buttonClicked == remove) {
			String id = JOptionPane.showInputDialog("Please enter an ID number");
			int ID = Integer.parseInt(id);
			if(log.containsKey(ID)) {
				System.out.println("removed "+log.get(ID));
				log.remove(ID);
			}
			else {
				System.out.println("Invalid ID");
			}
		}
	}
}
