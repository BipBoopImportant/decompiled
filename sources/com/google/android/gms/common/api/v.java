package com.google.android.gms.common.api;

import L9.b;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;

public final class v implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        String str = null;
        ConnectionResult connectionResult = null;
        int i10 = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 1) {
                i10 = b.w(parcel, u10);
            } else if (m10 == 2) {
                str = b.g(parcel, u10);
            } else if (m10 == 3) {
                pendingIntent = (PendingIntent) b.f(parcel, u10, PendingIntent.CREATOR);
            } else if (m10 != 4) {
                b.B(parcel, u10);
            } else {
                connectionResult = (ConnectionResult) b.f(parcel, u10, ConnectionResult.CREATOR);
            }
        }
        b.l(parcel, C10);
        return new Status(i10, str, pendingIntent, connectionResult);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
