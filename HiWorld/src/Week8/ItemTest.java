package Week8;

public class ItemTest {
    public static void main(String[] args){
        System.out.println("\nThis is ItemTest");

        //Construct object using given parameters
        Item myItem = new Item("111111", "Pen", 100);
        myItem.print();

        //get refNo and price
        String refNo = myItem.getRefNo();
        System.out.println("The item Reference No is: " + refNo);
        System.out.println("The item name is: " + myItem.getName());

        int price = myItem.getPrice();
        System.out.println("The item price is: " + price);

        myItem.setPrice(price+20); // change value of price

        System.out.println("Increase the price by 20 gives...");
        myItem.print();

        System.out.println("This is to request user input\n");

        Item myItem2 = new Item();
        myItem2.ask("Enter the data for new Item..."); //request user input
        myItem2.print();
    }

}
