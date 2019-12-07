/*Three years ago, Fred bought a car for £9500. If the rate of depreciation is 3% per
annum, what is Fred=s car worth today?*/
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
        System.out.println("A car valued 9500 pound " +
                "with an annual depreciation of 3% after 3 years is worth: "+car);

    }
}
