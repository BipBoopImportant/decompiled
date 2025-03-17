package com.oppwa.mobile.connect.payment;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Cart implements Parcelable {
    public static final Parcelable.Creator<Cart> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private List<CartItem> f121712a;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public List<CartItem> f121713a;

        public Cart build() {
            return new Cart(this);
        }

        public Builder setItems(List<CartItem> list) {
            this.f121713a = list;
            return this;
        }
    }

    class a implements Parcelable.Creator<Cart> {
        a() {
        }

        /* renamed from: a */
        public Cart createFromParcel(Parcel parcel) {
            return new Cart(parcel);
        }

        /* renamed from: a */
        public Cart[] newArray(int i10) {
            return new Cart[i10];
        }
    }

    protected Cart(Parcel parcel) {
        if (parcel.readByte() > 0) {
            ArrayList arrayList = new ArrayList();
            this.f121712a = arrayList;
            parcel.readList(arrayList, CartItem.class.getClassLoader());
        }
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
        return Objects.equals(this.f121712a, ((Cart) obj).f121712a);
    }

    public List<CartItem> getItems() {
        return this.f121712a;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f121712a});
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte((byte) (this.f121712a != null ? 1 : 0));
        Optional.ofNullable(this.f121712a).ifPresent(new p(parcel));
    }

    public Cart(Builder builder) {
        this.f121712a = builder.f121713a;
    }
}
