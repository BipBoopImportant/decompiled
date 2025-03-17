package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Bundle;
import android.view.View;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.C14110u;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.bankaccount.BankAccountPaymentParams;
import com.oppwa.mobile.connect.payment.bankaccount.IdealPaymentParams;

public class SofortPaymentInfoFragment extends ListPaymentInfoFragment {
    private PaymentParams k() {
        try {
            return BankAccountPaymentParams.createSofortPaymentParams(this.f121052e.getCheckoutId(), f());
        } catch (PaymentException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public PaymentParams b() {
        return k();
    }

    /* access modifiers changed from: protected */
    public C14110u.b[] e() {
        return new C14110u.b[]{new C14110u.b(getString(R.string.germany), "DE"), new C14110u.b(getString(R.string.netherlands), IdealPaymentParams.DEFAULT_COUNTRY), new C14110u.b(getString(R.string.austria), "AT"), new C14110u.b(getString(R.string.belgium), "BE"), new C14110u.b(getString(R.string.switzerland), "CH"), new C14110u.b(getString(R.string.united_kingdom), "GB"), new C14110u.b(getString(R.string.spain), "ES"), new C14110u.b(getString(R.string.italy), "IT"), new C14110u.b(getString(R.string.poland), "PL")};
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        b(R.string.checkout_layout_text_select_country);
        i();
        j();
    }
}
