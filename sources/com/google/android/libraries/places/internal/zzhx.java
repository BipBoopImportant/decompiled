package com.google.android.libraries.places.internal;

import android.os.Parcel;
import android.os.Parcelable;

final class zzhx implements Parcelable.Creator {
    zzhx() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        return (zzhy) Enum.valueOf(zzhy.class, readString);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzhy[i10];
    }
}
