package v;

import androidx.camera.core.impl.J0;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.X;
import androidx.camera.core.impl.o1;
import u.C5965a;

/* renamed from: v.V  reason: case insensitive filesystem */
class C6044V implements V.b {

    /* renamed from: a  reason: collision with root package name */
    static final C6044V f30401a = new C6044V();

    C6044V() {
    }

    public void a(o1<?> o1Var, V.a aVar) {
        V r10 = o1Var.r((V) null);
        X Y10 = J0.Y();
        int k10 = V.b().k();
        if (r10 != null) {
            k10 = r10.k();
            aVar.a(r10.c());
            Y10 = r10.g();
        }
        aVar.s(Y10);
        C5965a aVar2 = new C5965a(o1Var);
        aVar.v(aVar2.Z(k10));
        aVar.c(T0.e(aVar2.c0(C6043U.c())));
        aVar.e(aVar2.Y());
    }
}
