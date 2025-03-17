package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzaj implements Parcelable.Creator {
    zzaj() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzak(parcel.readInt(), parcel.readInt());
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzak[i10];
    }
}
