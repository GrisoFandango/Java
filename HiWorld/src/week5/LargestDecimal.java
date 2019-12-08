/*Create a class called LargestDecimal. Write a program tha prompts the user to enter
three different decimal numbers and print out the largest of them. */
package week5;

import week4.Console;

public class LargestDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console console= new Console();
		double n1 = console.askDouble("Insert the first decimal number: ");
		double n2 = console.askDouble("Insert the second decimal number: ");
		double n3 = console.askDouble("Insert the third decimal number: ");

		if (n1 > n2 && n1 > n3) {
			System.out.println("The largest decimanl is: "+n1);
			}
		else if (n2 > n3) {
			System.out.println("The largest decimanl is: "+n2);
			}
		else{
			System.out.println("The largest decimanl is: "+n3);

		}
		
	}

}
