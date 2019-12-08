/*Using Console class, create a class called Coins to read an amount in pence.
Work out the number of pound coins, 50 pence coins, 20 pence coins,
10 pence coins, 5 pence coins and 1 penny coins for the amount entered. */
package week4;

public class Coins {
    public static double count_coins_double(double amount, int coins_value){
        int count=0;
        while (amount>=coins_value){
            amount=amount-coins_value;
            count ++;
        }
        System.out.println(count+" "+coins_value+" pence coins");
        return amount;
    }
	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		Console console = new Console();
		double amountP = console.askDouble("Insert your amount: ");
		/*System.out.print("Insert your amount: ");
		double amountP =input.nextDouble();*/
		double amount = amountP*100;
        amount = count_coins_double(amount,100);
        amount = count_coins_double(amount, 50);
        amount = count_coins_double(amount,20);
        amount = count_coins_double(amount,10);
        amount = count_coins_double(amount,5);
        count_coins_double(amount,1);
	}
}
