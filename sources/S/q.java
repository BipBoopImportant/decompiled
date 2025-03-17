package S;

import E.C4428k;
import H.a;
import H2.i;
import I.d;
import I.n;
import S.h;
import androidx.camera.core.impl.C5035m0;
import androidx.camera.core.impl.F;
import androidx.camera.core.impl.V;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import ob.C10101e;

public class q extends C5035m0 {

    /* renamed from: c  reason: collision with root package name */
    private final h.a f12568c;

    q(F f10, h.a aVar) {
        super(f10);
        this.f12568c = aVar;
    }

    private int t(V v10) {
        Integer num = (Integer) v10.g().g(V.f16780j, 100);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    private int u(V v10) {
        Integer num = (Integer) v10.g().g(V.f16779i, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C10101e w(List list, Void voidR) {
        return this.f12568c.a(t((V) list.get(0)), u((V) list.get(0)));
    }

    public C10101e<List<Void>> e(List<V> list, int i10, int i11) {
        boolean z10 = true;
        if (list.size() != 1) {
            z10 = false;
        }
        i.b(z10, "Only support one capture config.");
        C10101e<C4428k> o10 = o(i10, i11);
        return n.k(Collections.singletonList(d.b(o10).f(new n(o10), a.a()).f(new o(this, list), a.a()).f(new p(o10), a.a())));
    }
}
