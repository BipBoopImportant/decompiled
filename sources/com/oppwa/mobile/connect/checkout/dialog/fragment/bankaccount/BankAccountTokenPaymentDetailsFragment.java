package com.oppwa.mobile.connect.checkout.dialog.fragment.bankaccount;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.oppwa.mobile.connect.checkout.dialog.fragment.PaymentDetailsFragment;
import com.oppwa.mobile.connect.checkout.uicomponent.PaymentDetailsUiComponentInteraction;
import com.oppwa.mobile.connect.checkout.uicomponent.bankaccount.token.BankAccountTokenUiComponent;
import com.oppwa.mobile.connect.checkout.uicomponent.bankaccount.token.BankAccountTokenUiComponentInteraction;
import com.oppwa.mobile.connect.checkout.uicomponent.util.InputFormatter;
import com.oppwa.mobile.connect.databinding.OppwaBankAccountTokenPaymentDetailsFragmentBinding;
import com.oppwa.mobile.connect.payment.token.BankAccount;

public class BankAccountTokenPaymentDetailsFragment extends PaymentDetailsFragment<OppwaBankAccountTokenPaymentDetailsFragmentBinding> implements BankAccountTokenUiComponent {
    private void a(BankAccount bankAccount) {
        ((OppwaBankAccountTokenPaymentDetailsFragmentBinding) b()).accountHolderEditText.setText(bankAccount.getHolder());
        ((OppwaBankAccountTokenPaymentDetailsFragmentBinding) b()).ibanEditText.setText(b(bankAccount.getIban()));
    }

    private String b(String str) {
        InputFormatter inputFormatter = new InputFormatter(InputFormatter.IBAN_MASK);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        inputFormatter.applyMask(spannableStringBuilder);
        return spannableStringBuilder.toString();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        T inflate = OppwaBankAccountTokenPaymentDetailsFragmentBinding.inflate(layoutInflater, viewGroup, false);
        this.f121180a = inflate;
        return inflate.getRoot();
    }

    public void onUiComponentCreated(BankAccountTokenUiComponentInteraction bankAccountTokenUiComponentInteraction) {
        a((PaymentDetailsUiComponentInteraction) bankAccountTokenUiComponentInteraction, ((OppwaBankAccountTokenPaymentDetailsFragmentBinding) b()).header);
        a(((OppwaBankAccountTokenPaymentDetailsFragmentBinding) b()).paymentInfoHeader, bankAccountTokenUiComponentInteraction.getBrand());
        a(bankAccountTokenUiComponentInteraction.getBankAccount());
        a((PaymentDetailsUiComponentInteraction) bankAccountTokenUiComponentInteraction, ((OppwaBankAccountTokenPaymentDetailsFragmentBinding) b()).paymentButtonLayout.paymentButton);
    }
}
