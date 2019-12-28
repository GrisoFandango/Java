package Week8;

public class ItemTest4 {

    public static void main(String [] args){
        System.out.println("\nThis is ItemTest4\n\n");

        ItemV4 myItem = new ItemV4("111111", "Pen", 100);
        myItem.print();

        String refNo = myItem.getRefno();
        System.out.println("The item Reference No is: " + refNo);
        System.out.println("The item name is: " + myItem.getName());

        int price = myItem.getPrice();
        System.out.println("The item price is: " + price);

        myItem.setPrice(price+20);

        System.out.println("\nIcrease price by 20 gives...");
        myItem.print();
    }
}
