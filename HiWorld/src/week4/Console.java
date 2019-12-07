package week4;
import java.util.Scanner;
/* 
 * Develop console class for scanner input
 * Input for String, int, double and char
 */
public class Console {
	private Scanner console = new Scanner(System.in);
		/**Method for string input*/
		public String askString(String aPrompt) {
			System.out.print(aPrompt); //aPrompt is prompt string to user
			
			String reply = console.nextLine();// input held in variable reply
			return reply;
		}
		/**Method for integer input*/
		public int askInt(String aPrompt) {
			String reply = askString(aPrompt);
			//parseInt(...) converts string to int;
			return Integer.parseInt(reply);
		}
		/**Method for double input*/
		public double askDouble(String aPrompt) {
			String reply = askString(aPrompt);
			//parseDouble(...) converts string to double;
			return Double.parseDouble(reply);
		}
		/**Method for one character input*/
		public char askChar(String aChar) {
			String reply = askString(aChar);
			//Take first character of string and convert to upper case
			return Character.toUpperCase(reply.trim().charAt(0));
		}
	}


