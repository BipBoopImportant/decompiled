package com.oppwa.mobile.connect.checkout.meta;

import androidx.lifecycle.F;
import com.oppwa.mobile.connect.checkout.dialog.TransactionResult;

public class TransactionResultLiveData extends F<TransactionResult> {

    /* renamed from: b  reason: collision with root package name */
    private static TransactionResultLiveData f121453b;

    /* renamed from: a  reason: collision with root package name */
    private TransactionResult f121454a;

    private TransactionResultLiveData() {
    }

    public static TransactionResultLiveData getInstance() {
        if (f121453b == null) {
            f121453b = new TransactionResultLiveData();
        }
        return f121453b;
    }

    /* access modifiers changed from: protected */
    public void onActive() {
        super.onActive();
        TransactionResult transactionResult = this.f121454a;
        if (transactionResult != null) {
            postValue(transactionResult);
        }
    }

    public void postValue(TransactionResult transactionResult) {
        super.postValue(transactionResult);
        this.f121454a = transactionResult;
    }
}
