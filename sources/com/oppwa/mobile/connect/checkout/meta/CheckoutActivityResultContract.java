package com.oppwa.mobile.connect.checkout.meta;

import android.content.Context;
import android.content.Intent;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import com.oppwa.mobile.connect.checkout.meta.CheckoutActivityResult;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.provider.Transaction;
import h.C5403a;

public class CheckoutActivityResultContract extends C5403a<CheckoutSettings, CheckoutActivityResult> {
    public Intent createIntent(Context context, CheckoutSettings checkoutSettings) {
        Intent putExtra = new Intent(context, CheckoutActivity.class).putExtra("com.oppwa.mobile.connect.checkout.dialog.EXTRA_CHECKOUT_SETTINGS", checkoutSettings);
        if (checkoutSettings != null) {
            if (checkoutSettings.getComponentName() != null) {
                putExtra.putExtra(CheckoutActivity.CHECKOUT_RECEIVER, checkoutSettings.getComponentName());
            }
            if (checkoutSettings.getPaymentButtonBrand() != null) {
                putExtra.putExtra(CheckoutActivity.CHECKOUT_PAYMENT_BUTTON_METHOD, checkoutSettings.getPaymentButtonBrand());
            }
        }
        return putExtra;
    }

    public CheckoutActivityResult parseResult(int i10, Intent intent) {
        CheckoutActivityResult.Builder builder = new CheckoutActivityResult.Builder();
        if (intent != null) {
            builder.setTransaction((Transaction) intent.getParcelableExtra(CheckoutActivity.CHECKOUT_RESULT_TRANSACTION)).setPaymentError((PaymentError) intent.getParcelableExtra(CheckoutActivity.CHECKOUT_RESULT_ERROR)).setResourcePath(intent.getStringExtra(CheckoutActivity.CHECKOUT_RESULT_RESOURCE_PATH)).setCanceled(i10 == 101);
        }
        return builder.build();
    }
}
