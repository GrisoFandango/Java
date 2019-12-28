package Week8;

public class Q4ModuleTest {

    public static void main(String [] args){
        System.out.println("\nThis is Q4Module Test");

        Q4Module myModule = new Q4Module("ABCDEF", "Java module", 3, 100, 80);
        System.out.println("This is the parameterised module");
        myModule.print();

        System.out.println("This is the code: " + myModule.getCode());
        System.out.println("This is the title: " + myModule.getTitle());
        System.out.println("This is the level: " + myModule.getLevel());
        System.out.println("This is the cwWeight: " + myModule.getCwWeight());
        System.out.println("This is the exWeight: " + myModule.getExWeight());




    }
}
