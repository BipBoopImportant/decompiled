package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.Place;

final class zzbr implements Parcelable.Creator {
    zzbr() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        return Place.BooleanPlaceAttributeValue.valueOf(readString);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new Place.BooleanPlaceAttributeValue[i10];
    }
}
