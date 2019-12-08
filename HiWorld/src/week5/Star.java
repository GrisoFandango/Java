/*Create a class called Stars. Use nested FOR loops to generate the following output:
Pattern using *
--------------------
*      *       *        *
*      *       *        *
*      *       *        *
*      *       *        *
*      *       *        *
*      *       *        *
*/
package week5;

public class Star {
    public static void main(String[] args){
        System.out.println("Pattern using *");
        System.out.println("-------------");
        for (int i=0; i<6;i++){
            for (int j=0; j<4; j++){
                System.out.print("*  ");
            }
            System.out.println("\n");
        }
    }
}
