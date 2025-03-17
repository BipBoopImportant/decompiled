package com.oppwa.mobile.connect.payment;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

public class CheckoutData implements Parcelable {
    public static final Parcelable.Creator<CheckoutData> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final ShippingAddress f121728a;

    /* renamed from: b  reason: collision with root package name */
    private final BillingAddress f121729b;

    /* renamed from: c  reason: collision with root package name */
    private final Cart f121730c;

    /* renamed from: d  reason: collision with root package name */
    private final String f121731d;

    /* renamed from: e  reason: collision with root package name */
    private final String f121732e;

    /* renamed from: f  reason: collision with root package name */
    private final String f121733f;

    /* renamed from: g  reason: collision with root package name */
    private final String f121734g;

    /* renamed from: h  reason: collision with root package name */
    private final Merchant f121735h;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public ShippingAddress f121736a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public BillingAddress f121737b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public Cart f121738c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public String f121739d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public String f121740e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public String f121741f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public String f121742g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public Merchant f121743h;

        public CheckoutData build() {
            return new CheckoutData(this);
        }

        public Builder setAmount(String str) {
            this.f121739d = str;
            return this;
        }

        public Builder setBilling(BillingAddress billingAddress) {
            this.f121737b = billingAddress;
            return this;
        }

        public Builder setCart(Cart cart) {
            this.f121738c = cart;
            return this;
        }

        public Builder setCurrency(String str) {
            this.f121740e = str;
            return this;
        }

        public Builder setMerchant(Merchant merchant) {
            this.f121743h = merchant;
            return this;
        }

        public Builder setMerchantTransactionId(String str) {
            this.f121742g = str;
            return this;
        }

        public Builder setShipping(ShippingAddress shippingAddress) {
            this.f121736a = shippingAddress;
            return this;
        }

        public Builder setTaxAmount(String str) {
            this.f121741f = str;
            return this;
        }
    }

    class a implements Parcelable.Creator<CheckoutData> {
        a() {
        }

        /* renamed from: a */
        public CheckoutData createFromParcel(Parcel parcel) {
            return new CheckoutData(parcel, (a) null);
        }

        /* renamed from: a */
        public CheckoutData[] newArray(int i10) {
            return new CheckoutData[i10];
        }
    }

    /* synthetic */ CheckoutData(Parcel parcel, a aVar) {
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
        CheckoutData checkoutData = (CheckoutData) obj;
        return Objects.equals(this.f121728a, checkoutData.f121728a) && Objects.equals(this.f121729b, checkoutData.f121729b) && Objects.equals(this.f121730c, checkoutData.f121730c) && Objects.equals(this.f121731d, checkoutData.f121731d) && Objects.equals(this.f121732e, checkoutData.f121732e) && Objects.equals(this.f121733f, checkoutData.f121733f) && Objects.equals(this.f121734g, checkoutData.f121734g) && Objects.equals(this.f121735h, checkoutData.f121735h);
    }

    public String getAmount() {
        return this.f121731d;
    }

    public BillingAddress getBilling() {
        return this.f121729b;
    }

    public Cart getCart() {
        return this.f121730c;
    }

    public String getCurrency() {
        return this.f121732e;
    }

    public Merchant getMerchant() {
        return this.f121735h;
    }

    public String getMerchantTransactionId() {
        return this.f121734g;
    }

    public ShippingAddress getShipping() {
        return this.f121728a;
    }

    public String getTaxAmount() {
        return this.f121733f;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f121728a, this.f121729b, this.f121730c, this.f121731d, this.f121732e, this.f121733f, this.f121734g, this.f121735h});
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f121731d);
        parcel.writeString(this.f121732e);
        parcel.writeString(this.f121733f);
        parcel.writeString(this.f121734g);
        parcel.writeParcelable(this.f121728a, i10);
        parcel.writeParcelable(this.f121729b, i10);
        parcel.writeParcelable(this.f121730c, i10);
        parcel.writeParcelable(this.f121735h, i10);
    }

    public CheckoutData(Builder builder) {
        this.f121728a = builder.f121736a;
        this.f121729b = builder.f121737b;
        this.f121730c = builder.f121738c;
        this.f121731d = builder.f121739d;
        this.f121732e = builder.f121740e;
        this.f121733f = builder.f121741f;
        this.f121734g = builder.f121742g;
        this.f121735h = builder.f121743h;
    }

    private CheckoutData(Parcel parcel) {
        this.f121731d = parcel.readString();
        this.f121732e = parcel.readString();
        this.f121733f = parcel.readString();
        this.f121734g = parcel.readString();
        this.f121728a = (ShippingAddress) parcel.readParcelable(ShippingAddress.class.getClassLoader());
        this.f121729b = (BillingAddress) parcel.readParcelable(BillingAddress.class.getClassLoader());
        this.f121730c = (Cart) parcel.readParcelable(Cart.class.getClassLoader());
        this.f121735h = (Merchant) parcel.readParcelable(Merchant.class.getClassLoader());
    }
}
