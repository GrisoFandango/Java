package week4;

import java.util.Scanner;

public class Cuboid {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please insert the width: ");
		double width = input.nextDouble();
		
		System.out.print("Please insert the lenght: ");
		double lenght = input.nextDouble();
		
		System.out.print("Please insert the height: ");
		double height = input.nextDouble();
		
		System.out.printf("The volume of the Cuboid is: %.0f %n", (width*lenght*height));
		
	}
}
