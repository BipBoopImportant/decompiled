package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.a1  reason: case insensitive filesystem */
public abstract class C7246a1 extends C7254b0 implements C7255b1 {
    public C7246a1() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            long readLong = parcel.readLong();
            C7245a0.f(parcel);
            P2(parcel.readString(), parcel.readString(), (Bundle) C7245a0.a(parcel, Bundle.CREATOR), readLong);
            parcel2.writeNoException();
        } else if (i10 != 2) {
            return false;
        } else {
            int zza = zza();
            parcel2.writeNoException();
            parcel2.writeInt(zza);
        }
        return true;
    }
}
