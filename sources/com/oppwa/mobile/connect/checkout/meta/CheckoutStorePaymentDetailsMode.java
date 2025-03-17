package com.oppwa.mobile.connect.checkout.meta;

import android.os.Parcel;
import android.os.Parcelable;

public enum CheckoutStorePaymentDetailsMode implements Parcelable {
    ALWAYS,
    PROMPT,
    NEVER;
    
    public static final Parcelable.Creator<CheckoutStorePaymentDetailsMode> CREATOR = null;

    class a implements Parcelable.Creator<CheckoutStorePaymentDetailsMode> {
        a() {
        }

        /* renamed from: a */
        public CheckoutStorePaymentDetailsMode createFromParcel(Parcel parcel) {
            return CheckoutStorePaymentDetailsMode.values()[parcel.readInt()];
        }

        /* renamed from: a */
        public CheckoutStorePaymentDetailsMode[] newArray(int i10) {
            return new CheckoutStorePaymentDetailsMode[i10];
        }
    }

    static {
        CREATOR = new a();
    }

    public static CheckoutStorePaymentDetailsMode getByName(String str) {
        for (CheckoutStorePaymentDetailsMode checkoutStorePaymentDetailsMode : values()) {
            if (checkoutStorePaymentDetailsMode.name().equals(str)) {
                return checkoutStorePaymentDetailsMode;
            }
        }
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(ordinal());
    }
}
