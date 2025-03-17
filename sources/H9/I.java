package H9;

import G9.C6521b;
import H9.C6536j;
import K9.C6619q;
import K9.C6620s;
import M9.e;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.util.b;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j0.C5445a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import xa.C8972m;

public final class I implements g.a, g.b {

    /* renamed from: a  reason: collision with root package name */
    private final Queue f36498a = new LinkedList();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final a.f f36499b;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final C6528b f36500i;

    /* renamed from: j  reason: collision with root package name */
    private final C6550y f36501j;

    /* renamed from: k  reason: collision with root package name */
    private final Set f36502k = new HashSet();

    /* renamed from: l  reason: collision with root package name */
    private final Map f36503l = new HashMap();

    /* renamed from: m  reason: collision with root package name */
    private final int f36504m;

    /* renamed from: n  reason: collision with root package name */
    private final h0 f36505n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public boolean f36506o;

    /* renamed from: p  reason: collision with root package name */
    private final List f36507p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    private ConnectionResult f36508q = null;

    /* renamed from: r  reason: collision with root package name */
    private int f36509r = 0;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ C6531e f36510s;

    public I(C6531e eVar, f fVar) {
        this.f36510s = eVar;
        a.f z10 = fVar.z(eVar.f36573n.getLooper(), this);
        this.f36499b = z10;
        this.f36500i = fVar.t();
        this.f36501j = new C6550y();
        this.f36504m = fVar.y();
        if (z10.g()) {
            this.f36505n = fVar.A(eVar.f36564e, eVar.f36573n);
        } else {
            this.f36505n = null;
        }
    }

    static /* bridge */ /* synthetic */ void A(I i10, K k10) {
        C6521b[] g10;
        if (i10.f36507p.remove(k10)) {
            i10.f36510s.f36573n.removeMessages(15, k10);
            i10.f36510s.f36573n.removeMessages(16, k10);
            C6521b a10 = k10.f36512b;
            ArrayList arrayList = new ArrayList(i10.f36498a.size());
            for (p0 p0Var : i10.f36498a) {
                if ((p0Var instanceof Q) && (g10 = ((Q) p0Var).g(i10)) != null && b.b(g10, a10)) {
                    arrayList.add(p0Var);
                }
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                p0 p0Var2 = (p0) arrayList.get(i11);
                i10.f36498a.remove(p0Var2);
                p0Var2.b(new q(a10));
            }
        }
    }

    private final C6521b c(C6521b[] bVarArr) {
        if (!(bVarArr == null || bVarArr.length == 0)) {
            C6521b[] n10 = this.f36499b.n();
            if (n10 == null) {
                n10 = new C6521b[0];
            }
            C5445a aVar = new C5445a(n10.length);
            for (C6521b bVar : n10) {
                aVar.put(bVar.x(), Long.valueOf(bVar.B()));
            }
            for (C6521b bVar2 : bVarArr) {
                Long l10 = (Long) aVar.get(bVar2.x());
                if (l10 == null || l10.longValue() < bVar2.B()) {
                    return bVar2;
                }
            }
        }
        return null;
    }

    private final void d(ConnectionResult connectionResult) {
        for (q0 b10 : this.f36502k) {
            b10.b(this.f36500i, connectionResult, C6619q.b(connectionResult, ConnectionResult.f47963e) ? this.f36499b.d() : null);
        }
        this.f36502k.clear();
    }

    /* access modifiers changed from: private */
    public final void e(Status status) {
        C6620s.d(this.f36510s.f36573n);
        f(status, (Exception) null, false);
    }

