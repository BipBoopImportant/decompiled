package H9;

import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.n;

public final class N extends B {

    /* renamed from: c  reason: collision with root package name */
    private final f f36521c;

    public N(f fVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f36521c = fVar;
    }

    public final <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends n, A>> T a(T t10) {
        return this.f36521c.q(t10);
    }

    public final Looper c() {
        return this.f36521c.w();
    }
}
