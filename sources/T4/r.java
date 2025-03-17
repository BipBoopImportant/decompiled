package t4;

import N3.O;
import q3.C5807s;
import t3.B;
import t3.C5950a;
import t3.q;
import t4.L;

public final class r implements C8788m {

    /* renamed from: a  reason: collision with root package name */
    private final B f56467a = new B(10);

    /* renamed from: b  reason: collision with root package name */
    private O f56468b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f56469c;

    /* renamed from: d  reason: collision with root package name */
    private long f56470d = -9223372036854775807L;

    /* renamed from: e  reason: collision with root package name */
    private int f56471e;

    /* renamed from: f  reason: collision with root package name */
    private int f56472f;

    public void a(B b10) {
        C5950a.i(this.f56468b);
        if (this.f56469c) {
            int a10 = b10.a();
            int i10 = this.f56472f;
            if (i10 < 10) {
                int min = Math.min(a10, 10 - i10);
                System.arraycopy(b10.e(), b10.f(), this.f56467a.e(), this.f56472f, min);
                if (this.f56472f + min == 10) {
                    this.f56467a.W(0);
                    if (73 == this.f56467a.H() && 68 == this.f56467a.H() && 51 == this.f56467a.H()) {
                        this.f56467a.X(3);
                        this.f56471e = this.f56467a.G() + 10;
                    } else {
                        q.h("Id3Reader", "Discarding invalid ID3 tag");
                        this.f56469c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a10, this.f56471e - this.f56472f);
            this.f56468b.a(b10, min2);
            this.f56472f += min2;
        }
    }

    public void c() {
        this.f56469c = false;
        this.f56470d = -9223372036854775807L;
    }

    public void d(N3.r rVar, L.d dVar) {
        dVar.a();
        O t10 = rVar.t(dVar.c(), 5);
        this.f56468b = t10;
        t10.e(new C5807s.b().e0(dVar.b()).s0("application/id3").M());
    }

    public void e(boolean z10) {
        int i10;
        C5950a.i(this.f56468b);
        if (this.f56469c && (i10 = this.f56471e) != 0 && this.f56472f == i10) {
            C5950a.g(this.f56470d != -9223372036854775807L);
            this.f56468b.c(this.f56470d, 1, this.f56471e, 0, (O.a) null);
            this.f56469c = false;
        }
    }

    public void f(long j10, int i10) {
        if ((i10 & 4) != 0) {
            this.f56469c = true;
            this.f56470d = j10;
            this.f56471e = 0;
            this.f56472f = 0;
        }
    }
}
