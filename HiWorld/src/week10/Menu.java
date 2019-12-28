/*Design and write a menu drive application named Menu that can be used by a student
following a course of study. The student should be provided with options to:
•	add a module to the list of modules they are studying
•	print the modules that they are studying
•	quit the application
*/
package week10;

import Week8.Q5Module;
import week4.Console;
import week9.modules;

public class Menu {
    public static void main(String[] args){
        modules.Modules Modules = new modules.Modules();
        Q5Module module;

        boolean finished = false; //not finished
        char option;
        while (! finished){
            option= Console.askChar("Choose to A)dd, P)rint, Q)uit: ");
            switch(option){
                case 'A':
                    module = new Q5Module();
                    module.ask("\nEnter the details of the module: ");
                    Modules.add(module);
                    break;
                case 'P':
                    Modules.print("\nThe modules present are: ");
                    break;
                case 'Q':
                    finished = true;
                    break;
                default:
                    System.out.println("Invalid option!");

            }
        }
    }
}
