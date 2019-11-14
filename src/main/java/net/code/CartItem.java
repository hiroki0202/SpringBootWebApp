package net.code;

public class CartItem {

    private TrSellItemsEntity product;
    private int quantity;
    private int totalPrice;

    /**
     * @param product
     * @param quantity
     * @param totalPrice
     */
    public CartItem(TrSellItemsEntity product) {
        super();
        this.product = product;
        this.quantity = 1;
        this.totalPrice = product.getSellItemsPrice();
    }

    public TrSellItemsEntity getProduct() {
        return product;
    }

    public void setProduct(TrSellItemsEntity product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
