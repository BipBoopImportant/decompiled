package x;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final c f31544a;

    private static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final List<k> f31547a;

        /* renamed from: b  reason: collision with root package name */
        private final CameraCaptureSession.StateCallback f31548b;

        /* renamed from: c  reason: collision with root package name */
        private final Executor f31549c;

        /* renamed from: d  reason: collision with root package name */
        private final int f31550d;

        /* renamed from: e  reason: collision with root package name */
        private j f31551e = null;

        /* renamed from: f  reason: collision with root package name */
        private CaptureRequest f31552f = null;

        b(int i10, List<k> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f31550d = i10;
            this.f31547a = Collections.unmodifiableList(new ArrayList(list));
            this.f31548b = stateCallback;
            this.f31549c = executor;
        }

        public j a() {
            return this.f31551e;
        }

        public Executor b() {
            return this.f31549c;
        }

        public CameraCaptureSession.StateCallback c() {
            return this.f31548b;
        }

        public List<k> d() {
            return this.f31547a;
        }

        public void e(j jVar) {
            if (this.f31550d != 1) {
                this.f31551e = jVar;
                return;
            }
            throw new UnsupportedOperationException("Method not supported for high speed session types");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (Objects.equals(this.f31551e, bVar.f31551e) && this.f31550d == bVar.f31550d && this.f31547a.size() == bVar.f31547a.size()) {
                    for (int i10 = 0; i10 < this.f31547a.size(); i10++) {
                        if (!this.f31547a.get(i10).equals(bVar.f31547a.get(i10))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public Object f() {
            return null;
        }

        public int g() {
            return this.f31550d;
        }

        public void h(CaptureRequest captureRequest) {
            this.f31552f = captureRequest;
        }

        public int hashCode() {
            int hashCode = this.f31547a.hashCode() ^ 31;
            int i10 = (hashCode << 5) - hashCode;
            j jVar = this.f31551e;
            int hashCode2 = (jVar == null ? 0 : jVar.hashCode()) ^ i10;
            return this.f31550d ^ ((hashCode2 << 5) - hashCode2);
        }
    }

    private interface c {
        j a();

        Executor b();

        CameraCaptureSession.StateCallback c();

        List<k> d();

        void e(j jVar);

        Object f();

        int g();

        void h(CaptureRequest captureRequest);
    }

    public q(int i10, List<k> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f31544a = new b(i10, list, executor, stateCallback);
        } else {
            this.f31544a = new a(i10, list, executor, stateCallback);
        }
    }

    public static List<OutputConfiguration> h(List<k> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (k i10 : list) {
            arrayList.add((OutputConfiguration) i10.i());
        }
        return arrayList;
    }

    static List<k> i(List<OutputConfiguration> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (OutputConfiguration j10 : list) {
            arrayList.add(k.j(j10));
        }
        return arrayList;
    }

    public Executor a() {
        return this.f31544a.b();
    }

    public j b() {
        return this.f31544a.a();
    }

    public List<k> c() {
        return this.f31544a.d();
    }

    public int d() {
        return this.f31544a.g();
    }

    public CameraCaptureSession.StateCallback e() {
        return this.f31544a.c();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        return this.f31544a.equals(((q) obj).f31544a);
    }

    public void f(j jVar) {
        this.f31544a.e(jVar);
    }

    public void g(CaptureRequest captureRequest) {
        this.f31544a.h(captureRequest);
    }

    public int hashCode() {
        return this.f31544a.hashCode();
    }

    public Object j() {
        return this.f31544a.f();
    }

    private static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final SessionConfiguration f31545a;

        /* renamed from: b  reason: collision with root package name */
        private final List<k> f31546b;

        a(Object obj) {
            SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
            this.f31545a = sessionConfiguration;
            this.f31546b = Collections.unmodifiableList(q.i(sessionConfiguration.getOutputConfigurations()));
        }

        public j a() {
            return j.b(this.f31545a.getInputConfiguration());
        }

        public Executor b() {
            return this.f31545a.getExecutor();
        }

        public CameraCaptureSession.StateCallback c() {
            return this.f31545a.getStateCallback();
        }

        public List<k> d() {
            return this.f31546b;
        }

        public void e(j jVar) {
            this.f31545a.setInputConfiguration((InputConfiguration) jVar.a());
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            return Objects.equals(this.f31545a, ((a) obj).f31545a);
        }

        public Object f() {
            return this.f31545a;
        }

        public int g() {
            return this.f31545a.getSessionType();
        }

        public void h(CaptureRequest captureRequest) {
            this.f31545a.setSessionParameters(captureRequest);
        }

        public int hashCode() {
            return this.f31545a.hashCode();
        }

        a(int i10, List<k> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this(new SessionConfiguration(i10, q.h(list), executor, stateCallback));
        }
    }
}
