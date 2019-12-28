package week9;
//import ArrayList class from java.util library

import Week8.Item;

import java.util.ArrayList;
public class itemsV1 {

    public static class Items{
        //Properties: ArrayList to store contents of items class
        ArrayList<Item>items; //Collection of items

        //Constructor
        public Items(){
            //new container to hold items from Item class
            items = new ArrayList<Item>();
        }
        //method to return size of ArrayList
        public int getSize(){
            //return total number of items contained in ArrayList
            return items.size();
        }
        public void add(Item item){
            items.add(item);//add an item to items
        }

        //print each item from the items container class
        public void print(String heading){
            System.out.println(heading);
            for(int i=0; i<items.size(); i++)//for each item in ArrayList#
                //items.get(i).print();
                //String [] myList = items.get(i);
                System.out.println(items.get(i));//get it and print it

        }

    }
}


