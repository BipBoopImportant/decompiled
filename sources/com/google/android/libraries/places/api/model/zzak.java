package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzak extends zzg {
    public static final Parcelable.Creator<zzak> CREATOR = new zzaj();

    zzak(int i10, int i11) {
        super(i10, i11);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(zzb());
        parcel.writeInt(zza());
    }
}
