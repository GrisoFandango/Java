/*Design and implement a class named Modules that may contain several Module objects. Your class should define:
•	a constructor
•	a method to add a Module to the Modules container
•	a method to print details of each Module in the Modules container, details of each Module
    to be displayed on a single line
•	a method which will get the number of modules currently in the Modules container.
*/
package week9;
import Week8.Q5Module;

import java.util.ArrayList;
public class modules {
    public static class Modules{
        ArrayList<Q5Module> modules; //Collection of items

        //Constructor
        public Modules(){
            //new container to hold modules from module class
            modules = new ArrayList<Q5Module>();
        }

        // method to return size of ArrayList
        public int getSize(){
            //return total number of modules contained in ArrayList
            return modules.size();
        }

        public void add(Q5Module module){
            modules.add(module); //add a module to modules
        }
        //print each module from the modules container class
        public void print(String heading){
            System.out.println(heading);
            for(int i=0; i < modules.size(); i++) //for each item in ArrayList
                System.out.println(modules.get(i));// get it and print it
        }

    }
}
