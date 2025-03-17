package com.google.android.libraries.places.internal;

import android.os.Parcel;
import android.os.Parcelable;

public enum zzhy implements Parcelable {
    FRAGMENT,
    INTENT;
    
    public static final Parcelable.Creator<zzhy> CREATOR = null;

    static {
        CREATOR = new zzhx();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(name());
    }
}
