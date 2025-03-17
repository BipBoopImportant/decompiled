package com.oppwa.mobile.connect.checkout.meta;

import android.os.Parcel;
import android.os.Parcelable;

public enum CheckoutCardBrandsDisplayMode implements Parcelable {
    SEPARATE,
    GROUPED;
    
    public static final Parcelable.Creator<CheckoutCardBrandsDisplayMode> CREATOR = null;

    class a implements Parcelable.Creator<CheckoutCardBrandsDisplayMode> {
        a() {
        }

        /* renamed from: a */
        public CheckoutCardBrandsDisplayMode createFromParcel(Parcel parcel) {
            return CheckoutCardBrandsDisplayMode.values()[parcel.readInt()];
        }

        /* renamed from: a */
        public CheckoutCardBrandsDisplayMode[] newArray(int i10) {
            return new CheckoutCardBrandsDisplayMode[i10];
        }
    }

    static {
        CREATOR = new a();
    }

    public static CheckoutCardBrandsDisplayMode getByName(String str) {
        for (CheckoutCardBrandsDisplayMode checkoutCardBrandsDisplayMode : values()) {
            if (checkoutCardBrandsDisplayMode.name().equalsIgnoreCase(str)) {
                return checkoutCardBrandsDisplayMode;
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
