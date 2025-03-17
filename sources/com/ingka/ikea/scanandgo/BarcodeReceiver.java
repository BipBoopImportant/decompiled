package com.ingka.ikea.scanandgo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.request.BarcodeAndQuantityDataModel;
import com.ingka.ikea.scanandgo.cart.CartManager;

public class BarcodeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if ("com.example.intent.action.SEND_BARCODE".equals(intent.getAction())) {
            String barcode = intent.getStringExtra("barcode");
            int quantity = intent.getIntExtra("quantity", 1);

            if (barcode != null) {
                BarcodeAndQuantityDataModel barcodeData = new BarcodeAndQuantityDataModel(barcode, quantity);
                // Add barcodeData to the cart
                addToCart(context, barcodeData);
            }
        }
    }

    private void addToCart(Context context, BarcodeAndQuantityDataModel barcodeData) {
        CartManager cartManager = CartManager.getInstance(context);
        cartManager.addItemToCart(barcodeData);
        Toast.makeText(context, "Added to cart: " + barcodeData.getBarcode() + " (Quantity: " + barcodeData.getQuantity() + ")", Toast.LENGTH_LONG).show();
    }
}
