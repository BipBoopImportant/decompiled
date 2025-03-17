package com.google.android.gms.internal.measurement;

import L9.b;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.measurement.k1  reason: case insensitive filesystem */
public final class C7336k1 implements Parcelable.Creator<C7309h1> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        int i10 = 0;
        String str = null;
        Intent intent = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 1) {
                i10 = b.w(parcel, u10);
            } else if (m10 == 2) {
                str = b.g(parcel, u10);
            } else if (m10 != 3) {
                b.B(parcel, u10);
            } else {
                intent = (Intent) b.f(parcel, u10, Intent.CREATOR);
            }
        }
        b.l(parcel, C10);
        return new C7309h1(i10, str, intent);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C7309h1[i10];
    }
}
