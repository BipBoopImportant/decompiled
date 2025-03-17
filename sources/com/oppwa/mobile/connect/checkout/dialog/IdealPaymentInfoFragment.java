package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Bundle;
import android.view.View;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.C14110u;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.bankaccount.BankAccountPaymentParams;
import com.oppwa.mobile.connect.provider.IdealBanksListener;
import com.oppwa.mobile.connect.provider.OppPaymentProvider;
import java.util.Map;

public class IdealPaymentInfoFragment extends ListPaymentInfoFragment implements IdealBanksListener {

    /* renamed from: t  reason: collision with root package name */
    private C14110u.b[] f120958t = null;

    /* renamed from: u  reason: collision with root package name */
    private OppPaymentProvider f120959u;

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Map map) {
        this.f120958t = b(map);
        i();
        j();
    }

    private PaymentParams k() {
        try {
            return BankAccountPaymentParams.createIdealPaymentParams(this.f121052e.getCheckoutId(), f());
        } catch (PaymentException unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void l() {
        j();
        h();
    }

    /* access modifiers changed from: protected */
    public PaymentParams b() {
        return k();
    }

    /* access modifiers changed from: protected */
    public C14110u.b[] e() {
        return this.f120958t;
    }

    public void idealBanksRequestFailed() {
        getActivity().runOnUiThread(new Q1(this));
    }

    public void idealBanksRequestSucceeded(Map<String, String> map) {
        getActivity().runOnUiThread(new P1(this, map));
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        b(R.string.checkout_layout_text_select_bank);
        g();
        OppPaymentProvider oppPaymentProvider = new OppPaymentProvider(getContext(), this.f121052e.getProviderMode());
        this.f120959u = oppPaymentProvider;
        oppPaymentProvider.requestIdealBanks(this.f121052e.getCheckoutId(), this);
    }

    private C14110u.b[] b(Map<String, String> map) {
        C14110u.b[] bVarArr = new C14110u.b[map.size()];
        int i10 = 0;
        for (Map.Entry next : map.entrySet()) {
            bVarArr[i10] = new C14110u.b((String) next.getKey(), (String) next.getValue());
            i10++;
        }
        return bVarArr;
    }
}
