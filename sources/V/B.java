package V;

import C.C4391e0;
import C.C4408p;
import C.C4417z;
import C.G0;
import I.n;
import V.C4926k;
import V.H;
import V.h0;
import a0.C4954E;
import a0.C4961e;
import a0.C4962f;
import a0.C4965i;
import a0.C4966j;
import a0.C4968l;
import a0.e0;
import a0.k0;
import a0.m0;
import android.media.MediaMuxer;
import android.net.Uri;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.F0;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.b1;
import androidx.camera.core.impl.h1;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.concurrent.futures.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import ob.C10101e;

public final class B implements h0 {

    /* renamed from: f0  reason: collision with root package name */
    private static final Set<i> f14235f0 = Collections.unmodifiableSet(EnumSet.of(i.PENDING_RECORDING, i.PENDING_PAUSED));

    /* renamed from: g0  reason: collision with root package name */
    private static final Set<i> f14236g0 = Collections.unmodifiableSet(EnumSet.of(i.CONFIGURING, i.IDLING, i.RESETTING, i.STOPPING, i.ERROR));

    /* renamed from: h0  reason: collision with root package name */
    public static final C4930o f14237h0;

    /* renamed from: i0  reason: collision with root package name */
    private static final i0 f14238i0;

    /* renamed from: j0  reason: collision with root package name */
    private static final C4926k f14239j0;

    /* renamed from: k0  reason: collision with root package name */
    private static final Exception f14240k0 = new RuntimeException("The video frame producer became inactive before any data was received.");

    /* renamed from: l0  reason: collision with root package name */
    static final C4968l f14241l0 = new C4934t();

    /* renamed from: m0  reason: collision with root package name */
    private static final Executor f14242m0 = H.a.f(H.a.c());

    /* renamed from: n0  reason: collision with root package name */
    static int f14243n0 = 3;

    /* renamed from: o0  reason: collision with root package name */
    static long f14244o0 = 1000;

    /* renamed from: A  reason: collision with root package name */
    final F0<C4926k> f14245A;

    /* renamed from: B  reason: collision with root package name */
    C4965i f14246B;

    /* renamed from: C  reason: collision with root package name */
    e0 f14247C;

    /* renamed from: D  reason: collision with root package name */
    C4965i f14248D;

    /* renamed from: E  reason: collision with root package name */
    e0 f14249E;

    /* renamed from: F  reason: collision with root package name */
    e f14250F;

    /* renamed from: G  reason: collision with root package name */
    Uri f14251G;

    /* renamed from: H  reason: collision with root package name */
    long f14252H;

    /* renamed from: I  reason: collision with root package name */
    long f14253I;

    /* renamed from: J  reason: collision with root package name */
    long f14254J;

    /* renamed from: K  reason: collision with root package name */
    int f14255K;

    /* renamed from: L  reason: collision with root package name */
    Range<Integer> f14256L;

    /* renamed from: M  reason: collision with root package name */
    long f14257M;

    /* renamed from: N  reason: collision with root package name */
    long f14258N;

    /* renamed from: O  reason: collision with root package name */
    long f14259O;

    /* renamed from: P  reason: collision with root package name */
    long f14260P;

    /* renamed from: Q  reason: collision with root package name */
    long f14261Q;

    /* renamed from: R  reason: collision with root package name */
    int f14262R;

    /* renamed from: S  reason: collision with root package name */
    Throwable f14263S;

    /* renamed from: T  reason: collision with root package name */
    C4962f f14264T;

    /* renamed from: U  reason: collision with root package name */
    final N.c<C4962f> f14265U;

    /* renamed from: V  reason: collision with root package name */
    Throwable f14266V;

    /* renamed from: W  reason: collision with root package name */
    boolean f14267W;

    /* renamed from: X  reason: collision with root package name */
    h0.a f14268X;

    /* renamed from: Y  reason: collision with root package name */
    ScheduledFuture<?> f14269Y;

    /* renamed from: Z  reason: collision with root package name */
    private boolean f14270Z;

    /* renamed from: a  reason: collision with root package name */
    private final F0<H> f14271a;

    /* renamed from: a0  reason: collision with root package name */
    g0 f14272a0;

    /* renamed from: b  reason: collision with root package name */
    private final F0<Boolean> f14273b;

    /* renamed from: b0  reason: collision with root package name */
    g0 f14274b0;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f14275c;

    /* renamed from: c0  reason: collision with root package name */
    double f14276c0;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Executor f14277d;

    /* renamed from: d0  reason: collision with root package name */
    private boolean f14278d0;

    /* renamed from: e  reason: collision with root package name */
    final Executor f14279e;

    /* renamed from: e0  reason: collision with root package name */
    private h f14280e0;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C4968l f14281f;

    /* renamed from: g  reason: collision with root package name */
    private final C4968l f14282g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f14283h = new Object();

    /* renamed from: i  reason: collision with root package name */
    private final boolean f14284i;

