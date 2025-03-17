package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzbg extends zzaa {
    public static final Parcelable.Creator<zzbg> CREATOR = new zzbf();

    zzbg(LocalDate localDate, boolean z10) {
        super(localDate, z10);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(getDate(), i10);
        parcel.writeInt(isExceptional() ? 1 : 0);
    }
}
