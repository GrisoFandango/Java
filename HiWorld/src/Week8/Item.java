package Week8;

import week4.Console;

public class Item {

    String refNo;
    String name;
    int price; // in pence

    //Constructor with parameters
    public Item(String refNo, String name, int price){
        set(refNo,name, price);
    }

    //Default Constructor
    public Item(){
        set("000000", "No Name", 0);
    }

    //Print method for the object
    public void print(){
        System.out.println("RefNo: " + refNo);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public String toString() {
        return refNo + " " + name + " " + price ;
    }

    //Set method for all field
    public void set(String refNo, String name, int price){
        setRefNo(refNo);
        setName(name);
        setPrice(price);
    }

    //Set method for reference number
    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    //Set method for name
    public void setName(String name){
        this.name = name;
    }

    //Set Method for price
    public void setPrice(int price){
        this.price = price;
    }

    //get method for individual fields
    public String getRefNo() {
        return refNo;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    //Ask method for user input
    public void ask(String prompt){
        System.out.println(prompt);
        String refNo = Console.askString("refNo: ");
        setRefNo(refNo);
        setName(Console.askString("Name: "));
        setPrice(Console.askInt("Price: "));
    }


}
