package week9;


import Week8.Item;

public class ItemTest1 {
    public static void main(String[] args){
        System.out.println("This is ItemsTest1\n");
        //declare Items object
        itemsV1.Items items = new itemsV1.Items();

        Item item1 = new Item(); //create first time object
        item1.ask("Enter item1 details...");// use ask method
        items.add(item1);//add Item object to items container

        Item item2 = new Item();// create second Item object
        item2.ask("\nEnter item2 details...");
        items.add(item2);

        items.print("\nItems entered are...");//print header
        //print total number of items to items container
        System.out.println("\nNo of items: " + items.getSize());

    }
}
