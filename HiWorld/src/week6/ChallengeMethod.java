package week6;

import week4.Console;

public class ChallengeMethod {
    public static void main(String[] args) {
        Console console = new Console();
        String fname = console.askString("Please write your name: ");
        String sname = console.askString("Please write your surname: ");
        int age = console.askInt("Please insert your age: ");
        double height = console.askDouble("Please insert your height in feet: ");
        double weight = console.askDouble("Please insert your weight in pound: ");
        int row = console.askInt("How many rows do you want? ");
        int column = console.askInt("How many column do you want? ");
        System.out.println("Your full name is: " + fname.substring(0, 1).toUpperCase() + fname.substring(1) + " " + sname.substring(0, 1).toUpperCase() + sname.substring(1));
        System.out.println("Your username is: " + UserInfo.Uname(fname, sname));
        System.out.println("Your age is: " + age);
        System.out.printf("Your BMI is: %.2f\n", UserInfo.BMI(height, weight));
        if (age >= 21) {
            System.out.println("You have a driver license");
        } else System.out.println("You do not have a driver license");
        StarMethod.starRequest(row, column);
    }
}
