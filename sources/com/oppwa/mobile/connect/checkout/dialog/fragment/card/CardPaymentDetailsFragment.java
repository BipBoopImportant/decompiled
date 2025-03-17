package com.oppwa.mobile.connect.checkout.dialog.fragment.card;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.SpinnerAdapter;
import androidx.fragment.app.C5187o;
import com.google.android.material.textfield.TextInputLayout;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.BillingAddressFragment;
import com.oppwa.mobile.connect.checkout.dialog.BillingAddressHelper;
import com.oppwa.mobile.connect.checkout.dialog.CardBrandSelectionLayout;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.checkout.dialog.ImageLoader;
import com.oppwa.mobile.connect.checkout.dialog.fragment.PaymentDetailsFragment;
import com.oppwa.mobile.connect.checkout.dialog.fragment.h;
import com.oppwa.mobile.connect.checkout.meta.CheckoutBrandDetectionAppearanceStyle;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSettings;
import com.oppwa.mobile.connect.checkout.meta.CheckoutStorePaymentDetailsMode;
import com.oppwa.mobile.connect.checkout.uicomponent.PaymentDetailsUiComponentInteraction;
import com.oppwa.mobile.connect.checkout.uicomponent.card.CardUiComponent;
import com.oppwa.mobile.connect.checkout.uicomponent.card.CardUiComponentInteraction;
import com.oppwa.mobile.connect.core.nfc.NfcUtils;
import com.oppwa.mobile.connect.databinding.OppwaCardPaymentDetailsFragmentBinding;
import com.oppwa.mobile.connect.payment.BillingAddress;
import com.oppwa.mobile.connect.utils.LibraryHelper;
import java.util.Optional;
import java.util.Set;

public class CardPaymentDetailsFragment extends PaymentDetailsFragment<OppwaCardPaymentDetailsFragmentBinding> implements CardUiComponent {

    /* renamed from: b  reason: collision with root package name */
    private CardUiComponentInteraction f121184b;

    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            CardPaymentDetailsFragment.this.f().setNumberOfInstallments(((Integer) adapterView.getSelectedItem()).intValue());
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        f().setCardBrand(str);
        if (f().getCheckoutSettings().getBrandDetectionAppearanceStyle() == CheckoutBrandDetectionAppearanceStyle.INACTIVE) {
            d();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        if (((OppwaCardPaymentDetailsFragmentBinding) b()).cardBrandSelectionLayout.isVisible()) {
            d();
        } else {
            k();
        }
    }

