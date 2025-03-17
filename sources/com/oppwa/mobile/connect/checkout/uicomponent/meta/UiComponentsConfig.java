package com.oppwa.mobile.connect.checkout.uicomponent.meta;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C5187o;
import com.oppwa.mobile.connect.checkout.uicomponent.aciinstantpay.AciInstantPayUiComponent;
import com.oppwa.mobile.connect.checkout.uicomponent.bankaccount.sepa.DirectDebitSepaUiComponent;
import com.oppwa.mobile.connect.checkout.uicomponent.bankaccount.token.BankAccountTokenUiComponent;
import com.oppwa.mobile.connect.checkout.uicomponent.card.CardUiComponent;
import com.oppwa.mobile.connect.checkout.uicomponent.card.token.CardTokenUiComponent;
import com.oppwa.mobile.connect.checkout.uicomponent.paymentmethodselection.PaymentMethodSelectionUiComponent;
import com.oppwa.mobile.connect.checkout.uicomponent.processing.ProcessingUiComponent;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class UiComponentsConfig implements Parcelable {
    public static final Parcelable.Creator<UiComponentsConfig> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Map<UiComponentType, String> f121537a;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final HashMap<UiComponentType, String> f121538a = new HashMap<>();

        public UiComponentsConfig build() {
            return new UiComponentsConfig(this, (a) null);
        }

        public <T extends C5187o & AciInstantPayUiComponent> Builder setAciInstantPayUiComponentClass(Class<T> cls) {
            this.f121538a.put(UiComponentType.ACI_INSTANTPAY, cls.getName());
            return this;
        }

        public <T extends C5187o & BankAccountTokenUiComponent> Builder setBankAccountTokenUiComponentClass(Class<T> cls) {
            this.f121538a.put(UiComponentType.BANK_ACCOUNT_TOKEN, cls.getName());
            return this;
        }

        public <T extends C5187o & CardTokenUiComponent> Builder setCardTokenUiComponentClass(Class<T> cls) {
            this.f121538a.put(UiComponentType.CARD_TOKEN, cls.getName());
            return this;
        }

        public <T extends C5187o & CardUiComponent> Builder setCardUiComponentClass(Class<T> cls) {
            this.f121538a.put(UiComponentType.CARD, cls.getName());
            return this;
        }

        public <T extends C5187o & DirectDebitSepaUiComponent> Builder setDirectDebitSepaUiComponentClass(Class<T> cls) {
            this.f121538a.put(UiComponentType.DIRECTDEBIT_SEPA, cls.getName());
            return this;
        }

        public <T extends C5187o & PaymentMethodSelectionUiComponent> Builder setPaymentMethodSelectionUiComponentClass(Class<T> cls) {
            this.f121538a.put(UiComponentType.PAYMENT_METHOD_SELECTION, cls.getName());
            return this;
        }

        public <T extends C5187o & ProcessingUiComponent> Builder setProcessingUiComponentClass(Class<T> cls) {
            this.f121538a.put(UiComponentType.PROCESSING, cls.getName());
            return this;
        }
    }

    class a implements Parcelable.Creator<UiComponentsConfig> {
        a() {
        }

        /* renamed from: a */
        public UiComponentsConfig createFromParcel(Parcel parcel) {
            return new UiComponentsConfig(parcel, (a) null);
        }

        /* renamed from: a */
        public UiComponentsConfig[] newArray(int i10) {
            return new UiComponentsConfig[i10];
        }
    }

    /* synthetic */ UiComponentsConfig(Parcel parcel, a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f121537a.equals(((UiComponentsConfig) obj).f121537a);
    }

    public String getUiComponentClassName(UiComponentType uiComponentType) {
        return this.f121537a.get(uiComponentType);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f121537a});
    }

    public String toString() {
        return "UiComponentsConfig{uiComponentsMap=" + this.f121537a + '}';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f121537a.size());
        for (UiComponentType next : this.f121537a.keySet()) {
            parcel.writeParcelable(next, 0);
            parcel.writeString(this.f121537a.get(next));
        }
    }

    /* synthetic */ UiComponentsConfig(Builder builder, a aVar) {
        this(builder);
    }

    private UiComponentsConfig(Builder builder) {
        this.f121537a = builder.f121538a;
    }

    private UiComponentsConfig(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f121537a = new HashMap(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f121537a.put((UiComponentType) parcel.readParcelable(UiComponentType.class.getClassLoader()), parcel.readString());
        }
    }
}
