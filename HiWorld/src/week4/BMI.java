/*Body Mass Index (BMI) is a measure of health on weight. It can be calculated
by taking your weight in kilograms and dividing by the square of your height in
meters.
Write a program that allow the user to enter their weight in pounds and height
in inches. Note that if one pound is 0.4535 Kilograms and one inch is 0.0254
meters, display the BMI for the user.
*/
package week4;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console console = new Console();
		double weight_pound = console.askDouble("Insert your weight in pound: ");
		double height_inches = console.askDouble("Insert your height in inches: ");
		
		double weight_kilo = weight_pound * 0.4535;
		double height_meter = height_inches * 0.0254;
		double bmi = weight_kilo/(Math.pow(height_meter, 2));
		System.out.printf("Your Body Mass Index is: %.2f ",bmi);
	}

}
