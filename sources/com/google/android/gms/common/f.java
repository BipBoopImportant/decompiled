package com.google.android.gms.common;

import L9.b;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

public final class f implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        PendingIntent pendingIntent = null;
        int i10 = 0;
        int i11 = 0;
        String str = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 1) {
                i10 = b.w(parcel, u10);
            } else if (m10 == 2) {
                i11 = b.w(parcel, u10);
            } else if (m10 == 3) {
                pendingIntent = (PendingIntent) b.f(parcel, u10, PendingIntent.CREATOR);
            } else if (m10 != 4) {
                b.B(parcel, u10);
            } else {
                str = b.g(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new ConnectionResult(i10, i11, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new ConnectionResult[i10];
    }
}
