package week6;

public class OddMethod {
    public static int OddSum(int odds) {
        int sum = 0;
        int i = 1;
        int count = 0;
        while (count < odds) {
            if ((i % 2) == 1) {
                sum += i;
                count++;
            }
            i++;
        }
        //System.out.println("The sum of the first " + odds + " odd numbers is: " + sum);
        return sum;
    }

    /*public static void main(String[] args){
        Console console = new Console();
        int userRequest = console.askInt("How many odds number do you want add? ");
        System.out.println("The sum of the first " + userRequest + " odd numbers is: " + OddSum(userRequest));

    }*/
}