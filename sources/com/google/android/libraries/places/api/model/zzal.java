package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;

final class zzal implements Parcelable.Creator {
    zzal() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzam((ParcelUuid) parcel.readParcelable(AutocompleteSessionToken.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzam[i10];
    }
}
