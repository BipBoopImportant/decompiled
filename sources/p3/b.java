package P3;

import N3.C6661G;
import N3.C6678p;
import N3.C6679q;
import N3.I;
import N3.J;
import N3.O;
import N3.r;
import java.util.ArrayList;
import k4.s;
import k4.t;
import kb.e0;
import q3.A;
import q3.C5807s;
import t3.B;
import t3.C5950a;
import t3.q;

public final class b implements C6678p {

    /* renamed from: a  reason: collision with root package name */
    private final B f39318a;

    /* renamed from: b  reason: collision with root package name */
    private final c f39319b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f39320c;

    /* renamed from: d  reason: collision with root package name */
    private final s.a f39321d;

    /* renamed from: e  reason: collision with root package name */
    private int f39322e;

    /* renamed from: f  reason: collision with root package name */
    private r f39323f;

    /* renamed from: g  reason: collision with root package name */
    private c f39324g;

    /* renamed from: h  reason: collision with root package name */
    private long f39325h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public e[] f39326i;

    /* renamed from: j  reason: collision with root package name */
    private long f39327j;

    /* renamed from: k  reason: collision with root package name */
    private e f39328k;

    /* renamed from: l  reason: collision with root package name */
    private int f39329l;

    /* renamed from: m  reason: collision with root package name */
    private long f39330m;

    /* renamed from: n  reason: collision with root package name */
    private long f39331n;

    /* renamed from: o  reason: collision with root package name */
    private int f39332o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f39333p;

    /* renamed from: P3.b$b  reason: collision with other inner class name */
    private class C0620b implements J {

        /* renamed from: a  reason: collision with root package name */
        private final long f39334a;

        public C0620b(long j10) {
            this.f39334a = j10;
        }

        public J.a c(long j10) {
            J.a i10 = b.this.f39326i[0].i(j10);
            for (int i11 = 1; i11 < b.this.f39326i.length; i11++) {
                J.a i12 = b.this.f39326i[i11].i(j10);
                if (i12.f38761a.f38767b < i10.f38761a.f38767b) {
                    i10 = i12;
                }
            }
            return i10;
        }

        public boolean f() {
            return true;
        }

        public long l() {
            return this.f39334a;
        }
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f39336a;

        /* renamed from: b  reason: collision with root package name */
        public int f39337b;

        /* renamed from: c  reason: collision with root package name */
        public int f39338c;

        private c() {
        }

        public void a(B b10) {
            this.f39336a = b10.u();
            this.f39337b = b10.u();
            this.f39338c = 0;
        }

        public void b(B b10) {
            a(b10);
            if (this.f39336a == 1414744396) {
                this.f39338c = b10.u();
                return;
            }
            throw q3.B.a("LIST expected, found: " + this.f39336a, (Throwable) null);
        }
    }

    public b(int i10, s.a aVar) {
        this.f39321d = aVar;
        this.f39320c = (i10 & 1) != 0 ? false : true;
        this.f39318a = new B(12);
        this.f39319b = new c();
        this.f39323f = new C6661G();
        this.f39326i = new e[0];
        this.f39330m = -1;
        this.f39331n = -1;
        this.f39329l = -1;
        this.f39325h = -9223372036854775807L;
    }

    private static void e(C6679q qVar) {
        if ((qVar.getPosition() & 1) == 1) {
            qVar.k(1);
        }
    }

    private e f(int i10) {
        for (e eVar : this.f39326i) {
            if (eVar.j(i10)) {
                return eVar;
            }
        }
        return null;
    }

