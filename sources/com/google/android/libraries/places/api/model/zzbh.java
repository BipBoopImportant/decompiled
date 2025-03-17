package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzbh implements Parcelable.Creator {
    zzbh() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Class<TimeOfWeek> cls = TimeOfWeek.class;
        LocalDate localDate = (LocalDate) parcel.readParcelable(cls.getClassLoader());
        DayOfWeek dayOfWeek = (DayOfWeek) parcel.readParcelable(cls.getClassLoader());
        LocalTime localTime = (LocalTime) parcel.readParcelable(cls.getClassLoader());
        boolean z10 = true;
        if (parcel.readInt() != 1) {
            z10 = false;
        }
        return new zzbi(localDate, dayOfWeek, localTime, z10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbi[i10];
    }
}
