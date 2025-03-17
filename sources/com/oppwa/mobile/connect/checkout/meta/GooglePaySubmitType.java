package com.oppwa.mobile.connect.checkout.meta;

import android.os.Parcel;
import android.os.Parcelable;

public enum GooglePaySubmitType implements Parcelable {
    BILLING,
    CUSTOMER;
    
    public static final Parcelable.Creator<GooglePaySubmitType> CREATOR = null;

    class a implements Parcelable.Creator<GooglePaySubmitType> {
        a() {
        }

        /* renamed from: a */
        public GooglePaySubmitType createFromParcel(Parcel parcel) {
            return GooglePaySubmitType.values()[parcel.readInt()];
        }

        /* renamed from: a */
        public GooglePaySubmitType[] newArray(int i10) {
            return new GooglePaySubmitType[i10];
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
