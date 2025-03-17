package S;

import J.n;
import androidx.camera.core.impl.C5046s0;
import androidx.camera.core.impl.J0;
import androidx.camera.core.impl.X;
import androidx.camera.core.impl.o1;
import androidx.camera.core.impl.p1;
import java.util.List;

public class j implements o1<h>, C5046s0, n {

    /* renamed from: J  reason: collision with root package name */
    static final X.a<List<p1.b>> f12542J = X.a.a("camerax.core.streamSharing.captureTypes", List.class);

    /* renamed from: I  reason: collision with root package name */
    private final J0 f12543I;

    j(J0 j02) {
        this.f12543I = j02;
    }

    public List<p1.b> X() {
        return (List) a(f12542J);
    }

    public X getConfig() {
        return this.f12543I;
    }
}
