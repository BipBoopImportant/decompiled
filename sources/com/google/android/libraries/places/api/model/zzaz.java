package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzaz implements Parcelable.Creator {
    zzaz() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzba((Place) parcel.readParcelable(PlaceLikelihood.class.getClassLoader()), parcel.readDouble());
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzba[i10];
    }
}
