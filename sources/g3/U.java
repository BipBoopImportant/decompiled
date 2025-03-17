package G3;

import C3.t;
import C3.u;
import G3.C6478B;
import G3.C6502w;
import G3.J;
import G3.Z;
import I3.x;
import J3.C6569b;
import J3.j;
import J3.l;
import K3.C6579a;
import N3.C6655A;
import N3.C6675m;
import N3.I;
import N3.J;
import N3.O;
import N3.r;
import a4.C6741b;
import android.net.Uri;
import android.os.Handler;
import androidx.media3.exoplayer.Y;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import q3.C5799j;
import q3.C5807s;
import q3.K;
import q3.z;
import t3.B;
import t3.C5950a;
import t3.C5956g;
import t3.N;
import t3.q;
import w3.A;
import w3.g;
import w3.k;
import z3.D;

final class U implements C6478B, r, l.b<b>, l.f, Z.d {
    /* access modifiers changed from: private */

    /* renamed from: Q  reason: collision with root package name */
    public static final Map<String, String> f35683Q = N();
    /* access modifiers changed from: private */

    /* renamed from: R  reason: collision with root package name */
    public static final C5807s f35684R = new C5807s.b().e0("icy").s0("application/x-icy").M();

    /* renamed from: A  reason: collision with root package name */
    private f f35685A;

    /* renamed from: B  reason: collision with root package name */
    private J f35686B;
    /* access modifiers changed from: private */

    /* renamed from: C  reason: collision with root package name */
    public long f35687C;

    /* renamed from: D  reason: collision with root package name */
    private boolean f35688D;

    /* renamed from: E  reason: collision with root package name */
    private int f35689E;

    /* renamed from: F  reason: collision with root package name */
    private boolean f35690F;

    /* renamed from: G  reason: collision with root package name */
    private boolean f35691G;

    /* renamed from: H  reason: collision with root package name */
    private boolean f35692H;

    /* renamed from: I  reason: collision with root package name */
    private int f35693I;

    /* renamed from: J  reason: collision with root package name */
    private boolean f35694J;

    /* renamed from: K  reason: collision with root package name */
    private long f35695K;

    /* renamed from: L  reason: collision with root package name */
    private long f35696L;

    /* renamed from: M  reason: collision with root package name */
    private boolean f35697M;

    /* renamed from: N  reason: collision with root package name */
    private int f35698N;

    /* renamed from: O  reason: collision with root package name */
    private boolean f35699O;

    /* renamed from: P  reason: collision with root package name */
    private boolean f35700P;

    /* renamed from: a  reason: collision with root package name */
    private final Uri f35701a;

    /* renamed from: b  reason: collision with root package name */
    private final g f35702b;

    /* renamed from: c  reason: collision with root package name */
    private final u f35703c;

    /* renamed from: d  reason: collision with root package name */
    private final j f35704d;

    /* renamed from: e  reason: collision with root package name */
    private final J.a f35705e;

    /* renamed from: f  reason: collision with root package name */
    private final t.a f35706f;

    /* renamed from: g  reason: collision with root package name */
    private final c f35707g;

    /* renamed from: h  reason: collision with root package name */
    private final C6569b f35708h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final String f35709i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final long f35710j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f35711k;

    /* renamed from: l  reason: collision with root package name */
    private final long f35712l;

    /* renamed from: m  reason: collision with root package name */
    private final l f35713m;

    /* renamed from: n  reason: collision with root package name */
    private final O f35714n;

    /* renamed from: o  reason: collision with root package name */
    private final C5956g f35715o;

    /* renamed from: p  reason: collision with root package name */
    private final Runnable f35716p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final Runnable f35717q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final Handler f35718r;

    /* renamed from: s  reason: collision with root package name */
    private C6478B.a f35719s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public C6741b f35720t;

    /* renamed from: u  reason: collision with root package name */
    private Z[] f35721u;

    /* renamed from: v  reason: collision with root package name */
    private e[] f35722v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f35723w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f35724x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f35725y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f35726z;

    class a extends C6655A {
        a(N3.J j10) {
            super(j10);
        }

        public long l() {
            return U.this.f35687C;
        }
    }

