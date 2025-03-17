package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzbl implements Parcelable.Creator {
    zzbl() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        DayOfWeek dayOfWeek = DayOfWeek.SUNDAY;
        String readString = parcel.readString();
        readString.getClass();
        return DayOfWeek.valueOf(readString);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new DayOfWeek[i10];
    }
}
