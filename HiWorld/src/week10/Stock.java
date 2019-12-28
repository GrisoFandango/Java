package week10;

import Week8.Item;
import week4.Console;
import week4.Console.*;
import week9.itemsV1;

public class Stock {
    public static void main(String [] args){
        //Develop menu-drive application
        itemsV1.Items items = new itemsV1.Items();
        Item item;
        boolean finished = false; //not finished
        char option;
        while(! finished) {//not finished

            option = Console.askChar("Select A)dd, P)rint, Q)uit ");
            switch (option) {
                case 'A':
                    item = new Item();
                    item.ask("Enter item details: ");
                    items.add(item);
                    break;
                case 'P':
                    items.print("items are: ");
                    break;
                case 'Q':
                    finished = true; //finished
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }// end of while loop when user choose Q
    }
}