    final class b implements l.e, C6502w.a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final long f35728a = C6503x.a();

        /* renamed from: b  reason: collision with root package name */
        private final Uri f35729b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final A f35730c;

        /* renamed from: d  reason: collision with root package name */
        private final O f35731d;

        /* renamed from: e  reason: collision with root package name */
        private final r f35732e;

        /* renamed from: f  reason: collision with root package name */
        private final C5956g f35733f;

        /* renamed from: g  reason: collision with root package name */
        private final I f35734g = new I();

        /* renamed from: h  reason: collision with root package name */
        private volatile boolean f35735h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f35736i = true;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public long f35737j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public k f35738k = i(0);

        /* renamed from: l  reason: collision with root package name */
        private O f35739l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f35740m;

        public b(Uri uri, g gVar, O o10, r rVar, C5956g gVar2) {
            this.f35729b = uri;
            this.f35730c = new A(gVar);
            this.f35731d = o10;
            this.f35732e = rVar;
            this.f35733f = gVar2;
        }

        private k i(long j10) {
            return new k.b().i(this.f35729b).h(j10).f(U.this.f35709i).b(6).e(U.f35683Q).a();
        }

        /* access modifiers changed from: private */
        public void j(long j10, long j11) {
            this.f35734g.f38760a = j10;
            this.f35737j = j11;
            this.f35736i = true;
            this.f35740m = false;
        }

        public void a(B b10) {
            long max = !this.f35740m ? this.f35737j : Math.max(U.this.P(true), this.f35737j);
            int a10 = b10.a();
            O o10 = (O) C5950a.e(this.f35739l);
            o10.a(b10, a10);
            o10.c(max, 1, a10, 0, (O.a) null);
            this.f35740m = true;
        }

        public void b() {
            int i10 = 0;
            while (i10 == 0 && !this.f35735h) {
                try {
                    long j10 = this.f35734g.f38760a;
                    k i11 = i(j10);
                    this.f35738k = i11;
                    long b10 = this.f35730c.b(i11);
                    if (this.f35735h) {
                        if (!(i10 == 1 || this.f35731d.e() == -1)) {
                            this.f35734g.f38760a = this.f35731d.e();
                        }
                        w3.j.a(this.f35730c);
                        return;
                    }
                    if (b10 != -1) {
                        b10 += j10;
                        U.this.b0();
                    }
                    long j11 = b10;
                    C6741b unused = U.this.f35720t = C6741b.a(this.f35730c.e());
                    C5799j jVar = this.f35730c;
                    if (!(U.this.f35720t == null || U.this.f35720t.f41435f == -1)) {
                        jVar = new C6502w(this.f35730c, U.this.f35720t.f41435f, this);
                        O Q10 = U.this.Q();
                        this.f35739l = Q10;
                        Q10.e(U.f35684R);
                    }
                    long j12 = j10;
                    this.f35731d.d(jVar, this.f35729b, this.f35730c.e(), j10, j11, this.f35732e);
                    if (U.this.f35720t != null) {
                        this.f35731d.b();
                    }
                    if (this.f35736i) {
                        this.f35731d.a(j12, this.f35737j);
                        this.f35736i = false;
                    }
                    while (true) {
                        long j13 = j12;
                        while (i10 == 0 && !this.f35735h) {
                            this.f35733f.a();
                            i10 = this.f35731d.c(this.f35734g);
                            j12 = this.f35731d.e();
                            if (j12 > U.this.f35710j + j13) {
                                this.f35733f.c();
                                U.this.f35718r.post(U.this.f35717q);
                            }
                        }
                    }
                    if (i10 == 1) {
                        i10 = 0;
                    } else if (this.f35731d.e() != -1) {
                        this.f35734g.f38760a = this.f35731d.e();
                    }
                    w3.j.a(this.f35730c);
                } catch (InterruptedException unused2) {
                    throw new InterruptedIOException();
                } catch (Throwable th2) {
                    if (!(i10 == 1 || this.f35731d.e() == -1)) {
                        this.f35734g.f38760a = this.f35731d.e();
                    }
                    w3.j.a(this.f35730c);
                    throw th2;
                }
            }
        }

