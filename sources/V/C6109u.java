package v;

import B.g;
import B.j;
import C.C;
import C.C4391e0;
import C.C4402k;
import C.U;
import E.C4428k;
import H2.i;
import I.d;
import I.n;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Rational;
import androidx.camera.core.impl.C5040p;
import androidx.camera.core.impl.C5059z;
import androidx.camera.core.impl.F;
import androidx.camera.core.impl.R0;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.X;
import androidx.camera.core.impl.X0;
import androidx.camera.core.impl.r;
import androidx.concurrent.futures.c;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import ob.C10101e;
import u.C5965a;
import w.B;
import z.C6264a;
import z.C6265b;

/* renamed from: v.u  reason: case insensitive filesystem */
public class C6109u implements F {

    /* renamed from: b  reason: collision with root package name */
    final b f30679b;

    /* renamed from: c  reason: collision with root package name */
    final Executor f30680c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f30681d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final B f30682e;

    /* renamed from: f  reason: collision with root package name */
    private final F.d f30683f;

    /* renamed from: g  reason: collision with root package name */
    private final X0.b f30684g;

    /* renamed from: h  reason: collision with root package name */
    private final C6123y1 f30685h;

    /* renamed from: i  reason: collision with root package name */
    private final o2 f30686i;

    /* renamed from: j  reason: collision with root package name */
    private final f2 f30687j;

    /* renamed from: k  reason: collision with root package name */
    private final C6078j1 f30688k;

    /* renamed from: l  reason: collision with root package name */
    q2 f30689l;

    /* renamed from: m  reason: collision with root package name */
    private final g f30690m;

    /* renamed from: n  reason: collision with root package name */
    private final C6050a0 f30691n;

    /* renamed from: o  reason: collision with root package name */
    private final j2 f30692o;

    /* renamed from: p  reason: collision with root package name */
    private int f30693p;

    /* renamed from: q  reason: collision with root package name */
    private U.i f30694q;

    /* renamed from: r  reason: collision with root package name */
    private volatile boolean f30695r;

    /* renamed from: s  reason: collision with root package name */
    private volatile int f30696s;

    /* renamed from: t  reason: collision with root package name */
    private final C6264a f30697t;

    /* renamed from: u  reason: collision with root package name */
    private final C6265b f30698u;

    /* renamed from: v  reason: collision with root package name */
    private final AtomicLong f30699v;

    /* renamed from: w  reason: collision with root package name */
    private volatile C10101e<Void> f30700w;

    /* renamed from: x  reason: collision with root package name */
    private int f30701x;

    /* renamed from: y  reason: collision with root package name */
    private long f30702y;

    /* renamed from: z  reason: collision with root package name */
    private final a f30703z;

    /* renamed from: v.u$a */
    static final class a extends C5040p {

        /* renamed from: a  reason: collision with root package name */
        Set<C5040p> f30704a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        Map<C5040p, Executor> f30705b = new ArrayMap();

        a() {
        }

        public void a(int i10) {
            for (C5040p next : this.f30704a) {
                try {
                    this.f30705b.get(next).execute(new C6106t(next, i10));
                } catch (RejectedExecutionException e10) {
                    C4391e0.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e10);
                }
            }
        }

