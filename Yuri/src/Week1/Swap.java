package Week1;

public class Swap {
    public static void main(String[] args){
        int a=10;
        int b=15;
        int c;
        System.out.println("A is "+a+" and B is "+b);
        c=a+b;
        a=c-a;
        b=c-b;
        System.out.println("Now A is "+a+" and B is "+b);
    }
}
