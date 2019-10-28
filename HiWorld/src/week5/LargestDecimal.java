package week5;

import week4.Console;

public class LargestDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result=0;
		Console console= new Console();
		
		double n1 = console.askDouble("Insert the first decimal number: ");
		double n2 = console.askDouble("Insert the second decimal number: ");
		double n3 = console.askDouble("Insert the third decimal number: ");
		if (n1 > n2) {
			if (n1 > n3) {
				result = n1;
			}
			else 
			result = n3;
		}
		if (n2 > n1) {
			if (n2 > n3) {
				result = n2;
			}
			else 
				result = n3;
		}
	
		System.out.println("The largest decimanl is: "+result);
		
		
	}

}
