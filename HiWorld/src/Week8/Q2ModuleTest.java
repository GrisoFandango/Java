package Week8;

public class Q2ModuleTest {

    public static void main(String [] args){
        System.out.println("\nThis is Q2Module Test");
        System.out.println("This is the defaul module");
        Q2Module myModule = new Q2Module();
        myModule.print();

        Q2Module myModule2 = new Q2Module("ABCDEF", "Java module", 3, 100, 80);
        System.out.println("This is the parameterised module");
        myModule2.print();



    }
}
