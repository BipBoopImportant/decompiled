package V;

import C.C4391e0;
import C.C4408p;
import C.C4417z;
import C.F;
import C.G0;
import C.H0;
import G.p;
import G.q;
import H2.i;
import I.n;
import J.m;
import O.C4709t;
import O.N;
import O.W;
import V.H;
import V.h0;
import X.g;
import a0.f0;
import a0.i0;
import a0.k0;
import a0.m0;
import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.SystemClock;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.C5019e0;
import androidx.camera.core.impl.C5031k0;
import androidx.camera.core.impl.C5040p;
import androidx.camera.core.impl.C5044r0;
import androidx.camera.core.impl.C5046s0;
import androidx.camera.core.impl.C5059z;
import androidx.camera.core.impl.D0;
import androidx.camera.core.impl.E0;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.J0;
import androidx.camera.core.impl.X;
import androidx.camera.core.impl.X0;
import androidx.camera.core.impl.c1;
import androidx.camera.core.impl.h1;
import androidx.camera.core.impl.o1;
import androidx.camera.core.impl.p1;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk;
import androidx.concurrent.futures.c;
import b0.C5252b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import ob.C10101e;
import q.C5759a;

public final class W<T extends h0> extends H0 {

    /* renamed from: E  reason: collision with root package name */
    private static final e f14352E = new e();

    /* renamed from: A  reason: collision with root package name */
    private boolean f14353A = false;

    /* renamed from: B  reason: collision with root package name */
    private f f14354B;

    /* renamed from: C  reason: collision with root package name */
    private X0.c f14355C;

    /* renamed from: D  reason: collision with root package name */
    private final H0.a<H> f14356D = new a();

    /* renamed from: q  reason: collision with root package name */
    C5019e0 f14357q;

    /* renamed from: r  reason: collision with root package name */
    private N f14358r;

    /* renamed from: s  reason: collision with root package name */
    H f14359s = H.f14333a;

    /* renamed from: t  reason: collision with root package name */
    X0.b f14360t = new X0.b();

    /* renamed from: u  reason: collision with root package name */
    C10101e<Void> f14361u = null;

    /* renamed from: v  reason: collision with root package name */
    private G0 f14362v;

    /* renamed from: w  reason: collision with root package name */
    h0.a f14363w = h0.a.INACTIVE;

    /* renamed from: x  reason: collision with root package name */
    private O.W f14364x;

    /* renamed from: y  reason: collision with root package name */
    private Rect f14365y;

    /* renamed from: z  reason: collision with root package name */
    private int f14366z;

    class a implements H0.a<H> {
        a() {
        }

        /* renamed from: b */
        public void a(H h10) {
            if (h10 == null) {
                throw new IllegalArgumentException("StreamInfo can't be null");
            } else if (W.this.f14363w != h0.a.INACTIVE) {
                C4391e0.a("VideoCapture", "Stream info update: old: " + W.this.f14359s + " new: " + h10);
                W w10 = W.this;
                H h11 = w10.f14359s;
                w10.f14359s = h10;
                c1 c1Var = (c1) i.g(w10.e());
                if (W.this.H0(h11.a(), h10.a()) || W.this.d1(h11, h10)) {
                    W.this.Q0();
                } else if ((h11.a() != -1 && h10.a() == -1) || (h11.a() == -1 && h10.a() != -1)) {
                    W w11 = W.this;
                    w11.t0(w11.f14360t, h10, c1Var);
                    W w12 = W.this;
                    w12.X(F.a(new Object[]{w12.f14360t.o()}));
                    W.this.G();
                } else if (h11.c() != h10.c()) {
                    W w13 = W.this;
                    w13.t0(w13.f14360t, h10, c1Var);
                    W w14 = W.this;
                    w14.X(F.a(new Object[]{w14.f14360t.o()}));
                    W.this.I();
                }
            }
        }

        public void onError(Throwable th2) {
            C4391e0.m("VideoCapture", "Receive onError from StreamState observer", th2);
        }
    }

    class b extends C5040p {

        /* renamed from: a  reason: collision with root package name */
        private boolean f14368a = true;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f14369b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c.a f14370c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ X0.b f14371d;

