package week5;

import week4.Console;

public class ReverseWord {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Console console = new Console();
			String word = console.askString("Write a word: ");
			int l = word.length();
			for (int i=l-1; i>=0; i--) {
				System.out.println(word.charAt(i));
			}

		}

	}


	