package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.Place;

final class zzbu implements Parcelable.Creator {
    zzbu() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        return Place.Type.valueOf(readString);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new Place.Type[i10];
    }
}
