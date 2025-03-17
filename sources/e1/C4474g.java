package E1;

import E1.a0;
import G1.C;
import G1.Q;
import XH.C16807N;
import c2.s;
import c2.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJJ\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\n*\u00020\u0017H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\n*\u00020\u001aH\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u0017*\u00020\u001aH\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u0017*\u00020\u001fH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001a\u0010\"\u001a\u00020\u0017*\u00020\nH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020%*\u00020$H\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u001f*\u00020\u0017H\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010!J\u0017\u0010)\u001a\u00020\u001f*\u00020\u001aH\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010\u001eJ\u0017\u0010*\u001a\u00020$*\u00020%H\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010'J\u0017\u0010+\u001a\u00020\u001a*\u00020\u0017H\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001a\u0010-\u001a\u00020\u001a*\u00020\u001fH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010,J\u001a\u0010.\u001a\u00020\u001a*\u00020\nH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b.\u0010/J]\u00102\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r2\u0014\u00101\u001a\u0010\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0016¢\u0006\u0004\b2\u00103R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010D\u001a\u00020>8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\b?\u0010A\"\u0004\bB\u0010CR\u0014\u0010G\u001a\u00020\u001f8\u0016X\u0005¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020\u001f8\u0016X\u0005¢\u0006\u0006\u001a\u0004\bH\u0010FR\u0014\u0010M\u001a\u00020J8\u0016X\u0005¢\u0006\u0006\u001a\u0004\bK\u0010LR\u001a\u0010Q\u001a\u00020N8VX\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010S\u001a\u00020>8VX\u0004¢\u0006\u0006\u001a\u0004\bR\u0010A\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006T"}, d2 = {"LE1/g;", "LE1/f;", "LE1/K;", "", "LG1/C;", "coordinator", "LE1/e;", "approachNode", "<init>", "(LG1/C;LE1/e;)V", "", "width", "height", "", "LE1/a;", "alignmentLines", "Lkotlin/Function1;", "LE1/a0$a;", "LXH/N;", "placementBlock", "LE1/J;", "I0", "(IILjava/util/Map;LnI/l;)LE1/J;", "Lc2/h;", "K0", "(F)I", "Lc2/v;", "K1", "(J)I", "q", "(J)F", "", "x1", "(F)F", "H", "(I)F", "Lo1/m;", "Lc2/k;", "X", "(J)J", "H1", "O0", "O", "W", "(F)J", "t", "l0", "(I)J", "LE1/g0;", "rulers", "F0", "(IILjava/util/Map;LnI/l;LnI/l;)LE1/J;", "a", "LG1/C;", "p", "()LG1/C;", "b", "LE1/e;", "h", "()LE1/e;", "x", "(LE1/e;)V", "", "c", "Z", "()Z", "w", "(Z)V", "approachMeasureRequired", "getDensity", "()F", "density", "D1", "fontScale", "Lc2/t;", "getLayoutDirection", "()Lc2/t;", "layoutDirection", "Lc2/r;", "u", "()J", "lookaheadSize", "A0", "isLookingAhead", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: E1.g  reason: case insensitive filesystem */
public final class C4474g implements C4473f, K {

    /* renamed from: a  reason: collision with root package name */
    private final C f5890a;

    /* renamed from: b  reason: collision with root package name */
    private C4472e f5891b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5892c;

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0016X\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"E1/g$a", "LE1/J;", "LXH/N;", "x", "()V", "", "a", "I", "getWidth", "()I", "width", "b", "getHeight", "height", "", "LE1/a;", "c", "Ljava/util/Map;", "w", "()Ljava/util/Map;", "getAlignmentLines$annotations", "alignmentLines", "Lkotlin/Function1;", "LE1/g0;", "d", "LnI/l;", "y", "()LnI/l;", "rulers", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: E1.g$a */
    public static final class a implements J {

        /* renamed from: a  reason: collision with root package name */
        private final int f5893a;

        /* renamed from: b  reason: collision with root package name */
        private final int f5894b;

        /* renamed from: c  reason: collision with root package name */
        private final Map<C4468a, Integer> f5895c;

        /* renamed from: d  reason: collision with root package name */
        private final C17642l<g0, C16807N> f5896d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<a0.a, C16807N> f5897e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C4474g f5898f;

        a(int i10, int i11, Map<C4468a, Integer> map, C17642l<? super g0, C16807N> lVar, C17642l<? super a0.a, C16807N> lVar2, C4474g gVar) {
            this.f5897e = lVar2;
            this.f5898f = gVar;
            this.f5893a = i10;
            this.f5894b = i11;
            this.f5895c = map;
            this.f5896d = lVar;
        }

        public int getHeight() {
            return this.f5894b;
        }

        public int getWidth() {
            return this.f5893a;
        }

        public Map<C4468a, Integer> w() {
            return this.f5895c;
        }

        public void x() {
            this.f5897e.invoke(this.f5898f.p().u1());
        }

        public C17642l<g0, C16807N> y() {
            return this.f5896d;
        }
    }

    public C4474g(C c10, C4472e eVar) {
        this.f5890a = c10;
        this.f5891b = eVar;
    }

    public boolean A0() {
        return false;
    }

    public float D1() {
        return this.f5890a.D1();
    }

    public J F0(int i10, int i11, Map<C4468a, Integer> map, C17642l<? super g0, C16807N> lVar, C17642l<? super a0.a, C16807N> lVar2) {
        if (!((i10 & -16777216) == 0 && (-16777216 & i11) == 0)) {
            D1.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(i10, i11, map, lVar, lVar2, this);
    }

    public float H(int i10) {
        return this.f5890a.H(i10);
    }

    public float H1(float f10) {
        return this.f5890a.H1(f10);
    }

    public J I0(int i10, int i11, Map<C4468a, Integer> map, C17642l<? super a0.a, C16807N> lVar) {
        return this.f5890a.I0(i10, i11, map, lVar);
    }

    public int K0(float f10) {
        return this.f5890a.K0(f10);
    }

    public int K1(long j10) {
        return this.f5890a.K1(j10);
    }

    public long O(long j10) {
        return this.f5890a.O(j10);
    }

    public float O0(long j10) {
        return this.f5890a.O0(j10);
    }

    public long W(float f10) {
        return this.f5890a.W(f10);
    }

    public long X(long j10) {
        return this.f5890a.X(j10);
    }

    public final boolean c() {
        return this.f5892c;
    }

    public float getDensity() {
        return this.f5890a.getDensity();
    }

    public t getLayoutDirection() {
        return this.f5890a.getLayoutDirection();
    }

    public final C4472e h() {
        return this.f5891b;
    }

    public long l0(int i10) {
        return this.f5890a.l0(i10);
    }

    public final C p() {
        return this.f5890a;
    }

    public float q(long j10) {
        return this.f5890a.q(j10);
    }

    public long t(float f10) {
        return this.f5890a.t(f10);
    }

    public long u() {
        Q E22 = this.f5890a.E2();
        C17542s.g(E22);
        J r12 = E22.r1();
        return s.a(r12.getWidth(), r12.getHeight());
    }

    public final void w(boolean z10) {
        this.f5892c = z10;
    }

    public final void x(C4472e eVar) {
        this.f5891b = eVar;
    }

    public float x1(float f10) {
        return this.f5890a.x1(f10);
    }
}
