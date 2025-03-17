package I3;

import q3.N;
import t3.C5950a;
import z3.H;

public final class D {

    /* renamed from: a  reason: collision with root package name */
    public final int f36665a;

    /* renamed from: b  reason: collision with root package name */
    public final H[] f36666b;

    /* renamed from: c  reason: collision with root package name */
    public final x[] f36667c;

    /* renamed from: d  reason: collision with root package name */
    public final N f36668d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f36669e;

    public D(H[] hArr, x[] xVarArr, N n10, Object obj) {
        C5950a.a(hArr.length == xVarArr.length);
        this.f36666b = hArr;
        this.f36667c = (x[]) xVarArr.clone();
        this.f36668d = n10;
        this.f36669e = obj;
        this.f36665a = hArr.length;
    }

    public boolean a(D d10) {
        if (d10 == null || d10.f36667c.length != this.f36667c.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.f36667c.length; i10++) {
            if (!b(d10, i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(D d10, int i10) {
        return d10 != null && t3.N.d(this.f36666b[i10], d10.f36666b[i10]) && t3.N.d(this.f36667c[i10], d10.f36667c[i10]);
    }

    public boolean c(int i10) {
        return this.f36666b[i10] != null;
    }
}
