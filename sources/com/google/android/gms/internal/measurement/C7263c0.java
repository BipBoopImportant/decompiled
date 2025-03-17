package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.measurement.c0  reason: case insensitive filesystem */
public abstract class C7263c0 extends C7254b0 implements C7272d0 {
    public static C7272d0 J3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof C7272d0 ? (C7272d0) queryLocalInterface : new C7290f0(iBinder);
    }
}
