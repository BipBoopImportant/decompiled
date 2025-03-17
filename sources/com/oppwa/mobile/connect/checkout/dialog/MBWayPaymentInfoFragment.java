package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.ar.core.ImageMetadata;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.meta.MbWayConfig;
import com.oppwa.mobile.connect.checkout.uicomponent.util.InputFormatter;
import com.oppwa.mobile.connect.databinding.OppFragmentMbwayPaymentInfoBinding;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.mbway.MBWayPaymentParams;
import com.oppwa.mobile.connect.utils.Logger;
import java.util.Optional;
import org.slf4j.Marker;

public class MBWayPaymentInfoFragment extends PaymentInfoFragment {
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static final InputFilter[] f121024r = new InputFilter[0];

    /* renamed from: p  reason: collision with root package name */
    private OppFragmentMbwayPaymentInfoBinding f121025p;

    /* renamed from: q  reason: collision with root package name */
    private MbWayConfig f121026q;

    class a implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditText f121027a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InputFormatter f121028b;

        a(EditText editText, InputFormatter inputFormatter) {
            this.f121027a = editText;
            this.f121028b = inputFormatter;
        }

        public void afterTextChanged(Editable editable) {
            this.f121027a.removeTextChangedListener(this);
            InputFilter[] filters = editable.getFilters();
            editable.setFilters(MBWayPaymentInfoFragment.f121024r);
            this.f121028b.applyMask(editable);
            this.f121027a.setText(editable);
            this.f121027a.setSelection(editable.length());
            editable.setFilters(filters);
            this.f121027a.addTextChangedListener(this);
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    private void a(EditText editText) {
        editText.addTextChangedListener(new a(editText, new InputFormatter(InputFormatter.PHONE_COUNTRY_CODE_MASK)));
    }

    private String f() {
        MbWayConfig k10 = k();
        return a(k10.isCountryCodeDisplayed() ? this.f121025p.countryCodeInputLayout.getText() : k10.getCountryCode());
    }

    private String g() {
        return this.f121025p.mobilePhoneInputLayout.getText();
    }

    private String h() {
        return getString(R.string.checkout_layout_text_push_notification_sent) + System.lineSeparator() + getString(R.string.checkout_layout_text_accept_mbway_pin);
    }

    private boolean i() {
        boolean z10 = !k().isCountryCodeDisplayed() || this.f121025p.countryCodeInputLayout.validate();
        if (!this.f121025p.mobilePhoneInputLayout.validate()) {
            return false;
        }
        return z10;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ MbWayConfig j() {
        MbWayConfig mbWayConfig = (MbWayConfig) Optional.ofNullable(this.f121052e.getMbWayConfig()).orElse(new MbWayConfig());
        this.f121026q = mbWayConfig;
        return mbWayConfig;
    }

    private MbWayConfig k() {
        return (MbWayConfig) Optional.ofNullable(this.f121026q).orElseGet(new Y1(this));
    }

    private void l() {
        this.f121025p.mobilePhoneInputLayout.requestFocus();
        ((InputMethodManager) requireActivity().getSystemService("input_method")).showSoftInput(this.f121025p.mobilePhoneInputLayout.getEditText(), 0);
    }

    private void m() {
        a(this.f121025p.countryCodeInputLayout.getEditText());
        this.f121025p.countryCodeInputLayout.getEditText().setFilters(new InputFilter[]{new InputFilter.LengthFilter(getResources().getInteger(R.integer.countryCodeMaxLegth))});
        this.f121025p.countryCodeInputLayout.getEditText().setInputType(ImageMetadata.LENS_FOCAL_LENGTH);
        this.f121025p.countryCodeInputLayout.setInputValidator(C14099q.a(R.string.checkout_error_phone_country_code_invalid));
        this.f121025p.countryCodeInputLayout.setText(k().getCountryCode());
        this.f121025p.countryCodeInputLayout.setVisibility(0);
    }

    private void n() {
        if (k().isCountryCodeDisplayed()) {
            this.f121025p.countryCodeInputLayout.setHint(getString(R.string.checkout_layout_hint_country_code));
        }
        this.f121025p.mobilePhoneInputLayout.setHint(getString(R.string.checkout_layout_hint_phone_number));
    }

    private void o() {
        this.f121025p.mobilePhoneInputLayout.getEditText().setFilters(new InputFilter[]{new InputFilter.LengthFilter(getResources().getInteger(R.integer.mobilePhoneNumberMaxLength))});
        this.f121025p.mobilePhoneInputLayout.getEditText().setInputType(ImageMetadata.LENS_FOCAL_LENGTH);
        this.f121025p.mobilePhoneInputLayout.getEditText().setImeOptions(6);
        this.f121025p.mobilePhoneInputLayout.setInputValidator(C14099q.g());
    }

    /* access modifiers changed from: protected */
    public PaymentParams b() {
        if (!i()) {
            return null;
        }
        try {
            return new MBWayPaymentParams(this.f121052e.getCheckoutId(), f(), g());
        } catch (PaymentException e10) {
            Logger.error((Throwable) e10);
            return null;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OppFragmentMbwayPaymentInfoBinding inflate = OppFragmentMbwayPaymentInfoBinding.inflate(layoutInflater, viewGroup, false);
        this.f121025p = inflate;
        return inflate.getRoot();
    }

    public void onStart() {
        super.onStart();
        n();
        l();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (k().isCountryCodeDisplayed()) {
            m();
        }
        o();
        this.f121025p.notificationTextView.setText(h());
    }

    /* access modifiers changed from: protected */
    public String a(String str) {
        String replace = str.replace(Marker.ANY_NON_NULL_MARKER, "");
        if (replace.startsWith("00")) {
            return replace;
        }
        return "00" + replace;
    }
}
