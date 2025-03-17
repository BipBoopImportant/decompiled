package G1;

import G1.G;
import G1.m0;
import XH.C16807N;
import XH.t;
import c2.C5267b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001:\u00016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0005J\u001f\u0010\u0016\u001a\u00020\f2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001a\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\f¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\f¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b'\u0010\u0005J$\u0010(\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)J$\u0010*\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b*\u0010)J\u0017\u0010+\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b+\u0010\u0005J\u0017\u0010,\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b,\u0010\u0005J\u000f\u0010-\u001a\u00020\bH\u0002¢\u0006\u0004\b-\u0010\u0019J+\u0010/\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\f2\b\b\u0002\u0010.\u001a\u00020\fH\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\bH\u0002¢\u0006\u0004\b1\u0010\u0019J\u001f\u00102\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\fH\u0002¢\u0006\u0004\b2\u0010\"J\u001f\u00103\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\fH\u0002¢\u0006\u0004\b3\u0010\"J\u001f\u00104\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\fH\u0002¢\u0006\u0004\b4\u0010\"J\u001b\u00105\u001a\u00020\f*\u00020\u00022\u0006\u0010 \u001a\u00020\fH\u0002¢\u0006\u0004\b5\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010:\u001a\u0002088\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u00109R\u0016\u0010<\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010;R\u0016\u0010>\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010;R\u0014\u0010A\u001a\u00020?8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010@R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001c0B8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010CR$\u0010J\u001a\u00020E2\u0006\u0010F\u001a\u00020E8F@BX\u000e¢\u0006\f\n\u0004\b1\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020K0B8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010CR\u001e\u0010N\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b!\u0010MR\u0016\u0010Q\u001a\u0004\u0018\u00010O8\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u0010PR\u0011\u0010T\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0011\u0010V\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bU\u0010SR\u0018\u0010Y\u001a\u00020\f*\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0018\u0010[\u001a\u00020\f*\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010XR\u0018\u0010]\u001a\u00020\f*\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010XR\u0018\u0010_\u001a\u00020\f*\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b^\u0010X\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006`"}, d2 = {"LG1/S;", "", "LG1/G;", "root", "<init>", "(LG1/G;)V", "Lc2/b;", "constraints", "LXH/N;", "I", "(J)V", "layoutNode", "", "forced", "D", "(LG1/G;Z)Z", "G", "C", "F", "E", "Lkotlin/Function0;", "onLayout", "r", "(LnI/a;)Z", "t", "()V", "s", "(LG1/G;J)V", "LG1/m0$b;", "listener", "x", "(LG1/m0$b;)V", "affectsLookahead", "i", "(LG1/G;Z)V", "forceDispatch", "c", "(Z)V", "node", "v", "e", "(LG1/G;Lc2/b;)Z", "f", "A", "h", "b", "relayoutNeeded", "y", "(LG1/G;ZZ)Z", "g", "B", "w", "j", "u", "a", "LG1/G;", "LG1/o;", "LG1/o;", "relayoutNodes", "Z", "duringMeasureLayout", "d", "duringFullMeasureLayoutPass", "LG1/k0;", "LG1/k0;", "onPositionedDispatcher", "LW0/b;", "LW0/b;", "onLayoutCompletedListeners", "", "<set-?>", "J", "q", "()J", "measureIteration", "LG1/S$a;", "postponedMeasureRequests", "Lc2/b;", "rootConstraints", "LG1/N;", "LG1/N;", "consistencyChecker", "m", "()Z", "hasPendingMeasureOrLayout", "n", "hasPendingOnPositionedCallbacks", "o", "(LG1/G;)Z", "measureAffectsParent", "k", "canAffectParent", "l", "canAffectParentInLookahead", "p", "measureAffectsParentLookahead", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class S {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final G f6389a;

    /* renamed from: b  reason: collision with root package name */
    private final C4512o f6390b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6391c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6392d;

    /* renamed from: e  reason: collision with root package name */
    private final k0 f6393e = new k0();

    /* renamed from: f  reason: collision with root package name */
    private final W0.b<m0.b> f6394f = new W0.b<>(new m0.b[16], 0);

    /* renamed from: g  reason: collision with root package name */
    private long f6395g = 1;

    /* renamed from: h  reason: collision with root package name */
    private final W0.b<a> f6396h;

    /* renamed from: i  reason: collision with root package name */
    private C5267b f6397i;

    /* renamed from: j  reason: collision with root package name */
    private final N f6398j;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000f¨\u0006\u0010"}, d2 = {"LG1/S$a;", "", "LG1/G;", "node", "", "isLookahead", "isForced", "<init>", "(LG1/G;ZZ)V", "a", "LG1/G;", "()LG1/G;", "b", "Z", "c", "()Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final G f6399a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f6400b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f6401c;

        public a(G g10, boolean z10, boolean z11) {
            this.f6399a = g10;
            this.f6400b = z10;
            this.f6401c = z11;
        }

        public final G a() {
            return this.f6399a;
        }

        public final boolean b() {
            return this.f6401c;
        }

        public final boolean c() {
            return this.f6400b;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6402a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                G1.G$e[] r0 = G1.G.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                G1.G$e r1 = G1.G.e.LookaheadMeasuring     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                G1.G$e r1 = G1.G.e.Measuring     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                G1.G$e r1 = G1.G.e.LookaheadLayingOut     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                G1.G$e r1 = G1.G.e.LayingOut     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                G1.G$e r1 = G1.G.e.Idle     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f6402a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: G1.S.b.<clinit>():void");
        }
    }

    public S(G g10) {
        this.f6389a = g10;
        m0.a aVar = m0.f6550a0;
        C4512o oVar = new C4512o(aVar.a());
        this.f6390b = oVar;
        W0.b<a> bVar = new W0.b<>(new a[16], 0);
        this.f6396h = bVar;
        this.f6398j = aVar.a() ? new N(g10, oVar, bVar.j()) : null;
    }

    private final void A(G g10) {
        W0.b<G> x02 = g10.x0();
        int r10 = x02.r();
        if (r10 > 0) {
            Object[] q10 = x02.q();
            int i10 = 0;
            do {
                G g11 = (G) q10[i10];
                if (o(g11)) {
                    if (M.a(g11)) {
                        B(g11, true);
                    } else {
                        A(g11);
                    }
                }
                i10++;
            } while (i10 < r10);
        }
    }

    private final void B(G g10, boolean z10) {
        C5267b bVar;
        if (!g10.L0()) {
            if (g10 == this.f6389a) {
                bVar = this.f6397i;
                C17542s.g(bVar);
            } else {
                bVar = null;
            }
            if (z10) {
                e(g10, bVar);
            } else {
                f(g10, bVar);
            }
        }
    }

    public static /* synthetic */ boolean H(S s10, G g10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return s10.G(g10, z10);
    }

    private final void b() {
        W0.b<m0.b> bVar = this.f6394f;
        int r10 = bVar.r();
        if (r10 > 0) {
            Object[] q10 = bVar.q();
            int i10 = 0;
            do {
                ((m0.b) q10[i10]).i();
                i10++;
            } while (i10 < r10);
        }
        this.f6394f.k();
    }

    public static /* synthetic */ void d(S s10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        s10.c(z10);
    }

    private final boolean e(G g10, C5267b bVar) {
        if (g10.d0() == null) {
            return false;
        }
        boolean P02 = bVar != null ? g10.P0(bVar) : G.Q0(g10, (C5267b) null, 1, (Object) null);
        G q02 = g10.q0();
        if (P02 && q02 != null) {
            if (q02.d0() == null) {
                G.x1(q02, false, false, false, 3, (Object) null);
            } else if (g10.j0() == G.g.InMeasureBlock) {
                G.t1(q02, false, false, false, 3, (Object) null);
            } else if (g10.j0() == G.g.InLayoutBlock) {
                G.r1(q02, false, 1, (Object) null);
            }
        }
        return P02;
    }

    private final boolean f(G g10, C5267b bVar) {
        boolean l12 = bVar != null ? g10.l1(bVar) : G.m1(g10, (C5267b) null, 1, (Object) null);
        G q02 = g10.q0();
        if (l12 && q02 != null) {
            if (g10.i0() == G.g.InMeasureBlock) {
                G.x1(q02, false, false, false, 3, (Object) null);
            } else if (g10.i0() == G.g.InLayoutBlock) {
                G.v1(q02, false, 1, (Object) null);
            }
        }
        return l12;
    }

    private final void g() {
        if (this.f6396h.v()) {
            W0.b<a> bVar = this.f6396h;
            int r10 = bVar.r();
            if (r10 > 0) {
                Object[] q10 = bVar.q();
                int i10 = 0;
                do {
                    a aVar = (a) q10[i10];
                    if (aVar.a().c()) {
                        if (!aVar.c()) {
                            G.x1(aVar.a(), aVar.b(), false, false, 2, (Object) null);
                        } else {
                            G.t1(aVar.a(), aVar.b(), false, false, 2, (Object) null);
                        }
                    }
                    i10++;
                } while (i10 < r10);
            }
            this.f6396h.k();
        }
    }

    private final void h(G g10) {
        W0.b<G> x02 = g10.x0();
        int r10 = x02.r();
        if (r10 > 0) {
            Object[] q10 = x02.q();
            int i10 = 0;
            do {
                G g11 = (G) q10[i10];
                if (C17542s.e(g11.N0(), Boolean.TRUE) && !g11.L0()) {
                    if (this.f6390b.e(g11, true)) {
                        g11.R0();
                    }
                    h(g11);
                }
                i10++;
            } while (i10 < r10);
        }
    }

    private final void j(G g10, boolean z10) {
        W0.b<G> x02 = g10.x0();
        int r10 = x02.r();
        if (r10 > 0) {
            Object[] q10 = x02.q();
            int i10 = 0;
            do {
                G g11 = (G) q10[i10];
                if ((!z10 && o(g11)) || (z10 && p(g11))) {
                    if (M.a(g11) && !z10) {
                        if (!g11.b0() || !this.f6390b.e(g11, true)) {
                            i(g11, true);
                        } else {
                            y(g11, true, false);
                        }
                    }
                    w(g11, z10);
                    if (!u(g11, z10)) {
                        j(g11, z10);
                    }
                }
                i10++;
            } while (i10 < r10);
        }
        w(g10, z10);
    }

    private final boolean k(G g10) {
        return g10.g0() && o(g10);
    }

    private final boolean l(G g10) {
        return g10.b0() && p(g10);
    }

    private final boolean o(G g10) {
        return g10.i0() == G.g.InMeasureBlock || g10.X().r().w().k();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r4 = r4.w();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean p(G1.G r4) {
        /*
            r3 = this;
            G1.G$g r0 = r4.j0()
            G1.G$g r1 = G1.G.g.InMeasureBlock
            r2 = 1
            if (r0 == r1) goto L_0x0021
            G1.L r4 = r4.X()
            G1.b r4 = r4.C()
            if (r4 == 0) goto L_0x0020
            G1.a r4 = r4.w()
            if (r4 == 0) goto L_0x0020
            boolean r4 = r4.k()
            if (r4 != r2) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: G1.S.p(G1.G):boolean");
    }

    private final boolean u(G g10, boolean z10) {
        return z10 ? g10.b0() : g10.g0();
    }

    private final void w(G g10, boolean z10) {
        if (u(g10, z10) && this.f6390b.e(g10, z10)) {
            y(g10, z10, false);
        }
    }

    private final boolean y(G g10, boolean z10, boolean z11) {
        C5267b bVar;
        G q02;
        boolean z12 = false;
        if (g10.L0()) {
            return false;
        }
        if (g10.p() || g10.M0() || k(g10) || C17542s.e(g10.N0(), Boolean.TRUE) || l(g10) || g10.F()) {
            if (g10 == this.f6389a) {
                bVar = this.f6397i;
                C17542s.g(bVar);
            } else {
                bVar = null;
            }
            if (z10) {
                if (g10.b0()) {
                    z12 = e(g10, bVar);
                }
                if (z11 && ((z12 || g10.a0()) && C17542s.e(g10.N0(), Boolean.TRUE))) {
                    g10.R0();
                }
            } else {
                boolean f10 = g10.g0() ? f(g10, bVar) : false;
                if (z11 && g10.Y() && (g10 == this.f6389a || ((q02 = g10.q0()) != null && q02.p() && g10.M0()))) {
                    if (g10 == this.f6389a) {
                        g10.j1(0, 0);
                    } else {
                        g10.p1();
                    }
                    this.f6393e.d(g10);
                    N n10 = this.f6398j;
                    if (n10 != null) {
                        n10.a();
                    }
                }
                z12 = f10;
            }
            g();
        }
        return z12;
    }

    static /* synthetic */ boolean z(S s10, G g10, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        return s10.y(g10, z10, z11);
    }

    public final boolean C(G g10, boolean z10) {
        int i10 = b.f6402a[g10.Z().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (!(i10 == 4 || i10 == 5)) {
                        throw new t();
                    }
                }
            }
            if ((g10.b0() || g10.a0()) && !z10) {
                N n10 = this.f6398j;
                if (n10 == null) {
                    return false;
                }
                n10.a();
                return false;
            }
            g10.T0();
            g10.S0();
            if (g10.L0()) {
                return false;
            }
            G q02 = g10.q0();
            if (C17542s.e(g10.N0(), Boolean.TRUE) && ((q02 == null || !q02.b0()) && (q02 == null || !q02.a0()))) {
                this.f6390b.c(g10, true);
            } else if (g10.p() && ((q02 == null || !q02.Y()) && (q02 == null || !q02.g0()))) {
                this.f6390b.c(g10, false);
            }
            return !this.f6392d;
        }
        N n11 = this.f6398j;
        if (n11 == null) {
            return false;
        }
        n11.a();
        return false;
    }

    public final boolean D(G g10, boolean z10) {
        G q02;
        G q03;
        if (!(g10.d0() != null)) {
            D1.a.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i10 = b.f6402a[g10.Z().ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2 || i10 == 3 || i10 == 4) {
            this.f6396h.b(new a(g10, true, z10));
            N n10 = this.f6398j;
            if (n10 == null) {
                return false;
            }
            n10.a();
            return false;
        } else if (i10 != 5) {
            throw new t();
        } else if (g10.b0() && !z10) {
            return false;
        } else {
            g10.U0();
            g10.V0();
            if (g10.L0()) {
                return false;
            }
            if ((C17542s.e(g10.N0(), Boolean.TRUE) || l(g10)) && ((q03 = g10.q0()) == null || !q03.b0())) {
                this.f6390b.c(g10, true);
            } else if ((g10.p() || k(g10)) && ((q02 = g10.q0()) == null || !q02.g0())) {
                this.f6390b.c(g10, false);
            }
            return !this.f6392d;
        }
    }

    public final void E(G g10) {
        this.f6393e.d(g10);
    }

    public final boolean F(G g10, boolean z10) {
        int i10 = b.f6402a[g10.Z().ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            N n10 = this.f6398j;
            if (n10 != null) {
                n10.a();
            }
        } else if (i10 != 5) {
            throw new t();
        } else if (z10 || g10.p() != g10.M0() || (!g10.g0() && !g10.Y())) {
            g10.S0();
            if (!g10.L0() && g10.M0()) {
                G q02 = g10.q0();
                if ((q02 == null || !q02.Y()) && (q02 == null || !q02.g0())) {
                    this.f6390b.c(g10, false);
                }
                if (!this.f6392d) {
                    return true;
                }
            }
        } else {
            N n11 = this.f6398j;
            if (n11 != null) {
                n11.a();
            }
        }
        return false;
    }

    public final boolean G(G g10, boolean z10) {
        int i10 = b.f6402a[g10.Z().ordinal()];
        if (!(i10 == 1 || i10 == 2)) {
            if (i10 == 3 || i10 == 4) {
                this.f6396h.b(new a(g10, false, z10));
                N n10 = this.f6398j;
                if (n10 != null) {
                    n10.a();
                }
            } else if (i10 != 5) {
                throw new t();
            } else if (!g10.g0() || z10) {
                g10.V0();
                if (!g10.L0() && (g10.p() || k(g10))) {
                    G q02 = g10.q0();
                    if (q02 == null || !q02.g0()) {
                        this.f6390b.c(g10, false);
                    }
                    if (!this.f6392d) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void I(long j10) {
        C5267b bVar = this.f6397i;
        boolean z10 = false;
        if (!(bVar == null ? false : C5267b.f(bVar.r(), j10))) {
            if (this.f6391c) {
                D1.a.a("updateRootConstraints called while measuring");
            }
            this.f6397i = C5267b.a(j10);
            if (this.f6389a.d0() != null) {
                this.f6389a.U0();
            }
            this.f6389a.V0();
            C4512o oVar = this.f6390b;
            G g10 = this.f6389a;
            if (g10.d0() != null) {
                z10 = true;
            }
            oVar.c(g10, z10);
        }
    }

    public final void c(boolean z10) {
        if (z10) {
            this.f6393e.e(this.f6389a);
        }
        this.f6393e.a();
    }

    public final void i(G g10, boolean z10) {
        if (!this.f6390b.g(z10)) {
            if (!this.f6391c) {
                D1.a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
            }
            if (u(g10, z10)) {
                D1.a.a("node not yet measured");
            }
            j(g10, z10);
        }
    }

    public final boolean m() {
        return this.f6390b.h();
    }

    public final boolean n() {
        return this.f6393e.c();
    }

    public final long q() {
        if (!this.f6391c) {
            D1.a.a("measureIteration should be only used during the measure/layout pass");
        }
        return this.f6395g;
    }

    public final boolean r(C17631a<C16807N> aVar) {
        boolean z10;
        if (!this.f6389a.c()) {
            D1.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!this.f6389a.p()) {
            D1.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f6391c) {
            D1.a.a("performMeasureAndLayout called during measure layout");
        }
        boolean z11 = false;
        if (this.f6397i != null) {
            this.f6391c = true;
            this.f6392d = true;
            try {
                if (this.f6390b.h()) {
                    C4512o oVar = this.f6390b;
                    z10 = false;
                    while (oVar.h()) {
                        boolean d10 = oVar.f6558a.d();
                        boolean z12 = !d10;
                        G e10 = (!d10 ? oVar.f6558a : oVar.f6559b).e();
                        boolean z13 = z(this, e10, z12, false, 4, (Object) null);
                        if (e10 == this.f6389a && z13) {
                            z10 = true;
                        }
                    }
                    if (aVar != null) {
                        aVar.invoke();
                    }
                } else {
                    z10 = false;
                }
                this.f6391c = false;
                this.f6392d = false;
                N n10 = this.f6398j;
                if (n10 != null) {
                    n10.a();
                }
                z11 = z10;
            } catch (Throwable th2) {
                this.f6391c = false;
                this.f6392d = false;
                throw th2;
            }
        }
        b();
        return z11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(G1.G r4, long r5) {
        /*
            r3 = this;
            boolean r0 = r4.L0()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            G1.G r0 = r3.f6389a
            boolean r0 = kotlin.jvm.internal.C17542s.e(r4, r0)
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = "measureAndLayout called on root"
            D1.a.a(r0)
        L_0x0014:
            G1.G r0 = r3.f6389a
            boolean r0 = r0.c()
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = "performMeasureAndLayout called with unattached root"
            D1.a.a(r0)
        L_0x0021:
            G1.G r0 = r3.f6389a
            boolean r0 = r0.p()
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "performMeasureAndLayout called with unplaced root"
            D1.a.a(r0)
        L_0x002e:
            boolean r0 = r3.f6391c
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "performMeasureAndLayout called during measure layout"
            D1.a.a(r0)
        L_0x0037:
            c2.b r0 = r3.f6397i
            if (r0 == 0) goto L_0x009a
            r0 = 1
            r3.f6391c = r0
            r0 = 0
            r3.f6392d = r0
            G1.o r1 = r3.f6390b     // Catch:{ all -> 0x0057 }
            r1.i(r4)     // Catch:{ all -> 0x0057 }
            c2.b r1 = c2.C5267b.a(r5)     // Catch:{ all -> 0x0057 }
            boolean r1 = r3.e(r4, r1)     // Catch:{ all -> 0x0057 }
            if (r1 != 0) goto L_0x0059
            boolean r1 = r4.a0()     // Catch:{ all -> 0x0057 }
            if (r1 == 0) goto L_0x0068
            goto L_0x0059
        L_0x0057:
            r4 = move-exception
            goto L_0x0095
        L_0x0059:
            java.lang.Boolean r1 = r4.N0()     // Catch:{ all -> 0x0057 }
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0057 }
            boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r2)     // Catch:{ all -> 0x0057 }
            if (r1 == 0) goto L_0x0068
            r4.R0()     // Catch:{ all -> 0x0057 }
        L_0x0068:
            r3.h(r4)     // Catch:{ all -> 0x0057 }
            c2.b r5 = c2.C5267b.a(r5)     // Catch:{ all -> 0x0057 }
            r3.f(r4, r5)     // Catch:{ all -> 0x0057 }
            boolean r5 = r4.Y()     // Catch:{ all -> 0x0057 }
            if (r5 == 0) goto L_0x0086
            boolean r5 = r4.p()     // Catch:{ all -> 0x0057 }
            if (r5 == 0) goto L_0x0086
            r4.p1()     // Catch:{ all -> 0x0057 }
            G1.k0 r5 = r3.f6393e     // Catch:{ all -> 0x0057 }
            r5.d(r4)     // Catch:{ all -> 0x0057 }
        L_0x0086:
            r3.g()     // Catch:{ all -> 0x0057 }
            r3.f6391c = r0
            r3.f6392d = r0
            G1.N r4 = r3.f6398j
            if (r4 == 0) goto L_0x009a
            r4.a()
            goto L_0x009a
        L_0x0095:
            r3.f6391c = r0
            r3.f6392d = r0
            throw r4
        L_0x009a:
            r3.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G1.S.s(G1.G, long):void");
    }

    public final void t() {
        if (this.f6390b.h()) {
            if (!this.f6389a.c()) {
                D1.a.a("performMeasureAndLayout called with unattached root");
            }
            if (!this.f6389a.p()) {
                D1.a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f6391c) {
                D1.a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.f6397i != null) {
                this.f6391c = true;
                this.f6392d = false;
                try {
                    if (!this.f6390b.g(true)) {
                        if (this.f6389a.d0() != null) {
                            B(this.f6389a, true);
                        } else {
                            A(this.f6389a);
                        }
                    }
                    B(this.f6389a, false);
                    this.f6391c = false;
                    this.f6392d = false;
                    N n10 = this.f6398j;
                    if (n10 != null) {
                        n10.a();
                    }
                } catch (Throwable th2) {
                    this.f6391c = false;
                    this.f6392d = false;
                    throw th2;
                }
            }
        }
    }

    public final void v(G g10) {
        this.f6390b.i(g10);
        this.f6393e.f(g10);
    }

    public final void x(m0.b bVar) {
        this.f6394f.b(bVar);
    }
}
