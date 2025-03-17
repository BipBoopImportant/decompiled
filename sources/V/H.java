package V;

import C.G0;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.Z;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class H {

    /* renamed from: a  reason: collision with root package name */
    static final H f14333a = d(0, a.INACTIVE);

    /* renamed from: b  reason: collision with root package name */
    static final Set<Integer> f14334b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{0, -1})));

    /* renamed from: c  reason: collision with root package name */
    static final H0<H> f14335c = Z.f(d(0, a.ACTIVE));

    enum a {
        ACTIVE,
        INACTIVE
    }

    H() {
    }

    static H d(int i10, a aVar) {
        return new C4922g(i10, aVar, (G0.h) null);
    }

    static H e(int i10, a aVar, G0.h hVar) {
        return new C4922g(i10, aVar, hVar);
    }

    public abstract int a();

    public abstract G0.h b();

    public abstract a c();
}
