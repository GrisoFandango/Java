/*Design and implement a class Module that has the following properties. Your class should define a default constructor
that initializes the properties as follows:
•	Code		??????
•	Title		No Title
•	Level 		0
•	cwWeight	50
•	exWeight 	50
Your class should define a method that prints each property preceded by appropriate annotation. Each property will be
displayed on a single line. Write a short application to test your class.
*/
/*Add a parameterized constructor to your module class.
Write a short application to test your parameterized constructor.*/
package Week8;

public class Q2Module {
    String code, title;
    int level, cwWeight, exWeight;

    public Q2Module(){
        code = "??????";
        title = "No Title";
        level = 0;
        cwWeight = 50;
        exWeight = 50;
    }

    public Q2Module(String code, String title, int level, int cwWeight, int exWeight){
        this.code = code;
        this.title = title;
        this.level = level;
        this.cwWeight = cwWeight;
        this.exWeight = exWeight;
    }


    public void print(){
        System.out.println("Code: " + code);
        System.out.println("Title: " + title);
        System.out.println("Level: " + level);
        System.out.println("cwWeight: " + cwWeight);
        System.out.println("exWeight: " + exWeight);
        System.out.println();
    }


}
