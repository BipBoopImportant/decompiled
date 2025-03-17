package g4;

import N3.C6656B;
import N3.C6658D;
import N3.C6660F;
import N3.C6675m;
import N3.C6678p;
import N3.C6679q;
import N3.I;
import N3.O;
import N3.r;
import N3.u;
import androidx.recyclerview.widget.RecyclerView;
import b4.h;
import b4.l;
import b4.n;
import java.io.EOFException;
import java.math.RoundingMode;
import mb.C10033d;
import nb.C10076f;
import q3.C5807s;
import q3.z;
import t3.B;
import t3.C5950a;
import t3.N;
import t3.q;

/* renamed from: g4.f  reason: case insensitive filesystem */
public final class C7870f implements C6678p {

    /* renamed from: v  reason: collision with root package name */
    public static final u f51227v = new C7868d();

    /* renamed from: w  reason: collision with root package name */
    private static final h.a f51228w = new C7869e();

    /* renamed from: a  reason: collision with root package name */
    private final int f51229a;

    /* renamed from: b  reason: collision with root package name */
    private final long f51230b;

    /* renamed from: c  reason: collision with root package name */
    private final B f51231c;

    /* renamed from: d  reason: collision with root package name */
    private final C6660F.a f51232d;

    /* renamed from: e  reason: collision with root package name */
    private final C6656B f51233e;

    /* renamed from: f  reason: collision with root package name */
    private final C6658D f51234f;

    /* renamed from: g  reason: collision with root package name */
    private final O f51235g;

    /* renamed from: h  reason: collision with root package name */
    private r f51236h;

    /* renamed from: i  reason: collision with root package name */
    private O f51237i;

    /* renamed from: j  reason: collision with root package name */
    private O f51238j;

    /* renamed from: k  reason: collision with root package name */
    private int f51239k;

    /* renamed from: l  reason: collision with root package name */
    private z f51240l;

    /* renamed from: m  reason: collision with root package name */
    private long f51241m;

    /* renamed from: n  reason: collision with root package name */
    private long f51242n;

    /* renamed from: o  reason: collision with root package name */
    private long f51243o;

    /* renamed from: p  reason: collision with root package name */
    private long f51244p;

    /* renamed from: q  reason: collision with root package name */
    private int f51245q;

    /* renamed from: r  reason: collision with root package name */
    private C7871g f51246r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f51247s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f51248t;

    /* renamed from: u  reason: collision with root package name */
    private long f51249u;

    public C7870f() {
        this(0);
    }

