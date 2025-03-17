package N1;

import N1.W;
import XH.C16807N;
import Y1.i;
import Y1.k;
import YH.C16877v;
import c2.C5267b;
import c2.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.M;
import nI.C17642l;
import o1.C5667g;
import o1.C5669i;
import p1.C5728l0;
import p1.C5732n0;
import p1.C5747v0;
import p1.U0;
import p1.Y;
import p1.g1;
import r1.f;
import r1.g;
import tI.C17978n;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u000fJP\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001dø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 JX\u0010%\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001dø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u001d\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00062\u0006\u0010,\u001a\u00020#¢\u0006\u0004\b-\u0010.J\u0018\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020/ø\u0001\u0000¢\u0006\u0004\b1\u00102J(\u0010:\u001a\u0002092\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u0002032\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b<\u0010=J*\u0010B\u001a\u00020?2\u0006\u0010>\u001a\u0002092\u0006\u0010@\u001a\u00020?2\b\b\u0001\u0010A\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u001d\u0010E\u001a\u00020#2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010D\u001a\u00020\b¢\u0006\u0004\bE\u0010FJ\u0015\u0010H\u001a\u00020G2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\bH\u0010IJ\u0015\u0010J\u001a\u00020G2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\bJ\u0010IJ\u001b\u0010K\u001a\u0002092\u0006\u0010\f\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ\u0015\u0010M\u001a\u0002032\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\bM\u0010=J\u0015\u0010N\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\bN\u0010OJ\u0015\u0010P\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bP\u0010QJ\u0015\u0010R\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bR\u0010QJ\u0015\u0010S\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bS\u0010QJ\u0015\u0010T\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bT\u0010QJ\u0015\u0010U\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bU\u0010OJ\u001f\u0010W\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010V\u001a\u00020\b¢\u0006\u0004\bW\u0010XR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010Y\u001a\u0004\bZ\u0010[R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\\\u0010\u0012\u001a\u0004\b]\u0010^R\u0017\u0010b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bJ\u0010_\u001a\u0004\b`\u0010aR\u0017\u0010f\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b<\u0010c\u001a\u0004\bd\u0010eR\u0017\u0010h\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bM\u0010c\u001a\u0004\bg\u0010eR\u0017\u0010j\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b`\u0010\u0012\u001a\u0004\bi\u0010^R\u001f\u0010p\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030k8\u0006¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR \u0010s\u001a\b\u0012\u0004\u0012\u00020q0k8\u0000X\u0004¢\u0006\f\n\u0004\bg\u0010m\u001a\u0004\br\u0010oR\u0014\u0010v\u001a\u00020t8BX\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010uR\u0011\u0010w\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bl\u0010eR\u0011\u0010y\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bx\u0010e\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006z"}, d2 = {"LN1/n;", "", "LN1/o;", "intrinsics", "Lc2/b;", "constraints", "", "maxLines", "", "ellipsis", "<init>", "(LN1/o;JIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "offset", "LXH/N;", "G", "(I)V", "H", "lineIndex", "I", "Lp1/n0;", "canvas", "Lp1/v0;", "color", "Lp1/g1;", "shadow", "LY1/k;", "decoration", "Lr1/g;", "drawStyle", "Lp1/d0;", "blendMode", "C", "(Lp1/n0;JLp1/g1;LY1/k;Lr1/g;I)V", "Lp1/l0;", "brush", "", "alpha", "E", "(Lp1/n0;Lp1/l0;FLp1/g1;LY1/k;Lr1/g;I)V", "start", "end", "Lp1/U0;", "x", "(II)Lp1/U0;", "vertical", "p", "(F)I", "Lo1/g;", "position", "u", "(J)I", "Lo1/i;", "rect", "LN1/I;", "granularity", "LN1/M;", "inclusionStrategy", "LN1/W;", "z", "(Lo1/i;ILN1/M;)J", "d", "(I)Lo1/i;", "range", "", "array", "arrayStart", "a", "(J[FI)[F", "usePrimaryDirection", "i", "(IZ)F", "LY1/i;", "v", "(I)LY1/i;", "c", "B", "(I)J", "e", "o", "(I)I", "q", "(I)F", "r", "t", "l", "s", "visibleEnd", "n", "(IZ)I", "LN1/o;", "j", "()LN1/o;", "b", "getMaxLines", "()I", "Z", "f", "()Z", "didExceedMaxLines", "F", "A", "()F", "width", "h", "height", "m", "lineCount", "", "g", "Ljava/util/List;", "y", "()Ljava/util/List;", "placeholderRects", "LN1/t;", "w", "paragraphInfoList", "LN1/d;", "()LN1/d;", "annotatedString", "firstBaseline", "k", "lastBaseline", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: N1.n  reason: case insensitive filesystem */
public final class C4679n {

