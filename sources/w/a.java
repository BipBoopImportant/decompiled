package W;

import H2.i;
import J.n;
import V.W;
import V.h0;
import a0.i0;
import a0.k0;
import androidx.camera.core.impl.C5046s0;
import androidx.camera.core.impl.J0;
import androidx.camera.core.impl.X;
import androidx.camera.core.impl.o1;
import java.util.Objects;
import q.C5759a;

public final class a<T extends h0> implements o1<W<T>>, C5046s0, n {

    /* renamed from: J  reason: collision with root package name */
    public static final X.a<h0> f14617J = X.a.a("camerax.video.VideoCapture.videoOutput", h0.class);

    /* renamed from: K  reason: collision with root package name */
    public static final X.a<C5759a<i0, k0>> f14618K = X.a.a("camerax.video.VideoCapture.videoEncoderInfoFinder", C5759a.class);

    /* renamed from: L  reason: collision with root package name */
    public static final X.a<Boolean> f14619L = X.a.a("camerax.video.VideoCapture.forceEnableSurfaceProcessing", Boolean.class);

    /* renamed from: I  reason: collision with root package name */
    private final J0 f14620I;

    public a(J0 j02) {
        i.a(j02.b(f14617J));
        this.f14620I = j02;
    }

    public C5759a<i0, k0> X() {
        C5759a<i0, k0> aVar = (C5759a) a(f14618K);
        Objects.requireNonNull(aVar);
        return aVar;
    }

    public T Y() {
        T t10 = (h0) a(f14617J);
        Objects.requireNonNull(t10);
        return (h0) t10;
    }

    public boolean Z() {
        Boolean bool = (Boolean) g(f14619L, Boolean.FALSE);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public X getConfig() {
        return this.f14620I;
    }

    public int m() {
        return 34;
    }
}
