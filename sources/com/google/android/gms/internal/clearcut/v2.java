package com.google.android.gms.internal.clearcut;

import E9.f;
import android.os.IBinder;
import android.os.Parcel;

public final class v2 extends C7165a implements u2 {
    v2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    public final void Z0(s2 s2Var, f fVar) {
        Parcel I32 = I3();
        Z.b(I32, s2Var);
        Z.c(I32, fVar);
        J3(1, I32);
    }
}
