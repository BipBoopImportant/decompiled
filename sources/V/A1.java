package v;

import androidx.camera.core.impl.C5043q0;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.o1;
import u.C5965a;
import z.j;

final class A1 extends C6044V {

    /* renamed from: c  reason: collision with root package name */
    static final A1 f30170c = new A1(new j());

    /* renamed from: b  reason: collision with root package name */
    private final j f30171b;

    private A1(j jVar) {
        this.f30171b = jVar;
    }

    public void a(o1<?> o1Var, V.a aVar) {
        super.a(o1Var, aVar);
        if (o1Var instanceof C5043q0) {
            C5043q0 q0Var = (C5043q0) o1Var;
            C5965a.C0464a aVar2 = new C5965a.C0464a();
            if (q0Var.f0()) {
                this.f30171b.a(q0Var.Y(), aVar2);
            }
            aVar.e(aVar2.b());
            return;
        }
        throw new IllegalArgumentException("config is not ImageCaptureConfig");
    }
}
