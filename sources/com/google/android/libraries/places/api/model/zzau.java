package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzau extends zzp {
    public static final Parcelable.Creator<zzau> CREATOR = new zzat();

    zzau(TimeOfWeek timeOfWeek, TimeOfWeek timeOfWeek2) {
        super(timeOfWeek, timeOfWeek2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(getOpen(), i10);
        parcel.writeParcelable(getClose(), i10);
    }
}
