package com.oppwa.mobile.connect.provider;

import android.os.Parcel;
import android.os.Parcelable;

public enum TransactionType implements Parcelable {
    SYNC,
    ASYNC;
    
    public static final Parcelable.Creator<TransactionType> CREATOR = null;

    class a implements Parcelable.Creator<TransactionType> {
        a() {
        }

        /* renamed from: a */
        public TransactionType createFromParcel(Parcel parcel) {
            return TransactionType.values()[parcel.readInt()];
        }

        /* renamed from: a */
        public TransactionType[] newArray(int i10) {
            return new TransactionType[i10];
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
