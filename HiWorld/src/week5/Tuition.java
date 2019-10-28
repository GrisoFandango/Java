package week5;

import week4.Console;

public class Tuition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tuition = 9000;
		double interest = 0.06;
		Console console= new Console();
		int age = console.askInt("Insert your age: ");
		
		while (tuition < 27000) {
			tuition = tuition*(1+interest);
			age ++;
		}
		System.out.println("The tuition will be tripled when you will be "+age+" years old");
	}

}
