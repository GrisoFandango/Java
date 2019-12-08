/*Write a program that reads in a word and prints out each character
of the word on a separate line. Hint: use a FOR loop and the charAt method.*/
package week5;
import week4.Console;
public class CharPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console console = new Console();
		String word = console.askString("Write a word: ");
		int l = word.length();
		for (int i=0; i < l; i++) {
			System.out.println(word.charAt(i));
		}

	}

}