    private void f() {
        C5950a.i(this.f51237i);
        N.i(this.f51236h);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: g4.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: g4.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: g4.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: g4.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: g4.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: g4.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: g4.b} */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        if (r0 == null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        r0 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private g4.C7871g g(N3.C6679q r12) {
        /*
            r11 = this;
            g4.g r0 = r11.u(r12)
            q3.z r1 = r11.f51240l
            long r2 = r12.getPosition()
            g4.c r1 = t(r1, r2)
            boolean r2 = r11.f51247s
            if (r2 == 0) goto L_0x0018
            g4.g$a r12 = new g4.g$a
            r12.<init>()
            return r12
        L_0x0018:
            int r2 = r11.f51229a
            r2 = r2 & 4
            if (r2 == 0) goto L_0x004a
            if (r1 == 0) goto L_0x002b
            long r2 = r1.l()
            long r0 = r1.e()
        L_0x0028:
            r9 = r0
            r5 = r2
            goto L_0x003f
        L_0x002b:
            if (r0 == 0) goto L_0x0036
            long r2 = r0.l()
            long r0 = r0.e()
            goto L_0x0028
        L_0x0036:
            q3.z r0 = r11.f51240l
            long r2 = o(r0)
            r0 = -1
            goto L_0x0028
        L_0x003f:
            g4.b r0 = new g4.b
            long r7 = r12.getPosition()
            r4 = r0
            r4.<init>(r5, r7, r9)
            goto L_0x0052
        L_0x004a:
            if (r1 == 0) goto L_0x004e
            r0 = r1
            goto L_0x0052
        L_0x004e:
            if (r0 == 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            r1 = 1
            if (r0 == 0) goto L_0x0060
            boolean r2 = r0.f()
            if (r2 != 0) goto L_0x006c
            int r2 = r11.f51229a
            r2 = r2 & r1
            if (r2 == 0) goto L_0x006c
        L_0x0060:
            int r0 = r11.f51229a
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            r1 = 0
        L_0x0068:
            g4.g r0 = r11.n(r12, r1)
        L_0x006c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.C7870f.g(N3.q):g4.g");
    }

    private long k(long j10) {
        return this.f51241m + ((j10 * 1000000) / ((long) this.f51232d.f38756d));
    }

    private C7871g m(long j10, i iVar, long j11) {
        long j12;
        long j13;
        i iVar2 = iVar;
        long a10 = iVar.a();
        if (a10 == -9223372036854775807L) {
            return null;
        }
        long j14 = iVar2.f51257c;
        if (j14 != -1) {
            long j15 = j10 + j14;
            j12 = j14 - ((long) iVar2.f51255a.f38755c);
            j13 = j15;
        } else if (j11 == -1) {
            return null;
        } else {
            j12 = (j11 - j10) - ((long) iVar2.f51255a.f38755c);
            j13 = j11;
        }
        long j16 = j12;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        return new C7865a(j13, j10 + ((long) iVar2.f51255a.f38755c), C10076f.d(N.b1(j16, 8000000, a10, roundingMode)), C10076f.d(C10033d.b(j16, iVar2.f51256b, roundingMode)), false);
    }

    private C7871g n(C6679q qVar, boolean z10) {
        qVar.o(this.f51231c.e(), 0, 4);
        this.f51231c.W(0);
        this.f51232d.a(this.f51231c.q());
        return new C7865a(qVar.getLength(), qVar.getPosition(), this.f51232d, z10);
    }

    private static long o(z zVar) {
        if (zVar == null) {
            return -9223372036854775807L;
        }
        int e10 = zVar.e();
        for (int i10 = 0; i10 < e10; i10++) {
            z.b d10 = zVar.d(i10);
            if (d10 instanceof n) {
                n nVar = (n) d10;
                if (nVar.f45394a.equals("TLEN")) {
                    return N.P0(Long.parseLong(nVar.f45408d.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    private static int p(B b10, int i10) {
        if (b10.g() >= i10 + 4) {
            b10.W(i10);
            int q10 = b10.q();
            if (q10 == 1483304551 || q10 == 1231971951) {
                return q10;
            }
        }
        if (b10.g() < 40) {
            return 0;
        }
        b10.W(36);
        return b10.q() == 1447187017 ? 1447187017 : 0;
    }

    private static boolean q(int i10, long j10) {
        return ((long) (i10 & -128000)) == (j10 & -128000);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C6678p[] r() {
        return new C6678p[]{new C7870f()};
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean s(int i10, int i11, int i12, int i13, int i14) {
        return (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) || (i11 == 77 && i12 == 76 && i13 == 76 && (i14 == 84 || i10 == 2));
    }

    private static C7867c t(z zVar, long j10) {
        if (zVar == null) {
            return null;
        }
        int e10 = zVar.e();
        for (int i10 = 0; i10 < e10; i10++) {
            z.b d10 = zVar.d(i10);
            if (d10 instanceof l) {
                return C7867c.a(j10, (l) d10, o(zVar));
            }
        }
        return null;
    }

    private C7871g u(C6679q qVar) {
        int i10;
        int i11;
        B b10 = new B(this.f51232d.f38755c);
        qVar.o(b10.e(), 0, this.f51232d.f38755c);
        C6660F.a aVar = this.f51232d;
        int i12 = 21;
        if ((aVar.f38753a & 1) != 0) {
            if (aVar.f38757e != 1) {
                i12 = 36;
            }
        } else if (aVar.f38757e == 1) {
            i12 = 13;
        }
        int p10 = p(b10, i12);
        if (p10 != 1231971951) {
            if (p10 == 1447187017) {
                h a10 = h.a(qVar.getLength(), qVar.getPosition(), this.f51232d, b10);
                qVar.k(this.f51232d.f38755c);
                return a10;
            } else if (p10 != 1483304551) {
                qVar.f();
                return null;
            }
        }
        i b11 = i.b(this.f51232d, b10);
        if (!(this.f51233e.a() || (i10 = b11.f51258d) == -1 || (i11 = b11.f51259e) == -1)) {
            C6656B b12 = this.f51233e;
            b12.f38726a = i10;
            b12.f38727b = i11;
        }
        long position = qVar.getPosition();
        if (!(qVar.getLength() == -1 || b11.f51257c == -1 || qVar.getLength() == b11.f51257c + position)) {
            q.f("Mp3Extractor", "Data size mismatch between stream (" + qVar.getLength() + ") and Xing frame (" + (b11.f51257c + position) + "), using Xing value.");
        }
        qVar.k(this.f51232d.f38755c);
        if (p10 == 1483304551) {
            return j.a(b11, position);
        }
        return m(position, b11, qVar.getLength());
    }

    private void v() {
        C7871g gVar = this.f51246r;
        if ((gVar instanceof C7865a) && gVar.f()) {
            long j10 = this.f51244p;
            if (j10 != -1 && j10 != this.f51246r.e()) {
                this.f51246r = ((C7865a) this.f51246r).h(this.f51244p);
                ((r) C5950a.e(this.f51236h)).n(this.f51246r);
            }
        }
    }

    private boolean w(C6679q qVar) {
        C7871g gVar = this.f51246r;
        if (gVar != null) {
            long e10 = gVar.e();
            if (e10 != -1 && qVar.h() > e10 - 4) {
                return true;
            }
        }
        try {
            return !qVar.d(this.f51231c.e(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private int x(C6679q qVar) {
        if (this.f51239k == 0) {
            try {
                z(qVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f51246r == null) {
            C7871g g10 = g(qVar);
            this.f51246r = g10;
            this.f51236h.n(g10);
            C5807s.b l02 = new C5807s.b().s0(this.f51232d.f38754b).j0(RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT).Q(this.f51232d.f38757e).t0(this.f51232d.f38756d).Y(this.f51233e.f38726a).Z(this.f51233e.f38727b).l0((this.f51229a & 8) != 0 ? null : this.f51240l);
            if (this.f51246r.k() != -2147483647) {
                l02.P(this.f51246r.k());
            }
            this.f51238j.e(l02.M());
            this.f51243o = qVar.getPosition();
        } else if (this.f51243o != 0) {
            long position = qVar.getPosition();
            long j10 = this.f51243o;
            if (position < j10) {
                qVar.k((int) (j10 - position));
            }
        }
        return y(qVar);
    }

    private int y(C6679q qVar) {
        if (this.f51245q == 0) {
            qVar.f();
            if (w(qVar)) {
                return -1;
            }
            this.f51231c.W(0);
            int q10 = this.f51231c.q();
            if (!q(q10, (long) this.f51239k) || C6660F.j(q10) == -1) {
                qVar.k(1);
                this.f51239k = 0;
                return 0;
            }
            this.f51232d.a(q10);
            if (this.f51241m == -9223372036854775807L) {
                this.f51241m = this.f51246r.g(qVar.getPosition());
                if (this.f51230b != -9223372036854775807L) {
                    this.f51241m += this.f51230b - this.f51246r.g(0);
                }
            }
            this.f51245q = this.f51232d.f38755c;
            long position = qVar.getPosition();
            C6660F.a aVar = this.f51232d;
            this.f51244p = position + ((long) aVar.f38755c);
            C7871g gVar = this.f51246r;
            if (gVar instanceof C7866b) {
                C7866b bVar = (C7866b) gVar;
                bVar.b(k(this.f51242n + ((long) aVar.f38759g)), this.f51244p);
                if (this.f51248t && bVar.a(this.f51249u)) {
                    this.f51248t = false;
                    this.f51238j = this.f51237i;
                }
            }
        }
        int d10 = this.f51238j.d(qVar, this.f51245q, true);
        if (d10 == -1) {
            return -1;
        }
        int i10 = this.f51245q - d10;
        this.f51245q = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f51238j.c(k(this.f51242n), 1, this.f51232d.f38755c, 0, (O.a) null);
        this.f51242n += (long) this.f51232d.f38759g;
        this.f51245q = 0;
        return 0;
    }

    private boolean z(C6679q qVar, boolean z10) {
        int i10;
        int i11;
        int j10;
        int i12 = z10 ? 32768 : 131072;
        qVar.f();
        if (qVar.getPosition() == 0) {
            z a10 = this.f51234f.a(qVar, (this.f51229a & 8) == 0 ? null : f51228w);
            this.f51240l = a10;
            if (a10 != null) {
                this.f51233e.c(a10);
            }
            i10 = (int) qVar.h();
            if (!z10) {
                qVar.k(i10);
            }
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
        }
        int i13 = i11;
        int i14 = i13;
        while (true) {
            if (!w(qVar)) {
                this.f51231c.W(0);
                int q10 = this.f51231c.q();
                if ((i11 == 0 || q(q10, (long) i11)) && (j10 = C6660F.j(q10)) != -1) {
                    i13++;
                    if (i13 != 1) {
                        if (i13 == 4) {
                            break;
                        }
                    } else {
                        this.f51232d.a(q10);
                        i11 = q10;
                    }
                    qVar.i(j10 - 4);
                } else {
                    int i15 = i14 + 1;
                    if (i14 != i12) {
                        if (z10) {
                            qVar.f();
                            qVar.i(i10 + i15);
                        } else {
                            qVar.k(1);
                        }
                        i13 = 0;
                        i14 = i15;
                        i11 = 0;
                    } else if (z10) {
                        return false;
                    } else {
                        v();
                        throw new EOFException();
                    }
                }
            } else if (i13 <= 0) {
                v();
                throw new EOFException();
            }
        }
        if (z10) {
            qVar.k(i10 + i14);
        } else {
            qVar.f();
        }
        this.f51239k = i11;
        return true;
    }

    public void a(long j10, long j11) {
        this.f51239k = 0;
        this.f51241m = -9223372036854775807L;
        this.f51242n = 0;
        this.f51245q = 0;
        this.f51249u = j11;
        C7871g gVar = this.f51246r;
        if ((gVar instanceof C7866b) && !((C7866b) gVar).a(j11)) {
            this.f51248t = true;
            this.f51238j = this.f51235g;
        }
    }

    public void b(r rVar) {
        this.f51236h = rVar;
        O t10 = rVar.t(0, 1);
        this.f51237i = t10;
        this.f51238j = t10;
        this.f51236h.r();
    }

    public boolean h(C6679q qVar) {
        return z(qVar, true);
    }

    public int j(C6679q qVar, I i10) {
        f();
        int x10 = x(qVar);
        if (x10 == -1 && (this.f51246r instanceof C7866b)) {
            long k10 = k(this.f51242n);
            if (this.f51246r.l() != k10) {
                ((C7866b) this.f51246r).d(k10);
                this.f51236h.n(this.f51246r);
            }
        }
        return x10;
    }

    public void l() {
        this.f51247s = true;
    }

    public void release() {
    }

    public C7870f(int i10) {
        this(i10, -9223372036854775807L);
    }

    public C7870f(int i10, long j10) {
        this.f51229a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f51230b = j10;
        this.f51231c = new B(10);
        this.f51232d = new C6660F.a();
        this.f51233e = new C6656B();
        this.f51241m = -9223372036854775807L;
        this.f51234f = new C6658D();
        C6675m mVar = new C6675m();
        this.f51235g = mVar;
        this.f51238j = mVar;
        this.f51244p = -1;
    }
}
