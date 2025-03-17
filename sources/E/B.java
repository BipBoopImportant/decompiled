package E;

import G.f;
import O.A;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.n;
import androidx.camera.core.o;
import androidx.camera.core.q;
import java.util.Objects;

public class B implements A<O.B<byte[]>, O.B<n>> {
    /* renamed from: a */
    public O.B<n> apply(O.B<byte[]> b10) {
        q qVar = new q(o.a(b10.h().getWidth(), b10.h().getHeight(), 256, 2));
        n e10 = ImageProcessingUtil.e(qVar, b10.c());
        qVar.l();
        Objects.requireNonNull(e10);
        f d10 = b10.d();
        Objects.requireNonNull(d10);
        return O.B.k(e10, d10, b10.b(), b10.f(), b10.g(), b10.a());
    }
}
