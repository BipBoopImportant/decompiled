package K9;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

public final class j0 extends Y {

    /* renamed from: a  reason: collision with root package name */
    private C6604c f37879a;

    /* renamed from: b  reason: collision with root package name */
    private final int f37880b;

    public j0(C6604c cVar, int i10) {
        this.f37879a = cVar;
        this.f37880b = i10;
    }

    public final void D0(int i10, IBinder iBinder, Bundle bundle) {
        C6620s.m(this.f37879a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f37879a.N(i10, iBinder, bundle, this.f37880b);
        this.f37879a = null;
    }

    public final void Z(int i10, IBinder iBinder, n0 n0Var) {
        C6604c cVar = this.f37879a;
        C6620s.m(cVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        C6620s.l(n0Var);
        C6604c.c0(cVar, n0Var);
        D0(i10, iBinder, n0Var.f37886a);
    }

    public final void j2(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
}
