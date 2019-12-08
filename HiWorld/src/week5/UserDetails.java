/*Create a class called UserDetails so that the following is repeated 3 times for 3 separate users.
Ask user to enter their firstname
Ask user to enter their lastname
Write code to work out the user’s username by taking the first 3 letters of their name and first 2 letters
 of their lastname. The username should be in uppercase.
In addition, you need to ask the user their age and if they have a driving license.
Display fullname using title case, username and age if and only if the user has a driving license.
*/
package week5;
import week4.Console;

public class UserDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l=0;
		while (l < 3) {
			l++;
			Console console=new Console();
			String name= console.askString("Insert your name please: ");
			String surname= console.askString("Insert your surname please: ");
			String username = name.toUpperCase().substring(0,3)+
					surname.toUpperCase().substring(0,2);
			System.out.println("\nYour username is: "+ username);

			int age=console.askInt("Insert your age: ");
			String driveL = console.askString("Do you have a driver license? (y/n): ");
			driveL = driveL.toLowerCase();
			if (driveL.equals("y")) {
				System.out.println("Your full name is: "+
						name.substring(0, 1).toUpperCase() +
						name.substring(1)+
						" "+
						surname.substring(0, 1).toUpperCase() +
						surname.substring(1));
				System.out.println("Your username is: "+username);
				System.out.println("Your age is: "+age);
			}
		}
	}

}