        public void c() {
            this.f35735h = true;
        }
    }

    interface c {
        void i(long j10, boolean z10, boolean z11);
    }

    private final class d implements a0 {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f35742a;

        public d(int i10) {
            this.f35742a = i10;
        }

        public boolean f() {
            return U.this.S(this.f35742a);
        }

        public void g() {
            U.this.a0(this.f35742a);
        }

        public int h(D d10, y3.f fVar, int i10) {
            return U.this.g0(this.f35742a, d10, fVar, i10);
        }

        public int i(long j10) {
            return U.this.k0(this.f35742a, j10);
        }
    }

    private static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f35744a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f35745b;

        public e(int i10, boolean z10) {
            this.f35744a = i10;
            this.f35745b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f35744a == eVar.f35744a && this.f35745b == eVar.f35745b;
        }

        public int hashCode() {
            return (this.f35744a * 31) + (this.f35745b ? 1 : 0);
        }
    }

    private static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final k0 f35746a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f35747b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean[] f35748c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean[] f35749d;

        public f(k0 k0Var, boolean[] zArr) {
            this.f35746a = k0Var;
            this.f35747b = zArr;
            int i10 = k0Var.f35939a;
            this.f35748c = new boolean[i10];
            this.f35749d = new boolean[i10];
        }
    }

    public U(Uri uri, g gVar, O o10, u uVar, t.a aVar, j jVar, J.a aVar2, c cVar, C6569b bVar, String str, int i10, boolean z10, long j10, C6579a aVar3) {
        C6579a aVar4 = aVar3;
        this.f35701a = uri;
        this.f35702b = gVar;
        this.f35703c = uVar;
        this.f35706f = aVar;
        this.f35704d = jVar;
        this.f35705e = aVar2;
        this.f35707g = cVar;
        this.f35708h = bVar;
        this.f35709i = str;
        this.f35710j = (long) i10;
        this.f35711k = z10;
        this.f35713m = aVar4 != null ? new l(aVar4) : new l("ProgressiveMediaPeriod");
        this.f35714n = o10;
        this.f35712l = j10;
        this.f35715o = new C5956g();
        this.f35716p = new Q(this);
        this.f35717q = new S(this);
        this.f35718r = N.A();
        this.f35722v = new e[0];
        this.f35721u = new Z[0];
        this.f35696L = -9223372036854775807L;
        this.f35689E = 1;
    }

    private void L() {
        C5950a.g(this.f35724x);
        C5950a.e(this.f35685A);
        C5950a.e(this.f35686B);
    }

    private boolean M(b bVar, int i10) {
        N3.J j10;
        if (this.f35694J || !((j10 = this.f35686B) == null || j10.l() == -9223372036854775807L)) {
            this.f35698N = i10;
            return true;
        }
        if (!this.f35724x || m0()) {
            this.f35691G = this.f35724x;
            this.f35695K = 0;
            this.f35698N = 0;
            for (Z P10 : this.f35721u) {
                P10.P();
            }
            bVar.j(0, 0);
            return true;
        }
        this.f35697M = true;
        return false;
    }

    private static Map<String, String> N() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(hashMap);
    }

    private int O() {
        int i10 = 0;
        for (Z C10 : this.f35721u) {
            i10 += C10.C();
        }
        return i10;
    }

    /* access modifiers changed from: private */
    public long P(boolean z10) {
        long j10 = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.f35721u.length; i10++) {
            if (z10 || ((f) C5950a.e(this.f35685A)).f35748c[i10]) {
                j10 = Math.max(j10, this.f35721u[i10].v());
            }
        }
        return j10;
    }

    private boolean R() {
        return this.f35696L != -9223372036854775807L;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void T() {
        if (!this.f35700P) {
            ((C6478B.a) C5950a.e(this.f35719s)).h(this);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void U() {
        this.f35694J = true;
    }

    /* access modifiers changed from: private */
    public void W() {
        if (!this.f35700P && !this.f35724x && this.f35723w && this.f35686B != null) {
            Z[] zArr = this.f35721u;
            int length = zArr.length;
            int i10 = 0;
            while (i10 < length) {
                if (zArr[i10].B() != null) {
                    i10++;
                } else {
                    return;
                }
            }
            this.f35715o.c();
            int length2 = this.f35721u.length;
            K[] kArr = new K[length2];
            boolean[] zArr2 = new boolean[length2];
            for (int i11 = 0; i11 < length2; i11++) {
                C5807s sVar = (C5807s) C5950a.e(this.f35721u[i11].B());
                String str = sVar.f28244o;
                boolean n10 = q3.A.n(str);
                boolean z10 = n10 || q3.A.q(str);
                zArr2[i11] = z10;
                this.f35725y = z10 | this.f35725y;
                this.f35726z = this.f35712l != -9223372036854775807L && length2 == 1 && q3.A.o(str);
                C6741b bVar = this.f35720t;
                if (bVar != null) {
                    if (n10 || this.f35722v[i11].f35745b) {
                        z zVar = sVar.f28241l;
                        sVar = sVar.b().l0(zVar == null ? new z(bVar) : zVar.a(bVar)).M();
                    }
                    if (n10 && sVar.f28237h == -1 && sVar.f28238i == -1 && bVar.f41430a != -1) {
                        sVar = sVar.b().P(bVar.f41430a).M();
                    }
                }
                C5807s c10 = sVar.c(this.f35703c.g(sVar));
                kArr[i11] = new K(Integer.toString(i11), c10);
                this.f35692H = c10.f28250u | this.f35692H;
            }
            this.f35685A = new f(new k0(kArr), zArr2);
            if (this.f35726z && this.f35687C == -9223372036854775807L) {
                this.f35687C = this.f35712l;
                this.f35686B = new a(this.f35686B);
            }
            this.f35707g.i(this.f35687C, this.f35686B.f(), this.f35688D);
            this.f35724x = true;
            ((C6478B.a) C5950a.e(this.f35719s)).f(this);
        }
    }

    private void X(int i10) {
        L();
        f fVar = this.f35685A;
        boolean[] zArr = fVar.f35749d;
        if (!zArr[i10]) {
            C5807s a10 = fVar.f35746a.b(i10).a(0);
            this.f35705e.i(q3.A.k(a10.f28244o), a10, 0, (Object) null, this.f35695K);
            zArr[i10] = true;
        }
    }

    private void Y(int i10) {
        L();
        boolean[] zArr = this.f35685A.f35747b;
        if (this.f35697M && zArr[i10]) {
            if (!this.f35721u[i10].F(false)) {
                this.f35696L = 0;
                this.f35697M = false;
                this.f35691G = true;
                this.f35695K = 0;
                this.f35698N = 0;
                for (Z P10 : this.f35721u) {
                    P10.P();
                }
                ((C6478B.a) C5950a.e(this.f35719s)).h(this);
            }
        }
    }

    /* access modifiers changed from: private */
    public void b0() {
        this.f35718r.post(new P(this));
    }

    private O f0(e eVar) {
        int length = this.f35721u.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (eVar.equals(this.f35722v[i10])) {
                return this.f35721u[i10];
            }
        }
        if (this.f35723w) {
            q.h("ProgressiveMediaPeriod", "Extractor added new track (id=" + eVar.f35744a + ") after finishing tracks.");
            return new C6675m();
        }
        Z k10 = Z.k(this.f35708h, this.f35703c, this.f35706f);
        k10.W(this);
        int i11 = length + 1;
        e[] eVarArr = (e[]) Arrays.copyOf(this.f35722v, i11);
        eVarArr[length] = eVar;
        this.f35722v = (e[]) N.j(eVarArr);
        Z[] zArr = (Z[]) Arrays.copyOf(this.f35721u, i11);
        zArr[length] = k10;
        this.f35721u = (Z[]) N.j(zArr);
        return k10;
    }

    private boolean i0(boolean[] zArr, long j10, boolean z10) {
        int length = this.f35721u.length;
        for (int i10 = 0; i10 < length; i10++) {
            Z z11 = this.f35721u[i10];
            if (z11.y() != 0 || !z10) {
                if (!(this.f35726z ? z11.S(z11.u()) : z11.T(j10, false)) && (zArr[i10] || !this.f35725y)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public void V(N3.J j10) {
        this.f35686B = this.f35720t == null ? j10 : new J.b(-9223372036854775807L);
        this.f35687C = j10.l();
        int i10 = 1;
        boolean z10 = !this.f35694J && j10.l() == -9223372036854775807L;
        this.f35688D = z10;
        if (z10) {
            i10 = 7;
        }
        this.f35689E = i10;
        if (this.f35724x) {
            this.f35707g.i(this.f35687C, j10.f(), this.f35688D);
        } else {
            W();
        }
    }

    private void l0() {
        b bVar = new b(this.f35701a, this.f35702b, this.f35714n, this, this.f35715o);
        if (this.f35724x) {
            C5950a.g(R());
            long j10 = this.f35687C;
            if (j10 == -9223372036854775807L || this.f35696L <= j10) {
                bVar.j(((N3.J) C5950a.e(this.f35686B)).c(this.f35696L).f38761a.f38767b, this.f35696L);
                for (Z U10 : this.f35721u) {
                    U10.U(this.f35696L);
                }
                this.f35696L = -9223372036854775807L;
            } else {
                this.f35699O = true;
                this.f35696L = -9223372036854775807L;
                return;
            }
        }
        this.f35698N = O();
        this.f35705e.w(new C6503x(bVar.f35728a, bVar.f35738k, this.f35713m.n(bVar, this, this.f35704d.b(this.f35689E))), 1, -1, (C5807s) null, 0, (Object) null, bVar.f35737j, this.f35687C);
    }

    private boolean m0() {
        return this.f35691G || R();
    }

    /* access modifiers changed from: package-private */
    public O Q() {
        return f0(new e(0, true));
    }

    /* access modifiers changed from: package-private */
    public boolean S(int i10) {
        return !m0() && this.f35721u[i10].F(this.f35699O);
    }

    /* access modifiers changed from: package-private */
    public void Z() {
        this.f35713m.k(this.f35704d.b(this.f35689E));
    }

    public boolean a() {
        return this.f35713m.i() && this.f35715o.d();
    }

    /* access modifiers changed from: package-private */
    public void a0(int i10) {
        this.f35721u[i10].I();
        Z();
    }

    public boolean b(Y y10) {
        if (this.f35699O || this.f35713m.h() || this.f35697M) {
            return false;
        }
        if (this.f35724x && this.f35693I == 0) {
            return false;
        }
        boolean e10 = this.f35715o.e();
        if (this.f35713m.i()) {
            return e10;
        }
        l0();
        return true;
    }

    public long c() {
        return d();
    }

    /* renamed from: c0 */
    public void v(b bVar, long j10, long j11, boolean z10) {
        A d10 = bVar.f35730c;
        C6503x xVar = new C6503x(bVar.f35728a, bVar.f35738k, d10.q(), d10.r(), j10, j11, d10.p());
        this.f35704d.c(bVar.f35728a);
        this.f35705e.q(xVar, 1, -1, (C5807s) null, 0, (Object) null, bVar.f35737j, this.f35687C);
        if (!z10) {
            for (Z P10 : this.f35721u) {
                P10.P();
            }
            if (this.f35693I > 0) {
                ((C6478B.a) C5950a.e(this.f35719s)).h(this);
            }
        }
    }

    public long d() {
        long j10;
        L();
        if (this.f35699O || this.f35693I == 0) {
            return Long.MIN_VALUE;
        }
        if (R()) {
            return this.f35696L;
        }
        if (this.f35725y) {
            int length = this.f35721u.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                f fVar = this.f35685A;
                if (fVar.f35747b[i10] && fVar.f35748c[i10] && !this.f35721u[i10].E()) {
                    j10 = Math.min(j10, this.f35721u[i10].v());
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = P(false);
        }
        return j10 == Long.MIN_VALUE ? this.f35695K : j10;
    }

    /* renamed from: d0 */
    public void k(b bVar, long j10, long j11) {
        N3.J j12;
        if (this.f35687C == -9223372036854775807L && (j12 = this.f35686B) != null) {
            boolean f10 = j12.f();
            long P10 = P(true);
            long j13 = P10 == Long.MIN_VALUE ? 0 : P10 + 10000;
            this.f35687C = j13;
            this.f35707g.i(j13, f10, this.f35688D);
        }
        A d10 = bVar.f35730c;
        C6503x xVar = new C6503x(bVar.f35728a, bVar.f35738k, d10.q(), d10.r(), j10, j11, d10.p());
        this.f35704d.c(bVar.f35728a);
        this.f35705e.s(xVar, 1, -1, (C5807s) null, 0, (Object) null, bVar.f35737j, this.f35687C);
        this.f35699O = true;
        ((C6478B.a) C5950a.e(this.f35719s)).h(this);
    }

    public void e(long j10) {
    }

    /* renamed from: e0 */
    public l.c q(b bVar, long j10, long j11, IOException iOException, int i10) {
        l.c cVar;
        A d10 = bVar.f35730c;
        C6503x xVar = new C6503x(bVar.f35728a, bVar.f35738k, d10.q(), d10.r(), j10, j11, d10.p());
        long a10 = this.f35704d.a(new j.a(xVar, new C6477A(1, -1, (C5807s) null, 0, (Object) null, N.q1(bVar.f35737j), N.q1(this.f35687C)), iOException, i10));
        if (a10 == -9223372036854775807L) {
            cVar = l.f37303g;
            b bVar2 = bVar;
        } else {
            int O10 = O();
            cVar = M(bVar, O10) ? l.g(O10 > this.f35698N, a10) : l.f37302f;
        }
        boolean c10 = cVar.c();
        this.f35705e.u(xVar, 1, -1, (C5807s) null, 0, (Object) null, bVar.f35737j, this.f35687C, iOException, !c10);
        if (!c10) {
            this.f35704d.c(bVar.f35728a);
        }
        return cVar;
    }

    public void f(C5807s sVar) {
        this.f35718r.post(this.f35716p);
    }

    public long g(x[] xVarArr, boolean[] zArr, a0[] a0VarArr, boolean[] zArr2, long j10) {
        x xVar;
        L();
        f fVar = this.f35685A;
        k0 k0Var = fVar.f35746a;
        boolean[] zArr3 = fVar.f35748c;
        int i10 = this.f35693I;
        int i11 = 0;
        for (int i12 = 0; i12 < xVarArr.length; i12++) {
            d dVar = a0VarArr[i12];
            if (dVar != null && (xVarArr[i12] == null || !zArr[i12])) {
                int a10 = dVar.f35742a;
                C5950a.g(zArr3[a10]);
                this.f35693I--;
                zArr3[a10] = false;
                a0VarArr[i12] = null;
            }
        }
        boolean z10 = !this.f35690F ? !(j10 == 0 || this.f35726z) : i10 == 0;
        for (int i13 = 0; i13 < xVarArr.length; i13++) {
            if (a0VarArr[i13] == null && (xVar = xVarArr[i13]) != null) {
                C5950a.g(xVar.length() == 1);
                C5950a.g(xVar.b(0) == 0);
                int d10 = k0Var.d(xVar.h());
                C5950a.g(!zArr3[d10]);
                this.f35693I++;
                zArr3[d10] = true;
                this.f35692H = xVar.l().f28250u | this.f35692H;
                a0VarArr[i13] = new d(d10);
                zArr2[i13] = true;
                if (!z10) {
                    Z z11 = this.f35721u[d10];
                    z10 = z11.y() != 0 && !z11.T(j10, true);
                }
            }
        }
        if (this.f35693I == 0) {
            this.f35697M = false;
            this.f35691G = false;
            this.f35692H = false;
            if (this.f35713m.i()) {
                Z[] zArr4 = this.f35721u;
                int length = zArr4.length;
                while (i11 < length) {
                    zArr4[i11].p();
                    i11++;
                }
                this.f35713m.e();
            } else {
                this.f35699O = false;
                Z[] zArr5 = this.f35721u;
                int length2 = zArr5.length;
                while (i11 < length2) {
                    zArr5[i11].P();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = i(j10);
            while (i11 < a0VarArr.length) {
                if (a0VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.f35690F = true;
        return j10;
    }

    /* access modifiers changed from: package-private */
    public int g0(int i10, D d10, y3.f fVar, int i11) {
        if (m0()) {
            return -3;
        }
        X(i10);
        int M10 = this.f35721u[i10].M(d10, fVar, i11, this.f35699O);
        if (M10 == -3) {
            Y(i10);
        }
        return M10;
    }

    public void h0() {
        if (this.f35724x) {
            for (Z L10 : this.f35721u) {
                L10.L();
            }
        }
        this.f35713m.m(this);
        this.f35718r.removeCallbacksAndMessages((Object) null);
        this.f35719s = null;
        this.f35700P = true;
    }

    public long i(long j10) {
        L();
        boolean[] zArr = this.f35685A.f35747b;
        if (!this.f35686B.f()) {
            j10 = 0;
        }
        int i10 = 0;
        this.f35691G = false;
        boolean z10 = this.f35695K == j10;
        this.f35695K = j10;
        if (R()) {
            this.f35696L = j10;
            return j10;
        } else if (this.f35689E != 7 && ((this.f35699O || this.f35713m.i()) && i0(zArr, j10, z10))) {
            return j10;
        } else {
            this.f35697M = false;
            this.f35696L = j10;
            this.f35699O = false;
            this.f35692H = false;
            if (this.f35713m.i()) {
                Z[] zArr2 = this.f35721u;
                int length = zArr2.length;
                while (i10 < length) {
                    zArr2[i10].p();
                    i10++;
                }
                this.f35713m.e();
            } else {
                this.f35713m.f();
                Z[] zArr3 = this.f35721u;
                int length2 = zArr3.length;
                while (i10 < length2) {
                    zArr3[i10].P();
                    i10++;
                }
            }
            return j10;
        }
    }

    public void j(C6478B.a aVar, long j10) {
        this.f35719s = aVar;
        this.f35715o.e();
        l0();
    }

    /* access modifiers changed from: package-private */
    public int k0(int i10, long j10) {
        if (m0()) {
            return 0;
        }
        X(i10);
        Z z10 = this.f35721u[i10];
        int A10 = z10.A(j10, this.f35699O);
        z10.X(A10);
        if (A10 == 0) {
            Y(i10);
        }
        return A10;
    }

    public long l() {
        if (this.f35692H) {
            this.f35692H = false;
            return this.f35695K;
        } else if (!this.f35691G) {
            return -9223372036854775807L;
        } else {
            if (!this.f35699O && O() <= this.f35698N) {
                return -9223372036854775807L;
            }
            this.f35691G = false;
            return this.f35695K;
        }
    }

    public void m() {
        for (Z N10 : this.f35721u) {
            N10.N();
        }
        this.f35714n.release();
    }

    public void n(N3.J j10) {
        this.f35718r.post(new T(this, j10));
    }

    public void o() {
        try {
            Z();
        } catch (IOException e10) {
            if (this.f35711k) {
                q.d("ProgressiveMediaPeriod", "Suppressing preparation error because suppressPrepareError=true", e10);
                this.f35723w = true;
                V(new J.b(-9223372036854775807L));
            } else {
                throw e10;
            }
        }
        if (this.f35699O && !this.f35724x) {
            throw q3.B.a("Loading finished before preparation is complete.", (Throwable) null);
        }
    }

    public long p(long j10, z3.J j11) {
        L();
        if (!this.f35686B.f()) {
            return 0;
        }
        J.a c10 = this.f35686B.c(j10);
        return j11.a(j10, c10.f38761a.f38766a, c10.f38762b.f38766a);
    }

    public void r() {
        this.f35723w = true;
        this.f35718r.post(this.f35716p);
    }

    public k0 s() {
        L();
        return this.f35685A.f35746a;
    }

    public O t(int i10, int i11) {
        return f0(new e(i10, false));
    }

    public void u(long j10, boolean z10) {
        if (!this.f35726z) {
            L();
            if (!R()) {
                boolean[] zArr = this.f35685A.f35748c;
                int length = this.f35721u.length;
                for (int i10 = 0; i10 < length; i10++) {
                    this.f35721u[i10].o(j10, z10, zArr[i10]);
                }
            }
        }
    }
}
