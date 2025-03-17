package com.oppwa.mobile.connect.checkout.dialog;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.ar.core.ImageMetadata;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.C14060d;
import com.oppwa.mobile.connect.checkout.dialog.C14099q;
import com.oppwa.mobile.connect.checkout.dialog.InputLayout;
import com.oppwa.mobile.connect.checkout.meta.CardIOActivityResultContract;
import com.oppwa.mobile.connect.checkout.meta.CheckoutBrandDetectionAppearanceStyle;
import com.oppwa.mobile.connect.checkout.meta.CheckoutBrandDetectionType;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSkipCVVMode;
import com.oppwa.mobile.connect.core.nfc.NfcUtils;
import com.oppwa.mobile.connect.core.nfc.model.CardDetails;
import com.oppwa.mobile.connect.core.nfc.ui.NfcCardReaderActivityResultContract;
import com.oppwa.mobile.connect.databinding.OppFragmentCardPaymentInfoBinding;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.BillingAddress;
import com.oppwa.mobile.connect.payment.CVVMode;
import com.oppwa.mobile.connect.payment.CardBrandInfo;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.card.CardPaymentParams;
import com.oppwa.mobile.connect.payment.token.Token;
import com.oppwa.mobile.connect.payment.token.TokenPaymentParams;
import com.oppwa.mobile.connect.provider.OppPaymentProvider;
import com.oppwa.mobile.connect.utils.LibraryHelper;
import com.oppwa.mobile.connect.utils.StringUtils;
import g.C5314c;
import io.card.payment.CreditCard;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Marker;

public class CardPaymentInfoFragment extends PaymentInfoFragmentWithTokenization implements C14060d.a {

    /* renamed from: A  reason: collision with root package name */
    private CardPaymentParams f120879A;

    /* renamed from: q  reason: collision with root package name */
    private final C5314c<Void> f120880q = registerForActivityResult(new CardIOActivityResultContract(), new C14095o1(this));

    /* renamed from: r  reason: collision with root package name */
    private final C5314c<Void> f120881r = registerForActivityResult(new NfcCardReaderActivityResultContract(), new C14098p1(this));
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public OppFragmentCardPaymentInfoBinding f120882s;

    /* renamed from: t  reason: collision with root package name */
    private OppPaymentProvider f120883t;

    /* renamed from: u  reason: collision with root package name */
    private String f120884u;

    /* renamed from: v  reason: collision with root package name */
    private String f120885v = null;

    /* renamed from: w  reason: collision with root package name */
    private StringBuilder f120886w = new StringBuilder();

    /* renamed from: x  reason: collision with root package name */
    private CardBrandInfo f120887x;

    /* renamed from: y  reason: collision with root package name */
    private BillingAddress f120888y = null;

    /* renamed from: z  reason: collision with root package name */
    private int f120889z = 0;

