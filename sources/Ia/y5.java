package ia;

import K9.C6620s;
import hc.C9771d;
import java.io.UnsupportedEncodingException;

public final class y5 implements C8331p5 {

    /* renamed from: a  reason: collision with root package name */
    private final G3 f54021a;

    /* renamed from: b  reason: collision with root package name */
    private K4 f54022b = new K4();

    private y5(G3 g32, int i10) {
        this.f54021a = g32;
        K5.a();
    }

    public static C8331p5 d(G3 g32) {
        return new y5(g32, 0);
    }

    public final C8331p5 a(F3 f32) {
        this.f54021a.c(f32);
        return this;
    }

    public final C8331p5 b(K4 k42) {
        this.f54022b = k42;
        return this;
    }

    public final byte[] c(int i10, boolean z10) {
        this.f54022b.f(Boolean.valueOf(1 == (i10 ^ 1)));
        this.f54022b.e(Boolean.FALSE);
        this.f54021a.e(this.f54022b.m());
        try {
            K5.a();
            if (i10 == 0) {
                return new C9771d().j(N2.f53356a).k(true).i().b(this.f54021a.f()).getBytes("utf-8");
            }
            I3 f10 = this.f54021a.f();
            C8311n nVar = new C8311n();
            N2.f53356a.a(nVar);
            return nVar.b().a(f10);
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }

    public final String zzc() {
        N4 c10 = this.f54021a.f().c();
        return (c10 == null || C8272h2.b(c10.k())) ? "NA" : (String) C6620s.l(c10.k());
    }
}
