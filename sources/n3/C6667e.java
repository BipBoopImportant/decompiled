package N3;

import N3.J;
import t3.C5950a;
import t3.N;

/* renamed from: N3.e  reason: case insensitive filesystem */
public abstract class C6667e {

    /* renamed from: a  reason: collision with root package name */
    protected final a f38851a;

    /* renamed from: b  reason: collision with root package name */
    protected final f f38852b;

    /* renamed from: c  reason: collision with root package name */
    protected c f38853c;

    /* renamed from: d  reason: collision with root package name */
    private final int f38854d;

    /* renamed from: N3.e$a */
    public static class a implements J {

        /* renamed from: a  reason: collision with root package name */
        private final d f38855a;

        /* renamed from: b  reason: collision with root package name */
        private final long f38856b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final long f38857c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final long f38858d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final long f38859e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public final long f38860f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public final long f38861g;

        public a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f38855a = dVar;
            this.f38856b = j10;
            this.f38857c = j11;
            this.f38858d = j12;
            this.f38859e = j13;
            this.f38860f = j14;
            this.f38861g = j15;
        }

        public J.a c(long j10) {
            return new J.a(new K(j10, c.h(this.f38855a.a(j10), this.f38857c, this.f38858d, this.f38859e, this.f38860f, this.f38861g)));
        }

        public boolean f() {
            return true;
        }

        public long j(long j10) {
            return this.f38855a.a(j10);
        }

        public long l() {
            return this.f38856b;
        }
    }

    /* renamed from: N3.e$b */
    public static final class b implements d {
        public long a(long j10) {
            return j10;
        }
    }

    /* renamed from: N3.e$c */
    protected static class c {

        /* renamed from: a  reason: collision with root package name */
        private final long f38862a;

        /* renamed from: b  reason: collision with root package name */
        private final long f38863b;

        /* renamed from: c  reason: collision with root package name */
        private final long f38864c;

        /* renamed from: d  reason: collision with root package name */
        private long f38865d;

        /* renamed from: e  reason: collision with root package name */
        private long f38866e;

        /* renamed from: f  reason: collision with root package name */
        private long f38867f;

        /* renamed from: g  reason: collision with root package name */
        private long f38868g;

        /* renamed from: h  reason: collision with root package name */
        private long f38869h;

        protected c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f38862a = j10;
            this.f38863b = j11;
            this.f38865d = j12;
            this.f38866e = j13;
            this.f38867f = j14;
            this.f38868g = j15;
            this.f38864c = j16;
            this.f38869h = h(j11, j12, j13, j14, j15, j16);
        }

        protected static long h(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = (long) (((float) (j10 - j11)) * (((float) (j14 - j13)) / ((float) (j12 - j11))));
            return N.q(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        /* access modifiers changed from: private */
        public long i() {
            return this.f38868g;
        }

        /* access modifiers changed from: private */
        public long j() {
            return this.f38867f;
        }

        /* access modifiers changed from: private */
        public long k() {
            return this.f38869h;
        }

        /* access modifiers changed from: private */
        public long l() {
            return this.f38862a;
        }

        /* access modifiers changed from: private */
        public long m() {
            return this.f38863b;
        }

        private void n() {
            this.f38869h = h(this.f38863b, this.f38865d, this.f38866e, this.f38867f, this.f38868g, this.f38864c);
        }

        /* access modifiers changed from: private */
        public void o(long j10, long j11) {
            this.f38866e = j10;
            this.f38868g = j11;
            n();
        }

        /* access modifiers changed from: private */
        public void p(long j10, long j11) {
            this.f38865d = j10;
            this.f38867f = j11;
            n();
        }
    }

    /* renamed from: N3.e$d */
    protected interface d {
        long a(long j10);
    }

    /* renamed from: N3.e$e  reason: collision with other inner class name */
    public static final class C0613e {

        /* renamed from: d  reason: collision with root package name */
        public static final C0613e f38870d = new C0613e(-3, -9223372036854775807L, -1);
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f38871a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long f38872b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final long f38873c;

        private C0613e(int i10, long j10, long j11) {
            this.f38871a = i10;
            this.f38872b = j10;
            this.f38873c = j11;
        }

        public static C0613e d(long j10, long j11) {
            return new C0613e(-1, j10, j11);
        }

        public static C0613e e(long j10) {
            return new C0613e(0, -9223372036854775807L, j10);
        }

        public static C0613e f(long j10, long j11) {
            return new C0613e(-2, j10, j11);
        }
    }

    /* renamed from: N3.e$f */
    protected interface f {
        C0613e a(C6679q qVar, long j10);

        void b() {
        }
    }

    protected C6667e(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f38852b = fVar;
        this.f38854d = i10;
        this.f38851a = new a(dVar, j10, j11, j12, j13, j14, j15);
    }

    /* access modifiers changed from: protected */
    public c a(long j10) {
        long j11 = j10;
        return new c(j11, this.f38851a.j(j11), this.f38851a.f38857c, this.f38851a.f38858d, this.f38851a.f38859e, this.f38851a.f38860f, this.f38851a.f38861g);
    }

    public final J b() {
        return this.f38851a;
    }

    public int c(C6679q qVar, I i10) {
        while (true) {
            c cVar = (c) C5950a.i(this.f38853c);
            long b10 = cVar.j();
            long c10 = cVar.i();
            long d10 = cVar.k();
            if (c10 - b10 <= ((long) this.f38854d)) {
                e(false, b10);
                return g(qVar, b10, i10);
            } else if (!i(qVar, d10)) {
                return g(qVar, d10, i10);
            } else {
                qVar.f();
                C0613e a10 = this.f38852b.a(qVar, cVar.m());
                int a11 = a10.f38871a;
                if (a11 == -3) {
                    e(false, d10);
                    return g(qVar, d10, i10);
                } else if (a11 == -2) {
                    cVar.p(a10.f38872b, a10.f38873c);
                } else if (a11 == -1) {
                    cVar.o(a10.f38872b, a10.f38873c);
                } else if (a11 == 0) {
                    i(qVar, a10.f38873c);
                    e(true, a10.f38873c);
                    return g(qVar, a10.f38873c, i10);
                } else {
                    throw new IllegalStateException("Invalid case");
                }
            }
        }
    }

    public final boolean d() {
        return this.f38853c != null;
    }

    /* access modifiers changed from: protected */
    public final void e(boolean z10, long j10) {
        this.f38853c = null;
        this.f38852b.b();
        f(z10, j10);
    }

    /* access modifiers changed from: protected */
    public void f(boolean z10, long j10) {
    }

    /* access modifiers changed from: protected */
    public final int g(C6679q qVar, long j10, I i10) {
        if (j10 == qVar.getPosition()) {
            return 0;
        }
        i10.f38760a = j10;
        return 1;
    }

    public final void h(long j10) {
        c cVar = this.f38853c;
        if (cVar == null || cVar.l() != j10) {
            this.f38853c = a(j10);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean i(C6679q qVar, long j10) {
        long position = j10 - qVar.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        qVar.k((int) position);
        return true;
    }
}
