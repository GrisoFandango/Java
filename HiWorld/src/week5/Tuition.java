/*Tuitions fees for a university is £9000 this year and it increases by 6% every year.
 Write a program to allow the user to enter their current age and get the program to
 work out the user’s age when the tuition fees are three times the initial fee of £9000.*/
package week5;

import week4.Console;

public class Tuition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tuition = 9000;
		double interest = 0.06;
		int years=0;
		Console console= new Console();
		int age = console.askInt("Insert your age: ");

		while (tuition < 27000) {
		tuition = tuition*(1+interest);
		years++;
		}
		System.out.println("It will take "+years+" years");
		System.out.println("And you will be "+(age+years)+" years old");
	}

}