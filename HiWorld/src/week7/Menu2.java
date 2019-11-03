package week7;

import week4.Console;
import week6.UserInfo;

public class Menu2 {
    public static void main(String[] args) {
        Console console = new Console();
        boolean quit = false;
        while (!quit) {
            System.out.println("What service do you need?\n1)Create user name\n2)Calculate your BMI\n0)EXIT");
            int choice=console.askInt("Make your choice: ");
            switch (choice){
                case 1:
                    String fname=console.askString("Please write your name: ");
                    String sname=console.askString("Please write your surname: ");
                    System.out.println("Your username is: "+ UserInfo.Uname(fname,sname));
                    break;
                case 2:
                    double height=console.askDouble("Please insert your height in feet: ");
                    double weight=console.askDouble("Please insert your weight in pound: ");
                    System.out.printf("Your BMI is: %.2f\n",UserInfo.BMI(height,weight));
                    break;
                case 0:
                    quit=true;
            }
        }
        System.out.println("Thank you for using our services!");
    }
}
