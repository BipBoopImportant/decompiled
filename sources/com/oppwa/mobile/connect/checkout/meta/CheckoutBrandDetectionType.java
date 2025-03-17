package com.oppwa.mobile.connect.checkout.meta;

import android.os.Parcel;
import android.os.Parcelable;

public enum CheckoutBrandDetectionType implements Parcelable {
    REGEX,
    BINLIST;
    
    public static final Parcelable.Creator<CheckoutBrandDetectionType> CREATOR = null;

    class a implements Parcelable.Creator<CheckoutBrandDetectionType> {
        a() {
        }

        /* renamed from: a */
        public CheckoutBrandDetectionType createFromParcel(Parcel parcel) {
            return CheckoutBrandDetectionType.values()[parcel.readInt()];
        }

        /* renamed from: a */
        public CheckoutBrandDetectionType[] newArray(int i10) {
            return new CheckoutBrandDetectionType[i10];
        }
    }

    static {
        CREATOR = new a();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(ordinal());
    }
}
