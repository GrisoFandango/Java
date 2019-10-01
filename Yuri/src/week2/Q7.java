package week2;

public class Q7 {
    public static void main(String[] args){
        double account=1000;
        double interest=5;
        int i=0;
        while (i<3){
            i++;
            account= (account/100*interest)+account;
        }
        System.out.println("An account containing 1000£ and gaining and annual interest of 5%, after 3 years will be: "+account);
    }
}
