package week4;
import java.util.Scanner;
public class InputExcersize {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = input1.nextLine();

		System.out.println("Enter your surname");
		String surname = input1.nextLine();
		
		System.out.println("Enter your age");
		int age = input1.nextInt();
		
		System.out.println("Enter your age");
		int age2 = input1.nextInt();
		
		input1.nextLine();
		
		System.out.println("Enter your name");
		String middlename = input1.nextLine();

	}
}
