package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzao extends zzj {
    public static final Parcelable.Creator<zzao> CREATOR = new zzan();

    zzao(int i10, int i11, int i12) {
        super(i10, i11, i12);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(getYear());
        parcel.writeInt(getMonth());
        parcel.writeInt(getDay());
    }
}
