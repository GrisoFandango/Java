package week2;

public class Q2 {
    public static void main(String[] args){
        System.out.print("The first 5 odd number are: ");
        int sum=0;
        int num=1;
        int n=0;
        while ( n<5)
        {
            if (num % 2 != 0)
            {
                System.out.print(num + " ");
                sum += num;
                n++;
            }
            num++;
        }
        System.out.println("\nThe sum of the first 5 odd number is: "+sum);

    }
}
