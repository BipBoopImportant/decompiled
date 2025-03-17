package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzba extends zzu {
    public static final Parcelable.Creator<zzba> CREATOR = new zzaz();

    zzba(Place place, double d10) {
        super(place, d10);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(getPlace(), i10);
        parcel.writeDouble(getLikelihood());
    }
}
