package week5;

import week4.Console;

public class BMI2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		Console console = new Console();
		int u=console.askInt("How many times do you want run the program? ");
		while (i < u) {
		i ++;
		double weightP = console.askDouble("Insert your weight in pound: ");
		double heightI = console.askDouble("Insert your height in inches: ");
		
		double kilo = weightP * 0.4535;
		double meter = heightI * 0.0254;
		double bmi = kilo/(Math.pow(meter, 2));
		System.out.printf("Your Body Mass Index is: %.2f %n",bmi);
		//System.out.printf("The volume of the Cuboid is: %.0f %n", (width*lenght*height));
		
		if (bmi < 20) {
			System.out.println("You are under weight");
		}
		else
			if (bmi > 25) {
				System.out.println("You are over weight");
			}
			else
				System.out.println("You are fine");
	}
	System.out.println("Thank you for using our service");
	}

}
