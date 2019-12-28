package Week8;

public class ItemTest2 {
    public static void main(String args[]){
        System.out.println("\nThis is ItemTest2\n\n");

        ItemV2 Item1 = new ItemV2();
        Item1.print();
        System.out.println();

        ItemV2 item2 = new ItemV2("123456", "Chair", 2500);
        item2.print();
    }
}
