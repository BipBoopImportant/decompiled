package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzad implements Parcelable.Creator {
    zzad() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzae(parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readArrayList(AddressComponent.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzae[i10];
    }
}
