package w;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import java.util.concurrent.Executor;
import x.q;

public final class C {

    /* renamed from: a  reason: collision with root package name */
    private final a f31030a;

    interface a {
        void a(q qVar);
    }

    static final class b extends CameraDevice.StateCallback {

        /* renamed from: a  reason: collision with root package name */
        final CameraDevice.StateCallback f31031a;

        /* renamed from: b  reason: collision with root package name */
        private final Executor f31032b;

        b(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.f31032b = executor;
            this.f31031a = stateCallback;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void e(CameraDevice cameraDevice) {
            this.f31031a.onClosed(cameraDevice);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void f(CameraDevice cameraDevice) {
            this.f31031a.onDisconnected(cameraDevice);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void g(CameraDevice cameraDevice, int i10) {
            this.f31031a.onError(cameraDevice, i10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void h(CameraDevice cameraDevice) {
            this.f31031a.onOpened(cameraDevice);
        }

        public void onClosed(CameraDevice cameraDevice) {
            this.f31032b.execute(new D(this, cameraDevice));
        }

        public void onDisconnected(CameraDevice cameraDevice) {
            this.f31032b.execute(new F(this, cameraDevice));
        }

        public void onError(CameraDevice cameraDevice, int i10) {
            this.f31032b.execute(new E(this, cameraDevice, i10));
        }

        public void onOpened(CameraDevice cameraDevice) {
            this.f31032b.execute(new G(this, cameraDevice));
        }
    }

    private C(CameraDevice cameraDevice, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f31030a = new J(cameraDevice);
        } else {
            this.f31030a = I.e(cameraDevice, handler);
        }
    }

    public static C b(CameraDevice cameraDevice, Handler handler) {
        return new C(cameraDevice, handler);
    }

    public void a(q qVar) {
        this.f31030a.a(qVar);
    }
}
