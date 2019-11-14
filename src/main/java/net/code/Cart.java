package net.code;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Integer, CartItem> cartItems;
    private int grandTotal;

    public Cart() {
        cartItems = new HashMap<Integer, CartItem>();
        grandTotal = 0;
    }

    public Map<Integer, CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(Map<Integer, CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public int getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(int grandTotal) {
        this.grandTotal = grandTotal;
    }

    public void addCartItem(CartItem item) {

        int id = item.getProduct().getSellItemsNum();

        if(cartItems.containsKey(id)) {
            CartItem existingCartItem = cartItems.get(id);
            existingCartItem.setQuantity(existingCartItem.getQuantity() + item.getQuantity());
            existingCartItem.setTotalPrice(existingCartItem.getQuantity() * item.getProduct().getSellItemsPrice());
            cartItems.put(new Integer(id), existingCartItem);
        } else {
            cartItems.put(id, item);
        }

        updateGrandTotal();
    }

    public void removeCartItem(int id) {

        cartItems.remove(id);

        updateGrandTotal();
    }

    public void updateGrandTotal() {

        grandTotal = 0;

        for (CartItem item : cartItems.values()) {
            grandTotal += item.getTotalPrice();
        }
    }
}
