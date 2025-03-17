package com.oppwa.mobile.connect.checkout.meta;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.payment.BrandConfig;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;

public class AfterpayPacificConfig implements Parcelable, BrandConfig {
    public static final Parcelable.Creator<AfterpayPacificConfig> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f121363a;

    /* renamed from: b  reason: collision with root package name */
    private final String f121364b;

    /* renamed from: c  reason: collision with root package name */
    private final Locale f121365c;

    /* renamed from: d  reason: collision with root package name */
    private final Locale f121366d;

    class a implements Parcelable.Creator<AfterpayPacificConfig> {
        a() {
        }

        /* renamed from: a */
        public AfterpayPacificConfig createFromParcel(Parcel parcel) {
            return new AfterpayPacificConfig(parcel);
        }

        /* renamed from: a */
        public AfterpayPacificConfig[] newArray(int i10) {
            return new AfterpayPacificConfig[i10];
        }
    }

    public AfterpayPacificConfig(String str, String str2, Locale locale, Locale locale2) {
        this.f121363a = str;
        this.f121364b = str2;
        this.f121365c = locale;
        this.f121366d = locale2;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException a() {
        return new IllegalArgumentException("The maximumAmount is null");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException b() {
        return new IllegalArgumentException("The locale is null");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException c() {
        return new IllegalArgumentException("The consumerLocale is null");
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
        AfterpayPacificConfig afterpayPacificConfig = (AfterpayPacificConfig) obj;
        return Objects.equals(this.f121363a, afterpayPacificConfig.f121363a) && Objects.equals(this.f121364b, afterpayPacificConfig.f121364b) && Objects.equals(this.f121365c, afterpayPacificConfig.f121365c) && Objects.equals(this.f121366d, afterpayPacificConfig.f121366d);
    }

    public Locale getConsumerLocale() {
        return this.f121366d;
    }

    public Locale getLocale() {
        return this.f121365c;
    }

    public String getMaximumAmount() {
        return this.f121364b;
    }

    public String getMinimumAmount() {
        return this.f121363a;
    }

    public String getPaymentBrand() {
        return CheckoutConstants.PaymentBrands.AFTERPAY_PACIFIC;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f121363a, this.f121364b, this.f121365c, this.f121366d});
    }

    public String toString() {
        return "AfterpayPacificConfig{minimumAmount='" + this.f121363a + '\'' + ", maximumAmount='" + this.f121364b + '\'' + ", locale=" + this.f121365c + ", consumerLocale=" + this.f121366d + '}';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f121363a);
        parcel.writeString(this.f121364b);
        parcel.writeString(this.f121365c.toLanguageTag());
        parcel.writeString(this.f121366d.toLanguageTag());
    }

    protected AfterpayPacificConfig(Parcel parcel) {
        this.f121363a = parcel.readString();
        this.f121364b = (String) Optional.ofNullable(parcel.readString()).orElseThrow(new b());
        this.f121365c = Locale.forLanguageTag((String) Optional.ofNullable(parcel.readString()).orElseThrow(new c()));
        this.f121366d = Locale.forLanguageTag((String) Optional.ofNullable(parcel.readString()).orElseThrow(new d()));
    }
}
