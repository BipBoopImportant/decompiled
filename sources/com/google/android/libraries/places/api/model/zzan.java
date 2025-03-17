package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzan implements Parcelable.Creator {
    zzan() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzao(parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzao[i10];
    }
}
