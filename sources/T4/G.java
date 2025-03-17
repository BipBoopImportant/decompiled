package t4;

import N3.C6668f;
import N3.O;
import N3.r;
import java.util.List;
import q3.C5807s;
import t3.B;
import t3.C5950a;
import t4.L;
import u3.g;

public final class G {

    /* renamed from: a  reason: collision with root package name */
    private final List<C5807s> f56187a;

    /* renamed from: b  reason: collision with root package name */
    private final O[] f56188b;

    /* renamed from: c  reason: collision with root package name */
    private final g f56189c = new g(new F(this));

    public G(List<C5807s> list) {
        this.f56187a = list;
        this.f56188b = new O[list.size()];
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(long j10, B b10) {
        C6668f.a(j10, b10, this.f56188b);
    }

    public void b(long j10, B b10) {
        this.f56189c.a(j10, b10);
    }

    public void c(r rVar, L.d dVar) {
        for (int i10 = 0; i10 < this.f56188b.length; i10++) {
            dVar.a();
            O t10 = rVar.t(dVar.c(), 3);
            C5807s sVar = this.f56187a.get(i10);
            String str = sVar.f28244o;
            C5950a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            String str2 = sVar.f28230a;
            if (str2 == null) {
                str2 = dVar.b();
            }
            t10.e(new C5807s.b().e0(str2).s0(str).u0(sVar.f28234e).i0(sVar.f28233d).N(sVar.f28224I).f0(sVar.f28247r).M());
            this.f56188b[i10] = t10;
        }
    }

    public void d() {
        this.f56189c.c();
    }

    public void f(int i10) {
        this.f56189c.f(i10);
    }
}
