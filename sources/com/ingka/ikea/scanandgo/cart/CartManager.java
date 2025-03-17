package com.ingka.ikea.scanandgo.cart;

import android.content.Context;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.request.BarcodeAndQuantityDataModel;
import java.util.ArrayList;
import java.util.List;

public class CartManager {
    private static CartManager instance;
    private final List<BarcodeAndQuantityDataModel> cartItems;

    private CartManager() {
        cartItems = new ArrayList<>();
    }

    public static synchronized CartManager getInstance(Context context) {
        if (instance == null) {
            instance = new CartManager();
        }
        return instance;
    }

    public void addItemToCart(BarcodeAndQuantityDataModel item) {
        // Add logic to check if the item already exists in the cart
        for (BarcodeAndQuantityDataModel cartItem : cartItems) {
            if (cartItem.getBarcode().equals(item.getBarcode())) {
                // If item exists, update the quantity
                int newQuantity = cartItem.getQuantity() + item.getQuantity();
                cartItems.remove(cartItem);
                cartItems.add(new BarcodeAndQuantityDataModel(item.getBarcode(), newQuantity));
                return;
            }
        }
        // If item does not exist, add it to the cart
        cartItems.add(item);
    }

    public List<BarcodeAndQuantityDataModel> getCartItems() {
        return new ArrayList<>(cartItems);
    }

    public void removeItemFromCart(String barcode) {
        // Add logic to remove an item from the cart by barcode
        cartItems.removeIf(cartItem -> cartItem.getBarcode().equals(barcode));
    }

    public void clearCart() {
        // Add logic to clear all items from the cart
        cartItems.clear();
    }
}
