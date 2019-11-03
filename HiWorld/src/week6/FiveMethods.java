package week6;

import week4.Console;

public class FiveMethods {
    public static void main(String[] args) {
        Console console = new Console();
        int choice1 = console.askInt("How many odd numbers do you want add up?: " );
        int choice2 = console.askInt("How many even numbers do you want add up?: ");
        int choice3 = console.askInt("First Number to compare?: " );
        int choice4 = console.askInt("Second Number to compare?: ");
        int choice5 = console.askInt("Third Number to compare?: ");
        int choice6 = console.askInt("How many squared numbers do you want to add up?: ");
        int choice7 = console.askInt("How many numbers at power of 3 do you want to add up?: ");
        System.out.println("The sum of the first "+choice1+" odd number is: "+OddMethod.OddSum(choice1));
        System.out.println("The sum of the first "+choice1+" even number is: "+EvenMethod.EvenSum(choice2));
        System.out.println("The smallest number between"+choice3+","+choice4+"and"+choice5+" is: "+SmallMethod.Smallest(choice3,choice4,choice5));
        System.out.println("The sum of the first "+choice6+"squared number is: "+SquaresMethod.Squares(choice6));
        System.out.println("\nThe sum of the first "+choice6+" number at power of 3 is: "+Power3.PowerThree(choice7));
    }
}
