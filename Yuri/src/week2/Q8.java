package week2;

public class Q8 {
    public static void main(String[] args){
        double car=9500;
        double lost=3;
        int i=0;
        while (i<3){
            i++;
            car=car-(car/100*lost);
        }
        System.out.println("A car valued 9500£ with an annual depreciation of 3% after 3 years is worth: "+car);

    }
}
