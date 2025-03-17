package com.oppwa.mobile.connect.checkout.uicomponent.card.token;

import android.widget.EditText;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSkipCVVMode;
import com.oppwa.mobile.connect.checkout.uicomponent.PaymentDetailsUiComponentContainer;
import com.oppwa.mobile.connect.checkout.uicomponent.util.validator.CardSecurityCodeValidator;
import com.oppwa.mobile.connect.checkout.uicomponent.util.view.CardSecurityCodeEditTextWrapper;
import com.oppwa.mobile.connect.checkout.uicomponent.util.view.EditTextWrapper;
import com.oppwa.mobile.connect.payment.CVVMode;
import com.oppwa.mobile.connect.payment.CardBrandInfo;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.token.Card;
import com.oppwa.mobile.connect.payment.token.TokenPaymentParams;
import java.util.Optional;

public class CardTokenUiComponentContainer extends PaymentDetailsUiComponentContainer<CardTokenUiComponent> implements CardTokenUiComponentInteraction {

    /* renamed from: i  reason: collision with root package name */
    private EditTextWrapper f121530i;

    /* renamed from: j  reason: collision with root package name */
    private Integer f121531j;

    private void a(CardBrandInfo cardBrandInfo) {
        EditText cardSecurityCodeEditText = ((CardTokenUiComponent) j()).getCardSecurityCodeEditText();
        CheckoutSkipCVVMode skipCVVMode = getCheckoutSettings().getSkipCVVMode();
        if (a(cardBrandInfo, skipCVVMode)) {
            this.f121530i = new CardSecurityCodeEditTextWrapper(cardSecurityCodeEditText).setInputValidator(new CardSecurityCodeValidator(requireContext(), new b(this, cardSecurityCodeEditText), cardBrandInfo.getCvvLength(), cardBrandInfo.getCvvMode() == CVVMode.OPTIONAL && (skipCVVMode == CheckoutSkipCVVMode.ALWAYS || skipCVVMode == CheckoutSkipCVVMode.FOR_STORED_CARDS)));
        } else {
            ((CardTokenUiComponent) j()).onViewVisibilityChange(cardSecurityCodeEditText, 8);
        }
    }

    private String u() {
        return (String) Optional.ofNullable(this.f121530i).map(new c()).orElse((Object) null);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException v() {
        return new IllegalStateException("Missing card token.");
    }

    public String getBrand() {
        return s();
    }

    public Card getCard() {
        return (Card) Optional.ofNullable(t().getCard()).orElseThrow(new d());
    }

    public Integer[] getInstallmentOptions() {
        return getCheckoutSettings().getInstallmentOptions();
    }

    /* access modifiers changed from: protected */
    public void i() {
        a(r().getCardBrandInfo(s()));
        ((CardTokenUiComponent) j()).onUiComponentCreated(this);
    }

    /* access modifiers changed from: protected */
    public PaymentParams m() {
        TokenPaymentParams tokenPaymentParams = new TokenPaymentParams(getCheckoutSettings().getCheckoutId(), t().getTokenId(), s(), u());
        if (getCheckoutSettings().isInstallmentEnabled()) {
            tokenPaymentParams.setNumberOfInstallments(this.f121531j);
        }
        return tokenPaymentParams;
    }

    /* access modifiers changed from: protected */
    public boolean n() {
        return ((Boolean) Optional.ofNullable(this.f121530i).map(new a()).orElse(Boolean.TRUE)).booleanValue();
    }

    public void setNumberOfInstallments(int i10) {
        this.f121531j = Integer.valueOf(i10);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(EditText editText, String str) {
        ((CardTokenUiComponent) j()).onInputValidation(editText, str);
    }

    private boolean a(CardBrandInfo cardBrandInfo, CheckoutSkipCVVMode checkoutSkipCVVMode) {
        return checkoutSkipCVVMode == CheckoutSkipCVVMode.NEVER && (cardBrandInfo.getCvvMode() == CVVMode.REQUIRED || cardBrandInfo.getCvvMode() == CVVMode.OPTIONAL);
    }
}
