package com.oppwa.mobile.connect.checkout.dialog.fragment;

import X4.a;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.fragment.app.C5191t;
import com.google.android.material.textfield.TextInputLayout;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.ImageLoader;
import com.oppwa.mobile.connect.checkout.dialog.view.CheckoutButton;
import com.oppwa.mobile.connect.checkout.uicomponent.PaymentDetailsUiComponentInteraction;
import com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding;
import com.oppwa.mobile.connect.databinding.OppLayoutPaymentInfoHeaderBinding;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Optional;

public abstract class PaymentDetailsFragment<T extends a> extends CheckoutFragment<T> {
    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        requireActivity().onBackPressed();
    }

    private void c() {
        C5191t requireActivity = requireActivity();
        View currentFocus = requireActivity.getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) requireActivity.getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            currentFocus.clearFocus();
        }
    }

    /* access modifiers changed from: protected */
    public void a(PaymentDetailsUiComponentInteraction paymentDetailsUiComponentInteraction, OppLayoutActionbarBinding oppLayoutActionbarBinding) {
        if (paymentDetailsUiComponentInteraction.shouldSkipPaymentMethodSelection()) {
            oppLayoutActionbarBinding.backButton.setVisibility(8);
        } else {
            oppLayoutActionbarBinding.backButton.setVisibility(0);
            oppLayoutActionbarBinding.backButton.setOnClickListener(new c(this));
        }
        oppLayoutActionbarBinding.title.setText(R.string.checkout_payment_details);
        oppLayoutActionbarBinding.closeButton.setOnClickListener(new d(paymentDetailsUiComponentInteraction));
    }

    public void onInputValidation(EditText editText, String str) {
        TextInputLayout a10 = a((View) editText);
        if (a10 != null) {
            a10.setError(str);
        } else {
            editText.setError(str);
        }
    }

    public void onViewVisibilityChange(View view, int i10) {
        TextInputLayout a10 = a(view);
        if (a10 != null) {
            a10.setVisibility(i10);
        } else {
            view.setVisibility(i10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(PaymentDetailsUiComponentInteraction paymentDetailsUiComponentInteraction, View view) {
        c();
        paymentDetailsUiComponentInteraction.submitPaymentDetails();
    }

    /* access modifiers changed from: protected */
    public void a(OppLayoutPaymentInfoHeaderBinding oppLayoutPaymentInfoHeaderBinding, String str) {
        Optional.ofNullable(a(str)).ifPresent(new g(oppLayoutPaymentInfoHeaderBinding));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(OppLayoutPaymentInfoHeaderBinding oppLayoutPaymentInfoHeaderBinding, Bitmap bitmap) {
        oppLayoutPaymentInfoHeaderBinding.getRoot().setVisibility(0);
        oppLayoutPaymentInfoHeaderBinding.loadingPanelPaymentInfoHeader.setVisibility(8);
        oppLayoutPaymentInfoHeaderBinding.logo.setImageBitmap(bitmap);
    }

    /* access modifiers changed from: protected */
    public void a(PaymentDetailsUiComponentInteraction paymentDetailsUiComponentInteraction, CheckoutButton checkoutButton) {
        String str;
        if (paymentDetailsUiComponentInteraction.isRegistrationOnly()) {
            str = getString(R.string.checkout_layout_text_register);
        } else if (paymentDetailsUiComponentInteraction.getCheckoutSettings().isTotalAmountRequired()) {
            str = (String) Optional.ofNullable(paymentDetailsUiComponentInteraction.getCheckoutInfo().getCurrencyCode()).map(new e(this, paymentDetailsUiComponentInteraction)).orElse(getString(R.string.checkout_layout_text_pay));
        } else {
            str = getString(R.string.checkout_layout_text_pay);
        }
        checkoutButton.setText(str);
        checkoutButton.setOnClickListener(new f(this, paymentDetailsUiComponentInteraction));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String a(PaymentDetailsUiComponentInteraction paymentDetailsUiComponentInteraction, String str) {
        return a(paymentDetailsUiComponentInteraction.getCheckoutInfo().getAmount(), str);
    }

    private String a(double d10, String str) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.getDefault());
        currencyInstance.setCurrency(Currency.getInstance(str));
        currencyInstance.setMaximumFractionDigits(2);
        currencyInstance.format(d10);
        return String.format(getString(R.string.checkout_layout_text_pay_amount), new Object[]{currencyInstance.format(d10)});
    }

    /* access modifiers changed from: protected */
    public void a(TextInputLayout textInputLayout, String str) {
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            editText.setOnFocusChangeListener(new b(textInputLayout, str));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(TextInputLayout textInputLayout, String str, View view, boolean z10) {
        if (textInputLayout.getError() != null) {
            return;
        }
        if (z10) {
            textInputLayout.setHelperText(str);
        } else {
            textInputLayout.setHelperText((CharSequence) null);
        }
    }

    private TextInputLayout a(View view) {
        ViewParent viewParent = (ViewParent) Optional.ofNullable(view.getParent()).map(new h()).orElse((Object) null);
        if (viewParent instanceof TextInputLayout) {
            return (TextInputLayout) viewParent;
        }
        return null;
    }

    private Bitmap a(String str) {
        return ImageLoader.getInstance(requireContext()).getImage(str);
    }
}
