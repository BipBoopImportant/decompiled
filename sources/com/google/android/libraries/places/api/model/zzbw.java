package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzbw implements Parcelable.Creator {
    zzbw() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        return TypeFilter.valueOf(readString);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new TypeFilter[i10];
    }
}
