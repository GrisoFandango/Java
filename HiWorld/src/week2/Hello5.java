package week2;

public class Hello5 {
    public static void main(String[]args){
        int product=1, num=1;
        for (int i=0; i < 10; i++ ){
            product *= num;
            num += 1;
        }
        System.out.println("The product of the first 10 positive numbers is: "+product);

    }
}
