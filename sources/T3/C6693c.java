package T3;

import N3.C6678p;
import N3.C6679q;
import N3.I;
import N3.J;
import N3.r;
import N3.u;
import t3.B;
import t3.C5950a;

/* renamed from: T3.c  reason: case insensitive filesystem */
public final class C6693c implements C6678p {

    /* renamed from: q  reason: collision with root package name */
    public static final u f39983q = new C6692b();

    /* renamed from: a  reason: collision with root package name */
    private final B f39984a = new B(4);

    /* renamed from: b  reason: collision with root package name */
    private final B f39985b = new B(9);

    /* renamed from: c  reason: collision with root package name */
    private final B f39986c = new B(11);

    /* renamed from: d  reason: collision with root package name */
    private final B f39987d = new B();

    /* renamed from: e  reason: collision with root package name */
    private final C6694d f39988e = new C6694d();

    /* renamed from: f  reason: collision with root package name */
    private r f39989f;

    /* renamed from: g  reason: collision with root package name */
    private int f39990g = 1;

    /* renamed from: h  reason: collision with root package name */
    private boolean f39991h;

    /* renamed from: i  reason: collision with root package name */
    private long f39992i;

    /* renamed from: j  reason: collision with root package name */
    private int f39993j;

    /* renamed from: k  reason: collision with root package name */
    private int f39994k;

    /* renamed from: l  reason: collision with root package name */
    private int f39995l;

    /* renamed from: m  reason: collision with root package name */
    private long f39996m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f39997n;

    /* renamed from: o  reason: collision with root package name */
    private C6691a f39998o;

    /* renamed from: p  reason: collision with root package name */
    private C6696f f39999p;

    private void e() {
        if (!this.f39997n) {
            this.f39989f.n(new J.b(-9223372036854775807L));
            this.f39997n = true;
        }
    }