    class b implements TextWatcher {
        b() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (CardPaymentInfoFragment.this.f120882s.countryCodeInputLayout.getEditText().length() == 0) {
                CardPaymentInfoFragment.this.f120882s.countryCodeInputLayout.getEditText().setText(Marker.ANY_NON_NULL_MARKER);
                CardPaymentInfoFragment.this.f120882s.countryCodeInputLayout.setSelectionAtTheEnd();
            }
        }
    }

    class c implements InputLayout.d {
        c() {
        }

        public void a(Editable editable) {
        }

        public void a(boolean z10) {
            if (z10) {
                CardPaymentInfoFragment cardPaymentInfoFragment = CardPaymentInfoFragment.this;
                cardPaymentInfoFragment.d((View) cardPaymentInfoFragment.f120882s.expiryDateInputLayout);
            }
        }
    }

    class d implements InputLayout.d {
        d() {
        }

        public void a(Editable editable) {
        }

        public void a(boolean z10) {
            if (z10) {
                CardPaymentInfoFragment cardPaymentInfoFragment = CardPaymentInfoFragment.this;
                cardPaymentInfoFragment.d((View) cardPaymentInfoFragment.f120882s.cvvInputLayout);
            }
        }
    }

    private boolean H() {
        return this.f121052e.isCardExpiryDateValidationDisabled();
    }

    private boolean I() {
        return !this.f121052e.isCardHolderVisible();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void J() {
        c(this.f120886w);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void K() {
        this.f120882s.numberInputLayout.clearFocus();
        this.f120882s.numberInputLayout.requestFocus();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void L() {
        Bitmap image = ImageLoader.getInstance(requireContext()).getImage(this.f121055h);
        if (image != null) {
            this.f120882s.icBrand.cardBrandLogo.setImageBitmap(image);
        }
    }

    private void M() {
        this.f120882s.cardBrandSelectionLayout.hide(false);
        ((InputMethodManager) requireActivity().getSystemService("input_method")).hideSoftInputFromWindow(this.f120882s.numberInputLayout.getEditText().getWindowToken(), 0);
        this.f120882s.paymentInfoScrollView.clearFocus();
    }

    private void N() {
        E();
        p();
        O();
    }

    private void O() {
        if (!this.f121055h.equalsIgnoreCase(this.f120884u)) {
            d(this.f120884u);
        }
    }

    private void P() {
        requireActivity().runOnUiThread(new C14058c1(this));
    }

    private void Q() {
        this.f120882s.icBrand.expandBrandSelectionImageview.setImageResource(R.drawable.collapse);
        this.f120882s.icBrand.expandBrandSelectionImageview.setTag("Collapse");
    }

    private void R() {
        this.f120882s.icBrand.expandBrandSelectionImageview.setImageResource(R.drawable.expand);
        this.f120882s.icBrand.expandBrandSelectionImageview.setTag("Expand");
    }

    private void S() {
        this.f120882s.numberInputLayout.setListener(new a());
    }

    private void T() {
        this.f120882s.numberInputLayout.getEditText().setOnEditorActionListener(new C14080j1(this));
    }

    private void U() {
        if (this.f121052e.getBrandDetectionAppearanceStyle() != CheckoutBrandDetectionAppearanceStyle.NONE) {
            if (this.f121052e.getBrandDetectionAppearanceStyle() == CheckoutBrandDetectionAppearanceStyle.INACTIVE) {
                Q();
            }
            this.f120882s.cardBrandSelectionLayout.show();
        }
    }

    private void V() {
        if (this.f120882s.icBrand.expandBrandSelectionImageview.getVisibility() == 8) {
            CardNumberInputLayout cardNumberInputLayout = this.f120882s.numberInputLayout;
            cardNumberInputLayout.setPaddingStart(cardNumberInputLayout.getPaddingStart() + this.f120882s.icBrand.expandBrandSelectionImageview.getDrawable().getIntrinsicWidth());
            this.f120882s.icBrand.expandBrandSelectionImageview.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public void W() {
        if (this.f121052e.getBrandDetectionAppearanceStyle() == CheckoutBrandDetectionAppearanceStyle.INACTIVE) {
            V();
        } else if (this.f121052e.getBrandDetectionAppearanceStyle() == CheckoutBrandDetectionAppearanceStyle.ACTIVE) {
            U();
        }
    }

    private boolean X() {
        boolean z10 = I() || this.f120882s.holderInputLayout.validate();
        if (!this.f120882s.numberInputLayout.validate()) {
            z10 = false;
        }
        if (!H() && !this.f120882s.expiryDateInputLayout.validate()) {
            z10 = false;
        }
        if (!G() && !this.f120882s.cvvInputLayout.validate()) {
            z10 = false;
        }
        if (this.f120887x.isMobilePhoneRequired()) {
            if (!this.f120882s.countryCodeInputLayout.validate()) {
                z10 = false;
            }
            if (!this.f120882s.phoneNumberInputLayout.validate()) {
                z10 = false;
            }
        }
        BillingAddress billingAddress = this.f120888y;
        if (billingAddress == null || BillingAddressHelper.checkMandatoryFieldsArePreconfigured(billingAddress)) {
            return z10;
        }
        return false;
    }

    private void d(String str) {
        this.f121055h = str;
        this.f120887x = this.f121054g.getCardBrandInfo(str);
        if (!H()) {
            this.f120882s.expiryDateInputLayout.setOptional(this.f120887x.isExpiryDateOptional());
        }
        P();
        this.f120882s.numberInputLayout.setCardBrand(str);
        this.f120882s.numberInputLayout.setBrandDetected(b(str));
        this.f120882s.numberInputLayout.setNumberPatternAndValidator(this.f120887x.getPattern(), i());
        v();
        h();
        g();
    }

    private boolean e(String str) {
        long length = (long) str.length();
        return (length == 6 || length == 8) && !C14060d.b().c(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(View view) {
        int e10 = e((View) this.f121060m);
        int e11 = e(view);
        if (e10 < view.getHeight() + e11) {
            this.f120882s.paymentInfoScrollView.scrollBy(0, (e11 + view.getHeight()) - e10);
        }
    }

    private void g() {
        if (this.f120887x.isMobilePhoneRequired()) {
            if (this.f120889z == 1) {
                this.f120882s.countryCodeAndPhoneNumber.setLayoutDirection(0);
                this.f120882s.countryCodeInputLayout.setGravityForRTLLanguages();
                this.f120882s.phoneNumberInputLayout.setGravityForRTLLanguages();
            }
            u();
            A();
            return;
        }
        this.f120882s.countryCodeInputLayout.setVisibility(8);
        this.f120882s.phoneNumberInputLayout.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        if (this.f120882s.icBrand.expandBrandSelectionImageview.getVisibility() != 0) {
            return;
        }
        if (this.f120882s.cardBrandSelectionLayout.isVisible()) {
            o();
        } else {
            U();
        }
    }

    private C14099q.n i() {
        return new C14099q.n(this.f121052e.getBrandDetectionType() == CheckoutBrandDetectionType.REGEX ? this.f121054g.getCardValidationPattern(this.f121055h) : null, this.f120887x.isLuhnCheckRequired(), R.string.checkout_error_card_number_invalid);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void j(View view) {
        this.f120880q.a(null);
    }

    private PaymentParams k() {
        if (!G() && !this.f120882s.cvvInputLayout.validate()) {
            return null;
        }
        try {
            TokenPaymentParams tokenPaymentParams = new TokenPaymentParams(this.f121052e.getCheckoutId(), this.f121056i.getTokenId(), this.f121055h, l());
            if (this.f121052e.isInstallmentEnabled()) {
                tokenPaymentParams.setNumberOfInstallments((Integer) this.f120882s.numberOfInstallmentsLayout.numberOfInstallmentsSpinner.getSelectedItem());
            }
            return tokenPaymentParams;
        } catch (PaymentException unused) {
            return null;
        }
    }

    private String l() {
        if (G() || (this.f120887x.getCvvMode() == CVVMode.OPTIONAL && this.f120882s.cvvInputLayout.isEmpty())) {
            return null;
        }
        return StringUtils.replaceNonstandardDigits(this.f120882s.cvvInputLayout.getText());
    }

    private String m() {
        if ((this.f120887x.isExpiryDateOptional() || H()) && this.f120882s.expiryDateInputLayout.isEmpty()) {
            return null;
        }
        return this.f120882s.expiryDateInputLayout.getMonth();
    }

    private String n() {
        if ((this.f120887x.isExpiryDateOptional() || H()) && this.f120882s.expiryDateInputLayout.isEmpty()) {
            return null;
        }
        return this.f120882s.expiryDateInputLayout.getYear();
    }

    /* access modifiers changed from: private */
    public void o() {
        if (this.f121052e.getBrandDetectionAppearanceStyle() == CheckoutBrandDetectionAppearanceStyle.INACTIVE) {
            R();
        }
        this.f120882s.cardBrandSelectionLayout.hide();
    }

    private void p() {
        if (this.f121052e.getBrandDetectionAppearanceStyle() == CheckoutBrandDetectionAppearanceStyle.INACTIVE) {
            q();
        }
        o();
    }

    private void q() {
        if (this.f120882s.icBrand.expandBrandSelectionImageview.getVisibility() == 0) {
            CardNumberInputLayout cardNumberInputLayout = this.f120882s.numberInputLayout;
            cardNumberInputLayout.setPaddingStart(cardNumberInputLayout.getPaddingStart() - this.f120882s.icBrand.expandBrandSelectionImageview.getDrawable().getIntrinsicWidth());
            this.f120882s.icBrand.expandBrandSelectionImageview.setVisibility(8);
        }
    }

    private void r() {
        if (this.f120888y != null) {
            this.f120882s.billingAddressLayout.setVisibility(0);
            if (BillingAddressHelper.checkMandatoryFieldsArePreconfigured(this.f120888y)) {
                String mergedBillingAddressData = BillingAddressHelper.getMergedBillingAddressData(this.f120888y);
                if (!mergedBillingAddressData.isEmpty()) {
                    this.f120882s.billingAddressLayout.changeStyleOfBillingAddress(R.attr.checkoutSecondaryTextViewStyle);
                    this.f120882s.billingAddressLayout.showBillingAddress(mergedBillingAddressData);
                } else {
                    this.f120882s.billingAddressLayout.changeStyleOfBillingAddress(R.attr.checkoutHelperLabelTextViewStyle);
                    this.f120882s.billingAddressLayout.showBillingAddress(getString(R.string.checkout_billing_address_fragment_title));
                }
            } else {
                this.f120882s.billingAddressLayout.changeStyleOfBillingAddress(R.attr.checkoutHelperTextViewStyle);
                this.f120882s.billingAddressLayout.showBillingAddress(getString(R.string.checkout_billing_address_fragment_title));
            }
            this.f120882s.billingAddressLayout.setOnClickListener(new C14068f1(this));
        }
    }

    private void s() {
        this.f120882s.icBrand.getRoot().setVisibility(0);
        this.f120882s.icBrand.loadingPanelItemCardBrands.setVisibility(4);
        this.f120882s.icBrand.expandBrandSelectionImageview.setTag("Expand");
        if (this.f121052e.getBrandDetectionAppearanceStyle() == CheckoutBrandDetectionAppearanceStyle.INACTIVE) {
            this.f120882s.icBrand.getRoot().setOnClickListener(new C14086l1(this));
        }
    }

    private void t() {
        this.f120882s.cardBrandSelectionLayout.setListener(new C14092n1(this));
    }

    public void onBrandsLoaded(String str, String[] strArr) {
        if (this.f120886w.indexOf(str) == 0 && this.f120882s.numberInputLayout.hasFocus()) {
            requireActivity().runOnUiThread(new C14083k1(this));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getParentFragmentManager().R1(BillingAddressFragment.class.getName(), this, new C14077i1(this));
        this.f120884u = this.f121055h;
        E();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OppFragmentCardPaymentInfoBinding inflate = OppFragmentCardPaymentInfoBinding.inflate(layoutInflater, viewGroup, false);
        this.f120882s = inflate;
        return inflate.getRoot();
    }

    public void onDetach() {
        super.onDetach();
        C14060d.b().a();
    }

    public void onImageLoaded(String str) {
        super.onImageLoaded(str);
        if (str.equals(this.f121055h)) {
            P();
        }
        this.f120882s.cardBrandSelectionLayout.updateCardBrands(str);
    }

    public void onResume() {
        super.onResume();
        if (this.f120882s.numberInputLayout.hasFocus()) {
            W();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("CARD_BRAND_STATE_KEY", this.f121055h);
        bundle.putString("CLEANED_CARD_NUMBER_STATE_KEY", this.f120886w.toString());
        bundle.putParcelable("BILLING_ADDRESS_STATE_KEY", this.f120888y);
    }

    public void onStart() {
        super.onStart();
        this.f120883t = new OppPaymentProvider(requireContext(), this.f121052e.getProviderMode());
        C14060d.b().a((C14060d.a) this);
    }

    public void onStop() {
        super.onStop();
        C14060d.b().b((C14060d.a) this);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f120889z = getResources().getConfiguration().getLayoutDirection();
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            this.f121055h = bundle.getString("CARD_BRAND_STATE_KEY");
            this.f120886w = new StringBuilder(bundle.getString("CLEANED_CARD_NUMBER_STATE_KEY"));
            this.f120888y = (BillingAddress) bundle.getParcelable("BILLING_ADDRESS_STATE_KEY");
        }
        if (this.f120888y == null) {
            this.f120888y = this.f121052e.getBillingAddress();
        }
        F();
    }

    private void A() {
        this.f120882s.phoneNumberInputLayout.setVisibility(0);
        this.f120882s.phoneNumberInputLayout.clearFocus();
        this.f120882s.phoneNumberInputLayout.getEditText().setFilters(new InputFilter[]{new InputFilter.LengthFilter(getResources().getInteger(R.integer.mobilePhoneNumberMaxLength))});
        this.f120882s.phoneNumberInputLayout.getEditText().setInputType(ImageMetadata.LENS_FOCAL_LENGTH);
        this.f120882s.phoneNumberInputLayout.setHint(getString(R.string.checkout_layout_hint_phone_number));
        this.f120882s.phoneNumberInputLayout.setHelperText(getString(R.string.checkout_helper_phone_number));
        this.f120882s.phoneNumberInputLayout.setInputValidator(C14099q.g());
        this.f120882s.phoneNumberInputLayout.getEditText().setOnFocusChangeListener(new C14071g1(this));
    }

    private void B() {
        if (this.f121052e.isCardScanningEnabled()) {
            if (NfcUtils.isNfcAvailable(requireContext())) {
                this.f120882s.cardScanButton.setVisibility(0);
                this.f120882s.cardScanButton.setImageResource(R.drawable.ic_card_scan_nfc);
                this.f120882s.cardScanButton.setOnClickListener(new C14062d1(this));
                return;
            } else if (LibraryHelper.isCardIOAvailable) {
                this.f120882s.cardScanButton.setVisibility(0);
                this.f120882s.cardScanButton.setImageResource(R.drawable.ic_card_scan_camera);
                this.f120882s.cardScanButton.setOnClickListener(new C14065e1(this));
                return;
            }
        }
        this.f120882s.cardScanButton.setVisibility(8);
    }

    private void C() {
        Token token = this.f121056i;
        if (token != null && token.getCard() != null) {
            this.f120882s.expiryDateInputLayout.setHint(getString(R.string.checkout_layout_hint_card_expiration_date));
            DateInputLayout dateInputLayout = this.f120882s.expiryDateInputLayout;
            dateInputLayout.setNotEditableText(this.f121056i.getCard().getExpiryMonth() + "/" + this.f121056i.getCard().getExpiryYear());
            if (a(this.f121056i)) {
                this.f120882s.expiryDateInputLayout.showError(getString(R.string.checkout_error_expiration_date));
                this.f121060m.setVisibility(8);
            }
        }
    }

    private void D() {
        this.f120887x = this.f121054g.getCardBrandInfo(this.f121056i.getPaymentBrand());
        this.f120882s.paymentInfoHeader.getRoot().setVisibility(0);
        if ((this.f121056i.getCard() != null ? this.f121056i.getCard().getHolder() : null) != null) {
            this.f120882s.holderInputLayout.setHint(getString(R.string.checkout_layout_hint_card_holder));
            this.f120882s.holderInputLayout.setNotEditableText(this.f121056i.getCard().getHolder());
        } else {
            this.f120882s.holderInputLayout.setVisibility(8);
        }
        this.f120882s.numberInputLayout.setCardBrand(this.f121056i.getPaymentBrand());
        this.f120882s.numberInputLayout.setHint(getString(R.string.checkout_layout_hint_card_number));
        CardNumberInputLayout cardNumberInputLayout = this.f120882s.numberInputLayout;
        cardNumberInputLayout.setNotEditableText("•••• " + this.f121056i.getCard().getLast4Digits());
        C();
        v();
        h();
    }

    private void E() {
        String str;
        if (this.f120884u.equalsIgnoreCase("CARD")) {
            str = null;
        } else {
            str = this.f120884u;
        }
        this.f120885v = str;
    }

    private void F() {
        if (this.f121056i == null) {
            t();
            x();
            s();
            z();
            B();
            w();
            r();
            d(this.f121055h);
        } else {
            D();
        }
        y();
    }

    private boolean G() {
        CheckoutSkipCVVMode skipCVVMode = this.f121052e.getSkipCVVMode();
        if (this.f120887x.getCvvMode() == CVVMode.NONE || skipCVVMode == CheckoutSkipCVVMode.ALWAYS) {
            return true;
        }
        Token token = this.f121056i;
        if (token == null) {
            return false;
        }
        if (skipCVVMode == CheckoutSkipCVVMode.FOR_STORED_CARDS || a(token)) {
            return true;
        }
        return false;
    }

    private boolean b(String str) {
        String[] cardBrands;
        if (TextUtils.equals(str, "CARD") || this.f121052e.getBrandDetectionType() == CheckoutBrandDetectionType.REGEX || (cardBrands = this.f120882s.cardBrandSelectionLayout.getCardBrands()) == null) {
            return true;
        }
        for (String equals : cardBrands) {
            if (TextUtils.equals(equals, str)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        this.f120885v = str;
        d(str);
        if (this.f120882s.cardBrandSelectionLayout.getCardBrands() != null && this.f120882s.cardBrandSelectionLayout.getCardBrands().length == 1) {
            p();
        }
        if (this.f121052e.getBrandDetectionAppearanceStyle() == CheckoutBrandDetectionAppearanceStyle.INACTIVE) {
            o();
        }
    }

    private PaymentParams j() {
        if (!X()) {
            return null;
        }
        try {
            CardPaymentParams cardPaymentParams = new CardPaymentParams(this.f121052e.getCheckoutId(), this.f121055h, a((CharSequence) this.f120882s.numberInputLayout.getText()).toString(), this.f120882s.holderInputLayout.getText(), m(), n(), l());
            this.f120879A = cardPaymentParams;
            cardPaymentParams.setTokenizationEnabled(f());
            this.f120879A.setBillingAddress(this.f120888y);
            if (this.f120887x.isMobilePhoneRequired()) {
                String text = this.f120882s.countryCodeInputLayout.getText();
                String text2 = this.f120882s.phoneNumberInputLayout.getText();
                this.f120879A.setCountryCode(text.replace(Marker.ANY_NON_NULL_MARKER, ""));
                this.f120879A.setMobilePhone(text2);
            }
            if (this.f121052e.isInstallmentEnabled()) {
                this.f120879A.setNumberOfInstallments((Integer) this.f120882s.numberOfInstallmentsLayout.numberOfInstallmentsSpinner.getSelectedItem());
            }
            return this.f120879A;
        } catch (PaymentException unused) {
            return null;
        }
    }

    private void u() {
        this.f120882s.countryCodeInputLayout.setHint(getString(R.string.checkout_layout_hint_country_code));
        this.f120882s.countryCodeInputLayout.getEditText().setFilters(new InputFilter[]{new InputFilter.LengthFilter(getResources().getInteger(R.integer.countryCodeMaxLegth))});
        this.f120882s.countryCodeInputLayout.setVisibility(0);
        this.f120882s.countryCodeInputLayout.clearFocus();
        this.f120882s.countryCodeInputLayout.getEditText().setInputType(ImageMetadata.LENS_FOCAL_LENGTH);
        this.f120882s.countryCodeInputLayout.setHelperText(getString(R.string.checkout_helper_country_code));
        this.f120882s.countryCodeInputLayout.setInputValidator(C14099q.f());
        this.f120882s.countryCodeInputLayout.getEditText().setOnFocusChangeListener(new C14089m1(this, new b()));
    }

    private void v() {
        boolean z10 = false;
        if (G()) {
            this.f120882s.cvvInputLayout.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) this.f120882s.expiryDateInputLayout.getLayoutParams()).setMarginEnd(0);
            return;
        }
        this.f120882s.cvvInputLayout.setVisibility(0);
        if (this.f120887x.getCvvLength() == 4) {
            this.f120882s.cvvInputLayout.setHelperText(getString(R.string.checkout_helper_security_code_amex));
        } else {
            this.f120882s.cvvInputLayout.setHelperText(getString(R.string.checkout_helper_security_code));
        }
        this.f120882s.cvvInputLayout.getEditText().setInputType(2);
        this.f120882s.cvvInputLayout.getEditText().setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.f120882s.cvvInputLayout.setHint(getString(R.string.checkout_layout_hint_card_cvv));
        this.f120882s.cvvInputLayout.getEditText().setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f120887x.getCvvLength())});
        this.f120882s.cvvInputLayout.setInputValidator(C14099q.b(this.f120887x.getCvvLength()));
        InputLayout inputLayout = this.f120882s.cvvInputLayout;
        if (this.f120887x.getCvvMode() == CVVMode.OPTIONAL) {
            z10 = true;
        }
        inputLayout.setOptional(z10);
        if (this.f120889z == 1) {
            this.f120882s.cvvInputLayout.setGravityForRTLLanguages();
        }
        this.f120882s.cvvInputLayout.setListener(new d());
    }

    private void w() {
        this.f120882s.expiryDateInputLayout.setHint(getString(R.string.checkout_layout_hint_card_expiration_date));
        this.f120882s.expiryDateInputLayout.getEditText().setContentDescription(getString(R.string.checkout_layout_hint_card_expiration_date));
        this.f120882s.expiryDateInputLayout.setHelperText(getString(R.string.checkout_helper_expiration_date));
        C14099q.o oVar = new C14099q.o(R.string.checkout_error_expiration_date_invalid, R.string.checkout_error_expiration_date);
        if (H()) {
            this.f120882s.expiryDateInputLayout.setOptional(true);
            oVar.a(true);
        }
        this.f120882s.expiryDateInputLayout.setInputValidator(oVar);
        if (this.f120889z == 1) {
            this.f120882s.expiryDateInputLayout.setGravityForRTLLanguages();
        }
        this.f120882s.expiryDateInputLayout.setListener(new c());
        this.f120882s.expiryDateInputLayout.getEditText().setCustomSelectionActionModeCallback(new C14075i());
        if (getActivity() != null && Utils.isScreenOrientationLandscape(getActivity())) {
            this.f120882s.expiryDateInputLayout.getEditText().getLayoutParams().height = c(R.dimen.checkout_card_number_input_layout_height);
        }
    }

    private void x() {
        if (I()) {
            this.f120882s.holderInputLayout.setVisibility(8);
            return;
        }
        this.f120882s.holderInputLayout.getEditText().setFilters(new InputFilter[]{new InputFilter.LengthFilter(getResources().getInteger(R.integer.cardHolderMaxLength))});
        this.f120882s.holderInputLayout.getEditText().setInputType(528384);
        this.f120882s.holderInputLayout.setHint(getString(R.string.checkout_layout_hint_card_holder));
        this.f120882s.holderInputLayout.getEditText().setContentDescription(getString(R.string.checkout_layout_hint_card_holder));
        this.f120882s.holderInputLayout.setHelperText(getString(R.string.checkout_helper_card_holder));
        this.f120882s.holderInputLayout.setInputValidator(C14099q.e());
        this.f120882s.holderInputLayout.setOptional(true);
        this.f120882s.holderInputLayout.getEditText().setCustomSelectionActionModeCallback(new C14075i());
        if (getActivity() != null && Utils.isScreenOrientationLandscape(getActivity())) {
            this.f120882s.holderInputLayout.getEditText().getLayoutParams().height = c(R.dimen.checkout_card_number_input_layout_height);
        }
        if (this.f121052e.getPaymentFormListener() != null) {
            this.f120882s.holderInputLayout.setPaymentFormListener(this.f121052e.getPaymentFormListener());
        }
    }

    private void y() {
        Token token = this.f121056i;
        if ((token == null || !a(token)) && this.f121052e.isInstallmentEnabled()) {
            this.f120882s.paymentInfoScrollView.findViewById(R.id.number_of_installments_layout).setVisibility(0);
            this.f120882s.numberOfInstallmentsLayout.numberOfInstallmentsSpinner.setAdapter((SpinnerAdapter) new ArrayAdapter(getActivity(), R.layout.opp_item_installments, this.f121052e.getInstallmentOptions()));
            this.f120882s.numberOfInstallmentsLayout.numberOfInstallmentsSpinner.setSelection(0);
        }
    }

    private void z() {
        int c10 = c(R.dimen.checkout_card_number_input_layout_height);
        this.f120882s.numberInputLayout.setHint(getString(R.string.checkout_layout_hint_card_number));
        this.f120882s.numberInputLayout.getEditText().setContentDescription(getString(R.string.checkout_layout_hint_card_number));
        this.f120882s.numberInputLayout.setHelperText(getString(R.string.checkout_helper_card_number));
        this.f120882s.numberInputLayout.getEditText().getLayoutParams().height = c10;
        this.f120882s.numberInputLayout.setPaddingStart(c(R.dimen.card_brand_logo_width) + c(R.dimen.checkout_input_layout_drawable_padding));
        if (this.f120889z == 1) {
            this.f120882s.numberInputLayout.setGravityForRTLLanguages();
        }
        S();
        T();
    }

    private int e(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr[1];
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 5) {
            return false;
        }
        if (I()) {
            this.f120882s.expiryDateInputLayout.getEditText().requestFocus();
            return true;
        }
        this.f120882s.holderInputLayout.getEditText().requestFocus();
        return true;
    }

    class a implements InputLayout.d {
        a() {
        }

        public void a(boolean z10) {
            if (CardPaymentInfoFragment.this.isResumed()) {
                if (z10) {
                    CardPaymentInfoFragment cardPaymentInfoFragment = CardPaymentInfoFragment.this;
                    cardPaymentInfoFragment.b((CharSequence) cardPaymentInfoFragment.f120882s.numberInputLayout.getEditText().getText());
                    if (!CardPaymentInfoFragment.this.f120882s.cardBrandSelectionLayout.isVisible()) {
                        CardPaymentInfoFragment.this.W();
                        return;
                    }
                    return;
                }
                CardPaymentInfoFragment.this.o();
            }
        }

        public void a(Editable editable) {
            if (CardPaymentInfoFragment.this.isResumed()) {
                CardPaymentInfoFragment.this.b((CharSequence) editable);
            }
        }
    }

    private void h() {
        InputLayout inputLayout;
        this.f120882s.numberInputLayout.getEditText().setImeOptions(5);
        this.f120882s.holderInputLayout.getEditText().setImeOptions(5);
        this.f120882s.expiryDateInputLayout.getEditText().setImeOptions(5);
        this.f120882s.cvvInputLayout.getEditText().setImeOptions(5);
        this.f120882s.countryCodeInputLayout.getEditText().setImeOptions(5);
        this.f120882s.phoneNumberInputLayout.getEditText().setImeOptions(5);
        if (this.f120887x.isMobilePhoneRequired()) {
            inputLayout = this.f120882s.phoneNumberInputLayout;
        } else if (G()) {
            inputLayout = this.f120882s.expiryDateInputLayout;
        } else {
            inputLayout = this.f120882s.cvvInputLayout;
        }
        inputLayout.getEditText().setImeOptions(6);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i(View view) {
        this.f120881r.a(null);
    }

    private void a(StringBuilder sb2) {
        String a10 = a(sb2.toString());
        if (e(a10)) {
            C14060d.b().a(this.f120883t, this.f121052e.getCheckoutId(), a10, this.f121054g);
        }
        String[] a11 = C14060d.b().a(a10);
        if (a11 == null) {
            b(sb2);
        } else {
            a((List<String>) Arrays.asList(a11), a11.length == 0);
        }
    }

    /* access modifiers changed from: private */
    public void b(CharSequence charSequence) {
        StringBuilder a10 = a(charSequence);
        if (!StringUtils.compareStringBuilders(a10, this.f120886w)) {
            StringUtils.wipeString(this.f120886w);
            this.f120886w = a10;
            c(a10);
        }
    }

    private void c(StringBuilder sb2) {
        if (sb2.length() >= 4) {
            if (this.f121052e.getBrandDetectionType().equals(CheckoutBrandDetectionType.REGEX)) {
                b(sb2);
            } else {
                a(sb2);
            }
        } else if (sb2.length() > 0) {
            p();
        } else {
            N();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(View view) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(BillingAddressFragment.BILLING_ADDRESS_KEY, this.f120888y);
        Class<BillingAddressFragment> cls = BillingAddressFragment.class;
        getParentFragmentManager().s().B(true).d(R.id.container, cls, bundle).i(cls.getName()).x(R.anim.opp_fragment_in, R.anim.opp_fragment_out).j();
    }

    private void b(StringBuilder sb2) {
        a(this.f121054g.getDetectedCardBrands(sb2.toString(), this.f120884u), false);
    }

    /* access modifiers changed from: private */
    public void d(View view) {
        view.postDelayed(new C14074h1(this, view), 300);
    }

    private String a(String str) {
        if (str.length() < 6 || str.length() >= 8) {
            return str.length() >= 8 ? str.substring(0, 8) : str;
        }
        return str.substring(0, 6);
    }

    private int c(int i10) {
        return (int) getResources().getDimension(i10);
    }

    /* access modifiers changed from: protected */
    public PaymentParams b() {
        M();
        if (this.f121056i == null) {
            return j();
        }
        return k();
    }

    private void a(List<String> list, boolean z10) {
        String str;
        if (list == null || list.isEmpty() || z10) {
            this.f120882s.cardBrandSelectionLayout.setCardBrands(new String[0], "CARD");
            this.f120882s.cardBrandSelectionLayout.setSelectedBrand("CARD");
            p();
        } else {
            String str2 = this.f120885v;
            if (str2 == null || str2.equalsIgnoreCase("CARD")) {
                str = list.get(0);
            } else {
                str = this.f120885v;
            }
            a(list, str);
            d(str);
        }
        a(z10);
    }

    private void a(boolean z10) {
        if (z10 && !this.f120882s.numberInputLayout.hasError()) {
            this.f120882s.numberInputLayout.showError(getString(R.string.checkout_error_card_number_invalid));
            d("CARD");
        } else if (!z10 && this.f120882s.numberInputLayout.hasError()) {
            this.f120882s.numberInputLayout.clearError();
            String str = this.f120885v;
            if (str != null) {
                d(str);
            }
        }
    }

    private void a(List<String> list, String str) {
        boolean z10 = list.size() == 1 && this.f120885v != null && !list.get(0).equalsIgnoreCase(this.f120885v);
        this.f120882s.cardBrandSelectionLayout.setCardBrands((String[]) list.toArray(new String[0]), this.f121055h);
        if (list.size() > 1 || z10) {
            String str2 = this.f120885v;
            if (str2 != null) {
                str = str2;
            }
            this.f120882s.cardBrandSelectionLayout.setSelectedBrand(str);
            W();
            return;
        }
        p();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(TextWatcher textWatcher, View view, boolean z10) {
        if (!z10) {
            this.f120882s.countryCodeInputLayout.getEditText().removeTextChangedListener(textWatcher);
            if (this.f120882s.countryCodeInputLayout.getText().equals(Marker.ANY_NON_NULL_MARKER)) {
                this.f120882s.countryCodeInputLayout.setText("");
            }
            this.f120882s.countryCodeInputLayout.validate();
            this.f120882s.phoneNumberInputLayout.validate();
            return;
        }
        this.f120882s.countryCodeInputLayout.getEditText().addTextChangedListener(textWatcher);
        if (this.f120882s.countryCodeInputLayout.getText().equals("")) {
            this.f120882s.countryCodeInputLayout.setText(Marker.ANY_NON_NULL_MARKER);
        }
        this.f120882s.countryCodeInputLayout.clearError();
        this.f120882s.phoneNumberInputLayout.clearError();
        this.f120882s.countryCodeInputLayout.setSelectionAtTheEnd();
        d((View) this.f120882s.countryCodeInputLayout);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view, boolean z10) {
        if (!z10) {
            this.f120882s.countryCodeInputLayout.validate();
            this.f120882s.phoneNumberInputLayout.validate();
            return;
        }
        this.f120882s.countryCodeInputLayout.clearError();
        this.f120882s.phoneNumberInputLayout.clearError();
        d((View) this.f120882s.phoneNumberInputLayout);
    }

    private boolean a(Token token) {
        if (token.getCard() != null) {
            return CardPaymentParams.isCardExpired(token.getCard().getExpiryMonth(), token.getCard().getExpiryYear());
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void a(CreditCard creditCard) {
        String str;
        if (creditCard != null) {
            String formattedCardNumber = creditCard.getFormattedCardNumber();
            if (creditCard.isExpiryValid()) {
                str = new DecimalFormat("00").format((long) creditCard.expiryMonth) + creditCard.expiryYear;
            } else {
                str = null;
            }
            a(formattedCardNumber, str);
        }
    }

    /* access modifiers changed from: protected */
    public void a(CardDetails cardDetails) {
        String str;
        if (cardDetails != null) {
            String pan = cardDetails.getPan();
            if (cardDetails.getExpiryMonth() == null || cardDetails.getExpiryYear() == null) {
                str = null;
            } else {
                str = cardDetails.getExpiryMonth() + cardDetails.getExpiryYear();
            }
            a(pan, str);
        }
    }

    private void a(String str, String str2) {
        this.f120882s.numberInputLayout.setText(str);
        this.f120882s.numberInputLayout.setSelectionAtTheEnd();
        if (str2 != null) {
            this.f120882s.expiryDateInputLayout.setText("");
            this.f120882s.expiryDateInputLayout.setText(str2);
        }
        this.f120882s.numberInputLayout.post(new C14054b1(this));
    }

    private StringBuilder a(CharSequence charSequence) {
        StringBuilder sb2 = new StringBuilder(charSequence);
        StringUtils.replaceNonstandardDigits(sb2);
        StringUtils.removeSubstring(sb2, " ");
        return sb2;
    }

    /* access modifiers changed from: private */
    public void a(String str, Bundle bundle) {
        this.f120888y = (BillingAddress) bundle.getParcelable(BillingAddressFragment.BILLING_ADDRESS_KEY);
        r();
    }
}
