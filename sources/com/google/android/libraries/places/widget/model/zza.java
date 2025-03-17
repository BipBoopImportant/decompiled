package com.google.android.libraries.places.widget.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zza implements Parcelable.Creator {
    zza() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        return AutocompleteActivityMode.valueOf(readString);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new AutocompleteActivityMode[i10];
    }
}
