package week5;
import week4.Console;

public class OneWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14159;
		
		//Use of Console class for reading input
		Console console = new Console();
		double radius = console.askDouble("Enter a double for radius: ");
		if (radius > 0) {
			double area = radius*radius*PI;
			System.out.printf("The area of the circle of radius " + radius + " is %.2f", area);
		}
		

	}

}
