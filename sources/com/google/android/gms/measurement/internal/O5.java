package com.google.android.gms.measurement.internal;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class O5 implements Parcelable.Creator<P5> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int C10 = b.C(parcel);
        int i10 = 0;
        String str = null;
        Long l10 = null;
        Float f10 = null;
        String str2 = null;
        String str3 = null;
        Double d10 = null;
        long j10 = 0;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            switch (b.m(u10)) {
                case 1:
                    i10 = b.w(parcel2, u10);
                    break;
                case 2:
                    str = b.g(parcel2, u10);
                    break;
                case 3:
                    j10 = b.y(parcel2, u10);
                    break;
                case 4:
                    l10 = b.z(parcel2, u10);
                    break;
                case 5:
                    f10 = b.t(parcel2, u10);
                    break;
                case 6:
                    str2 = b.g(parcel2, u10);
                    break;
                case 7:
                    str3 = b.g(parcel2, u10);
                    break;
                case 8:
                    d10 = b.r(parcel2, u10);
                    break;
                default:
                    b.B(parcel2, u10);
                    break;
            }
        }
        b.l(parcel2, C10);
        return new P5(i10, str, j10, l10, f10, str2, str3, d10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new P5[i10];
    }
}