    /* renamed from: j  reason: collision with root package name */
    private final int f14285j;

    /* renamed from: k  reason: collision with root package name */
    private i f14286k;

    /* renamed from: l  reason: collision with root package name */
    private i f14287l;

    /* renamed from: m  reason: collision with root package name */
    int f14288m;

    /* renamed from: n  reason: collision with root package name */
    private long f14289n;

    /* renamed from: o  reason: collision with root package name */
    boolean f14290o;

    /* renamed from: p  reason: collision with root package name */
    private G0.h f14291p;

    /* renamed from: q  reason: collision with root package name */
    private G0.h f14292q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public X.g f14293r;

    /* renamed from: s  reason: collision with root package name */
    final List<C10101e<Void>> f14294s;

    /* renamed from: t  reason: collision with root package name */
    Integer f14295t;

    /* renamed from: u  reason: collision with root package name */
    Integer f14296u;

    /* renamed from: v  reason: collision with root package name */
    G0 f14297v;

    /* renamed from: w  reason: collision with root package name */
    h1 f14298w;

    /* renamed from: x  reason: collision with root package name */
    Surface f14299x;

    /* renamed from: y  reason: collision with root package name */
    Surface f14300y;

    /* renamed from: z  reason: collision with root package name */
    MediaMuxer f14301z;

    class a implements I.c<C4965i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g0 f14302a;

        a(g0 g0Var) {
            this.f14302a = g0Var;
        }

        public void b(Throwable th2) {
            C4391e0.a("Recorder", "Error in ReadyToReleaseFuture: " + th2);
        }

