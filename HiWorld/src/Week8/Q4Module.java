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
/*Add methods to your Module to:
•	set the code
•	set the title
•	set the level
•	set the weights
This method will accept two parameters in order to set bot  cwWeight and exWeight.
Write a short application to test these methods.
*/
/*Add Access method to get each of the data members of your Module class.
Write a short application to test these access methods.*/
package Week8;

public class Q4Module {
    String code, title;
    int level, cwWeight, exWeight;

    //Default parameter
    public Q4Module(){
        code = "??????";
        title = "No Title";
        level = 0;
        cwWeight = 50;
        exWeight = 50;
    }
    //Creation of an object with constructor
    public Q4Module(String code, String title, int level, int cwWeight, int exWeight){
        this.code = code;
        this.title = title;
        this.level = level;
        this.cwWeight = cwWeight;
        this.exWeight = exWeight;
    }
    //Method to print the parameter of an object
    public void print(){
        System.out.println("Code: " + code);
        System.out.println("Title: " + title);
        System.out.println("Level: " + level);
        System.out.println("cwWeight: " + cwWeight);
        System.out.println("exWeight: " + exWeight);
        System.out.println();
    }

    //Series of methods to individually set the parameters
    public void setCode(String code){ this.code = code;}
    public void setTitle(String title){ this.title = title;}
    public void setLevel(int level){ this.level = level;}
    public void setWeights(int cwWeight, int exWeight){
        this.cwWeight = cwWeight;
        this.exWeight = exWeight;
    }

    //Series of method to access the value of a parameter
    public String getCode(){ return code;}
    public String getTitle(){ return title;}
    public int getLevel(){return level;}
    public int getCwWeight(){return cwWeight;};
    public int getExWeight(){ return  exWeight;}




}
