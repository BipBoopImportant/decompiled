package E1;

import G1.C4498c0;
import c2.r;
import kotlin.Metadata;
import o1.C5667g;
import o1.C5668h;
import o1.C5669i;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\t\u0010\u0003\u001a\u0011\u0010\n\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\n\u0010\u0007\u001a\u0011\u0010\u000b\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LE1/v;", "Lo1/g;", "f", "(LE1/v;)J", "g", "Lo1/i;", "b", "(LE1/v;)Lo1/i;", "c", "e", "a", "d", "(LE1/v;)LE1/v;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: E1.w  reason: case insensitive filesystem */
public final class C4489w {
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = E1.C4488v.T(r0, r4, false, 2, (java.lang.Object) null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final o1.C5669i a(E1.C4488v r4) {
        /*
            E1.v r0 = r4.k0()
            if (r0 == 0) goto L_0x000f
            r1 = 2
            r2 = 0
            r3 = 0
            o1.i r0 = E1.C4488v.T(r0, r4, r3, r1, r2)
            if (r0 != 0) goto L_0x0027
        L_0x000f:
            o1.i r0 = new o1.i
            long r1 = r4.a()
            int r1 = c2.r.h(r1)
            float r1 = (float) r1
            long r2 = r4.a()
            int r4 = c2.r.g(r2)
            float r4 = (float) r4
            r2 = 0
            r0.<init>(r2, r2, r1, r4)
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E1.C4489w.a(E1.v):o1.i");
    }

    public static final C5669i b(C4488v vVar) {
        return C4488v.T(d(vVar), vVar, false, 2, (Object) null);
    }

    public static final C5669i c(C4488v vVar) {
        C4488v d10 = d(vVar);
        float h10 = (float) r.h(d10.a());
        float g10 = (float) r.g(d10.a());
        C5669i b10 = b(vVar);
        float o10 = b10.o();
        float f10 = 0.0f;
        if (o10 < 0.0f) {
            o10 = 0.0f;
        }
        if (o10 > h10) {
            o10 = h10;
        }
        float r10 = b10.r();
        if (r10 < 0.0f) {
            r10 = 0.0f;
        }
        if (r10 > g10) {
            r10 = g10;
        }
        float p10 = b10.p();
        if (p10 < 0.0f) {
            p10 = 0.0f;
        }
        if (p10 <= h10) {
            h10 = p10;
        }
        float j10 = b10.j();
        if (j10 >= 0.0f) {
            f10 = j10;
        }
        if (f10 <= g10) {
            g10 = f10;
        }
        if (o10 == h10 || r10 == g10) {
            return C5669i.f26706e.a();
        }
        long Y10 = d10.Y(C5668h.a(o10, r10));
        long Y11 = d10.Y(C5668h.a(h10, r10));
        long Y12 = d10.Y(C5668h.a(h10, g10));
        long Y13 = d10.Y(C5668h.a(o10, g10));
        float m10 = C5667g.m(Y10);
        float m11 = C5667g.m(Y11);
        float m12 = C5667g.m(Y13);
        float m13 = C5667g.m(Y12);
        float min = Math.min(m10, Math.min(m11, Math.min(m12, m13)));
        float max = Math.max(m10, Math.max(m11, Math.max(m12, m13)));
        float n10 = C5667g.n(Y10);
        float n11 = C5667g.n(Y11);
        float n12 = C5667g.n(Y13);
        float n13 = C5667g.n(Y12);
        return new C5669i(min, Math.min(n10, Math.min(n11, Math.min(n12, n13))), max, Math.max(n10, Math.max(n11, Math.max(n12, n13))));
    }

    public static final C4488v d(C4488v vVar) {
        C4488v vVar2;
        C4488v k02 = vVar.k0();
        while (true) {
            C4488v vVar3 = k02;
            vVar2 = vVar;
            vVar = vVar3;
            if (vVar == null) {
                break;
            }
            k02 = vVar.k0();
        }
        C4498c0 c0Var = vVar2 instanceof C4498c0 ? (C4498c0) vVar2 : null;
        if (c0Var == null) {
            return vVar2;
        }
        C4498c0 K22 = c0Var.K2();
        while (true) {
            C4498c0 c0Var2 = K22;
            C4498c0 c0Var3 = c0Var;
            c0Var = c0Var2;
            if (c0Var == null) {
                return c0Var3;
            }
            K22 = c0Var.K2();
        }
    }

    public static final long e(C4488v vVar) {
        C4488v k02 = vVar.k0();
        return k02 != null ? k02.E(vVar, C5667g.f26701b.c()) : C5667g.f26701b.c();
    }

    public static final long f(C4488v vVar) {
        return vVar.p0(C5667g.f26701b.c());
    }

    public static final long g(C4488v vVar) {
        return vVar.Y(C5667g.f26701b.c());
    }
}