        b(AtomicBoolean atomicBoolean, c.a aVar, X0.b bVar) {
            this.f14369b = atomicBoolean;
            this.f14370c = aVar;
            this.f14371d = bVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void f(X0.b bVar) {
            bVar.s(this);
        }

        public void b(int i10, C5059z zVar) {
            Object d10;
            super.b(i10, zVar);
            if (this.f14368a) {
                this.f14368a = false;
                C4391e0.a("VideoCapture", "cameraCaptureResult timestampNs = " + zVar.a() + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
            }
            if (!this.f14369b.get() && (d10 = zVar.b().d("androidx.camera.video.VideoCapture.streamUpdate")) != null && ((Integer) d10).intValue() == this.f14370c.hashCode() && this.f14370c.c(null) && !this.f14369b.getAndSet(true)) {
                H.a.d().execute(new X(this, this.f14371d));
            }
        }
    }

    class c implements I.c<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C10101e f14373a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f14374b;

        c(C10101e eVar, boolean z10) {
            this.f14373a = eVar;
            this.f14374b = z10;
        }

        public void b(Throwable th2) {
            if (!(th2 instanceof CancellationException)) {
                C4391e0.d("VideoCapture", "Surface update completed with unexpected exception", th2);
            }
        }

        /* renamed from: c */
        public void a(Void voidR) {
            C10101e<Void> eVar = this.f14373a;
            W w10 = W.this;
            if (eVar == w10.f14361u && w10.f14363w != h0.a.INACTIVE) {
                w10.V0(this.f14374b ? h0.a.ACTIVE_STREAMING : h0.a.ACTIVE_NON_STREAMING);
            }
        }
    }

    public static final class d<T extends h0> implements o1.a<W<T>, W.a<T>, d<T>>, C5046s0.a<d<T>> {

        /* renamed from: a  reason: collision with root package name */
        private final E0 f14376a;

        public d(T t10) {
            this(g(t10));
        }

        private static <T extends h0> E0 g(T t10) {
            E0 b02 = E0.b0();
            b02.q(W.a.f14617J, t10);
            return b02;
        }

        static d<? extends h0> h(X x10) {
            return new d<>(E0.c0(x10));
        }

        public D0 a() {
            return this.f14376a;
        }

        public W<T> f() {
            return new W<>(e());
        }

        /* renamed from: i */
        public W.a<T> e() {
            return new W.a<>(J0.Z(this.f14376a));
        }

        public d<T> j(p1.b bVar) {
            a().q(o1.f16978F, bVar);
            return this;
        }

        public d<T> k(C4417z zVar) {
            a().q(C5044r0.f17009m, zVar);
            return this;
        }

        public d<T> l(int i10) {
            a().q(C5046s0.f17013q, Integer.valueOf(i10));
            return this;
        }

        /* renamed from: m */
        public d<T> c(R.c cVar) {
            a().q(C5046s0.f17018v, cVar);
            return this;
        }

        public d<T> n(int i10) {
            a().q(o1.f16974B, Integer.valueOf(i10));
            return this;
        }

