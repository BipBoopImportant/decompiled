package com.ingka.ikea.scanandgo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.request.BarcodeAndQuantityDataModel;
import com.ingka.ikea.scanandgo.cart.CartManager;

public class BarcodeReceiver extends BroadcastReceiver {
    private static final String TAG = "BarcodeReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        if ("com.example.intent.action.SEND_BARCODE".equals(intent.getAction())) {
            String barcode = intent.getStringExtra("barcode");
            int quantity = intent.getIntExtra("quantity", 1);

            if (barcode != null && !barcode.isEmpty()) {
                BarcodeAndQuantityDataModel barcodeData = new BarcodeAndQuantityDataModel(barcode, quantity);
                // Add barcodeData to the cart
                addToCart(context, barcodeData);
            } else {
                Log.e(TAG, "Invalid barcode received");
                Toast.makeText(context, "Invalid barcode received", Toast.LENGTH_LONG).show();
            }
        }
    }

    private void addToCart(Context context, BarcodeAndQuantityDataModel barcodeData) {
        CartManager cartManager = CartManager.getInstance(context);
        cartManager.addItemToCart(barcodeData);
        Toast.makeText(context, "Added to cart: " + barcodeData.getBarcode() + " (Quantity: " + barcodeData.getQuantity() + ")", Toast.LENGTH_LONG).show();
    }
}
