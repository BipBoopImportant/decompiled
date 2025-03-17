package v;

import C.C4391e0;
import C.U;
import C.V;
import E.C4428k;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.impl.C5011a0;
import androidx.camera.core.impl.C5040p;
import androidx.camera.core.impl.C5059z;
import androidx.camera.core.impl.R0;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.r;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import ob.C10101e;
import u.C5965a;
import v.C6109u;
import w.B;
import z.C6262A;
import z.C6263B;
import z.n;

/* renamed from: v.a0  reason: case insensitive filesystem */
class C6050a0 {

    /* renamed from: a  reason: collision with root package name */
    private final C6109u f30442a;

    /* renamed from: b  reason: collision with root package name */
    private final C6263B f30443b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f30444c;

    /* renamed from: d  reason: collision with root package name */
    private final R0 f30445d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f30446e;

    /* renamed from: f  reason: collision with root package name */
    private final ScheduledExecutorService f30447f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f30448g;

    /* renamed from: h  reason: collision with root package name */
    private int f30449h = 1;

    /* renamed from: v.a0$a */
    static class a implements e {

        /* renamed from: a  reason: collision with root package name */
        private final C6109u f30450a;

        /* renamed from: b  reason: collision with root package name */
        private final n f30451b;

        /* renamed from: c  reason: collision with root package name */
        private final int f30452c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f30453d = false;

        a(C6109u uVar, int i10, n nVar) {
            this.f30450a = uVar;
            this.f30452c = i10;
            this.f30451b = nVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ Object f(c.a aVar) {
            this.f30450a.H().T(aVar);
            this.f30451b.b();
            return "AePreCapture";
        }

        public C10101e<Boolean> a(TotalCaptureResult totalCaptureResult) {
            if (!C6050a0.e(this.f30452c, totalCaptureResult)) {
                return I.n.p(Boolean.FALSE);
            }
            C4391e0.a("Camera2CapturePipeline", "Trigger AE");
            this.f30453d = true;
            return I.d.b(androidx.concurrent.futures.c.a(new C6047Y(this))).e(new C6048Z(), H.a.a());
        }

        public boolean b() {
            return this.f30452c == 0;
        }

        public void c() {
            if (this.f30453d) {
                C4391e0.a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f30450a.H().o(false, true);
                this.f30451b.a();
            }
        }
    }

    /* renamed from: v.a0$b */
    static class b implements e {

        /* renamed from: a  reason: collision with root package name */
        private final C6109u f30454a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f30455b = false;

        b(C6109u uVar) {
            this.f30454a = uVar;
        }

        public C10101e<Boolean> a(TotalCaptureResult totalCaptureResult) {
            Integer num;
            C10101e<Boolean> p10 = I.n.p(Boolean.TRUE);
            if (totalCaptureResult == null || (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) == null) {
                return p10;
            }
            int intValue = num.intValue();
            if (intValue == 1 || intValue == 2) {
                C4391e0.a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    C4391e0.a("Camera2CapturePipeline", "Trigger AF");
                    this.f30455b = true;
                    this.f30454a.H().f0((c.a<C5059z>) null, false);
                }
            }
            return p10;
        }

        public boolean b() {
            return true;
        }

        public void c() {
            if (this.f30455b) {
                C4391e0.a("Camera2CapturePipeline", "cancel TriggerAF");
                this.f30454a.H().o(true, false);
            }
        }
    }

    /* renamed from: v.a0$c */
    static class c implements C4428k {

        /* renamed from: a  reason: collision with root package name */
        private final Executor f30456a;

        /* renamed from: b  reason: collision with root package name */
        private final d f30457b;

        /* renamed from: c  reason: collision with root package name */
        private int f30458c;

