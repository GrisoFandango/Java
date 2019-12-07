/*Write Java code to work out the number of pound coins, 50 pence coins,
 20 pence coins, 10 pence coins and 5 pence coins if given an amount
 of £32.89 (Hint: Work in pence)*/
package week2;

public class Q9A {
    public static int count_coins(int amount, int coins_value){
        int count=0;
        while (amount>=coins_value){
            amount=amount-coins_value;
            count ++;
        }
        System.out.println(count+" "+coins_value+" pence coins");
        return amount;
    }
    public static void main(String[] args){
        int amount=3289;
        amount = count_coins(amount,100);
        amount = count_coins(amount, 50);
        amount = count_coins(amount,20);
        amount = count_coins(amount,10);
        amount = count_coins(amount,5);
        System.out.println("With a change of: "+amount+ " pence");
    }
}
