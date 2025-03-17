package com.google.android.gms.location;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;
import na.s;

public final class a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int C10 = b.C(parcel);
        boolean z10 = false;
        s[] sVarArr = null;
        long j10 = 0;
        int i10 = 1;
        int i11 = 1;
        int i12 = 1000;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            switch (b.m(u10)) {
                case 1:
                    i10 = b.w(parcel2, u10);
                    break;
                case 2:
                    i11 = b.w(parcel2, u10);
                    break;
                case 3:
                    j10 = b.y(parcel2, u10);
                    break;
                case 4:
                    i12 = b.w(parcel2, u10);
                    break;
                case 5:
                    sVarArr = (s[]) b.j(parcel2, u10, s.CREATOR);
                    break;
                case 6:
                    z10 = b.n(parcel2, u10);
                    break;
                default:
                    b.B(parcel2, u10);
                    break;
            }
        }
        b.l(parcel2, C10);
        return new LocationAvailability(i12, i10, i11, j10, sVarArr, z10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationAvailability[i10];
    }
}
