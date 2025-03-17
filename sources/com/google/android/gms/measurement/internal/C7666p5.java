package com.google.android.gms.measurement.internal;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.measurement.internal.p5  reason: case insensitive filesystem */
public final class C7666p5 implements Parcelable.Creator<C7645m5> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        String str = null;
        long j10 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 1) {
                str = b.g(parcel, u10);
            } else if (m10 == 2) {
                j10 = b.y(parcel, u10);
            } else if (m10 != 3) {
                b.B(parcel, u10);
            } else {
                i10 = b.w(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new C7645m5(str, j10, i10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C7645m5[i10];
    }
}
