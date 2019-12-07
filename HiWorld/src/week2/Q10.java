/*A floor measuring 6m long and 3m wide needs to be tiled. Each tile measures
 0.5m square. How many tiles will be needed to tile the entire floor?
 Any leftovers?*/
package week2;

public class Q10 {
    public static void main(String[] args){
        int lenght=6;
        int wide=3;
        double tile=0.5;
        System.out.println("A floor lenght 6 meters and wide 3 meters " +
                "will requires "+lenght*wide/tile+" tiles \nmeasuring " +
                "0.5 square meters with no leftovers");
    }
}
