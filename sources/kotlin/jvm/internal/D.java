package kotlin.jvm.internal;

import uI.C18054c;
import uI.C18065n;

public abstract class D extends J implements C18065n {
    public D(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    /* access modifiers changed from: protected */
    public C18054c computeReflected() {
        return P.g(this);
    }

    public Object invoke() {
        return get();
    }

    public C18065n.a d() {
        return ((C18065n) getReflected()).d();
    }
}
