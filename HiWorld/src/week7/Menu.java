package week7;

import week4.Console;
import week6.*;

public class Menu {
    public static void main(String[] args) {
        Console console = new Console();
        boolean quit = false;
        while (!quit) {
            System.out.println("Please make a choice:\n1)Odd\n2)Even\n3)Smallest\n4)Squares\n5)Cubes\n0)Exit");
            int choice = console.askInt("What option do you chose? ");
            switch (choice) {
                case 1:
                    int userRequest = console.askInt("How many odds number do you want add? ");
                    System.out.println("The sum of the first " + userRequest + " odd numbers is: " + OddMethod.OddSum(userRequest));
                    break;
                case 2:
                    int userR = console.askInt("How many odds number do you want add? ");
                    System.out.println("The sum of the first " + userR + " even numbers is: " + EvenMethod.EvenSum(userR));
                    break;
                case 3:
                    int num1=console.askInt("Please insert the first number: ");
                    int num2=console.askInt("Please insert the second number: ");
                    int num3=console.askInt("Please insert the third number: ");
                    System.out.println("The smaller number between your inputs is: "+SmallMethod.Smallest(num1,num2,num3));
                    break;
                case 4:
                    int squares=console.askInt("How many squared number do you want to add? ");
                    System.out.println("The sum of the first "+squares+" squared number is "+ SquaresMethod.Squares(squares));
                    break;
                case 5:
                    int cubes=console.askInt("How many cubed number do you want to add? ");
                    System.out.println("The sum of the first "+cubes+" squared number is "+ Power3.PowerThree(cubes));
                    break;
                case 0:
                    quit=true;
            }
        }
        System.out.println("Thank for choosing our services");
    }
}