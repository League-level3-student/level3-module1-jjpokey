package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener{
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	static int charNumber = 0;
	String charsinword = "";
	int Lives = 10;
	static String characters = "";
	int update = 0;
	
	public static void main(String[] args) {
		
		//method calling and starting input
		Stack<String> stack = new Stack<String>();
		String number = JOptionPane.showInputDialog("Welcome to Hang Man! \n" + "How many words would you like to guess?");
		int num = Integer.parseInt(number);
		HangMan h = new HangMan();
		h.method();
		
		//getting random words/getting char number of words
		for(int i = 0; i < num; i++) {
			stack.push(Utilities.readRandomLineFromFile("dictionary.txt"));
	
	}
		for(int i = 0; i < num; i++) {
			//characters = stack.pop();
			characters = "congratulation";
			
			charNumber = characters.length();
			
	
	}
		h.getChars();
	} //end of main
	
	
	
	public void method() {
		//frame setup
		frame.add(panel);
		panel.add(label);
		frame.setTitle("Hang Man");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.pack();
		frame.setSize(200, 50);
		frame.addKeyListener(this);
		
	}
	public void getChars() {
		for(int a = 0; a < charNumber; a++) {
			if(update != 1) {
			charsinword += "_";
			}
			
			label.setText(charsinword + "     " + Lives + " lives left!");
		}
		
	}



	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}



	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(characters);
	String savedChar = "" + e.getKeyChar();
		for(int j = 0; j < charNumber; j++) { //charNumber = length of word (int)
	if(e.getKeyChar() == characters.charAt(j)) { //characters = word (string)
			update = 1;
			System.out.println(charsinword.length());
			String lower = charsinword.substring(0, j);
			String higher = charsinword.substring(j + 1, charNumber);
			charsinword = lower + savedChar + higher;
			System.out.println(charsinword.length());
		getChars();
			
		}
		
		}
		Lives -= 1;
		if(Lives < 1) {
			//end
		}
		charsinword = savedChar;
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


		
	}
	

