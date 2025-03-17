package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzaw extends zzr {
    public static final Parcelable.Creator<zzaw> CREATOR = new zzav();

    zzaw(String str, int i10, int i11, String str2) {
        super(str, i10, i11, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(getAttributions());
        parcel.writeInt(getHeight());
        parcel.writeInt(getWidth());
        parcel.writeString(zza());
    }
}
