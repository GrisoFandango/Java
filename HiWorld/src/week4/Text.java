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
		
		String pUp = p.toUpperCase();
		String qUp = q.toUpperCase();
		String rUp = r.toUpperCase();
		System.out.println("P+Q+R Uppercase: "+pUp+" "+qUp+" "+rUp);
		
		String rLo = r.toLowerCase();
		String pLo = p.toLowerCase();
		System.out.println("r + p Lowercase: "+rLo+" "+pLo);
		
		System.out.println("The lenght is: "+x.length());
		
		System.out.println("P+Q+R Uppercase: "+p.toUpperCase()+" "+q.toUpperCase()+" "+r.toUpperCase());
	}

}
