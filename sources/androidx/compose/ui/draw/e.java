package androidx.compose.ui.draw;

import E1.C4478k;
import E1.C4484q;
import E1.H;
import E1.J;
import E1.K;
import E1.a0;
import E1.i0;
import G1.B;
import G1.r;
import XH.C16807N;
import androidx.compose.ui.d;
import c2.C5267b;
import c2.c;
import c2.n;
import c2.s;
import i1.C5437c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import o1.C5673m;
import o1.C5674n;
import p1.C5749w0;
import r1.C5817c;
import t1.C5942c;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b+\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0015J\u0016\u0010\u0019\u001a\u00020\u0006*\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\u00020\u0006*\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ&\u0010 \u001a\u00020\u001f*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!J#\u0010&\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b(\u0010'J#\u0010*\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b*\u0010'J#\u0010+\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b+\u0010'J\u0013\u0010.\u001a\u00020-*\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\bW\u0010<R\u0014\u0010Z\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\bY\u0010<\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006["}, d2 = {"Landroidx/compose/ui/draw/e;", "LG1/B;", "Landroidx/compose/ui/d$c;", "LG1/r;", "Lt1/c;", "painter", "", "sizeToIntrinsics", "Li1/c;", "alignment", "LE1/k;", "contentScale", "", "alpha", "Lp1/w0;", "colorFilter", "<init>", "(Lt1/c;ZLi1/c;LE1/k;FLp1/w0;)V", "Lo1/m;", "dstSize", "C2", "(J)J", "Lc2/b;", "constraints", "I2", "H2", "(J)Z", "G2", "LE1/K;", "LE1/H;", "measurable", "LE1/J;", "h", "(LE1/K;LE1/H;J)LE1/J;", "LE1/r;", "LE1/q;", "", "height", "E", "(LE1/r;LE1/q;I)I", "P", "width", "I", "w", "Lr1/c;", "LXH/N;", "z", "(Lr1/c;)V", "", "toString", "()Ljava/lang/String;", "n", "Lt1/c;", "D2", "()Lt1/c;", "M2", "(Lt1/c;)V", "o", "Z", "E2", "()Z", "N2", "(Z)V", "p", "Li1/c;", "getAlignment", "()Li1/c;", "J2", "(Li1/c;)V", "q", "LE1/k;", "getContentScale", "()LE1/k;", "L2", "(LE1/k;)V", "r", "F", "getAlpha", "()F", "d", "(F)V", "s", "Lp1/w0;", "getColorFilter", "()Lp1/w0;", "K2", "(Lp1/w0;)V", "F2", "useIntrinsicSize", "h2", "shouldAutoInvalidate", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class e extends d.c implements B, r {

    /* renamed from: n  reason: collision with root package name */
    private C5942c f18787n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f18788o;

    /* renamed from: p  reason: collision with root package name */
    private C5437c f18789p;

    /* renamed from: q  reason: collision with root package name */
    private C4478k f18790q;

    /* renamed from: r  reason: collision with root package name */
    private float f18791r;

    /* renamed from: s  reason: collision with root package name */
    private C5749w0 f18792s;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a0 f18793c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(a0 a0Var) {
            super(1);
            this.f18793c = a0Var;
        }

        public final void a(a0.a aVar) {
            a0.a.m(aVar, this.f18793c, 0, 0, 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    public e(C5942c cVar, boolean z10, C5437c cVar2, C4478k kVar, float f10, C5749w0 w0Var) {
        this.f18787n = cVar;
        this.f18788o = z10;
        this.f18789p = cVar2;
        this.f18790q = kVar;
        this.f18791r = f10;
        this.f18792s = w0Var;
    }

    private final long C2(long j10) {
        if (!F2()) {
            return j10;
        }
        long a10 = C5674n.a(!H2(this.f18787n.h()) ? C5673m.l(j10) : C5673m.l(this.f18787n.h()), !G2(this.f18787n.h()) ? C5673m.i(j10) : C5673m.i(this.f18787n.h()));
        return (C5673m.l(j10) == 0.0f || C5673m.i(j10) == 0.0f) ? C5673m.f26722b.b() : i0.d(a10, this.f18790q.a(a10, j10));
    }

    private final boolean F2() {
        return this.f18788o && this.f18787n.h() != 9205357640488583168L;
    }

    private final boolean G2(long j10) {
        if (!C5673m.h(j10, C5673m.f26722b.a())) {
            float i10 = C5673m.i(j10);
            return !Float.isInfinite(i10) && !Float.isNaN(i10);
        }
    }

    private final boolean H2(long j10) {
        if (!C5673m.h(j10, C5673m.f26722b.a())) {
            float l10 = C5673m.l(j10);
            return !Float.isInfinite(l10) && !Float.isNaN(l10);
        }
    }

    private final long I2(long j10) {
        boolean z10 = false;
        boolean z11 = C5267b.h(j10) && C5267b.g(j10);
        if (C5267b.j(j10) && C5267b.i(j10)) {
            z10 = true;
        }
        if ((F2() || !z11) && !z10) {
            long h10 = this.f18787n.h();
            long C22 = C2(C5674n.a((float) c.i(j10, H2(h10) ? Math.round(C5673m.l(h10)) : C5267b.n(j10)), (float) c.h(j10, G2(h10) ? Math.round(C5673m.i(h10)) : C5267b.m(j10))));
            return C5267b.d(j10, c.i(j10, Math.round(C5673m.l(C22))), 0, c.h(j10, Math.round(C5673m.i(C22))), 0, 10, (Object) null);
        }
        return C5267b.d(j10, C5267b.l(j10), 0, C5267b.k(j10), 0, 10, (Object) null);
    }

    public final C5942c D2() {
        return this.f18787n;
    }

    public int E(E1.r rVar, C4484q qVar, int i10) {
        if (!F2()) {
            return qVar.g0(i10);
        }
        long I22 = I2(c.b(0, 0, 0, i10, 7, (Object) null));
        return Math.max(C5267b.n(I22), qVar.g0(i10));
    }

    public final boolean E2() {
        return this.f18788o;
    }

    public int I(E1.r rVar, C4484q qVar, int i10) {
        if (!F2()) {
            return qVar.V(i10);
        }
        long I22 = I2(c.b(0, i10, 0, 0, 13, (Object) null));
        return Math.max(C5267b.m(I22), qVar.V(i10));
    }

    public final void J2(C5437c cVar) {
        this.f18789p = cVar;
    }

    public final void K2(C5749w0 w0Var) {
        this.f18792s = w0Var;
    }

    public final void L2(C4478k kVar) {
        this.f18790q = kVar;
    }

    public final void M2(C5942c cVar) {
        this.f18787n = cVar;
    }

    public final void N2(boolean z10) {
        this.f18788o = z10;
    }

    public int P(E1.r rVar, C4484q qVar, int i10) {
        if (!F2()) {
            return qVar.h0(i10);
        }
        long I22 = I2(c.b(0, 0, 0, i10, 7, (Object) null));
        return Math.max(C5267b.n(I22), qVar.h0(i10));
    }

    public final void d(float f10) {
        this.f18791r = f10;
    }

    public J h(K k10, H h10, long j10) {
        a0 i02 = h10.i0(I2(j10));
        return K.v0(k10, i02.E0(), i02.z0(), (Map) null, new a(i02), 4, (Object) null);
    }

    public boolean h2() {
        return false;
    }

    public String toString() {
        return "PainterModifier(painter=" + this.f18787n + ", sizeToIntrinsics=" + this.f18788o + ", alignment=" + this.f18789p + ", alpha=" + this.f18791r + ", colorFilter=" + this.f18792s + ')';
    }

    public int w(E1.r rVar, C4484q qVar, int i10) {
        if (!F2()) {
            return qVar.x(i10);
        }
        long I22 = I2(c.b(0, i10, 0, 0, 13, (Object) null));
        return Math.max(C5267b.m(I22), qVar.x(i10));
    }

    /* JADX INFO: finally extract failed */
    public void z(C5817c cVar) {
        long h10 = this.f18787n.h();
        long a10 = C5674n.a(H2(h10) ? C5673m.l(h10) : C5673m.l(cVar.b()), G2(h10) ? C5673m.i(h10) : C5673m.i(cVar.b()));
        long b10 = (C5673m.l(cVar.b()) == 0.0f || C5673m.i(cVar.b()) == 0.0f) ? C5673m.f26722b.b() : i0.d(a10, this.f18790q.a(a10, cVar.b()));
        long a11 = this.f18789p.a(s.a(Math.round(C5673m.l(b10)), Math.round(C5673m.i(b10))), s.a(Math.round(C5673m.l(cVar.b())), Math.round(C5673m.i(cVar.b()))), cVar.getLayoutDirection());
        float h11 = (float) n.h(a11);
        float i10 = (float) n.i(a11);
        cVar.I1().c().d(h11, i10);
        try {
            this.f18787n.g(cVar, b10, this.f18791r, this.f18792s);
            cVar.I1().c().d(-h11, -i10);
            cVar.V1();
        } catch (Throwable th2) {
            cVar.I1().c().d(-h11, -i10);
            throw th2;
        }
    }
}
