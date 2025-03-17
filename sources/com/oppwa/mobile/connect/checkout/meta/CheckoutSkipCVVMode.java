package com.oppwa.mobile.connect.checkout.meta;

import android.os.Parcel;
import android.os.Parcelable;

public enum CheckoutSkipCVVMode implements Parcelable {
    NEVER,
    ALWAYS,
    FOR_STORED_CARDS;
    
    public static final Parcelable.Creator<CheckoutSkipCVVMode> CREATOR = null;

    class a implements Parcelable.Creator<CheckoutSkipCVVMode> {
        a() {
        }

        /* renamed from: a */
        public CheckoutSkipCVVMode createFromParcel(Parcel parcel) {
            return CheckoutSkipCVVMode.values()[parcel.readInt()];
        }

        /* renamed from: a */
        public CheckoutSkipCVVMode[] newArray(int i10) {
            return new CheckoutSkipCVVMode[i10];
        }
    }

    static {
        CREATOR = new a();
    }

    public static CheckoutSkipCVVMode getByName(String str) {
        for (CheckoutSkipCVVMode checkoutSkipCVVMode : values()) {
            if (checkoutSkipCVVMode.name().equalsIgnoreCase(str)) {
                return checkoutSkipCVVMode;
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
