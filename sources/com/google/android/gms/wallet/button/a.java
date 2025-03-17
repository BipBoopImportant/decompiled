package com.google.android.gms.wallet.button;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        String str = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 1) {
                i10 = b.w(parcel, u10);
            } else if (m10 == 2) {
                i11 = b.w(parcel, u10);
            } else if (m10 == 3) {
                i12 = b.w(parcel, u10);
            } else if (m10 != 4) {
                b.B(parcel, u10);
            } else {
                str = b.g(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new ButtonOptions(i10, i11, i12, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new ButtonOptions[i10];
    }
}
