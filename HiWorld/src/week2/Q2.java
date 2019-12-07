// Write a program that will print out the sum of the first 5 odd numbers.
package week2;

public class Q2 {
	public static void main(String[] args) 
	{
		
	int sum,count,i;
	count=9;
	sum=0;
	for(i=1; i<=count; i++) 
	{
			if (i%2 != 0) 
			{
			sum=sum+i;
			}
	}
			
	System.out.println("The sum of the first 5 odd number is: "+sum);
	}
}