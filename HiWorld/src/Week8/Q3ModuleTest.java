package Week8;

public class Q3ModuleTest {

    public static void main(String [] args){
        System.out.println("\nThis is Q2Module Test");
        System.out.println("This is the default module");
        Q3Module myModule = new Q3Module();
        myModule.print();

        myModule.setCode("ABCDEF");
        myModule.setTitle("Java Module");
        myModule.setLevel(3);
        myModule.setWeights(100, 80);
        System.out.println("This is the module after using the different set methods");
        myModule.print();

    }
}
