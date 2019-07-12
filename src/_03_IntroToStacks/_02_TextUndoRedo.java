package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * DONE
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * DONE
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * WORKING ON
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	  JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel();

	public void method() {
		frame.add(panel);
		frame.add(label);
		frame.addKeyListener(this);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		if(e.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
			//label.remove();
			//HERE, REMOVE LAST CHAR TYPED............................
		}
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		label.setText(e.getKeyChar() + "");
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
