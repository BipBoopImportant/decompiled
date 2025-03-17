package u;

import B.j;
import C.A;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.D0;
import androidx.camera.core.impl.E0;
import androidx.camera.core.impl.J0;
import androidx.camera.core.impl.X;

/* renamed from: u.a  reason: case insensitive filesystem */
public final class C5965a extends j {

    /* renamed from: J  reason: collision with root package name */
    public static final X.a<Integer> f29559J = X.a.a("camera2.captureRequest.templateType", Integer.TYPE);

    /* renamed from: K  reason: collision with root package name */
    public static final X.a<Long> f29560K = X.a.a("camera2.cameraCaptureSession.streamUseCase", Long.TYPE);

    /* renamed from: L  reason: collision with root package name */
    public static final X.a<CameraDevice.StateCallback> f29561L = X.a.a("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class);

    /* renamed from: M  reason: collision with root package name */
    public static final X.a<CameraCaptureSession.StateCallback> f29562M = X.a.a("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class);

    /* renamed from: N  reason: collision with root package name */
    public static final X.a<CameraCaptureSession.CaptureCallback> f29563N = X.a.a("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class);

    /* renamed from: O  reason: collision with root package name */
    public static final X.a<Object> f29564O = X.a.a("camera2.captureRequest.tag", Object.class);

    /* renamed from: P  reason: collision with root package name */
    public static final X.a<String> f29565P = X.a.a("camera2.cameraCaptureSession.physicalCameraId", String.class);

    /* renamed from: u.a$a  reason: collision with other inner class name */
    public static final class C0464a implements A<C5965a> {

        /* renamed from: a  reason: collision with root package name */
        private final E0 f29566a = E0.b0();

        public D0 a() {
            return this.f29566a;
        }

        public C5965a b() {
            return new C5965a(J0.Z(this.f29566a));
        }

        public C0464a c(X x10) {
            d(x10, X.c.OPTIONAL);
            return this;
        }

        public C0464a d(X x10, X.c cVar) {
            for (X.a next : x10.e()) {
                this.f29566a.o(next, cVar, x10.a(next));
            }
            return this;
        }

        public <ValueT> C0464a f(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.f29566a.q(C5965a.X(key), valuet);
            return this;
        }

        public <ValueT> C0464a g(CaptureRequest.Key<ValueT> key, ValueT valuet, X.c cVar) {
            this.f29566a.o(C5965a.X(key), cVar, valuet);
            return this;
        }
    }

    public C5965a(X x10) {
        super(x10);
    }

    public static X.a<Object> X(CaptureRequest.Key<?> key) {
        return X.a.b("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    public j Y() {
        return j.a.d(getConfig()).c();
    }

    public int Z(int i10) {
        return ((Integer) getConfig().g(f29559J, Integer.valueOf(i10))).intValue();
    }

    public CameraDevice.StateCallback a0(CameraDevice.StateCallback stateCallback) {
        return (CameraDevice.StateCallback) getConfig().g(f29561L, stateCallback);
    }

    public String b0(String str) {
        return (String) getConfig().g(f29565P, str);
    }

    public CameraCaptureSession.CaptureCallback c0(CameraCaptureSession.CaptureCallback captureCallback) {
        return (CameraCaptureSession.CaptureCallback) getConfig().g(f29563N, captureCallback);
    }

    public CameraCaptureSession.StateCallback d0(CameraCaptureSession.StateCallback stateCallback) {
        return (CameraCaptureSession.StateCallback) getConfig().g(f29562M, stateCallback);
    }

    public long e0(long j10) {
        return ((Long) getConfig().g(f29560K, Long.valueOf(j10))).longValue();
    }
}
