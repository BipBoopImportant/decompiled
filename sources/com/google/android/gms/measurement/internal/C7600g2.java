package com.google.android.gms.measurement.internal;

import K9.C6604c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.d;
import sa.C8755h;

/* renamed from: com.google.android.gms.measurement.internal.g2  reason: case insensitive filesystem */
public final class C7600g2 extends C6604c<C8755h> {
    public C7600g2(Context context, Looper looper, C6604c.a aVar, C6604c.b bVar) {
        super(context, looper, 93, aVar, bVar, (String) null);
    }

    /* access modifiers changed from: protected */
    public final String E() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    /* access modifiers changed from: protected */
    public final String F() {
        return "com.google.android.gms.measurement.START";
    }

    public final int m() {
        return d.f48050a;
    }

    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof C8755h ? (C8755h) queryLocalInterface : new C7558a2(iBinder);
    }
}
