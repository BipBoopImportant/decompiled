package com.oppwa.mobile.connect.checkout.dialog;

import androidx.lifecycle.I;
import com.oppwa.mobile.connect.checkout.meta.TransactionResultLiveData;
import java.util.function.Consumer;

public final /* synthetic */ class J1 implements Consumer {
    public final void accept(Object obj) {
        ((I) obj).c(TransactionResultLiveData.getInstance());
    }
}
