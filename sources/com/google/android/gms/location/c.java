package com.google.android.gms.location;

import L9.b;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        List list = LocationResult.f49459b;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            if (b.m(u10) != 1) {
                b.B(parcel, u10);
            } else {
                list = b.k(parcel, u10, Location.CREATOR);
            }
        }
        b.l(parcel, C10);
        return new LocationResult(list);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationResult[i10];
    }
}