        /* renamed from: c */
        public void a(C4965i iVar) {
            C4965i iVar2;
            C4391e0.a("Recorder", "VideoEncoder can be released: " + iVar);
            if (iVar != null) {
                ScheduledFuture<?> scheduledFuture = B.this.f14269Y;
                if (scheduledFuture != null && scheduledFuture.cancel(false) && (iVar2 = B.this.f14246B) != null && iVar2 == iVar) {
                    B.S(iVar2);
                }
                B b10 = B.this;
                b10.f14274b0 = this.f14302a;
                b10.h0((Surface) null);
                B b11 = B.this;
                b11.a0(4, (Throwable) null, b11.G());
            }
        }
    }

    class b implements C4966j {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c.a f14304b;

        b(c.a aVar, g gVar) {
            this.f14304b = aVar;
        }

        public void a() {
            this.f14304b.c(null);
        }

        public void b(C4961e eVar) {
            this.f14304b.f(eVar);
        }

        public void d(C4962f fVar) {
            boolean z10;
            B b10 = B.this;
            if (b10.f14301z != null) {
                try {
                    b10.r0(fVar, (g) null);
                    if (fVar != null) {
                        fVar.close();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            } else if (!b10.f14290o) {
                C4962f fVar2 = b10.f14264T;
                if (fVar2 != null) {
                    fVar2.close();
                    B.this.f14264T = null;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (fVar.y0()) {
                    B b11 = B.this;
                    b11.f14264T = fVar;
                    if (!b11.F() || !B.this.f14265U.isEmpty()) {
                        C4391e0.a("Recorder", "Received video keyframe. Starting muxer...");
                        B.this.k0((g) null);
                        return;
                    } else if (z10) {
                        C4391e0.a("Recorder", "Replaced cached video keyframe with newer keyframe.");
                        return;
                    } else {
                        C4391e0.a("Recorder", "Cached video keyframe while we wait for first audio sample before starting muxer.");
                        return;
                    }
                } else {
                    if (z10) {
                        C4391e0.a("Recorder", "Dropped cached keyframe since we have new video data and have not yet received audio data.");
                    }
                    C4391e0.a("Recorder", "Dropped video data since muxer has not yet started and data is not a keyframe.");
                    B.this.f14246B.g();
                    fVar.close();
                    return;
                }
            } else {
                C4391e0.a("Recorder", "Drop video data since recording is stopping.");
                fVar.close();
                return;
            }
            throw th;
        }

        public void e() {
        }

        public void f(e0 e0Var) {
            B.this.f14247C = e0Var;
        }
    }

    class c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ H2.a f14306a;

        c(H2.a aVar) {
            this.f14306a = aVar;
        }
    }

    class d implements I.c<List<Void>> {
        d() {
        }

        public void b(Throwable th2) {
            B.this.getClass();
            H2.i.j(false, "In-progress recording shouldn't be null");
            B.this.getClass();
            throw null;
        }

        /* renamed from: c */
        public void a(List<Void> list) {
            C4391e0.a("Recorder", "Encodings end successfully.");
            B b10 = B.this;
            b10.z(b10.f14262R, b10.f14263S);
        }
    }

    enum e {
        INITIALIZING,
        IDLING,
        DISABLED,
        ENABLED,
        ERROR_ENCODER,
        ERROR_SOURCE
    }

    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        private final C4926k.a f14309a;

        /* renamed from: b  reason: collision with root package name */
        private int f14310b = 0;

        /* renamed from: c  reason: collision with root package name */
        private Executor f14311c = null;

        /* renamed from: d  reason: collision with root package name */
        private C4968l f14312d;

        /* renamed from: e  reason: collision with root package name */
        private C4968l f14313e;

        public f() {
            C4968l lVar = B.f14241l0;
            this.f14312d = lVar;
            this.f14313e = lVar;
            this.f14309a = C4926k.a();
        }

        public B c() {
            return new B(this.f14311c, this.f14309a.a(), this.f14310b, this.f14312d, this.f14313e);
        }

        public f f(int i10) {
            this.f14309a.b(new C(i10));
            return this;
        }

        public f g(C4930o oVar) {
            H2.i.h(oVar, "The specified quality selector can't be null.");
            this.f14309a.b(new D(oVar));
            return this;
        }
    }

    static abstract class g implements AutoCloseable {
    }

    private class h {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final G0 f14314a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final h1 f14315b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final int f14316c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public boolean f14317d = false;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f14318e = 0;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public ScheduledFuture<?> f14319f = null;

        class a implements I.c<C4965i> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g0 f14321a;

            a(g0 g0Var) {
                this.f14321a = g0Var;
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void d() {
                if (!h.this.f14317d) {
                    C4391e0.a("Recorder", "Retry setupVideo #" + h.this.f14318e);
                    h hVar = h.this;
                    hVar.l(hVar.f14314a, h.this.f14315b);
                }
            }

            public void b(Throwable th2) {
                C4391e0.m("Recorder", "VideoEncoder Setup error: " + th2, th2);
                if (h.this.f14318e < h.this.f14316c) {
                    h.e(h.this);
                    ScheduledFuture unused = h.this.f14319f = B.f0(new F(this), B.this.f14279e, B.f14244o0, TimeUnit.MILLISECONDS);
                    return;
                }
                B.this.U(th2);
            }

            /* renamed from: e */
            public void a(C4965i iVar) {
                C4391e0.a("Recorder", "VideoEncoder is created. " + iVar);
                if (iVar != null) {
                    boolean z10 = false;
                    H2.i.i(B.this.f14272a0 == this.f14321a);
                    if (B.this.f14246B == null) {
                        z10 = true;
                    }
                    H2.i.i(z10);
                    B.this.Z(this.f14321a);
                    B.this.T();
                }
            }
        }

        h(G0 g02, h1 h1Var, int i10) {
            this.f14314a = g02;
            this.f14315b = h1Var;
            this.f14316c = i10;
        }

        static /* synthetic */ int e(h hVar) {
            int i10 = hVar.f14318e;
            hVar.f14318e = i10 + 1;
            return i10;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void k(G0 g02, h1 h1Var) {
            if (g02.t() || (B.this.f14272a0.n(g02) && !B.this.G())) {
                C4391e0.l("Recorder", "Ignore the SurfaceRequest " + g02 + " isServiced: " + g02.t() + " VideoEncoderSession: " + B.this.f14272a0 + " has been configured with a persistent in-progress recording.");
                return;
            }
            C4968l s10 = B.this.f14281f;
            B b10 = B.this;
            g0 g0Var = new g0(s10, b10.f14279e, b10.f14277d);
            B b11 = B.this;
            C10101e<C4965i> i10 = g0Var.i(g02, h1Var, (C4926k) b11.B(b11.f14245A), B.this.f14293r);
            B.this.f14272a0 = g0Var;
            n.j(i10, new a(g0Var), B.this.f14279e);
        }

        /* access modifiers changed from: private */
        public void l(G0 g02, h1 h1Var) {
            B.this.e0().a(new E(this, g02, h1Var), B.this.f14279e);
        }

        /* access modifiers changed from: package-private */
        public void j() {
            if (!this.f14317d) {
                this.f14317d = true;
                ScheduledFuture<?> scheduledFuture = this.f14319f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.f14319f = null;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void m() {
            l(this.f14314a, this.f14315b);
        }
    }

    enum i {
        CONFIGURING,
        PENDING_RECORDING,
        PENDING_PAUSED,
        IDLING,
        RECORDING,
        PAUSED,
        STOPPING,
        RESETTING,
        ERROR
    }

    static {
        C4927l lVar = C4927l.f14461c;
        C4930o c10 = C4930o.c(Arrays.asList(new C4927l[]{lVar, C4927l.f14460b, C4927l.f14459a}), C4925j.a(lVar));
        f14237h0 = c10;
        i0 a10 = i0.a().e(c10).b(-1).a();
        f14238i0 = a10;
        f14239j0 = C4926k.a().e(-1).f(a10).a();
    }

    B(Executor executor, C4926k kVar, int i10, C4968l lVar, C4968l lVar2) {
        this.f14284i = androidx.camera.video.internal.compat.quirk.a.b(EncoderNotUsePersistentInputSurfaceQuirk.class) != null;
        this.f14286k = i.CONFIGURING;
        this.f14287l = null;
        this.f14288m = 0;
        this.f14289n = 0;
        this.f14290o = false;
        this.f14291p = null;
        this.f14292q = null;
        this.f14293r = null;
        this.f14294s = new ArrayList();
        this.f14295t = null;
        this.f14296u = null;
        this.f14299x = null;
        this.f14300y = null;
        this.f14301z = null;
        this.f14246B = null;
        this.f14247C = null;
        this.f14248D = null;
        this.f14249E = null;
        this.f14250F = e.INITIALIZING;
        this.f14251G = Uri.EMPTY;
        this.f14252H = 0;
        this.f14253I = 0;
        this.f14254J = Long.MAX_VALUE;
        this.f14255K = 0;
        this.f14256L = null;
        this.f14257M = Long.MAX_VALUE;
        this.f14258N = Long.MAX_VALUE;
        this.f14259O = Long.MAX_VALUE;
        this.f14260P = 0;
        this.f14261Q = 0;
        this.f14262R = 1;
        this.f14263S = null;
        this.f14264T = null;
        this.f14265U = new N.a(60);
        this.f14266V = null;
        this.f14267W = false;
        this.f14268X = h0.a.INACTIVE;
        this.f14269Y = null;
        this.f14270Z = false;
        this.f14274b0 = null;
        this.f14276c0 = 0.0d;
        this.f14278d0 = false;
        this.f14280e0 = null;
        this.f14275c = executor;
        executor = executor == null ? H.a.c() : executor;
        this.f14277d = executor;
        Executor f10 = H.a.f(executor);
        this.f14279e = f10;
        this.f14245A = F0.h(x(kVar));
        this.f14285j = i10;
        this.f14271a = F0.h(H.d(this.f14288m, E(this.f14286k)));
        this.f14273b = F0.h(Boolean.FALSE);
        this.f14281f = lVar;
        this.f14282g = lVar2;
        this.f14272a0 = new g0(lVar, f10, executor);
    }

    private List<C4962f> A(long j10) {
        ArrayList arrayList = new ArrayList();
        while (!this.f14265U.isEmpty()) {
            C4962f a10 = this.f14265U.a();
            if (a10.d1() >= j10) {
                arrayList.add(a10);
            }
        }
        return arrayList;
    }

    public static I C(C4408p pVar) {
        return D(pVar, 0);
    }

    public static I D(C4408p pVar, int i10) {
        return new G(i10, (I) pVar, m0.f15116d);
    }

    private H.a E(i iVar) {
        return (iVar == i.RECORDING || (iVar == i.STOPPING && ((DeactivateEncoderSurfaceBeforeStopEncoderQuirk) androidx.camera.video.internal.compat.quirk.a.b(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class)) == null)) ? H.a.ACTIVE : H.a.INACTIVE;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void I(G0.h hVar) {
        this.f14292q = hVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void M(Uri uri) {
        this.f14251G = uri;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void N(C4965i iVar) {
        C4391e0.a("Recorder", "The source didn't become non-streaming before timeout. Waited 1000ms");
        if (androidx.camera.video.internal.compat.quirk.a.b(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class) != null) {
            S(iVar);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object O(g gVar, c.a aVar) {
        this.f14246B.e(new b(aVar, gVar), this.f14279e);
        return "videoEncodingFuture";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void P(c.a aVar, Throwable th2) {
        if (this.f14266V == null) {
            if (th2 instanceof C4961e) {
                g0(e.ERROR_ENCODER);
            } else {
                g0(e.ERROR_SOURCE);
            }
            this.f14266V = th2;
            p0();
            aVar.c(null);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object Q(g gVar, c.a aVar) {
        new c(new C4932q(this, aVar));
        throw null;
    }

    private g R(i iVar) {
        if (iVar == i.PENDING_PAUSED || iVar == i.PENDING_RECORDING) {
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
    }

    static void S(C4965i iVar) {
        if (iVar instanceof C4954E) {
            ((C4954E) iVar).n0();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        i0(V.B.i.CONFIGURING);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        r1 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void W() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f14283h
            monitor-enter(r0)
            V.B$i r1 = r3.f14286k     // Catch:{ all -> 0x0016 }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x0016 }
            r2 = 0
            switch(r1) {
                case 1: goto L_0x001e;
                case 2: goto L_0x001e;
                case 3: goto L_0x0018;
                case 4: goto L_0x000e;
                case 5: goto L_0x000e;
                case 6: goto L_0x0018;
                case 7: goto L_0x0018;
                case 8: goto L_0x000e;
                default: goto L_0x000d;
            }     // Catch:{ all -> 0x0016 }
        L_0x000d:
            goto L_0x0023
        L_0x000e:
            boolean r1 = r3.G()     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x0018
            r1 = r2
            goto L_0x0024
        L_0x0016:
            r1 = move-exception
            goto L_0x003b
        L_0x0018:
            V.B$i r1 = V.B.i.CONFIGURING     // Catch:{ all -> 0x0016 }
            r3.i0(r1)     // Catch:{ all -> 0x0016 }
            goto L_0x0023
        L_0x001e:
            V.B$i r1 = V.B.i.CONFIGURING     // Catch:{ all -> 0x0016 }
            r3.q0(r1)     // Catch:{ all -> 0x0016 }
        L_0x0023:
            r1 = 1
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            r3.f14270Z = r2
            if (r1 == 0) goto L_0x003a
            C.G0 r0 = r3.f14297v
            if (r0 == 0) goto L_0x003a
            boolean r0 = r0.t()
            if (r0 != 0) goto L_0x003a
            C.G0 r0 = r3.f14297v
            androidx.camera.core.impl.h1 r1 = r3.f14298w
            r3.y(r0, r1, r2)
        L_0x003a:
            return
        L_0x003b:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: V.B.W():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void K(G0 g02, h1 h1Var) {
        G0 g03 = this.f14297v;
        if (g03 != null && !g03.t()) {
            this.f14297v.G();
        }
        this.f14297v = g02;
        this.f14298w = h1Var;
        y(g02, h1Var, true);
    }

    private void b0() {
        if (this.f14248D != null) {
            C4391e0.a("Recorder", "Releasing audio encoder.");
            this.f14248D.release();
            this.f14248D = null;
            this.f14249E = null;
        }
        g0(e.INITIALIZING);
        c0();
    }

    private void c0() {
        if (this.f14246B != null) {
            C4391e0.a("Recorder", "Releasing video encoder.");
            n0();
        }
        W();
    }

    private void d0() {
        if (f14235f0.contains(this.f14286k)) {
            i0(this.f14287l);
            return;
        }
        throw new AssertionError("Cannot restore non-pending state when in state " + this.f14286k);
    }

    /* access modifiers changed from: private */
    public C10101e<Void> e0() {
        C4391e0.a("Recorder", "Try to safely release video encoder: " + this.f14246B);
        return this.f14272a0.w();
    }

    /* access modifiers changed from: private */
    public static ScheduledFuture<?> f0(Runnable runnable, Executor executor, long j10, TimeUnit timeUnit) {
        return H.a.d().schedule(new C4937w(executor, runnable), j10, timeUnit);
    }

    private void j0(int i10) {
        if (this.f14288m != i10) {
            C4391e0.a("Recorder", "Transitioning streamId: " + this.f14288m + " --> " + i10);
            this.f14288m = i10;
            this.f14271a.g(H.e(i10, E(this.f14286k), this.f14291p));
        }
    }

    private static int m0(X.g gVar, int i10) {
        if (gVar != null) {
            int e10 = gVar.e();
            if (e10 == 1) {
                return 2;
            }
            if (e10 == 2) {
                return 0;
            }
            if (e10 != 9) {
                return i10;
            }
            return 1;
        }
        return i10;
    }

    private void n0() {
        g0 g0Var = this.f14274b0;
        if (g0Var != null) {
            H2.i.i(g0Var.m() == this.f14246B);
            C4391e0.a("Recorder", "Releasing video encoder: " + this.f14246B);
            this.f14274b0.x();
            this.f14274b0 = null;
            this.f14246B = null;
            this.f14247C = null;
            h0((Surface) null);
            return;
        }
        e0();
    }

    private void o0(g gVar, boolean z10) {
        if (!this.f14294s.isEmpty()) {
            C10101e<List<V>> k10 = n.k(this.f14294s);
            if (!k10.isDone()) {
                k10.cancel(true);
            }
            this.f14294s.clear();
        }
        this.f14294s.add(androidx.concurrent.futures.c.a(new C4940z(this, gVar)));
        if (F() && !z10) {
            this.f14294s.add(androidx.concurrent.futures.c.a(new A(this, gVar)));
        }
        n.j(n.k(this.f14294s), new d(), H.a.a());
    }

    private void q0(i iVar) {
        if (!f14235f0.contains(this.f14286k)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.f14286k);
        } else if (!f14236g0.contains(iVar)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + iVar);
        } else if (this.f14287l != iVar) {
            this.f14287l = iVar;
            this.f14271a.g(H.e(this.f14288m, E(iVar), this.f14291p));
        }
    }

    private void w() {
        while (!this.f14265U.isEmpty()) {
            this.f14265U.a();
        }
    }

    private C4926k x(C4926k kVar) {
        C4926k.a g10 = kVar.g();
        if (kVar.d().b() == -1) {
            g10.b(new C4931p());
        }
        return g10.a();
    }

    private void y(G0 g02, h1 h1Var, boolean z10) {
        if (g02.t()) {
            C4391e0.l("Recorder", "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        g02.E(this.f14279e, new C4935u(this));
        Size p10 = g02.p();
        C4417z n10 = g02.n();
        I C10 = C(g02.l().b());
        C4927l d10 = C10.d(p10, n10);
        C4391e0.a("Recorder", "Using supported quality of " + d10 + " for surface size " + p10);
        if (d10 != C4927l.f14465g) {
            X.g a10 = C10.a(d10, n10);
            this.f14293r = a10;
            if (a10 == null) {
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
            }
        }
        h hVar = this.f14280e0;
        if (hVar != null) {
            hVar.j();
        }
        h hVar2 = new h(g02, h1Var, z10 ? f14243n0 : 0);
        this.f14280e0 = hVar2;
        hVar2.m();
    }

    /* access modifiers changed from: package-private */
    public <T> T B(b1<T> b1Var) {
        try {
            return b1Var.a().get();
        } catch (InterruptedException | ExecutionException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean F() {
        return this.f14250F == e.ENABLED;
    }

    /* access modifiers changed from: package-private */
    public boolean G() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        H2.i.j(G(), "Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording");
        r1 = r3;
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r6.f14268X != V.h0.a.INACTIVE) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        d0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
        R(r6.f14286k);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0065, code lost:
        r1 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void T() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f14283h
            monitor-enter(r0)
            V.B$i r1 = r6.f14286k     // Catch:{ all -> 0x0017 }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x0017 }
            r2 = 1
            r3 = 0
            switch(r1) {
                case 0: goto L_0x0060;
                case 1: goto L_0x004f;
                case 2: goto L_0x004d;
                case 3: goto L_0x0034;
                case 4: goto L_0x0028;
                case 5: goto L_0x0027;
                case 6: goto L_0x001a;
                case 7: goto L_0x0034;
                case 8: goto L_0x000f;
                default: goto L_0x000e;
            }     // Catch:{ all -> 0x0017 }
        L_0x000e:
            goto L_0x0065
        L_0x000f:
            java.lang.String r1 = "Recorder"
            java.lang.String r4 = "onConfigured() was invoked when the Recorder had encountered error"
            C.C4391e0.c(r1, r4)     // Catch:{ all -> 0x0017 }
            goto L_0x0065
        L_0x0017:
            r1 = move-exception
            goto L_0x0080
        L_0x001a:
            boolean r1 = r6.f14284i     // Catch:{ all -> 0x0017 }
            if (r1 == 0) goto L_0x001f
            goto L_0x0065
        L_0x001f:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ all -> 0x0017 }
            java.lang.String r2 = "Unexpectedly invoke onConfigured() in a STOPPING state when it's not waiting for a new surface."
            r1.<init>(r2)     // Catch:{ all -> 0x0017 }
            throw r1     // Catch:{ all -> 0x0017 }
        L_0x0027:
            r3 = r2
        L_0x0028:
            boolean r1 = r6.G()     // Catch:{ all -> 0x0017 }
            java.lang.String r4 = "Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording"
            H2.i.j(r1, r4)     // Catch:{ all -> 0x0017 }
            r1 = r3
            r3 = r2
            goto L_0x0066
        L_0x0034:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ all -> 0x0017 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0017 }
            r2.<init>()     // Catch:{ all -> 0x0017 }
            java.lang.String r3 = "Incorrectly invoke onConfigured() in state "
            r2.append(r3)     // Catch:{ all -> 0x0017 }
            V.B$i r3 = r6.f14286k     // Catch:{ all -> 0x0017 }
            r2.append(r3)     // Catch:{ all -> 0x0017 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0017 }
            r1.<init>(r2)     // Catch:{ all -> 0x0017 }
            throw r1     // Catch:{ all -> 0x0017 }
        L_0x004d:
            r1 = r2
            goto L_0x0050
        L_0x004f:
            r1 = r3
        L_0x0050:
            V.h0$a r4 = r6.f14268X     // Catch:{ all -> 0x0017 }
            V.h0$a r5 = V.h0.a.INACTIVE     // Catch:{ all -> 0x0017 }
            if (r4 != r5) goto L_0x005a
            r6.d0()     // Catch:{ all -> 0x0017 }
            goto L_0x0066
        L_0x005a:
            V.B$i r4 = r6.f14286k     // Catch:{ all -> 0x0017 }
            r6.R(r4)     // Catch:{ all -> 0x0017 }
            goto L_0x0066
        L_0x0060:
            V.B$i r1 = V.B.i.IDLING     // Catch:{ all -> 0x0017 }
            r6.i0(r1)     // Catch:{ all -> 0x0017 }
        L_0x0065:
            r1 = r3
        L_0x0066:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            if (r3 == 0) goto L_0x007f
            r0 = 0
            r6.o0(r0, r2)
            a0.i r2 = r6.f14246B
            r2.start()
            boolean r2 = r6.f14278d0
            if (r2 != 0) goto L_0x007e
            if (r1 == 0) goto L_0x007f
            a0.i r0 = r6.f14246B
            r0.c()
            goto L_0x007f
        L_0x007e:
            throw r0
        L_0x007f:
            return
        L_0x0080:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: V.B.T():void");
    }

    /* access modifiers changed from: package-private */
    public void U(Throwable th2) {
        synchronized (this.f14283h) {
            try {
                switch (this.f14286k.ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                        j0(-1);
                        i0(i.ERROR);
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        throw new AssertionError("Encountered encoder setup error while in unexpected state " + this.f14286k + ": " + th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void V(g gVar, int i10, Throwable th2) {
        boolean z10;
        synchronized (this.f14283h) {
            try {
                z10 = false;
                switch (this.f14286k.ordinal()) {
                    case 0:
                    case 3:
                    case 8:
                        throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.f14286k);
                    case 1:
                    case 2:
                    case 6:
                    case 7:
                        break;
                    case 4:
                    case 5:
                        i0(i.STOPPING);
                        z10 = true;
                        break;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z10) {
            l0(gVar, -1, i10, th2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void J(h0.a aVar) {
        ScheduledFuture<?> scheduledFuture;
        C4965i iVar;
        h0.a aVar2 = this.f14268X;
        this.f14268X = aVar;
        if (aVar2 != aVar) {
            C4391e0.a("Recorder", "Video source has transitioned to state: " + aVar);
            if (aVar == h0.a.INACTIVE) {
                if (this.f14300y == null) {
                    h hVar = this.f14280e0;
                    if (hVar != null) {
                        hVar.j();
                        this.f14280e0 = null;
                    }
                    a0(4, (Throwable) null, false);
                    return;
                }
                this.f14270Z = true;
            } else if (aVar == h0.a.ACTIVE_NON_STREAMING && (scheduledFuture = this.f14269Y) != null && scheduledFuture.cancel(false) && (iVar = this.f14246B) != null) {
                S(iVar);
            }
        } else {
            C4391e0.a("Recorder", "Video source transitions to the same state: " + aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void Z(g0 g0Var) {
        C4965i m10 = g0Var.m();
        this.f14246B = m10;
        this.f14256L = ((k0) m10.d()).g();
        this.f14255K = this.f14246B.h();
        Surface k10 = g0Var.k();
        this.f14300y = k10;
        h0(k10);
        g0Var.v(this.f14279e, new C4939y(this));
        n.j(g0Var.l(), new a(g0Var), this.f14279e);
    }

    public void a(G0 g02) {
        e(g02, h1.UPTIME);
    }

    /* access modifiers changed from: package-private */
    public void a0(int i10, Throwable th2, boolean z10) {
        boolean z11;
        boolean z12;
        synchronized (this.f14283h) {
            try {
                z11 = true;
                z12 = false;
                switch (this.f14286k.ordinal()) {
                    case 0:
                    case 3:
                    case 8:
                        break;
                    case 1:
                    case 2:
                        q0(i.RESETTING);
                        break;
                    case 4:
                    case 5:
                        H2.i.j(false, "In-progress recording shouldn't be null when in state " + this.f14286k);
                        if (!G()) {
                            i0(i.RESETTING);
                            z12 = true;
                            z11 = false;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        i0(i.RESETTING);
                        break;
                }
                z11 = false;
            } catch (Throwable th3) {
                while (true) {
                    throw th3;
                }
            }
        }
        if (z11) {
            if (z10) {
                c0();
            } else {
                b0();
            }
        } else if (z12) {
            l0((g) null, -1, i10, th2);
        }
    }

    public void b(h0.a aVar) {
        this.f14279e.execute(new C4933s(this, aVar));
    }

    public H0<C4926k> c() {
        return this.f14245A;
    }

    public H0<H> d() {
        return this.f14271a;
    }

    public void e(G0 g02, h1 h1Var) {
        synchronized (this.f14283h) {
            try {
                C4391e0.a("Recorder", "Surface is requested in state: " + this.f14286k + ", Current surface: " + this.f14288m);
                if (this.f14286k == i.ERROR) {
                    i0(i.CONFIGURING);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        this.f14279e.execute(new C4938x(this, g02, h1Var));
    }

    public H0<Boolean> f() {
        return this.f14273b;
    }

    public I g(C4408p pVar) {
        return D(pVar, this.f14285j);
    }

    /* access modifiers changed from: package-private */
    public void g0(e eVar) {
        C4391e0.a("Recorder", "Transitioning audio state: " + this.f14250F + " --> " + eVar);
        this.f14250F = eVar;
    }

    /* access modifiers changed from: package-private */
    public void h0(Surface surface) {
        int i10;
        if (this.f14299x != surface) {
            this.f14299x = surface;
            synchronized (this.f14283h) {
                if (surface != null) {
                    try {
                        i10 = surface.hashCode();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else {
                    i10 = 0;
                }
                j0(i10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void i0(i iVar) {
        if (this.f14286k != iVar) {
            C4391e0.a("Recorder", "Transitioning Recorder internal state: " + this.f14286k + " --> " + iVar);
            Set<i> set = f14235f0;
            H.a aVar = null;
            if (set.contains(iVar)) {
                if (!set.contains(this.f14286k)) {
                    if (f14236g0.contains(this.f14286k)) {
                        i iVar2 = this.f14286k;
                        this.f14287l = iVar2;
                        aVar = E(iVar2);
                    } else {
                        throw new AssertionError("Invalid state transition. Should not be transitioning to a PENDING state from state " + this.f14286k);
                    }
                }
            } else if (this.f14287l != null) {
                this.f14287l = null;
            }
            this.f14286k = iVar;
            if (aVar == null) {
                aVar = E(iVar);
            }
            this.f14271a.g(H.e(this.f14288m, aVar, this.f14291p));
            return;
        }
        throw new AssertionError("Attempted to transition to state " + iVar + ", but Recorder is already in state " + iVar);
    }

    /* access modifiers changed from: package-private */
    public void k0(g gVar) {
        if (this.f14301z != null) {
            throw new AssertionError("Unable to set up media muxer when one already exists.");
        } else if (!F() || !this.f14265U.isEmpty()) {
            C4962f fVar = this.f14264T;
            if (fVar != null) {
                try {
                    this.f14264T = null;
                    List<C4962f> A10 = A(fVar.d1());
                    long size = fVar.size();
                    for (C4962f size2 : A10) {
                        size += size2.size();
                    }
                    long j10 = this.f14260P;
                    if (j10 == 0 || size <= j10) {
                        try {
                            C4926k kVar = (C4926k) B(this.f14245A);
                            if (kVar.c() == -1) {
                                m0(this.f14293r, C4926k.e(f14239j0.c()));
                            } else {
                                C4926k.e(kVar.c());
                            }
                            new r(this);
                            throw null;
                        } catch (IOException e10) {
                            V(gVar, 5, e10);
                            fVar.close();
                            return;
                        }
                    } else {
                        C4391e0.a("Recorder", String.format("Initial data exceeds file size limit %d > %d", new Object[]{Long.valueOf(size), Long.valueOf(this.f14260P)}));
                        V(gVar, 2, (Throwable) null);
                        fVar.close();
                        return;
                    }
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            } else {
                throw new AssertionError("Media muxer cannot be started without an encoded video frame.");
            }
        } else {
            throw new AssertionError("Audio is enabled but no audio sample is ready. Cannot start media muxer.");
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public void l0(g gVar, long j10, int i10, Throwable th2) {
        if (!this.f14290o) {
            this.f14290o = true;
            this.f14262R = i10;
            this.f14263S = th2;
            if (F()) {
                w();
                this.f14248D.b(j10);
            }
            C4962f fVar = this.f14264T;
            if (fVar != null) {
                fVar.close();
                this.f14264T = null;
            }
            if (this.f14268X != h0.a.ACTIVE_NON_STREAMING) {
                this.f14269Y = f0(new C4936v(this.f14246B), this.f14279e, 1000, TimeUnit.MILLISECONDS);
            } else {
                S(this.f14246B);
            }
            this.f14246B.b(j10);
        }
    }

    /* access modifiers changed from: package-private */
    public void p0() {
    }

    /* access modifiers changed from: package-private */
    public void r0(C4962f fVar, g gVar) {
        g gVar2 = gVar;
        if (this.f14296u != null) {
            long size = this.f14252H + fVar.size();
            long j10 = this.f14260P;
            long j11 = 0;
            if (j10 == 0 || size <= j10) {
                long d12 = fVar.d1();
                long j12 = this.f14254J;
                if (j12 == Long.MAX_VALUE) {
                    this.f14254J = d12;
                    C4391e0.a("Recorder", String.format("First video time: %d (%s)", new Object[]{Long.valueOf(d12), X.d.c(this.f14254J)}));
                } else {
                    TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                    String str = "Recorder";
                    long nanos = timeUnit.toNanos(d12 - Math.min(j12, this.f14257M));
                    H2.i.j(this.f14258N != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
                    long nanos2 = timeUnit.toNanos(d12 - this.f14258N) + nanos;
                    long j13 = this.f14261Q;
                    if (j13 == 0 || nanos2 <= j13) {
                        j11 = nanos;
                    } else {
                        C4391e0.a(str, String.format("Video data reaches duration limit %d > %d", new Object[]{Long.valueOf(nanos2), Long.valueOf(this.f14261Q)}));
                        V(gVar2, 9, (Throwable) null);
                        return;
                    }
                }
                this.f14301z.writeSampleData(this.f14296u.intValue(), fVar.U0(), fVar.q0());
                this.f14252H = size;
                this.f14253I = j11;
                this.f14258N = d12;
                p0();
                return;
            }
            C4391e0.a("Recorder", String.format("Reach file size limit %d > %d", new Object[]{Long.valueOf(size), Long.valueOf(this.f14260P)}));
            V(gVar2, 2, (Throwable) null);
            return;
        }
        throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
    }

    /* access modifiers changed from: package-private */
    public void z(int i10, Throwable th2) {
        throw new AssertionError("Attempted to finalize in-progress recording, but no recording is in progress.");
    }
}
