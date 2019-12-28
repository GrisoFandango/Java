package Week8;

public class ItemV2 {
    String refNo;
    String name;
    int price; // in pence

    public ItemV2(){
        refNo = "000000";
        name = "No Name";
        price = 0;
    }

    public ItemV2(String refNo, String name, int price){
        this.refNo = refNo;
        this.name = name;
        this.price = price;
    }

    public void print(){
        System.out.println("RefNo: " + refNo);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}
