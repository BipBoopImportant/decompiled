package w;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.concurrent.Executor;

class P extends T {
    P(Context context) {
        super(context, (Object) null);
    }

    static P i(Context context) {
        return new P(context);
    }

    private boolean j(Throwable th2) {
        return Build.VERSION.SDK_INT == 28 && k(th2);
    }

    private static boolean k(Throwable th2) {
        StackTraceElement[] stackTrace;
        if (!th2.getClass().equals(RuntimeException.class) || (stackTrace = th2.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    private void l(Throwable th2) {
        throw new C6172g(10001, th2);
    }

    public void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f31056a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    public CameraCharacteristics b(String str) {
        try {
            return super.b(str);
        } catch (RuntimeException e10) {
            if (j(e10)) {
                l(e10);
            }
            throw e10;
        }
    }

    public void d(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            this.f31056a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e10) {
            throw C6172g.e(e10);
        } catch (IllegalArgumentException | SecurityException e11) {
            throw e11;
        } catch (RuntimeException e12) {
            if (j(e12)) {
                l(e12);
            }
            throw e12;
        }
    }

    public void f(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f31056a.unregisterAvailabilityCallback(availabilityCallback);
    }
}
