package w;

import G.l;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public final class O {

    /* renamed from: a  reason: collision with root package name */
    private final b f31050a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, B> f31051b = new ArrayMap(4);

    static final class a extends CameraManager.AvailabilityCallback {

        /* renamed from: a  reason: collision with root package name */
        private final Executor f31052a;

        /* renamed from: b  reason: collision with root package name */
        final CameraManager.AvailabilityCallback f31053b;

        /* renamed from: c  reason: collision with root package name */
        private final Object f31054c = new Object();

        /* renamed from: d  reason: collision with root package name */
        private boolean f31055d = false;

        a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.f31052a = executor;
            this.f31053b = availabilityCallback;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void d() {
            C6171f.a(this.f31053b);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void e(String str) {
            this.f31053b.onCameraAvailable(str);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void f(String str) {
            this.f31053b.onCameraUnavailable(str);
        }

        /* access modifiers changed from: package-private */
        public void g() {
            synchronized (this.f31054c) {
                this.f31055d = true;
            }
        }

        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.f31054c) {
                try {
                    if (!this.f31055d) {
                        this.f31052a.execute(new M(this));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void onCameraAvailable(String str) {
            synchronized (this.f31054c) {
                try {
                    if (!this.f31055d) {
                        this.f31052a.execute(new L(this, str));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void onCameraUnavailable(String str) {
            synchronized (this.f31054c) {
                try {
                    if (!this.f31055d) {
                        this.f31052a.execute(new N(this, str));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public interface b {
        static b g(Context context, Handler handler) {
            int i10 = Build.VERSION.SDK_INT;
            return i10 >= 30 ? new S(context) : i10 >= 29 ? new Q(context) : i10 >= 28 ? P.i(context) : T.h(context, handler);
        }

        void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        CameraCharacteristics b(String str);

        Set<Set<String>> c();

        void d(String str, Executor executor, CameraDevice.StateCallback stateCallback);

        String[] e();

        void f(CameraManager.AvailabilityCallback availabilityCallback);
    }

    private O(b bVar) {
        this.f31050a = bVar;
    }

    public static O a(Context context) {
        return b(context, l.a());
    }

    public static O b(Context context, Handler handler) {
        return new O(b.g(context, handler));
    }

    public B c(String str) {
        B b10;
        synchronized (this.f31051b) {
            b10 = this.f31051b.get(str);
            if (b10 == null) {
                try {
                    b10 = B.e(this.f31050a.b(str), str);
                    this.f31051b.put(str, b10);
                } catch (AssertionError e10) {
                    throw new C6172g(10002, e10.getMessage(), e10);
                }
            }
        }
        return b10;
    }

    public String[] d() {
        return this.f31050a.e();
    }

    public Set<Set<String>> e() {
        return this.f31050a.c();
    }

    public void f(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        this.f31050a.d(str, executor, stateCallback);
    }

    public void g(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f31050a.a(executor, availabilityCallback);
    }

    public void h(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f31050a.f(availabilityCallback);
    }
}
