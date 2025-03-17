package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.fragment.app.C5187o;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSettings;
import com.oppwa.mobile.connect.provider.Connect;
import com.samsung.android.sdk.samsungpay.v2.StatusListener;
import g.C5314c;
import xa.C8965f;

public class PaymentButtonFragment extends C5187o {
    public static final String OPP_PAYMENT_BRAND_CARD = "CARD";

    /* renamed from: a  reason: collision with root package name */
    private C14056c f121049a;

    public static void isReadyForGooglePay(Context context, Connect.ProviderMode providerMode, String str, C8965f<Boolean> fVar) {
        GooglePayHelper.isReadyToPayWithGoogle(context, providerMode, str, fVar);
    }

    public static void isReadyForSamsungPay(Context context, String str, StatusListener statusListener) {
        SamsungPayHelper.getSamsungPay(context, str).getSamsungPayStatus(statusListener);
    }

    public String getPaymentBrand() {
        return this.f121049a.e();
    }

    public ImageButton getPaymentButton() {
        return this.f121049a.f();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        C14056c cVar = new C14056c(this);
        this.f121049a = cVar;
        cVar.g();
        this.f121049a.h();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f121049a.a(layoutInflater, viewGroup);
    }

    public void onDetach() {
        super.onDetach();
        this.f121049a.i();
    }

    public void onStart() {
        super.onStart();
        this.f121049a.j();
    }

    public void onStop() {
        super.onStop();
        this.f121049a.k();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f121049a.b(view);
    }

    public void setActivityResultLauncher(C5314c<CheckoutSettings> cVar) {
        this.f121049a.a(cVar);
    }

    public void setPaymentBrand(String str) {
        this.f121049a.b(str);
    }

    public void setPaymentButtonIntegrationMode(PaymentButtonIntegrationMode paymentButtonIntegrationMode) {
        this.f121049a.a(paymentButtonIntegrationMode);
    }

    public void submitTransaction(CheckoutSettings checkoutSettings) {
        this.f121049a.c(checkoutSettings);
    }
}
