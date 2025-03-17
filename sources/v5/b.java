package V5;

import E1.C4478k;
import E1.C4484q;
import E1.H;
import E1.J;
import E1.K;
import E1.a0;
import E1.h0;
import E1.i0;
import G1.B;
import G1.r;
import G1.w0;
import L1.i;
import L1.v;
import L1.x;
import U5.e;
import U5.j;
import XH.C16807N;
import androidx.compose.ui.d;
import c2.C5267b;
import c2.c;
import c2.n;
import i1.C5437c;
import java.util.Map;
import kotlin.Metadata;
import o1.C5673m;
import o1.C5674n;
import p1.C5749w0;
import pI.C17752b;
import r1.C5817c;
import r1.h;
import t1.C5942c;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u0006\b!\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BE\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u0018J#\u0010 \u001a\u00020\u001f*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J#\u0010&\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b(\u0010'J#\u0010*\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b*\u0010'J#\u0010+\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b+\u0010'J\u0013\u0010.\u001a\u00020-*\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0013\u00101\u001a\u00020-*\u000200H\u0016¢\u0006\u0004\b1\u00102R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0014\u0010`\u001a\u00020]8&X¦\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0014\u0010b\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\ba\u0010N¨\u0006c"}, d2 = {"LV5/b;", "Landroidx/compose/ui/d$c;", "LG1/r;", "LG1/B;", "LG1/w0;", "Li1/c;", "alignment", "LE1/k;", "contentScale", "", "alpha", "Lp1/w0;", "colorFilter", "", "clipToBounds", "", "contentDescription", "LU5/j;", "constraintSizeResolver", "<init>", "(Li1/c;LE1/k;FLp1/w0;ZLjava/lang/String;LU5/j;)V", "Lo1/m;", "dstSize", "D2", "(J)J", "Lc2/b;", "constraints", "I2", "LE1/K;", "LE1/H;", "measurable", "LE1/J;", "h", "(LE1/K;LE1/H;J)LE1/J;", "LE1/r;", "LE1/q;", "", "height", "E", "(LE1/r;LE1/q;I)I", "P", "width", "I", "w", "Lr1/c;", "LXH/N;", "z", "(Lr1/c;)V", "LL1/x;", "m0", "(LL1/x;)V", "n", "Li1/c;", "getAlignment", "()Li1/c;", "J2", "(Li1/c;)V", "o", "LE1/k;", "getContentScale", "()LE1/k;", "O2", "(LE1/k;)V", "p", "F", "getAlpha", "()F", "d", "(F)V", "q", "Lp1/w0;", "getColorFilter", "()Lp1/w0;", "L2", "(Lp1/w0;)V", "r", "Z", "getClipToBounds", "()Z", "K2", "(Z)V", "s", "Ljava/lang/String;", "F2", "()Ljava/lang/String;", "N2", "(Ljava/lang/String;)V", "t", "LU5/j;", "E2", "()LU5/j;", "M2", "(LU5/j;)V", "Lt1/c;", "G2", "()Lt1/c;", "painter", "h2", "shouldAutoInvalidate", "coil-compose-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b extends d.c implements r, B, w0 {

    /* renamed from: n  reason: collision with root package name */
    private C5437c f40429n;

    /* renamed from: o  reason: collision with root package name */
    private C4478k f40430o;

    /* renamed from: p  reason: collision with root package name */
    private float f40431p;

    /* renamed from: q  reason: collision with root package name */
    private C5749w0 f40432q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f40433r;

    /* renamed from: s  reason: collision with root package name */
    private String f40434s;

    /* renamed from: t  reason: collision with root package name */
    private j f40435t;

    public b(C5437c cVar, C4478k kVar, float f10, C5749w0 w0Var, boolean z10, String str, j jVar) {
        this.f40429n = cVar;
        this.f40430o = kVar;
        this.f40431p = f10;
        this.f40432q = w0Var;
        this.f40433r = z10;
        this.f40434s = str;
        this.f40435t = jVar;
    }

    private final long D2(long j10) {
        if (C5673m.n(j10)) {
            return C5673m.f26722b.b();
        }
        long h10 = G2().h();
        if (h10 == 9205357640488583168L) {
            return j10;
        }
        float l10 = C5673m.l(h10);
        if (Float.isInfinite(l10) || Float.isNaN(l10)) {
            l10 = C5673m.l(j10);
        }
        float i10 = C5673m.i(h10);
        if (Float.isInfinite(i10) || Float.isNaN(i10)) {
            i10 = C5673m.i(j10);
        }
        long a10 = C5674n.a(l10, i10);
        long a11 = this.f40430o.a(a10, j10);
        float c10 = h0.c(a11);
        if (Float.isInfinite(c10) || Float.isNaN(c10)) {
            return j10;
        }
        float d10 = h0.d(a11);
        return (Float.isInfinite(d10) || Float.isNaN(d10)) ? j10 : i0.e(a11, a10);
    }

    /* access modifiers changed from: private */
    public static final C16807N H2(a0 a0Var, a0.a aVar) {
        a0.a.m(aVar, a0Var, 0, 0, 0.0f, 4, (Object) null);
        return C16807N.f139792a;
    }

    private final long I2(long j10) {
        float f10;
        float f11;
        int m10;
        boolean j11 = C5267b.j(j10);
        boolean i10 = C5267b.i(j10);
        if (j11 && i10) {
            return j10;
        }
        C5942c G22 = G2();
        boolean z10 = C5267b.h(j10) && C5267b.g(j10);
        long h10 = G22.h();
        if (h10 != 9205357640488583168L) {
            if (!z10 || (!j11 && !i10)) {
                float l10 = C5673m.l(h10);
                float i11 = C5673m.i(h10);
                f11 = (Float.isInfinite(l10) || Float.isNaN(l10)) ? (float) C5267b.n(j10) : l.d(j10, l10);
                if (Float.isInfinite(i11) || Float.isNaN(i11)) {
                    m10 = C5267b.m(j10);
                } else {
                    f10 = l.c(j10, i11);
                    long D22 = D2(C5674n.a(f11, f10));
                    return C5267b.d(j10, c.i(j10, C17752b.e(C5673m.l(D22))), 0, c.h(j10, C17752b.e(C5673m.i(D22))), 0, 10, (Object) null);
                }
            } else {
                f11 = (float) C5267b.l(j10);
                m10 = C5267b.k(j10);
            }
            f10 = (float) m10;
            long D222 = D2(C5674n.a(f11, f10));
            return C5267b.d(j10, c.i(j10, C17752b.e(C5673m.l(D222))), 0, c.h(j10, C17752b.e(C5673m.i(D222))), 0, 10, (Object) null);
        } else if (!z10) {
            return j10;
        } else {
            if ((G22 instanceof e) && ((e) G22).u().getValue().a() == null) {
                return j10;
            }
            return C5267b.d(j10, C5267b.l(j10), 0, C5267b.k(j10), 0, 10, (Object) null);
        }
    }

    public int E(E1.r rVar, C4484q qVar, int i10) {
        long b10 = c.b(0, 0, 0, i10, 7, (Object) null);
        j jVar = this.f40435t;
        if (jVar != null) {
            jVar.B(b10);
        }
        if (G2().h() == 9205357640488583168L) {
            return qVar.g0(i10);
        }
        long I22 = I2(b10);
        return Math.max(C5267b.n(I22), qVar.g0(i10));
    }

    public final j E2() {
        return this.f40435t;
    }

    public final String F2() {
        return this.f40434s;
    }

    public abstract C5942c G2();

    public int I(E1.r rVar, C4484q qVar, int i10) {
        long b10 = c.b(0, i10, 0, 0, 13, (Object) null);
        j jVar = this.f40435t;
        if (jVar != null) {
            jVar.B(b10);
        }
        if (G2().h() == 9205357640488583168L) {
            return qVar.V(i10);
        }
        long I22 = I2(b10);
        return Math.max(C5267b.m(I22), qVar.V(i10));
    }

    public final void J2(C5437c cVar) {
        this.f40429n = cVar;
    }

    public final void K2(boolean z10) {
        this.f40433r = z10;
    }

    public final void L2(C5749w0 w0Var) {
        this.f40432q = w0Var;
    }

    public final void M2(j jVar) {
        this.f40435t = jVar;
    }

    public final void N2(String str) {
        this.f40434s = str;
    }

    public final void O2(C4478k kVar) {
        this.f40430o = kVar;
    }

    public int P(E1.r rVar, C4484q qVar, int i10) {
        long b10 = c.b(0, 0, 0, i10, 7, (Object) null);
        j jVar = this.f40435t;
        if (jVar != null) {
            jVar.B(b10);
        }
        if (G2().h() == 9205357640488583168L) {
            return qVar.h0(i10);
        }
        long I22 = I2(b10);
        return Math.max(C5267b.n(I22), qVar.h0(i10));
    }

    public final void d(float f10) {
        this.f40431p = f10;
    }

    public J h(K k10, H h10, long j10) {
        j jVar = this.f40435t;
        if (jVar != null) {
            jVar.B(j10);
        }
        a0 i02 = h10.i0(I2(j10));
        return K.v0(k10, i02.E0(), i02.z0(), (Map) null, new a(i02), 4, (Object) null);
    }

    public boolean h2() {
        return false;
    }

    public void m0(x xVar) {
        String str = this.f40434s;
        if (str != null) {
            v.d0(xVar, str);
            v.l0(xVar, i.f8936b.d());
        }
    }

    public int w(E1.r rVar, C4484q qVar, int i10) {
        long b10 = c.b(0, i10, 0, 0, 13, (Object) null);
        j jVar = this.f40435t;
        if (jVar != null) {
            jVar.B(b10);
        }
        if (G2().h() == 9205357640488583168L) {
            return qVar.x(i10);
        }
        long I22 = I2(b10);
        return Math.max(C5267b.m(I22), qVar.x(i10));
    }

    public void z(C5817c cVar) {
        long D22 = D2(cVar.b());
        long a10 = this.f40429n.a(l.o(D22), l.o(cVar.b()), cVar.getLayoutDirection());
        int h10 = n.h(a10);
        int i10 = n.i(a10);
        r1.d I12 = cVar.I1();
        long b10 = I12.b();
        I12.e().t();
        try {
            h c10 = I12.c();
            if (this.f40433r) {
                h.i(c10, 0.0f, 0.0f, 0.0f, 0.0f, 0, 31, (Object) null);
            }
            c10.d((float) h10, (float) i10);
            G2().g(cVar, D22, this.f40431p, this.f40432q);
            I12.e().n();
            I12.g(b10);
            cVar.V1();
        } catch (Throwable th2) {
            I12.e().n();
            I12.g(b10);
            throw th2;
        }
    }
}
