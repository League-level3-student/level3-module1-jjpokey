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
			characters = stack.pop();
			
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
		label.addKeyListener(this);
		
	}
	public void getChars() {
		for(int a = 0; a < charNumber; a++) {
			charsinword += "_";
					
			label.setText(charsinword + "     " + Lives + " lives left!");
		}
		
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyPressed(KeyEvent e) {
		String t = "";
		for(int j = 0; j < charNumber; j++) {
			
		if(e.getKeyChar() == characters.charAt(j)) {
			t += e.getKeyChar();
			//charsinword.replace(charsinword.charAt(j), e.getKeyChar());
			
		}
		else {
			t += charsinword.charAt(j);
			//figure out loop and replacing
		}
		
		}
		charsinword = t;
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


		
	}
	

