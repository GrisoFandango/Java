package week4;

import java.util.Scanner;

public class Balance {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Insert your Balance: ");
			double balance = input.nextDouble();
			System.out.print("Insert your annual interest rate: ");
			double interest = input.nextDouble();
			double y1 = balance + (balance/100*interest);
			double y2 = y1 + (y1/100*interest);
			double y3 = y2 + (y2/100*interest);
			System.out.println("Your Balance at the end of Year 1 will be: "+y1);
			System.out.println("Your Balance at the end of Year 2 will be: "+y2);
			System.out.println("Your Balance at the end of Year 3 will be: "+y3);
			
		}
}
