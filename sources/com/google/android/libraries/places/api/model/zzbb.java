package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzbb implements Parcelable.Creator {
    zzbb() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        String readString = parcel.readInt() == 0 ? parcel.readString() : null;
        if (parcel.readInt() == 0) {
            str = parcel.readString();
        }
        return new zzbc(readString, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbc[i10];
    }
}
