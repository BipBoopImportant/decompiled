package com.oppwa.mobile.connect.checkout.dialog.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.checkout.uicomponent.PaymentDetailsUiComponentInteraction;
import com.oppwa.mobile.connect.checkout.uicomponent.aciinstantpay.AciInstantPayUiComponent;
import com.oppwa.mobile.connect.checkout.uicomponent.aciinstantpay.AciInstantPayUiComponentInteraction;
import com.oppwa.mobile.connect.databinding.OppwaAciInstantPayFragmentBinding;

public class AciInstantPayPaymentDetailsFragment extends PaymentDetailsFragment<OppwaAciInstantPayFragmentBinding> implements AciInstantPayUiComponent {
    private void a(AciInstantPayUiComponentInteraction aciInstantPayUiComponentInteraction) {
        a((PaymentDetailsUiComponentInteraction) aciInstantPayUiComponentInteraction, ((OppwaAciInstantPayFragmentBinding) b()).header);
        a(((OppwaAciInstantPayFragmentBinding) b()).paymentInfoHeader, CheckoutConstants.PaymentBrands.ACI_INSTANTPAY);
        d();
        a((PaymentDetailsUiComponentInteraction) aciInstantPayUiComponentInteraction, ((OppwaAciInstantPayFragmentBinding) b()).paymentButtonLayout.paymentButton);
        e();
    }

    private void d() {
        a(((OppwaAciInstantPayFragmentBinding) b()).accountHolderInputLayout, getString(R.string.checkout_layout_hint_direct_debit_sepa_account_holder));
        a(((OppwaAciInstantPayFragmentBinding) b()).accountNumberInputLayout, getString(R.string.checkout_helper_account_number));
    }

    private void e() {
        getAccountHolderEditText().setImeOptions(5);
        getAccountNumberEditText().setImeOptions(5);
        getRoutingNumberEditText().setImeOptions(6);
    }

    public EditText getAccountHolderEditText() {
        return ((OppwaAciInstantPayFragmentBinding) b()).accountHolderEditText;
    }

    public EditText getAccountNumberEditText() {
        return ((OppwaAciInstantPayFragmentBinding) b()).accountNumberEditText;
    }

    public EditText getRoutingNumberEditText() {
        return ((OppwaAciInstantPayFragmentBinding) b()).routingNumberEditText;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        T inflate = OppwaAciInstantPayFragmentBinding.inflate(layoutInflater, viewGroup, false);
        this.f121180a = inflate;
        return inflate.getRoot();
    }

    public void onUiComponentCreated(AciInstantPayUiComponentInteraction aciInstantPayUiComponentInteraction) {
        a(aciInstantPayUiComponentInteraction);
    }
}
