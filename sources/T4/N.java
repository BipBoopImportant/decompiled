package t4;

import N3.C6668f;
import N3.O;
import N3.r;
import java.util.List;
import q3.C5807s;
import t3.B;
import t3.C5950a;
import t4.L;

final class N {

    /* renamed from: a  reason: collision with root package name */
    private final List<C5807s> f56245a;

    /* renamed from: b  reason: collision with root package name */
    private final O[] f56246b;

    public N(List<C5807s> list) {
        this.f56245a = list;
        this.f56246b = new O[list.size()];
    }

    public void a(long j10, B b10) {
        if (b10.a() >= 9) {
            int q10 = b10.q();
            int q11 = b10.q();
            int H10 = b10.H();
            if (q10 == 434 && q11 == 1195456820 && H10 == 3) {
                C6668f.b(j10, b10, this.f56246b);
            }
        }
    }

    public void b(r rVar, L.d dVar) {
        for (int i10 = 0; i10 < this.f56246b.length; i10++) {
            dVar.a();
            O t10 = rVar.t(dVar.c(), 3);
            C5807s sVar = this.f56245a.get(i10);
            String str = sVar.f28244o;
            C5950a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            t10.e(new C5807s.b().e0(dVar.b()).s0(str).u0(sVar.f28234e).i0(sVar.f28233d).N(sVar.f28224I).f0(sVar.f28247r).M());
            this.f56246b[i10] = t10;
        }
    }
}
