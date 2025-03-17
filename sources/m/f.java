package M;

import C.p0;
import android.media.MediaCodec;
import androidx.camera.core.impl.C5019e0;
import androidx.camera.core.impl.X0;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import androidx.camera.core.internal.compat.quirk.a;
import java.util.Collections;
import java.util.List;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f9067a;

    public f() {
        this.f9067a = a.b(SurfaceOrderQuirk.class) != null;
    }

    private int b(C5019e0 e0Var) {
        if (e0Var.g() == MediaCodec.class) {
            return 2;
        }
        return e0Var.g() == p0.class ? 0 : 1;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ int c(X0.f fVar, X0.f fVar2) {
        return b(fVar.f()) - b(fVar2.f());
    }

    public void d(List<X0.f> list) {
        if (this.f9067a) {
            Collections.sort(list, new e(this));
        }
    }
}
