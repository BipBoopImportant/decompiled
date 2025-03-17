package G1;

import E1.C4468a;
import E1.C4488v;
import E1.a0;
import E1.b0;
import E1.f0;
import E1.g0;
import XH.C16807N;
import c2.n;
import j0.J;
import j0.N;
import j0.O;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\b \u0018\u0000 n2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001oB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0016\u001a\u00020\n2\u001c\u0010\u0015\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00140\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\nH ¢\u0006\u0004\b\u001e\u0010\u0005J\u0013\u0010 \u001a\u00020\n*\u00020\u001fH\u0004¢\u0006\u0004\b \u0010!J]\u0010,\u001a\u00020+2\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u001a2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001a0$2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\n\u0018\u00010&2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\n0&H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u0010/\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010+H\u0000¢\u0006\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010?\u001a\u0002048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b<\u00106\u001a\u0004\b=\u00108\"\u0004\b>\u0010:R\"\u0010C\u001a\u0002048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b@\u00106\u001a\u0004\bA\u00108\"\u0004\bB\u0010:R\u0017\u0010H\u001a\u00020)8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001e\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010I8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001e\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010I8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bM\u0010KR:\u0010R\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00140\u0011\u0018\u00010O8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010V\u001a\u00020S8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0016\u0010Y\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0016\u0010[\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010XR\u0014\u0010]\u001a\u0002048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\\\u00108R\u0014\u0010`\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8&X¦\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0011\u0010g\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\be\u0010fR\u0014\u0010j\u001a\u00020+8 X \u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u001a\u0010m\u001a\u0002048VX\u0004¢\u0006\f\u0012\u0004\bl\u0010\u0005\u001a\u0004\bk\u00108\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006p"}, d2 = {"LG1/P;", "LE1/a0;", "LG1/T;", "LG1/W;", "<init>", "()V", "LE1/f0;", "ruler", "e1", "(LE1/f0;)LG1/P;", "LXH/N;", "E1", "(LE1/f0;)V", "LG1/r0;", "placeableResult", "c1", "(LG1/r0;)V", "Lj0/O;", "Ljava/lang/ref/WeakReference;", "LG1/G;", "Landroidx/compose/ui/node/WeakReference;", "layoutNodes", "T1", "(Lj0/O;)V", "LE1/a;", "alignmentLine", "", "n0", "(LE1/a;)I", "Z0", "U1", "LG1/c0;", "C1", "(LG1/c0;)V", "width", "height", "", "alignmentLines", "Lkotlin/Function1;", "LE1/g0;", "rulers", "LE1/a0$a;", "placementBlock", "LE1/J;", "F0", "(IILjava/util/Map;LnI/l;LnI/l;)LE1/J;", "result", "d1", "(LE1/J;)V", "f", "LE1/g0;", "_rulerScope", "", "g", "Z", "O1", "()Z", "o0", "(Z)V", "isPlacedUnderMotionFrameOfReference", "h", "S1", "Y1", "isShallowPlacing", "i", "R1", "X1", "isPlacingForAlignment", "j", "LE1/a0$a;", "u1", "()LE1/a0$a;", "placementScope", "Lj0/J;", "k", "Lj0/J;", "rulerValues", "l", "rulerValuesCache", "Lj0/N;", "m", "Lj0/N;", "rulerReaders", "Lc2/n;", "v1", "()J", "position", "m1", "()LG1/P;", "child", "s1", "parent", "p1", "hasMeasureResult", "P1", "()LG1/G;", "layoutNode", "LE1/v;", "o1", "()LE1/v;", "coordinates", "z1", "()LE1/g0;", "rulerScope", "r1", "()LE1/J;", "measureResult", "A0", "isLookingAhead$annotations", "isLookingAhead", "n", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class P extends a0 implements T, W {

    /* renamed from: n  reason: collision with root package name */
    public static final b f6363n = new b((DefaultConstructorMarker) null);

    /* renamed from: o  reason: collision with root package name */
    private static final C17642l<r0, C16807N> f6364o = a.f6373c;

    /* renamed from: f  reason: collision with root package name */
    private g0 f6365f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6366g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f6367h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f6368i;

    /* renamed from: j  reason: collision with root package name */
    private final a0.a f6369j = b0.a(this);

    /* renamed from: k  reason: collision with root package name */
    private J<f0> f6370k;

    /* renamed from: l  reason: collision with root package name */
    private J<f0> f6371l;

    /* renamed from: m  reason: collision with root package name */
    private N<f0, O<WeakReference<G>>> f6372m;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LG1/r0;", "result", "LXH/N;", "a", "(LG1/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<r0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f6373c = new a();

        a() {
            super(1);
        }

        public final void a(r0 r0Var) {
            if (r0Var.f1()) {
                r0Var.a().c1(r0Var);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LG1/P$b;", "", "<init>", "()V", "Lkotlin/Function1;", "LG1/r0;", "LXH/N;", "onCommitAffectingRuler", "LnI/l;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r0 f6374c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ P f6375d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(r0 r0Var, P p10) {
            super(0);
            this.f6374c = r0Var;
            this.f6375d = p10;
        }

        public final void invoke() {
            C17642l<g0, C16807N> y10 = this.f6374c.b().y();
            if (y10 != null) {
                y10.invoke(this.f6375d.z1());
            }
        }
    }

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"G1/P$d", "LE1/J;", "LXH/N;", "x", "()V", "", "getWidth", "()I", "width", "getHeight", "height", "", "LE1/a;", "w", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "LE1/g0;", "y", "()LnI/l;", "rulers", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements E1.J {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f6376a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f6377b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map<C4468a, Integer> f6378c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<g0, C16807N> f6379d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<a0.a, C16807N> f6380e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ P f6381f;

        d(int i10, int i11, Map<C4468a, Integer> map, C17642l<? super g0, C16807N> lVar, C17642l<? super a0.a, C16807N> lVar2, P p10) {
            this.f6376a = i10;
            this.f6377b = i11;
            this.f6378c = map;
            this.f6379d = lVar;
            this.f6380e = lVar2;
            this.f6381f = p10;
        }

        public int getHeight() {
            return this.f6377b;
        }

        public int getWidth() {
            return this.f6376a;
        }

        public Map<C4468a, Integer> w() {
            return this.f6378c;
        }

        public void x() {
            this.f6380e.invoke(this.f6381f.u1());
        }

        public C17642l<g0, C16807N> y() {
            return this.f6379d;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"G1/P$e", "LE1/g0;", "", "getDensity", "()F", "density", "D1", "fontScale", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e implements g0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ P f6382a;

        e(P p10) {
            this.f6382a = p10;
        }

        public float D1() {
            return this.f6382a.D1();
        }

        public float getDensity() {
            return this.f6382a.getDensity();
        }
    }

    private final void E1(f0 f0Var) {
        N<f0, O<WeakReference<G>>> n10 = e1(f0Var).f6372m;
        O p10 = n10 != null ? n10.p(f0Var) : null;
        if (p10 != null) {
            T1(p10);
        }
    }

    private final void T1(O<WeakReference<G>> o10) {
        G g10;
        Object[] objArr = o10.f24576b;
        long[] jArr = o10.f24575a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128 && (g10 = (G) ((WeakReference) objArr[(i10 << 3) + i12]).get()) != null) {
                            if (A0()) {
                                g10.q1(false);
                            } else {
                                g10.u1(false);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return;
                    }
                }
                if (i10 != length) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final void c1(r0 r0Var) {
        P s12;
        O p10;
        o0 snapshotObserver;
        r0 r0Var2 = r0Var;
        if (!this.f6368i) {
            C17642l<g0, C16807N> y10 = r0Var.b().y();
            N<f0, O<WeakReference<G>>> n10 = this.f6372m;
            char c10 = 7;
            long j10 = -9187201950435737472L;
            if (y10 != null) {
                J<f0> j11 = this.f6371l;
                if (j11 == null) {
                    j11 = new J<>(0, 1, (DefaultConstructorMarker) null);
                    this.f6371l = j11;
                }
                J<f0> j12 = this.f6370k;
                if (j12 == null) {
                    j12 = new J<>(0, 1, (DefaultConstructorMarker) null);
                    this.f6370k = j12;
                }
                j11.q(j12);
                j12.j();
                m0 p02 = P1().p0();
                if (!(p02 == null || (snapshotObserver = p02.getSnapshotObserver()) == null)) {
                    snapshotObserver.i(r0Var2, f6364o, new c(r0Var2, this));
                }
                if (n10 != null) {
                    Object[] objArr = j11.f24547b;
                    float[] fArr = j11.f24548c;
                    long[] jArr = j11.f24546a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j13 = jArr[i10];
                            if ((((~j13) << 7) & j13 & j10) != j10) {
                                int i11 = 8 - ((~(i10 - length)) >>> 31);
                                long j14 = j13;
                                for (int i12 = 0; i12 < i11; i12++) {
                                    if ((j14 & 255) < 128) {
                                        int i13 = (i10 << 3) + i12;
                                        f0 f0Var = (f0) objArr[i13];
                                        if (!(j12.f(f0Var, Float.NaN) == fArr[i13] || (p10 = n10.p(f0Var)) == null)) {
                                            T1(p10);
                                        }
                                    }
                                    j14 >>= 8;
                                }
                                if (i11 != 8) {
                                    break;
                                }
                            }
                            if (i10 == length) {
                                break;
                            }
                            i10++;
                            j10 = -9187201950435737472L;
                        }
                    }
                }
                Object[] objArr2 = j12.f24547b;
                long[] jArr2 = j12.f24546a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j15 = jArr2[i14];
                        if ((((~j15) << c10) & j15 & -9187201950435737472L) != -9187201950435737472L) {
                            int i15 = 8 - ((~(i14 - length2)) >>> 31);
                            for (int i16 = 0; i16 < i15; i16++) {
                                if ((j15 & 255) < 128) {
                                    f0 f0Var2 = (f0) objArr2[(i14 << 3) + i16];
                                    if (!j11.a(f0Var2) && (s12 = s1()) != null) {
                                        s12.E1(f0Var2);
                                    }
                                }
                                j15 >>= 8;
                            }
                            if (i15 != 8) {
                                break;
                            }
                        }
                        if (i14 == length2) {
                            break;
                        }
                        i14++;
                        c10 = 7;
                    }
                }
                j11.j();
            } else if (n10 != null) {
                Object[] objArr3 = n10.f24570c;
                long[] jArr3 = n10.f24568a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j16 = jArr3[i17];
                        if ((((~j16) << 7) & j16 & -9187201950435737472L) != -9187201950435737472L) {
                            int i18 = 8 - ((~(i17 - length3)) >>> 31);
                            for (int i19 = 0; i19 < i18; i19++) {
                                if ((j16 & 255) < 128) {
                                    T1((O) objArr3[(i17 << 3) + i19]);
                                }
                                j16 >>= 8;
                            }
                            if (i18 != 8) {
                                break;
                            }
                        }
                        if (i17 == length3) {
                            break;
                        }
                        i17++;
                    }
                }
                n10.i();
            }
        }
    }

    private final P e1(f0 f0Var) {
        P s12;
        P p10 = this;
        while (true) {
            J<f0> j10 = p10.f6370k;
            if ((j10 != null && j10.a(f0Var)) || (s12 = p10.s1()) == null) {
                return p10;
            }
            p10 = s12;
        }
    }

    public boolean A0() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void C1(C4498c0 c0Var) {
        C4493a w10;
        C4498c0 J22 = c0Var.J2();
        if (!C17542s.e(J22 != null ? J22.P1() : null, c0Var.P1())) {
            c0Var.z2().w().m();
            return;
        }
        C4495b J10 = c0Var.z2().J();
        if (J10 != null && (w10 = J10.w()) != null) {
            w10.m();
        }
    }

    public E1.J F0(int i10, int i11, Map<C4468a, Integer> map, C17642l<? super g0, C16807N> lVar, C17642l<? super a0.a, C16807N> lVar2) {
        if (!((i10 & -16777216) == 0 && (-16777216 & i11) == 0)) {
            D1.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new d(i10, i11, map, lVar, lVar2, this);
    }

    public boolean O1() {
        return this.f6366g;
    }

    public abstract G P1();

    public final boolean R1() {
        return this.f6368i;
    }

    public final boolean S1() {
        return this.f6367h;
    }

    public abstract void U1();

    public final void X1(boolean z10) {
        this.f6368i = z10;
    }

    public final void Y1(boolean z10) {
        this.f6367h = z10;
    }

    public abstract int Z0(C4468a aVar);

    public final void d1(E1.J j10) {
        if (j10 != null) {
            c1(new r0(j10, this));
            return;
        }
        N<f0, O<WeakReference<G>>> n10 = this.f6372m;
        if (n10 != null) {
            Object[] objArr = n10.f24570c;
            long[] jArr = n10.f24568a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j11 = jArr[i10];
                    if ((((~j11) << 7) & j11 & -9187201950435737472L) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j11) < 128) {
                                T1((O) objArr[(i10 << 3) + i12]);
                            }
                            j11 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        }
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        N<f0, O<WeakReference<G>>> n11 = this.f6372m;
        if (n11 != null) {
            n11.i();
        }
        J<f0> j12 = this.f6370k;
        if (j12 != null) {
            j12.j();
        }
    }

    public abstract P m1();

    public final int n0(C4468a aVar) {
        int Z02;
        if (p1() && (Z02 = Z0(aVar)) != Integer.MIN_VALUE) {
            return Z02 + n.i(y0());
        }
        return Integer.MIN_VALUE;
    }

    public void o0(boolean z10) {
        this.f6366g = z10;
    }

    public abstract C4488v o1();

    public abstract boolean p1();

    public abstract E1.J r1();

    public abstract P s1();

    public final a0.a u1() {
        return this.f6369j;
    }

    public abstract long v1();

    public final g0 z1() {
        g0 g0Var = this.f6365f;
        return g0Var == null ? new e(this) : g0Var;
    }
}
