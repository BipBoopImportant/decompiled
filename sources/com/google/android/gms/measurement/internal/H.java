package com.google.android.gms.measurement.internal;

import L9.b;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class H implements Parcelable.Creator<F> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            if (b.m(u10) != 2) {
                b.B(parcel, u10);
            } else {
                bundle = b.a(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new F(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new F[i10];
    }
}
