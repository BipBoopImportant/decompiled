package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.stcpay.STCPayPaymentParams;
import com.oppwa.mobile.connect.payment.stcpay.STCPayVerificationOption;
import com.oppwa.mobile.connect.utils.StringUtils;

public class STCPayPaymentInfoFragment extends PaymentInfoFragment {

    /* renamed from: p  reason: collision with root package name */
    private RadioGroup f121081p;

    /* renamed from: q  reason: collision with root package name */
    private RadioButton f121082q;

    /* renamed from: r  reason: collision with root package name */
    private RadioButton f121083r;

    /* renamed from: s  reason: collision with root package name */
    private InputLayout f121084s;

    /* renamed from: t  reason: collision with root package name */
    private RelativeLayout f121085t;

    /* renamed from: u  reason: collision with root package name */
    private int f121086u = 0;

    /* access modifiers changed from: private */
    public /* synthetic */ void a(RadioGroup radioGroup, int i10) {
        if (this.f121082q.isChecked()) {
            this.f121084s.clearError();
            this.f121084s.setVisibility(0);
            return;
        }
        this.f121084s.setVisibility(8);
    }

    private void e() {
        this.f121084s.getEditText().setInputType(2);
        this.f121084s.getEditText().setImeOptions(6);
        this.f121084s.setHint(getString(R.string.checkout_layout_hint_phone_number));
        this.f121084s.setInputValidator(C14099q.g());
        if (this.f121086u == 1) {
            this.f121084s.setGravityForRTLLanguages();
        }
    }

    private void f() {
        this.f121081p.setOnCheckedChangeListener(new i2(this));
    }

    private void g() {
        this.f121086u = getResources().getConfiguration().getLayoutDirection();
        if (!this.f121052e.isSTCPayQrCodeRequired()) {
            this.f121085t.setVisibility(8);
        } else {
            f();
        }
        e();
    }

    /* access modifiers changed from: protected */
    public PaymentParams b() {
        STCPayPaymentParams sTCPayPaymentParams;
        try {
            if (this.f121082q.isChecked() && this.f121084s.validate()) {
                sTCPayPaymentParams = new STCPayPaymentParams(this.f121052e.getCheckoutId(), STCPayVerificationOption.MOBILE_PHONE);
                sTCPayPaymentParams.setMobilePhoneNumber(StringUtils.replaceNonstandardDigits(this.f121084s.getText()));
            } else if (!this.f121083r.isChecked()) {
                return null;
            } else {
                sTCPayPaymentParams = new STCPayPaymentParams(this.f121052e.getCheckoutId(), STCPayVerificationOption.QR_CODE);
            }
            return sTCPayPaymentParams;
        } catch (PaymentException unused) {
            return null;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.opp_fragment_stcpay_payment_info, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f121081p = (RadioGroup) view.findViewById(R.id.form_type_radio_group);
        this.f121082q = (RadioButton) view.findViewById(R.id.mobile_phone_radio_button);
        this.f121084s = (InputLayout) view.findViewById(R.id.mobile_phone_input_layout);
        this.f121083r = (RadioButton) view.findViewById(R.id.qrcode_radio_button);
        this.f121085t = (RelativeLayout) view.findViewById(R.id.form_type_method_group);
        g();
    }
}
