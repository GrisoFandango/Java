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
			//String username= (name[0]+name[1]+name[2]+surname[0]+surname[1]);
			//System.out.println(username);
			String nameUp= name.toUpperCase();
			String surnameUp= surname.toUpperCase();
			String username = name.substring(0,3)+surname.substring(0,2);
			String usernameUp = username.toUpperCase();
			System.out.printf("\nYour username is: "+nameUp.charAt(0)+nameUp.charAt(1)+nameUp.charAt(2)+surnameUp.charAt(0)+surnameUp.charAt(1)+"\n");
			System.out.printf("\nYour username is: "+usernameUp+"\n");
			System.out.printf("Your username is: "+ name.substring(0,3).toUpperCase()+ surname.substring(0,2).toUpperCase()+"\n");
			int age=console.askInt("Insert your age: ");
			String driveL = console.askString("Do you have a driver license? (y/n): ");
			driveL = driveL.toLowerCase();
			if (driveL.equals("y")) {
				String nameC = name.substring(0, 1).toUpperCase() + name.substring(1);
				String surnameC = surname.substring(0, 1).toUpperCase() + surname.substring(1);
				String usernameC = username.substring(0, 1).toUpperCase() + username.substring(1).toLowerCase();
				System.out.println("Your full name is: "+nameC+" "+surnameC);
				System.out.println("Your username is: "+usernameC);
				System.out.println("Your age is: "+age);
			}
			
			//	for (int i=0; i<3; i++) {
				//StringBuilder username= new StringBuilder();
				
			//}
		}
	}

}
