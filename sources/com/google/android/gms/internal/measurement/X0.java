package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class X0 extends Y implements V0 {
    X0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    public final void o(Bundle bundle) {
        Parcel I32 = I3();
        C7245a0.d(I32, bundle);
        K3(1, I32);
    }
}
