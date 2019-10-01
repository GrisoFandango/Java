package week3;

public class Q3 
{

	public static void main(String[] args) 
	{
	int num=1;//number to check if is prime
	//int check=2;//number to use to divide num and check if is prime
	int prime=0;// 1 is prime 0 is not
	int n=0;//counter for the while loop
	int sum=0;//variable to store the sum
	//int x;
	System.out.print("The first 10 prime number are: ");
	while (n<=10) {
		num++;
		prime=1;
		for ( int x = 2; x < num && prime==1; x++){
			if (num % x == 0) 
			prime=0;
		}
		if (prime==1) {
			sum=sum+num;
			n++;
			System.out.print(num + " ");
		}	
			
		}
		
	System.out.println("\nThe Sum of the first 10 prime numbers is: "+sum);	
	}

		
		
		
		
		
	}
	


