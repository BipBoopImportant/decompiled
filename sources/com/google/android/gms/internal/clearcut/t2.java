package com.google.android.gms.internal.clearcut;

import E9.d;
import E9.f;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public abstract class t2 extends C7238y implements s2 {
    public t2() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                R0((Status) Z.a(parcel, Status.CREATOR));
                return true;
            case 2:
                b1((Status) Z.a(parcel, Status.CREATOR));
                return true;
            case 3:
                C((Status) Z.a(parcel, Status.CREATOR), parcel.readLong());
                return true;
            case 4:
                q1((Status) Z.a(parcel, Status.CREATOR));
                return true;
            case 5:
                t1((Status) Z.a(parcel, Status.CREATOR), parcel.readLong());
                return true;
            case 6:
                y((Status) Z.a(parcel, Status.CREATOR), (f[]) parcel.createTypedArray(f.CREATOR));
                return true;
            case 7:
                L((DataHolder) Z.a(parcel, DataHolder.CREATOR));
                return true;
            case 8:
                b3((Status) Z.a(parcel, Status.CREATOR), (d) Z.a(parcel, d.CREATOR));
                return true;
            case 9:
                E3((Status) Z.a(parcel, Status.CREATOR), (d) Z.a(parcel, d.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
