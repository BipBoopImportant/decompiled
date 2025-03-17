package G1;

import D1.a;
import XH.C16820k;
import c2.d;
import c2.f;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"LG1/G;", "LG1/m0;", "b", "(LG1/G;)LG1/m0;", "Lc2/d;", "a", "Lc2/d;", "DefaultDensity", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class K {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final d f6264a = f.b(1.0f, 0.0f, 2, (Object) null);

    public static final m0 b(G g10) {
        m0 p02 = g10.p0();
        if (p02 != null) {
            return p02;
        }
        a.c("LayoutNode should be attached to an owner");
        throw new C16820k();
    }
}
