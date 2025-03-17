package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzat implements Parcelable.Creator {
    zzat() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Class<Period> cls = Period.class;
        return new zzau((TimeOfWeek) parcel.readParcelable(cls.getClassLoader()), (TimeOfWeek) parcel.readParcelable(cls.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzau[i10];
    }
}
