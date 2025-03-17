package androidx.camera.core.impl;

import C.A;
import C.H0;
import J.m;
import android.util.Range;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.X;
import androidx.camera.core.impl.X0;
import androidx.camera.core.impl.p1;

public interface o1<T extends H0> extends m<T>, C5044r0 {

    /* renamed from: A  reason: collision with root package name */
    public static final X.a<V.b> f16973A = X.a.a("camerax.core.useCase.captureConfigUnpacker", V.b.class);

    /* renamed from: B  reason: collision with root package name */
    public static final X.a<Integer> f16974B;

    /* renamed from: C  reason: collision with root package name */
    public static final X.a<Range<Integer>> f16975C = X.a.a("camerax.core.useCase.targetFrameRate", Range.class);

    /* renamed from: D  reason: collision with root package name */
    public static final X.a<Boolean> f16976D;

    /* renamed from: E  reason: collision with root package name */
    public static final X.a<Boolean> f16977E;

    /* renamed from: F  reason: collision with root package name */
    public static final X.a<p1.b> f16978F = X.a.a("camerax.core.useCase.captureType", p1.b.class);

    /* renamed from: G  reason: collision with root package name */
    public static final X.a<Integer> f16979G;

    /* renamed from: H  reason: collision with root package name */
    public static final X.a<Integer> f16980H;

    /* renamed from: x  reason: collision with root package name */
    public static final X.a<X0> f16981x = X.a.a("camerax.core.useCase.defaultSessionConfig", X0.class);

    /* renamed from: y  reason: collision with root package name */
    public static final X.a<V> f16982y = X.a.a("camerax.core.useCase.defaultCaptureConfig", V.class);

    /* renamed from: z  reason: collision with root package name */
    public static final X.a<X0.e> f16983z = X.a.a("camerax.core.useCase.sessionConfigUnpacker", X0.e.class);

    public interface a<T extends H0, C extends o1<T>, B> extends A<T> {
        C e();
    }

    static {
        Class cls = Integer.TYPE;
        f16974B = X.a.a("camerax.core.useCase.surfaceOccupancyPriority", cls);
        Class cls2 = Boolean.TYPE;
        f16976D = X.a.a("camerax.core.useCase.zslDisabled", cls2);
        f16977E = X.a.a("camerax.core.useCase.highResolutionDisabled", cls2);
        f16979G = X.a.a("camerax.core.useCase.previewStabilizationMode", cls);
        f16980H = X.a.a("camerax.core.useCase.videoStabilizationMode", cls);
    }

    int A(int i10) {
        return ((Integer) g(f16974B, Integer.valueOf(i10))).intValue();
    }

    int D() {
        return ((Integer) g(f16979G, 0)).intValue();
    }

    X0 K() {
        return (X0) a(f16981x);
    }

    boolean L(boolean z10) {
        return ((Boolean) g(f16976D, Boolean.valueOf(z10))).booleanValue();
    }

    boolean S(boolean z10) {
        return ((Boolean) g(f16977E, Boolean.valueOf(z10))).booleanValue();
    }

    X0.e U(X0.e eVar) {
        return (X0.e) g(f16983z, eVar);
    }

    p1.b getCaptureType() {
        return (p1.b) a(f16978F);
    }

    X0 n(X0 x02) {
        return (X0) g(f16981x, x02);
    }

    V.b p(V.b bVar) {
        return (V.b) g(f16973A, bVar);
    }

    V r(V v10) {
        return (V) g(f16982y, v10);
    }

    int w() {
        return ((Integer) g(f16980H, 0)).intValue();
    }

    Range<Integer> x(Range<Integer> range) {
        return (Range) g(f16975C, range);
    }
}
