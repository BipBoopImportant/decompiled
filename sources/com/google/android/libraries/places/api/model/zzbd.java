package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

final class zzbd implements Parcelable.Creator {
    zzbd() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Class<RectangularBounds> cls = RectangularBounds.class;
        return new zzbe((LatLng) parcel.readParcelable(cls.getClassLoader()), (LatLng) parcel.readParcelable(cls.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbe[i10];
    }
}
