package com.oppwa.mobile.connect.payment;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

public class CartItem implements Parcelable {
    public static final Parcelable.Creator<CartItem> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f121714a;

    /* renamed from: b  reason: collision with root package name */
    private final String f121715b;

    /* renamed from: c  reason: collision with root package name */
    private final String f121716c;

    /* renamed from: d  reason: collision with root package name */
    private final String f121717d;

    /* renamed from: e  reason: collision with root package name */
    private final String f121718e;

    /* renamed from: f  reason: collision with root package name */
    private final String f121719f;

    /* renamed from: g  reason: collision with root package name */
    private final String f121720g;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f121721a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f121722b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f121723c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public String f121724d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public String f121725e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public String f121726f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public String f121727g;

        public CartItem build() {
            return new CartItem(this);
        }

        public Builder setImageUrl(String str) {
            this.f121726f = str;
            return this;
        }

        public Builder setName(String str) {
            this.f121721a = str;
            return this;
        }

        public Builder setPrice(String str) {
            this.f121723c = str;
            return this;
        }

        public Builder setProductUrl(String str) {
            this.f121725e = str;
            return this;
        }

        public Builder setQuantity(String str) {
            this.f121722b = str;
            return this;
        }

        public Builder setSku(String str) {
            this.f121724d = str;
            return this;
        }

        public Builder setTotalDiscountAmount(String str) {
            this.f121727g = str;
            return this;
        }
    }

    class a implements Parcelable.Creator<CartItem> {
        a() {
        }

        /* renamed from: a */
        public CartItem createFromParcel(Parcel parcel) {
            return new CartItem(parcel);
        }

        /* renamed from: a */
        public CartItem[] newArray(int i10) {
            return new CartItem[i10];
        }
    }

    public CartItem(Builder builder) {
        this.f121714a = builder.f121721a;
        this.f121715b = builder.f121722b;
        this.f121716c = builder.f121723c;
        this.f121717d = builder.f121724d;
        this.f121718e = builder.f121725e;
        this.f121719f = builder.f121726f;
        this.f121720g = builder.f121727g;
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
        CartItem cartItem = (CartItem) obj;
        return Objects.equals(this.f121714a, cartItem.f121714a) && Objects.equals(this.f121715b, cartItem.f121715b) && Objects.equals(this.f121716c, cartItem.f121716c) && Objects.equals(this.f121717d, cartItem.f121717d) && Objects.equals(this.f121718e, cartItem.f121718e) && Objects.equals(this.f121719f, cartItem.f121719f) && Objects.equals(this.f121720g, cartItem.f121720g);
    }

    public String getImageUrl() {
        return this.f121719f;
    }

    public String getName() {
        return this.f121714a;
    }

    public String getPrice() {
        return this.f121716c;
    }

    public String getProductUrl() {
        return this.f121718e;
    }

    public String getQuantity() {
        return this.f121715b;
    }

    public String getSku() {
        return this.f121717d;
    }

    public String getTotalDiscountAmount() {
        return this.f121720g;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f121714a, this.f121715b, this.f121716c, this.f121717d, this.f121718e, this.f121719f, this.f121720g});
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f121714a);
        parcel.writeString(this.f121715b);
        parcel.writeString(this.f121716c);
        parcel.writeString(this.f121717d);
        parcel.writeString(this.f121718e);
        parcel.writeString(this.f121719f);
        parcel.writeString(this.f121720g);
    }

    protected CartItem(Parcel parcel) {
        this.f121714a = parcel.readString();
        this.f121715b = parcel.readString();
        this.f121716c = parcel.readString();
        this.f121717d = parcel.readString();
        this.f121718e = parcel.readString();
        this.f121719f = parcel.readString();
        this.f121720g = parcel.readString();
    }
}
