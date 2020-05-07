package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> array = new ArrayList<String>();
		//2. Add five Strings to your list
		array.add("Pineapple on pizza is bad");
		array.add("Pepper has pp in it");
		array.add("This is the third string");
		array.add("all music genres are valid exept for country");
		array.add("Chiaki is best girl");
		//3. Print all the Strings using a standard for-loop
		System.out.println("Step 3");
		for(int i = 0; i < array.size(); i++) {
			String s = array.get(i);
			System.out.println(s);
		}
		
		//4. Print all the Strings using a for-each loop
		System.out.println("Step 4");
		for(String i : array) {
			System.out.println(i);
		}
		//5. Print only the even numbered elements in the list.
		System.out.println("Step 5");
		for(int i = 2; i < array.size(); i+=2) {
			String s = array.get(i);
			System.out.println(s);
		}
		//6. Print all the Strings in reverse order.
		System.out.println("Step 6");
		for(int i = array.size()-1; i > 0; i--) {
			String s = array.get(i);
			System.out.println(s);	
		}
		//7. Print only the Strings that have the letter 'e' in them.
		System.out.println("Step 7");
		for(int i = 0; i < array.size(); i++) {
			//if() FINISH IF STATEMENT
		}
	}
}
