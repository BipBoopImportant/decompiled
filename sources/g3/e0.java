package G3;

import G3.C6478B;
import G3.J;
import I3.x;
import J3.j;
import J3.l;
import androidx.media3.exoplayer.Y;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import q3.A;
import q3.C5807s;
import q3.K;
import t3.C5950a;
import t3.N;
import t3.q;
import w3.C;
import w3.g;
import w3.k;
import y3.f;
import z3.D;

final class e0 implements C6478B, l.b<c> {

    /* renamed from: a  reason: collision with root package name */
    private final k f35875a;

    /* renamed from: b  reason: collision with root package name */
    private final g.a f35876b;

    /* renamed from: c  reason: collision with root package name */
    private final C f35877c;

    /* renamed from: d  reason: collision with root package name */
    private final j f35878d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final J.a f35879e;

    /* renamed from: f  reason: collision with root package name */
    private final k0 f35880f;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList<b> f35881g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private final long f35882h;

    /* renamed from: i  reason: collision with root package name */
    final l f35883i = new l("SingleSampleMediaPeriod");

    /* renamed from: j  reason: collision with root package name */
    final C5807s f35884j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f35885k;

    /* renamed from: l  reason: collision with root package name */
    boolean f35886l;

    /* renamed from: m  reason: collision with root package name */
    byte[] f35887m;

    /* renamed from: n  reason: collision with root package name */
    int f35888n;

    private final class b implements a0 {

        /* renamed from: a  reason: collision with root package name */
        private int f35889a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f35890b;

        private b() {
        }

        private void a() {
            if (!this.f35890b) {
                e0.this.f35879e.i(A.k(e0.this.f35884j.f28244o), e0.this.f35884j, 0, (Object) null, 0);
                this.f35890b = true;
            }
        }

        public void b() {
            if (this.f35889a == 2) {
                this.f35889a = 1;
            }
        }

        public boolean f() {
            return e0.this.f35886l;
        }

        public void g() {
            e0 e0Var = e0.this;
            if (!e0Var.f35885k) {
                e0Var.f35883i.j();
            }
        }

        public int h(D d10, f fVar, int i10) {
            a();
            e0 e0Var = e0.this;
            boolean z10 = e0Var.f35886l;
            if (z10 && e0Var.f35887m == null) {
                this.f35889a = 2;
            }
            int i11 = this.f35889a;
            if (i11 == 2) {
                fVar.n(4);
                return -4;
            } else if ((i10 & 2) != 0 || i11 == 0) {
                d10.f32383b = e0Var.f35884j;
                this.f35889a = 1;
                return -5;
            } else if (!z10) {
                return -3;
            } else {
                C5950a.e(e0Var.f35887m);
                fVar.n(1);
                fVar.f32281f = 0;
                if ((i10 & 4) == 0) {
                    fVar.K(e0.this.f35888n);
                    ByteBuffer byteBuffer = fVar.f32279d;
                    e0 e0Var2 = e0.this;
                    byteBuffer.put(e0Var2.f35887m, 0, e0Var2.f35888n);
                }
                if ((i10 & 1) == 0) {
                    this.f35889a = 2;
                }
                return -4;
            }
        }

        public int i(long j10) {
            a();
            if (j10 <= 0 || this.f35889a == 2) {
                return 0;
            }
            this.f35889a = 2;
            return 1;
        }
    }

    static final class c implements l.e {

        /* renamed from: a  reason: collision with root package name */
        public final long f35892a = C6503x.a();

        /* renamed from: b  reason: collision with root package name */
        public final k f35893b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final w3.A f35894c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public byte[] f35895d;

        public c(k kVar, g gVar) {
            this.f35893b = kVar;
            this.f35894c = new w3.A(gVar);
        }

        public void b() {
            this.f35894c.s();
            try {
                this.f35894c.b(this.f35893b);
                int i10 = 0;
                while (i10 != -1) {
                    int p10 = (int) this.f35894c.p();
                    byte[] bArr = this.f35895d;
                    if (bArr == null) {
                        this.f35895d = new byte[1024];
                    } else if (p10 == bArr.length) {
                        this.f35895d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    w3.A a10 = this.f35894c;
                    byte[] bArr2 = this.f35895d;
                    i10 = a10.c(bArr2, p10, bArr2.length - p10);
                }
                w3.j.a(this.f35894c);
            } catch (Throwable th2) {
                w3.j.a(this.f35894c);
                throw th2;
            }
        }

        public void c() {
        }
    }

    public e0(k kVar, g.a aVar, C c10, C5807s sVar, long j10, j jVar, J.a aVar2, boolean z10) {
        this.f35875a = kVar;
        this.f35876b = aVar;
        this.f35877c = c10;
        this.f35884j = sVar;
        this.f35882h = j10;
        this.f35878d = jVar;
        this.f35879e = aVar2;
        this.f35885k = z10;
        this.f35880f = new k0(new K(sVar));
    }

