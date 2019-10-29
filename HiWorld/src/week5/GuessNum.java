package week5;
import java.util.Random; 
import week4.Console;
public class GuessNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand= new Random();
		int num=rand.nextInt(101);
		int guess=0;
		int att=0;
		Console console= new Console();
		while (guess != num){
		guess=console.askInt("Insert your guess: ");
		att ++;
		if (guess > num) {
			System.out.println("Sorry your number is too high");			
		} if (guess < num) {
			System.out.println("Sorry your number is too low");				
		}
		}
		System.out.println("Congratulation you guess the number in "+att+" attempts!");
		
	}

}
