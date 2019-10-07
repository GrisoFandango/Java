package week4;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Insert you weight in pound: ");
		double weightP = input.nextDouble();
		System.out.print("Insert your height in inches: ");
		double heightI = input.nextDouble();
		
		double kilo = weightP * 0.4535;
		double meter = heightI * 0.0254;
		double bmi = kilo/(Math.pow(meter, 2));
		System.out.printf("Your Body Mass Index is: %.2f %n",bmi);
		//System.out.printf("The volume of the Cuboid is: %.0f %n", (width*lenght*height));
		

	}

}
