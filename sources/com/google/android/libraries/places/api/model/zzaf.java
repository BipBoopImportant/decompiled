package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzaf implements Parcelable.Creator {
    zzaf() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzag(parcel.readArrayList(AddressComponents.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzag[i10];
    }
}
