package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import ea.J;

public final class b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int C10 = L9.b.C(parcel);
        WorkSource workSource = new WorkSource();
        J j10 = null;
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        long j11 = -1;
        float f10 = 0.0f;
        int i12 = Integer.MAX_VALUE;
        long j12 = Long.MAX_VALUE;
        long j13 = Long.MAX_VALUE;
        long j14 = 0;
        long j15 = 600000;
        long j16 = 3600000;
        int i13 = 102;
        while (parcel.dataPosition() < C10) {
            int u10 = L9.b.u(parcel);
            switch (L9.b.m(u10)) {
                case 1:
                    i13 = L9.b.w(parcel2, u10);
                    break;
                case 2:
                    j16 = L9.b.y(parcel2, u10);
                    break;
                case 3:
                    j15 = L9.b.y(parcel2, u10);
                    break;
                case 5:
                    j12 = L9.b.y(parcel2, u10);
                    break;
                case 6:
                    i12 = L9.b.w(parcel2, u10);
                    break;
                case 7:
                    f10 = L9.b.s(parcel2, u10);
                    break;
                case 8:
                    j14 = L9.b.y(parcel2, u10);
                    break;
                case 9:
                    z10 = L9.b.n(parcel2, u10);
                    break;
                case 10:
                    j13 = L9.b.y(parcel2, u10);
                    break;
                case 11:
                    j11 = L9.b.y(parcel2, u10);
                    break;
                case 12:
                    i10 = L9.b.w(parcel2, u10);
                    break;
                case 13:
                    i11 = L9.b.w(parcel2, u10);
                    break;
                case 15:
                    z11 = L9.b.n(parcel2, u10);
                    break;
                case 16:
                    workSource = (WorkSource) L9.b.f(parcel2, u10, WorkSource.CREATOR);
                    break;
                case 17:
                    j10 = (J) L9.b.f(parcel2, u10, J.CREATOR);
                    break;
                default:
                    L9.b.B(parcel2, u10);
                    break;
            }
        }
        L9.b.l(parcel2, C10);
        return new LocationRequest(i13, j16, j15, j14, j12, j13, i12, f10, z10, j11, i10, i11, z11, workSource, j10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationRequest[i10];
    }
}
