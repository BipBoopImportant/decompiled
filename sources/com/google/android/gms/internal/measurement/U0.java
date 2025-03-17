package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

public abstract class U0 extends C7254b0 implements V0 {
    public U0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        C7245a0.f(parcel);
        o((Bundle) C7245a0.a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
