/*Using the Console class, create a class called Balance. Prompt the user to input a starting
 balance and an interest rate. Work out the balances after the first, second and third year.*/
package week4;

public class Balance {

		public static void main(String[] args) {

			Console console = new Console ();
			double balance = console.askDouble("Insert your Balance: ");
			double interest = console.askDouble("Insert your annual interest rate: ");
			int i = 1;
			while (i <= 3){
				balance = balance + (balance/100*interest);
				System.out.println("Your Balance at the end of Year "+i+
						"will be: "+balance);
				i++;
			}
			
		}
}
