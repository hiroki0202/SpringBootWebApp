package net.code;

public class CartItem {

    private int id;
    private String name;
    private int quantity;
    private int price;

    /**
     * @param id
     * @param name
     * @param quantity
     * @param totalPrice
     */
    public CartItem(TrSellItemsEntity item) {
        super();
        this.id = item.getSellItemsNum();
        this.name = item.getSellItemsName();
        this.quantity = 1;
        this.price = item.getSellItemsPrice();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
