package com.oppwa.mobile.connect.checkout.meta;

import android.os.Parcel;
import android.os.Parcelable;

public enum CheckoutMsdkUi implements Parcelable {
    NATIVE,
    HYBRID;
    
    public static final Parcelable.Creator<CheckoutMsdkUi> CREATOR = null;

    class a implements Parcelable.Creator<CheckoutMsdkUi> {
        a() {
        }

        /* renamed from: a */
        public CheckoutMsdkUi createFromParcel(Parcel parcel) {
            return CheckoutMsdkUi.values()[parcel.readInt()];
        }

        /* renamed from: a */
        public CheckoutMsdkUi[] newArray(int i10) {
            return new CheckoutMsdkUi[i10];
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
