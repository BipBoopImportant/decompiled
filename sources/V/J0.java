package v;

import android.util.Size;
import androidx.camera.core.impl.E0;
import androidx.camera.core.impl.M0;
import androidx.camera.core.impl.X;
import androidx.camera.core.impl.X0;
import androidx.camera.core.impl.o1;
import u.C5965a;
import z.o;

final class J0 implements X0.e {

    /* renamed from: a  reason: collision with root package name */
    static final J0 f30227a = new J0();

    J0() {
    }

    public void a(Size size, o1<?> o1Var, X0.b bVar) {
        X0 n10 = o1Var.n((X0) null);
        X Y10 = androidx.camera.core.impl.J0.Y();
        int p10 = X0.b().p();
        if (n10 != null) {
            p10 = n10.p();
            bVar.b(n10.c());
            bVar.d(n10.l());
            bVar.c(n10.j());
            Y10 = n10.f();
        }
        bVar.v(Y10);
        if (o1Var instanceof M0) {
            o.b(size, bVar);
        }
        C5965a aVar = new C5965a(o1Var);
        bVar.z(aVar.Z(p10));
        bVar.f(aVar.a0(N0.b()));
        bVar.k(aVar.d0(M0.b()));
        bVar.e(T0.e(aVar.c0(C6043U.c())));
        bVar.A(o1Var.w());
        bVar.y(o1Var.D());
        E0 b02 = E0.b0();
        b02.q(C5965a.f29565P, aVar.b0((String) null));
        b02.q(C5965a.f29560K, Long.valueOf(aVar.e0(-1)));
        bVar.g(b02);
        bVar.g(aVar.Y());
    }
}
