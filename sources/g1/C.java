package G1;

import E1.C4468a;
import E1.C4472e;
import E1.C4474g;
import E1.J;
import E1.a0;
import E1.g0;
import XH.C16807N;
import androidx.compose.ui.d;
import c2.C5267b;
import c2.r;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import p1.C5732n0;
import p1.C5747v0;
import p1.S;
import p1.S0;
import p1.T0;
import s1.C5905c;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 R2\u00020\u0001:\u0002STB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J*\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0014ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J8\u0010$\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\b\u0018\u00010!H\u0014ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J!\u0010-\u001a\u00020\b2\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b-\u0010.R*\u00106\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00048\u0006@@X\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u0010=\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R.\u0010F\u001a\u0004\u0018\u00010>2\b\u0010?\u001a\u0004\u0018\u00010>8\u0016@TX\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8VX\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0011\u0010Q\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\bO\u0010P\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006U"}, d2 = {"LG1/C;", "LG1/c0;", "LG1/G;", "layoutNode", "LG1/B;", "measureNode", "<init>", "(LG1/G;LG1/B;)V", "LXH/N;", "H3", "()V", "u2", "Lc2/b;", "constraints", "LE1/a0;", "i0", "(J)LE1/a0;", "", "height", "g0", "(I)I", "h0", "width", "V", "x", "Lc2/n;", "position", "", "zIndex", "Ls1/c;", "layer", "T0", "(JFLs1/c;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "layerBlock", "N0", "(JFLnI/l;)V", "LE1/a;", "alignmentLine", "Z0", "(LE1/a;)I", "Lp1/n0;", "canvas", "graphicsLayer", "e3", "(Lp1/n0;Ls1/c;)V", "value", "T", "LG1/B;", "E3", "()LG1/B;", "I3", "(LG1/B;)V", "layoutModifierNode", "U", "Lc2/b;", "F3", "()Lc2/b;", "J3", "(Lc2/b;)V", "lookaheadConstraints", "LG1/Q;", "<set-?>", "X", "LG1/Q;", "E2", "()LG1/Q;", "K3", "(LG1/Q;)V", "lookaheadDelegate", "LE1/g;", "Y", "LE1/g;", "approachMeasureScope", "Landroidx/compose/ui/d$c;", "I2", "()Landroidx/compose/ui/d$c;", "tail", "G3", "()LG1/c0;", "wrappedNonNull", "Z", "a", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class C extends C4498c0 {

    /* renamed from: Z  reason: collision with root package name */
    public static final a f6203Z = new a((DefaultConstructorMarker) null);

    /* renamed from: y0  reason: collision with root package name */
    private static final S0 f6204y0;

    /* renamed from: T  reason: collision with root package name */
    private B f6205T;

    /* renamed from: U  reason: collision with root package name */
    private C5267b f6206U;

    /* renamed from: X  reason: collision with root package name */
    private Q f6207X;
    /* access modifiers changed from: private */

    /* renamed from: Y  reason: collision with root package name */
    public C4474g f6208Y;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LG1/C$a;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0010\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"LG1/C$b;", "LG1/Q;", "<init>", "(LG1/C;)V", "Lc2/b;", "constraints", "LE1/a0;", "i0", "(J)LE1/a0;", "LE1/a;", "alignmentLine", "", "Z0", "(LE1/a;)I", "height", "g0", "(I)I", "h0", "width", "V", "x", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class b extends Q {
        public b() {
            super(C.this);
        }

        public int V(int i10) {
            B E32 = C.this.E3();
            Q E22 = C.this.G3().E2();
            C17542s.g(E22);
            return E32.I(this, E22, i10);
        }

        public int Z0(C4468a aVar) {
            int a10 = D.b(this, aVar);
            d2().put(aVar, Integer.valueOf(a10));
            return a10;
        }

        public int g0(int i10) {
            B E32 = C.this.E3();
            Q E22 = C.this.G3().E2();
            C17542s.g(E22);
            return E32.E(this, E22, i10);
        }

        public int h0(int i10) {
            B E32 = C.this.E3();
            Q E22 = C.this.G3().E2();
            C17542s.g(E22);
            return E32.P(this, E22, i10);
        }

        public a0 i0(long j10) {
            C c10 = C.this;
            X0(j10);
            c10.J3(C5267b.a(j10));
            B E32 = c10.E3();
            Q E22 = c10.G3().E2();
            C17542s.g(E22);
            n2(E32.h(this, E22, j10));
            return this;
        }

        public int x(int i10) {
            B E32 = C.this.E3();
            Q E22 = C.this.G3().E2();
            C17542s.g(E22);
            return E32.w(this, E22, i10);
        }
    }

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138VX\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"G1/C$c", "LE1/J;", "LXH/N;", "x", "()V", "", "b", "I", "getWidth", "()I", "width", "c", "getHeight", "height", "", "LE1/a;", "w", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "LE1/g0;", "y", "()LnI/l;", "rulers", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements J {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ J f6210a;

        /* renamed from: b  reason: collision with root package name */
        private final int f6211b;

        /* renamed from: c  reason: collision with root package name */
        private final int f6212c;

        c(J j10, C c10) {
            this.f6210a = j10;
            Q E22 = c10.E2();
            C17542s.g(E22);
            this.f6211b = E22.E0();
            Q E23 = c10.E2();
            C17542s.g(E23);
            this.f6212c = E23.z0();
        }

        public int getHeight() {
            return this.f6212c;
        }

        public int getWidth() {
            return this.f6211b;
        }

        public Map<C4468a, Integer> w() {
            return this.f6210a.w();
        }

        public void x() {
            this.f6210a.x();
        }

        public C17642l<g0, C16807N> y() {
            return this.f6210a.y();
        }
    }

    static {
        S0 a10 = S.a();
        a10.j(C5747v0.f27350b.b());
        a10.w(1.0f);
        a10.v(T0.f27248a.b());
        f6204y0 = a10;
    }

    public C(G g10, B b10) {
        super(g10);
        this.f6205T = b10;
        C4474g gVar = null;
        this.f6207X = g10.d0() != null ? new b() : null;
        if ((b10.E0().e2() & C4502e0.a(512)) != 0) {
            C17542s.h(b10, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
            gVar = new C4474g(this, (C4472e) b10);
        }
        this.f6208Y = gVar;
    }

    private final void H3() {
        boolean z10;
        if (!S1()) {
            c3();
            C4474g gVar = this.f6208Y;
            if (gVar != null) {
                C4472e h10 = gVar.h();
                a0.a u12 = u1();
                Q E22 = E2();
                C17542s.g(E22);
                if (!h10.B0(u12, E22.g2()) && !gVar.c()) {
                    long a10 = a();
                    Q E23 = E2();
                    r rVar = null;
                    if (r.e(a10, E23 != null ? r.b(E23.h2()) : null)) {
                        long a11 = G3().a();
                        Q E24 = G3().E2();
                        if (E24 != null) {
                            rVar = r.b(E24.h2());
                        }
                        if (r.e(a11, rVar)) {
                            z10 = true;
                            G3().l3(z10);
                        }
                    }
                }
                z10 = false;
                G3().l3(z10);
            }
            r1().x();
            G3().l3(false);
        }
    }

    public Q E2() {
        return this.f6207X;
    }

    public final B E3() {
        return this.f6205T;
    }

    public final C5267b F3() {
        return this.f6206U;
    }

    public final C4498c0 G3() {
        C4498c0 J22 = J2();
        C17542s.g(J22);
        return J22;
    }

    public d.c I2() {
        return this.f6205T.E0();
    }

    public final void I3(B b10) {
        if (!C17542s.e(b10, this.f6205T)) {
            d.c E02 = b10.E0();
            if ((E02.e2() & C4502e0.a(512)) != 0) {
                C17542s.h(b10, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
                C4472e eVar = (C4472e) b10;
                C4474g gVar = this.f6208Y;
                if (gVar != null) {
                    gVar.x(eVar);
                } else {
                    gVar = new C4474g(this, eVar);
                }
                this.f6208Y = gVar;
            } else {
                this.f6208Y = null;
            }
        }
        this.f6205T = b10;
    }

    public final void J3(C5267b bVar) {
        this.f6206U = bVar;
    }

    /* access modifiers changed from: protected */
    public void K3(Q q10) {
        this.f6207X = q10;
    }

    /* access modifiers changed from: protected */
    public void N0(long j10, float f10, C17642l<? super androidx.compose.ui.graphics.c, C16807N> lVar) {
        super.N0(j10, f10, lVar);
        H3();
    }

    /* access modifiers changed from: protected */
    public void T0(long j10, float f10, C5905c cVar) {
        super.T0(j10, f10, cVar);
        H3();
    }

    public int V(int i10) {
        C4474g gVar = this.f6208Y;
        return gVar != null ? gVar.h().e0(gVar, G3(), i10) : this.f6205T.I(this, G3(), i10);
    }

    public int Z0(C4468a aVar) {
        Q E22 = E2();
        return E22 != null ? E22.c2(aVar) : D.b(this, aVar);
    }

    public void e3(C5732n0 n0Var, C5905c cVar) {
        G3().r2(n0Var, cVar);
        if (K.b(P1()).getShowLayoutBounds()) {
            s2(n0Var, f6204y0);
        }
    }

    public int g0(int i10) {
        C4474g gVar = this.f6208Y;
        return gVar != null ? gVar.h().i0(gVar, G3(), i10) : this.f6205T.E(this, G3(), i10);
    }

    public int h0(int i10) {
        C4474g gVar = this.f6208Y;
        return gVar != null ? gVar.h().p0(gVar, G3(), i10) : this.f6205T.P(this, G3(), i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007d, code lost:
        if (r8 == r1.z0()) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public E1.a0 i0(long r7) {
        /*
            r6 = this;
            boolean r0 = r6.A2()
            if (r0 == 0) goto L_0x0017
            c2.b r7 = r6.f6206U
            if (r7 == 0) goto L_0x000f
            long r7 = r7.r()
            goto L_0x0017
        L_0x000f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Lookahead constraints cannot be null in approach pass."
            r7.<init>(r8)
            throw r7
        L_0x0017:
            r6.X0(r7)
            E1.g r0 = r6.f6208Y
            if (r0 == 0) goto L_0x00b2
            E1.e r1 = r0.h()
            long r2 = r0.u()
            boolean r2 = r1.Z0(r2)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x003d
            c2.b r2 = r6.F3()
            boolean r2 = c2.C5267b.e(r7, r2)
            if (r2 != 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r2 = r4
            goto L_0x003e
        L_0x003d:
            r2 = r3
        L_0x003e:
            r0.w(r2)
            boolean r2 = r0.c()
            if (r2 != 0) goto L_0x004e
            G1.c0 r2 = r6.G3()
            r2.k3(r3)
        L_0x004e:
            G1.c0 r2 = r6.G3()
            E1.J r7 = r1.Y(r0, r2, r7)
            G1.c0 r8 = r6.G3()
            r8.k3(r4)
            int r8 = r7.getWidth()
            G1.Q r1 = r6.E2()
            kotlin.jvm.internal.C17542s.g(r1)
            int r1 = r1.E0()
            if (r8 != r1) goto L_0x0080
            int r8 = r7.getHeight()
            G1.Q r1 = r6.E2()
            kotlin.jvm.internal.C17542s.g(r1)
            int r1 = r1.z0()
            if (r8 != r1) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r3 = r4
        L_0x0081:
            boolean r8 = r0.c()
            if (r8 != 0) goto L_0x00be
            G1.c0 r8 = r6.G3()
            long r0 = r8.a()
            G1.c0 r8 = r6.G3()
            G1.Q r8 = r8.E2()
            if (r8 == 0) goto L_0x00a2
            long r4 = r8.h2()
            c2.r r8 = c2.r.b(r4)
            goto L_0x00a3
        L_0x00a2:
            r8 = 0
        L_0x00a3:
            boolean r8 = c2.r.e(r0, r8)
            if (r8 == 0) goto L_0x00be
            if (r3 != 0) goto L_0x00be
            G1.C$c r8 = new G1.C$c
            r8.<init>(r7, r6)
            r7 = r8
            goto L_0x00be
        L_0x00b2:
            G1.B r0 = r6.E3()
            G1.c0 r1 = r6.G3()
            E1.J r7 = r0.h(r6, r1, r7)
        L_0x00be:
            r6.m3(r7)
            r6.b3()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: G1.C.i0(long):E1.a0");
    }

    public void u2() {
        if (E2() == null) {
            K3(new b());
        }
    }

    public int x(int i10) {
        C4474g gVar = this.f6208Y;
        return gVar != null ? gVar.h().D0(gVar, G3(), i10) : this.f6205T.w(this, G3(), i10);
    }
}
