package week4;

import java.util.Scanner;

public class Average {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please insert the first number: ");
		int n1 = input.nextInt();
		
		System.out.print("Please insert the second number: ");
		int n2 = input.nextInt();
		
		System.out.print("Please insert the third number: ");
		int n3 = input.nextInt();
		
		System.out.print("The average of the 3 numbers is: "+ (n1+n2+n3)/3);
	}
	

}
