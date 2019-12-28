package Week8;

public class ItemV4 {
    String refNo;
    String name;
    int price;

    public ItemV4(String refNo, String name, int price){
        set(refNo, name, price);
    }

    public ItemV4(){
        set("000000", "No Name", 0);
    }

    public void print(){
        System.out.println("refNo: " + refNo);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public void set(String refNo, String name, int price){
        setRefNo(refNo);
        setName(name);
        setPrice(price);
    }

    public void setRefNo(String refNo){
        this.refNo = refNo;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public String getRefno(){
        return refNo;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }



}
