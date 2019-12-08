/*Amend the Balance class to work out the balance after the first, second, third etc. up to and
including tenth year. Once again, your program should prompt the user to input a starting balance
and interest rate (intRate). Balance for a year is calculated as (1 + intRate) multiplied by balance
for the previous year. Example: for 5% interest rate, the user should enter 0.05.*/
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
