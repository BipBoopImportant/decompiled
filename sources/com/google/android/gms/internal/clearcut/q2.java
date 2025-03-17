package com.google.android.gms.internal.clearcut;

import K9.C6607e;
import K9.C6610h;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.g;

public final class q2 extends C6610h<u2> {
    public q2(Context context, Looper looper, C6607e eVar, g.a aVar, g.b bVar) {
        super(context, looper, 40, eVar, aVar, bVar);
    }

    /* access modifiers changed from: protected */
    public final String E() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    /* access modifiers changed from: protected */
    public final String F() {
        return "com.google.android.gms.clearcut.service.START";
    }

    public final int m() {
        return 11925000;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return queryLocalInterface instanceof u2 ? (u2) queryLocalInterface : new v2(iBinder);
    }
}
