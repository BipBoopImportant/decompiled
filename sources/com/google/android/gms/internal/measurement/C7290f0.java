package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.f0  reason: case insensitive filesystem */
public final class C7290f0 extends Y implements C7272d0 {
    C7290f0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    public final Bundle o(Bundle bundle) {
        Parcel I32 = I3();
        C7245a0.d(I32, bundle);
        Parcel J32 = J3(1, I32);
        Bundle bundle2 = (Bundle) C7245a0.a(J32, Bundle.CREATOR);
        J32.recycle();
        return bundle2;
    }
}
