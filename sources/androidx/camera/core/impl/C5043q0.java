package androidx.camera.core.impl;

import C.C4383a0;
import C.U;
import J.h;
import R.c;
import androidx.camera.core.impl.X;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.impl.q0  reason: case insensitive filesystem */
public final class C5043q0 implements o1<U>, C5046s0, h {

    /* renamed from: J  reason: collision with root package name */
    public static final X.a<Integer> f16993J;

    /* renamed from: K  reason: collision with root package name */
    public static final X.a<Integer> f16994K;

    /* renamed from: L  reason: collision with root package name */
    public static final X.a<U> f16995L = X.a.a("camerax.core.imageCapture.captureBundle", U.class);

    /* renamed from: M  reason: collision with root package name */
    public static final X.a<Integer> f16996M;

    /* renamed from: N  reason: collision with root package name */
    public static final X.a<Integer> f16997N;

    /* renamed from: O  reason: collision with root package name */
    public static final X.a<Integer> f16998O;

    /* renamed from: P  reason: collision with root package name */
    public static final X.a<C4383a0> f16999P = X.a.a("camerax.core.imageCapture.imageReaderProxyProvider", C4383a0.class);

    /* renamed from: Q  reason: collision with root package name */
    public static final X.a<Boolean> f17000Q = X.a.a("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE);

    /* renamed from: R  reason: collision with root package name */
    public static final X.a<Integer> f17001R;

    /* renamed from: S  reason: collision with root package name */
    public static final X.a<Integer> f17002S;

    /* renamed from: T  reason: collision with root package name */
    public static final X.a<U.i> f17003T = X.a.a("camerax.core.imageCapture.screenFlash", U.i.class);

    /* renamed from: U  reason: collision with root package name */
    public static final X.a<c> f17004U = X.a.a("camerax.core.useCase.postviewResolutionSelector", c.class);

    /* renamed from: V  reason: collision with root package name */
    public static final X.a<Boolean> f17005V = X.a.a("camerax.core.useCase.isPostviewEnabled", Boolean.class);

    /* renamed from: I  reason: collision with root package name */
    private final J0 f17006I;

    static {
        Class cls = Integer.TYPE;
        f16993J = X.a.a("camerax.core.imageCapture.captureMode", cls);
        f16994K = X.a.a("camerax.core.imageCapture.flashMode", cls);
        Class<Integer> cls2 = Integer.class;
        f16996M = X.a.a("camerax.core.imageCapture.bufferFormat", cls2);
        f16997N = X.a.a("camerax.core.imageCapture.outputFormat", cls2);
        f16998O = X.a.a("camerax.core.imageCapture.maxCaptureStages", cls2);
        f17001R = X.a.a("camerax.core.imageCapture.flashType", cls);
        f17002S = X.a.a("camerax.core.imageCapture.jpegCompressionQuality", cls);
    }

    public C5043q0(J0 j02) {
        this.f17006I = j02;
    }

    public U X(U u10) {
        return (U) g(f16995L, u10);
    }

    public int Y() {
        return ((Integer) a(f16993J)).intValue();
    }

    public int Z(int i10) {
        return ((Integer) g(f16994K, Integer.valueOf(i10))).intValue();
    }

    public int a0(int i10) {
        return ((Integer) g(f17001R, Integer.valueOf(i10))).intValue();
    }

    public C4383a0 b0() {
        return (C4383a0) g(f16999P, null);
    }

    public Executor c0(Executor executor) {
        return (Executor) g(h.f8773a, executor);
    }

    public int d0() {
        return ((Integer) a(f17002S)).intValue();
    }

    public U.i e0() {
        return (U.i) g(f17003T, null);
    }

    public boolean f0() {
        return b(f16993J);
    }

    public X getConfig() {
        return this.f17006I;
    }

    public int m() {
        return ((Integer) a(C5044r0.f17008l)).intValue();
    }
}
