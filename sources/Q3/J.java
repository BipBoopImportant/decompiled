package q3;

import android.net.Uri;
import android.util.Pair;
import q3.C5791b;
import q3.w;
import t3.C5950a;
import t3.N;

public abstract class J {

    /* renamed from: a  reason: collision with root package name */
    public static final J f27893a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final String f27894b = N.A0(0);

    /* renamed from: c  reason: collision with root package name */
    private static final String f27895c = N.A0(1);

    /* renamed from: d  reason: collision with root package name */
    private static final String f27896d = N.A0(2);

    class a extends J {
        a() {
        }

        public int b(Object obj) {
            return -1;
        }

        public b g(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        public int i() {
            return 0;
        }

        public Object m(int i10) {
            throw new IndexOutOfBoundsException();
        }

        public c o(int i10, c cVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        public int p() {
            return 0;
        }
    }

    public static final class b {

        /* renamed from: h  reason: collision with root package name */
        private static final String f27897h = N.A0(0);

        /* renamed from: i  reason: collision with root package name */
        private static final String f27898i = N.A0(1);

        /* renamed from: j  reason: collision with root package name */
        private static final String f27899j = N.A0(2);

        /* renamed from: k  reason: collision with root package name */
        private static final String f27900k = N.A0(3);

        /* renamed from: l  reason: collision with root package name */
        private static final String f27901l = N.A0(4);

        /* renamed from: a  reason: collision with root package name */
        public Object f27902a;

        /* renamed from: b  reason: collision with root package name */
        public Object f27903b;

        /* renamed from: c  reason: collision with root package name */
        public int f27904c;

        /* renamed from: d  reason: collision with root package name */
        public long f27905d;

        /* renamed from: e  reason: collision with root package name */
        public long f27906e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f27907f;

        /* renamed from: g  reason: collision with root package name */
        public C5791b f27908g = C5791b.f28078g;

        public int a(int i10) {
            return this.f27908g.a(i10).f28100b;
        }

        public long b(int i10, int i11) {
            C5791b.a a10 = this.f27908g.a(i10);
            if (a10.f28100b != -1) {
                return a10.f28105g[i11];
            }
            return -9223372036854775807L;
        }

        public int c() {
            return this.f27908g.f28085b;
        }

        public int d(long j10) {
            return this.f27908g.b(j10, this.f27905d);
        }

        public int e(long j10) {
            return this.f27908g.c(j10, this.f27905d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (b.class.equals(obj.getClass())) {
                    b bVar = (b) obj;
                    return N.d(this.f27902a, bVar.f27902a) && N.d(this.f27903b, bVar.f27903b) && this.f27904c == bVar.f27904c && this.f27905d == bVar.f27905d && this.f27906e == bVar.f27906e && this.f27907f == bVar.f27907f && N.d(this.f27908g, bVar.f27908g);
                }
            }
            return false;
        }

        public long f(int i10) {
            return this.f27908g.a(i10).f28099a;
        }

        public long g() {
            return this.f27908g.f28086c;
        }

        public int h(int i10, int i11) {
            C5791b.a a10 = this.f27908g.a(i10);
            if (a10.f28100b != -1) {
                return a10.f28104f[i11];
            }
            return 0;
        }

        public int hashCode() {
            Object obj = this.f27902a;
            int i10 = 0;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f27903b;
            if (obj2 != null) {
                i10 = obj2.hashCode();
            }
            long j10 = this.f27905d;
            long j11 = this.f27906e;
            return ((((((((((hashCode + i10) * 31) + this.f27904c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f27907f ? 1 : 0)) * 31) + this.f27908g.hashCode();
        }

        public long i(int i10) {
            return this.f27908g.a(i10).f28106h;
        }

        public long j() {
            return this.f27905d;
        }

        public int k(int i10) {
            return this.f27908g.a(i10).d();
        }

        public int l(int i10, int i11) {
            return this.f27908g.a(i10).e(i11);
        }

        public long m() {
            return N.q1(this.f27906e);
        }

        public long n() {
            return this.f27906e;
        }

        public int o() {
            return this.f27908g.f28088e;
        }

        public boolean p(int i10) {
            return !this.f27908g.a(i10).f();
        }

        public boolean q(int i10) {
            return i10 == c() - 1 && this.f27908g.d(i10);
        }

        public boolean r(int i10) {
            return this.f27908g.a(i10).f28107i;
        }

        public b s(Object obj, Object obj2, int i10, long j10, long j11) {
            return t(obj, obj2, i10, j10, j11, C5791b.f28078g, false);
        }

        public b t(Object obj, Object obj2, int i10, long j10, long j11, C5791b bVar, boolean z10) {
            this.f27902a = obj;
            this.f27903b = obj2;
            this.f27904c = i10;
            this.f27905d = j10;
            this.f27906e = j11;
            this.f27908g = bVar;
            this.f27907f = z10;
            return this;
        }
    }

    public static final class c {

        /* renamed from: A  reason: collision with root package name */
        private static final String f27909A = N.A0(8);

        /* renamed from: B  reason: collision with root package name */
        private static final String f27910B = N.A0(9);

        /* renamed from: C  reason: collision with root package name */
        private static final String f27911C = N.A0(10);

        /* renamed from: D  reason: collision with root package name */
        private static final String f27912D = N.A0(11);

        /* renamed from: E  reason: collision with root package name */
        private static final String f27913E = N.A0(12);

        /* renamed from: F  reason: collision with root package name */
        private static final String f27914F = N.A0(13);

        /* renamed from: q  reason: collision with root package name */
        public static final Object f27915q = new Object();

        /* renamed from: r  reason: collision with root package name */
        private static final Object f27916r = new Object();

        /* renamed from: s  reason: collision with root package name */
        private static final w f27917s = new w.c().c("androidx.media3.common.Timeline").f(Uri.EMPTY).a();

        /* renamed from: t  reason: collision with root package name */
        private static final String f27918t = N.A0(1);

        /* renamed from: u  reason: collision with root package name */
        private static final String f27919u = N.A0(2);

        /* renamed from: v  reason: collision with root package name */
        private static final String f27920v = N.A0(3);

        /* renamed from: w  reason: collision with root package name */
        private static final String f27921w = N.A0(4);

        /* renamed from: x  reason: collision with root package name */
        private static final String f27922x = N.A0(5);

        /* renamed from: y  reason: collision with root package name */
        private static final String f27923y = N.A0(6);

        /* renamed from: z  reason: collision with root package name */
        private static final String f27924z = N.A0(7);

        /* renamed from: a  reason: collision with root package name */
        public Object f27925a = f27915q;
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public Object f27926b;

        /* renamed from: c  reason: collision with root package name */
        public w f27927c = f27917s;

        /* renamed from: d  reason: collision with root package name */
        public Object f27928d;

        /* renamed from: e  reason: collision with root package name */
        public long f27929e;

        /* renamed from: f  reason: collision with root package name */
        public long f27930f;

        /* renamed from: g  reason: collision with root package name */
        public long f27931g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f27932h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f27933i;

        /* renamed from: j  reason: collision with root package name */
        public w.g f27934j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f27935k;

        /* renamed from: l  reason: collision with root package name */
        public long f27936l;

        /* renamed from: m  reason: collision with root package name */
        public long f27937m;

        /* renamed from: n  reason: collision with root package name */
        public int f27938n;

        /* renamed from: o  reason: collision with root package name */
        public int f27939o;

        /* renamed from: p  reason: collision with root package name */
        public long f27940p;

        public long a() {
            return N.e0(this.f27931g);
        }

        public long b() {
            return N.q1(this.f27936l);
        }

        public long c() {
            return this.f27936l;
        }

        public long d() {
            return N.q1(this.f27937m);
        }

        public long e() {
            return this.f27940p;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (c.class.equals(obj.getClass())) {
                    c cVar = (c) obj;
                    return N.d(this.f27925a, cVar.f27925a) && N.d(this.f27927c, cVar.f27927c) && N.d(this.f27928d, cVar.f27928d) && N.d(this.f27934j, cVar.f27934j) && this.f27929e == cVar.f27929e && this.f27930f == cVar.f27930f && this.f27931g == cVar.f27931g && this.f27932h == cVar.f27932h && this.f27933i == cVar.f27933i && this.f27935k == cVar.f27935k && this.f27936l == cVar.f27936l && this.f27937m == cVar.f27937m && this.f27938n == cVar.f27938n && this.f27939o == cVar.f27939o && this.f27940p == cVar.f27940p;
                }
            }
            return false;
        }

        public boolean f() {
            return this.f27934j != null;
        }

        public c g(Object obj, w wVar, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, w.g gVar, long j13, long j14, int i10, int i11, long j15) {
            w.h hVar;
            w wVar2 = wVar;
            this.f27925a = obj;
            this.f27927c = wVar2 != null ? wVar2 : f27917s;
            this.f27926b = (wVar2 == null || (hVar = wVar2.f28319b) == null) ? null : hVar.f28418h;
            this.f27928d = obj2;
            this.f27929e = j10;
            this.f27930f = j11;
            this.f27931g = j12;
            this.f27932h = z10;
            this.f27933i = z11;
            this.f27934j = gVar;
            this.f27936l = j13;
            this.f27937m = j14;
            this.f27938n = i10;
            this.f27939o = i11;
            this.f27940p = j15;
            this.f27935k = false;
            return this;
        }

        public int hashCode() {
            int hashCode = (((217 + this.f27925a.hashCode()) * 31) + this.f27927c.hashCode()) * 31;
            Object obj = this.f27928d;
            int i10 = 0;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            w.g gVar = this.f27934j;
            if (gVar != null) {
                i10 = gVar.hashCode();
            }
            long j10 = this.f27929e;
            long j11 = this.f27930f;
            long j12 = this.f27931g;
            long j13 = this.f27936l;
            long j14 = this.f27937m;
            long j15 = this.f27940p;
            return ((((((((((((((((((((((hashCode2 + i10) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f27932h ? 1 : 0)) * 31) + (this.f27933i ? 1 : 0)) * 31) + (this.f27935k ? 1 : 0)) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f27938n) * 31) + this.f27939o) * 31) + ((int) (j15 ^ (j15 >>> 32)));
        }
    }

    protected J() {
    }

    public int a(boolean z10) {
        return q() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z10) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i10, b bVar, c cVar, int i11, boolean z10) {
        int i12 = f(i10, bVar).f27904c;
        if (n(i12, cVar).f27939o != i10) {
            return i10 + 1;
        }
        int e10 = e(i12, i11, z10);
        if (e10 == -1) {
            return -1;
        }
        return n(e10, cVar).f27938n;
    }

    public int e(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 == 1) {
                return i10;
            }
            if (i11 == 2) {
                return i10 == c(z10) ? a(z10) : i10 + 1;
            }
            throw new IllegalStateException();
        } else if (i10 == c(z10)) {
            return -1;
        } else {
            return i10 + 1;
        }
    }

    public boolean equals(Object obj) {
        int c10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j10 = (J) obj;
        if (j10.p() != p() || j10.i() != i()) {
            return false;
        }
        c cVar = new c();
        b bVar = new b();
        c cVar2 = new c();
        b bVar2 = new b();
        for (int i10 = 0; i10 < p(); i10++) {
            if (!n(i10, cVar).equals(j10.n(i10, cVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < i(); i11++) {
            if (!g(i11, bVar, true).equals(j10.g(i11, bVar2, true))) {
                return false;
            }
        }
        int a10 = a(true);
        if (a10 != j10.a(true) || (c10 = c(true)) != j10.c(true)) {
            return false;
        }
        while (a10 != c10) {
            int e10 = e(a10, 0, true);
            if (e10 != j10.e(a10, 0, true)) {
                return false;
            }
            a10 = e10;
        }
        return true;
    }

    public final b f(int i10, b bVar) {
        return g(i10, bVar, false);
    }

    public abstract b g(int i10, b bVar, boolean z10);

    public b h(Object obj, b bVar) {
        return g(b(obj), bVar, true);
    }

    public int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int p10 = 217 + p();
        for (int i10 = 0; i10 < p(); i10++) {
            p10 = (p10 * 31) + n(i10, cVar).hashCode();
        }
        int i11 = (p10 * 31) + i();
        for (int i12 = 0; i12 < i(); i12++) {
            i11 = (i11 * 31) + g(i12, bVar, true).hashCode();
        }
        int a10 = a(true);
        while (a10 != -1) {
            i11 = (i11 * 31) + a10;
            a10 = e(a10, 0, true);
        }
        return i11;
    }

    public abstract int i();

    public final Pair<Object, Long> j(c cVar, b bVar, int i10, long j10) {
        return (Pair) C5950a.e(k(cVar, bVar, i10, j10, 0));
    }

    public final Pair<Object, Long> k(c cVar, b bVar, int i10, long j10, long j11) {
        C5950a.c(i10, 0, p());
        o(i10, cVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = cVar.c();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = cVar.f27938n;
        f(i11, bVar);
        while (i11 < cVar.f27939o && bVar.f27906e != j10) {
            int i12 = i11 + 1;
            if (f(i12, bVar).f27906e > j10) {
                break;
            }
            i11 = i12;
        }
        g(i11, bVar, true);
        long j12 = j10 - bVar.f27906e;
        long j13 = bVar.f27905d;
        if (j13 != -9223372036854775807L) {
            j12 = Math.min(j12, j13 - 1);
        }
        return Pair.create(C5950a.e(bVar.f27903b), Long.valueOf(Math.max(0, j12)));
    }

    public int l(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 == 1) {
                return i10;
            }
            if (i11 == 2) {
                return i10 == a(z10) ? c(z10) : i10 - 1;
            }
            throw new IllegalStateException();
        } else if (i10 == a(z10)) {
            return -1;
        } else {
            return i10 - 1;
        }
    }

    public abstract Object m(int i10);

    public final c n(int i10, c cVar) {
        return o(i10, cVar, 0);
    }

    public abstract c o(int i10, c cVar, long j10);

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }

    public final boolean r(int i10, b bVar, c cVar, int i11, boolean z10) {
        return d(i10, bVar, cVar, i11, z10) == -1;
    }
}