    public boolean a() {
        return this.f35883i.i();
    }

    public boolean b(Y y10) {
        if (this.f35886l || this.f35883i.i() || this.f35883i.h()) {
            return false;
        }
        g a10 = this.f35876b.a();
        C c10 = this.f35877c;
        if (c10 != null) {
            a10.l(c10);
        }
        c cVar = new c(this.f35875a, a10);
        this.f35879e.w(new C6503x(cVar.f35892a, this.f35875a, this.f35883i.n(cVar, this, this.f35878d.b(1))), 1, -1, this.f35884j, 0, (Object) null, 0, this.f35882h);
        return true;
    }

    public long c() {
        return (this.f35886l || this.f35883i.i()) ? Long.MIN_VALUE : 0;
    }

    public long d() {
        return this.f35886l ? Long.MIN_VALUE : 0;
    }

    public void e(long j10) {
    }

    public long g(x[] xVarArr, boolean[] zArr, a0[] a0VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < xVarArr.length; i10++) {
            a0 a0Var = a0VarArr[i10];
            if (a0Var != null && (xVarArr[i10] == null || !zArr[i10])) {
                this.f35881g.remove(a0Var);
                a0VarArr[i10] = null;
            }
            if (a0VarArr[i10] == null && xVarArr[i10] != null) {
                b bVar = new b();
                this.f35881g.add(bVar);
                a0VarArr[i10] = bVar;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    public long i(long j10) {
        for (int i10 = 0; i10 < this.f35881g.size(); i10++) {
            this.f35881g.get(i10).b();
        }
        return j10;
    }

    public void j(C6478B.a aVar, long j10) {
        aVar.f(this);
    }

    public long l() {
        return -9223372036854775807L;
    }

    /* renamed from: m */
    public void v(c cVar, long j10, long j11, boolean z10) {
        c cVar2 = cVar;
        w3.A a10 = cVar.f35894c;
        C6503x xVar = new C6503x(cVar2.f35892a, cVar2.f35893b, a10.q(), a10.r(), j10, j11, a10.p());
        this.f35878d.c(cVar2.f35892a);
        this.f35879e.q(xVar, 1, -1, (C5807s) null, 0, (Object) null, 0, this.f35882h);
    }

    /* renamed from: n */
    public void k(c cVar, long j10, long j11) {
        c cVar2 = cVar;
        this.f35888n = (int) cVar.f35894c.p();
        this.f35887m = (byte[]) C5950a.e(cVar.f35895d);
        this.f35886l = true;
        w3.A a10 = cVar.f35894c;
        C6503x xVar = new C6503x(cVar2.f35892a, cVar2.f35893b, a10.q(), a10.r(), j10, j11, (long) this.f35888n);
        this.f35878d.c(cVar2.f35892a);
        this.f35879e.s(xVar, 1, -1, this.f35884j, 0, (Object) null, 0, this.f35882h);
    }

    public void o() {
    }

    public long p(long j10, z3.J j11) {
        return j10;
    }

    /* renamed from: r */
    public l.c q(c cVar, long j10, long j11, IOException iOException, int i10) {
        l.c g10;
        c cVar2 = cVar;
        IOException iOException2 = iOException;
        int i11 = i10;
        w3.A a10 = cVar.f35894c;
        C6503x xVar = new C6503x(cVar2.f35892a, cVar2.f35893b, a10.q(), a10.r(), j10, j11, a10.p());
        long a11 = this.f35878d.a(new j.a(xVar, new C6477A(1, -1, this.f35884j, 0, (Object) null, 0, N.q1(this.f35882h)), iOException2, i11));
        int i12 = (a11 > -9223372036854775807L ? 1 : (a11 == -9223372036854775807L ? 0 : -1));
        boolean z10 = i12 == 0 || i11 >= this.f35878d.b(1);
        if (!this.f35885k || !z10) {
            g10 = i12 != 0 ? l.g(false, a11) : l.f37303g;
        } else {
            q.i("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException2);
            this.f35886l = true;
            g10 = l.f37302f;
        }
        l.c cVar3 = g10;
        boolean c10 = cVar3.c();
        this.f35879e.u(xVar, 1, -1, this.f35884j, 0, (Object) null, 0, this.f35882h, iOException, !c10);
        if (!c10) {
            this.f35878d.c(cVar2.f35892a);
        }
        return cVar3;
    }

    public k0 s() {
        return this.f35880f;
    }

    public void t() {
        this.f35883i.l();
    }

    public void u(long j10, boolean z10) {
    }
}
