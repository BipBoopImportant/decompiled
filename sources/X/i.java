package x;

import C.C4417z;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;
import x.C6227g;

class i implements C6227g.a {

    /* renamed from: a  reason: collision with root package name */
    static final C6227g f31526a = new C6227g(new i());

    /* renamed from: b  reason: collision with root package name */
    private static final Set<C4417z> f31527b = Collections.singleton(C4417z.f5465d);

    i() {
    }

    public DynamicRangeProfiles a() {
        return null;
    }

    public Set<C4417z> b() {
        return f31527b;
    }

    public Set<C4417z> c(C4417z zVar) {
        boolean equals = C4417z.f5465d.equals(zVar);
        H2.i.b(equals, "DynamicRange is not supported: " + zVar);
        return f31527b;
    }
}