    private final void f(Status status, Exception exc, boolean z10) {
        C6620s.d(this.f36510s.f36573n);
        boolean z11 = true;
        boolean z12 = status == null;
        if (exc != null) {
            z11 = false;
        }
        if (z12 != z11) {
            Iterator it = this.f36498a.iterator();
            while (it.hasNext()) {
                p0 p0Var = (p0) it.next();
                if (!z10 || p0Var.f36626a == 2) {
                    if (status != null) {
                        p0Var.a(status);
                    } else {
                        p0Var.b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    private final void g() {
        ArrayList arrayList = new ArrayList(this.f36498a);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            p0 p0Var = (p0) arrayList.get(i10);
            if (this.f36499b.l()) {
                if (m(p0Var)) {
                    this.f36498a.remove(p0Var);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void h() {
        B();
        d(ConnectionResult.f47963e);
        l();
        Iterator it = this.f36503l.values().iterator();
        while (it.hasNext()) {
            Y y10 = (Y) it.next();
            if (c(y10.f36541a.c()) != null) {
                it.remove();
            } else {
                try {
                    y10.f36541a.d(this.f36499b, new C8972m());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    this.f36499b.a("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        g();
        j();
    }

    /* access modifiers changed from: private */
    public final void i(int i10) {
        B();
        this.f36506o = true;
        this.f36501j.e(i10, this.f36499b.o());
        C6528b bVar = this.f36500i;
        C6531e eVar = this.f36510s;
        eVar.f36573n.sendMessageDelayed(Message.obtain(eVar.f36573n, 9, bVar), 5000);
        C6528b bVar2 = this.f36500i;
        C6531e eVar2 = this.f36510s;
        eVar2.f36573n.sendMessageDelayed(Message.obtain(eVar2.f36573n, 11, bVar2), 120000);
        this.f36510s.f36566g.c();
        for (Y y10 : this.f36503l.values()) {
            y10.f36543c.run();
        }
    }

    private final void j() {
        this.f36510s.f36573n.removeMessages(12, this.f36500i);
        C6528b bVar = this.f36500i;
        C6531e eVar = this.f36510s;
        eVar.f36573n.sendMessageDelayed(eVar.f36573n.obtainMessage(12, bVar), this.f36510s.f36560a);
    }

    private final void k(p0 p0Var) {
        p0Var.d(this.f36501j, a());
        try {
            p0Var.c(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.f36499b.a("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void l() {
        if (this.f36506o) {
            C6531e eVar = this.f36510s;
            eVar.f36573n.removeMessages(11, this.f36500i);
            C6531e eVar2 = this.f36510s;
            eVar2.f36573n.removeMessages(9, this.f36500i);
            this.f36506o = false;
        }
    }

    private final boolean m(p0 p0Var) {
        if (!(p0Var instanceof Q)) {
            k(p0Var);
            return true;
        }
        Q q10 = (Q) p0Var;
        C6521b c10 = c(q10.g(this));
        if (c10 == null) {
            k(p0Var);
            return true;
        }
        String name = this.f36499b.getClass().getName();
        String x10 = c10.x();
        long B10 = c10.B();
        Log.w("GoogleApiManager", name + " could not execute call because it requires feature (" + x10 + ", " + B10 + ").");
        if (!this.f36510s.f36574o || !q10.f(this)) {
            q10.b(new q(c10));
            return true;
        }
        K k10 = new K(this.f36500i, c10, (J) null);
        int indexOf = this.f36507p.indexOf(k10);
        if (indexOf >= 0) {
            K k11 = (K) this.f36507p.get(indexOf);
            this.f36510s.f36573n.removeMessages(15, k11);
            C6531e eVar = this.f36510s;
            eVar.f36573n.sendMessageDelayed(Message.obtain(eVar.f36573n, 15, k11), 5000);
            return false;
        }
        this.f36507p.add(k10);
        C6531e eVar2 = this.f36510s;
        eVar2.f36573n.sendMessageDelayed(Message.obtain(eVar2.f36573n, 15, k10), 5000);
        C6531e eVar3 = this.f36510s;
        eVar3.f36573n.sendMessageDelayed(Message.obtain(eVar3.f36573n, 16, k10), 120000);
        ConnectionResult connectionResult = new ConnectionResult(2, (PendingIntent) null);
        if (n(connectionResult)) {
            return false;
        }
        this.f36510s.f(connectionResult, this.f36504m);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean n(com.google.android.gms.common.ConnectionResult r4) {
        /*
            r3 = this;
            java.lang.Object r0 = H9.C6531e.f36558r
            monitor-enter(r0)
            H9.e r1 = r3.f36510s     // Catch:{ all -> 0x0027 }
            H9.z r2 = r1.f36570k     // Catch:{ all -> 0x0027 }
            if (r2 == 0) goto L_0x0029
            java.util.Set r1 = r1.f36571l     // Catch:{ all -> 0x0027 }
            H9.b r2 = r3.f36500i     // Catch:{ all -> 0x0027 }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x0029
            H9.e r1 = r3.f36510s     // Catch:{ all -> 0x0027 }
            H9.z r1 = r1.f36570k     // Catch:{ all -> 0x0027 }
            int r2 = r3.f36504m     // Catch:{ all -> 0x0027 }
            r1.s(r4, r2)     // Catch:{ all -> 0x0027 }
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            r4 = 1
            return r4
        L_0x0027:
            r4 = move-exception
            goto L_0x002c
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            r4 = 0
            return r4
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: H9.I.n(com.google.android.gms.common.ConnectionResult):boolean");
    }

    /* access modifiers changed from: private */
    public final boolean o(boolean z10) {
        C6620s.d(this.f36510s.f36573n);
        if (!this.f36499b.l() || !this.f36503l.isEmpty()) {
            return false;
        }
        if (!this.f36501j.g()) {
            this.f36499b.a("Timing out service connection.");
            return true;
        } else if (!z10) {
            return false;
        } else {
            j();
            return false;
        }
    }

    static /* bridge */ /* synthetic */ void z(I i10, K k10) {
        if (!i10.f36507p.contains(k10) || i10.f36506o) {
            return;
        }
        if (!i10.f36499b.l()) {
            i10.C();
        } else {
            i10.g();
        }
    }

    public final void B() {
        C6620s.d(this.f36510s.f36573n);
        this.f36508q = null;
    }

    public final void C() {
        C6620s.d(this.f36510s.f36573n);
        if (!this.f36499b.l() && !this.f36499b.c()) {
            try {
                C6531e eVar = this.f36510s;
                int b10 = eVar.f36566g.b(eVar.f36564e, this.f36499b);
                if (b10 != 0) {
                    ConnectionResult connectionResult = new ConnectionResult(b10, (PendingIntent) null);
                    String name = this.f36499b.getClass().getName();
                    String obj = connectionResult.toString();
                    Log.w("GoogleApiManager", "The service for " + name + " is not available: " + obj);
                    F(connectionResult, (Exception) null);
                    return;
                }
                C6531e eVar2 = this.f36510s;
                a.f fVar = this.f36499b;
                M m10 = new M(eVar2, fVar, this.f36500i);
                if (fVar.g()) {
                    ((h0) C6620s.l(this.f36505n)).L3(m10);
                }
                try {
                    this.f36499b.j(m10);
                } catch (SecurityException e10) {
                    F(new ConnectionResult(10), e10);
                }
            } catch (IllegalStateException e11) {
                F(new ConnectionResult(10), e11);
            }
        }
    }

    public final void D(p0 p0Var) {
        C6620s.d(this.f36510s.f36573n);
        if (!this.f36499b.l()) {
            this.f36498a.add(p0Var);
            ConnectionResult connectionResult = this.f36508q;
            if (connectionResult == null || !connectionResult.J()) {
                C();
            } else {
                F(this.f36508q, (Exception) null);
            }
        } else if (m(p0Var)) {
            j();
        } else {
            this.f36498a.add(p0Var);
        }
    }

    /* access modifiers changed from: package-private */
    public final void E() {
        this.f36509r++;
    }

    public final void F(ConnectionResult connectionResult, Exception exc) {
        C6620s.d(this.f36510s.f36573n);
        h0 h0Var = this.f36505n;
        if (h0Var != null) {
            h0Var.M3();
        }
        B();
        this.f36510s.f36566g.c();
        d(connectionResult);
        if ((this.f36499b instanceof e) && connectionResult.x() != 24) {
            this.f36510s.f36561b = true;
            C6531e eVar = this.f36510s;
            eVar.f36573n.sendMessageDelayed(eVar.f36573n.obtainMessage(19), 300000);
        }
        if (connectionResult.x() == 4) {
            e(C6531e.f36557q);
        } else if (this.f36498a.isEmpty()) {
            this.f36508q = connectionResult;
        } else if (exc != null) {
            C6620s.d(this.f36510s.f36573n);
            f((Status) null, exc, false);
        } else if (this.f36510s.f36574o) {
            f(C6531e.g(this.f36500i, connectionResult), (Exception) null, true);
            if (!this.f36498a.isEmpty() && !n(connectionResult) && !this.f36510s.f(connectionResult, this.f36504m)) {
                if (connectionResult.x() == 18) {
                    this.f36506o = true;
                }
                if (this.f36506o) {
                    C6531e eVar2 = this.f36510s;
                    eVar2.f36573n.sendMessageDelayed(Message.obtain(eVar2.f36573n, 9, this.f36500i), 5000);
                    return;
                }
                e(C6531e.g(this.f36500i, connectionResult));
            }
        } else {
            e(C6531e.g(this.f36500i, connectionResult));
        }
    }

    public final void G(ConnectionResult connectionResult) {
        C6620s.d(this.f36510s.f36573n);
        a.f fVar = this.f36499b;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(connectionResult);
        fVar.a("onSignInFailed for " + name + " with " + valueOf);
        F(connectionResult, (Exception) null);
    }

    public final void H(q0 q0Var) {
        C6620s.d(this.f36510s.f36573n);
        this.f36502k.add(q0Var);
    }

    public final void I() {
        C6620s.d(this.f36510s.f36573n);
        if (this.f36506o) {
            C();
        }
    }

    public final void J() {
        C6620s.d(this.f36510s.f36573n);
        e(C6531e.f36556p);
        this.f36501j.f();
        for (C6536j.a o0Var : (C6536j.a[]) this.f36503l.keySet().toArray(new C6536j.a[0])) {
            D(new o0(o0Var, new C8972m()));
        }
        d(new ConnectionResult(4));
        if (this.f36499b.l()) {
            this.f36499b.e(new H(this));
        }
    }

    public final void K() {
        C6620s.d(this.f36510s.f36573n);
        if (this.f36506o) {
            l();
            C6531e eVar = this.f36510s;
            e(eVar.f36565f.g(eVar.f36564e) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f36499b.a("Timing out connection while resuming.");
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean N() {
        return this.f36499b.l();
    }

    public final boolean a() {
        return this.f36499b.g();
    }

    @ResultIgnorabilityUnspecified
    public final boolean b() {
        return o(true);
    }

    public final void onConnected(Bundle bundle) {
        if (Looper.myLooper() == this.f36510s.f36573n.getLooper()) {
            h();
        } else {
            this.f36510s.f36573n.post(new E(this));
        }
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        F(connectionResult, (Exception) null);
    }

    public final void onConnectionSuspended(int i10) {
        if (Looper.myLooper() == this.f36510s.f36573n.getLooper()) {
            i(i10);
        } else {
            this.f36510s.f36573n.post(new F(this, i10));
        }
    }

    public final int p() {
        return this.f36504m;
    }

    /* access modifiers changed from: package-private */
    public final int q() {
        return this.f36509r;
    }

    public final ConnectionResult r() {
        C6620s.d(this.f36510s.f36573n);
        return this.f36508q;
    }

    public final a.f t() {
        return this.f36499b;
    }

    public final Map v() {
        return this.f36503l;
    }
}
