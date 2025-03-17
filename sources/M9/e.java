package M9;

import G9.C6521b;
import H9.C6530d;
import H9.C6539m;
import K9.C6607e;
import K9.C6610h;
import K9.C6627z;
import aa.f;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

public final class e extends C6610h {

    /* renamed from: I  reason: collision with root package name */
    private final C6627z f38677I;

    public e(Context context, Looper looper, C6607e eVar, C6627z zVar, C6530d dVar, C6539m mVar) {
        super(context, looper, 270, eVar, dVar, mVar);
        this.f38677I = zVar;
    }

    /* access modifiers changed from: protected */
    public final Bundle A() {
        return this.f38677I.b();
    }

    /* access modifiers changed from: protected */
    public final String E() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    /* access modifiers changed from: protected */
    public final String F() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    /* access modifiers changed from: protected */
    public final boolean I() {
        return true;
    }

    public final int m() {
        return 203400000;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder);
    }

    public final C6521b[] v() {
        return f.f42996b;
    }
}
