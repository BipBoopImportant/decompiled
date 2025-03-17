package i4;

import N3.C6679q;
import N3.I;
import N3.J;
import N3.O;
import N3.r;
import q3.C5807s;
import t3.B;
import t3.C5950a;
import t3.N;

abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private final e f53115a = new e();

    /* renamed from: b  reason: collision with root package name */
    private O f53116b;

    /* renamed from: c  reason: collision with root package name */
    private r f53117c;

    /* renamed from: d  reason: collision with root package name */
    private g f53118d;

    /* renamed from: e  reason: collision with root package name */
    private long f53119e;

    /* renamed from: f  reason: collision with root package name */
    private long f53120f;

    /* renamed from: g  reason: collision with root package name */
    private long f53121g;

    /* renamed from: h  reason: collision with root package name */
    private int f53122h;

    /* renamed from: i  reason: collision with root package name */
    private int f53123i;

    /* renamed from: j  reason: collision with root package name */
    private b f53124j = new b();

    /* renamed from: k  reason: collision with root package name */
    private long f53125k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f53126l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f53127m;

    static class b {

        /* renamed from: a  reason: collision with root package name */
        C5807s f53128a;

        /* renamed from: b  reason: collision with root package name */
        g f53129b;

        b() {
        }
    }

    private static final class c implements g {
        private c() {
        }

        public J a() {
            return new J.b(-9223372036854775807L);
        }

        public long b(C6679q qVar) {
            return -1;
        }

        public void c(long j10) {
        }
    }

    private void a() {
        C5950a.i(this.f53116b);
        N.i(this.f53117c);
    }

    private boolean h(C6679q qVar) {
        while (this.f53115a.d(qVar)) {
            this.f53125k = qVar.getPosition() - this.f53120f;
            if (!i(this.f53115a.c(), this.f53120f, this.f53124j)) {
                return true;
            }
            this.f53120f = qVar.getPosition();
        }
        this.f53122h = 3;
        return false;
    }

    private int j(C6679q qVar) {
        if (!h(qVar)) {
            return -1;
        }
        C5807s sVar = this.f53124j.f53128a;
        this.f53123i = sVar.f28220E;
        if (!this.f53127m) {
            this.f53116b.e(sVar);
            this.f53127m = true;
        }
        g gVar = this.f53124j.f53129b;
        if (gVar != null) {
            this.f53118d = gVar;
        } else if (qVar.getLength() == -1) {
            this.f53118d = new c();
        } else {
            f b10 = this.f53115a.b();
            this.f53118d = new C8207a(this, this.f53120f, qVar.getLength(), (long) (b10.f53108h + b10.f53109i), b10.f53103c, (b10.f53102b & 4) != 0);
        }
        this.f53122h = 2;
        this.f53115a.f();
        return 0;
    }

    private int k(C6679q qVar, I i10) {
        C6679q qVar2 = qVar;
        long b10 = this.f53118d.b(qVar2);
        if (b10 >= 0) {
            i10.f38760a = b10;
            return 1;
        }
        if (b10 < -1) {
            e(-(b10 + 2));
        }
        if (!this.f53126l) {
            this.f53117c.n((J) C5950a.i(this.f53118d.a()));
            this.f53126l = true;
        }
        if (this.f53125k > 0 || this.f53115a.d(qVar2)) {
            this.f53125k = 0;
            B c10 = this.f53115a.c();
            long f10 = f(c10);
            if (f10 >= 0) {
                long j10 = this.f53121g;
                if (j10 + f10 >= this.f53119e) {
                    long b11 = b(j10);
                    this.f53116b.a(c10, c10.g());
                    this.f53116b.c(b11, 1, c10.g(), 0, (O.a) null);
                    this.f53119e = -1;
                }
            }
            this.f53121g += f10;
            return 0;
        }
        this.f53122h = 3;
        return -1;
    }

    /* access modifiers changed from: protected */
    public long b(long j10) {
        return (j10 * 1000000) / ((long) this.f53123i);
    }

    /* access modifiers changed from: protected */
    public long c(long j10) {
        return (((long) this.f53123i) * j10) / 1000000;
    }

    /* access modifiers changed from: package-private */
    public void d(r rVar, O o10) {
        this.f53117c = rVar;
        this.f53116b = o10;
        l(true);
    }

    /* access modifiers changed from: protected */
    public void e(long j10) {
        this.f53121g = j10;
    }

    /* access modifiers changed from: protected */
    public abstract long f(B b10);

    /* access modifiers changed from: package-private */
    public final int g(C6679q qVar, I i10) {
        a();
        int i11 = this.f53122h;
        if (i11 == 0) {
            return j(qVar);
        }
        if (i11 == 1) {
            qVar.k((int) this.f53120f);
            this.f53122h = 2;
            return 0;
        } else if (i11 == 2) {
            N.i(this.f53118d);
            return k(qVar, i10);
        } else if (i11 == 3) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean i(B b10, long j10, b bVar);

    /* access modifiers changed from: protected */
    public void l(boolean z10) {
        if (z10) {
            this.f53124j = new b();
            this.f53120f = 0;
            this.f53122h = 0;
        } else {
            this.f53122h = 1;
        }
        this.f53119e = -1;
        this.f53121g = 0;
    }

    /* access modifiers changed from: package-private */
    public final void m(long j10, long j11) {
        this.f53115a.e();
        if (j10 == 0) {
            l(!this.f53126l);
        } else if (this.f53122h != 0) {
            this.f53119e = c(j11);
            ((g) N.i(this.f53118d)).c(this.f53119e);
            this.f53122h = 2;
        }
    }
}