    /* renamed from: a  reason: collision with root package name */
    private final C4680o f9475a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9476b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f9477c;

    /* renamed from: d  reason: collision with root package name */
    private final float f9478d;

    /* renamed from: e  reason: collision with root package name */
    private final float f9479e;

    /* renamed from: f  reason: collision with root package name */
    private final int f9480f;

    /* renamed from: g  reason: collision with root package name */
    private final List<C5669i> f9481g;

    /* renamed from: h  reason: collision with root package name */
    private final List<C4684t> f9482h;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LN1/t;", "paragraphInfo", "LXH/N;", "a", "(LN1/t;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: N1.n$a */
    static final class a extends C17544u implements C17642l<C4684t, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f9483c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float[] f9484d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ M f9485e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ L f9486f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(long j10, float[] fArr, M m10, L l10) {
            super(1);
            this.f9483c = j10;
            this.f9484d = fArr;
            this.f9485e = m10;
            this.f9486f = l10;
        }

        public final void a(C4684t tVar) {
            long j10 = this.f9483c;
            float[] fArr = this.f9484d;
            M m10 = this.f9485e;
            L l10 = this.f9486f;
            long b10 = X.b(tVar.r(tVar.f() > W.l(j10) ? tVar.f() : W.l(j10)), tVar.r(tVar.b() < W.k(j10) ? tVar.b() : W.k(j10)));
            tVar.e().w(b10, fArr, m10.f144346a);
            int j11 = m10.f144346a + (W.j(b10) * 4);
            for (int i10 = m10.f144346a; i10 < j11; i10 += 4) {
                int i11 = i10 + 1;
                float f10 = fArr[i11];
                float f11 = l10.f144345a;
                fArr[i11] = f10 + f11;
                int i12 = i10 + 3;
                fArr[i12] = fArr[i12] + f11;
            }
            m10.f144346a = j11;
            l10.f144345a += tVar.e().getHeight();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4684t) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LN1/t;", "paragraphInfo", "LXH/N;", "a", "(LN1/t;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: N1.n$b */
    static final class b extends C17544u implements C17642l<C4684t, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ U0 f9487c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f9488d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f9489e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(U0 u02, int i10, int i11) {
            super(1);
            this.f9487c = u02;
            this.f9488d = i10;
            this.f9489e = i11;
        }

        public final void a(C4684t tVar) {
            U0.l(this.f9487c, tVar.j(tVar.e().t(tVar.r(this.f9488d), tVar.r(this.f9489e))), 0, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4684t) obj);
            return C16807N.f139792a;
        }
    }

    public /* synthetic */ C4679n(C4680o oVar, long j10, int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(oVar, j10, i10, z10);
    }

    public static /* synthetic */ void D(C4679n nVar, C5732n0 n0Var, long j10, g1 g1Var, k kVar, g gVar, int i10, int i11, Object obj) {
        long i12 = (i11 & 2) != 0 ? C5747v0.f27350b.i() : j10;
        g gVar2 = null;
        g1 g1Var2 = (i11 & 4) != 0 ? null : g1Var;
        k kVar2 = (i11 & 8) != 0 ? null : kVar;
        if ((i11 & 16) == 0) {
            gVar2 = gVar;
        }
        nVar.C(n0Var, i12, g1Var2, kVar2, gVar2, (i11 & 32) != 0 ? f.f28623w0.a() : i10);
    }

