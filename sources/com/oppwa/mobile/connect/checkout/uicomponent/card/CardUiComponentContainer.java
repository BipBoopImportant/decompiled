package com.oppwa.mobile.connect.checkout.uicomponent.card;

import android.text.TextUtils;
import android.widget.EditText;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import com.google.ar.core.ImageMetadata;
import com.oppwa.mobile.connect.checkout.meta.CardIOActivityResultContract;
import com.oppwa.mobile.connect.checkout.meta.CheckoutBrandDetectionType;
import com.oppwa.mobile.connect.checkout.meta.CheckoutStorePaymentDetailsMode;
import com.oppwa.mobile.connect.checkout.uicomponent.PaymentDetailsUiComponentContainer;
import com.oppwa.mobile.connect.checkout.uicomponent.card.CardUiViewModel;
import com.oppwa.mobile.connect.checkout.uicomponent.util.InputFormatter;
import com.oppwa.mobile.connect.checkout.uicomponent.util.validator.CardExpiryDateValidator;
import com.oppwa.mobile.connect.checkout.uicomponent.util.validator.CardHolderValidator;
import com.oppwa.mobile.connect.checkout.uicomponent.util.validator.CardNumberValidator;
import com.oppwa.mobile.connect.checkout.uicomponent.util.validator.CardSecurityCodeValidator;
import com.oppwa.mobile.connect.checkout.uicomponent.util.validator.PhoneCountryCodeValidator;
import com.oppwa.mobile.connect.checkout.uicomponent.util.validator.PhoneNumberValidator;
import com.oppwa.mobile.connect.checkout.uicomponent.util.view.CardSecurityCodeEditTextWrapper;
import com.oppwa.mobile.connect.checkout.uicomponent.util.view.EditTextWrapper;
import com.oppwa.mobile.connect.core.nfc.NfcUtils;
import com.oppwa.mobile.connect.core.nfc.model.CardDetails;
import com.oppwa.mobile.connect.core.nfc.ui.NfcCardReaderActivityResultContract;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.CVVMode;
import com.oppwa.mobile.connect.payment.CardBrandInfo;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.card.CardPaymentParams;
import com.oppwa.mobile.connect.utils.LibraryHelper;
import g.C5314c;
import io.card.payment.CreditCard;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class CardUiComponentContainer extends PaymentDetailsUiComponentContainer<CardUiComponent> implements CardUiComponentInteraction {

    /* renamed from: i  reason: collision with root package name */
    private final C5314c<Void> f121490i = registerForActivityResult(new CardIOActivityResultContract(), new k(this));

    /* renamed from: j  reason: collision with root package name */
    private final C5314c<Void> f121491j = registerForActivityResult(new NfcCardReaderActivityResultContract(), new b(this));

    /* renamed from: k  reason: collision with root package name */
    private final List<EditTextWrapper> f121492k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    private CardUiViewModel f121493l;

    /* renamed from: m  reason: collision with root package name */
    private EditTextWrapper f121494m;

    /* renamed from: n  reason: collision with root package name */
    private EditTextWrapper f121495n;

    /* renamed from: o  reason: collision with root package name */
    private EditTextWrapper f121496o;

    /* renamed from: p  reason: collision with root package name */
    private EditTextWrapper f121497p;

    /* renamed from: q  reason: collision with root package name */
    private EditTextWrapper f121498q;

    /* renamed from: r  reason: collision with root package name */
    private EditTextWrapper f121499r;

    /* renamed from: s  reason: collision with root package name */
    private String f121500s;

    /* renamed from: t  reason: collision with root package name */
    private Integer f121501t;

    /* renamed from: u  reason: collision with root package name */
    private CardBrandInfo f121502u = new CardBrandInfo();

    /* renamed from: v  reason: collision with root package name */
    private boolean f121503v;

    private String A() {
        EditTextWrapper editTextWrapper = this.f121498q;
        if (editTextWrapper != null) {
            return a(editTextWrapper);
        }
        return null;
    }

    private String B() {
        EditTextWrapper editTextWrapper = this.f121499r;
        if (editTextWrapper != null) {
            return a(editTextWrapper);
        }
        return null;
    }

    private boolean C() {
        boolean z10 = true;
        for (EditTextWrapper next : this.f121492k) {
            next.validateInput();
            if (!next.isInputValid()) {
                z10 = false;
            }
        }
        return z10;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PaymentException E() {
        return new PaymentException(PaymentError.getUiComponentError("Missing card number."));
    }

    private String F() {
        return (String) Optional.ofNullable(this.f121494m.getInput()).orElseThrow(new f());
    }

    private void G() {
        EditText cardExpiryDateEditText = ((CardUiComponent) j()).getCardExpiryDateEditText();
        if (this.f121496o == null) {
            this.f121496o = new EditTextWrapper(cardExpiryDateEditText, ImageMetadata.LENS_FOCAL_LENGTH).setInputMask(InputFormatter.CARD_EXPIRY_DATE_MASK).setMaxLength(9);
        }
        this.f121496o.setInputValidator(new CardExpiryDateValidator(requireContext(), new g(this, cardExpiryDateEditText), this.f121502u.isExpiryDateOptional(), getCheckoutSettings().isCardExpiryDateValidationDisabled())).applyChanges();
        this.f121492k.add(this.f121496o);
    }

    private void H() {
        EditText cardHolderEditText = ((CardUiComponent) j()).getCardHolderEditText();
        if (this.f121495n == null) {
            this.f121495n = new EditTextWrapper(cardHolderEditText, ImageMetadata.LENS_FILTER_DENSITY);
        }
        if (getCheckoutSettings().isCardHolderVisible()) {
            this.f121495n.setMaxLength(128).setInputValidator(new CardHolderValidator(requireContext(), new d(this, cardHolderEditText)));
            this.f121492k.add(this.f121495n);
            return;
        }
        ((CardUiComponent) j()).onViewVisibilityChange(cardHolderEditText, 8);
    }

    private void I() {
        EditText cardNumberEditText = ((CardUiComponent) j()).getCardNumberEditText();
        if (this.f121494m == null) {
            this.f121494m = new EditTextWrapper(cardNumberEditText, ImageMetadata.LENS_FOCAL_LENGTH).setMaxLength(40).setInputWatcher(new h(this));
        }
        this.f121494m.setInputMask(y()).setInputValidator(new CardNumberValidator(requireContext(), new i(this, cardNumberEditText), this.f121502u.getValidation(), this.f121502u.isLuhnCheckRequired())).applyChanges();
        this.f121492k.add(this.f121494m);
    }

    private void J() {
        EditText cardSecurityCodeEditText = ((CardUiComponent) j()).getCardSecurityCodeEditText();
        if (this.f121497p == null) {
            this.f121497p = new CardSecurityCodeEditTextWrapper(cardSecurityCodeEditText);
        }
        if (this.f121502u.getCvvMode() == CVVMode.NONE) {
            ((CardUiComponent) j()).onViewVisibilityChange(cardSecurityCodeEditText, 8);
            return;
        }
        this.f121497p.setInputValidator(new CardSecurityCodeValidator(requireContext(), new e(this, cardSecurityCodeEditText), this.f121502u.getCvvLength(), this.f121502u.getCvvMode() == CVVMode.OPTIONAL)).applyChanges();
        this.f121492k.add(this.f121497p);
        ((CardUiComponent) j()).onViewVisibilityChange(cardSecurityCodeEditText, 0);
    }

    private void K() {
        this.f121492k.clear();
        I();
        H();
        G();
        J();
        EditText phoneCountryCodeEditText = ((CardUiComponent) j()).getPhoneCountryCodeEditText();
        EditText phoneNumberEditText = ((CardUiComponent) j()).getPhoneNumberEditText();
        if (phoneCountryCodeEditText != null && phoneNumberEditText != null) {
            a(phoneCountryCodeEditText);
            b(phoneNumberEditText);
        }
    }

    private void L() {
        CardUiViewModel cardUiViewModel = (CardUiViewModel) new i0((k0) this, (i0.c) new CardUiViewModel.Factory(requireContext().getApplicationContext(), getCheckoutSettings(), r())).a(CardUiViewModel.class);
        this.f121493l = cardUiViewModel;
        cardUiViewModel.getDetectedCardBrandsLiveData().observe(this, new c(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(EditText editText, String str) {
        ((CardUiComponent) j()).onInputValidation(editText, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(EditText editText, String str) {
        ((CardUiComponent) j()).onInputValidation(editText, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(EditText editText, String str) {
        ((CardUiComponent) j()).onInputValidation(editText, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(EditText editText, String str) {
        ((CardUiComponent) j()).onInputValidation(editText, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(EditText editText, String str) {
        ((CardUiComponent) j()).onInputValidation(editText, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(EditText editText, String str) {
        ((CardUiComponent) j()).onInputValidation(editText, str);
    }

    private CardPaymentParams u() {
        CardPaymentParams cardPaymentParams = new CardPaymentParams(getCheckoutSettings().getCheckoutId(), this.f121500s, F(), x(), v(), w(), z());
        cardPaymentParams.setTokenizationEnabled(D());
        cardPaymentParams.setBillingAddress(getCheckoutSettings().getBillingAddress());
        cardPaymentParams.setCountryCode(A());
        cardPaymentParams.setMobilePhone(B());
        if (getCheckoutSettings().isInstallmentEnabled()) {
            cardPaymentParams.setNumberOfInstallments(this.f121501t);
        }
        return cardPaymentParams;
    }

    private String v() {
        return CardExpiryDateValidator.extractMonth(this.f121496o.getInput());
    }

    private String w() {
        return CardExpiryDateValidator.extractYear(this.f121496o.getInput());
    }

    private String x() {
        return a(this.f121495n);
    }

    private String y() {
        return a(this.f121500s).getPattern();
    }

    private String z() {
        return a(this.f121497p);
    }

    /* access modifiers changed from: protected */
    public boolean D() {
        if (isRegistrationOnly() || getCheckoutSettings().getStorePaymentDetailsMode() != CheckoutStorePaymentDetailsMode.ALWAYS) {
            return this.f121503v;
        }
        return true;
    }

    public String getCardBrand() {
        return this.f121500s;
    }

    /* access modifiers changed from: protected */
    public void i() {
        L();
        String s10 = s();
        this.f121500s = s10;
        if ("CARD".equals(s10)) {
            this.f121500s = null;
        }
        c(this.f121500s);
        ((CardUiComponent) j()).onUiComponentCreated(this);
        ((CardUiComponent) j()).onCardBrandChange(this.f121500s);
    }

    public boolean isCardScanningAvailable() {
        return NfcUtils.isNfcAvailable(requireContext()) || LibraryHelper.isCardIOAvailable;
    }

    /* access modifiers changed from: protected */
    public PaymentParams m() {
        return u();
    }

    /* access modifiers changed from: protected */
    public boolean n() {
        return C();
    }

    public void scanCard() {
        if (NfcUtils.isNfcAvailable(requireContext())) {
            this.f121491j.a(null);
        } else if (LibraryHelper.isCardIOAvailable) {
            this.f121490i.a(null);
        }
    }

    public void setCardBrand(String str) {
        if (!TextUtils.equals(this.f121500s, str)) {
            this.f121500s = str;
            c(str);
            requireArguments().putString(PaymentDetailsUiComponentContainer.ARG_PAYMENT_BRAND, str);
            ((CardUiComponent) j()).onCardBrandChange(str);
        }
    }

    public void setNumberOfInstallments(int i10) {
        this.f121501t = Integer.valueOf(i10);
    }

    public void setTokenizationEnabled(boolean z10) {
        this.f121503v = z10;
    }

    private void a(EditText editText) {
        if (this.f121498q == null) {
            this.f121498q = new EditTextWrapper(editText, ImageMetadata.LENS_FOCAL_LENGTH).setInputMask(InputFormatter.PHONE_COUNTRY_CODE_MASK).setInputValidator(new PhoneCountryCodeValidator(requireContext(), new a(this, editText))).setMaxLength(6);
        }
        if (this.f121502u.isMobilePhoneRequired()) {
            this.f121492k.add(this.f121498q);
            ((CardUiComponent) j()).onViewVisibilityChange(editText, 0);
            return;
        }
        ((CardUiComponent) j()).onViewVisibilityChange(editText, 8);
    }

    private void b(EditText editText) {
        if (this.f121499r == null) {
            this.f121499r = new EditTextWrapper(editText, ImageMetadata.LENS_FOCAL_LENGTH).setInputMask(InputFormatter.PHONE_NUMBER_MASK).setInputValidator(new PhoneNumberValidator(requireContext(), new j(this, editText))).setMaxLength(25);
        }
        if (this.f121502u.isMobilePhoneRequired()) {
            this.f121492k.add(this.f121499r);
            ((CardUiComponent) j()).onViewVisibilityChange(editText, 0);
            return;
        }
        ((CardUiComponent) j()).onViewVisibilityChange(editText, 8);
    }

    private void c(String str) {
        this.f121502u = a(str);
        K();
    }

    private String a(EditTextWrapper editTextWrapper) {
        if (this.f121492k.contains(editTextWrapper)) {
            return editTextWrapper.getInput();
        }
        return null;
    }

    /* access modifiers changed from: private */
    public void b(String str) {
        if (getCheckoutSettings().getBrandDetectionType() != CheckoutBrandDetectionType.BINLIST) {
            this.f121493l.detectCardBrandsByRegex(str);
        } else if (str.length() >= 8) {
            this.f121493l.detectCardBrandsByBin(str.substring(0, 8));
        }
    }

    /* access modifiers changed from: private */
    public void a(Set<String> set) {
        if (set.isEmpty()) {
            setCardBrand((String) null);
        } else if (!set.contains(this.f121500s)) {
            setCardBrand(set.iterator().next());
        }
        ((CardUiComponent) j()).onCardBrandDetection(set);
    }

    /* access modifiers changed from: private */
    public void b(CreditCard creditCard) {
        if (creditCard != null) {
            ((CardUiComponent) j()).getCardNumberEditText().setText(creditCard.getFormattedCardNumber());
            ((CardUiComponent) j()).getCardExpiryDateEditText().setText(a(creditCard));
        }
    }

    private String a(CreditCard creditCard) {
        if (!creditCard.isExpiryValid()) {
            return "";
        }
        return new DecimalFormat("00").format((long) creditCard.expiryMonth) + creditCard.expiryYear;
    }

    private String a(CardDetails cardDetails) {
        String expiryMonth = cardDetails.getExpiryMonth();
        String expiryYear = cardDetails.getExpiryYear();
        if (expiryMonth == null || expiryYear == null) {
            return "";
        }
        return expiryMonth + expiryYear;
    }

    /* access modifiers changed from: private */
    public void b(CardDetails cardDetails) {
        if (cardDetails != null) {
            ((CardUiComponent) j()).getCardNumberEditText().setText(cardDetails.getPan());
            ((CardUiComponent) j()).getCardExpiryDateEditText().setText(a(cardDetails));
        }
    }

    private CardBrandInfo a(String str) {
        if (str != null) {
            return r().getCardBrandInfo(str);
        }
        return new CardBrandInfo();
    }
}
