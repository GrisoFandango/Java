package week6;

public class test {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int count = 0;
        int odds = 5;
        while (count < odds) {
            if ((i % 2) == 1) {
                sum += i;

                count++;
            }
            i++;
            System.out.println(sum+" "+i+" "+count);
        }
        System.out.println("The sum of the firs " + odds + " odd numbers is: " + sum);

    }
}
