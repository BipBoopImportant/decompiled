package H9;

import G9.C6521b;
import H9.C6536j;
import xa.C8972m;

public final class o0 extends k0 {

    /* renamed from: c  reason: collision with root package name */
    public final C6536j.a f36625c;

    public o0(C6536j.a aVar, C8972m mVar) {
        super(4, mVar);
        this.f36625c = aVar;
    }

    public final /* bridge */ /* synthetic */ void d(C6550y yVar, boolean z10) {
    }

    public final boolean f(I i10) {
        Y y10 = (Y) i10.v().get(this.f36625c);
        return y10 != null && y10.f36541a.f();
    }

    public final C6521b[] g(I i10) {
        Y y10 = (Y) i10.v().get(this.f36625c);
        if (y10 == null) {
            return null;
        }
        return y10.f36541a.c();
    }

    public final void h(I i10) {
        Y y10 = (Y) i10.v().remove(this.f36625c);
        if (y10 != null) {
            y10.f36542b.b(i10.t(), this.f36594b);
            y10.f36541a.a();
            return;
        }
        this.f36594b.e(Boolean.FALSE);
    }
}