    private void d() {
        if (f().getCheckoutSettings().getBrandDetectionAppearanceStyle() == CheckoutBrandDetectionAppearanceStyle.INACTIVE) {
            ((OppwaCardPaymentDetailsFragmentBinding) b()).cardBrandLogoLayout.expandBrandSelectionImageview.setImageResource(R.drawable.expand);
        }
        ((OppwaCardPaymentDetailsFragmentBinding) b()).cardBrandSelectionLayout.hide();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException e() {
        return new IllegalStateException("Missing CardUiInteraction.");
    }

    /* access modifiers changed from: private */
    public CardUiComponentInteraction f() {
        return (CardUiComponentInteraction) Optional.ofNullable(this.f121184b).orElseThrow(new i());
    }

    private void g() {
        ((OppwaCardPaymentDetailsFragmentBinding) b()).cardBrandLogoLayout.expandBrandSelectionImageview.setOnClickListener(new g(this));
        ((OppwaCardPaymentDetailsFragmentBinding) b()).cardBrandSelectionLayout.setListener(new h(this));
    }

    private void h() {
        ((OppwaCardPaymentDetailsFragmentBinding) b()).cardNumberInputLayout.setEndIconOnClickListener(new f(this));
        if (NfcUtils.isNfcAvailable(requireContext())) {
            ((OppwaCardPaymentDetailsFragmentBinding) b()).cardNumberInputLayout.setEndIconDrawable(R.drawable.ic_card_scan_nfc);
        } else if (LibraryHelper.isCardIOAvailable) {
            ((OppwaCardPaymentDetailsFragmentBinding) b()).cardNumberInputLayout.setEndIconDrawable(R.drawable.ic_card_scan_camera);
        }
    }

    private void i() {
        a(((OppwaCardPaymentDetailsFragmentBinding) b()).cardNumberInputLayout, getString(R.string.checkout_helper_card_number));
        a(((OppwaCardPaymentDetailsFragmentBinding) b()).cardHolderInputLayout, getString(R.string.checkout_helper_card_holder));
        a(((OppwaCardPaymentDetailsFragmentBinding) b()).cardExpiryDateInputLayout, getString(R.string.checkout_helper_expiration_date));
    }

    private void j() {
        CheckoutStorePaymentDetailsMode storePaymentDetailsMode = f().getCheckoutSettings().getStorePaymentDetailsMode();
        boolean z10 = false;
        if (storePaymentDetailsMode == CheckoutStorePaymentDetailsMode.PROMPT) {
            ((OppwaCardPaymentDetailsFragmentBinding) b()).storePaymentDetailsLayout.getRoot().setVisibility(0);
            ((OppwaCardPaymentDetailsFragmentBinding) b()).storePaymentDetailsLayout.storePaymentInfoCheckbox.setOnCheckedChangeListener(new b(this));
            return;
        }
        ((OppwaCardPaymentDetailsFragmentBinding) b()).storePaymentDetailsLayout.getRoot().setVisibility(8);
        CardUiComponentInteraction f10 = f();
        if (storePaymentDetailsMode == CheckoutStorePaymentDetailsMode.ALWAYS) {
            z10 = true;
        }
        f10.setTokenizationEnabled(z10);
    }

    private void k() {
        if (f().getCheckoutSettings().getBrandDetectionAppearanceStyle() == CheckoutBrandDetectionAppearanceStyle.INACTIVE) {
            ((OppwaCardPaymentDetailsFragmentBinding) b()).cardBrandLogoLayout.expandBrandSelectionImageview.setImageResource(R.drawable.collapse);
        }
        ((OppwaCardPaymentDetailsFragmentBinding) b()).cardBrandSelectionLayout.show();
    }

    public EditText getCardExpiryDateEditText() {
        return ((OppwaCardPaymentDetailsFragmentBinding) b()).cardExpiryDateEditText;
    }

    public EditText getCardHolderEditText() {
        return ((OppwaCardPaymentDetailsFragmentBinding) b()).cardHolderEditText;
    }

    public EditText getCardNumberEditText() {
        return ((OppwaCardPaymentDetailsFragmentBinding) b()).cardNumberEditText;
    }

    public EditText getCardSecurityCodeEditText() {
        return ((OppwaCardPaymentDetailsFragmentBinding) b()).cardSecurityCodeEditText;
    }

    public EditText getPhoneCountryCodeEditText() {
        return ((OppwaCardPaymentDetailsFragmentBinding) b()).phoneCountryCodeEditText;
    }

    public EditText getPhoneNumberEditText() {
        return ((OppwaCardPaymentDetailsFragmentBinding) b()).phoneNumberEditText;
    }

    public void onCardBrandChange(String str) {
        c(str);
        d(str);
    }

    public void onCardBrandDetection(Set<String> set) {
        if (f().getCheckoutSettings().getBrandDetectionAppearanceStyle() != CheckoutBrandDetectionAppearanceStyle.NONE) {
            if (set.size() > 1) {
                String cardBrand = f().getCardBrand();
                CardBrandSelectionLayout cardBrandSelectionLayout = ((OppwaCardPaymentDetailsFragmentBinding) b()).cardBrandSelectionLayout;
                String[] strArr = (String[]) set.toArray(new String[0]);
                if (cardBrand == null || !set.contains(cardBrand)) {
                    cardBrand = set.iterator().next();
                }
                cardBrandSelectionLayout.setCardBrands(strArr, cardBrand);
                if (f().getCheckoutSettings().getBrandDetectionAppearanceStyle() == CheckoutBrandDetectionAppearanceStyle.INACTIVE) {
                    ((OppwaCardPaymentDetailsFragmentBinding) b()).cardBrandLogoLayout.expandBrandSelectionImageview.setVisibility(0);
                } else {
                    k();
                }
            } else {
                ((OppwaCardPaymentDetailsFragmentBinding) b()).cardBrandLogoLayout.expandBrandSelectionImageview.setVisibility(8);
                d();
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        T inflate = OppwaCardPaymentDetailsFragmentBinding.inflate(layoutInflater, viewGroup, false);
        this.f121180a = inflate;
        return inflate.getRoot();
    }

    public void onInputValidation(EditText editText, String str) {
        ((TextInputLayout) editText.getParent().getParent()).setError(str);
    }

    public void onViewVisibilityChange(View view, int i10) {
        Optional.ofNullable(view.getParent()).map(new h()).ifPresent(new j(i10));
    }

    private void a(BillingAddress billingAddress) {
        ((OppwaCardPaymentDetailsFragmentBinding) b()).billingAddressLayout.setVisibility(0);
        Optional.ofNullable(getParentFragment()).ifPresent(new c(this));
        if (BillingAddressHelper.checkMandatoryFieldsArePreconfigured(billingAddress)) {
            String mergedBillingAddressData = BillingAddressHelper.getMergedBillingAddressData(billingAddress);
            if (!mergedBillingAddressData.isEmpty()) {
                ((OppwaCardPaymentDetailsFragmentBinding) b()).billingAddressLayout.changeStyleOfBillingAddress(R.attr.checkoutSecondaryTextViewStyle);
                ((OppwaCardPaymentDetailsFragmentBinding) b()).billingAddressLayout.showBillingAddress(mergedBillingAddressData);
            } else {
                ((OppwaCardPaymentDetailsFragmentBinding) b()).billingAddressLayout.changeStyleOfBillingAddress(R.attr.checkoutHelperLabelTextViewStyle);
                ((OppwaCardPaymentDetailsFragmentBinding) b()).billingAddressLayout.showBillingAddress(getString(R.string.checkout_billing_address_fragment_title));
            }
        } else {
            ((OppwaCardPaymentDetailsFragmentBinding) b()).billingAddressLayout.changeStyleOfBillingAddress(R.attr.checkoutHelperTextViewStyle);
            ((OppwaCardPaymentDetailsFragmentBinding) b()).billingAddressLayout.showBillingAddress(getString(R.string.checkout_billing_address_fragment_title));
        }
        ((OppwaCardPaymentDetailsFragmentBinding) b()).billingAddressLayout.setOnClickListener(new d(this, billingAddress));
    }

    public void onUiComponentCreated(CardUiComponentInteraction cardUiComponentInteraction) {
        this.f121184b = cardUiComponentInteraction;
        a((PaymentDetailsUiComponentInteraction) cardUiComponentInteraction, ((OppwaCardPaymentDetailsFragmentBinding) b()).header);
        i();
        g();
        CheckoutSettings checkoutSettings = cardUiComponentInteraction.getCheckoutSettings();
        if (checkoutSettings.isCardScanningEnabled() && cardUiComponentInteraction.isCardScanningAvailable()) {
            h();
        }
        if (checkoutSettings.getBillingAddress() != null) {
            a(checkoutSettings.getBillingAddress());
        }
        if (checkoutSettings.isInstallmentEnabled()) {
            a(checkoutSettings.getInstallmentOptions());
        }
        j();
        a((PaymentDetailsUiComponentInteraction) cardUiComponentInteraction, ((OppwaCardPaymentDetailsFragmentBinding) b()).paymentButtonLayout.paymentButton);
    }

    private void c(String str) {
        Bitmap image = str != null ? ImageLoader.getInstance(requireContext()).getImage(str) : null;
        if (image != null) {
            ((OppwaCardPaymentDetailsFragmentBinding) b()).cardBrandLogoLayout.cardBrandLogo.setImageBitmap(image);
            ((OppwaCardPaymentDetailsFragmentBinding) b()).cardBrandLogoLayout.loadingPanelItemCardBrands.setVisibility(8);
            ((OppwaCardPaymentDetailsFragmentBinding) b()).cardBrandLogoLayout.getRoot().setVisibility(0);
            return;
        }
        ((OppwaCardPaymentDetailsFragmentBinding) b()).cardBrandLogoLayout.getRoot().setVisibility(8);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        f().scanCard();
    }

    private void d(String str) {
        String str2;
        if (CheckoutConstants.PaymentBrands.AMEX.equals(str)) {
            str2 = getString(R.string.checkout_helper_security_code_amex);
        } else {
            str2 = getString(R.string.checkout_helper_security_code);
        }
        a(((OppwaCardPaymentDetailsFragmentBinding) b()).cardSecurityCodeInputLayout, str2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(C5187o oVar) {
        oVar.getChildFragmentManager().R1(BillingAddressFragment.class.getName(), this, new e(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(BillingAddress billingAddress, View view) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(BillingAddressFragment.BILLING_ADDRESS_KEY, billingAddress);
        Optional.ofNullable(getParentFragment()).ifPresent(new a(bundle));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Bundle bundle, C5187o oVar) {
        Class<BillingAddressFragment> cls = BillingAddressFragment.class;
        oVar.getChildFragmentManager().s().B(true).d(R.id.ui_component_container, cls, bundle).i(cls.getName()).j();
    }

    private void a(Integer[] numArr) {
        ((OppwaCardPaymentDetailsFragmentBinding) b()).numberOfInstallmentsLayout.getRoot().setVisibility(0);
        ((OppwaCardPaymentDetailsFragmentBinding) b()).numberOfInstallmentsLayout.numberOfInstallmentsSpinner.setAdapter((SpinnerAdapter) new ArrayAdapter(requireContext(), R.layout.opp_item_installments, numArr));
        ((OppwaCardPaymentDetailsFragmentBinding) b()).numberOfInstallmentsLayout.numberOfInstallmentsSpinner.setSelection(0);
        ((OppwaCardPaymentDetailsFragmentBinding) b()).numberOfInstallmentsLayout.numberOfInstallmentsSpinner.setOnItemSelectedListener(new a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(CompoundButton compoundButton, boolean z10) {
        f().setTokenizationEnabled(z10);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(int i10, ViewParent viewParent) {
        if (viewParent instanceof TextInputLayout) {
            ((TextInputLayout) viewParent).setVisibility(i10);
        }
    }

    /* access modifiers changed from: private */
    public void a(String str, Bundle bundle) {
        BillingAddress billingAddress = (BillingAddress) bundle.getParcelable(BillingAddressFragment.BILLING_ADDRESS_KEY);
        if (billingAddress != null) {
            f().getCheckoutSettings().setBillingAddress(billingAddress);
            a(billingAddress);
        }
    }
}
