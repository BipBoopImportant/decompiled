package com.oppwa.mobile.connect.payment.processor.cashapppay;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.checkout.meta.AfterpayPacificConfig;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;

public class CashAppPayConfig extends AfterpayPacificConfig {
    public static final Parcelable.Creator<CashAppPayConfig> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    private final String f121921e;

    class a implements Parcelable.Creator<CashAppPayConfig> {
        a() {
        }

        /* renamed from: a */
        public CashAppPayConfig createFromParcel(Parcel parcel) {
            return new CashAppPayConfig(parcel);
        }

        /* renamed from: a */
        public CashAppPayConfig[] newArray(int i10) {
            return new CashAppPayConfig[i10];
        }
    }

    public CashAppPayConfig(String str, String str2, Locale locale, Locale locale2, String str3) {
        super(str, str2, locale, locale2);
        this.f121921e = str3;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException a() {
        return new IllegalArgumentException("The currencyCode is null");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof CashAppPayConfig) && super.equals(obj)) {
            return Objects.equals(this.f121921e, ((CashAppPayConfig) obj).f121921e);
        }
        return false;
    }

    public String getCurrencyCode() {
        return this.f121921e;
    }

    public String getPaymentBrand() {
        return CheckoutConstants.PaymentBrands.CASH_APP_PAY;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f121921e});
    }

    public String toString() {
        return "CashAppPayConfig{minimumAmount='" + getMinimumAmount() + '\'' + ", maximumAmount='" + getMaximumAmount() + '\'' + ", locale=" + getLocale() + ", consumerLocale=" + getConsumerLocale() + ", currencyCode=" + this.f121921e + '}';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f121921e);
    }

    protected CashAppPayConfig(Parcel parcel) {
        super(parcel);
        this.f121921e = (String) Optional.ofNullable(parcel.readString()).orElseThrow(new a());
    }
}
