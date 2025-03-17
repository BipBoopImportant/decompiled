package K9;

import G9.C6521b;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: K9.c  reason: case insensitive filesystem */
public abstract class C6604c<T extends IInterface> {

    /* renamed from: D  reason: collision with root package name */
    public static final String[] f37788D = {"service_esmobile", "service_googleme"};

    /* renamed from: E  reason: collision with root package name */
    private static final C6521b[] f37789E = new C6521b[0];
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public boolean f37790A;

    /* renamed from: B  reason: collision with root package name */
    private volatile n0 f37791B;

    /* renamed from: C  reason: collision with root package name */
    protected AtomicInteger f37792C;

    /* renamed from: a  reason: collision with root package name */
    private int f37793a;

    /* renamed from: b  reason: collision with root package name */
    private long f37794b;

    /* renamed from: c  reason: collision with root package name */
    private long f37795c;

    /* renamed from: d  reason: collision with root package name */
    private int f37796d;

    /* renamed from: e  reason: collision with root package name */
    private long f37797e;

    /* renamed from: f  reason: collision with root package name */
    private volatile String f37798f;

    /* renamed from: g  reason: collision with root package name */
    y0 f37799g;

    /* renamed from: h  reason: collision with root package name */
    private final Context f37800h;

    /* renamed from: i  reason: collision with root package name */
    private final Looper f37801i;

    /* renamed from: j  reason: collision with root package name */
    private final C6611i f37802j;

    /* renamed from: k  reason: collision with root package name */
    private final com.google.android.gms.common.b f37803k;

    /* renamed from: l  reason: collision with root package name */
    final Handler f37804l;

    /* renamed from: m  reason: collision with root package name */
    private final Object f37805m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final Object f37806n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public C6616n f37807o;

    /* renamed from: p  reason: collision with root package name */
    protected C0599c f37808p;

    /* renamed from: q  reason: collision with root package name */
    private IInterface f37809q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f37810r;

    /* renamed from: s  reason: collision with root package name */
    private k0 f37811s;

    /* renamed from: t  reason: collision with root package name */
    private int f37812t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final a f37813u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final b f37814v;

    /* renamed from: w  reason: collision with root package name */
    private final int f37815w;

    /* renamed from: x  reason: collision with root package name */
    private final String f37816x;

    /* renamed from: y  reason: collision with root package name */
    private volatile String f37817y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public ConnectionResult f37818z;

