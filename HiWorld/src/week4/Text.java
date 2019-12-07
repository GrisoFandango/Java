/*Create a class called Text and write coed using string manipulation.
String p = Enter user input
String q = Enter user input
String r = Enter user input
Write code to work out and display:
•	(p+q+r) in capital letters (leave a space between to separate the words)
•	Concatenation of (r + p) in lowercase
•	Total number of characters within (p+q+r)*/
package week4;

import java.util.Scanner;

public class Text {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please insert a string: ");
		String p = input.nextLine();
		System.out.print("Please insert a string: ");
		String q = input.nextLine();
		System.out.print("Please insert a string: ");
		String r = input.nextLine();
		String x = p+q+r;

		System.out.println("P+Q+R Uppercase: "+p.toUpperCase()+
				" "+q.toUpperCase()+" "+
				r.toUpperCase());

		System.out.println("r + p Lowercase: "+r.toLowerCase()+" "+
				p.toLowerCase());
		
		System.out.println("The lenght is: "+x.length());
	}

}
