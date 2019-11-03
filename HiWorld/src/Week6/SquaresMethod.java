package Week6;

public class SquaresMethod {
    static int Squares(int count) {
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            sum +=(i * i);
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(Squares(3));
    }
}