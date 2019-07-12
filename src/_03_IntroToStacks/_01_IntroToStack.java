package _03_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {
		int first = 0;
		int second = 0;
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> s = new Stack<Double>();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for(int i = 0; i < 101; i++) {
			Random r = new Random();
			s.push(r.nextDouble() * 100);
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		
		String number = JOptionPane.showInputDialog("Enter A Number Between 0 and 99");
		String number2 = JOptionPane.showInputDialog("Enter A Greater Number Between 1 and 100");
		
		int p = Integer.parseInt(number);
		int q = Integer.parseInt(number2);
		
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		for(int i = 0; i < s.size(); i++){
			Double v = s.pop();
		
			if(v < q && v > p) {
				System.out.println(v);
			}
		
		
		
		}
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
