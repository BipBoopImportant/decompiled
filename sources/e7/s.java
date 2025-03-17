package E7;

import C7.f;
import java.util.HashMap;
import java.util.Map;

final class s {

    /* renamed from: a  reason: collision with root package name */
    private final Map<f, l<?>> f35196a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<f, l<?>> f35197b = new HashMap();

    s() {
    }

    private Map<f, l<?>> b(boolean z10) {
        return z10 ? this.f35197b : this.f35196a;
    }

    /* access modifiers changed from: package-private */
    public l<?> a(f fVar, boolean z10) {
        return b(z10).get(fVar);
    }

    /* access modifiers changed from: package-private */
    public void c(f fVar, l<?> lVar) {
        b(lVar.p()).put(fVar, lVar);
    }

    /* access modifiers changed from: package-private */
    public void d(f fVar, l<?> lVar) {
        Map<f, l<?>> b10 = b(lVar.p());
        if (lVar.equals(b10.get(fVar))) {
            b10.remove(fVar);
        }
    }
}
