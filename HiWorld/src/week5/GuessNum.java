package week5;
import java.util.Random; 
import week4.Console;
public class GuessNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand= new Random();
		int num=rand.nextInt(101);
		int user_guess=0;
		int attempt=0;
		Console console= new Console();
		while (user_guess != num)
		{
			user_guess=console.askInt("Insert your guess: ");
			attempt ++;
			if (user_guess > num) {
			System.out.println("Sorry your number is too high");			
			}
			if (user_guess < num) {
			System.out.println("Sorry your number is too low");				
			}
		}
		System.out.println("Congratulation you guess the number in "+attempt+" attempts!");
		
	}

}
