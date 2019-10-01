package week3;

public class Q3 {
    public static void main(String[] args){
        int num=1;
        int sum=0;
        int prime;
        int count=0;
        System.out.print("The first 10 prime number are: ");
        while (count<10)
        {
            num++;
            prime=1;
            for (int i=2; i<num && prime==1;i++)
            {
                if (num %i ==0){
                    prime=0;
                }
            }
            if (prime==1)
            {
                sum += num;
                count++;
                System.out.print(num+" ");
            }
        }
        System.out.println("\nThe sum of the first 10 prime number is: "+sum);

    }
}
