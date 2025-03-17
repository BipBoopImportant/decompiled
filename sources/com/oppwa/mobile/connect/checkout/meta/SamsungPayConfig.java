package com.oppwa.mobile.connect.checkout.meta;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.sdk.samsungpay.v2.payment.CardInfo;
import com.samsung.android.sdk.samsungpay.v2.payment.CustomSheetPaymentInfo;
import com.samsung.android.sdk.samsungpay.v2.payment.sheet.CustomSheet;
import java.util.Objects;

public class SamsungPayConfig implements Parcelable {
    public static final Parcelable.Creator<SamsungPayConfig> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f121450a;

    /* renamed from: b  reason: collision with root package name */
    private final a f121451b;

    /* renamed from: c  reason: collision with root package name */
    private CardInfoUpdateListener f121452c;

    public interface CardInfoUpdateListener extends Parcelable {
        void onCardInfoUpdated(CardInfo cardInfo, CustomSheet customSheet);
    }

    class a implements Parcelable.Creator<SamsungPayConfig> {
        a() {
        }

        /* renamed from: a */
        public SamsungPayConfig createFromParcel(Parcel parcel) {
            return new SamsungPayConfig(parcel, (a) null);
        }

        /* renamed from: a */
        public SamsungPayConfig[] newArray(int i10) {
            return new SamsungPayConfig[i10];
        }
    }

    /* synthetic */ SamsungPayConfig(Parcel parcel, a aVar) {
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
        SamsungPayConfig samsungPayConfig = (SamsungPayConfig) obj;
        return this.f121450a.equals(samsungPayConfig.f121450a) && this.f121451b.equals(samsungPayConfig.f121451b);
    }

    public CardInfoUpdateListener getCardInfoUpdateListener() {
        return this.f121452c;
    }

    public CustomSheetPaymentInfo getCustomSheetPaymentInfo() {
        return this.f121451b.f();
    }

    public String getServiceId() {
        return this.f121450a;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f121450a, this.f121451b});
    }

    public SamsungPayConfig setCardInfoUpdateListener(CardInfoUpdateListener cardInfoUpdateListener) {
        this.f121452c = cardInfoUpdateListener;
        return this;
    }

    public String toString() {
        return "SamsungPayConfig{serviceId='" + this.f121450a + '\'' + ", customSheetPaymentInfo=" + this.f121451b + ", cardInfoUpdateListener=" + this.f121452c + '}';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f121450a);
        parcel.writeParcelable(this.f121451b.f(), 0);
        parcel.writeParcelable(this.f121452c, 0);
    }

    public SamsungPayConfig(String str, CustomSheetPaymentInfo customSheetPaymentInfo) {
        this.f121450a = str;
        this.f121451b = new a(customSheetPaymentInfo);
    }

    private SamsungPayConfig(Parcel parcel) {
        this.f121450a = parcel.readString();
        this.f121451b = new a(parcel.readParcelable(CustomSheetPaymentInfo.class.getClassLoader()));
        this.f121452c = (CardInfoUpdateListener) parcel.readParcelable(CardInfoUpdateListener.class.getClassLoader());
    }
}
