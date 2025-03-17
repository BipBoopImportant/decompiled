package com.oppwa.mobile.connect.checkout.dialog.fragment.bankaccount;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.checkout.dialog.fragment.PaymentDetailsFragment;
import com.oppwa.mobile.connect.checkout.meta.CheckoutStorePaymentDetailsMode;
import com.oppwa.mobile.connect.checkout.uicomponent.PaymentDetailsUiComponentInteraction;
import com.oppwa.mobile.connect.checkout.uicomponent.bankaccount.sepa.DirectDebitSepaUiComponent;
import com.oppwa.mobile.connect.checkout.uicomponent.bankaccount.sepa.DirectDebitSepaUiComponentInteraction;
import com.oppwa.mobile.connect.databinding.OppwaDirectDebitSepaFragmentBinding;
import uE.C15118a;

public class DirectDebitSepaPaymentDetailsFragment extends PaymentDetailsFragment<OppwaDirectDebitSepaFragmentBinding> implements DirectDebitSepaUiComponent {
    private void a(DirectDebitSepaUiComponentInteraction directDebitSepaUiComponentInteraction) {
        if (directDebitSepaUiComponentInteraction.getCheckoutSettings().getStorePaymentDetailsMode() == CheckoutStorePaymentDetailsMode.PROMPT) {
            ((OppwaDirectDebitSepaFragmentBinding) b()).storePaymentDetailsLayout.getRoot().setVisibility(0);
            ((OppwaDirectDebitSepaFragmentBinding) b()).storePaymentDetailsLayout.storePaymentInfoCheckbox.setOnCheckedChangeListener(new C15118a(directDebitSepaUiComponentInteraction));
            return;
        }
        ((OppwaDirectDebitSepaFragmentBinding) b()).storePaymentDetailsLayout.getRoot().setVisibility(8);
    }

    private void b(DirectDebitSepaUiComponentInteraction directDebitSepaUiComponentInteraction) {
        a((PaymentDetailsUiComponentInteraction) directDebitSepaUiComponentInteraction, ((OppwaDirectDebitSepaFragmentBinding) b()).header);
        a(((OppwaDirectDebitSepaFragmentBinding) b()).paymentInfoHeader, CheckoutConstants.PaymentBrands.DIRECTDEBIT_SEPA);
        d();
        a(directDebitSepaUiComponentInteraction);
        a((PaymentDetailsUiComponentInteraction) directDebitSepaUiComponentInteraction, ((OppwaDirectDebitSepaFragmentBinding) b()).paymentButtonLayout.paymentButton);
        e();
    }

    private void d() {
        a(((OppwaDirectDebitSepaFragmentBinding) b()).sepaAccountHolderInputLayout, getString(R.string.checkout_layout_hint_direct_debit_sepa_account_holder));
        a(((OppwaDirectDebitSepaFragmentBinding) b()).sepaIbanInputLayout, getString(R.string.checkout_helper_iban));
    }

    private void e() {
        getAccountHolderEditText().setImeOptions(5);
        getIbanEditText().setImeOptions(6);
    }

    public EditText getAccountHolderEditText() {
        return ((OppwaDirectDebitSepaFragmentBinding) b()).sepaAccountHolderEditText;
    }

    public EditText getIbanEditText() {
        return ((OppwaDirectDebitSepaFragmentBinding) b()).sepaIbanEditText;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        T inflate = OppwaDirectDebitSepaFragmentBinding.inflate(layoutInflater, viewGroup, false);
        this.f121180a = inflate;
        return inflate.getRoot();
    }

    public void onUiComponentCreated(DirectDebitSepaUiComponentInteraction directDebitSepaUiComponentInteraction) {
        b(directDebitSepaUiComponentInteraction);
    }
}
