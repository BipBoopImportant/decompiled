package com.oppwa.mobile.connect.checkout.meta;

import android.os.Parcel;
import android.os.Parcelable;

public enum CheckoutBrandDetectionAppearanceStyle implements Parcelable {
    ACTIVE,
    INACTIVE,
    NONE;
    
    public static final Parcelable.Creator<CheckoutBrandDetectionAppearanceStyle> CREATOR = null;

    class a implements Parcelable.Creator<CheckoutBrandDetectionAppearanceStyle> {
        a() {
        }

        /* renamed from: a */
        public CheckoutBrandDetectionAppearanceStyle createFromParcel(Parcel parcel) {
            return CheckoutBrandDetectionAppearanceStyle.values()[parcel.readInt()];
        }

        /* renamed from: a */
        public CheckoutBrandDetectionAppearanceStyle[] newArray(int i10) {
            return new CheckoutBrandDetectionAppearanceStyle[i10];
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
