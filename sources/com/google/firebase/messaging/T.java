package com.google.firebase.messaging;

import L9.b;
import L9.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class T implements Parcelable.Creator<S> {
    static void c(S s10, Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.e(parcel, 2, s10.f68350a, false);
        c.b(parcel, a10);
    }

    /* renamed from: a */
    public S createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            if (b.m(u10) != 2) {
                b.B(parcel, u10);
            } else {
                bundle = b.a(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new S(bundle);
    }

    /* renamed from: b */
    public S[] newArray(int i10) {
        return new S[i10];
    }
}
