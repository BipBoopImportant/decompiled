package com.google.android.gms.internal.measurement;

import L9.b;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.measurement.i1  reason: case insensitive filesystem */
public final class C7318i1 implements Parcelable.Creator<C7282e1> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int C10 = b.C(parcel);
        long j10 = 0;
        long j11 = 0;
        boolean z10 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            switch (b.m(u10)) {
                case 1:
                    j10 = b.y(parcel2, u10);
                    break;
                case 2:
                    j11 = b.y(parcel2, u10);
                    break;
                case 3:
                    z10 = b.n(parcel2, u10);
                    break;
                case 4:
                    str = b.g(parcel2, u10);
                    break;
                case 5:
                    str2 = b.g(parcel2, u10);
                    break;
                case 6:
                    str3 = b.g(parcel2, u10);
                    break;
                case 7:
                    bundle = b.a(parcel2, u10);
                    break;
                case 8:
                    str4 = b.g(parcel2, u10);
                    break;
                default:
                    b.B(parcel2, u10);
                    break;
            }
        }
        b.l(parcel2, C10);
        return new C7282e1(j10, j11, z10, str, str2, str3, bundle, str4);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C7282e1[i10];
    }
}