    public static /* synthetic */ void F(C4679n nVar, C5732n0 n0Var, C5728l0 l0Var, float f10, g1 g1Var, k kVar, g gVar, int i10, int i11, Object obj) {
        nVar.E(n0Var, l0Var, (i11 & 4) != 0 ? Float.NaN : f10, (i11 & 8) != 0 ? null : g1Var, (i11 & 16) != 0 ? null : kVar, (i11 & 32) != 0 ? null : gVar, (i11 & 64) != 0 ? f.f28623w0.a() : i10);
    }

    private final void G(int i10) {
        if (i10 < 0 || i10 >= b().j().length()) {
            throw new IllegalArgumentException(("offset(" + i10 + ") is out of bounds [0, " + b().length() + ')').toString());
        }
    }

    private final void H(int i10) {
        if (i10 < 0 || i10 > b().j().length()) {
            throw new IllegalArgumentException(("offset(" + i10 + ") is out of bounds [0, " + b().length() + ']').toString());
        }
    }

    private final void I(int i10) {
        if (i10 < 0 || i10 >= this.f9480f) {
            throw new IllegalArgumentException(("lineIndex(" + i10 + ") is out of bounds [0, " + this.f9480f + ')').toString());
        }
    }

    private final C4669d b() {
        return this.f9475a.e();
    }

    public final float A() {
        return this.f9478d;
    }

    public final long B(int i10) {
        H(i10);
        C4684t tVar = this.f9482h.get(i10 == b().length() ? C16877v.p(this.f9482h) : C4682q.a(this.f9482h, i10));
        return tVar.k(tVar.e().k(tVar.r(i10)), false);
    }

