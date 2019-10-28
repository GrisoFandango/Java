package week5;

public class EvenNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int sum=0;
		for (int i=0; n<= 100; i++) {
			if (i/2 != 0){
				sum += i;
				n++;					
			}
		}
		System.out.println("The sum of the first 100 even number is: "+ sum);
	}

}
