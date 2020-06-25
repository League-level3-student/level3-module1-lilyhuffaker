package _03_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> s = new Stack<Double>();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		double randy = new Random().nextInt(100);
		for(int i = 0; i < 100; i++) {
			s.push(randy);
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String answer1 = JOptionPane.showInputDialog("Enter a number between 1-100.");
		String answer2 = JOptionPane.showInputDialog("Enter a second number between 1-100.");
		double a1 = Integer.parseInt(answer1);
		double a2 = Integer.parseInt(answer2);
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		int sz = s.size();
		double d = s.pop();
		for(int i = 0; i < sz; i++) {
			if(d > a1 && d < a2) {
				System.out.println(d+" is cool");
			}
			System.out.println(d);
		}
		//COME BACK TO THIS ONE LATER
		//ADD MORE IF STATEMENTS 
		
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
