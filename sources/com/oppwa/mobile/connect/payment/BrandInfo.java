package com.oppwa.mobile.connect.payment;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import java.util.Optional;

public final class BrandInfo implements Parcelable {
    public static final Parcelable.Creator<BrandInfo> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f121691a;

    /* renamed from: b  reason: collision with root package name */
    private String f121692b;

    /* renamed from: c  reason: collision with root package name */
    private final String f121693c;

    /* renamed from: d  reason: collision with root package name */
    private CardBrandInfo f121694d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f121695e;

    class a implements Parcelable.Creator<BrandInfo> {
        a() {
        }

        /* renamed from: a */
        public BrandInfo createFromParcel(Parcel parcel) {
            return new BrandInfo(parcel, (a) null);
        }

        /* renamed from: a */
        public BrandInfo[] newArray(int i10) {
            return new BrandInfo[i10];
        }
    }

    /* synthetic */ BrandInfo(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException a() {
        return new IllegalArgumentException("The brand can't be null");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException b() {
        return new IllegalArgumentException("The label can't be null");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException c() {
        return new IllegalArgumentException("The render type can't be null");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BrandInfo.class != obj.getClass()) {
            return false;
        }
        BrandInfo brandInfo = (BrandInfo) obj;
        return this.f121695e == brandInfo.f121695e && Objects.equals(this.f121691a, brandInfo.f121691a) && Objects.equals(this.f121692b, brandInfo.f121692b) && Objects.equals(this.f121693c, brandInfo.f121693c) && Objects.equals(this.f121694d, brandInfo.f121694d);
    }

    public String getBrand() {
        return this.f121691a;
    }

    public CardBrandInfo getCardBrandInfo() {
        return this.f121694d;
    }

    public String getLabel() {
        return this.f121692b;
    }

    public String getRenderType() {
        return this.f121693c;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f121691a, this.f121692b, this.f121693c, this.f121694d, Boolean.valueOf(this.f121695e)});
    }

    public boolean isCardBrand() {
        return this.f121693c.equals("CC");
    }

    public boolean isCustomUiRequired() {
        return this.f121695e;
    }

    public BrandInfo setCardBrandInfo(CardBrandInfo cardBrandInfo) {
        this.f121694d = cardBrandInfo;
        return this;
    }

    public BrandInfo setCustomUiRequired(boolean z10) {
        this.f121695e = z10;
        return this;
    }

    public BrandInfo setLabel(String str) {
        this.f121692b = str;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f121691a);
        parcel.writeString(this.f121692b);
        parcel.writeString(this.f121693c);
        parcel.writeParcelable(this.f121694d, i10);
        parcel.writeByte(this.f121695e ? (byte) 1 : 0);
    }

    public BrandInfo(String str, String str2, String str3) {
        this.f121695e = false;
        this.f121691a = str;
        this.f121692b = str3;
        this.f121693c = str2;
    }

    public BrandInfo(String str, String str2) {
        this(str, str2, "");
    }

    private BrandInfo(Parcel parcel) {
        boolean z10 = false;
        this.f121695e = false;
        this.f121691a = (String) Optional.ofNullable(parcel.readString()).orElseThrow(new b());
        this.f121692b = (String) Optional.ofNullable(parcel.readString()).orElseThrow(new c());
        this.f121693c = (String) Optional.ofNullable(parcel.readString()).orElseThrow(new d());
        this.f121694d = (CardBrandInfo) parcel.readParcelable(CardBrandInfo.class.getClassLoader());
        this.f121695e = parcel.readByte() != 0 ? true : z10;
    }
}
