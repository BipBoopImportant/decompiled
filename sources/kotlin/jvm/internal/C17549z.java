package kotlin.jvm.internal;

import uI.C18054c;
import uI.C18062k;
import uI.C18066o;

/* renamed from: kotlin.jvm.internal.z  reason: case insensitive filesystem */
public abstract class C17549z extends B implements C18062k {
    public C17549z(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    /* access modifiers changed from: protected */
    public C18054c computeReflected() {
        return P.e(this);
    }

    public Object invoke(Object obj) {
        return get(obj);
    }

    public C18066o.a d() {
        return ((C18062k) getReflected()).d();
    }

    public C18062k.a g() {
        return ((C18062k) getReflected()).g();
    }
}
