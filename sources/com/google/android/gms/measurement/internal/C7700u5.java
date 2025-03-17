package com.google.android.gms.measurement.internal;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.measurement.internal.u5  reason: case insensitive filesystem */
public final class C7700u5 implements Parcelable.Creator<C7707v5> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        ArrayList<C7693t5> arrayList = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            if (b.m(u10) != 1) {
                b.B(parcel, u10);
            } else {
                arrayList = b.k(parcel, u10, C7693t5.CREATOR);
            }
        }
        b.l(parcel, C10);
        return new C7707v5(arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C7707v5[i10];
    }
}
