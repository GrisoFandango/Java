/*Write a program that prints the balance of an account after the first, second
and third year. The account has an initial balance of £1000 and earns 5 per cent
interest per year.*/
package week2;

public class Q7 {
    public static void main(String[] args){
        double account=1000;
        double interest=5;
        int i=0;
        while (i<3){
            i++;
            account= (account/100*interest)+account;
            System.out.println("The balance after "+i+" years is: "+account);
        }
    }
}
