package com.oppwa.mobile.connect.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.utils.Utils;

public final class CardBrandInfo implements Parcelable {
    public static final Parcelable.Creator<CardBrandInfo> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private String f121704a;

    /* renamed from: b  reason: collision with root package name */
    private String f121705b;

    /* renamed from: c  reason: collision with root package name */
    private String f121706c;

    /* renamed from: d  reason: collision with root package name */
    private CVVMode f121707d;

    /* renamed from: e  reason: collision with root package name */
    private int f121708e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f121709f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f121710g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f121711h;

    class a implements Parcelable.Creator<CardBrandInfo> {
        a() {
        }

        /* renamed from: a */
        public CardBrandInfo createFromParcel(Parcel parcel) {
            return new CardBrandInfo(parcel, (a) null);
        }

        /* renamed from: a */
        public CardBrandInfo[] newArray(int i10) {
            return new CardBrandInfo[i10];
        }
    }

    /* synthetic */ CardBrandInfo(Parcel parcel, a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CardBrandInfo.class != obj.getClass()) {
            return false;
        }
        CardBrandInfo cardBrandInfo = (CardBrandInfo) obj;
        return Utils.compare(this.f121704a, cardBrandInfo.f121704a) && Utils.compare(this.f121705b, cardBrandInfo.f121705b) && Utils.compare(this.f121706c, cardBrandInfo.f121706c) && Utils.compare(this.f121707d, cardBrandInfo.f121707d) && this.f121708e == cardBrandInfo.f121708e && this.f121709f == cardBrandInfo.f121709f && this.f121710g == cardBrandInfo.f121710g && this.f121711h == cardBrandInfo.f121711h;
    }

    public int getCvvLength() {
        return this.f121708e;
    }

    public CVVMode getCvvMode() {
        return this.f121707d;
    }

    public String getDetection() {
        return this.f121705b;
    }

    public String getPattern() {
        return this.f121706c;
    }

    public String getValidation() {
        return this.f121704a;
    }

    public int hashCode() {
        int hashCode = this.f121704a.hashCode() * 31;
        String str = this.f121705b;
        return ((((((((((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f121706c.hashCode()) * 31) + this.f121707d.hashCode()) * 31) + this.f121708e) * 31) + (this.f121709f ? 1 : 0)) * 31) + (this.f121710g ? 1 : 0)) * 31) + (this.f121711h ? 1 : 0);
    }

    public boolean isExpiryDateOptional() {
        return this.f121710g;
    }

    public boolean isLuhnCheckRequired() {
        return this.f121709f;
    }

    public boolean isMobilePhoneRequired() {
        return this.f121711h;
    }

    public CardBrandInfo setCvvLength(int i10) {
        this.f121708e = i10;
        return this;
    }

    public CardBrandInfo setCvvMode(CVVMode cVVMode) {
        this.f121707d = cVVMode;
        return this;
    }

    public CardBrandInfo setDetection(String str) {
        this.f121705b = str;
        return this;
    }

    public CardBrandInfo setExpiryDateOptional(boolean z10) {
        this.f121710g = z10;
        return this;
    }

    public CardBrandInfo setLuhnCheckRequired(boolean z10) {
        this.f121709f = z10;
        return this;
    }

    public CardBrandInfo setMobilePhoneRequired(boolean z10) {
        this.f121711h = z10;
        return this;
    }

    public CardBrandInfo setPattern(String str) {
        this.f121706c = str;
        return this;
    }

    public CardBrandInfo setValidation(String str) {
        this.f121704a = str;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f121704a);
        parcel.writeString(this.f121705b);
        parcel.writeString(this.f121706c);
        parcel.writeParcelable(this.f121707d, 0);
        parcel.writeInt(this.f121708e);
        parcel.writeByte(this.f121709f ? (byte) 1 : 0);
        parcel.writeByte(this.f121710g ? (byte) 1 : 0);
        parcel.writeByte(this.f121711h ? (byte) 1 : 0);
    }

    public CardBrandInfo() {
        this.f121704a = "[0-9]{10,19}";
        this.f121706c = "#### #### #### #### ###";
        this.f121707d = CVVMode.REQUIRED;
        this.f121708e = 3;
        this.f121709f = true;
        this.f121710g = false;
        this.f121711h = false;
    }

    private CardBrandInfo(Parcel parcel) {
        this.f121704a = "[0-9]{10,19}";
        this.f121706c = "#### #### #### #### ###";
        this.f121707d = CVVMode.REQUIRED;
        this.f121708e = 3;
        boolean z10 = true;
        this.f121709f = true;
        this.f121710g = false;
        this.f121711h = false;
        this.f121704a = parcel.readString();
        this.f121705b = parcel.readString();
        this.f121706c = parcel.readString();
        this.f121707d = (CVVMode) parcel.readParcelable(CVVMode.class.getClassLoader());
        this.f121708e = parcel.readInt();
        this.f121709f = parcel.readByte() != 0;
        this.f121710g = parcel.readByte() != 0;
        this.f121711h = parcel.readByte() == 0 ? false : z10;
    }
}
