package androidx.camera.core.impl;

import G.h;
import android.hardware.camera2.CaptureResult;

/* renamed from: androidx.camera.core.impl.z  reason: case insensitive filesystem */
public interface C5059z {

    /* renamed from: androidx.camera.core.impl.z$a */
    public static final class a implements C5059z {
        public static C5059z l() {
            return new a();
        }

        public long a() {
            return -1;
        }

        public g1 b() {
            return g1.b();
        }

        public C5057y d() {
            return C5057y.UNKNOWN;
        }

        public C5053w e() {
            return C5053w.UNKNOWN;
        }

        public CaptureResult f() {
            return null;
        }

        public C5045s g() {
            return C5045s.UNKNOWN;
        }

        public C5051v h() {
            return C5051v.UNKNOWN;
        }

        public C5055x i() {
            return C5055x.UNKNOWN;
        }

        public C5049u j() {
            return C5049u.UNKNOWN;
        }

        public C5047t k() {
            return C5047t.UNKNOWN;
        }
    }

    long a();

    g1 b();

    void c(h.b bVar) {
        bVar.g(d());
    }

    C5057y d();

    C5053w e();

    CaptureResult f() {
        return null;
    }

    C5045s g();

    C5051v h();

    C5055x i();

    C5049u j();

    C5047t k();
}
