package com.google.android.gms.internal.clearcut;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class z2 implements Parcelable.Creator<y2> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        boolean z11 = true;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            switch (b.m(u10)) {
                case 2:
                    str = b.g(parcel, u10);
                    break;
                case 3:
                    i10 = b.w(parcel, u10);
                    break;
                case 4:
                    i11 = b.w(parcel, u10);
                    break;
                case 5:
                    str2 = b.g(parcel, u10);
                    break;
                case 6:
                    str3 = b.g(parcel, u10);
                    break;
                case 7:
                    z11 = b.n(parcel, u10);
                    break;
                case 8:
                    str4 = b.g(parcel, u10);
                    break;
                case 9:
                    z10 = b.n(parcel, u10);
                    break;
                case 10:
                    i12 = b.w(parcel, u10);
                    break;
                default:
                    b.B(parcel, u10);
                    break;
            }
        }
        b.l(parcel, C10);
        return new y2(str, i10, i11, str2, str3, z11, str4, z10, i12);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new y2[i10];
    }
}
