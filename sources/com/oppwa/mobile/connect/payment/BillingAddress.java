package com.oppwa.mobile.connect.payment;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

public class BillingAddress implements Parcelable {
    public static final Parcelable.Creator<BillingAddress> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f121667a;

    /* renamed from: b  reason: collision with root package name */
    private final String f121668b;

    /* renamed from: c  reason: collision with root package name */
    private final String f121669c;

    /* renamed from: d  reason: collision with root package name */
    private final String f121670d;

    /* renamed from: e  reason: collision with root package name */
    private final String f121671e;

    /* renamed from: f  reason: collision with root package name */
    private final String f121672f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f121673g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f121674h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f121675i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f121676j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f121677k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f121678l;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f121679a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f121680b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f121681c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public String f121682d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public String f121683e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public String f121684f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public Boolean f121685g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public Boolean f121686h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public Boolean f121687i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public Boolean f121688j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public Boolean f121689k;
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public Boolean f121690l;

        public BillingAddress build() {
            return new BillingAddress(this, (a) null);
        }

        public Builder setCity(String str) {
            this.f121681c = str;
            return this;
        }

        public Builder setCityRequired(Boolean bool) {
            this.f121687i = bool;
            return this;
        }

        public Builder setCountry(String str) {
            this.f121679a = str;
            return this;
        }

        public Builder setCountryRequired(Boolean bool) {
            this.f121685g = bool;
            return this;
        }

        public Builder setPostCode(String str) {
            this.f121682d = str;
            return this;
        }

        public Builder setPostCodeRequired(Boolean bool) {
            this.f121688j = bool;
            return this;
        }

        public Builder setState(String str) {
            this.f121680b = str;
            return this;
        }

        public Builder setStateRequired(Boolean bool) {
            this.f121686h = bool;
            return this;
        }

        public Builder setStreet1(String str) {
            this.f121683e = str;
            return this;
        }

        public Builder setStreet1Required(Boolean bool) {
            this.f121689k = bool;
            return this;
        }

        public Builder setStreet2(String str) {
            this.f121684f = str;
            return this;
        }

        public Builder setStreet2Required(Boolean bool) {
            this.f121690l = bool;
            return this;
        }
    }

    class a implements Parcelable.Creator<BillingAddress> {
        a() {
        }

        /* renamed from: a */
        public BillingAddress createFromParcel(Parcel parcel) {
            return new BillingAddress(parcel, (a) null);
        }

        /* renamed from: a */
        public BillingAddress[] newArray(int i10) {
            return new BillingAddress[i10];
        }
    }

    /* synthetic */ BillingAddress(Parcel parcel, a aVar) {
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
        BillingAddress billingAddress = (BillingAddress) obj;
        return this.f121673g == billingAddress.f121673g && this.f121674h == billingAddress.f121674h && this.f121675i == billingAddress.f121675i && this.f121676j == billingAddress.f121676j && this.f121677k == billingAddress.f121677k && this.f121678l == billingAddress.f121678l && Objects.equals(this.f121667a, billingAddress.f121667a) && Objects.equals(this.f121668b, billingAddress.f121668b) && Objects.equals(this.f121669c, billingAddress.f121669c) && Objects.equals(this.f121670d, billingAddress.f121670d) && Objects.equals(this.f121671e, billingAddress.f121671e) && Objects.equals(this.f121672f, billingAddress.f121672f);
    }

    public String getCity() {
        return this.f121669c;
    }

    public String getCountry() {
        return this.f121667a;
    }

    public String getPostCode() {
        return this.f121670d;
    }

    public String getState() {
        return this.f121668b;
    }

    public String getStreet1() {
        return this.f121671e;
    }

    public String getStreet2() {
        return this.f121672f;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f121667a, this.f121668b, this.f121669c, this.f121670d, this.f121671e, this.f121672f, Boolean.valueOf(this.f121673g), Boolean.valueOf(this.f121674h), Boolean.valueOf(this.f121675i), Boolean.valueOf(this.f121676j), Boolean.valueOf(this.f121677k), Boolean.valueOf(this.f121678l)});
    }

    public boolean isCityRequired() {
        return this.f121675i;
    }

    public boolean isCountryRequired() {
        return this.f121673g;
    }

    public boolean isPostCodeRequired() {
        return this.f121676j;
    }

    public boolean isStateRequired() {
        return this.f121674h;
    }

    public boolean isStreet1Required() {
        return this.f121677k;
    }

    public boolean isStreet2Required() {
        return this.f121678l;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f121667a);
        parcel.writeString(this.f121668b);
        parcel.writeString(this.f121669c);
        parcel.writeString(this.f121670d);
        parcel.writeString(this.f121671e);
        parcel.writeString(this.f121672f);
        parcel.writeByte(this.f121673g ? (byte) 1 : 0);
        parcel.writeByte(this.f121674h ? (byte) 1 : 0);
        parcel.writeByte(this.f121675i ? (byte) 1 : 0);
        parcel.writeByte(this.f121676j ? (byte) 1 : 0);
        parcel.writeByte(this.f121677k ? (byte) 1 : 0);
        parcel.writeByte(this.f121678l ? (byte) 1 : 0);
    }

    /* synthetic */ BillingAddress(Builder builder, a aVar) {
        this(builder);
    }

    private BillingAddress(Builder builder) {
        this.f121667a = builder.f121679a;
        this.f121668b = builder.f121680b;
        this.f121669c = builder.f121681c;
        this.f121670d = builder.f121682d;
        this.f121671e = builder.f121683e;
        this.f121672f = builder.f121684f;
        boolean z10 = true;
        this.f121673g = builder.f121685g == null || builder.f121685g.booleanValue();
        this.f121674h = builder.f121686h == null || builder.f121686h.booleanValue();
        this.f121675i = builder.f121687i == null || builder.f121687i.booleanValue();
        this.f121676j = builder.f121688j == null || builder.f121688j.booleanValue();
        this.f121677k = builder.f121689k == null || builder.f121689k.booleanValue();
        this.f121678l = (builder.f121690l == null || !builder.f121690l.booleanValue()) ? false : z10;
    }

    private BillingAddress(Parcel parcel) {
        this.f121667a = parcel.readString();
        this.f121668b = parcel.readString();
        this.f121669c = parcel.readString();
        this.f121670d = parcel.readString();
        this.f121671e = parcel.readString();
        this.f121672f = parcel.readString();
        boolean z10 = false;
        this.f121673g = parcel.readByte() != 0;
        this.f121674h = parcel.readByte() != 0;
        this.f121675i = parcel.readByte() != 0;
        this.f121676j = parcel.readByte() != 0;
        this.f121677k = parcel.readByte() != 0;
        this.f121678l = parcel.readByte() != 0 ? true : z10;
    }
}
