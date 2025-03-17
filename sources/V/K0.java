package v;

import android.content.Context;
import androidx.camera.core.impl.C5046s0;
import androidx.camera.core.impl.E0;
import androidx.camera.core.impl.J0;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.X;
import androidx.camera.core.impl.X0;
import androidx.camera.core.impl.o1;
import androidx.camera.core.impl.p1;

public final class K0 implements p1 {

    /* renamed from: b  reason: collision with root package name */
    final C6072h1 f30235b;

    public K0(Context context) {
        this.f30235b = C6072h1.c(context);
    }

    public X a(p1.b bVar, int i10) {
        E0 b02 = E0.b0();
        X0.b bVar2 = new X0.b();
        bVar2.z(b2.b(bVar, i10));
        b02.q(o1.f16981x, bVar2.o());
        b02.q(o1.f16983z, J0.f30227a);
        V.a aVar = new V.a();
        aVar.v(b2.a(bVar, i10));
        b02.q(o1.f16982y, aVar.h());
        b02.q(o1.f16973A, bVar == p1.b.IMAGE_CAPTURE ? A1.f30170c : C6044V.f30401a);
        if (bVar == p1.b.PREVIEW) {
            b02.q(C5046s0.f17016t, this.f30235b.f());
        }
        b02.q(C5046s0.f17011o, Integer.valueOf(this.f30235b.d(true).getRotation()));
        if (bVar == p1.b.VIDEO_CAPTURE || bVar == p1.b.STREAM_SHARING) {
            b02.q(o1.f16976D, Boolean.TRUE);
        }
        return J0.Z(b02);
    }
}