        public d<T> o(Class<W<T>> cls) {
            a().q(m.f8790c, cls);
            if (a().g(m.f8789b, null) == null) {
                q(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public d<T> p(Range<Integer> range) {
            a().q(o1.f16975C, range);
            return this;
        }

        public d<T> q(String str) {
            a().q(m.f8789b, str);
            return this;
        }

        /* renamed from: r */
        public d<T> d(Size size) {
            throw new UnsupportedOperationException("setTargetResolution is not supported.");
        }

        /* renamed from: s */
        public d<T> b(int i10) {
            a().q(C5046s0.f17011o, Integer.valueOf(i10));
            return this;
        }

        /* access modifiers changed from: package-private */
        public d<T> t(C5759a<i0, k0> aVar) {
            a().q(W.a.f14618K, aVar);
            return this;
        }

        private d(E0 e02) {
            this.f14376a = e02;
            if (e02.b(W.a.f14617J)) {
                Class cls = (Class) e02.g(m.f8790c, null);
                Class<W> cls2 = W.class;
                if (cls == null || cls.equals(cls2)) {
                    j(p1.b.VIDEO_CAPTURE);
                    o(cls2);
                    return;
                }
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            throw new IllegalArgumentException("VideoOutput is required");
        }
    }

    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        private static final h0 f14377a;

        /* renamed from: b  reason: collision with root package name */
        private static final W.a<?> f14378b;

        /* renamed from: c  reason: collision with root package name */
        private static final C5759a<i0, k0> f14379c;

        /* renamed from: d  reason: collision with root package name */
        static final Range<Integer> f14380d = new Range<>(30, 30);

        /* renamed from: e  reason: collision with root package name */
        static final C4417z f14381e;

        static {
            Y y10 = new Y();
            f14377a = y10;
            C5759a<i0, k0> aVar = m0.f15116d;
            f14379c = aVar;
            C4417z zVar = C4417z.f5465d;
            f14381e = zVar;
            f14378b = new d(y10).n(5).t(aVar).k(zVar).e();
        }

        public W.a<?> a() {
            return f14378b;
        }
    }

    static class f implements H0.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private androidx.camera.core.impl.F f14382a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f14383b = false;

        f(androidx.camera.core.impl.F f10) {
            this.f14382a = f10;
        }

        private void d(boolean z10) {
            if (this.f14383b != z10) {
                this.f14383b = z10;
                androidx.camera.core.impl.F f10 = this.f14382a;
                if (f10 == null) {
                    C4391e0.a("VideoCapture", "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
                } else if (z10) {
                    f10.l();
                } else {
                    f10.c();
                }
            }
        }

        public void b() {
            i.j(p.c(), "SourceStreamRequirementObserver can be closed from main thread only");
            C4391e0.a("VideoCapture", "SourceStreamRequirementObserver#close: mIsSourceStreamRequired = " + this.f14383b);
            if (this.f14382a == null) {
                C4391e0.a("VideoCapture", "SourceStreamRequirementObserver#close: Already closed!");
                return;
            }
            d(false);
            this.f14382a = null;
        }

        /* renamed from: c */
        public void a(Boolean bool) {
            i.j(p.c(), "SourceStreamRequirementObserver can be updated from main thread only");
            d(Boolean.TRUE.equals(bool));
        }

        public void onError(Throwable th2) {
            C4391e0.m("VideoCapture", "SourceStreamRequirementObserver#onError", th2);
        }
    }

    W(W.a<T> aVar) {
        super(aVar);
    }

    private static k0 A0(C5759a<i0, k0> aVar, g gVar, C4417z zVar, C4926k kVar, Size size, Range<Integer> range) {
        k0 T02;
        int b10;
        if (zVar.e()) {
            return T0(aVar, gVar, kVar, size, zVar, range);
        }
        k0 k0Var = null;
        int i10 = Integer.MIN_VALUE;
        for (C5031k0.c next : gVar.b()) {
            C4417z zVar2 = zVar;
            if (C5252b.f(next, zVar) && (T02 = T0(aVar, gVar, kVar, size, new C4417z(C5252b.h(next.g()), C5252b.g(next.b())), range)) != null && (b10 = N.d.b(T02.i().getUpper().intValue(), T02.j().getUpper().intValue())) > i10) {
                k0Var = T02;
                i10 = b10;
            }
        }
        return k0Var;
    }

    private int B0(J j10) {
        boolean C10 = C(j10);
        int r10 = r(j10, C10);
        if (!Y0()) {
            return r10;
        }
        G0.h b10 = this.f14359s.b();
        Objects.requireNonNull(b10);
        int b11 = b10.b();
        if (C10 != b10.f()) {
            b11 = -b11;
        }
        return q.w(r10 - b11);
    }

    private C4926k D0() {
        return (C4926k) y0(E0().c(), (Object) null);
    }

    private I F0(C4408p pVar) {
        return E0().g(pVar);
    }

    private boolean G0(J j10, W.a<?> aVar, Rect rect, Size size) {
        return l() != null || a1(j10, aVar) || b1(j10) || Z0(rect, size) || c1(j10) || Y0();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int I0(Rect rect, Size size, Size size2) {
        return (Math.abs(size.getWidth() - rect.width()) + Math.abs(size.getHeight() - rect.height())) - (Math.abs(size2.getWidth() - rect.width()) + Math.abs(size2.getHeight() - rect.height()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void L0(C5019e0 e0Var) {
        if (e0Var == this.f14357q) {
            v0();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void M0(X0 x02, X0.g gVar) {
        Q0();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void N0(AtomicBoolean atomicBoolean, X0.b bVar, C5040p pVar) {
        i.j(p.c(), "Surface update cancellation should only occur on main thread.");
        atomicBoolean.set(true);
        bVar.s(pVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object O0(X0.b bVar, c.a aVar) {
        bVar.n("androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(aVar.hashCode()));
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        b bVar2 = new b(atomicBoolean, aVar, bVar);
        aVar.a(new S(atomicBoolean, bVar, bVar2), H.a.a());
        bVar.j(bVar2);
        return String.format("%s[0x%x]", new Object[]{"androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(aVar.hashCode())});
    }

    /* access modifiers changed from: private */
    /* renamed from: P0 */
    public void K0(N n10, J j10, W.a<T> aVar, h1 h1Var) {
        if (j10 == g()) {
            this.f14362v = n10.k(j10);
            aVar.Y().e(this.f14362v, h1Var);
            U0();
        }
    }

    private static Range<Integer> R0(c1 c1Var) {
        Range<Integer> c10 = c1Var.c();
        return Objects.equals(c10, c1.f16864a) ? e.f14380d : c10;
    }

    private static h1 S0(J j10, O.W w10) {
        return (w10 != null || !j10.q()) ? j10.j().m() : h1.UPTIME;
    }

    private static k0 T0(C5759a<i0, k0> aVar, g gVar, C4926k kVar, Size size, C4417z zVar, Range<Integer> range) {
        k0 apply = aVar.apply(Z.c.c(Z.c.d(kVar, zVar, gVar), h1.UPTIME, kVar.d(), size, zVar, range));
        Size size2 = null;
        if (apply == null) {
            C4391e0.l("VideoCapture", "Can't find videoEncoderInfo");
            return null;
        }
        if (gVar != null) {
            size2 = new Size(gVar.k().k(), gVar.k().h());
        }
        return c0.d.l(apply, size2);
    }

    private void U0() {
        J g10 = g();
        N n10 = this.f14358r;
        if (g10 != null && n10 != null) {
            int B02 = B0(g10);
            this.f14366z = B02;
            n10.D(B02, d());
        }
    }

    private void X0(X0.b bVar, boolean z10) {
        C10101e<Void> eVar = this.f14361u;
        if (eVar != null && eVar.cancel(false)) {
            C4391e0.a("VideoCapture", "A newer surface update is requested. Previous surface update cancelled.");
        }
        C10101e<Void> a10 = androidx.concurrent.futures.c.a(new Q(this, bVar));
        this.f14361u = a10;
        n.j(a10, new c(a10, z10), H.a.d());
    }

    private boolean Y0() {
        return this.f14359s.b() != null;
    }

    private static boolean Z0(Rect rect, Size size) {
        return (size.getWidth() == rect.width() && size.getHeight() == rect.height()) ? false : true;
    }

    private static <T extends h0> boolean a1(J j10, W.a<T> aVar) {
        return j10.q() && aVar.Z();
    }

    private static boolean b1(J j10) {
        return j10.q() && (SurfaceProcessingQuirk.e(androidx.camera.video.internal.compat.quirk.a.c()) || SurfaceProcessingQuirk.e(j10.j().h()));
    }

    private boolean c1(J j10) {
        return j10.q() && C(j10);
    }

    private void e1(I i10, o1.a<?, ?, ?> aVar) {
        C4926k D02 = D0();
        i.b(D02 != null, "Unable to update target resolution by null MediaSpec.");
        C4417z C02 = C0();
        I F02 = F0(i10);
        List<C4927l> b10 = F02.b(C02);
        if (b10.isEmpty()) {
            C4391e0.l("VideoCapture", "Can't find any supported quality on the device.");
            return;
        }
        i0 d10 = D02.d();
        C4930o e10 = d10.e();
        List<C4927l> d11 = e10.d(b10);
        C4391e0.a("VideoCapture", "Found selectedQualities " + d11 + " by " + e10);
        if (!d11.isEmpty()) {
            int b11 = d10.b();
            Map<C4927l, Size> f10 = C4930o.f(F02, C02);
            C4929n nVar = new C4929n(i10.i(m()), f10);
            ArrayList arrayList = new ArrayList();
            for (C4927l g10 : d11) {
                arrayList.addAll(nVar.g(g10, b11));
            }
            List<Size> z02 = z0((W.a) aVar.e(), D02, C02, F02, arrayList, f10);
            C4391e0.a("VideoCapture", "Set custom ordered resolutions = " + z02);
            aVar.a().q(C5046s0.f17019w, z02);
            return;
        }
        throw new IllegalArgumentException("Unable to find supported quality by QualitySelector");
    }

    private static void l0(Set<Size> set, int i10, int i11, Size size, k0 k0Var) {
        if (i10 <= size.getWidth() && i11 <= size.getHeight()) {
            try {
                set.add(new Size(i10, k0Var.h(i10).clamp(Integer.valueOf(i11)).intValue()));
            } catch (IllegalArgumentException e10) {
                C4391e0.m("VideoCapture", "No supportedHeights for width: " + i10, e10);
            }
            try {
                set.add(new Size(k0Var.b(i11).clamp(Integer.valueOf(i10)).intValue(), i11));
            } catch (IllegalArgumentException e11) {
                C4391e0.m("VideoCapture", "No supportedWidths for height: " + i11, e11);
            }
        }
    }

    private static Rect m0(Rect rect, int i10, boolean z10, k0 k0Var) {
        SizeCannotEncodeVideoQuirk sizeCannotEncodeVideoQuirk = (SizeCannotEncodeVideoQuirk) androidx.camera.video.internal.compat.quirk.a.b(SizeCannotEncodeVideoQuirk.class);
        if (sizeCannotEncodeVideoQuirk == null) {
            return rect;
        }
        if (!z10) {
            i10 = 0;
        }
        return sizeCannotEncodeVideoQuirk.f(rect, i10, k0Var);
    }

    private static Rect n0(Rect rect, Size size, k0 k0Var) {
        C4391e0.a("VideoCapture", String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", new Object[]{q.n(rect), Integer.valueOf(k0Var.f()), Integer.valueOf(k0Var.c()), k0Var.i(), k0Var.j()}));
        if ((!k0Var.i().contains(Integer.valueOf(rect.width())) || !k0Var.j().contains(Integer.valueOf(rect.height()))) && k0Var.a() && k0Var.j().contains(Integer.valueOf(rect.width())) && k0Var.i().contains(Integer.valueOf(rect.height()))) {
            k0Var = new f0(k0Var);
        }
        int f10 = k0Var.f();
        int c10 = k0Var.c();
        Range<Integer> i10 = k0Var.i();
        Range<Integer> j10 = k0Var.j();
        int r02 = r0(rect.width(), f10, i10);
        int s02 = s0(rect.width(), f10, i10);
        int r03 = r0(rect.height(), c10, j10);
        int s03 = s0(rect.height(), c10, j10);
        HashSet hashSet = new HashSet();
        l0(hashSet, r02, r03, size, k0Var);
        l0(hashSet, r02, s03, size, k0Var);
        l0(hashSet, s02, r03, size, k0Var);
        l0(hashSet, s02, s03, size, k0Var);
        if (hashSet.isEmpty()) {
            C4391e0.l("VideoCapture", "Can't find valid cropped size");
            return rect;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        C4391e0.a("VideoCapture", "candidatesList = " + arrayList);
        Collections.sort(arrayList, new T(rect));
        C4391e0.a("VideoCapture", "sorted candidatesList = " + arrayList);
        Size size2 = (Size) arrayList.get(0);
        int width = size2.getWidth();
        int height = size2.getHeight();
        if (width == rect.width() && height == rect.height()) {
            C4391e0.a("VideoCapture", "No need to adjust cropRect because crop size is valid.");
            return rect;
        }
        i.i(width % 2 == 0 && height % 2 == 0 && width <= size.getWidth() && height <= size.getHeight());
        Rect rect2 = new Rect(rect);
        if (width != rect.width()) {
            int max = Math.max(0, rect.centerX() - (width / 2));
            rect2.left = max;
            int i11 = max + width;
            rect2.right = i11;
            if (i11 > size.getWidth()) {
                int width2 = size.getWidth();
                rect2.right = width2;
                rect2.left = width2 - width;
            }
        }
        if (height != rect.height()) {
            int max2 = Math.max(0, rect.centerY() - (height / 2));
            rect2.top = max2;
            int i12 = max2 + height;
            rect2.bottom = i12;
            if (i12 > size.getHeight()) {
                int height2 = size.getHeight();
                rect2.bottom = height2;
                rect2.top = height2 - height;
            }
        }
        C4391e0.a("VideoCapture", String.format("Adjust cropRect from %s to %s", new Object[]{q.n(rect), q.n(rect2)}));
        return rect2;
    }

    private Rect o0(Rect rect, int i10) {
        return Y0() ? q.r(q.f(((G0.h) i.g(this.f14359s.b())).a(), i10)) : rect;
    }

    private Size p0(Size size, Rect rect, Rect rect2) {
        if (!Y0() || rect2.equals(rect)) {
            return size;
        }
        float height = ((float) rect2.height()) / ((float) rect.height());
        return new Size((int) Math.ceil((double) (((float) size.getWidth()) * height)), (int) Math.ceil((double) (((float) size.getHeight()) * height)));
    }

    private static int q0(boolean z10, int i10, int i11, Range<Integer> range) {
        int i12 = i10 % i11;
        if (i12 != 0) {
            i10 = z10 ? i10 - i12 : i10 + (i11 - i12);
        }
        return range.clamp(Integer.valueOf(i10)).intValue();
    }

    private static int r0(int i10, int i11, Range<Integer> range) {
        return q0(true, i10, i11, range);
    }

    private static int s0(int i10, int i11, Range<Integer> range) {
        return q0(false, i10, i11, range);
    }

    private Rect u0(Size size, k0 k0Var) {
        Rect A10 = A() != null ? A() : new Rect(0, 0, size.getWidth(), size.getHeight());
        return (k0Var == null || k0Var.e(A10.width(), A10.height())) ? A10 : n0(A10, size, k0Var);
    }

    private void v0() {
        p.a();
        X0.c cVar = this.f14355C;
        if (cVar != null) {
            cVar.b();
            this.f14355C = null;
        }
        C5019e0 e0Var = this.f14357q;
        if (e0Var != null) {
            e0Var.d();
            this.f14357q = null;
        }
        O.W w10 = this.f14364x;
        if (w10 != null) {
            w10.i();
            this.f14364x = null;
        }
        N n10 = this.f14358r;
        if (n10 != null) {
            n10.i();
            this.f14358r = null;
        }
        this.f14365y = null;
        this.f14362v = null;
        this.f14359s = H.f14333a;
        this.f14366z = 0;
        this.f14353A = false;
    }

    private O.W w0(J j10, W.a<T> aVar, Rect rect, Size size, C4417z zVar) {
        if (!G0(j10, aVar, rect, size)) {
            return null;
        }
        C4391e0.a("VideoCapture", "Surface processing is enabled.");
        J g10 = g();
        Objects.requireNonNull(g10);
        return new O.W(g10, l() != null ? l().a() : C4709t.a.a(zVar));
    }

    @SuppressLint({"WrongConstant"})
    private X0.b x0(W.a<T> aVar, c1 c1Var) {
        W.a<T> aVar2 = aVar;
        p.a();
        J j10 = (J) i.g(g());
        Size e10 = c1Var.e();
        M m10 = new M(this);
        Range<Integer> R02 = R0(c1Var);
        C4926k D02 = D0();
        Objects.requireNonNull(D02);
        I F02 = F0(j10.b());
        C4417z b10 = c1Var.b();
        k0 T02 = T0(aVar.X(), F02.c(e10, b10), D02, e10, b10, R02);
        this.f14366z = B0(j10);
        Rect u02 = u0(e10, T02);
        Rect o02 = o0(u02, this.f14366z);
        this.f14365y = o02;
        Size p02 = p0(e10, u02, o02);
        boolean z10 = true;
        if (Y0()) {
            this.f14353A = true;
        }
        Rect rect = this.f14365y;
        Rect m02 = m0(rect, this.f14366z, G0(j10, aVar2, rect, e10), T02);
        this.f14365y = m02;
        O.W w02 = w0(j10, aVar, m02, e10, b10);
        this.f14364x = w02;
        h1 S02 = S0(j10, w02);
        C4391e0.a("VideoCapture", "camera timebase = " + j10.j().m() + ", processing timebase = " + S02);
        c1 a10 = c1Var.g().e(p02).c(R02).a();
        if (this.f14358r != null) {
            z10 = false;
        }
        i.i(z10);
        Matrix v10 = v();
        boolean q10 = j10.q();
        Rect rect2 = this.f14365y;
        N n10 = new N(2, 34, a10, v10, q10, rect2, this.f14366z, d(), c1(j10));
        this.f14358r = n10;
        n10.e(m10);
        if (this.f14364x != null) {
            Q.f j11 = Q.f.j(this.f14358r);
            N n11 = (N) this.f14364x.m(W.b.c(this.f14358r, Collections.singletonList(j11))).get(j11);
            Objects.requireNonNull(n11);
            n11.e(new N(this, n11, j10, aVar, S02));
            this.f14362v = n11.k(j10);
            C5019e0 o10 = this.f14358r.o();
            this.f14357q = o10;
            o10.k().a(new O(this, o10), H.a.d());
        } else {
            G0 k10 = this.f14358r.k(j10);
            this.f14362v = k10;
            this.f14357q = k10.m();
        }
        aVar.Y().e(this.f14362v, S02);
        U0();
        this.f14357q.s(MediaCodec.class);
        X0.b q11 = X0.b.q(aVar2, c1Var.e());
        q11.u(c1Var.c());
        q11.A(aVar.w());
        X0.c cVar = this.f14355C;
        if (cVar != null) {
            cVar.b();
        }
        X0.c cVar2 = new X0.c(new P(this));
        this.f14355C = cVar2;
        q11.t(cVar2);
        if (c1Var.d() != null) {
            q11.g(c1Var.d());
        }
        return q11;
    }

    private static <T> T y0(androidx.camera.core.impl.H0<T> h02, T t10) {
        C10101e<T> a10 = h02.a();
        if (!a10.isDone()) {
            return t10;
        }
        try {
            return a10.get();
        } catch (InterruptedException | ExecutionException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static List<Size> z0(W.a<?> aVar, C4926k kVar, C4417z zVar, I i10, List<Size> list, Map<C4927l, Size> map) {
        g c10;
        if (list.isEmpty()) {
            return list;
        }
        Iterator<Size> it = list.iterator();
        while (it.hasNext()) {
            Size next = it.next();
            if (!map.containsValue(next) && (c10 = i10.c(next, zVar)) != null) {
                C5759a<i0, k0> X10 = aVar.X();
                Range<Integer> x10 = aVar.x(e.f14380d);
                Objects.requireNonNull(x10);
                k0 A02 = A0(X10, c10, zVar, kVar, next, x10);
                if (A02 != null && !A02.e(next.getWidth(), next.getHeight())) {
                    it.remove();
                }
            }
        }
        return list;
    }

    public C4417z C0() {
        return j().I() ? j().G() : e.f14381e;
    }

    public T E0() {
        return ((W.a) j()).Y();
    }

    /* access modifiers changed from: package-private */
    public boolean H0(int i10, int i11) {
        Set<Integer> set = H.f14334b;
        return !set.contains(Integer.valueOf(i10)) && !set.contains(Integer.valueOf(i11)) && i10 != i11;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [androidx.camera.core.impl.o1$a<?, ?, ?>, androidx.camera.core.impl.o1$a] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.camera.core.impl.o1<?> L(androidx.camera.core.impl.I r1, androidx.camera.core.impl.o1.a<?, ?, ?> r2) {
        /*
            r0 = this;
            r0.e1(r1, r2)
            androidx.camera.core.impl.o1 r1 = r2.e()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: V.W.L(androidx.camera.core.impl.I, androidx.camera.core.impl.o1$a):androidx.camera.core.impl.o1");
    }

    public void M() {
        super.M();
        C4391e0.a("VideoCapture", "VideoCapture#onStateAttached: cameraID = " + i());
        if (e() != null && this.f14362v == null) {
            c1 c1Var = (c1) i.g(e());
            this.f14359s = (H) y0(E0().d(), H.f14333a);
            X0.b x02 = x0((W.a) j(), c1Var);
            this.f14360t = x02;
            t0(x02, this.f14359s, c1Var);
            X(F.a(new Object[]{this.f14360t.o()}));
            E();
            E0().d().c(H.a.d(), this.f14356D);
            f fVar = this.f14354B;
            if (fVar != null) {
                fVar.b();
            }
            this.f14354B = new f(h());
            E0().f().c(H.a.d(), this.f14354B);
            V0(h0.a.ACTIVE_NON_STREAMING);
        }
    }

    public void N() {
        C4391e0.a("VideoCapture", "VideoCapture#onStateDetached");
        i.j(p.c(), "VideoCapture can only be detached on the main thread.");
        if (this.f14354B != null) {
            E0().f().d(this.f14354B);
            this.f14354B.b();
            this.f14354B = null;
        }
        V0(h0.a.INACTIVE);
        E0().d().d(this.f14356D);
        C10101e<Void> eVar = this.f14361u;
        if (eVar != null && eVar.cancel(false)) {
            C4391e0.a("VideoCapture", "VideoCapture is detached from the camera. Surface update cancelled.");
        }
        v0();
    }

    /* access modifiers changed from: protected */
    public c1 O(X x10) {
        this.f14360t.g(x10);
        X(F.a(new Object[]{this.f14360t.o()}));
        c1 e10 = e();
        Objects.requireNonNull(e10);
        return e10.g().d(x10).a();
    }

    /* access modifiers changed from: protected */
    public c1 P(c1 c1Var, c1 c1Var2) {
        C4391e0.a("VideoCapture", "onSuggestedStreamSpecUpdated: " + c1Var);
        List<Size> H10 = ((W.a) j()).H((List<Size>) null);
        if (H10 != null && !H10.contains(c1Var.e())) {
            C4391e0.l("VideoCapture", "suggested resolution " + c1Var.e() + " is not in custom ordered resolutions " + H10);
        }
        return c1Var;
    }

    /* access modifiers changed from: package-private */
    public void Q0() {
        if (g() != null) {
            v0();
            X0.b x02 = x0((W.a) j(), (c1) i.g(e()));
            this.f14360t = x02;
            t0(x02, this.f14359s, e());
            X(F.a(new Object[]{this.f14360t.o()}));
            G();
        }
    }

    public void V(Rect rect) {
        super.V(rect);
        U0();
    }

    /* access modifiers changed from: package-private */
    public void V0(h0.a aVar) {
        if (aVar != this.f14363w) {
            this.f14363w = aVar;
            E0().b(aVar);
        }
    }

    public void W0(int i10) {
        if (U(i10)) {
            U0();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean d1(H h10, H h11) {
        return this.f14353A && h10.b() != null && h11.b() == null;
    }

    public o1<?> k(boolean z10, p1 p1Var) {
        e eVar = f14352E;
        X a10 = p1Var.a(eVar.a().getCaptureType(), 1);
        if (z10) {
            a10 = X.O(a10, eVar.a());
        }
        if (a10 == null) {
            return null;
        }
        return z(a10).e();
    }

    /* access modifiers changed from: package-private */
    public void t0(X0.b bVar, H h10, c1 c1Var) {
        C5019e0 e0Var;
        boolean z10 = false;
        boolean z11 = h10.a() == -1;
        if (h10.c() == H.a.ACTIVE) {
            z10 = true;
        }
        if (!z11 || !z10) {
            bVar.p();
            C4417z b10 = c1Var.b();
            if (!z11 && (e0Var = this.f14357q) != null) {
                if (z10) {
                    bVar.m(e0Var, b10, (String) null, -1);
                } else {
                    bVar.i(e0Var, b10);
                }
            }
            X0(bVar, z10);
            return;
        }
        throw new IllegalStateException("Unexpected stream state, stream is error but active");
    }

    public String toString() {
        return "VideoCapture:" + o();
    }

    public Set<Integer> x() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    public o1.a<?, ?, ?> z(X x10) {
        return d.h(x10);
    }
}
