package com.oppwa.mobile.connect.payment;

import android.os.Parcel;
import android.os.Parcelable;

public enum CVVMode implements Parcelable {
    NONE,
    REQUIRED,
    OPTIONAL;
    
    public static final Parcelable.Creator<CVVMode> CREATOR = null;

    class a implements Parcelable.Creator<CVVMode> {
        a() {
        }

        /* renamed from: a */
        public CVVMode createFromParcel(Parcel parcel) {
            return CVVMode.values()[parcel.readInt()];
        }

        /* renamed from: a */
        public CVVMode[] newArray(int i10) {
            return new CVVMode[i10];
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
