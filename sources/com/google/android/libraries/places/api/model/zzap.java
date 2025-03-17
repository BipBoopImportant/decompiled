package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzap implements Parcelable.Creator {
    zzap() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzaq(parcel.readInt(), parcel.readInt());
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzaq[i10];
    }
}
