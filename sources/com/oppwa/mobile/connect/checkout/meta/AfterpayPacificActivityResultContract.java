package com.oppwa.mobile.connect.checkout.meta;

import android.content.Context;
import android.content.Intent;
import com.afterpay.android.Afterpay;
import h.C5403a;

public class AfterpayPacificActivityResultContract extends C5403a<String, Integer> {
    public Intent createIntent(Context context, String str) {
        return Afterpay.a(context, str, false);
    }

    public Integer parseResult(int i10, Intent intent) {
        return Integer.valueOf(i10);
    }
}
