package v;

import B.j;
import C.C4391e0;
import C.U;
import C.p0;
import H2.i;
import I.n;
import S.h;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk;
import androidx.camera.core.f;
import androidx.camera.core.impl.C5019e0;
import androidx.camera.core.impl.C5025h0;
import androidx.camera.core.impl.C5040p;
import androidx.camera.core.impl.C5059z;
import androidx.camera.core.impl.K0;
import androidx.camera.core.impl.L0;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.X;
import androidx.camera.core.impl.X0;
import androidx.camera.core.impl.Z0;
import androidx.camera.core.impl.a1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import ob.C10101e;
import u.C5965a;
import v.P1;
import x.C6227g;

final class K1 implements C6057c1 {

    /* renamed from: p  reason: collision with root package name */
    private static List<C5019e0> f30236p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    private static int f30237q = 0;

    /* renamed from: a  reason: collision with root package name */
    private final Z0 f30238a;

    /* renamed from: b  reason: collision with root package name */
    private final C6042T f30239b;

    /* renamed from: c  reason: collision with root package name */
    final Executor f30240c;

    /* renamed from: d  reason: collision with root package name */
    private final ScheduledExecutorService f30241d;

    /* renamed from: e  reason: collision with root package name */
    private final C6054b1 f30242e;

    /* renamed from: f  reason: collision with root package name */
    private List<C5019e0> f30243f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private X0 f30244g;

    /* renamed from: h  reason: collision with root package name */
    private C6032I0 f30245h;

    /* renamed from: i  reason: collision with root package name */
    private X0 f30246i;

    /* renamed from: j  reason: collision with root package name */
    private c f30247j;

    /* renamed from: k  reason: collision with root package name */
    private volatile List<V> f30248k = null;

    /* renamed from: l  reason: collision with root package name */
    private final d f30249l;

    /* renamed from: m  reason: collision with root package name */
    private j f30250m = new j.a().c();

    /* renamed from: n  reason: collision with root package name */
    private j f30251n = new j.a().c();

    /* renamed from: o  reason: collision with root package name */
    private int f30252o;

    class a implements I.c<Void> {
        a() {
        }

        public void b(Throwable th2) {
            C4391e0.d("ProcessingCaptureSession", "open session failed ", th2);
            K1.this.close();
            K1.this.d(false);
        }

        /* renamed from: c */
        public void a(Void voidR) {
        }
    }

    private static class b implements Z0.a {

        /* renamed from: a  reason: collision with root package name */
        private List<C5040p> f30254a;

        /* renamed from: b  reason: collision with root package name */
        private final int f30255b;

        /* renamed from: c  reason: collision with root package name */
        private C5059z f30256c;

        /* synthetic */ b(int i10, List list, a aVar) {
            this(i10, list);
        }

        private b(int i10, List<C5040p> list) {
            this.f30256c = null;
            this.f30255b = i10;
            this.f30254a = list;
        }
    }

    private enum c {
        UNINITIALIZED,
        SESSION_INITIALIZED,
        ON_CAPTURE_SESSION_STARTED,
        ON_CAPTURE_SESSION_ENDED,
        DE_INITIALIZED
    }

    private static class d implements Z0.a {
        d() {
        }
    }

