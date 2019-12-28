package Week8;

public class Q5ModuleTest {

    public static void main(String [] args){
        System.out.println("\nThis is Q4Module Test");

        Q5Module myModule = new Q5Module("ABCDEF", "Java module", 3, 100, 80);
        myModule.ask("Enter the values of the new item...");
        myModule.print();

    }
}