        c(d dVar, Executor executor, int i10) {
            this.f30457b = dVar;
            this.f30456a = executor;
            this.f30458c = i10;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ Object e(c.a aVar) {
            this.f30457b.j();
            aVar.c(null);
            return "invokePostCaptureFuture";
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ Void f(TotalCaptureResult totalCaptureResult) {
            return null;
        }

        public C10101e<Void> a() {
            C4391e0.a("Camera2CapturePipeline", "invokePreCapture");
            return I.d.b(this.f30457b.k(this.f30458c)).e(new C6056c0(), this.f30456a);
        }

        public C10101e<Void> b() {
            return androidx.concurrent.futures.c.a(new C6053b0(this));
        }
    }

    /* renamed from: v.a0$d */
    static class d {

        /* renamed from: j  reason: collision with root package name */
        private static final long f30459j;

        /* renamed from: k  reason: collision with root package name */
        private static final long f30460k;

        /* renamed from: a  reason: collision with root package name */
        private final int f30461a;

        /* renamed from: b  reason: collision with root package name */
        private final Executor f30462b;

        /* renamed from: c  reason: collision with root package name */
        private final ScheduledExecutorService f30463c;

        /* renamed from: d  reason: collision with root package name */
        private final C6109u f30464d;

        /* renamed from: e  reason: collision with root package name */
        private final n f30465e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f30466f;

        /* renamed from: g  reason: collision with root package name */
        private long f30467g = f30459j;

        /* renamed from: h  reason: collision with root package name */
        final List<e> f30468h = new ArrayList();

        /* renamed from: i  reason: collision with root package name */
        private final e f30469i = new a();

        /* renamed from: v.a0$d$a */
        class a implements e {
            a() {
            }

            public C10101e<Boolean> a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                for (e a10 : d.this.f30468h) {
                    arrayList.add(a10.a(totalCaptureResult));
                }
                return I.n.G(I.n.k(arrayList), new C6077j0(), H.a.a());
            }

            public boolean b() {
                for (e b10 : d.this.f30468h) {
                    if (b10.b()) {
                        return true;
                    }
                }
                return false;
            }

            public void c() {
                for (e c10 : d.this.f30468h) {
                    c10.c();
                }
            }
        }

        /* renamed from: v.a0$d$b */
        class b extends C5040p {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c.a f30471a;

            b(c.a aVar) {
                this.f30471a = aVar;
            }

            public void a(int i10) {
                this.f30471a.f(new V(3, "Capture request is cancelled because camera is closed", (Throwable) null));
            }

            public void b(int i10, C5059z zVar) {
                this.f30471a.c(null);
            }

            public void c(int i10, r rVar) {
                this.f30471a.f(new V(2, "Capture request failed with reason " + rVar.a(), (Throwable) null));
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f30459j = timeUnit.toNanos(1);
            f30460k = timeUnit.toNanos(5);
        }

        d(int i10, Executor executor, ScheduledExecutorService scheduledExecutorService, C6109u uVar, boolean z10, n nVar) {
            this.f30461a = i10;
            this.f30462b = executor;
            this.f30463c = scheduledExecutorService;
            this.f30464d = uVar;
            this.f30466f = z10;
            this.f30465e = nVar;
        }

        private void g(V.a aVar) {
            C5965a.C0464a aVar2 = new C5965a.C0464a();
            aVar2.f(CaptureRequest.CONTROL_AE_MODE, 3);
            aVar.e(aVar2.b());
        }

        private void h(V.a aVar, androidx.camera.core.impl.V v10) {
            int i10 = (this.f30461a != 3 || this.f30466f) ? (v10.k() == -1 || v10.k() == 5) ? 2 : -1 : 4;
            if (i10 != -1) {
                aVar.v(i10);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ C10101e l(List list, int i10, TotalCaptureResult totalCaptureResult) {
            return r(list, i10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ C10101e m(int i10, TotalCaptureResult totalCaptureResult) {
            if (C6050a0.e(i10, totalCaptureResult)) {
                q(f30460k);
            }
            return this.f30469i.a(totalCaptureResult);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ C10101e o(Boolean bool) {
            return Boolean.TRUE.equals(bool) ? C6050a0.j(this.f30467g, this.f30463c, this.f30464d, new C6059d0()) : I.n.p(null);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ Object p(V.a aVar, c.a aVar2) {
            aVar.c(new b(aVar2));
            return "submitStillCapture";
        }

        private void q(long j10) {
            this.f30467g = j10;
        }

        /* access modifiers changed from: package-private */
        public void f(e eVar) {
            this.f30468h.add(eVar);
        }

        /* access modifiers changed from: package-private */
        public C10101e<List<Void>> i(List<androidx.camera.core.impl.V> list, int i10) {
            I.d<T> f10 = I.d.b(k(i10)).f(new C6062e0(this, list, i10), this.f30462b);
            f10.a(new C6065f0(this), this.f30462b);
            return f10;
        }

        public void j() {
            this.f30469i.c();
        }

        public C10101e<TotalCaptureResult> k(int i10) {
            C10101e<TotalCaptureResult> p10 = I.n.p(null);
            if (this.f30468h.isEmpty()) {
                return p10;
            }
            return I.d.b(this.f30469i.b() ? C6050a0.k(this.f30464d, (f.a) null) : I.n.p(null)).f(new C6071h0(this, i10), this.f30462b).f(new C6074i0(this), this.f30462b);
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
            r4 = r6.f30464d.V().e();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ob.C10101e<java.util.List<java.lang.Void>> r(java.util.List<androidx.camera.core.impl.V> r7, int r8) {
            /*
                r6 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r7 = r7.iterator()
            L_0x000e:
                boolean r2 = r7.hasNext()
                if (r2 == 0) goto L_0x0087
                java.lang.Object r2 = r7.next()
                androidx.camera.core.impl.V r2 = (androidx.camera.core.impl.V) r2
                androidx.camera.core.impl.V$a r3 = androidx.camera.core.impl.V.a.k(r2)
                int r4 = r2.k()
                r5 = 5
                if (r4 != r5) goto L_0x005e
                v.u r4 = r6.f30464d
                v.q2 r4 = r4.V()
                boolean r4 = r4.g()
                if (r4 != 0) goto L_0x005e
                v.u r4 = r6.f30464d
                v.q2 r4 = r4.V()
                boolean r4 = r4.a()
                if (r4 != 0) goto L_0x005e
                v.u r4 = r6.f30464d
                v.q2 r4 = r4.V()
                androidx.camera.core.n r4 = r4.e()
                if (r4 == 0) goto L_0x005e
                v.u r5 = r6.f30464d
                v.q2 r5 = r5.V()
                boolean r5 = r5.f(r4)
                if (r5 == 0) goto L_0x005e
                C.W r4 = r4.F2()
                androidx.camera.core.impl.z r4 = androidx.camera.core.impl.A.a(r4)
                goto L_0x005f
            L_0x005e:
                r4 = 0
            L_0x005f:
                if (r4 == 0) goto L_0x0065
                r3.p(r4)
                goto L_0x0068
            L_0x0065:
                r6.h(r3, r2)
            L_0x0068:
                z.n r2 = r6.f30465e
                boolean r2 = r2.c(r8)
                if (r2 == 0) goto L_0x0073
                r6.g(r3)
            L_0x0073:
                v.g0 r2 = new v.g0
                r2.<init>(r6, r3)
                ob.e r2 = androidx.concurrent.futures.c.a(r2)
                r0.add(r2)
                androidx.camera.core.impl.V r2 = r3.h()
                r1.add(r2)
                goto L_0x000e
            L_0x0087:
                v.u r7 = r6.f30464d
                r7.t0(r1)
                ob.e r7 = I.n.k(r0)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: v.C6050a0.d.r(java.util.List, int):ob.e");
        }
    }

    /* renamed from: v.a0$e */
    interface e {
        C10101e<Boolean> a(TotalCaptureResult totalCaptureResult);

        boolean b();

        void c();
    }

    /* renamed from: v.a0$f */
    static class f implements C6109u.c {

        /* renamed from: a  reason: collision with root package name */
        private c.a<TotalCaptureResult> f30473a;

        /* renamed from: b  reason: collision with root package name */
        private final C10101e<TotalCaptureResult> f30474b = androidx.concurrent.futures.c.a(new C6080k0(this));

        /* renamed from: c  reason: collision with root package name */
        private final a f30475c;

        /* renamed from: v.a0$f$a */
        interface a {
            boolean a(TotalCaptureResult totalCaptureResult);
        }

        f(a aVar) {
            this.f30475c = aVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ Object d(c.a aVar) {
            this.f30473a = aVar;
            return "waitFor3AResult";
        }

        public boolean a(TotalCaptureResult totalCaptureResult) {
            a aVar = this.f30475c;
            if (aVar != null && !aVar.a(totalCaptureResult)) {
                return false;
            }
            this.f30473a.c(totalCaptureResult);
            return true;
        }

        public C10101e<TotalCaptureResult> c() {
            return this.f30474b;
        }
    }

    /* renamed from: v.a0$g */
    static class g implements e {

        /* renamed from: f  reason: collision with root package name */
        private static final long f30476f = TimeUnit.SECONDS.toNanos(2);

        /* renamed from: a  reason: collision with root package name */
        private final C6109u f30477a;

        /* renamed from: b  reason: collision with root package name */
        private final Executor f30478b;

        /* renamed from: c  reason: collision with root package name */
        private final ScheduledExecutorService f30479c;

        /* renamed from: d  reason: collision with root package name */
        private final U.i f30480d;

        /* renamed from: e  reason: collision with root package name */
        private final C6262A f30481e;

        g(C6109u uVar, Executor executor, ScheduledExecutorService scheduledExecutorService, C6262A a10) {
            this.f30477a = uVar;
            this.f30478b = executor;
            this.f30479c = scheduledExecutorService;
            this.f30481e = a10;
            U.i L10 = uVar.L();
            Objects.requireNonNull(L10);
            this.f30480d = L10;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ C10101e A(C10101e eVar, Object obj) {
            return I.n.z(TimeUnit.SECONDS.toMillis(3), this.f30479c, null, true, eVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ C10101e B(Void voidR) {
            return this.f30477a.H().d0();
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void r(c.a aVar) {
            C4391e0.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: UI change applied");
            aVar.c(null);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ C10101e t(Void voidR) {
            return C6050a0.j(f30476f, this.f30479c, this.f30477a, new C6086m0());
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void v(AtomicReference atomicReference, c.a aVar) {
            C4391e0.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: invoking applyScreenFlashUi");
            this.f30480d.a(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(3), (U.j) atomicReference.get());
            aVar.c(null);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ Object w(AtomicReference atomicReference, c.a aVar) {
            H.a.d().execute(new C6122y0(this, atomicReference, aVar));
            return "OnScreenFlashStart";
        }

        /* access modifiers changed from: private */
        public /* synthetic */ C10101e x(Void voidR) {
            return this.f30477a.H().v(true);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ Object y(c.a aVar) {
            if (!this.f30481e.a()) {
                aVar.c(null);
                return "EnableTorchInternal";
            }
            C4391e0.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: enable torch");
            this.f30477a.D(true);
            aVar.c(null);
            return "EnableTorchInternal";
        }

        /* access modifiers changed from: private */
        public /* synthetic */ C10101e z(Void voidR) {
            return androidx.concurrent.futures.c.a(new C6119x0(this));
        }

        public C10101e<Boolean> a(TotalCaptureResult totalCaptureResult) {
            C4391e0.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture");
            AtomicReference atomicReference = new AtomicReference();
            return I.d.b(androidx.concurrent.futures.c.a(new C6098q0(this, atomicReference))).f(new C6101r0(this), this.f30478b).f(new C6104s0(this), this.f30478b).f(new C6107t0(this, androidx.concurrent.futures.c.a(new C6083l0(atomicReference))), this.f30478b).f(new C6110u0(this), this.f30478b).f(new C6113v0(this), this.f30478b).e(new C6116w0(), H.a.a());
        }

        public boolean b() {
            return false;
        }

        public void c() {
            C4391e0.a("Camera2CapturePipeline", "ScreenFlashTask#postCapture");
            if (this.f30481e.a()) {
                this.f30477a.D(false);
            }
            this.f30477a.H().v(false).a(new C6092o0(), this.f30478b);
            this.f30477a.H().o(false, true);
            ScheduledExecutorService d10 = H.a.d();
            U.i iVar = this.f30480d;
            Objects.requireNonNull(iVar);
            d10.execute(new C6095p0(iVar));
        }
    }

    /* renamed from: v.a0$h */
    static class h implements e {

        /* renamed from: g  reason: collision with root package name */
        private static final long f30482g = TimeUnit.SECONDS.toNanos(2);

        /* renamed from: a  reason: collision with root package name */
        private final C6109u f30483a;

        /* renamed from: b  reason: collision with root package name */
        private final int f30484b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f30485c = false;

        /* renamed from: d  reason: collision with root package name */
        private final Executor f30486d;

        /* renamed from: e  reason: collision with root package name */
        private final ScheduledExecutorService f30487e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f30488f;

        h(C6109u uVar, int i10, Executor executor, ScheduledExecutorService scheduledExecutorService, boolean z10) {
            this.f30483a = uVar;
            this.f30484b = i10;
            this.f30486d = executor;
            this.f30487e = scheduledExecutorService;
            this.f30488f = z10;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ Object i(c.a aVar) {
            this.f30483a.S().g(aVar, true);
            return "TorchOn";
        }

        /* access modifiers changed from: private */
        public /* synthetic */ C10101e j(Void voidR) {
            return this.f30488f ? this.f30483a.H().d0() : I.n.p(null);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ C10101e l(Void voidR) {
            return C6050a0.j(f30482g, this.f30487e, this.f30483a, new C6022D0());
        }

        public C10101e<Boolean> a(TotalCaptureResult totalCaptureResult) {
            boolean e10 = C6050a0.e(this.f30484b, totalCaptureResult);
            C4391e0.a("Camera2CapturePipeline", "TorchTask#preCapture: isFlashRequired = " + e10);
            if (C6050a0.e(this.f30484b, totalCaptureResult)) {
                if (this.f30483a.b0()) {
                    C4391e0.a("Camera2CapturePipeline", "Torch already on, not turn on");
                } else {
                    C4391e0.a("Camera2CapturePipeline", "Turn on torch");
                    this.f30485c = true;
                    return I.d.b(androidx.concurrent.futures.c.a(new C6125z0(this))).f(new C6016A0(this), this.f30486d).f(new C6018B0(this), this.f30486d).e(new C6020C0(), H.a.a());
                }
            }
            return I.n.p(Boolean.FALSE);
        }

        public boolean b() {
            return this.f30484b == 0;
        }

        public void c() {
            if (this.f30485c) {
                this.f30483a.S().g((c.a<Void>) null, false);
                C4391e0.a("Camera2CapturePipeline", "Turning off torch");
                if (this.f30488f) {
                    this.f30483a.H().o(false, true);
                }
            }
        }
    }

    C6050a0(C6109u uVar, B b10, R0 r02, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        boolean z10 = true;
        this.f30442a = uVar;
        Integer num = (Integer) b10.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f30448g = (num == null || num.intValue() != 2) ? false : z10;
        this.f30446e = executor;
        this.f30447f = scheduledExecutorService;
        this.f30445d = r02;
        this.f30443b = new C6263B(r02);
        this.f30444c = z.g.a(new C6046X(b10));
    }

    /* access modifiers changed from: package-private */
    public static boolean d(TotalCaptureResult totalCaptureResult, boolean z10) {
        if (totalCaptureResult == null) {
            return false;
        }
        return C5011a0.a(new C6067g(totalCaptureResult), z10);
    }

    static boolean e(int i10, TotalCaptureResult totalCaptureResult) {
        C4391e0.a("Camera2CapturePipeline", "isFlashRequired: flashMode = " + i10);
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return false;
                }
                if (i10 != 3) {
                    throw new AssertionError(i10);
                }
            }
            return true;
        }
        Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
        C4391e0.a("Camera2CapturePipeline", "isFlashRequired: aeState = " + num);
        return num != null && num.intValue() == 4;
    }

    private boolean f(int i10) {
        return this.f30443b.a() || this.f30449h == 3 || i10 == 1;
    }

    static C10101e<TotalCaptureResult> j(long j10, ScheduledExecutorService scheduledExecutorService, C6109u uVar, f.a aVar) {
        return I.n.z(TimeUnit.NANOSECONDS.toMillis(j10), scheduledExecutorService, null, true, k(uVar, aVar));
    }

    static C10101e<TotalCaptureResult> k(C6109u uVar, f.a aVar) {
        f fVar = new f(aVar);
        uVar.A(fVar);
        C10101e<TotalCaptureResult> c10 = fVar.c();
        c10.a(new C6045W(uVar, fVar), uVar.f30680c);
        return c10;
    }

    /* access modifiers changed from: package-private */
    public d b(int i10, int i11, int i12) {
        n nVar = new n(this.f30445d);
        d dVar = new d(this.f30449h, this.f30446e, this.f30447f, this.f30442a, this.f30448g, nVar);
        if (i10 == 0) {
            dVar.f(new b(this.f30442a));
        }
        if (i11 == 3) {
            dVar.f(new g(this.f30442a, this.f30446e, this.f30447f, new C6262A(this.f30445d)));
        } else if (this.f30444c) {
            if (f(i12)) {
                dVar.f(new h(this.f30442a, i11, this.f30446e, this.f30447f, !this.f30443b.a() && !this.f30442a.Y()));
            } else {
                dVar.f(new a(this.f30442a, i11, nVar));
            }
        }
        C4391e0.a("Camera2CapturePipeline", "createPipeline: captureMode = " + i10 + ", flashMode = " + i11 + ", flashType = " + i12 + ", pipeline tasks = " + dVar.f30468h);
        return dVar;
    }

    /* access modifiers changed from: package-private */
    public C4428k c(int i10, int i11, int i12) {
        return new c(b(i10, i11, i12), this.f30446e, i11);
    }

    public void h(int i10) {
        this.f30449h = i10;
    }

    public C10101e<List<Void>> i(List<androidx.camera.core.impl.V> list, int i10, int i11, int i12) {
        return I.n.B(b(i10, i11, i12).i(list, i11));
    }
}