    K1(Z0 z02, C6042T t10, C6227g gVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        boolean z10 = false;
        this.f30252o = 0;
        this.f30242e = new C6054b1(gVar, androidx.camera.camera2.internal.compat.quirk.b.b(CaptureSessionShouldUseMrirQuirk.class) != null ? true : z10);
        this.f30238a = z02;
        this.f30239b = t10;
        this.f30240c = executor;
        this.f30241d = scheduledExecutorService;
        this.f30247j = c.UNINITIALIZED;
        this.f30249l = new d();
        int i10 = f30237q;
        f30237q = i10 + 1;
        this.f30252o = i10;
        C4391e0.a("ProcessingCaptureSession", "New ProcessingCaptureSession (id=" + this.f30252o + ")");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C10101e A(X0 x02, CameraDevice cameraDevice, P1.a aVar, List list) {
        K0 k02;
        C4391e0.a("ProcessingCaptureSession", "-- getSurfaces done, start init (id=" + this.f30252o + ")");
        if (this.f30247j == c.DE_INITIALIZED) {
            return n.n(new IllegalStateException("SessionProcessorCaptureSession is closed."));
        }
        C5019e0 e0Var = null;
        if (list.contains((Object) null)) {
            return n.n(new C5019e0.a("Surface closed", x02.o().get(list.indexOf((Object) null))));
        }
        K0 k03 = null;
        K0 k04 = null;
        K0 k05 = null;
        for (int i10 = 0; i10 < x02.o().size(); i10++) {
            C5019e0 e0Var2 = x02.o().get(i10);
            if (t(e0Var2) || u(e0Var2)) {
                k03 = K0.a(e0Var2.j().get(), e0Var2.h(), e0Var2.i());
            } else if (s(e0Var2)) {
                k04 = K0.a(e0Var2.j().get(), e0Var2.h(), e0Var2.i());
            } else if (r(e0Var2)) {
                k05 = K0.a(e0Var2.j().get(), e0Var2.h(), e0Var2.i());
            }
        }
        if (x02.i() != null) {
            e0Var = x02.i().f();
            k02 = K0.a(e0Var.j().get(), e0Var.h(), e0Var.i());
        } else {
            k02 = null;
        }
        this.f30247j = c.SESSION_INITIALIZED;
        try {
            ArrayList arrayList = new ArrayList(this.f30243f);
            if (e0Var != null) {
                arrayList.add(e0Var);
            }
            C5025h0.d(arrayList);
            C4391e0.l("ProcessingCaptureSession", "== initSession (id=" + this.f30252o + ")");
            try {
                X0 k10 = this.f30238a.k(this.f30239b, L0.a(k03, k04, k05, k02));
                this.f30246i = k10;
                k10.o().get(0).k().a(new I1(this, e0Var), H.a.a());
                for (C5019e0 next : this.f30246i.o()) {
                    f30236p.add(next);
                    next.k().a(new J1(next), this.f30240c);
                }
                X0.h hVar = new X0.h();
                hVar.b(x02);
                hVar.d();
                hVar.b(this.f30246i);
                i.b(hVar.f(), "Cannot transform the SessionConfig");
                C10101e<Void> g10 = this.f30242e.g(hVar.c(), (CameraDevice) i.g(cameraDevice), aVar);
                n.j(g10, new a(), this.f30240c);
                return g10;
            } catch (Throwable th2) {
                C4391e0.d("ProcessingCaptureSession", "initSession failed", th2);
                C5025h0.c(this.f30243f);
                if (e0Var != null) {
                    e0Var.e();
                }
                throw th2;
            }
        } catch (C5019e0.a e10) {
            return n.n(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void B(Void voidR) {
        D(this.f30242e);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void C() {
        C4391e0.a("ProcessingCaptureSession", "== deInitSession (id=" + this.f30252o + ")");
        this.f30238a.f();
    }

    private void E(j jVar, j jVar2) {
        C5965a.C0464a aVar = new C5965a.C0464a();
        aVar.c(jVar);
        aVar.c(jVar2);
        this.f30238a.j(aVar.b());
    }

    private static void o(List<V> list) {
        for (V next : list) {
            for (C5040p a10 : next.c()) {
                a10.a(next.f());
            }
        }
    }

    private static List<a1> p(List<C5019e0> list) {
        ArrayList arrayList = new ArrayList();
        for (C5019e0 next : list) {
            i.b(next instanceof a1, "Surface must be SessionProcessorSurface");
            arrayList.add((a1) next);
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean q(androidx.camera.core.impl.V r2) {
        /*
            java.util.List r2 = r2.i()
            java.util.Iterator r2 = r2.iterator()
        L_0x0008:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = r2.next()
            androidx.camera.core.impl.e0 r0 = (androidx.camera.core.impl.C5019e0) r0
            boolean r1 = t(r0)
            if (r1 != 0) goto L_0x0020
            boolean r0 = u(r0)
            if (r0 == 0) goto L_0x0008
        L_0x0020:
            r2 = 1
            return r2
        L_0x0022:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: v.K1.q(androidx.camera.core.impl.V):boolean");
    }

    private static boolean r(C5019e0 e0Var) {
        return Objects.equals(e0Var.g(), f.class);
    }

    private static boolean s(C5019e0 e0Var) {
        return Objects.equals(e0Var.g(), U.class);
    }

    private static boolean t(C5019e0 e0Var) {
        return Objects.equals(e0Var.g(), p0.class);
    }

    private static boolean u(C5019e0 e0Var) {
        return Objects.equals(e0Var.g(), h.class);
    }

    private boolean v(int i10) {
        return i10 == 2 || i10 == 4;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void y(C5019e0 e0Var) {
        C5025h0.c(this.f30243f);
        if (e0Var != null) {
            e0Var.e();
        }
    }

    /* access modifiers changed from: package-private */
    public void D(C6054b1 b1Var) {
        if (this.f30247j == c.SESSION_INITIALIZED) {
            this.f30245h = new C6032I0(b1Var, p(this.f30246i.o()));
            C4391e0.a("ProcessingCaptureSession", "== onCaptureSessinStarted (id = " + this.f30252o + ")");
            this.f30238a.b(this.f30245h);
            this.f30247j = c.ON_CAPTURE_SESSION_STARTED;
            X0 x02 = this.f30244g;
            if (x02 != null) {
                h(x02);
            }
            if (this.f30248k != null) {
                a(this.f30248k);
                this.f30248k = null;
            }
        }
    }

    public void a(List<V> list) {
        if (!list.isEmpty()) {
            C4391e0.a("ProcessingCaptureSession", "issueCaptureRequests (id=" + this.f30252o + ") + state =" + this.f30247j);
            int ordinal = this.f30247j.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                if (this.f30248k != null) {
                    o(list);
                    C4391e0.a("ProcessingCaptureSession", "cancel the request because are pending un-submitted request");
                    return;
                }
                this.f30248k = list;
            } else if (ordinal == 2) {
                for (V next : list) {
                    if (v(next.k())) {
                        w(next);
                    } else {
                        x(next);
                    }
                }
            } else if (ordinal == 3 || ordinal == 4) {
                C4391e0.a("ProcessingCaptureSession", "Run issueCaptureRequests in wrong state, state = " + this.f30247j);
                o(list);
            }
        }
    }

    public boolean b() {
        return this.f30242e.b();
    }

    public void c() {
        C4391e0.a("ProcessingCaptureSession", "cancelIssuedCaptureRequests (id=" + this.f30252o + ")");
        if (this.f30248k != null) {
            for (V next : this.f30248k) {
                for (C5040p a10 : next.c()) {
                    a10.a(next.f());
                }
            }
            this.f30248k = null;
        }
    }

    public void close() {
        C4391e0.a("ProcessingCaptureSession", "close (id=" + this.f30252o + ") state=" + this.f30247j);
        if (this.f30247j == c.ON_CAPTURE_SESSION_STARTED) {
            C4391e0.a("ProcessingCaptureSession", "== onCaptureSessionEnd (id = " + this.f30252o + ")");
            this.f30238a.e();
            C6032I0 i02 = this.f30245h;
            if (i02 != null) {
                i02.a();
            }
            this.f30247j = c.ON_CAPTURE_SESSION_ENDED;
        }
        this.f30242e.close();
    }

    public C10101e<Void> d(boolean z10) {
        C4391e0.a("ProcessingCaptureSession", "release (id=" + this.f30252o + ") mProcessorState=" + this.f30247j);
        C10101e<Void> d10 = this.f30242e.d(z10);
        int ordinal = this.f30247j.ordinal();
        if (ordinal == 1 || ordinal == 3) {
            d10.a(new F1(this), H.a.a());
        }
        this.f30247j = c.DE_INITIALIZED;
        return d10;
    }

    public List<V> e() {
        return this.f30248k != null ? this.f30248k : Collections.emptyList();
    }

    public X0 f() {
        return this.f30244g;
    }

    public C10101e<Void> g(X0 x02, CameraDevice cameraDevice, P1.a aVar) {
        boolean z10 = this.f30247j == c.UNINITIALIZED;
        i.b(z10, "Invalid state state:" + this.f30247j);
        i.b(x02.o().isEmpty() ^ true, "SessionConfig contains no surfaces");
        C4391e0.a("ProcessingCaptureSession", "open (id=" + this.f30252o + ")");
        List<C5019e0> o10 = x02.o();
        this.f30243f = o10;
        return I.d.b(C5025h0.g(o10, false, 5000, this.f30240c, this.f30241d)).f(new G1(this, x02, cameraDevice, aVar), this.f30240c).e(new H1(this), this.f30240c);
    }

    public void h(X0 x02) {
        C4391e0.a("ProcessingCaptureSession", "setSessionConfig (id=" + this.f30252o + ")");
        this.f30244g = x02;
        if (x02 != null) {
            C6032I0 i02 = this.f30245h;
            if (i02 != null) {
                i02.b(x02);
            }
            if (this.f30247j == c.ON_CAPTURE_SESSION_STARTED) {
                j c10 = j.a.d(x02.f()).c();
                this.f30250m = c10;
                E(c10, this.f30251n);
                if (!q(x02.k())) {
                    this.f30238a.a();
                } else {
                    this.f30238a.c(x02.k().j(), this.f30249l);
                }
            }
        }
    }

    public void i(Map<C5019e0, Long> map) {
    }

    /* access modifiers changed from: package-private */
    public void w(V v10) {
        j.a d10 = j.a.d(v10.g());
        X g10 = v10.g();
        X.a<Integer> aVar = V.f16779i;
        if (g10.b(aVar)) {
            d10.g(CaptureRequest.JPEG_ORIENTATION, (Integer) v10.g().a(aVar));
        }
        X g11 = v10.g();
        X.a<Integer> aVar2 = V.f16780j;
        if (g11.b(aVar2)) {
            d10.g(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) v10.g().a(aVar2)).byteValue()));
        }
        j c10 = d10.c();
        this.f30251n = c10;
        E(this.f30250m, c10);
        this.f30238a.h(v10.m(), v10.j(), new b(v10.f(), v10.c(), (a) null));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void x(androidx.camera.core.impl.V r7) {
        /*
            r6 = this;
            java.lang.String r0 = "ProcessingCaptureSession"
            java.lang.String r1 = "issueTriggerRequest"
            C.C4391e0.a(r0, r1)
            androidx.camera.core.impl.X r0 = r7.g()
            B.j$a r0 = B.j.a.d(r0)
            B.j r0 = r0.c()
            java.util.Set r1 = r0.e()
            java.util.Iterator r1 = r1.iterator()
        L_0x001b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0055
            java.lang.Object r2 = r1.next()
            androidx.camera.core.impl.X$a r2 = (androidx.camera.core.impl.X.a) r2
            java.lang.Object r2 = r2.d()
            android.hardware.camera2.CaptureRequest$Key r2 = (android.hardware.camera2.CaptureRequest.Key) r2
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x003d
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x001b
        L_0x003d:
            androidx.camera.core.impl.Z0 r1 = r6.f30238a
            androidx.camera.core.impl.g1 r2 = r7.j()
            v.K1$b r3 = new v.K1$b
            int r4 = r7.f()
            java.util.List r7 = r7.c()
            r5 = 0
            r3.<init>(r4, r7, r5)
            r1.d(r0, r2, r3)
            return
        L_0x0055:
            androidx.camera.core.impl.V[] r7 = new androidx.camera.core.impl.V[]{r7}
            java.util.List r7 = java.util.Arrays.asList(r7)
            o(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.K1.x(androidx.camera.core.impl.V):void");
    }
}
