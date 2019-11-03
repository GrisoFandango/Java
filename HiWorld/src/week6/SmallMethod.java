package week6;

public class SmallMethod {
    static int Smallest(int num1, int num2, int num3){
        int smallest=0;
        if (num1 <= num2 && num1 <= num3){
            smallest=num1;
        } else if(num2<=num3) {
            smallest=num2;
        } else{
            smallest=num3;
        }
        //System.out.println("The smallest number between "+num1+", "+num2+" and "+num3+" is: "+smallest);
        return smallest;

    }
    /*public static void main(String[] args){
        System.out.println(Smallest(4,5,3));
    }*/

}
