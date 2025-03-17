package com.google.android.gms.internal.measurement;

import android.os.Parcel;

public abstract class Z0 extends C7254b0 implements W0 {
    public Z0() {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        U0();
        return true;
    }
}
