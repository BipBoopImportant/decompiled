package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.uicomponent.util.InputFormatter;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.bankaccount.BankAccountPaymentParams;

public class GiropayPaymentInfoFragment extends PaymentInfoFragment {

    /* renamed from: p  reason: collision with root package name */
    private InputLayout f120939p;

    /* renamed from: q  reason: collision with root package name */
    private InputLayout f120940q;

    /* renamed from: r  reason: collision with root package name */
    private final C14113v f120941r = new C14113v(' ', InputFormatter.IBAN_MASK);

    /* renamed from: s  reason: collision with root package name */
    private int f120942s = 0;

    private void a(InputLayout inputLayout) {
        inputLayout.setHint(getString(R.string.checkout_helper_bic_bank_code));
        inputLayout.setHelperText(getString(R.string.checkout_helper_bic_bank_code));
        inputLayout.setInputValidator(C14099q.c());
        inputLayout.getEditText().setInputType(528384);
        inputLayout.getEditText().setImeOptions(6);
        inputLayout.getEditText().setContentDescription(getString(R.string.checkout_helper_bic_bank_code));
        inputLayout.getEditText().setFilters(new InputFilter[]{new C14048a(false), new InputFilter.LengthFilter(12)});
        if (this.f120942s == 1) {
            inputLayout.setGravityForRTLLanguages();
        }
    }

    private void b(InputLayout inputLayout) {
        if (!this.f121052e.isIBANRequired()) {
            inputLayout.setVisibility(8);
            return;
        }
        inputLayout.setHint(getString(R.string.checkout_helper_iban_account_number));
        inputLayout.setHelperText(getString(R.string.checkout_helper_iban_account_number));
        inputLayout.setInputValidator(C14099q.a(this.f120941r, true));
        inputLayout.getEditText().setInputType(528384);
        inputLayout.getEditText().setImeOptions(5);
        inputLayout.getEditText().setContentDescription(getString(R.string.checkout_helper_iban_account_number));
        inputLayout.getEditText().addTextChangedListener(this.f120941r);
        inputLayout.getEditText().setFilters(new InputFilter[]{new C14048a(false), new InputFilter.LengthFilter(38)});
        if (this.f120942s == 1) {
            inputLayout.setGravityForRTLLanguages();
        }
    }

    private PaymentParams e() {
        String str;
        String str2;
        String str3;
        String checkoutId = this.f121052e.getCheckoutId();
        String text = this.f120939p.getText();
        String text2 = this.f120940q.getText();
        if (!f()) {
            return null;
        }
        if (this.f121052e.isIBANRequired()) {
            str2 = this.f120941r.a(text);
            if (b(str2)) {
                str = null;
            } else {
                str = str2;
                str2 = null;
            }
        } else {
            str2 = null;
            str = null;
        }
        if (a(text2)) {
            str3 = text2;
            text2 = null;
        } else {
            str3 = null;
        }
        try {
            return BankAccountPaymentParams.createGiroPayPaymentParams(checkoutId, str2, str, text2, str3);
        } catch (PaymentException unused) {
            return null;
        }
    }

    private boolean f() {
        boolean z10 = !this.f121052e.isIBANRequired() || this.f120939p.validate();
        if (!this.f120940q.validate()) {
            return false;
        }
        return z10;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.opp_fragment_giropay_payment_info, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f120942s = getResources().getConfiguration().getLayoutDirection();
        this.f120939p = (InputLayout) view.findViewById(R.id.iban_input_layout);
        this.f120940q = (InputLayout) view.findViewById(R.id.bic_or_bank_code_input_layout);
        b(this.f120939p);
        a(this.f120940q);
    }

    private boolean a(String str) {
        if (BankAccountPaymentParams.isBankCodeValid(str)) {
            return true;
        }
        BankAccountPaymentParams.isBicValid(str);
        return false;
    }

    /* access modifiers changed from: protected */
    public PaymentParams b() {
        return e();
    }

    private boolean b(String str) {
        if (BankAccountPaymentParams.isIbanValid(str)) {
            return true;
        }
        BankAccountPaymentParams.isAccountNumberValid(str);
        return false;
    }
}
