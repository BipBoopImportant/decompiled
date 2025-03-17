package com.oppwa.mobile.connect.payment.processor;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.provider.Transaction;
import com.oppwa.mobile.connect.utils.Logger;

public abstract class BaseProcessorActivity extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public abstract Intent a(Transaction transaction, PaymentError paymentError);

    /* access modifiers changed from: protected */
    public void a(int i10, Transaction transaction, PaymentError paymentError) {
        Logger.error(paymentError.getErrorMessage());
        Logger.sendLogs();
        setResult(i10, a(transaction, paymentError));
        finish();
    }

    /* access modifiers changed from: protected */
    public void a(int i10, Transaction transaction) {
        Logger.sendLogs();
        setResult(i10, a(transaction, (PaymentError) null));
        finish();
    }
}
