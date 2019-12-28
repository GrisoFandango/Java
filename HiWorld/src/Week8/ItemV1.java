package Week8;

public class ItemV1 {
    String refNo;
    String name;
    int price; // in pence

    public ItemV1(){
        refNo = "000000";
        name = "No Name";
        price = 0;
    }

    public void print(){
        System.out.println("RefNo: " + refNo);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}
