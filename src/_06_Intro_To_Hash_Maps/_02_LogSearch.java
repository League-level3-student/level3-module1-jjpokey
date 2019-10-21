package _06_Intro_To_Hash_Maps;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements MouseListener {
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
	
	//begining
	
	HashMap<Integer,String> data = new HashMap<Integer,String>();
	//GUI
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	//main
public static void main(String[] args) {
	_02_LogSearch c = new _02_LogSearch();
		c.GUI();
	} 
//gui
	public void GUI() {
		frame.add(panel);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setSize(500,60);
		frame.setTitle("Log Search");
		b1.addMouseListener(this);
		b2.addMouseListener(this);
		b3.addMouseListener(this);
		b4.addMouseListener(this);
		
		b1.setText("Add Entry");
		b2.setText("Search ID");
		b3.setText("View List");
		b4.setText("Remove Entry");
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		//ADD ENTRY
		if(e.getSource() == b1) {
			String id = JOptionPane.showInputDialog("Enter an ID number...");
			String name = JOptionPane.showInputDialog("Enter a name...");
			int ID = Integer.parseInt(id);
			data.put(ID, name);
		}
		//SEARCH ID
		if(e.getSource() == b2) {
			String searchid = JOptionPane.showInputDialog("Search ID number...");
			int searchID = Integer.parseInt(searchid);
			if(data.containsKey(searchID)) {
				JOptionPane.showMessageDialog(null, data.get(searchID));
			}
			else {
				JOptionPane.showMessageDialog(null, "Entry does not exist...");
			}
		}
		//VIEW LIST
		if(e.getSource() == b3) {
			for(Entry<Integer, String> a : data.entrySet()) {
				JOptionPane.showMessageDialog(null, a);
			}
		}
		//REMOVE ENTRY
		if(e.getSource() == b4) {
			String removeid = JOptionPane.showInputDialog("Search ID number...");
			int removeID = Integer.parseInt(removeid);
			if(data.containsKey(removeID)) {
				data.remove(removeID);
			}
			else {
				JOptionPane.showMessageDialog(null, "Entry does not exist...");
			}
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	
	
	
	}
	
}
	