    public final void C(C5732n0 n0Var, long j10, g1 g1Var, k kVar, g gVar, int i10) {
        n0Var.t();
        List<C4684t> list = this.f9482h;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            C4684t tVar = list.get(i11);
            tVar.e().v(n0Var, j10, g1Var, kVar, gVar, i10);
            n0Var.d(0.0f, tVar.e().getHeight());
        }
        C5732n0 n0Var2 = n0Var;
        n0Var.n();
    }

    public final void E(C5732n0 n0Var, C5728l0 l0Var, float f10, g1 g1Var, k kVar, g gVar, int i10) {
        V1.b.a(this, n0Var, l0Var, f10, g1Var, kVar, gVar, i10);
    }

    public final float[] a(long j10, float[] fArr, int i10) {
        G(W.l(j10));
        H(W.k(j10));
        M m10 = new M();
        m10.f144346a = i10;
        C4682q.d(this.f9482h, j10, new a(j10, fArr, m10, new L()));
        return fArr;
    }

    public final i c(int i10) {
        H(i10);
        C4684t tVar = this.f9482h.get(i10 == b().length() ? C16877v.p(this.f9482h) : C4682q.a(this.f9482h, i10));
        return tVar.e().z(tVar.r(i10));
    }

    public final C5669i d(int i10) {
        G(i10);
        C4684t tVar = this.f9482h.get(C4682q.a(this.f9482h, i10));
        return tVar.i(tVar.e().e(tVar.r(i10)));
    }

    public final C5669i e(int i10) {
        H(i10);
        C4684t tVar = this.f9482h.get(i10 == b().length() ? C16877v.p(this.f9482h) : C4682q.a(this.f9482h, i10));
        return tVar.i(tVar.e().j(tVar.r(i10)));
    }

    public final boolean f() {
        return this.f9477c;
    }

    public final float g() {
        if (this.f9482h.isEmpty()) {
            return 0.0f;
        }
        return this.f9482h.get(0).e().l();
    }

    public final float h() {
        return this.f9479e;
    }

    public final float i(int i10, boolean z10) {
        H(i10);
        C4684t tVar = this.f9482h.get(i10 == b().length() ? C16877v.p(this.f9482h) : C4682q.a(this.f9482h, i10));
        return tVar.e().u(tVar.r(i10), z10);
    }

    public final C4680o j() {
        return this.f9475a;
    }

    public final float k() {
        if (this.f9482h.isEmpty()) {
            return 0.0f;
        }
        C4684t tVar = (C4684t) C16877v.I0(this.f9482h);
        return tVar.o(tVar.e().x());
    }

    public final float l(int i10) {
        I(i10);
        C4684t tVar = this.f9482h.get(C4682q.b(this.f9482h, i10));
        return tVar.o(tVar.e().A(tVar.s(i10)));
    }

    public final int m() {
        return this.f9480f;
    }

    public final int n(int i10, boolean z10) {
        I(i10);
        C4684t tVar = this.f9482h.get(C4682q.b(this.f9482h, i10));
        return tVar.m(tVar.e().o(tVar.s(i10), z10));
    }

    public final int o(int i10) {
        C4684t tVar = this.f9482h.get(i10 >= b().length() ? C16877v.p(this.f9482h) : i10 < 0 ? 0 : C4682q.a(this.f9482h, i10));
        return tVar.n(tVar.e().y(tVar.r(i10)));
    }

    public final int p(float f10) {
        C4684t tVar = this.f9482h.get(C4682q.c(this.f9482h, f10));
        return tVar.d() == 0 ? tVar.g() : tVar.n(tVar.e().s(tVar.t(f10)));
    }

    public final float q(int i10) {
        I(i10);
        C4684t tVar = this.f9482h.get(C4682q.b(this.f9482h, i10));
        return tVar.e().c(tVar.s(i10));
    }

    public final float r(int i10) {
        I(i10);
        C4684t tVar = this.f9482h.get(C4682q.b(this.f9482h, i10));
        return tVar.e().b(tVar.s(i10));
    }

    public final int s(int i10) {
        I(i10);
        C4684t tVar = this.f9482h.get(C4682q.b(this.f9482h, i10));
        return tVar.m(tVar.e().n(tVar.s(i10)));
    }

    public final float t(int i10) {
        I(i10);
        C4684t tVar = this.f9482h.get(C4682q.b(this.f9482h, i10));
        return tVar.o(tVar.e().i(tVar.s(i10)));
    }

    public final int u(long j10) {
        C4684t tVar = this.f9482h.get(C4682q.c(this.f9482h, C5667g.n(j10)));
        return tVar.d() == 0 ? tVar.f() : tVar.m(tVar.e().m(tVar.q(j10)));
    }

    public final i v(int i10) {
        H(i10);
        C4684t tVar = this.f9482h.get(i10 == b().length() ? C16877v.p(this.f9482h) : C4682q.a(this.f9482h, i10));
        return tVar.e().h(tVar.r(i10));
    }

    public final List<C4684t> w() {
        return this.f9482h;
    }

    public final U0 x(int i10, int i11) {
        if (i10 < 0 || i10 > i11 || i11 > b().j().length()) {
            throw new IllegalArgumentException(("Start(" + i10 + ") or End(" + i11 + ") is out of range [0.." + b().j().length() + "), or start > end!").toString());
        } else if (i10 == i11) {
            return Y.a();
        } else {
            U0 a10 = Y.a();
            C4682q.d(this.f9482h, X.b(i10, i11), new b(a10, i10, i11));
            return a10;
        }
    }

    public final List<C5669i> y() {
        return this.f9481g;
    }

    public final long z(C5669i iVar, int i10, M m10) {
        W.a aVar;
        W.a aVar2;
        int c10 = C4682q.c(this.f9482h, iVar.r());
        if (this.f9482h.get(c10).a() >= iVar.j() || c10 == C16877v.p(this.f9482h)) {
            C4684t tVar = this.f9482h.get(c10);
            return C4684t.l(tVar, tVar.e().C(tVar.p(iVar), i10, m10), false, 1, (Object) null);
        }
        int c11 = C4682q.c(this.f9482h, iVar.j());
        long a10 = W.f9419b.a();
        while (true) {
            aVar = W.f9419b;
            if (W.g(a10, aVar.a()) && c10 <= c11) {
                C4684t tVar2 = this.f9482h.get(c10);
                a10 = C4684t.l(tVar2, tVar2.e().C(tVar2.p(iVar), i10, m10), false, 1, (Object) null);
                c10++;
            }
        }
        if (W.g(a10, aVar.a())) {
            return aVar.a();
        }
        long a11 = aVar.a();
        while (true) {
            aVar2 = W.f9419b;
            if (W.g(a11, aVar2.a()) && c10 <= c11) {
                C4684t tVar3 = this.f9482h.get(c11);
                a11 = C4684t.l(tVar3, tVar3.e().C(tVar3.p(iVar), i10, m10), false, 1, (Object) null);
                c11--;
            }
        }
        return W.g(a11, aVar2.a()) ? a10 : X.b(W.n(a10), W.i(a11));
    }

    private C4679n(C4680o oVar, long j10, int i10, boolean z10) {
        boolean z11;
        int k10;
        float height;
        int i11;
        this.f9475a = oVar;
        this.f9476b = i10;
        if (C5267b.n(j10) == 0 && C5267b.m(j10) == 0) {
            ArrayList arrayList = new ArrayList();
            List<C4685u> f10 = oVar.f();
            int size = f10.size();
            int i12 = 0;
            int i13 = 0;
            float f11 = 0.0f;
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    z11 = false;
                    break;
                }
                C4685u uVar = f10.get(i14);
                C4686v b10 = uVar.b();
                int l10 = C5267b.l(j10);
                if (C5267b.g(j10)) {
                    k10 = C17978n.e(C5267b.k(j10) - C4688x.d(f11), i12);
                } else {
                    k10 = C5267b.k(j10);
                }
                C4683s c10 = C4688x.c(b10, c.b(0, l10, 0, k10, 5, (Object) null), this.f9476b - i13, z10);
                height = f11 + c10.getHeight();
                int p10 = i13 + c10.p();
                C4684t tVar = r6;
                List<C4685u> list = f10;
                i11 = p10;
                C4684t tVar2 = new C4684t(c10, uVar.c(), uVar.a(), i13, p10, f11, height);
                arrayList.add(tVar);
                if (c10.r() || (i11 == this.f9476b && i14 != C16877v.p(this.f9475a.f()))) {
                    z11 = true;
                    i13 = i11;
                    f11 = height;
                } else {
                    i14++;
                    i13 = i11;
                    f11 = height;
                    i12 = 0;
                    f10 = list;
                }
            }
            z11 = true;
            i13 = i11;
            f11 = height;
            this.f9479e = f11;
            this.f9480f = i13;
            this.f9477c = z11;
            this.f9482h = arrayList;
            this.f9478d = (float) C5267b.l(j10);
            List<C5669i> arrayList2 = new ArrayList<>(arrayList.size());
            int size2 = arrayList.size();
            for (int i15 = 0; i15 < size2; i15++) {
                C4684t tVar3 = (C4684t) arrayList.get(i15);
                List<C5669i> B10 = tVar3.e().B();
                ArrayList arrayList3 = new ArrayList(B10.size());
                int size3 = B10.size();
                for (int i16 = 0; i16 < size3; i16++) {
                    C5669i iVar = B10.get(i16);
                    arrayList3.add(iVar != null ? tVar3.i(iVar) : null);
                }
                C16877v.E(arrayList2, arrayList3);
            }
            if (arrayList2.size() < this.f9475a.g().size()) {
                int size4 = this.f9475a.g().size() - arrayList2.size();
                ArrayList arrayList4 = new ArrayList(size4);
                for (int i17 = 0; i17 < size4; i17++) {
                    arrayList4.add((Object) null);
                }
                arrayList2 = C16877v.V0(arrayList2, arrayList4);
            }
            this.f9481g = arrayList2;
            return;
        }
        throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
    }
}
