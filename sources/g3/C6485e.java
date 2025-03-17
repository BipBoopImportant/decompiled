package G3;

import G3.C6479C;
import J3.C6569b;
import java.io.IOException;
import java.util.ArrayList;
import q3.J;
import t3.C5950a;
import t3.N;

/* renamed from: G3.e  reason: case insensitive filesystem */
public final class C6485e extends m0 {

    /* renamed from: m  reason: collision with root package name */
    private final long f35859m;

    /* renamed from: n  reason: collision with root package name */
    private final long f35860n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f35861o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f35862p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f35863q;

    /* renamed from: r  reason: collision with root package name */
    private final ArrayList<C6484d> f35864r;

    /* renamed from: s  reason: collision with root package name */
    private final J.c f35865s;

    /* renamed from: t  reason: collision with root package name */
    private a f35866t;

    /* renamed from: u  reason: collision with root package name */
    private b f35867u;

    /* renamed from: v  reason: collision with root package name */
    private long f35868v;

    /* renamed from: w  reason: collision with root package name */
    private long f35869w;

    /* renamed from: G3.e$a */
    private static final class a extends C6501v {

        /* renamed from: f  reason: collision with root package name */
        private final long f35870f;

        /* renamed from: g  reason: collision with root package name */
        private final long f35871g;

        /* renamed from: h  reason: collision with root package name */
        private final long f35872h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f35873i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(J j10, long j11, long j12) {
            super(j10);
            long j13 = j12;
            boolean z10 = false;
            if (j10.i() == 1) {
                J j14 = j10;
                J.c n10 = j10.n(0, new J.c());
                long max = Math.max(0, j11);
                if (n10.f27935k || max == 0 || n10.f27932h) {
                    long max2 = j13 == Long.MIN_VALUE ? n10.f27937m : Math.max(0, j13);
                    long j15 = n10.f27937m;
                    if (j15 != -9223372036854775807L) {
                        long j16 = max2 > j15 ? j15 : max2;
                        if (max <= j16) {
                            max2 = j16;
                        } else {
                            throw new b(2, max, j16);
                        }
                    }
                    this.f35870f = max;
                    this.f35871g = max2;
                    int i10 = (max2 > -9223372036854775807L ? 1 : (max2 == -9223372036854775807L ? 0 : -1));
                    this.f35872h = i10 == 0 ? -9223372036854775807L : max2 - max;
                    if (n10.f27933i && (i10 == 0 || (j15 != -9223372036854775807L && max2 == j15))) {
                        z10 = true;
                    }
                    this.f35873i = z10;
                    return;
                }
                throw new b(1);
            }
            throw new b(0);
        }

        public J.b g(int i10, J.b bVar, boolean z10) {
            this.f35993e.g(0, bVar, z10);
            long n10 = bVar.n() - this.f35870f;
            long j10 = this.f35872h;
            return bVar.s(bVar.f27902a, bVar.f27903b, 0, j10 == -9223372036854775807L ? -9223372036854775807L : j10 - n10, n10);
        }

        public J.c o(int i10, J.c cVar, long j10) {
            this.f35993e.o(0, cVar, 0);
            long j11 = cVar.f27940p;
            long j12 = this.f35870f;
            cVar.f27940p = j11 + j12;
            cVar.f27937m = this.f35872h;
            cVar.f27933i = this.f35873i;
            long j13 = cVar.f27936l;
            if (j13 != -9223372036854775807L) {
                long max = Math.max(j13, j12);
                cVar.f27936l = max;
                long j14 = this.f35871g;
                if (j14 != -9223372036854775807L) {
                    max = Math.min(max, j14);
                }
                cVar.f27936l = max - this.f35870f;
            }
            long q12 = N.q1(this.f35870f);
            long j15 = cVar.f27929e;
            if (j15 != -9223372036854775807L) {
                cVar.f27929e = j15 + q12;
            }
            long j16 = cVar.f27930f;
            if (j16 != -9223372036854775807L) {
                cVar.f27930f = j16 + q12;
            }
            return cVar;
        }
    }

    /* renamed from: G3.e$b */
    public static final class b extends IOException {

        /* renamed from: a  reason: collision with root package name */
        public final int f35874a;

        public b(int i10) {
            this(i10, -9223372036854775807L, -9223372036854775807L);
        }

        private static String a(int i10, long j10, long j11) {
            if (i10 == 0) {
                return "invalid period count";
            }
            boolean z10 = true;
            if (i10 == 1) {
                return "not seekable to start";
            }
            if (i10 != 2) {
                return "unknown";
            }
            if (j10 == -9223372036854775807L || j11 == -9223372036854775807L) {
                z10 = false;
            }
            C5950a.g(z10);
            return "start exceeds end. Start time: " + j10 + ", End time: " + j11;
        }

        public b(int i10, long j10, long j11) {
            super("Illegal clipping: " + a(i10, j10, j11));
            this.f35874a = i10;
        }
    }

    public C6485e(C6479C c10, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        super((C6479C) C5950a.e(c10));
        C5950a.a(j10 >= 0);
        this.f35859m = j10;
        this.f35860n = j11;
        this.f35861o = z10;
        this.f35862p = z11;
        this.f35863q = z12;
        this.f35864r = new ArrayList<>();
        this.f35865s = new J.c();
    }

    private void S(J j10) {
        long j11;
        j10.n(0, this.f35865s);
        long e10 = this.f35865s.e();
        long j12 = Long.MIN_VALUE;
        if (this.f35866t == null || this.f35864r.isEmpty() || this.f35862p) {
            long j13 = this.f35859m;
            long j14 = this.f35860n;
            if (this.f35863q) {
                long c10 = this.f35865s.c();
                j13 += c10;
                j14 += c10;
            }
            this.f35868v = e10 + j13;
            if (this.f35860n != Long.MIN_VALUE) {
                j12 = e10 + j14;
            }
            this.f35869w = j12;
            int size = this.f35864r.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f35864r.get(i10).t(this.f35868v, this.f35869w);
            }
            j11 = j13;
            j12 = j14;
        } else {
            long j15 = this.f35868v - e10;
            if (this.f35860n != Long.MIN_VALUE) {
                j12 = this.f35869w - e10;
            }
            j11 = j15;
        }
        try {
            a aVar = new a(j10, j11, j12);
            this.f35866t = aVar;
            z(aVar);
        } catch (b e11) {
            this.f35867u = e11;
            for (int i11 = 0; i11 < this.f35864r.size(); i11++) {
                this.f35864r.get(i11).q(this.f35867u);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void A() {
        super.A();
        this.f35867u = null;
        this.f35866t = null;
    }

    /* access modifiers changed from: protected */
    public void P(J j10) {
        if (this.f35867u == null) {
            S(j10);
        }
    }

    public C6478B a(C6479C.b bVar, C6569b bVar2, long j10) {
        C6484d dVar = new C6484d(this.f35949k.a(bVar, bVar2, j10), this.f35861o, this.f35868v, this.f35869w);
        this.f35864r.add(dVar);
        return dVar;
    }

    public void j() {
        b bVar = this.f35867u;
        if (bVar == null) {
            super.j();
            return;
        }
        throw bVar;
    }

    public void o(C6478B b10) {
        C5950a.g(this.f35864r.remove(b10));
        this.f35949k.o(((C6484d) b10).f35834a);
        if (this.f35864r.isEmpty() && !this.f35862p) {
            S(((a) C5950a.e(this.f35866t)).f35993e);
        }
    }
}
