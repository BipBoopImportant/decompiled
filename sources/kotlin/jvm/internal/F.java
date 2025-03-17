package kotlin.jvm.internal;

import uI.C18054c;
import uI.C18066o;

public abstract class F extends J implements C18066o {
    public F(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    /* access modifiers changed from: protected */
    public C18054c computeReflected() {
        return P.h(this);
    }

    public Object invoke(Object obj) {
        return get(obj);
    }

    public C18066o.a d() {
        return ((C18066o) getReflected()).d();
    }
}