        public void b(int i10, C5059z zVar) {
            for (C5040p next : this.f30704a) {
                try {
                    this.f30705b.get(next).execute(new C6103s(next, i10, zVar));
                } catch (RejectedExecutionException e10) {
                    C4391e0.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e10);
                }
            }
        }

        public void c(int i10, r rVar) {
            for (C5040p next : this.f30704a) {
                try {
                    this.f30705b.get(next).execute(new C6100r(next, i10, rVar));
                } catch (RejectedExecutionException e10) {
                    C4391e0.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e10);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void h(Executor executor, C5040p pVar) {
            this.f30704a.add(pVar);
            this.f30705b.put(pVar, executor);
        }

        /* access modifiers changed from: package-private */
        public void l(C5040p pVar) {
            this.f30704a.remove(pVar);
            this.f30705b.remove(pVar);
        }
    }

    /* renamed from: v.u$b */
    static final class b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a  reason: collision with root package name */
        final Set<c> f30706a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        private final Executor f30707b;

        b(Executor executor) {
            this.f30707b = executor;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c(TotalCaptureResult totalCaptureResult) {
            HashSet hashSet = new HashSet();
            for (c next : this.f30706a) {
                if (next.a(totalCaptureResult)) {
                    hashSet.add(next);
                }
            }
            if (!hashSet.isEmpty()) {
                this.f30706a.removeAll(hashSet);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(c cVar) {
            this.f30706a.add(cVar);
        }

        /* access modifiers changed from: package-private */
        public void d(c cVar) {
            this.f30706a.remove(cVar);
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f30707b.execute(new C6112v(this, totalCaptureResult));
        }
    }

    /* renamed from: v.u$c */
    public interface c {
        boolean a(TotalCaptureResult totalCaptureResult);
    }

    C6109u(B b10, ScheduledExecutorService scheduledExecutorService, Executor executor, F.d dVar, R0 r02) {
        X0.b bVar = new X0.b();
        this.f30684g = bVar;
        this.f30693p = 0;
        this.f30695r = false;
        this.f30696s = 2;
        this.f30699v = new AtomicLong(0);
        this.f30700w = n.p(null);
        this.f30701x = 1;
        this.f30702y = 0;
        a aVar = new a();
        this.f30703z = aVar;
        this.f30682e = b10;
        this.f30683f = dVar;
        this.f30680c = executor;
        this.f30692o = new j2(executor);
        b bVar2 = new b(executor);
        this.f30679b = bVar2;
        bVar.z(this.f30701x);
        bVar.j(T0.e(bVar2));
        bVar.j(aVar);
        this.f30688k = new C6078j1(this, b10, executor);
        this.f30685h = new C6123y1(this, scheduledExecutorService, executor, r02);
        this.f30686i = new o2(this, b10, executor);
        this.f30687j = new f2(this, b10, executor);
        this.f30689l = new u2(b10);
        this.f30697t = new C6264a(r02);
        this.f30698u = new C6265b(r02);
        this.f30690m = new g(this, executor);
        this.f30691n = new C6050a0(this, b10, r02, executor, scheduledExecutorService);
    }

    public static int P(B b10, int i10) {
        int[] iArr = (int[]) b10.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return Z(i10, iArr) ? i10 : Z(1, iArr) ? 1 : 0;
    }

    private int R(int i10) {
        int[] iArr = (int[]) this.f30682e.a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return Z(i10, iArr) ? i10 : Z(1, iArr) ? 1 : 0;
    }

    private boolean X() {
        return T() > 0;
    }

    private static boolean Z(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        r4 = (java.lang.Long) ((androidx.camera.core.impl.g1) r4).d("CameraControlSessionUpdateId");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean a0(android.hardware.camera2.TotalCaptureResult r4, long r5) {
        /*
            android.hardware.camera2.CaptureRequest r0 = r4.getRequest()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.hardware.camera2.CaptureRequest r4 = r4.getRequest()
            java.lang.Object r4 = r4.getTag()
            boolean r0 = r4 instanceof androidx.camera.core.impl.g1
            if (r0 == 0) goto L_0x002b
            androidx.camera.core.impl.g1 r4 = (androidx.camera.core.impl.g1) r4
            java.lang.String r0 = "CameraControlSessionUpdateId"
            java.lang.Object r4 = r4.d(r0)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 != 0) goto L_0x0021
            return r1
        L_0x0021:
            long r2 = r4.longValue()
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x002b
            r4 = 1
            return r4
        L_0x002b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C6109u.a0(android.hardware.camera2.TotalCaptureResult, long):boolean");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c0() {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d0(Executor executor, C5040p pVar) {
        this.f30703z.h(executor, pVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e0() {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C10101e f0(int i10, int i11, int i12, Void voidR) {
        return n.p(this.f30691n.c(i10, i11, i12));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g0(C5040p pVar) {
        this.f30703z.l(pVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C10101e h0(List list, int i10, int i11, int i12, Void voidR) {
        return this.f30691n.i(list, i10, i11, i12);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i0(c.a aVar) {
        n.C(w0(v0()), aVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object j0(c.a aVar) {
        this.f30680c.execute(new C6082l(this, aVar));
        return "updateSessionConfigAsync";
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean k0(long j10, c.a aVar, TotalCaptureResult totalCaptureResult) {
        if (!a0(totalCaptureResult, j10)) {
            return false;
        }
        aVar.c(null);
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object l0(long j10, c.a aVar) {
        A(new C6091o(j10, aVar));
        return "waitForSessionUpdateId:" + j10;
    }

    private C10101e<Void> w0(long j10) {
        return androidx.concurrent.futures.c.a(new C6088n(this, j10));
    }

    /* access modifiers changed from: package-private */
    public void A(c cVar) {
        this.f30679b.b(cVar);
    }

    /* access modifiers changed from: package-private */
    public void B(Executor executor, C5040p pVar) {
        this.f30680c.execute(new C6094p(this, executor, pVar));
    }

    /* access modifiers changed from: package-private */
    public void C() {
        synchronized (this.f30681d) {
            try {
                int i10 = this.f30693p;
                if (i10 != 0) {
                    this.f30693p = i10 - 1;
                } else {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void D(boolean z10) {
        this.f30695r = z10;
        if (!z10) {
            V.a aVar = new V.a();
            aVar.v(this.f30701x);
            aVar.w(true);
            C5965a.C0464a aVar2 = new C5965a.C0464a();
            aVar2.f(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(O(1)));
            aVar2.f(CaptureRequest.FLASH_MODE, 0);
            aVar.e(aVar2.b());
            t0(Collections.singletonList(aVar.h()));
        }
        v0();
    }

    public g E() {
        return this.f30690m;
    }

    /* access modifiers changed from: package-private */
    public Rect F() {
        return this.f30686i.g();
    }

    public int G() {
        return this.f30696s;
    }

    public C6123y1 H() {
        return this.f30685h;
    }

    /* access modifiers changed from: package-private */
    public int I() {
        Integer num = (Integer) this.f30682e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* access modifiers changed from: package-private */
    public int J() {
        Integer num = (Integer) this.f30682e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* access modifiers changed from: package-private */
    public int K() {
        Integer num = (Integer) this.f30682e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public U.i L() {
        return this.f30694q;
    }

    public X0 M() {
        this.f30684g.z(this.f30701x);
        this.f30684g.v(N());
        this.f30684g.n("CameraControlSessionUpdateId", Long.valueOf(this.f30702y));
        return this.f30684g.o();
    }

    /* access modifiers changed from: package-private */
    public X N() {
        C5965a.C0464a aVar = new C5965a.C0464a();
        CaptureRequest.Key key = CaptureRequest.CONTROL_MODE;
        X.c cVar = X.c.REQUIRED;
        aVar.g(key, 1, cVar);
        this.f30685h.n(aVar);
        this.f30697t.a(aVar);
        this.f30686i.e(aVar);
        int i10 = this.f30685h.G() ? 5 : 1;
        if (this.f30695r) {
            aVar.g(CaptureRequest.FLASH_MODE, 2, cVar);
        } else {
            int i11 = this.f30696s;
            if (i11 == 0) {
                i10 = this.f30698u.a(2);
            } else if (i11 == 1) {
                i10 = 3;
            } else if (i11 == 2) {
                i10 = 1;
            }
        }
        aVar.g(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(O(i10)), cVar);
        aVar.g(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(R(1)), cVar);
        this.f30688k.c(aVar);
        this.f30690m.i(aVar);
        return aVar.b();
    }

    /* access modifiers changed from: package-private */
    public int O(int i10) {
        return P(this.f30682e, i10);
    }

    /* access modifiers changed from: package-private */
    public int Q(int i10) {
        int[] iArr = (int[]) this.f30682e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (Z(i10, iArr)) {
            return i10;
        }
        if (Z(4, iArr)) {
            return 4;
        }
        return Z(1, iArr) ? 1 : 0;
    }

    public f2 S() {
        return this.f30687j;
    }

    /* access modifiers changed from: package-private */
    public int T() {
        int i10;
        synchronized (this.f30681d) {
            i10 = this.f30693p;
        }
        return i10;
    }

    public o2 U() {
        return this.f30686i;
    }

    public q2 V() {
        return this.f30689l;
    }

    /* access modifiers changed from: package-private */
    public void W() {
        synchronized (this.f30681d) {
            this.f30693p++;
        }
    }

    public boolean Y() {
        int e10 = this.f30692o.e();
        C4391e0.a("Camera2CameraControlImp", "isInVideoUsage: mVideoUsageControl value = " + e10);
        return e10 > 0;
    }

    public void b(X0.b bVar) {
        this.f30689l.b(bVar);
    }

    /* access modifiers changed from: package-private */
    public boolean b0() {
        return this.f30695r;
    }

    public void c() {
        this.f30692o.c();
    }

    public C10101e<Void> d(float f10) {
        return !X() ? n.n(new C4402k.a("Camera is not active.")) : n.B(this.f30686i.q(f10));
    }

    public C10101e<List<Void>> e(List<V> list, int i10, int i11) {
        if (!X()) {
            C4391e0.l("Camera2CameraControlImp", "Camera is not active.");
            return n.n(new C4402k.a("Camera is not active."));
        }
        return d.b(n.B(this.f30700w)).f(new C6070h(this, list, i10, G(), i11), this.f30680c);
    }

    public C10101e<Void> f(float f10) {
        return !X() ? n.n(new C4402k.a("Camera is not active.")) : n.B(this.f30686i.r(f10));
    }

    public Rect g() {
        Rect rect = (Rect) this.f30682e.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        return (!"robolectric".equals(Build.FINGERPRINT) || rect != null) ? (Rect) i.g(rect) : new Rect(0, 0, 4000, 3000);
    }

    public void h(int i10) {
        if (!X()) {
            C4391e0.l("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f30696s = i10;
        C4391e0.a("Camera2CameraControlImp", "setFlashMode: mFlashMode = " + this.f30696s);
        q2 q2Var = this.f30689l;
        boolean z10 = true;
        if (!(this.f30696s == 1 || this.f30696s == 0)) {
            z10 = false;
        }
        q2Var.c(z10);
        this.f30700w = u0();
    }

    public C10101e<Void> i(boolean z10) {
        return !X() ? n.n(new C4402k.a("Camera is not active.")) : n.B(this.f30687j.d(z10));
    }

    public X j() {
        return this.f30690m.o();
    }

    public C10101e<C> k(C.B b10) {
        return !X() ? n.n(new C4402k.a("Camera is not active.")) : n.B(this.f30685h.a0(b10));
    }

    public void l() {
        this.f30692o.f();
    }

    public void m(U.i iVar) {
        this.f30694q = iVar;
    }

    /* access modifiers changed from: package-private */
    public void m0(c cVar) {
        this.f30679b.d(cVar);
    }

    public void n(X x10) {
        this.f30690m.g(j.a.d(x10).c()).a(new C6073i(), H.a.a());
    }

    /* access modifiers changed from: package-private */
    public void n0(C5040p pVar) {
        this.f30680c.execute(new C6097q(this, pVar));
    }

    public C10101e<C4428k> o(int i10, int i11) {
        if (!X()) {
            C4391e0.l("Camera2CameraControlImp", "Camera is not active.");
            return n.n(new C4402k.a("Camera is not active."));
        }
        return d.b(n.B(this.f30700w)).f(new C6085m(this, i10, G(), i11), this.f30680c);
    }

    /* access modifiers changed from: package-private */
    public void o0() {
        r0(1);
    }

    public void p() {
        this.f30690m.j().a(new C6079k(), H.a.a());
    }

    /* access modifiers changed from: package-private */
    public void p0(boolean z10) {
        C4391e0.a("Camera2CameraControlImp", "setActive: isActive = " + z10);
        this.f30685h.W(z10);
        this.f30686i.p(z10);
        this.f30687j.j(z10);
        this.f30688k.b(z10);
        this.f30690m.u(z10);
        if (!z10) {
            this.f30694q = null;
            this.f30692o.h();
        }
    }

    public void q0(Rational rational) {
        this.f30685h.X(rational);
    }

    /* access modifiers changed from: package-private */
    public void r0(int i10) {
        this.f30701x = i10;
        this.f30685h.Y(i10);
        this.f30691n.h(this.f30701x);
    }

    public void s0(boolean z10) {
        this.f30689l.d(z10);
    }

    /* access modifiers changed from: package-private */
    public void t0(List<V> list) {
        this.f30683f.b(list);
    }

    public C10101e<Void> u0() {
        return n.B(androidx.concurrent.futures.c.a(new C6076j(this)));
    }

    /* access modifiers changed from: package-private */
    public long v0() {
        this.f30702y = this.f30699v.getAndIncrement();
        this.f30683f.a();
        return this.f30702y;
    }
}