    /* renamed from: K9.c$a */
    public interface a {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i10);
    }

    /* renamed from: K9.c$b */
    public interface b {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    /* renamed from: K9.c$c  reason: collision with other inner class name */
    public interface C0599c {
        void a(ConnectionResult connectionResult);
    }

    /* renamed from: K9.c$d */
    protected class d implements C0599c {
        public d() {
        }

        public final void a(ConnectionResult connectionResult) {
            if (connectionResult.U()) {
                C6604c cVar = C6604c.this;
                cVar.b((C6613k) null, cVar.C());
            } else if (C6604c.this.f37814v != null) {
                C6604c.this.f37814v.onConnectionFailed(connectionResult);
            }
        }
    }

    /* renamed from: K9.c$e */
    public interface e {
        void a();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C6604c(android.content.Context r10, android.os.Looper r11, int r12, K9.C6604c.a r13, K9.C6604c.b r14, java.lang.String r15) {
        /*
            r9 = this;
            K9.i r3 = K9.C6611i.b(r10)
            com.google.android.gms.common.b r4 = com.google.android.gms.common.b.f()
            K9.C6620s.l(r13)
            K9.C6620s.l(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K9.C6604c.<init>(android.content.Context, android.os.Looper, int, K9.c$a, K9.c$b, java.lang.String):void");
    }

    static /* bridge */ /* synthetic */ void c0(C6604c cVar, n0 n0Var) {
        cVar.f37791B = n0Var;
        if (cVar.S()) {
            C6608f fVar = n0Var.f37889d;
            C6621t.b().c(fVar == null ? null : fVar.t0());
        }
    }

    static /* bridge */ /* synthetic */ void d0(C6604c cVar, int i10) {
        int i11;
        int i12;
        synchronized (cVar.f37805m) {
            i11 = cVar.f37812t;
        }
        if (i11 == 3) {
            cVar.f37790A = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = cVar.f37804l;
        handler.sendMessage(handler.obtainMessage(i12, cVar.f37792C.get(), 16));
    }

    static /* bridge */ /* synthetic */ boolean g0(C6604c cVar, int i10, int i11, IInterface iInterface) {
        synchronized (cVar.f37805m) {
            try {
                if (cVar.f37812t != i10) {
                    return false;
                }
                cVar.i0(i11, iInterface);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static /* bridge */ /* synthetic */ boolean h0(C6604c cVar) {
        if (cVar.f37790A || TextUtils.isEmpty(cVar.E()) || TextUtils.isEmpty(cVar.B())) {
            return false;
        }
        try {
            Class.forName(cVar.E());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public final void i0(int i10, IInterface iInterface) {
        y0 y0Var;
        boolean z10 = false;
        if ((i10 == 4) == (iInterface != null)) {
            z10 = true;
        }
        C6620s.a(z10);
        synchronized (this.f37805m) {
            try {
                this.f37812t = i10;
                this.f37809q = iInterface;
                Bundle bundle = null;
                if (i10 == 1) {
                    k0 k0Var = this.f37811s;
                    if (k0Var != null) {
                        C6611i iVar = this.f37802j;
                        String b10 = this.f37799g.b();
                        C6620s.l(b10);
                        iVar.f(b10, this.f37799g.a(), 4225, k0Var, X(), this.f37799g.c());
                        this.f37811s = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    k0 k0Var2 = this.f37811s;
                    if (!(k0Var2 == null || (y0Var = this.f37799g) == null)) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + y0Var.b() + " on " + y0Var.a());
                        C6611i iVar2 = this.f37802j;
                        String b11 = this.f37799g.b();
                        C6620s.l(b11);
                        iVar2.f(b11, this.f37799g.a(), 4225, k0Var2, X(), this.f37799g.c());
                        this.f37792C.incrementAndGet();
                    }
                    k0 k0Var3 = new k0(this, this.f37792C.get());
                    this.f37811s = k0Var3;
                    y0 y0Var2 = (this.f37812t != 3 || B() == null) ? new y0(G(), F(), false, 4225, I()) : new y0(y().getPackageName(), B(), true, 4225, false);
                    this.f37799g = y0Var2;
                    if (y0Var2.c()) {
                        if (m() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f37799g.b())));
                        }
                    }
                    C6611i iVar3 = this.f37802j;
                    String b12 = this.f37799g.b();
                    C6620s.l(b12);
                    ConnectionResult d10 = iVar3.d(new r0(b12, this.f37799g.a(), 4225, this.f37799g.c()), k0Var3, X(), w());
                    if (!d10.U()) {
                        Log.w("GmsClient", "unable to connect to service: " + this.f37799g.b() + " on " + this.f37799g.a());
                        int x10 = d10.x() == -1 ? 16 : d10.x();
                        if (d10.F() != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", d10.F());
                        }
                        e0(x10, bundle, this.f37792C.get());
                    }
                } else if (i10 == 4) {
                    C6620s.l(iInterface);
                    K(iInterface);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: protected */
    public Bundle A() {
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    public String B() {
        return null;
    }

    /* access modifiers changed from: protected */
    public Set<Scope> C() {
        return Collections.emptySet();
    }

    public final T D() {
        T t10;
        synchronized (this.f37805m) {
            try {
                if (this.f37812t != 5) {
                    r();
                    T t11 = this.f37809q;
                    C6620s.m(t11, "Client is connected but service is null");
                    t10 = (IInterface) t11;
                } else {
                    throw new DeadObjectException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }

    /* access modifiers changed from: protected */
    public abstract String E();

    /* access modifiers changed from: protected */
    public abstract String F();

    /* access modifiers changed from: protected */
    public String G() {
        return "com.google.android.gms";
    }

    public C6608f H() {
        n0 n0Var = this.f37791B;
        if (n0Var == null) {
            return null;
        }
        return n0Var.f37889d;
    }

    /* access modifiers changed from: protected */
    public boolean I() {
        return m() >= 211700000;
    }

    public boolean J() {
        return this.f37791B != null;
    }

    /* access modifiers changed from: protected */
    public void K(T t10) {
        this.f37795c = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void L(ConnectionResult connectionResult) {
        this.f37796d = connectionResult.x();
        this.f37797e = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void M(int i10) {
        this.f37793a = i10;
        this.f37794b = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void N(int i10, IBinder iBinder, Bundle bundle, int i11) {
        this.f37804l.sendMessage(this.f37804l.obtainMessage(1, i11, -1, new l0(this, i10, iBinder, bundle)));
    }

    public boolean O() {
        return false;
    }

    public void P(String str) {
        this.f37817y = str;
    }

    public void Q(int i10) {
        this.f37804l.sendMessage(this.f37804l.obtainMessage(6, this.f37792C.get(), i10));
    }

    /* access modifiers changed from: protected */
    public void R(C0599c cVar, int i10, PendingIntent pendingIntent) {
        C6620s.m(cVar, "Connection progress callbacks cannot be null.");
        this.f37808p = cVar;
        this.f37804l.sendMessage(this.f37804l.obtainMessage(3, this.f37792C.get(), i10, pendingIntent));
    }

    public boolean S() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final String X() {
        String str = this.f37816x;
        return str == null ? this.f37800h.getClass().getName() : str;
    }

    public void a(String str) {
        this.f37798f = str;
        k();
    }

    public void b(C6613k kVar, Set<Scope> set) {
        Set<Scope> set2 = set;
        Bundle A10 = A();
        String str = Build.VERSION.SDK_INT < 31 ? this.f37817y : this.f37817y;
        int i10 = this.f37815w;
        int i11 = com.google.android.gms.common.b.f48047a;
        Scope[] scopeArr = C6609g.f37848o;
        Bundle bundle = new Bundle();
        C6521b[] bVarArr = C6609g.f37849p;
        C6609g gVar = r3;
        C6609g gVar2 = new C6609g(6, i10, i11, (String) null, (IBinder) null, scopeArr, bundle, (Account) null, bVarArr, bVarArr, true, 0, false, str);
        C6609g gVar3 = gVar;
        gVar3.f37853d = this.f37800h.getPackageName();
        gVar3.f37856g = A10;
        if (set2 != null) {
            gVar3.f37855f = (Scope[]) set2.toArray(new Scope[0]);
        }
        if (g()) {
            Account u10 = u();
            if (u10 == null) {
                u10 = new Account("<<default account>>", "com.google");
            }
            gVar3.f37857h = u10;
            if (kVar != null) {
                gVar3.f37854e = kVar.asBinder();
            }
        } else if (O()) {
            gVar3.f37857h = u();
        }
        gVar3.f37858i = f37789E;
        gVar3.f37859j = v();
        if (S()) {
            gVar3.f37862m = true;
        }
        try {
            synchronized (this.f37806n) {
                C6616n nVar = this.f37807o;
                if (nVar != null) {
                    nVar.H(new j0(this, this.f37792C.get()), gVar3);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            Q(3);
        } catch (SecurityException e11) {
            throw e11;
        } catch (RemoteException | RuntimeException e12) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e12);
            N(8, (IBinder) null, (Bundle) null, this.f37792C.get());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public boolean c() {
        boolean z10;
        synchronized (this.f37805m) {
            int i10 = this.f37812t;
            z10 = true;
            if (i10 != 2) {
                if (i10 != 3) {
                    z10 = false;
                }
            }
        }
        return z10;
    }

    public String d() {
        y0 y0Var;
        if (l() && (y0Var = this.f37799g) != null) {
            return y0Var.a();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public void e(e eVar) {
        eVar.a();
    }

    /* access modifiers changed from: protected */
    public final void e0(int i10, Bundle bundle, int i11) {
        this.f37804l.sendMessage(this.f37804l.obtainMessage(7, i11, -1, new m0(this, i10, bundle)));
    }

    public boolean f() {
        return true;
    }

    public boolean g() {
        return false;
    }

    public void j(C0599c cVar) {
        C6620s.m(cVar, "Connection progress callbacks cannot be null.");
        this.f37808p = cVar;
        i0(2, (IInterface) null);
    }

    public void k() {
        this.f37792C.incrementAndGet();
        synchronized (this.f37810r) {
            try {
                int size = this.f37810r.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((i0) this.f37810r.get(i10)).d();
                }
                this.f37810r.clear();
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        synchronized (this.f37806n) {
            this.f37807o = null;
        }
        i0(1, (IInterface) null);
    }

    public boolean l() {
        boolean z10;
        synchronized (this.f37805m) {
            z10 = this.f37812t == 4;
        }
        return z10;
    }

    public int m() {
        return com.google.android.gms.common.b.f48047a;
    }

    public final C6521b[] n() {
        n0 n0Var = this.f37791B;
        if (n0Var == null) {
            return null;
        }
        return n0Var.f37887b;
    }

    public String o() {
        return this.f37798f;
    }

    public void q() {
        int h10 = this.f37803k.h(this.f37800h, m());
        if (h10 != 0) {
            i0(1, (IInterface) null);
            R(new d(), h10, (PendingIntent) null);
            return;
        }
        j(new d());
    }

    /* access modifiers changed from: protected */
    public final void r() {
        if (!l()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    public abstract T s(IBinder iBinder);

    /* access modifiers changed from: protected */
    public boolean t() {
        return false;
    }

    public Account u() {
        return null;
    }

    public C6521b[] v() {
        return f37789E;
    }

    /* access modifiers changed from: protected */
    public Executor w() {
        return null;
    }

    public Bundle x() {
        return null;
    }

    public final Context y() {
        return this.f37800h;
    }

    public int z() {
        return this.f37815w;
    }

    protected C6604c(Context context, Looper looper, C6611i iVar, com.google.android.gms.common.b bVar, int i10, a aVar, b bVar2, String str) {
        this.f37798f = null;
        this.f37805m = new Object();
        this.f37806n = new Object();
        this.f37810r = new ArrayList();
        this.f37812t = 1;
        this.f37818z = null;
        this.f37790A = false;
        this.f37791B = null;
        this.f37792C = new AtomicInteger(0);
        C6620s.m(context, "Context must not be null");
        this.f37800h = context;
        C6620s.m(looper, "Looper must not be null");
        this.f37801i = looper;
        C6620s.m(iVar, "Supervisor must not be null");
        this.f37802j = iVar;
        C6620s.m(bVar, "API availability must not be null");
        this.f37803k = bVar;
        this.f37804l = new h0(this, looper);
        this.f37815w = i10;
        this.f37813u = aVar;
        this.f37814v = bVar2;
        this.f37816x = str;
    }
}
