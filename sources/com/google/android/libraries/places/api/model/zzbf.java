package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzbf implements Parcelable.Creator {
    zzbf() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        LocalDate localDate = (LocalDate) parcel.readParcelable(SpecialDay.class.getClassLoader());
        boolean z10 = true;
        if (parcel.readInt() != 1) {
            z10 = false;
        }
        return new zzbg(localDate, z10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbg[i10];
    }
}
