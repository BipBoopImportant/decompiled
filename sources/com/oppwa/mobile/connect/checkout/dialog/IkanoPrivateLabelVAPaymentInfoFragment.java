package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.ar.core.ImageMetadata;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.C14099q;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSkipCVVMode;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.CardBrandInfo;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.card.IkanoPrivateLabelVAPaymentParams;
import com.oppwa.mobile.connect.utils.StringUtils;
import java.util.regex.Pattern;

public class IkanoPrivateLabelVAPaymentInfoFragment extends PaymentInfoFragment {

    /* renamed from: p  reason: collision with root package name */
    private CardNumberInputLayout f120963p;

    /* renamed from: q  reason: collision with root package name */
    private DateInputLayout f120964q;

    /* renamed from: r  reason: collision with root package name */
    private InputLayout f120965r;

    /* renamed from: s  reason: collision with root package name */
    private int f120966s = 0;

    private void d(View view) {
        this.f120966s = getResources().getConfiguration().getLayoutDirection();
        this.f120963p = (CardNumberInputLayout) view.findViewById(R.id.number_input_layout);
        this.f120964q = (DateInputLayout) view.findViewById(R.id.expiry_date_input_layout);
        this.f120965r = (InputLayout) view.findViewById(R.id.verification_input_layout);
        h();
        i();
        j();
    }

    private PaymentParams e() {
        if (!k()) {
            return null;
        }
        try {
            return new IkanoPrivateLabelVAPaymentParams(this.f121052e.getCheckoutId(), f(), this.f120964q.getMonth(), this.f120964q.getYear(), g());
        } catch (PaymentException unused) {
            return null;
        }
    }

    private String f() {
        StringBuilder sb2 = new StringBuilder(this.f120963p.getEditText().getText());
        StringUtils.replaceNonstandardDigits(sb2);
        StringUtils.removeSubstring(sb2, " ");
        return sb2.toString();
    }

    private String g() {
        String text = this.f120965r.getText();
        if (TextUtils.isEmpty(text)) {
            return null;
        }
        return StringUtils.replaceNonstandardDigits(text);
    }

    private void h() {
        this.f120963p.setHint(getString(R.string.checkout_layout_hint_account_number));
        this.f120963p.setHelperText(getString(R.string.checkout_helper_account_number));
        this.f120963p.getEditText().setContentDescription(getString(R.string.checkout_layout_hint_account_number));
        this.f120963p.getEditText().setImeOptions(5);
        CardBrandInfo cardBrandInfo = new CardBrandInfo();
        C14099q.n nVar = new C14099q.n(Pattern.compile(cardBrandInfo.getValidation()), false, R.string.checkout_error_account_number_invalid);
        this.f120963p.setCardBrand(CheckoutConstants.PaymentBrands.IKANO_PRIVATE_LABEL_VA);
        this.f120963p.setNumberPatternAndValidator(cardBrandInfo.getPattern(), nVar);
        if (this.f120966s == 1) {
            this.f120963p.setGravityForRTLLanguages();
        }
    }

    private void i() {
        this.f120964q.setHint(getString(R.string.checkout_layout_hint_card_expiration_date));
        this.f120964q.getEditText().setContentDescription(getString(R.string.checkout_layout_hint_card_expiration_date));
        this.f120964q.setHelperText(getString(R.string.checkout_helper_expiration_date));
        this.f120964q.getEditText().setImeOptions(5);
        this.f120964q.setInputValidator(new C14099q.o(R.string.checkout_error_account_expiration_date_invalid, R.string.checkout_error_account_expired));
        if (this.f120966s == 1) {
            this.f120964q.setGravityForRTLLanguages();
        }
    }

    private void j() {
        if (this.f121052e.getSkipCVVMode() == CheckoutSkipCVVMode.ALWAYS) {
            this.f120965r.setVisibility(8);
            this.f120964q.getEditText().setImeOptions(6);
            return;
        }
        this.f120965r.getEditText().setInputType(ImageMetadata.LENS_FOCAL_LENGTH);
        this.f120965r.getEditText().setImeOptions(6);
        this.f120965r.setHint(getString(R.string.checkout_layout_hint_account_verification));
        this.f120965r.setHelperText(getString(R.string.checkout_helper_account_verification));
        this.f120965r.getEditText().setContentDescription(getString(R.string.checkout_layout_hint_account_verification));
        this.f120965r.getEditText().setFilters(new InputFilter[]{new InputFilter.LengthFilter(getResources().getInteger(R.integer.accountVerificationMaxLength))});
        if (this.f120966s == 1) {
            this.f120965r.setGravityForRTLLanguages();
        }
    }

    private boolean k() {
        boolean validate = this.f120963p.validate();
        if (!this.f120964q.validate()) {
            return false;
        }
        return validate;
    }

    /* access modifiers changed from: protected */
    public PaymentParams b() {
        return e();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.opp_fragment_ikano_private_label_va_payment_info, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        d(view);
    }
}
