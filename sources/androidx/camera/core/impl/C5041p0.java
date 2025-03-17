package androidx.camera.core.impl;

import C.C4383a0;
import J.n;
import androidx.camera.core.f;
import androidx.camera.core.impl.X;

/* renamed from: androidx.camera.core.impl.p0  reason: case insensitive filesystem */
public final class C5041p0 implements o1<f>, C5046s0, n {

    /* renamed from: J  reason: collision with root package name */
    public static final X.a<Integer> f16984J = X.a.a("camerax.core.imageAnalysis.backpressureStrategy", f.b.class);

    /* renamed from: K  reason: collision with root package name */
    public static final X.a<Integer> f16985K = X.a.a("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE);

    /* renamed from: L  reason: collision with root package name */
    public static final X.a<C4383a0> f16986L = X.a.a("camerax.core.imageAnalysis.imageReaderProxyProvider", C4383a0.class);

    /* renamed from: M  reason: collision with root package name */
    public static final X.a<Integer> f16987M = X.a.a("camerax.core.imageAnalysis.outputImageFormat", f.e.class);

    /* renamed from: N  reason: collision with root package name */
    public static final X.a<Boolean> f16988N;

    /* renamed from: O  reason: collision with root package name */
    public static final X.a<Boolean> f16989O;

    /* renamed from: I  reason: collision with root package name */
    private final J0 f16990I;

    static {
        Class<Boolean> cls = Boolean.class;
        f16988N = X.a.a("camerax.core.imageAnalysis.onePixelShiftEnabled", cls);
        f16989O = X.a.a("camerax.core.imageAnalysis.outputImageRotationEnabled", cls);
    }

    public C5041p0(J0 j02) {
        this.f16990I = j02;
    }

    public int X(int i10) {
        return ((Integer) g(f16984J, Integer.valueOf(i10))).intValue();
    }

    public int Y(int i10) {
        return ((Integer) g(f16985K, Integer.valueOf(i10))).intValue();
    }

    public C4383a0 Z() {
        return (C4383a0) g(f16986L, null);
    }

    public Boolean a0(Boolean bool) {
        return (Boolean) g(f16988N, bool);
    }

    public int b0(int i10) {
        return ((Integer) g(f16987M, Integer.valueOf(i10))).intValue();
    }

    public Boolean c0(Boolean bool) {
        return (Boolean) g(f16989O, bool);
    }

    public X getConfig() {
        return this.f16990I;
    }

    public int m() {
        return 35;
    }
}
