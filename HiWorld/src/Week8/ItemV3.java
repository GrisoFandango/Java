package Week8;

public class ItemV3 {
    String refNo;
    String name;
    int price; // in pence

    public ItemV3() {
        set("000000", "No Name", 0);
    }

    public ItemV3(String refNo, String name, int price) {
        set(refNo, name, price);
    }

    public void print() {
        System.out.println("RefNo: " + refNo);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public void set(String refNo, String name, int price) {
        this.refNo = refNo;
        this.name = name;
        this.price = price;
    }
}

