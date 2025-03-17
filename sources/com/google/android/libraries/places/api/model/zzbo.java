package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.OpeningHours;

final class zzbo implements Parcelable.Creator {
    zzbo() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        return OpeningHours.HoursType.valueOf(readString);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new OpeningHours.HoursType[i10];
    }
}
