package week5;

import week4.Console;

public class Balance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=1;
		
		Console console = new Console ();
		double balance = console.askDouble("Insert your Balance: ");
		double interest = (console.askDouble("Insert your annual interest rate: ")/100);
		for (int i=1; i <=10; i++) {
			balance = balance * (1+ interest);
			System.out.printf("\nThe balance after year "+year+" is %.2f", balance);
			year ++;
			
		}

	}

}
