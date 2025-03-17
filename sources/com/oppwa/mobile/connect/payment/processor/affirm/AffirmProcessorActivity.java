package com.oppwa.mobile.connect.payment.processor.affirm;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import com.affirm.android.Affirm;
import com.affirm.android.model.Checkout;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.processor.BaseProcessorActivity;
import com.oppwa.mobile.connect.provider.Transaction;
import com.oppwa.mobile.connect.utils.LibraryHelper;
import com.oppwa.mobile.connect.utils.Logger;
import java.util.Optional;

public class AffirmProcessorActivity extends BaseProcessorActivity {
    public static final String ERROR_EXTRA_KEY = "com.oppwa.mobile.connect.payment.processor.affirm.error";
    public static final int RESULT_CODE_ERROR = 1003;
    public static final String TRANSACTION_EXTRA_KEY = "com.oppwa.mobile.connect.payment.processor.affirm.transaction";

    /* renamed from: a  reason: collision with root package name */
    AffirmViewModel f121889a;

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException c() {
        return new IllegalStateException("Affirm view model is null.");
    }

    private AffirmViewModel d() {
        return (AffirmViewModel) Optional.ofNullable(this.f121889a).orElseThrow(new C14130c());
    }

    /* access modifiers changed from: protected */
    public void a(Transaction transaction) {
        a(-1, transaction);
    }

    /* access modifiers changed from: protected */
    public boolean b() {
        if (LibraryHelper.isAffirmAvailable) {
            return true;
        }
        a(PaymentError.getAffirmError("Affirm dependency is required to use Affirm."));
        return false;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        d().handleAffirmCheckoutResult(i10, i11, intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (b()) {
            this.f121889a = (AffirmViewModel) new i0((k0) this).a(AffirmViewModel.class);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        d().getAffirmCheckoutLiveData().observe(this, new C14131d(this));
        d().getPaymentErrorLiveData().observe(this, new C14132e(this));
        d().getTransactionResultLiveData().observe(this, new C14133f(this));
        try {
            d().init(this);
        } catch (PaymentException e10) {
            Logger.error((Throwable) e10);
            a(e10.getError());
        }
    }

    /* access modifiers changed from: protected */
    public void a(PaymentError paymentError) {
        a(RESULT_CODE_ERROR, a(), paymentError);
    }

    /* access modifiers changed from: protected */
    public void a(Checkout checkout) {
        if (!d().isAffirmCheckoutStarted()) {
            try {
                Affirm.startCheckout(this, checkout, d().isVcnEnabled());
                d().setAffirmCheckoutStarted(true);
            } catch (PaymentException e10) {
                Logger.error((Throwable) e10);
                a(e10.getError());
            }
        }
    }

    /* access modifiers changed from: protected */
    public Intent a(Transaction transaction, PaymentError paymentError) {
        Intent intent = new Intent();
        intent.putExtra(TRANSACTION_EXTRA_KEY, transaction);
        intent.putExtra(ERROR_EXTRA_KEY, paymentError);
        return intent;
    }

    private Transaction a() {
        return (Transaction) Optional.ofNullable(this.f121889a).map(new C14129b()).orElse((Object) null);
    }
}
