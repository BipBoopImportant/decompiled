package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.OpeningHours;

final class zzar implements Parcelable.Creator {
    zzar() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Class<OpeningHours> cls = OpeningHours.class;
        return new zzas((OpeningHours.HoursType) parcel.readParcelable(cls.getClassLoader()), parcel.readArrayList(cls.getClassLoader()), parcel.readArrayList(cls.getClassLoader()), parcel.readArrayList(cls.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzas[i10];
    }
}
