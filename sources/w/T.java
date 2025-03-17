package w;

import H2.i;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import w.C;
import w.O;

class T implements O.b {

    /* renamed from: a  reason: collision with root package name */
    final CameraManager f31056a;

    /* renamed from: b  reason: collision with root package name */
    final Object f31057b;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        final Map<CameraManager.AvailabilityCallback, O.a> f31058a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        final Handler f31059b;

        a(Handler handler) {
            this.f31059b = handler;
        }
    }

    T(Context context, Object obj) {
        this.f31056a = (CameraManager) context.getSystemService("camera");
        this.f31057b = obj;
    }

    static T h(Context context, Handler handler) {
        return new T(context, new a(handler));
    }

    public void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        O.a aVar;
        if (executor != null) {
            a aVar2 = (a) this.f31057b;
            if (availabilityCallback != null) {
                synchronized (aVar2.f31058a) {
                    try {
                        aVar = aVar2.f31058a.get(availabilityCallback);
                        if (aVar == null) {
                            aVar = new O.a(executor, availabilityCallback);
                            aVar2.f31058a.put(availabilityCallback, aVar);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else {
                aVar = null;
            }
            this.f31056a.registerAvailabilityCallback(aVar, aVar2.f31059b);
            return;
        }
        throw new IllegalArgumentException("executor was null");
    }

    public CameraCharacteristics b(String str) {
        try {
            return this.f31056a.getCameraCharacteristics(str);
        } catch (CameraAccessException e10) {
            throw C6172g.e(e10);
        }
    }

    public Set<Set<String>> c() {
        return Collections.emptySet();
    }

    public void d(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        i.g(executor);
        i.g(stateCallback);
        try {
            this.f31056a.openCamera(str, new C.b(executor, stateCallback), ((a) this.f31057b).f31059b);
        } catch (CameraAccessException e10) {
            throw C6172g.e(e10);
        }
    }

    public String[] e() {
        try {
            return this.f31056a.getCameraIdList();
        } catch (CameraAccessException e10) {
            throw C6172g.e(e10);
        }
    }

    public void f(CameraManager.AvailabilityCallback availabilityCallback) {
        O.a aVar;
        if (availabilityCallback != null) {
            a aVar2 = (a) this.f31057b;
            synchronized (aVar2.f31058a) {
                aVar = aVar2.f31058a.remove(availabilityCallback);
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.g();
        }
        this.f31056a.unregisterAvailabilityCallback(aVar);
    }
}
