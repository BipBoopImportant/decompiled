package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzah implements Parcelable.Creator {
    zzah() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Class<AutocompletePrediction> cls = AutocompletePrediction.class;
        return new zzai(parcel.readString(), parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readArrayList(cls.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readArrayList(cls.getClassLoader()), parcel.readArrayList(cls.getClassLoader()), parcel.readArrayList(cls.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzai[i10];
    }
}
