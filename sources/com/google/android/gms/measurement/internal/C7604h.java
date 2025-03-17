package com.google.android.gms.measurement.internal;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.measurement.internal.h  reason: case insensitive filesystem */
public final class C7604h implements Parcelable.Creator<C7583e> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        long j10 = 0;
        long j11 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 1) {
                j10 = b.y(parcel, u10);
            } else if (m10 == 2) {
                i10 = b.w(parcel, u10);
            } else if (m10 != 3) {
                b.B(parcel, u10);
            } else {
                j11 = b.y(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new C7583e(j10, i10, j11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C7583e[i10];
    }
}
