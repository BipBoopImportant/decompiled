package androidx.compose.ui.graphics;

import E1.H;
import E1.J;
import E1.K;
import E1.a0;
import G1.B;
import G1.C4498c0;
import G1.C4502e0;
import G1.C4508k;
import XH.C16807N;
import androidx.compose.ui.d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import p1.C5747v0;
import p1.d1;
import p1.i1;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010&\u001a\u00020%*\u00020 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b0\u0010,\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R\"\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b3\u0010,\u001a\u0004\b4\u0010-\"\u0004\b5\u0010/R\"\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b6\u0010,\u001a\u0004\b7\u0010-\"\u0004\b0\u0010/R\"\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b8\u0010,\u001a\u0004\b9\u0010-\"\u0004\b:\u0010/R\"\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b;\u0010,\u001a\u0004\b<\u0010-\"\u0004\b=\u0010/R\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b>\u0010,\u001a\u0004\b?\u0010-\"\u0004\b@\u0010/R\"\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bA\u0010,\u001a\u0004\b;\u0010-\"\u0004\bB\u0010/R\"\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bC\u0010,\u001a\u0004\bD\u0010-\"\u0004\bE\u0010/R\"\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bF\u0010,\u001a\u0004\bG\u0010-\"\u0004\bH\u0010/R(\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bG\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bT\u0010R\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR(\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bW\u0010J\u001a\u0004\bY\u0010L\"\u0004\bC\u0010NR(\u0010\u0018\u001a\u00020\u00168\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bK\u0010J\u001a\u0004\bZ\u0010L\"\u0004\b[\u0010NR(\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b8\u0010_R\"\u0010d\u001a\u000e\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u001d0`8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bb\u0010cR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010e\u001a\u0004\bf\u0010g\"\u0004\b+\u0010hR\u0014\u0010j\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\bi\u0010V\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006k"}, d2 = {"Landroidx/compose/ui/graphics/e;", "LG1/B;", "Landroidx/compose/ui/d$c;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/f;", "transformOrigin", "Lp1/i1;", "shape", "", "clip", "Lp1/d1;", "renderEffect", "Lp1/v0;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/a;", "compositingStrategy", "<init>", "(FFFFFFFFFFJLp1/i1;ZLp1/d1;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "LXH/N;", "L2", "()V", "LE1/K;", "LE1/H;", "measurable", "Lc2/b;", "constraints", "LE1/J;", "h", "(LE1/K;LE1/H;J)LE1/J;", "", "toString", "()Ljava/lang/String;", "n", "F", "()F", "g", "(F)V", "o", "Q", "m", "p", "D2", "d", "q", "M", "r", "L", "e", "s", "I2", "G", "t", "N", "j", "u", "k", "v", "f", "l", "w", "y", "i", "x", "J", "B", "()J", "L0", "(J)V", "Lp1/i1;", "J2", "()Lp1/i1;", "Z", "(Lp1/i1;)V", "z", "F2", "()Z", "A", "(Z)V", "E2", "K2", "C", "I", "G2", "()I", "(I)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "D", "LnI/l;", "layerBlock", "Lp1/d1;", "H2", "()Lp1/d1;", "(Lp1/d1;)V", "h2", "shouldAutoInvalidate", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class e extends d.c implements B {

    /* renamed from: A  reason: collision with root package name */
    private long f18927A;

    /* renamed from: B  reason: collision with root package name */
    private long f18928B;

    /* renamed from: C  reason: collision with root package name */
    private int f18929C;
    /* access modifiers changed from: private */

    /* renamed from: D  reason: collision with root package name */
    public C17642l<? super c, C16807N> f18930D;

    /* renamed from: n  reason: collision with root package name */
    private float f18931n;

    /* renamed from: o  reason: collision with root package name */
    private float f18932o;

    /* renamed from: p  reason: collision with root package name */
    private float f18933p;

    /* renamed from: q  reason: collision with root package name */
    private float f18934q;

    /* renamed from: r  reason: collision with root package name */
    private float f18935r;

    /* renamed from: s  reason: collision with root package name */
    private float f18936s;

    /* renamed from: t  reason: collision with root package name */
    private float f18937t;

    /* renamed from: u  reason: collision with root package name */
    private float f18938u;

    /* renamed from: v  reason: collision with root package name */
    private float f18939v;

    /* renamed from: w  reason: collision with root package name */
    private float f18940w;

    /* renamed from: x  reason: collision with root package name */
    private long f18941x;

    /* renamed from: y  reason: collision with root package name */
    private i1 f18942y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f18943z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/c;", "LXH/N;", "a", "(Landroidx/compose/ui/graphics/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<c, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f18944c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar) {
            super(1);
            this.f18944c = eVar;
        }

        public final void a(c cVar) {
            cVar.g(this.f18944c.F());
            cVar.m(this.f18944c.Q());
            cVar.d(this.f18944c.D2());
            cVar.o(this.f18944c.M());
            cVar.e(this.f18944c.L());
            cVar.G(this.f18944c.I2());
            cVar.j(this.f18944c.N());
            cVar.k(this.f18944c.s());
            cVar.l(this.f18944c.f());
            cVar.i(this.f18944c.y());
            cVar.L0(this.f18944c.B());
            cVar.Z(this.f18944c.J2());
            cVar.A(this.f18944c.F2());
            this.f18944c.H2();
            cVar.n((d1) null);
            cVar.v(this.f18944c.E2());
            cVar.C(this.f18944c.K2());
            cVar.r(this.f18944c.G2());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((c) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a0 f18945c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f18946d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a0 a0Var, e eVar) {
            super(1);
            this.f18945c = a0Var;
            this.f18946d = eVar;
        }

        public final void a(a0.a aVar) {
            a0.a.w(aVar, this.f18945c, 0, 0, 0.0f, this.f18946d.f18930D, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    public /* synthetic */ e(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, i1 i1Var, boolean z10, d1 d1Var, long j11, long j12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, i1Var, z10, d1Var, j11, j12, i10);
    }

    public final void A(boolean z10) {
        this.f18943z = z10;
    }

    public final long B() {
        return this.f18941x;
    }

    public final void C(long j10) {
        this.f18928B = j10;
    }

    public final float D2() {
        return this.f18933p;
    }

    public final long E2() {
        return this.f18927A;
    }

    public final float F() {
        return this.f18931n;
    }

    public final boolean F2() {
        return this.f18943z;
    }

    public final void G(float f10) {
        this.f18936s = f10;
    }

    public final int G2() {
        return this.f18929C;
    }

    public final d1 H2() {
        return null;
    }

    public final float I2() {
        return this.f18936s;
    }

    public final i1 J2() {
        return this.f18942y;
    }

    public final long K2() {
        return this.f18928B;
    }

    public final float L() {
        return this.f18935r;
    }

    public final void L0(long j10) {
        this.f18941x = j10;
    }

    public final void L2() {
        C4498c0 J22 = C4508k.h(this, C4502e0.a(2)).J2();
        if (J22 != null) {
            J22.y3(this.f18930D, true);
        }
    }

    public final float M() {
        return this.f18934q;
    }

    public final float N() {
        return this.f18937t;
    }

    public final float Q() {
        return this.f18932o;
    }

    public final void Z(i1 i1Var) {
        this.f18942y = i1Var;
    }

    public final void d(float f10) {
        this.f18933p = f10;
    }

    public final void e(float f10) {
        this.f18935r = f10;
    }

    public final float f() {
        return this.f18939v;
    }

    public final void g(float f10) {
        this.f18931n = f10;
    }

    public J h(K k10, H h10, long j10) {
        a0 i02 = h10.i0(j10);
        return K.v0(k10, i02.E0(), i02.z0(), (Map) null, new b(i02, this), 4, (Object) null);
    }

    public boolean h2() {
        return false;
    }

    public final void i(float f10) {
        this.f18940w = f10;
    }

    public final void j(float f10) {
        this.f18937t = f10;
    }

    public final void k(float f10) {
        this.f18938u = f10;
    }

    public final void l(float f10) {
        this.f18939v = f10;
    }

    public final void m(float f10) {
        this.f18932o = f10;
    }

    public final void n(d1 d1Var) {
    }

    public final void o(float f10) {
        this.f18934q = f10;
    }

    public final void r(int i10) {
        this.f18929C = i10;
    }

    public final float s() {
        return this.f18938u;
    }

    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.f18931n + ", scaleY=" + this.f18932o + ", alpha = " + this.f18933p + ", translationX=" + this.f18934q + ", translationY=" + this.f18935r + ", shadowElevation=" + this.f18936s + ", rotationX=" + this.f18937t + ", rotationY=" + this.f18938u + ", rotationZ=" + this.f18939v + ", cameraDistance=" + this.f18940w + ", transformOrigin=" + f.i(this.f18941x) + ", shape=" + this.f18942y + ", clip=" + this.f18943z + ", renderEffect=" + null + ", ambientShadowColor=" + C5747v0.x(this.f18927A) + ", spotShadowColor=" + C5747v0.x(this.f18928B) + ", compositingStrategy=" + a.g(this.f18929C) + ')';
    }

    public final void v(long j10) {
        this.f18927A = j10;
    }

    public final float y() {
        return this.f18940w;
    }

    private e(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, i1 i1Var, boolean z10, d1 d1Var, long j11, long j12, int i10) {
        this.f18931n = f10;
        this.f18932o = f11;
        this.f18933p = f12;
        this.f18934q = f13;
        this.f18935r = f14;
        this.f18936s = f15;
        this.f18937t = f16;
        this.f18938u = f17;
        this.f18939v = f18;
        this.f18940w = f19;
        this.f18941x = j10;
        this.f18942y = i1Var;
        this.f18943z = z10;
        this.f18927A = j11;
        this.f18928B = j12;
        this.f18929C = i10;
        this.f18930D = new a(this);
    }
}
