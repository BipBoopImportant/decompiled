package com.oppwa.mobile.connect.checkout.dialog.fragment.card;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.SpinnerAdapter;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.checkout.dialog.fragment.PaymentDetailsFragment;
import com.oppwa.mobile.connect.checkout.uicomponent.PaymentDetailsUiComponentInteraction;
import com.oppwa.mobile.connect.checkout.uicomponent.card.token.CardTokenUiComponent;
import com.oppwa.mobile.connect.checkout.uicomponent.card.token.CardTokenUiComponentInteraction;
import com.oppwa.mobile.connect.databinding.OppwaCardTokenPaymentDetailsFragmentBinding;
import com.oppwa.mobile.connect.payment.card.CardPaymentParams;
import com.oppwa.mobile.connect.payment.token.Card;
import java.util.Optional;

public class CardTokenPaymentDetailsFragment extends PaymentDetailsFragment<OppwaCardTokenPaymentDetailsFragmentBinding> implements CardTokenUiComponent {

    class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CardTokenUiComponentInteraction f121186a;

        a(CardTokenUiComponentInteraction cardTokenUiComponentInteraction) {
            this.f121186a = cardTokenUiComponentInteraction;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            this.f121186a.setNumberOfInstallments(((Integer) adapterView.getSelectedItem()).intValue());
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    private void a(CardTokenUiComponentInteraction cardTokenUiComponentInteraction) {
        Integer[] installmentOptions = cardTokenUiComponentInteraction.getInstallmentOptions();
        ((OppwaCardTokenPaymentDetailsFragmentBinding) b()).numberOfInstallmentsLayout.getRoot().setVisibility(0);
        ((OppwaCardTokenPaymentDetailsFragmentBinding) b()).numberOfInstallmentsLayout.numberOfInstallmentsSpinner.setAdapter((SpinnerAdapter) new ArrayAdapter(requireContext(), R.layout.opp_item_installments, installmentOptions));
        ((OppwaCardTokenPaymentDetailsFragmentBinding) b()).numberOfInstallmentsLayout.numberOfInstallmentsSpinner.setSelection(0);
        ((OppwaCardTokenPaymentDetailsFragmentBinding) b()).numberOfInstallmentsLayout.numberOfInstallmentsSpinner.setOnItemSelectedListener(new a(cardTokenUiComponentInteraction));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        ((OppwaCardTokenPaymentDetailsFragmentBinding) b()).cardHolderInputLayout.setVisibility(0);
        ((OppwaCardTokenPaymentDetailsFragmentBinding) b()).cardHolderEditText.setText(str);
    }

    private void c(String str) {
        a(((OppwaCardTokenPaymentDetailsFragmentBinding) b()).cardSecurityCodeInputLayout, CheckoutConstants.PaymentBrands.AMEX.equals(str) ? getString(R.string.checkout_helper_security_code_amex) : getString(R.string.checkout_helper_security_code));
    }

    public EditText getCardSecurityCodeEditText() {
        return ((OppwaCardTokenPaymentDetailsFragmentBinding) b()).cardSecurityCodeEditText;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        T inflate = OppwaCardTokenPaymentDetailsFragmentBinding.inflate(layoutInflater, viewGroup, false);
        this.f121180a = inflate;
        return inflate.getRoot();
    }

    public void setupCardExpiryDateView(Card card, boolean z10) {
        ((OppwaCardTokenPaymentDetailsFragmentBinding) b()).cardExpiryDateEditText.setText(String.format("%s / %s", new Object[]{card.getExpiryMonth(), card.getExpiryYear()}));
        if (z10) {
            ((OppwaCardTokenPaymentDetailsFragmentBinding) b()).cardExpiryDateInputLayout.setError(getString(R.string.checkout_error_expiration_date));
        }
    }

    public void setupCardHolderView(Card card) {
        Optional.ofNullable(card.getHolder()).ifPresent(new k(this));
    }

    public void setupCardNumberView(Card card) {
        ((OppwaCardTokenPaymentDetailsFragmentBinding) b()).cardNumberEditText.setText("•••• " + card.getLast4Digits());
    }

    public void setupCardTokenDetails(Card card, boolean z10) {
        setupCardNumberView(card);
        setupCardHolderView(card);
        setupCardExpiryDateView(card, z10);
    }

    public void onUiComponentCreated(CardTokenUiComponentInteraction cardTokenUiComponentInteraction) {
        a((PaymentDetailsUiComponentInteraction) cardTokenUiComponentInteraction, ((OppwaCardTokenPaymentDetailsFragmentBinding) b()).header);
        a(((OppwaCardTokenPaymentDetailsFragmentBinding) b()).paymentInfoHeader, cardTokenUiComponentInteraction.getBrand());
        Card card = cardTokenUiComponentInteraction.getCard();
        boolean isCardExpired = CardPaymentParams.isCardExpired(card.getExpiryMonth(), card.getExpiryYear());
        setupCardTokenDetails(card, isCardExpired);
        c(cardTokenUiComponentInteraction.getBrand());
        if (cardTokenUiComponentInteraction.getCheckoutSettings().isInstallmentEnabled()) {
            a(cardTokenUiComponentInteraction);
        }
        if (isCardExpired) {
            ((OppwaCardTokenPaymentDetailsFragmentBinding) b()).cardSecurityCodeInputLayout.setVisibility(8);
            ((OppwaCardTokenPaymentDetailsFragmentBinding) b()).paymentButtonLayout.getRoot().setVisibility(8);
            return;
        }
        a((PaymentDetailsUiComponentInteraction) cardTokenUiComponentInteraction, ((OppwaCardTokenPaymentDetailsFragmentBinding) b()).paymentButtonLayout.paymentButton);
    }
}
