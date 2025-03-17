package com.google.android.gms.common.api;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class u implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        String str = null;
        int i10 = 0;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 1) {
                i10 = b.w(parcel, u10);
            } else if (m10 != 2) {
                b.B(parcel, u10);
            } else {
                str = b.g(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new Scope(i10, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new Scope[i10];
    }
}
