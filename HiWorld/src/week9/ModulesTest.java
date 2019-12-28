//Write a short application to test your Module class.
package week9;

import Week8.Q5Module;

public class ModulesTest {
    public static void main(String[] args){
        System.out.println("This is ModulesTest1\n");
        // declare modules object
        modules.Modules modules = new modules.Modules();

        Q5Module module1 = new Q5Module(); //create first object
        module1.ask("Enter module1 details...");// use ask method
        modules.add(module1); //add module object to modules container

        Q5Module module2 = new Q5Module(); //create first object
        module2.ask("Enter module2 details...");// use ask method
        modules.add(module2); //add module object to modules container

        modules.print("\nItems entered are..."); //print header
        //print total number of items added to items container
        System.out.println("\nNo of items: " + modules.getSize());

    }
}
