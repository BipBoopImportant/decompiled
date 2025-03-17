package S;

import J.m;
import androidx.camera.core.impl.D0;
import androidx.camera.core.impl.E0;
import androidx.camera.core.impl.J0;
import androidx.camera.core.impl.o1;
import androidx.camera.core.impl.p1;
import java.util.UUID;

class i implements o1.a<h, j, i> {

    /* renamed from: a  reason: collision with root package name */
    private final E0 f12541a;

    i() {
        this(E0.b0());
    }

    public D0 a() {
        return this.f12541a;
    }

    /* renamed from: b */
    public j e() {
        return new j(J0.Z(this.f12541a));
    }

    public i c(p1.b bVar) {
        a().q(o1.f16978F, bVar);
        return this;
    }

    public i d(Class<h> cls) {
        a().q(m.f8790c, cls);
        if (a().g(m.f8789b, null) == null) {
            f(cls.getCanonicalName() + "-" + UUID.randomUUID());
        }
        return this;
    }

    public i f(String str) {
        a().q(m.f8789b, str);
        return this;
    }

    i(E0 e02) {
        this.f12541a = e02;
        Class cls = (Class) e02.g(m.f8790c, null);
        Class<h> cls2 = h.class;
        if (cls == null || cls.equals(cls2)) {
            c(p1.b.STREAM_SHARING);
            d(cls2);
            return;
        }
        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
    }
}
