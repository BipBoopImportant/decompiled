package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

final class zzbe extends zzy {
    public static final Parcelable.Creator<zzbe> CREATOR = new zzbd();

    zzbe(LatLng latLng, LatLng latLng2) {
        super(latLng, latLng2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(getSouthwest(), i10);
        parcel.writeParcelable(getNortheast(), i10);
    }
}
