package H9;

import K9.C6607e;
import K9.C6620s;
import K9.U;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import java.util.Set;
import ua.e;
import ua.f;
import va.d;
import va.l;

public final class h0 extends d implements g.a, g.b {

    /* renamed from: n  reason: collision with root package name */
    private static final a.C0821a f36580n = e.f56892c;

    /* renamed from: a  reason: collision with root package name */
    private final Context f36581a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f36582b;

    /* renamed from: i  reason: collision with root package name */
    private final a.C0821a f36583i;

    /* renamed from: j  reason: collision with root package name */
    private final Set f36584j;

    /* renamed from: k  reason: collision with root package name */
    private final C6607e f36585k;

    /* renamed from: l  reason: collision with root package name */
    private f f36586l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public g0 f36587m;

    public h0(Context context, Handler handler, C6607e eVar) {
        a.C0821a aVar = f36580n;
        this.f36581a = context;
        this.f36582b = handler;
        this.f36585k = (C6607e) C6620s.m(eVar, "ClientSettings must not be null");
        this.f36584j = eVar.g();
        this.f36583i = aVar;
    }

    static /* bridge */ /* synthetic */ void K3(h0 h0Var, l lVar) {
        ConnectionResult x10 = lVar.x();
        if (x10.U()) {
            U u10 = (U) C6620s.l(lVar.B());
            ConnectionResult x11 = u10.x();
            if (!x11.U()) {
                String valueOf = String.valueOf(x11);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                h0Var.f36587m.c(x11);
                h0Var.f36586l.k();
                return;
            }
            h0Var.f36587m.b(u10.B(), h0Var.f36584j);
        } else {
            h0Var.f36587m.c(x10);
        }
        h0Var.f36586l.k();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.common.api.a$f, ua.f] */
    public final void L3(g0 g0Var) {
        f fVar = this.f36586l;
        if (fVar != null) {
            fVar.k();
        }
        this.f36585k.k(Integer.valueOf(System.identityHashCode(this)));
        a.C0821a aVar = this.f36583i;
        Context context = this.f36581a;
        Handler handler = this.f36582b;
        C6607e eVar = this.f36585k;
        this.f36586l = aVar.b(context, handler.getLooper(), eVar, eVar.h(), this, this);
        this.f36587m = g0Var;
        Set set = this.f36584j;
        if (set == null || set.isEmpty()) {
            this.f36582b.post(new e0(this));
        } else {
            this.f36586l.h();
        }
    }

    public final void M3() {
        f fVar = this.f36586l;
        if (fVar != null) {
            fVar.k();
        }
    }

    public final void onConnected(Bundle bundle) {
        this.f36586l.p(this);
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f36587m.c(connectionResult);
    }

    public final void onConnectionSuspended(int i10) {
        this.f36587m.d(i10);
    }

    public final void v0(l lVar) {
        this.f36582b.post(new f0(this, lVar));
    }
}
