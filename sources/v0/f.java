package V0;

import U0.C4865c1;
import U0.C4866d;
import U0.C4872f;
import U0.C4874f1;
import U0.C4888l0;
import U0.C4890m0;
import U0.C4895p;
import U0.F;
import U0.L0;
import U0.N0;
import U0.Z;
import U0.r;
import XH.C16796C;
import XH.C16807N;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a/\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LU0/f1;", "slots", "LU0/f;", "", "applier", "", "index", "LXH/N;", "f", "(LU0/f1;LU0/f;I)V", "d", "(LU0/f1;)I", "LU0/d;", "anchor", "e", "(LU0/f1;LU0/d;LU0/f;)I", "LU0/F;", "composition", "LU0/r;", "parentContext", "LU0/m0;", "reference", "g", "(LU0/F;LU0/r;LU0/m0;LU0/f1;)V", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"V0/f$a", "LU0/N0;", "LU0/L0;", "scope", "", "instance", "LU0/Z;", "c", "(LU0/L0;Ljava/lang/Object;)LU0/Z;", "LXH/N;", "e", "(LU0/L0;)V", "value", "a", "(Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements N0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ F f14540a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C4890m0 f14541b;

        a(F f10, C4890m0 m0Var) {
            this.f14540a = f10;
            this.f14541b = m0Var;
        }

        public void a(Object obj) {
        }

        public Z c(L0 l02, Object obj) {
            Z z10;
            F f10 = this.f14540a;
            N0 n02 = f10 instanceof N0 ? (N0) f10 : null;
            if (n02 == null || (z10 = n02.c(l02, obj)) == null) {
                z10 = Z.IGNORED;
            }
            if (z10 != Z.IGNORED) {
                return z10;
            }
            C4890m0 m0Var = this.f14541b;
            m0Var.h(C16877v.W0(m0Var.d(), C16796C.a(l02, obj)));
            return Z.SCHEDULED;
        }

        public void e(L0 l02) {
        }
    }

    private static final int d(C4874f1 f1Var) {
        int c02 = f1Var.c0();
        int e02 = f1Var.e0();
        while (e02 >= 0 && !f1Var.t0(e02)) {
            e02 = f1Var.H0(e02);
        }
        int i10 = e02 + 1;
        int i11 = 0;
        while (i10 < c02) {
            if (f1Var.o0(c02, i10)) {
                if (f1Var.t0(i10)) {
                    i11 = 0;
                }
                i10++;
            } else {
                i11 += f1Var.t0(i10) ? 1 : f1Var.F0(i10);
                i10 += f1Var.m0(i10);
            }
        }
        return i11;
    }

    /* access modifiers changed from: private */
    public static final int e(C4874f1 f1Var, C4866d dVar, C4872f<Object> fVar) {
        int F10 = f1Var.F(dVar);
        boolean z10 = true;
        C4895p.Q(f1Var.c0() < F10);
        f(f1Var, fVar, F10);
        int d10 = d(f1Var);
        while (f1Var.c0() < F10) {
            if (f1Var.n0(F10)) {
                if (f1Var.s0()) {
                    fVar.g(f1Var.D0(f1Var.c0()));
                    d10 = 0;
                }
                f1Var.j1();
            } else {
                d10 += f1Var.Y0();
            }
        }
        if (f1Var.c0() != F10) {
            z10 = false;
        }
        C4895p.Q(z10);
        return d10;
    }

    /* access modifiers changed from: private */
    public static final void f(C4874f1 f1Var, C4872f<Object> fVar, int i10) {
        while (!f1Var.p0(i10)) {
            f1Var.Z0();
            if (f1Var.t0(f1Var.e0())) {
                fVar.i();
            }
            f1Var.T();
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    public static final void g(F f10, r rVar, C4890m0 m0Var, C4874f1 f1Var) {
        C4865c1 c1Var = new C4865c1();
        if (f1Var.b0()) {
            c1Var.q();
        }
        if (f1Var.a0()) {
            c1Var.p();
        }
        C4874f1 J10 = c1Var.J();
        boolean z10 = false;
        try {
            J10.I();
            J10.k1(126665345, m0Var.c());
            z10 = true;
            C4874f1.v0(J10, z10 ? 1 : 0, z10 ? 1 : 0, (Object) null);
            J10.p1(m0Var.f());
            List<C4866d> C02 = f1Var.C0(m0Var.a(), z10, J10);
            J10.Y0();
            J10.T();
            J10.U();
            J10.L(z10);
            C4888l0 l0Var = new C4888l0(c1Var);
            L0.a aVar = L0.f13781h;
            if (aVar.b(c1Var, C02)) {
                a aVar2 = new a(f10, m0Var);
                C4874f1 J11 = c1Var.J();
                try {
                    aVar.a(J11, C02, aVar2);
                    C16807N n10 = C16807N.f139792a;
                } finally {
                    J11.L(z10);
                }
            }
            rVar.m(m0Var, l0Var);
        } catch (Throwable th2) {
            J10.L(z10);
            throw th2;
        }
    }
}
