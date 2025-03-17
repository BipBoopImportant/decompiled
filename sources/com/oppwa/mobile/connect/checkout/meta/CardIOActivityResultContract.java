package com.oppwa.mobile.connect.checkout.meta;

import android.content.Context;
import android.content.Intent;
import h.C5403a;
import io.card.payment.CardIOActivity;
import io.card.payment.CreditCard;

public class CardIOActivityResultContract extends C5403a<Void, CreditCard> {
    public Intent createIntent(Context context, Void voidR) {
        Intent intent = new Intent(context, CardIOActivity.class);
        intent.putExtra("io.card.payment.intentSenderIsPayPal", false);
        intent.putExtra("io.card.payment.hideLogo", true);
        intent.putExtra("io.card.payment.scanExpiry", true);
        intent.putExtra("io.card.payment.requireExpiry", true);
        intent.putExtra("io.card.payment.suppressManual", true);
        return intent;
    }

    public CreditCard parseResult(int i10, Intent intent) {
        if (intent != null) {
            return intent.getParcelableExtra("io.card.payment.scanResult");
        }
        return null;
    }
}
