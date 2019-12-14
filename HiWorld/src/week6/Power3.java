package week6;

public class Power3 {
    public static int PowerThree(int count) {
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            int power=(i*i*i);
            System.out.print(power+" ");
            sum+=power;
        }
        return sum;
    }
    /*public static void main(String[] args){
        System.out.println("\nThe sum is"+PowerThree(3));
    }*/
}
