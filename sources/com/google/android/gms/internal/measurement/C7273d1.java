package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.d1  reason: case insensitive filesystem */
public final class C7273d1 extends Y implements C7255b1 {
    C7273d1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    public final void P2(String str, String str2, Bundle bundle, long j10) {
        Parcel I32 = I3();
        I32.writeString(str);
        I32.writeString(str2);
        C7245a0.d(I32, bundle);
        I32.writeLong(j10);
        K3(1, I32);
    }

    public final int zza() {
        Parcel J32 = J3(2, I3());
        int readInt = J32.readInt();
        J32.recycle();
        return readInt;
    }
}
