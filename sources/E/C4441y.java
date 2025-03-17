package E;

import C.C4404l;
import C.C4416y;
import E.C4437u;
import E.Z;
import G.p;
import G.q;
import H.a;
import H2.d;
import M.b;
import O.C4714y;
import android.util.Size;
import androidx.camera.core.e;
import androidx.camera.core.impl.C5043q0;
import androidx.camera.core.impl.C5044r0;
import androidx.camera.core.impl.U;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.W;
import androidx.camera.core.impl.X0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import ob.C10101e;

/* renamed from: E.y  reason: case insensitive filesystem */
public class C4441y {

    /* renamed from: f  reason: collision with root package name */
    private static int f5667f;

    /* renamed from: g  reason: collision with root package name */
    static final b f5668g = new b();

    /* renamed from: a  reason: collision with root package name */
    private final C5043q0 f5669a;

    /* renamed from: b  reason: collision with root package name */
    private final V f5670b;

    /* renamed from: c  reason: collision with root package name */
    private final C4437u f5671c;

    /* renamed from: d  reason: collision with root package name */
    private final O f5672d;

    /* renamed from: e  reason: collision with root package name */
    private final C4437u.c f5673e;

    public C4441y(C5043q0 q0Var, Size size, C4404l lVar, boolean z10, Size size2, int i10) {
        C4404l lVar2 = lVar;
        p.a();
        this.f5669a = q0Var;
        this.f5670b = V.a.j(q0Var).h();
        C4437u uVar = new C4437u();
        this.f5671c = uVar;
        Executor c02 = q0Var.c0(a.c());
        Objects.requireNonNull(c02);
        O o10 = new O(c02, lVar2 != null ? new C4714y(lVar2) : null);
        this.f5672d = o10;
        C4437u.c m10 = C4437u.c.m(size, q0Var.m(), i(), z10, q0Var.b0(), size2, i10);
        this.f5673e = m10;
        o10.x(uVar.v(m10));
    }

    private C4429l b(int i10, U u10, f0 f0Var, V v10) {
        ArrayList arrayList = new ArrayList();
        String valueOf = String.valueOf(u10.hashCode());
        List<W> a10 = u10.a();
        Objects.requireNonNull(a10);
        for (W w10 : a10) {
            V.a aVar = new V.a();
            aVar.v(this.f5670b.k());
            aVar.e(this.f5670b.g());
            aVar.a(f0Var.p());
            aVar.f(this.f5673e.k());
            aVar.t(l());
            if (N.b.j(this.f5673e.d())) {
                if (f5668g.a()) {
                    aVar.d(V.f16779i, Integer.valueOf(f0Var.n()));
                }
                aVar.d(V.f16780j, Integer.valueOf(g(f0Var)));
            }
            aVar.e(w10.a().g());
            aVar.g(valueOf, Integer.valueOf(w10.getId()));
            aVar.r(i10);
            aVar.c(this.f5673e.a());
            arrayList.add(aVar.h());
        }
        return new C4429l(arrayList, v10);
    }

    private U c() {
        U X10 = this.f5669a.X(C4416y.b());
        Objects.requireNonNull(X10);
        return X10;
    }

    private P d(int i10, U u10, f0 f0Var, V v10, C10101e<Void> eVar) {
        return new P(u10, f0Var.m(), f0Var.i(), f0Var.n(), f0Var.k(), f0Var.o(), v10, eVar, i10);
    }

    private int i() {
        Integer num = (Integer) this.f5669a.g(C5043q0.f16996M, null);
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = (Integer) this.f5669a.g(C5044r0.f17008l, null);
        return (num2 == null || num2.intValue() != 4101) ? 256 : 4101;
    }

    private boolean l() {
        return this.f5673e.h() != null;
    }

    public void a() {
        p.a();
        this.f5671c.r();
        this.f5672d.v();
    }

    /* access modifiers changed from: package-private */
    public d<C4429l, P> e(f0 f0Var, V v10, C10101e<Void> eVar) {
        p.a();
        U c10 = c();
        int i10 = f5667f;
        f5667f = i10 + 1;
        return new d<>(b(i10, c10, f0Var, v10), d(i10, c10, f0Var, v10, eVar));
    }

    public X0.b f(Size size) {
        X0.b q10 = X0.b.q(this.f5669a, size);
        q10.h(this.f5673e.k());
        if (this.f5673e.h() != null) {
            q10.x(this.f5673e.h());
        }
        return q10;
    }

    /* access modifiers changed from: package-private */
    public int g(f0 f0Var) {
        return (!(f0Var.l() != null) || !q.h(f0Var.i(), this.f5673e.j())) ? f0Var.k() : f0Var.h() == 0 ? 100 : 95;
    }

    public int h() {
        p.a();
        return this.f5671c.h();
    }

    /* access modifiers changed from: package-private */
    public void j(Z.b bVar) {
        p.a();
        this.f5673e.b().accept(bVar);
    }

    public void k(e.a aVar) {
        p.a();
        this.f5671c.u(aVar);
    }

    /* access modifiers changed from: package-private */
    public void m(P p10) {
        p.a();
        this.f5673e.i().accept(p10);
    }
}
