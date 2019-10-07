package week4;

import java.util.Scanner;

public class Coins {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insert your amount: ");
		double amountP =input.nextDouble();
		double amount = amountP*100;
        int pound=0;
        int fifty=0;
        int twenty=0;
        int ten=0;
        int five=0;
        while (amount >=5){
            while (amount>=100){
                amount=amount-100;
                pound++;
            }
            while (amount>=50){
                amount=amount-50;
                fifty++;
            }
            while (amount>=20){
                amount=amount-20;
                twenty++;
            }
            while(amount>=10){
                amount=amount-10;
                ten++;
            }
            while(amount>=5){
                amount=amount-5;
                five++;
            }
        }
        System.out.println("In the amount of "+amountP+" we will have: \n"+pound+" pound coins\n"+fifty+" 50 Cent coins\n"+twenty+" 20 Cent coins\n"+ten+" 10 Cent Coins\n"+five+" 5 Cent coins"+"\nwith a change of: "+amount+" cents");
	}

}
