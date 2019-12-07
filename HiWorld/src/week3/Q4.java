/*Write a program to work out the circumference and area of a circle of radius
5cm. Take the value of PI as 3,14 and declare it as a constant in your code.
Area = PI x radius x radius
Circumference = 2 x PI x radius
*/
package week3;

public class Q4 {
    public static void main(String[] args){
        final double PI=3.14;
        double radius= 5;
        double area;
        double circumference;
        area=PI*radius*radius;
        circumference=2*PI*radius;
        System.out.println("A circle with a radius of 5 cm has an area of "+
                area+"\nand a circumference of "+circumference);
    }
}
