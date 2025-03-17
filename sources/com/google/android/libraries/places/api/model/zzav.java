package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzav implements Parcelable.Creator {
    zzav() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzaw(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzaw[i10];
    }
}
