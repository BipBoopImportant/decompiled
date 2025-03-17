package com.oppwa.mobile.connect.checkout.dialog;

import com.oppwa.mobile.connect.checkout.dialog.fragment.AciInstantPayPaymentDetailsFragment;
import com.oppwa.mobile.connect.checkout.dialog.fragment.ProcessingFragment;
import com.oppwa.mobile.connect.checkout.dialog.fragment.bankaccount.BankAccountTokenPaymentDetailsFragment;
import com.oppwa.mobile.connect.checkout.dialog.fragment.bankaccount.DirectDebitSepaPaymentDetailsFragment;
import com.oppwa.mobile.connect.checkout.dialog.fragment.card.CardPaymentDetailsFragment;
import com.oppwa.mobile.connect.checkout.dialog.fragment.card.CardTokenPaymentDetailsFragment;
import com.oppwa.mobile.connect.checkout.dialog.fragment.paymentmethodselection.PaymentMethodSelectionFragment;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponent;
import com.oppwa.mobile.connect.checkout.uicomponent.meta.UiComponentType;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.d0  reason: case insensitive filesystem */
class C14061d0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<UiComponentType, Class<? extends UiComponent<?>>> f121157a;

    static {
        HashMap hashMap = new HashMap();
        f121157a = hashMap;
        hashMap.put(UiComponentType.PROCESSING, ProcessingFragment.class);
        hashMap.put(UiComponentType.PAYMENT_METHOD_SELECTION, PaymentMethodSelectionFragment.class);
        hashMap.put(UiComponentType.CARD_TOKEN, CardTokenPaymentDetailsFragment.class);
        hashMap.put(UiComponentType.BANK_ACCOUNT_TOKEN, BankAccountTokenPaymentDetailsFragment.class);
        hashMap.put(UiComponentType.CARD, CardPaymentDetailsFragment.class);
        hashMap.put(UiComponentType.DIRECTDEBIT_SEPA, DirectDebitSepaPaymentDetailsFragment.class);
        hashMap.put(UiComponentType.ACI_INSTANTPAY, AciInstantPayPaymentDetailsFragment.class);
    }

    public static Class<? extends UiComponent<?>> a(UiComponentType uiComponentType) {
        return f121157a.get(uiComponentType);
    }
}
