package week6;

public class EvenMethod {
    public static int EvenSum(int evens) {
        int sum = 0;
        int i = 1;
        int count = 0;
        while (count < evens) {
            if ((i % 2) == 0) {
                sum += i;
                count++;
            }
            i++;
        }
        //System.out.println("The sum of the first " + evens + " even numbers is: " + sum);
        return sum;
    }

   /* public static void main(String[] args){
        Console console = new Console();
        int userRequest = console.askInt("How many odds number do you want add? ");
        System.out.println("The sum of the first " + userRequest + " even numbers is: " + EvenSum(userRequest));

    }*/
}
