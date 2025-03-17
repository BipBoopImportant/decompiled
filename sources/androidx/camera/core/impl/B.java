package androidx.camera.core.impl;

import androidx.camera.core.impl.X;

public interface B extends S0 {

    /* renamed from: e  reason: collision with root package name */
    public static final X.a<p1> f16715e = X.a.a("camerax.core.camera.useCaseConfigFactory", p1.class);

    /* renamed from: f  reason: collision with root package name */
    public static final X.a<C5039o0> f16716f = X.a.a("camerax.core.camera.compatibilityId", C5039o0.class);

    /* renamed from: g  reason: collision with root package name */
    public static final X.a<Integer> f16717g = X.a.a("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class);

    /* renamed from: h  reason: collision with root package name */
    public static final X.a<Z0> f16718h = X.a.a("camerax.core.camera.SessionProcessor", Z0.class);

    /* renamed from: i  reason: collision with root package name */
    public static final X.a<Boolean> f16719i;

    /* renamed from: j  reason: collision with root package name */
    public static final X.a<Boolean> f16720j;

    /* renamed from: k  reason: collision with root package name */
    public static final X.a<Boolean> f16721k;

    static {
        Class<Boolean> cls = Boolean.class;
        f16719i = X.a.a("camerax.core.camera.isZslDisabled", cls);
        f16720j = X.a.a("camerax.core.camera.isPostviewSupported", cls);
        f16721k = X.a.a("camerax.core.camera.isCaptureProcessProgressSupported", cls);
    }

    boolean M() {
        return ((Boolean) g(f16720j, Boolean.FALSE)).booleanValue();
    }

    C5039o0 Q();

    boolean R() {
        return ((Boolean) g(f16721k, Boolean.FALSE)).booleanValue();
    }

    Z0 W(Z0 z02) {
        return (Z0) g(f16718h, z02);
    }

    p1 j() {
        return (p1) g(f16715e, p1.f16991a);
    }

    int u() {
        return ((Integer) g(f16717g, 0)).intValue();
    }
}
