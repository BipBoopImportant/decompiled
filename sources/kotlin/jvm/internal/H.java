package kotlin.jvm.internal;

import uI.C18054c;
import uI.C18067p;

public abstract class H extends J implements C18067p {
    public H(Class cls, String str, String str2, int i10) {
        super(C17530f.NO_RECEIVER, cls, str, str2, i10);
    }

    /* access modifiers changed from: protected */
    public C18054c computeReflected() {
        return P.i(this);
    }

    public Object invoke(Object obj, Object obj2) {
        return A(obj, obj2);
    }

    public C18067p.a d() {
        return ((C18067p) getReflected()).d();
    }
}
