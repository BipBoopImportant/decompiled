package C;

import J.m;
import android.os.Handler;
import androidx.camera.core.impl.D0;
import androidx.camera.core.impl.E0;
import androidx.camera.core.impl.G;
import androidx.camera.core.impl.H;
import androidx.camera.core.impl.J0;
import androidx.camera.core.impl.O0;
import androidx.camera.core.impl.X;
import androidx.camera.core.impl.p1;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: C.x  reason: case insensitive filesystem */
public final class C4415x implements m<C4414w> {

    /* renamed from: J  reason: collision with root package name */
    static final X.a<H.a> f5447J = X.a.a("camerax.core.appConfig.cameraFactoryProvider", H.a.class);

    /* renamed from: K  reason: collision with root package name */
    static final X.a<G.a> f5448K = X.a.a("camerax.core.appConfig.deviceSurfaceManagerProvider", G.a.class);

    /* renamed from: L  reason: collision with root package name */
    static final X.a<p1.c> f5449L = X.a.a("camerax.core.appConfig.useCaseConfigFactoryProvider", p1.c.class);

    /* renamed from: M  reason: collision with root package name */
    static final X.a<Executor> f5450M = X.a.a("camerax.core.appConfig.cameraExecutor", Executor.class);

    /* renamed from: N  reason: collision with root package name */
    static final X.a<Handler> f5451N = X.a.a("camerax.core.appConfig.schedulerHandler", Handler.class);

    /* renamed from: O  reason: collision with root package name */
    static final X.a<Integer> f5452O = X.a.a("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE);

    /* renamed from: P  reason: collision with root package name */
    static final X.a<C4409q> f5453P = X.a.a("camerax.core.appConfig.availableCamerasLimiter", C4409q.class);

    /* renamed from: Q  reason: collision with root package name */
    static final X.a<Long> f5454Q = X.a.a("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE);

    /* renamed from: R  reason: collision with root package name */
    static final X.a<s0> f5455R = X.a.a("camerax.core.appConfig.cameraProviderInitRetryPolicy", s0.class);

    /* renamed from: S  reason: collision with root package name */
    static final X.a<O0> f5456S = X.a.a("camerax.core.appConfig.quirksSettings", O0.class);

    /* renamed from: I  reason: collision with root package name */
    private final J0 f5457I;

    /* renamed from: C.x$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final E0 f5458a;

        public a() {
            this(E0.b0());
        }

        private D0 b() {
            return this.f5458a;
        }

        public C4415x a() {
            return new C4415x(J0.Z(this.f5458a));
        }

        public a c(H.a aVar) {
            b().q(C4415x.f5447J, aVar);
            return this;
        }

        public a d(G.a aVar) {
            b().q(C4415x.f5448K, aVar);
            return this;
        }

        public a e(Class<C4414w> cls) {
            b().q(m.f8790c, cls);
            if (b().g(m.f8789b, null) == null) {
                f(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public a f(String str) {
            b().q(m.f8789b, str);
            return this;
        }

        public a g(p1.c cVar) {
            b().q(C4415x.f5449L, cVar);
            return this;
        }

        private a(E0 e02) {
            this.f5458a = e02;
            Class cls = (Class) e02.g(m.f8790c, null);
            Class<C4414w> cls2 = C4414w.class;
            if (cls == null || cls.equals(cls2)) {
                e(cls2);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    /* renamed from: C.x$b */
    public interface b {
        C4415x getCameraXConfig();
    }

    C4415x(J0 j02) {
        this.f5457I = j02;
    }

    public C4409q X(C4409q qVar) {
        return (C4409q) this.f5457I.g(f5453P, qVar);
    }

    public Executor Y(Executor executor) {
        return (Executor) this.f5457I.g(f5450M, executor);
    }

    public H.a Z(H.a aVar) {
        return (H.a) this.f5457I.g(f5447J, aVar);
    }

    public long a0() {
        return ((Long) this.f5457I.g(f5454Q, -1L)).longValue();
    }

    public s0 b0() {
        s0 s0Var = (s0) this.f5457I.g(f5455R, s0.f5403b);
        Objects.requireNonNull(s0Var);
        return s0Var;
    }

    public G.a c0(G.a aVar) {
        return (G.a) this.f5457I.g(f5448K, aVar);
    }

    public O0 d0() {
        return (O0) this.f5457I.g(f5456S, null);
    }

    public Handler e0(Handler handler) {
        return (Handler) this.f5457I.g(f5451N, handler);
    }

    public p1.c f0(p1.c cVar) {
        return (p1.c) this.f5457I.g(f5449L, cVar);
    }

    public X getConfig() {
        return this.f5457I;
    }
}
