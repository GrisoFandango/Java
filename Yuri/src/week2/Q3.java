package week2;

public class Q3 {
    public static void main(String[] args){
        int num=1;
        int product=1;
        int prime;
        int count=0;
        System.out.print("The first 5 prime number are: ");
        while (count<5) {
            prime=1;
            num++;
            for (int i=2; i<num && prime==1;i++) {
                if (num % i == 0) {
                    prime = 0;
                }
            }
                if (prime==1) {
                    System.out.print(num + " ");
                    product = product * num;
                    count++;
                }
            }

        System.out.println("\nThe product of the fist 5 prime number is: "+product);
    }
}
