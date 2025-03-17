package com.oppwa.mobile.connect.checkout.uicomponent.meta;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import com.oppwa.mobile.connect.checkout.uicomponent.aciinstantpay.AciInstantPayUiComponentContainer;
import com.oppwa.mobile.connect.checkout.uicomponent.bankaccount.sepa.DirectDebitSepaUiComponentContainer;
import com.oppwa.mobile.connect.checkout.uicomponent.bankaccount.token.BankAccountTokenUiComponentContainer;
import com.oppwa.mobile.connect.checkout.uicomponent.card.CardUiComponentContainer;
import com.oppwa.mobile.connect.checkout.uicomponent.card.token.CardTokenUiComponentContainer;
import com.oppwa.mobile.connect.checkout.uicomponent.paymentmethodselection.PaymentMethodSelectionUiComponentContainer;
import com.oppwa.mobile.connect.checkout.uicomponent.processing.ProcessingUiComponentContainer;

public enum UiComponentType implements Parcelable {
    PROCESSING(ProcessingUiComponentContainer.class),
    PAYMENT_METHOD_SELECTION(PaymentMethodSelectionUiComponentContainer.class),
    CARD_TOKEN(CardTokenUiComponentContainer.class),
    BANK_ACCOUNT_TOKEN(BankAccountTokenUiComponentContainer.class),
    CARD(CardUiComponentContainer.class),
    DIRECTDEBIT_SEPA(DirectDebitSepaUiComponentContainer.class),
    ACI_INSTANTPAY(AciInstantPayUiComponentContainer.class);
    
    public static final Parcelable.Creator<UiComponentType> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    private final Class<? extends UiComponentContainer<?>> f121536a;

    class a implements Parcelable.Creator<UiComponentType> {
        a() {
        }

        /* renamed from: a */
        public UiComponentType createFromParcel(Parcel parcel) {
            return UiComponentType.values()[parcel.readInt()];
        }

        /* renamed from: a */
        public UiComponentType[] newArray(int i10) {
            return new UiComponentType[i10];
        }
    }

    static {
        CREATOR = new a();
    }

    private UiComponentType(Class<? extends UiComponentContainer<?>> cls) {
        this.f121536a = cls;
    }

    public static UiComponentType getByName(String str) {
        try {
            return valueOf(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public int describeContents() {
        return 0;
    }

    public Class<? extends UiComponentContainer<?>> getContainerClass() {
        return this.f121536a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(ordinal());
    }
}