    private long f() {
        if (this.f39991h) {
            return this.f39992i + this.f39996m;
        }
        if (this.f39988e.d() == -9223372036854775807L) {
            return 0;
        }
        return this.f39996m;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C6678p[] g() {
        return new C6678p[]{new C6693c()};
    }

    private B k(C6679q qVar) {
        if (this.f39995l > this.f39987d.b()) {
            B b10 = this.f39987d;
            b10.U(new byte[Math.max(b10.b() * 2, this.f39995l)], 0);
        } else {
            this.f39987d.W(0);
        }
        this.f39987d.V(this.f39995l);
        qVar.readFully(this.f39987d.e(), 0, this.f39995l);
        return this.f39987d;
    }

    private boolean l(C6679q qVar) {
        boolean z10 = false;
        if (!qVar.g(this.f39985b.e(), 0, 9, true)) {
            return false;
        }
        this.f39985b.W(0);
        this.f39985b.X(4);
        int H10 = this.f39985b.H();
        boolean z11 = (H10 & 4) != 0;
        if ((H10 & 1) != 0) {
            z10 = true;
        }
        if (z11 && this.f39998o == null) {
            this.f39998o = new C6691a(this.f39989f.t(8, 1));
        }
        if (z10 && this.f39999p == null) {
            this.f39999p = new C6696f(this.f39989f.t(9, 2));
        }
        this.f39989f.r();
        this.f39993j = this.f39985b.q() - 5;
        this.f39990g = 2;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m(N3.C6679q r10) {
        /*
            r9 = this;
            long r0 = r9.f()
            int r2 = r9.f39994k
            r3 = 8
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            if (r2 != r3) goto L_0x0023
            T3.a r3 = r9.f39998o
            if (r3 == 0) goto L_0x0023
            r9.e()
            T3.a r2 = r9.f39998o
            t3.B r10 = r9.k(r10)
            boolean r10 = r2.a(r10, r0)
        L_0x0021:
            r0 = r6
            goto L_0x0075
        L_0x0023:
            r3 = 9
            if (r2 != r3) goto L_0x0039
            T3.f r3 = r9.f39999p
            if (r3 == 0) goto L_0x0039
            r9.e()
            T3.f r2 = r9.f39999p
            t3.B r10 = r9.k(r10)
            boolean r10 = r2.a(r10, r0)
            goto L_0x0021
        L_0x0039:
            r3 = 18
            if (r2 != r3) goto L_0x006e
            boolean r2 = r9.f39997n
            if (r2 != 0) goto L_0x006e
            T3.d r2 = r9.f39988e
            t3.B r10 = r9.k(r10)
            boolean r10 = r2.a(r10, r0)
            T3.d r0 = r9.f39988e
            long r0 = r0.d()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0021
            N3.r r2 = r9.f39989f
            N3.E r3 = new N3.E
            T3.d r7 = r9.f39988e
            long[] r7 = r7.e()
            T3.d r8 = r9.f39988e
            long[] r8 = r8.f()
            r3.<init>(r7, r8, r0)
            r2.n(r3)
            r9.f39997n = r6
            goto L_0x0021
        L_0x006e:
            int r0 = r9.f39995l
            r10.k(r0)
            r10 = 0
            r0 = r10
        L_0x0075:
            boolean r1 = r9.f39991h
            if (r1 != 0) goto L_0x008f
            if (r10 == 0) goto L_0x008f
            r9.f39991h = r6
            T3.d r10 = r9.f39988e
            long r1 = r10.d()
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 != 0) goto L_0x008b
            long r1 = r9.f39996m
            long r1 = -r1
            goto L_0x008d
        L_0x008b:
            r1 = 0
        L_0x008d:
            r9.f39992i = r1
        L_0x008f:
            r10 = 4
            r9.f39993j = r10
            r10 = 2
            r9.f39990g = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T3.C6693c.m(N3.q):boolean");
    }

    private boolean n(C6679q qVar) {
        if (!qVar.g(this.f39986c.e(), 0, 11, true)) {
            return false;
        }
        this.f39986c.W(0);
        this.f39994k = this.f39986c.H();
        this.f39995l = this.f39986c.K();
        this.f39996m = (long) this.f39986c.K();
        this.f39996m = (((long) (this.f39986c.H() << 24)) | this.f39996m) * 1000;
        this.f39986c.X(3);
        this.f39990g = 4;
        return true;
    }

    private void o(C6679q qVar) {
        qVar.k(this.f39993j);
        this.f39993j = 0;
        this.f39990g = 3;
    }

    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f39990g = 1;
            this.f39991h = false;
        } else {
            this.f39990g = 3;
        }
        this.f39993j = 0;
    }

    public void b(r rVar) {
        this.f39989f = rVar;
    }

    public boolean h(C6679q qVar) {
        qVar.o(this.f39984a.e(), 0, 3);
        this.f39984a.W(0);
        if (this.f39984a.K() != 4607062) {
            return false;
        }
        qVar.o(this.f39984a.e(), 0, 2);
        this.f39984a.W(0);
        if ((this.f39984a.P() & 250) != 0) {
            return false;
        }
        qVar.o(this.f39984a.e(), 0, 4);
        this.f39984a.W(0);
        int q10 = this.f39984a.q();
        qVar.f();
        qVar.i(q10);
        qVar.o(this.f39984a.e(), 0, 4);
        this.f39984a.W(0);
        return this.f39984a.q() == 0;
    }

    public int j(C6679q qVar, I i10) {
        C5950a.i(this.f39989f);
        while (true) {
            int i11 = this.f39990g;
            if (i11 != 1) {
                if (i11 == 2) {
                    o(qVar);
                } else if (i11 != 3) {
                    if (i11 != 4) {
                        throw new IllegalStateException();
                    } else if (m(qVar)) {
                        return 0;
                    }
                } else if (!n(qVar)) {
                    return -1;
                }
            } else if (!l(qVar)) {
                return -1;
            }
        }
    }

    public void release() {
    }
}
