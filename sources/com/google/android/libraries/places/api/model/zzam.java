package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;

final class zzam extends zzh {
    public static final Parcelable.Creator<zzam> CREATOR = new zzal();

    zzam(ParcelUuid parcelUuid) {
        super(parcelUuid);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(zza(), i10);
    }
}