    private void g(B b10) {
        f c10 = f.c(1819436136, b10);
        if (c10.getType() == 1819436136) {
            c cVar = (c) c10.b(c.class);
            if (cVar != null) {
                this.f39324g = cVar;
                this.f39325h = ((long) cVar.f39341c) * ((long) cVar.f39339a);
                ArrayList arrayList = new ArrayList();
                e0<C6684a> q10 = c10.f39362a.iterator();
                int i10 = 0;
                while (q10.hasNext()) {
                    C6684a next = q10.next();
                    if (next.getType() == 1819440243) {
                        int i11 = i10 + 1;
                        e m10 = m((f) next, i10);
                        if (m10 != null) {
                            arrayList.add(m10);
                        }
                        i10 = i11;
                    }
                }
                this.f39326i = (e[]) arrayList.toArray(new e[0]);
                this.f39323f.r();
                return;
            }
            throw q3.B.a("AviHeader not found", (Throwable) null);
        }
        throw q3.B.a("Unexpected header list type " + c10.getType(), (Throwable) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [int] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void k(t3.B r10) {
        /*
            r9 = this;
            long r0 = r9.l(r10)
        L_0x0004:
            int r2 = r10.a()
            r3 = 0
            r4 = 1
            r5 = 16
            if (r2 < r5) goto L_0x002e
            int r2 = r10.u()
            int r6 = r10.u()
            int r7 = r10.u()
            long r7 = (long) r7
            long r7 = r7 + r0
            r10.u()
            P3.e r2 = r9.f(r2)
            if (r2 != 0) goto L_0x0026
            goto L_0x0004
        L_0x0026:
            r6 = r6 & r5
            if (r6 != r5) goto L_0x002a
            r3 = r4
        L_0x002a:
            r2.b(r7, r3)
            goto L_0x0004
        L_0x002e:
            P3.e[] r10 = r9.f39326i
            int r0 = r10.length
        L_0x0031:
            if (r3 >= r0) goto L_0x003b
            r1 = r10[r3]
            r1.c()
            int r3 = r3 + 1
            goto L_0x0031
        L_0x003b:
            r9.f39333p = r4
            N3.r r10 = r9.f39323f
            P3.b$b r0 = new P3.b$b
            long r1 = r9.f39325h
            r0.<init>(r1)
            r10.n(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P3.b.k(t3.B):void");
    }

    private long l(B b10) {
        long j10 = 0;
        if (b10.a() < 16) {
            return 0;
        }
        int f10 = b10.f();
        b10.X(8);
        long j11 = this.f39330m;
        if (((long) b10.u()) <= j11) {
            j10 = j11 + 8;
        }
        b10.W(f10);
        return j10;
    }

    private e m(f fVar, int i10) {
        d dVar = (d) fVar.b(d.class);
        g gVar = (g) fVar.b(g.class);
        if (dVar == null) {
            q.h("AviExtractor", "Missing Stream Header");
            return null;
        } else if (gVar == null) {
            q.h("AviExtractor", "Missing Stream Format");
            return null;
        } else {
            long a10 = dVar.a();
            C5807s sVar = gVar.f39364a;
            C5807s.b b10 = sVar.b();
            b10.d0(i10);
            int i11 = dVar.f39348f;
            if (i11 != 0) {
                b10.j0(i11);
            }
            h hVar = (h) fVar.b(h.class);
            if (hVar != null) {
                b10.g0(hVar.f39365a);
            }
            int k10 = A.k(sVar.f28244o);
            if (k10 != 1 && k10 != 2) {
                return null;
            }
            O t10 = this.f39323f.t(i10, k10);
            t10.e(b10.M());
            e eVar = new e(i10, k10, a10, dVar.f39347e, t10);
            this.f39325h = Math.max(this.f39325h, a10);
            return eVar;
        }
    }

    private int n(C6679q qVar) {
        if (qVar.getPosition() >= this.f39331n) {
            return -1;
        }
        e eVar = this.f39328k;
        if (eVar == null) {
            e(qVar);
            int i10 = 12;
            qVar.o(this.f39318a.e(), 0, 12);
            this.f39318a.W(0);
            int u10 = this.f39318a.u();
            if (u10 == 1414744396) {
                this.f39318a.W(8);
                if (this.f39318a.u() != 1769369453) {
                    i10 = 8;
                }
                qVar.k(i10);
                qVar.f();
                return 0;
            }
            int u11 = this.f39318a.u();
            if (u10 == 1263424842) {
                this.f39327j = qVar.getPosition() + ((long) u11) + 8;
                return 0;
            }
            qVar.k(8);
            qVar.f();
            e f10 = f(u10);
            if (f10 == null) {
                this.f39327j = qVar.getPosition() + ((long) u11);
                return 0;
            }
            f10.m(u11);
            this.f39328k = f10;
        } else if (eVar.l(qVar)) {
            this.f39328k = null;
        }
        return 0;
    }

    private boolean o(C6679q qVar, I i10) {
        boolean z10;
        if (this.f39327j != -1) {
            long position = qVar.getPosition();
            long j10 = this.f39327j;
            if (j10 < position || j10 > 262144 + position) {
                i10.f38760a = j10;
                z10 = true;
                this.f39327j = -1;
                return z10;
            }
            qVar.k((int) (j10 - position));
        }
        z10 = false;
        this.f39327j = -1;
        return z10;
    }

    public void a(long j10, long j11) {
        this.f39327j = -1;
        this.f39328k = null;
        for (e n10 : this.f39326i) {
            n10.n(j10);
        }
        if (j10 != 0) {
            this.f39322e = 6;
        } else if (this.f39326i.length == 0) {
            this.f39322e = 0;
        } else {
            this.f39322e = 3;
        }
    }

    public void b(r rVar) {
        this.f39322e = 0;
        if (this.f39320c) {
            rVar = new t(rVar, this.f39321d);
        }
        this.f39323f = rVar;
        this.f39327j = -1;
    }

    public boolean h(C6679q qVar) {
        qVar.o(this.f39318a.e(), 0, 12);
        this.f39318a.W(0);
        if (this.f39318a.u() != 1179011410) {
            return false;
        }
        this.f39318a.X(4);
        return this.f39318a.u() == 541677121;
    }

    public int j(C6679q qVar, I i10) {
        if (o(qVar, i10)) {
            return 1;
        }
        switch (this.f39322e) {
            case 0:
                if (h(qVar)) {
                    qVar.k(12);
                    this.f39322e = 1;
                    return 0;
                }
                throw q3.B.a("AVI Header List not found", (Throwable) null);
            case 1:
                qVar.readFully(this.f39318a.e(), 0, 12);
                this.f39318a.W(0);
                this.f39319b.b(this.f39318a);
                c cVar = this.f39319b;
                if (cVar.f39338c == 1819436136) {
                    this.f39329l = cVar.f39337b;
                    this.f39322e = 2;
                    return 0;
                }
                throw q3.B.a("hdrl expected, found: " + this.f39319b.f39338c, (Throwable) null);
            case 2:
                int i11 = this.f39329l - 4;
                B b10 = new B(i11);
                qVar.readFully(b10.e(), 0, i11);
                g(b10);
                this.f39322e = 3;
                return 0;
            case 3:
                if (this.f39330m != -1) {
                    long position = qVar.getPosition();
                    long j10 = this.f39330m;
                    if (position != j10) {
                        this.f39327j = j10;
                        return 0;
                    }
                }
                qVar.o(this.f39318a.e(), 0, 12);
                qVar.f();
                this.f39318a.W(0);
                this.f39319b.a(this.f39318a);
                int u10 = this.f39318a.u();
                int i12 = this.f39319b.f39336a;
                if (i12 == 1179011410) {
                    qVar.k(12);
                    return 0;
                } else if (i12 == 1414744396 && u10 == 1769369453) {
                    long position2 = qVar.getPosition();
                    this.f39330m = position2;
                    this.f39331n = position2 + ((long) this.f39319b.f39337b) + 8;
                    if (!this.f39333p) {
                        if (((c) C5950a.e(this.f39324g)).a()) {
                            this.f39322e = 4;
                            this.f39327j = this.f39331n;
                            return 0;
                        }
                        this.f39323f.n(new J.b(this.f39325h));
                        this.f39333p = true;
                    }
                    this.f39327j = qVar.getPosition() + 12;
                    this.f39322e = 6;
                    return 0;
                } else {
                    this.f39327j = qVar.getPosition() + ((long) this.f39319b.f39337b) + 8;
                    return 0;
                }
            case 4:
                qVar.readFully(this.f39318a.e(), 0, 8);
                this.f39318a.W(0);
                int u11 = this.f39318a.u();
                int u12 = this.f39318a.u();
                if (u11 == 829973609) {
                    this.f39322e = 5;
                    this.f39332o = u12;
                } else {
                    this.f39327j = qVar.getPosition() + ((long) u12);
                }
                return 0;
            case 5:
                B b11 = new B(this.f39332o);
                qVar.readFully(b11.e(), 0, this.f39332o);
                k(b11);
                this.f39322e = 6;
                this.f39327j = this.f39330m;
                return 0;
            case 6:
                return n(qVar);
            default:
                throw new AssertionError();
        }
    }

    public void release() {
    }
}
