package com.google.android.gms.measurement.internal;

import L9.b;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.measurement.internal.s5  reason: case insensitive filesystem */
public final class C7686s5 implements Parcelable.Creator<C7693t5> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int C10 = b.C(parcel);
        long j10 = 0;
        long j11 = 0;
        byte[] bArr = null;
        String str = null;
        Bundle bundle = null;
        String str2 = null;
        int i10 = 0;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            switch (b.m(u10)) {
                case 1:
                    j10 = b.y(parcel2, u10);
                    break;
                case 2:
                    bArr = b.b(parcel2, u10);
                    break;
                case 3:
                    str = b.g(parcel2, u10);
                    break;
                case 4:
                    bundle = b.a(parcel2, u10);
                    break;
                case 5:
                    i10 = b.w(parcel2, u10);
                    break;
                case 6:
                    j11 = b.y(parcel2, u10);
                    break;
                case 7:
                    str2 = b.g(parcel2, u10);
                    break;
                default:
                    b.B(parcel2, u10);
                    break;
            }
        }
        b.l(parcel2, C10);
        return new C7693t5(j10, bArr, str, bundle, i10, j11, str2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C7693t5[i10];
    }
}
