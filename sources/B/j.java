package B;

import C.A;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.D0;
import androidx.camera.core.impl.E0;
import androidx.camera.core.impl.J0;
import androidx.camera.core.impl.S0;
import androidx.camera.core.impl.X;
import u.C5965a;

public class j implements S0 {

    /* renamed from: I  reason: collision with root package name */
    private final X f4478I;

    public static final class a implements A<j> {

        /* renamed from: a  reason: collision with root package name */
        private final E0 f4479a = E0.b0();

        public static a d(X x10) {
            a aVar = new a();
            x10.c("camera2.captureRequest.option.", new i(aVar, x10));
            return aVar;
        }

        public D0 a() {
            return this.f4479a;
        }

        public j c() {
            return new j(J0.Z(this.f4479a));
        }

        public <ValueT> a g(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.f4479a.q(C5965a.X(key), valuet);
            return this;
        }
    }

    public j(X x10) {
        this.f4478I = x10;
    }

    public X getConfig() {
        return this.f4478I;
    }
}
