package L3;

import L3.p;
import q3.S;
import t3.C5950a;
import t3.G;

final class s {

    /* renamed from: a  reason: collision with root package name */
    private final a f38234a;

    /* renamed from: b  reason: collision with root package name */
    private final p f38235b;

    /* renamed from: c  reason: collision with root package name */
    private final p.a f38236c = new p.a();

    /* renamed from: d  reason: collision with root package name */
    private final G<S> f38237d = new G<>();

    /* renamed from: e  reason: collision with root package name */
    private final G<Long> f38238e = new G<>();

    /* renamed from: f  reason: collision with root package name */
    private final t3.s f38239f = new t3.s();

    /* renamed from: g  reason: collision with root package name */
    private S f38240g;

    /* renamed from: h  reason: collision with root package name */
    private S f38241h = S.f28064e;

    /* renamed from: i  reason: collision with root package name */
    private long f38242i;

    /* renamed from: j  reason: collision with root package name */
    private long f38243j = -9223372036854775807L;

    interface a {
        void e(S s10);

        void f();

        void g(long j10, long j11, long j12, boolean z10);
    }

    public s(a aVar, p pVar) {
        this.f38234a = aVar;
        this.f38235b = pVar;
    }

    private void a() {
        C5950a.i(Long.valueOf(this.f38239f.d()));
        this.f38234a.f();
    }

    private static <T> T c(G<T> g10) {
        C5950a.a(g10.l() > 0);
        while (g10.l() > 1) {
            g10.i();
        }
        return C5950a.e(g10.i());
    }

    private boolean e(long j10) {
        Long j11 = this.f38238e.j(j10);
        if (j11 == null || j11.longValue() == this.f38242i) {
            return false;
        }
        this.f38242i = j11.longValue();
        return true;
    }

    private boolean f(long j10) {
        S j11 = this.f38237d.j(j10);
        if (j11 == null || j11.equals(S.f28064e) || j11.equals(this.f38241h)) {
            return false;
        }
        this.f38241h = j11;
        return true;
    }

    private void j(boolean z10) {
        long longValue = ((Long) C5950a.i(Long.valueOf(this.f38239f.d()))).longValue();
        if (f(longValue)) {
            this.f38234a.e(this.f38241h);
        }
        this.f38234a.g(z10 ? -1 : this.f38236c.g(), longValue, this.f38242i, this.f38235b.i());
    }

    public void b() {
        this.f38239f.a();
        this.f38243j = -9223372036854775807L;
        if (this.f38238e.l() > 0) {
            Long l10 = (Long) c(this.f38238e);
            l10.longValue();
            this.f38238e.a(0, l10);
        }
        if (this.f38240g != null) {
            this.f38237d.c();
        } else if (this.f38237d.l() > 0) {
            this.f38240g = (S) c(this.f38237d);
        }
    }

    public boolean d(long j10) {
        long j11 = this.f38243j;
        return j11 != -9223372036854775807L && j11 >= j10;
    }

    public void g(int i10, int i11) {
        this.f38240g = new S(i10, i11);
    }

    public void h(long j10, long j11) {
        this.f38238e.a(j10, Long.valueOf(j11));
    }

    public void i(long j10, long j11) {
        while (!this.f38239f.c()) {
            long b10 = this.f38239f.b();
            if (e(b10)) {
                this.f38235b.j();
            }
            int c10 = this.f38235b.c(b10, j10, j11, this.f38242i, false, this.f38236c);
            boolean z10 = true;
            if (c10 == 0 || c10 == 1) {
                this.f38243j = b10;
                if (c10 != 0) {
                    z10 = false;
                }
                j(z10);
            } else if (c10 == 2 || c10 == 3 || c10 == 4) {
                this.f38243j = b10;
                a();
            } else if (c10 != 5) {
                throw new IllegalStateException(String.valueOf(c10));
            } else {
                return;
            }
        }
    }
}
