package G0;

import E1.C4468a;
import E1.C4469b;
import E1.C4484q;
import E1.H;
import E1.J;
import E1.K;
import E1.a0;
import G1.B;
import G1.C4515s;
import G1.r;
import G1.w0;
import G1.x0;
import L1.v;
import L1.x;
import N1.C4669d;
import N1.C4683s;
import N1.E;
import N1.P;
import N1.Y;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import S1.C4831y;
import XH.C16807N;
import Y1.h;
import Y1.o;
import Y1.q;
import Y1.s;
import Y1.t;
import androidx.compose.ui.d;
import c2.C5267b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import p1.C5728l0;
import p1.C5732n0;
import p1.C5747v0;
import p1.C5753y0;
import p1.g1;
import r1.C5817c;
import r1.g;
import r1.j;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001fBS\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010 J\u001f\u0010#\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b%\u0010\u001dJ@\u0010&\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b&\u0010'J%\u0010+\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r¢\u0006\u0004\b+\u0010,J\u0013\u0010.\u001a\u00020\u001e*\u00020-H\u0016¢\u0006\u0004\b.\u0010/J&\u00106\u001a\u000205*\u0002002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0016ø\u0001\u0000¢\u0006\u0004\b6\u00107J#\u0010;\u001a\u00020\u000f*\u0002082\u0006\u00102\u001a\u0002092\u0006\u0010:\u001a\u00020\u000fH\u0016¢\u0006\u0004\b;\u0010<J#\u0010>\u001a\u00020\u000f*\u0002082\u0006\u00102\u001a\u0002092\u0006\u0010=\u001a\u00020\u000fH\u0016¢\u0006\u0004\b>\u0010<J#\u0010?\u001a\u00020\u000f*\u0002082\u0006\u00102\u001a\u0002092\u0006\u0010:\u001a\u00020\u000fH\u0016¢\u0006\u0004\b?\u0010<J#\u0010@\u001a\u00020\u000f*\u0002082\u0006\u00102\u001a\u0002092\u0006\u0010=\u001a\u00020\u000fH\u0016¢\u0006\u0004\b@\u0010<J\u0013\u0010B\u001a\u00020\u001e*\u00020AH\u0016¢\u0006\u0004\bB\u0010CR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001c\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bJ\u0010>R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bM\u0010>R\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bN\u0010>R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bO\u0010PR*\u0010V\u001a\u0010\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020\u000f\u0018\u00010Q8\u0002@\u0002X\u000e¢\u0006\f\n\u0004\bS\u0010T\u0012\u0004\bU\u0010 R\u0018\u0010X\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b@\u0010WR*\u0010^\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020[0Z\u0012\u0004\u0012\u00020\r\u0018\u00010Y8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010b\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010e\u001a\u00020\u00188BX\u0004¢\u0006\u0006\u001a\u0004\bc\u0010d\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006g"}, d2 = {"LG0/k;", "Landroidx/compose/ui/d$c;", "LG1/B;", "LG1/r;", "LG1/w0;", "", "text", "LN1/Y;", "style", "LS1/m$b;", "fontFamilyResolver", "LY1/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Lp1/y0;", "overrideColor", "<init>", "(Ljava/lang/String;LN1/Y;LS1/m$b;IZIILp1/y0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lc2/d;", "density", "LG0/f;", "M2", "(Lc2/d;)LG0/f;", "updatedText", "O2", "(Ljava/lang/String;)Z", "LXH/N;", "J2", "()V", "N2", "color", "P2", "(Lp1/y0;LN1/Y;)Z", "R2", "Q2", "(LN1/Y;IIZLS1/m$b;I)Z", "drawChanged", "textChanged", "layoutChanged", "K2", "(ZZZ)V", "LL1/x;", "m0", "(LL1/x;)V", "LE1/K;", "LE1/H;", "measurable", "Lc2/b;", "constraints", "LE1/J;", "h", "(LE1/K;LE1/H;J)LE1/J;", "LE1/r;", "LE1/q;", "height", "E", "(LE1/r;LE1/q;I)I", "width", "I", "P", "w", "Lr1/c;", "z", "(Lr1/c;)V", "n", "Ljava/lang/String;", "o", "LN1/Y;", "p", "LS1/m$b;", "q", "r", "Z", "s", "t", "u", "Lp1/y0;", "", "LE1/a;", "v", "Ljava/util/Map;", "getBaselineCache$annotations", "baselineCache", "LG0/f;", "_layoutCache", "Lkotlin/Function1;", "", "LN1/P;", "x", "LnI/l;", "semanticsTextLayoutResult", "LG0/k$a;", "y", "LG0/k$a;", "textSubstitution", "L2", "()LG0/f;", "layoutCache", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k extends d.c implements B, r, w0 {

    /* renamed from: n  reason: collision with root package name */
    private String f6178n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public Y f6179o;

    /* renamed from: p  reason: collision with root package name */
    private C4820m.b f6180p;

    /* renamed from: q  reason: collision with root package name */
    private int f6181q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f6182r;

    /* renamed from: s  reason: collision with root package name */
    private int f6183s;

    /* renamed from: t  reason: collision with root package name */
    private int f6184t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public C5753y0 f6185u;

    /* renamed from: v  reason: collision with root package name */
    private Map<C4468a, Integer> f6186v;

    /* renamed from: w  reason: collision with root package name */
    private f f6187w;

    /* renamed from: x  reason: collision with root package name */
    private C17642l<? super List<P>, Boolean> f6188x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public a f6189y;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "LN1/P;", "textLayoutResult", "", "a", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<List<P>, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f6194c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(k kVar) {
            super(1);
            this.f6194c = kVar;
        }

        /* renamed from: a */
        public final Boolean invoke(List<P> list) {
            f D22 = this.f6194c.L2();
            Y F22 = this.f6194c.f6179o;
            C5753y0 E22 = this.f6194c.f6185u;
            P o10 = D22.o(Y.L(F22, E22 != null ? E22.a() : C5747v0.f27350b.i(), 0, (C) null, (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (Y1.a) null, (o) null, (U1.e) null, 0, (Y1.k) null, (g1) null, (g) null, 0, 0, 0, (q) null, (h) null, 0, 0, (E) null, (s) null, 16777214, (Object) null));
            if (o10 != null) {
                list.add(o10);
            } else {
                o10 = null;
            }
            return Boolean.valueOf(o10 != null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LN1/d;", "updatedText", "", "a", "(LN1/d;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17642l<C4669d, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f6195c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(k kVar) {
            super(1);
            this.f6195c = kVar;
        }

        /* renamed from: a */
        public final Boolean invoke(C4669d dVar) {
            boolean unused = this.f6195c.O2(dVar.j());
            this.f6195c.N2();
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17642l<Boolean, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f6196c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(k kVar) {
            super(1);
            this.f6196c = kVar;
        }

        public final Boolean a(boolean z10) {
            if (this.f6196c.f6189y == null) {
                return Boolean.FALSE;
            }
            a G22 = this.f6196c.f6189y;
            if (G22 != null) {
                G22.e(z10);
            }
            this.f6196c.N2();
            return Boolean.TRUE;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends C17544u implements C17631a<Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f6197c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(k kVar) {
            super(0);
            this.f6197c = kVar;
        }

        public final Boolean invoke() {
            this.f6197c.J2();
            this.f6197c.N2();
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a0 f6198c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a0 a0Var) {
            super(1);
            this.f6198c = a0Var;
        }

        public final void a(a0.a aVar) {
            a0.a.i(aVar, this.f6198c, 0, 0, 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    public /* synthetic */ k(String str, Y y10, C4820m.b bVar, int i10, boolean z10, int i11, int i12, C5753y0 y0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, y10, bVar, i10, z10, i11, i12, y0Var);
    }

    /* access modifiers changed from: private */
    public final void J2() {
        this.f6189y = null;
    }

    /* access modifiers changed from: private */
    public final f L2() {
        if (this.f6187w == null) {
            this.f6187w = new f(this.f6178n, this.f6179o, this.f6180p, this.f6181q, this.f6182r, this.f6183s, this.f6184t, (DefaultConstructorMarker) null);
        }
        f fVar = this.f6187w;
        C17542s.g(fVar);
        return fVar;
    }

    private final f M2(c2.d dVar) {
        f a10;
        a aVar = this.f6189y;
        if (aVar == null || !aVar.c() || (a10 = aVar.a()) == null) {
            f L22 = L2();
            L22.m(dVar);
            return L22;
        }
        a10.m(dVar);
        return a10;
    }

    /* access modifiers changed from: private */
    public final void N2() {
        x0.b(this);
        G1.E.b(this);
        C4515s.a(this);
    }

    /* access modifiers changed from: private */
    public final boolean O2(String str) {
        C16807N n10;
        a aVar = this.f6189y;
        if (aVar == null) {
            a aVar2 = new a(this.f6178n, str, false, (f) null, 12, (DefaultConstructorMarker) null);
            f fVar = new f(str, this.f6179o, this.f6180p, this.f6181q, this.f6182r, this.f6183s, this.f6184t, (DefaultConstructorMarker) null);
            fVar.m(L2().a());
            aVar2.d(fVar);
            this.f6189y = aVar2;
            return true;
        } else if (C17542s.e(str, aVar.b())) {
            return false;
        } else {
            aVar.f(str);
            f a10 = aVar.a();
            if (a10 != null) {
                a10.p(str, this.f6179o, this.f6180p, this.f6181q, this.f6182r, this.f6183s, this.f6184t);
                n10 = C16807N.f139792a;
            } else {
                n10 = null;
            }
            return n10 != null;
        }
    }

    public int E(E1.r rVar, C4484q qVar, int i10) {
        return M2(rVar).k(rVar.getLayoutDirection());
    }

    public int I(E1.r rVar, C4484q qVar, int i10) {
        return M2(rVar).f(i10, rVar.getLayoutDirection());
    }

    public final void K2(boolean z10, boolean z11, boolean z12) {
        if (z11 || z12) {
            L2().p(this.f6178n, this.f6179o, this.f6180p, this.f6181q, this.f6182r, this.f6183s, this.f6184t);
        }
        if (j2()) {
            if (z11 || (z10 && this.f6188x != null)) {
                x0.b(this);
            }
            if (z11 || z12) {
                G1.E.b(this);
                C4515s.a(this);
            }
            if (z10) {
                C4515s.a(this);
            }
        }
    }

    public int P(E1.r rVar, C4484q qVar, int i10) {
        return M2(rVar).j(rVar.getLayoutDirection());
    }

    public final boolean P2(C5753y0 y0Var, Y y10) {
        boolean e10 = C17542s.e(y0Var, this.f6185u);
        this.f6185u = y0Var;
        return !e10 || !y10.F(this.f6179o);
    }

    public final boolean Q2(Y y10, int i10, int i11, boolean z10, C4820m.b bVar, int i12) {
        boolean z11 = !this.f6179o.G(y10);
        this.f6179o = y10;
        if (this.f6184t != i10) {
            this.f6184t = i10;
            z11 = true;
        }
        if (this.f6183s != i11) {
            this.f6183s = i11;
            z11 = true;
        }
        if (this.f6182r != z10) {
            this.f6182r = z10;
            z11 = true;
        }
        if (!C17542s.e(this.f6180p, bVar)) {
            this.f6180p = bVar;
            z11 = true;
        }
        if (t.e(this.f6181q, i12)) {
            return z11;
        }
        this.f6181q = i12;
        return true;
    }

    public final boolean R2(String str) {
        if (C17542s.e(this.f6178n, str)) {
            return false;
        }
        this.f6178n = str;
        J2();
        return true;
    }

    public J h(K k10, H h10, long j10) {
        f M22 = M2(k10);
        boolean h11 = M22.h(j10, k10.getLayoutDirection());
        M22.d();
        C4683s e10 = M22.e();
        C17542s.g(e10);
        long c10 = M22.c();
        if (h11) {
            G1.E.a(this);
            Map<C4468a, Integer> map = this.f6186v;
            if (map == null) {
                map = new LinkedHashMap<>(2);
            }
            map.put(C4469b.a(), Integer.valueOf(Math.round(e10.l())));
            map.put(C4469b.b(), Integer.valueOf(Math.round(e10.x())));
            this.f6186v = map;
        }
        a0 i02 = h10.i0(C5267b.f23024b.b(c2.r.h(c10), c2.r.h(c10), c2.r.g(c10), c2.r.g(c10)));
        int h12 = c2.r.h(c10);
        int g10 = c2.r.g(c10);
        Map<C4468a, Integer> map2 = this.f6186v;
        C17542s.g(map2);
        return k10.I0(h12, g10, map2, new f(i02));
    }

    public void m0(x xVar) {
        C17642l lVar = this.f6188x;
        if (lVar == null) {
            lVar = new b(this);
            this.f6188x = lVar;
        }
        v.s0(xVar, new C4669d(this.f6178n, (List) null, (List) null, 6, (DefaultConstructorMarker) null));
        a aVar = this.f6189y;
        if (aVar != null) {
            v.p0(xVar, aVar.c());
            v.w0(xVar, new C4669d(aVar.b(), (List) null, (List) null, 6, (DefaultConstructorMarker) null));
        }
        v.y0(xVar, (String) null, new c(this), 1, (Object) null);
        v.E0(xVar, (String) null, new d(this), 1, (Object) null);
        v.d(xVar, (String) null, new e(this), 1, (Object) null);
        v.u(xVar, (String) null, lVar, 1, (Object) null);
    }

    public int w(E1.r rVar, C4484q qVar, int i10) {
        return M2(rVar).f(i10, rVar.getLayoutDirection());
    }

    public void z(C5817c cVar) {
        if (j2()) {
            f M22 = M2(cVar);
            C4683s e10 = M22.e();
            if (e10 != null) {
                C5732n0 e11 = cVar.I1().e();
                boolean b10 = M22.b();
                if (b10) {
                    e11.t();
                    C5732n0.g(e11, 0.0f, 0.0f, (float) c2.r.h(M22.c()), (float) c2.r.g(M22.c()), 0, 16, (Object) null);
                }
                try {
                    Y1.k A10 = this.f6179o.A();
                    if (A10 == null) {
                        A10 = Y1.k.f14792b.c();
                    }
                    Y1.k kVar = A10;
                    g1 x10 = this.f6179o.x();
                    if (x10 == null) {
                        x10 = g1.f27310d.a();
                    }
                    g1 g1Var = x10;
                    g i10 = this.f6179o.i();
                    if (i10 == null) {
                        i10 = j.f28627a;
                    }
                    g gVar = i10;
                    C5728l0 g10 = this.f6179o.g();
                    if (g10 != null) {
                        C4683s.q(e10, e11, g10, this.f6179o.d(), g1Var, kVar, gVar, 0, 64, (Object) null);
                    } else {
                        C5753y0 y0Var = this.f6185u;
                        long a10 = y0Var != null ? y0Var.a() : C5747v0.f27350b.i();
                        if (a10 == 16) {
                            a10 = this.f6179o.h() != 16 ? this.f6179o.h() : C5747v0.f27350b.a();
                        }
                        C4683s.g(e10, e11, a10, g1Var, kVar, gVar, 0, 32, (Object) null);
                    }
                } finally {
                    if (b10) {
                        e11.n();
                    }
                }
            } else {
                throw new IllegalArgumentException(("no paragraph (layoutCache=" + this.f6187w + ", textSubstitution=" + this.f6189y + ')').toString());
            }
        }
    }

    private k(String str, Y y10, C4820m.b bVar, int i10, boolean z10, int i11, int i12, C5753y0 y0Var) {
        this.f6178n = str;
        this.f6179o = y10;
        this.f6180p = bVar;
        this.f6181q = i10;
        this.f6182r = z10;
        this.f6183s = i11;
        this.f6184t = i12;
        this.f6185u = y0Var;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0015\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0013\u0010 \"\u0004\b\u001e\u0010!¨\u0006\""}, d2 = {"LG0/k$a;", "", "", "original", "substitution", "", "isShowingSubstitution", "LG0/f;", "layoutCache", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLG0/f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getOriginal", "b", "f", "(Ljava/lang/String;)V", "c", "Z", "()Z", "e", "(Z)V", "d", "LG0/f;", "()LG0/f;", "(LG0/f;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f6190a;

        /* renamed from: b  reason: collision with root package name */
        private String f6191b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f6192c;

        /* renamed from: d  reason: collision with root package name */
        private f f6193d;

        public a(String str, String str2, boolean z10, f fVar) {
            this.f6190a = str;
            this.f6191b = str2;
            this.f6192c = z10;
            this.f6193d = fVar;
        }

        public final f a() {
            return this.f6193d;
        }

        public final String b() {
            return this.f6191b;
        }

        public final boolean c() {
            return this.f6192c;
        }

        public final void d(f fVar) {
            this.f6193d = fVar;
        }

        public final void e(boolean z10) {
            this.f6192c = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f6190a, aVar.f6190a) && C17542s.e(this.f6191b, aVar.f6191b) && this.f6192c == aVar.f6192c && C17542s.e(this.f6193d, aVar.f6193d);
        }

        public final void f(String str) {
            this.f6191b = str;
        }

        public int hashCode() {
            int hashCode = ((((this.f6190a.hashCode() * 31) + this.f6191b.hashCode()) * 31) + Boolean.hashCode(this.f6192c)) * 31;
            f fVar = this.f6193d;
            return hashCode + (fVar == null ? 0 : fVar.hashCode());
        }

        public String toString() {
            return "TextSubstitution(layoutCache=" + this.f6193d + ", isShowingSubstitution=" + this.f6192c + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(String str, String str2, boolean z10, f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : fVar);
        }
    }
}
