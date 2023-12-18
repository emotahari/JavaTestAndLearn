package shop;

public class Item {
    private String name;
    private int quantity;

    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;

    }

    public void check() {
        if( name == null){
            throw new ItemNameException();
        }
    }
}
