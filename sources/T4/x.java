package t4;

import N3.O;
import N3.r;
import q3.C5807s;
import t3.B;
import t3.C5950a;
import t3.H;
import t3.N;
import t4.L;

public final class x implements D {

    /* renamed from: a  reason: collision with root package name */
    private C5807s f56541a;

    /* renamed from: b  reason: collision with root package name */
    private H f56542b;

    /* renamed from: c  reason: collision with root package name */
    private O f56543c;

    public x(String str) {
        this.f56541a = new C5807s.b().s0(str).M();
    }

    private void c() {
        C5950a.i(this.f56542b);
        N.i(this.f56543c);
    }

    public void a(B b10) {
        c();
        long e10 = this.f56542b.e();
        long f10 = this.f56542b.f();
        if (e10 != -9223372036854775807L && f10 != -9223372036854775807L) {
            C5807s sVar = this.f56541a;
            if (f10 != sVar.f28249t) {
                C5807s M10 = sVar.b().w0(f10).M();
                this.f56541a = M10;
                this.f56543c.e(M10);
            }
            int a10 = b10.a();
            this.f56543c.a(b10, a10);
            this.f56543c.c(e10, 1, a10, 0, (O.a) null);
        }
    }

    public void b(H h10, r rVar, L.d dVar) {
        this.f56542b = h10;
        dVar.a();
        O t10 = rVar.t(dVar.c(), 5);
        this.f56543c = t10;
        t10.e(this.f56541a);
    }
}
