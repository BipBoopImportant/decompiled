package com.oppwa.mobile.connect.payment;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

public class ShippingAddress implements Parcelable {
    public static final Parcelable.Creator<ShippingAddress> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f121794a;

    /* renamed from: b  reason: collision with root package name */
    private final String f121795b;

    /* renamed from: c  reason: collision with root package name */
    private final String f121796c;

    /* renamed from: d  reason: collision with root package name */
    private final String f121797d;

    /* renamed from: e  reason: collision with root package name */
    private final String f121798e;

    /* renamed from: f  reason: collision with root package name */
    private final String f121799f;

    /* renamed from: g  reason: collision with root package name */
    private final Customer f121800g;

    /* renamed from: h  reason: collision with root package name */
    private final String f121801h;

    /* renamed from: i  reason: collision with root package name */
    private final String f121802i;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f121803a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f121804b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f121805c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public String f121806d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public String f121807e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public String f121808f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public Customer f121809g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public String f121810h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public String f121811i;

        public ShippingAddress build() {
            return new ShippingAddress(this);
        }

        public Builder setCity(String str) {
            this.f121805c = str;
            return this;
        }

        public Builder setCost(String str) {
            this.f121810h = str;
            return this;
        }

        public Builder setCountry(String str) {
            this.f121807e = str;
            return this;
        }

        public Builder setCustomer(Customer customer) {
            this.f121809g = customer;
            return this;
        }

        public Builder setPhone(String str) {
            this.f121811i = str;
            return this;
        }

        public Builder setPostcode(String str) {
            this.f121808f = str;
            return this;
        }

        public Builder setState(String str) {
            this.f121806d = str;
            return this;
        }

        public Builder setStreet1(String str) {
            this.f121803a = str;
            return this;
        }

        public Builder setStreet2(String str) {
            this.f121804b = str;
            return this;
        }
    }

    class a implements Parcelable.Creator<ShippingAddress> {
        a() {
        }

        /* renamed from: a */
        public ShippingAddress createFromParcel(Parcel parcel) {
            return new ShippingAddress(parcel, (a) null);
        }

        /* renamed from: a */
        public ShippingAddress[] newArray(int i10) {
            return new ShippingAddress[i10];
        }
    }

    /* synthetic */ ShippingAddress(Parcel parcel, a aVar) {
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
        ShippingAddress shippingAddress = (ShippingAddress) obj;
        return Objects.equals(this.f121794a, shippingAddress.f121794a) && Objects.equals(this.f121795b, shippingAddress.f121795b) && Objects.equals(this.f121796c, shippingAddress.f121796c) && Objects.equals(this.f121797d, shippingAddress.f121797d) && Objects.equals(this.f121798e, shippingAddress.f121798e) && Objects.equals(this.f121799f, shippingAddress.f121799f) && Objects.equals(this.f121800g, shippingAddress.f121800g) && Objects.equals(this.f121801h, shippingAddress.f121801h) && Objects.equals(this.f121802i, shippingAddress.f121802i);
    }

    public String getCity() {
        return this.f121796c;
    }

    public String getCost() {
        return this.f121801h;
    }

    public String getCountry() {
        return this.f121798e;
    }

    public Customer getCustomer() {
        return this.f121800g;
    }

    public String getPhone() {
        return this.f121802i;
    }

    public String getPostcode() {
        return this.f121799f;
    }

    public String getState() {
        return this.f121797d;
    }

    public String getStreet1() {
        return this.f121794a;
    }

    public String getStreet2() {
        return this.f121795b;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f121794a, this.f121795b, this.f121796c, this.f121797d, this.f121798e, this.f121799f, this.f121800g, this.f121801h, this.f121802i});
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f121794a);
        parcel.writeString(this.f121795b);
        parcel.writeString(this.f121796c);
        parcel.writeString(this.f121797d);
        parcel.writeString(this.f121798e);
        parcel.writeString(this.f121799f);
        parcel.writeString(this.f121801h);
        parcel.writeString(this.f121802i);
        parcel.writeParcelable(this.f121800g, i10);
    }

    public ShippingAddress(Builder builder) {
        this.f121794a = builder.f121803a;
        this.f121795b = builder.f121804b;
        this.f121796c = builder.f121805c;
        this.f121797d = builder.f121806d;
        this.f121798e = builder.f121807e;
        this.f121799f = builder.f121808f;
        this.f121800g = builder.f121809g;
        this.f121801h = builder.f121810h;
        this.f121802i = builder.f121811i;
    }

    private ShippingAddress(Parcel parcel) {
        this.f121794a = parcel.readString();
        this.f121795b = parcel.readString();
        this.f121796c = parcel.readString();
        this.f121797d = parcel.readString();
        this.f121798e = parcel.readString();
        this.f121799f = parcel.readString();
        this.f121801h = parcel.readString();
        this.f121802i = parcel.readString();
        this.f121800g = (Customer) parcel.readParcelable(Customer.class.getClassLoader());
    }
}
