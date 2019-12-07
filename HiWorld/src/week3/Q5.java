/*Write a program to display volume V of cylinder if radius is 3cm
and height is 10 cm. Take the value of PI as 3 and declare it as a
constant in your code. The formula of volume is V = P*radius^2*height. */
package week3;

import java.lang.Math;

public class Q5 {
    public static void main(String[] args){
        final int PI=3;
        double radius=3;
        double height=10;
        double volume;
        volume=PI*(Math.pow(radius,2))*height;
        System.out.println("The volume of a cilinder with a radius of 3cm " +
                "\nand an height of 10 cm is "+volume);
    }

}
