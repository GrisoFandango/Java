package Week8;

public class ItemTest3 {
    public static void main(String args[]){
        System.out.println("\nThis is ItemTest3\n\n");

        ItemV3 item1 = new ItemV3();
        System.out.println("\nItem 1 is...");
        item1.print();

        item1.set("987654", "Table", 3000);
        System.out.println("Item1 is now...");
        item1.print();

        ItemV3 item2 = new ItemV3("123456", "Chair", 2500);
        System.out.println("Item 2 is...");
        item2.print();

    }
}
