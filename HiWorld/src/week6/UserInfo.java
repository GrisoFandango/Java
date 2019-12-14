package week6;

import week4.Console;

public class UserInfo {
    public static void main (String[] args){
        Console console= new Console();
        String fname=console.askString("Please write your name: ");
        String sname=console.askString("Please write your surname: ");
        int age=console.askInt("Please insert your age: ");
        double height=console.askDouble("Please insert your height in feet: ");
        double weight=console.askDouble("Please insert your weight in pound: ");
        System.out.println("Your full name is: "+fname.substring(0,1).toUpperCase()+fname.substring(1)+" "+sname.substring(0,1).toUpperCase()+sname.substring(1));
        System.out.println("Your username is: "+Uname(fname,sname));
        System.out.println("Your age is: "+age);
        System.out.printf("Your BMI is: %.2f\n",BMI(height,weight));
        if(age>=21){
            System.out.println("You have a driver license");
        } else System.out.println("You do not have a driver license");

    }

    public static double BMI(double height, double weight){
        double kilo = weight * 0.4535;
        double meter = height * 0.0254;
        double bmi = kilo/(Math.pow(meter, 2));
        if (bmi < 20) {
            System.out.print("You are under weight, ");
        }
        else if (bmi > 25) {
            System.out.print("You are over weight, ");
        }
        else
            System.out.print("You are fine, ");
        return bmi;
    }
    public static String Uname(String name, String lastname){
        String username = name.substring(0,3).toUpperCase()+lastname.substring(0,2).toUpperCase();
        return username;
    }

}
