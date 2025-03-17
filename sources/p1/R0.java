package p1;

import XH.t;
import kotlin.Metadata;
import o1.C5661a;
import o1.C5662b;
import o1.C5668h;
import o1.C5669i;
import o1.C5671k;
import o1.C5674n;
import p1.Q0;
import r1.f;
import r1.g;
import r1.j;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aN\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aN\u0010\u0012\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0017\u001a\u0013\u0010\u001b\u001a\u00020\u0015*\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001d\u001a\u00020\u0018*\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001c\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Lr1/f;", "Lp1/Q0;", "outline", "Lp1/v0;", "color", "", "alpha", "Lr1/g;", "style", "Lp1/w0;", "colorFilter", "Lp1/d0;", "blendMode", "LXH/N;", "c", "(Lr1/f;Lp1/Q0;JFLr1/g;Lp1/w0;I)V", "Lp1/l0;", "brush", "a", "(Lr1/f;Lp1/Q0;Lp1/l0;FLr1/g;Lp1/w0;I)V", "Lo1/i;", "Lo1/g;", "g", "(Lo1/i;)J", "Lo1/m;", "e", "Lo1/k;", "h", "(Lo1/k;)J", "f", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class R0 {
    public static final void a(f fVar, Q0 q02, C5728l0 l0Var, float f10, g gVar, C5749w0 w0Var, int i10) {
        U0 b10;
        Q0 q03 = q02;
        if (q03 instanceof Q0.b) {
            C5669i b11 = ((Q0.b) q03).b();
            fVar.M1(l0Var, g(b11), e(b11), f10, gVar, w0Var, i10);
            return;
        }
        if (q03 instanceof Q0.c) {
            Q0.c cVar = (Q0.c) q03;
            b10 = cVar.c();
            if (b10 == null) {
                C5671k b12 = cVar.b();
                f fVar2 = fVar;
                C5728l0 l0Var2 = l0Var;
                fVar2.Q1(l0Var2, h(b12), f(b12), C5662b.b(C5661a.d(b12.b()), 0.0f, 2, (Object) null), f10, gVar, w0Var, i10);
                return;
            }
        } else if (q03 instanceof Q0.a) {
            b10 = ((Q0.a) q03).b();
        } else {
            throw new t();
        }
        fVar.a1(b10, l0Var, f10, gVar, w0Var, i10);
    }

    public static /* synthetic */ void b(f fVar, Q0 q02, C5728l0 l0Var, float f10, g gVar, C5749w0 w0Var, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i11 & 8) != 0) {
            gVar = j.f28627a;
        }
        g gVar2 = gVar;
        if ((i11 & 16) != 0) {
            w0Var = null;
        }
        C5749w0 w0Var2 = w0Var;
        if ((i11 & 32) != 0) {
            i10 = f.f28623w0.a();
        }
        a(fVar, q02, l0Var, f11, gVar2, w0Var2, i10);
    }

    public static final void c(f fVar, Q0 q02, long j10, float f10, g gVar, C5749w0 w0Var, int i10) {
        U0 b10;
        Q0 q03 = q02;
        if (q03 instanceof Q0.b) {
            C5669i b11 = ((Q0.b) q03).b();
            fVar.F1(j10, g(b11), e(b11), f10, gVar, w0Var, i10);
            return;
        }
        if (q03 instanceof Q0.c) {
            Q0.c cVar = (Q0.c) q03;
            b10 = cVar.c();
            if (b10 == null) {
                C5671k b12 = cVar.b();
                f fVar2 = fVar;
                long j11 = j10;
                fVar2.j0(j11, h(b12), f(b12), C5662b.b(C5661a.d(b12.b()), 0.0f, 2, (Object) null), gVar, f10, w0Var, i10);
                return;
            }
        } else if (q03 instanceof Q0.a) {
            b10 = ((Q0.a) q03).b();
        } else {
            throw new t();
        }
        fVar.l1(b10, j10, f10, gVar, w0Var, i10);
    }

    public static /* synthetic */ void d(f fVar, Q0 q02, long j10, float f10, g gVar, C5749w0 w0Var, int i10, int i11, Object obj) {
        c(fVar, q02, j10, (i11 & 4) != 0 ? 1.0f : f10, (i11 & 8) != 0 ? j.f28627a : gVar, (i11 & 16) != 0 ? null : w0Var, (i11 & 32) != 0 ? f.f28623w0.a() : i10);
    }

    private static final long e(C5669i iVar) {
        return C5674n.a(iVar.t(), iVar.n());
    }

    private static final long f(C5671k kVar) {
        return C5674n.a(kVar.j(), kVar.d());
    }

    private static final long g(C5669i iVar) {
        return C5668h.a(iVar.o(), iVar.r());
    }

    private static final long h(C5671k kVar) {
        return C5668h.a(kVar.e(), kVar.g());
    }
}
