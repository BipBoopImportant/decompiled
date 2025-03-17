package androidx.media3.exoplayer;

import A3.C6298a;
import A3.v1;
import C3.C6422m;
import G3.C6478B;
import G3.C6479C;
import G3.a0;
import G3.c0;
import G3.k0;
import H3.i;
import I3.C;
import I3.D;
import I3.x;
import J3.C6571d;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.media3.exoplayer.C5231h;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.X;
import androidx.media3.exoplayer.Y;
import androidx.media3.exoplayer.q0;
import androidx.media3.exoplayer.s0;
import androidx.media3.exoplayer.u0;
import androidx.media3.exoplayer.v0;
import d9.M;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import jb.r;
import kb.C9944Y;
import kb.C9967v;
import q3.B;
import q3.C5807s;
import q3.J;
import q3.w;
import q3.z;
import t3.C5950a;
import t3.C5953d;
import t3.C5962m;
import t3.N;
import t3.q;
import z3.E;
import z3.G;
import z3.H;
import z3.J;

final class W implements Handler.Callback, C6478B.a, C.a, q0.d, C5231h.a, s0.a {

    /* renamed from: A0  reason: collision with root package name */
    private static final long f22528A0 = N.q1(10000);

    /* renamed from: A  reason: collision with root package name */
    private final C5962m f22529A;

    /* renamed from: B  reason: collision with root package name */
    private J f22530B;

    /* renamed from: C  reason: collision with root package name */
    private r0 f22531C;

    /* renamed from: D  reason: collision with root package name */
    private e f22532D;

    /* renamed from: E  reason: collision with root package name */
    private boolean f22533E;

    /* renamed from: F  reason: collision with root package name */
    private boolean f22534F;

    /* renamed from: G  reason: collision with root package name */
    private boolean f22535G;

    /* renamed from: H  reason: collision with root package name */
    private boolean f22536H;

    /* renamed from: I  reason: collision with root package name */
    private long f22537I = -9223372036854775807L;

    /* renamed from: J  reason: collision with root package name */
    private boolean f22538J;

    /* renamed from: K  reason: collision with root package name */
    private int f22539K;

    /* renamed from: L  reason: collision with root package name */
    private boolean f22540L;

    /* renamed from: M  reason: collision with root package name */
    private boolean f22541M;
    /* access modifiers changed from: private */

    /* renamed from: N  reason: collision with root package name */
    public boolean f22542N;
    /* access modifiers changed from: private */

    /* renamed from: O  reason: collision with root package name */
    public boolean f22543O;

    /* renamed from: P  reason: collision with root package name */
    private int f22544P;

    /* renamed from: Q  reason: collision with root package name */
    private h f22545Q;

    /* renamed from: R  reason: collision with root package name */
    private long f22546R;

    /* renamed from: S  reason: collision with root package name */
    private long f22547S;

    /* renamed from: T  reason: collision with root package name */
    private int f22548T;

    /* renamed from: U  reason: collision with root package name */
    private boolean f22549U;

    /* renamed from: X  reason: collision with root package name */
    private C5233j f22550X;

    /* renamed from: Y  reason: collision with root package name */
    private long f22551Y;

    /* renamed from: Z  reason: collision with root package name */
    private long f22552Z = -9223372036854775807L;

    /* renamed from: a  reason: collision with root package name */
    private final u0[] f22553a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<u0> f22554b;

    /* renamed from: c  reason: collision with root package name */
    private final v0[] f22555c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean[] f22556d;

    /* renamed from: e  reason: collision with root package name */
    private final C f22557e;

    /* renamed from: f  reason: collision with root package name */
    private final D f22558f;

    /* renamed from: g  reason: collision with root package name */
    private final X f22559g;

    /* renamed from: h  reason: collision with root package name */
    private final C6571d f22560h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final C5962m f22561i;

    /* renamed from: j  reason: collision with root package name */
    private final G f22562j;

    /* renamed from: k  reason: collision with root package name */
    private final Looper f22563k;

    /* renamed from: l  reason: collision with root package name */
    private final J.c f22564l;

    /* renamed from: m  reason: collision with root package name */
    private final J.b f22565m;

    /* renamed from: n  reason: collision with root package name */
    private final long f22566n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f22567o;

    /* renamed from: p  reason: collision with root package name */
    private final C5231h f22568p;

    /* renamed from: q  reason: collision with root package name */
    private final ArrayList<d> f22569q;

    /* renamed from: r  reason: collision with root package name */
    private final C5953d f22570r;

    /* renamed from: s  reason: collision with root package name */
    private final f f22571s;

    /* renamed from: t  reason: collision with root package name */
    private final c0 f22572t;

    /* renamed from: u  reason: collision with root package name */
    private final q0 f22573u;

    /* renamed from: v  reason: collision with root package name */
    private final E f22574v;

    /* renamed from: w  reason: collision with root package name */
    private final long f22575w;

    /* renamed from: x  reason: collision with root package name */
    private final v1 f22576x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public final boolean f22577y;

    /* renamed from: y0  reason: collision with root package name */
    private ExoPlayer.c f22578y0;

    /* renamed from: z  reason: collision with root package name */
    private final C6298a f22579z;

    /* renamed from: z0  reason: collision with root package name */
    private q3.J f22580z0;

    class a implements u0.a {
        a() {
        }

        public void a() {
            boolean unused = W.this.f22542N = true;
        }

        public void b() {
            if (W.this.f22577y || W.this.f22543O) {
                W.this.f22561i.i(2);
            }
        }
    }

    private static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final List<q0.c> f22582a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final c0 f22583b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final int f22584c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final long f22585d;

        /* synthetic */ b(List list, c0 c0Var, int i10, long j10, a aVar) {
            this(list, c0Var, i10, j10);
        }

        private b(List<q0.c> list, c0 c0Var, int i10, long j10) {
            this.f22582a = list;
            this.f22583b = c0Var;
            this.f22584c = i10;
            this.f22585d = j10;
        }
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f22586a;

        /* renamed from: b  reason: collision with root package name */
        public final int f22587b;

        /* renamed from: c  reason: collision with root package name */
        public final int f22588c;

        /* renamed from: d  reason: collision with root package name */
        public final c0 f22589d;
    }

    private static final class d implements Comparable<d> {

        /* renamed from: a  reason: collision with root package name */
        public final s0 f22590a;

        /* renamed from: b  reason: collision with root package name */
        public int f22591b;

        /* renamed from: c  reason: collision with root package name */
        public long f22592c;

        /* renamed from: d  reason: collision with root package name */
        public Object f22593d;

        public d(s0 s0Var) {
            this.f22590a = s0Var;
        }

        /* renamed from: a */
        public int compareTo(d dVar) {
            Object obj = this.f22593d;
            if ((obj == null) != (dVar.f22593d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i10 = this.f22591b - dVar.f22591b;
            return i10 != 0 ? i10 : N.n(this.f22592c, dVar.f22592c);
        }

        public void b(int i10, long j10, Object obj) {
            this.f22591b = i10;
            this.f22592c = j10;
            this.f22593d = obj;
        }
    }

    public static final class e {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public boolean f22594a;

        /* renamed from: b  reason: collision with root package name */
        public r0 f22595b;

        /* renamed from: c  reason: collision with root package name */
        public int f22596c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f22597d;

        /* renamed from: e  reason: collision with root package name */
        public int f22598e;

        public e(r0 r0Var) {
            this.f22595b = r0Var;
        }

        public void b(int i10) {
            this.f22594a |= i10 > 0;
            this.f22596c += i10;
        }

        public void c(r0 r0Var) {
            this.f22594a |= this.f22595b != r0Var;
            this.f22595b = r0Var;
        }

        public void d(int i10) {
            boolean z10 = true;
            if (!this.f22597d || this.f22598e == 5) {
                this.f22594a = true;
                this.f22597d = true;
                this.f22598e = i10;
                return;
            }
            if (i10 != 5) {
                z10 = false;
            }
            C5950a.a(z10);
        }
    }

    public interface f {
        void a(e eVar);
    }

    private static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final C6479C.b f22599a;

        /* renamed from: b  reason: collision with root package name */
        public final long f22600b;

        /* renamed from: c  reason: collision with root package name */
        public final long f22601c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f22602d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f22603e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f22604f;

        public g(C6479C.b bVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f22599a = bVar;
            this.f22600b = j10;
            this.f22601c = j11;
            this.f22602d = z10;
            this.f22603e = z11;
            this.f22604f = z12;
        }
    }

    private static final class h {

        /* renamed from: a  reason: collision with root package name */
        public final q3.J f22605a;

        /* renamed from: b  reason: collision with root package name */
        public final int f22606b;

        /* renamed from: c  reason: collision with root package name */
        public final long f22607c;

        public h(q3.J j10, int i10, long j11) {
            this.f22605a = j10;
            this.f22606b = i10;
            this.f22607c = j11;
        }
    }

    public W(u0[] u0VarArr, C c10, D d10, X x10, C6571d dVar, int i10, boolean z10, C6298a aVar, z3.J j10, E e10, long j11, boolean z11, boolean z12, Looper looper, C5953d dVar2, f fVar, v1 v1Var, G g10, ExoPlayer.c cVar) {
        u0[] u0VarArr2 = u0VarArr;
        X x11 = x10;
        C6571d dVar3 = dVar;
        C6298a aVar2 = aVar;
        long j12 = j11;
        C5953d dVar4 = dVar2;
        v1 v1Var2 = v1Var;
        ExoPlayer.c cVar2 = cVar;
        this.f22571s = fVar;
        this.f22553a = u0VarArr2;
        this.f22557e = c10;
        this.f22558f = d10;
        this.f22559g = x11;
        this.f22560h = dVar3;
        this.f22539K = i10;
        this.f22540L = z10;
        this.f22530B = j10;
        this.f22574v = e10;
        this.f22575w = j12;
        this.f22551Y = j12;
        this.f22534F = z11;
        this.f22577y = z12;
        this.f22570r = dVar4;
        this.f22576x = v1Var2;
        this.f22578y0 = cVar2;
        this.f22579z = aVar2;
        this.f22566n = x11.n(v1Var2);
        this.f22567o = x11.p(v1Var2);
        this.f22580z0 = q3.J.f27893a;
        r0 k10 = r0.k(d10);
        this.f22531C = k10;
        this.f22532D = new e(k10);
        this.f22555c = new v0[u0VarArr2.length];
        this.f22556d = new boolean[u0VarArr2.length];
        v0.a d11 = c10.d();
        for (int i11 = 0; i11 < u0VarArr2.length; i11++) {
            u0VarArr2[i11].A(i11, v1Var2, dVar4);
            this.f22555c[i11] = u0VarArr2[i11].J();
            if (d11 != null) {
                this.f22555c[i11].K(d11);
            }
        }
        this.f22568p = new C5231h(this, dVar4);
        this.f22569q = new ArrayList<>();
        this.f22554b = C9944Y.h();
        this.f22564l = new J.c();
        this.f22565m = new J.b();
        c10.e(this, dVar3);
        this.f22549U = true;
        C5962m e11 = dVar4.e(looper, (Handler.Callback) null);
        this.f22529A = e11;
        this.f22572t = new c0(aVar2, e11, new U(this), cVar2);
        this.f22573u = new q0(this, aVar2, e11, v1Var2);
        G g11 = g10 == null ? new G() : g10;
        this.f22562j = g11;
        Looper a10 = g11.a();
        this.f22563k = a10;
        this.f22561i = dVar4.e(a10, this);
    }

    private void A0(int i10, int i11, c0 c0Var) {
        this.f22532D.b(1);
        O(this.f22573u.B(i10, i11, c0Var), false);
    }

    private void A1(C6479C.b bVar, k0 k0Var, D d10) {
        Z z10 = (Z) C5950a.e(this.f22572t.m());
        this.f22559g.m(new X.a(this.f22576x, this.f22531C.f22844a, bVar, z10 == this.f22572t.t() ? z10.C(this.f22546R) : z10.C(this.f22546R) - z10.f22631h.f22648b, J(z10.j()), this.f22568p.e().f27859a, this.f22531C.f22855l, this.f22536H, u1(this.f22531C.f22844a, z10.f22631h.f22647a) ? this.f22574v.c() : -9223372036854775807L), k0Var, d10.f36667c);
    }

    private C9967v<z> B(x[] xVarArr) {
        C9967v.a aVar = new C9967v.a();
        boolean z10 = false;
        for (x xVar : xVarArr) {
            if (xVar != null) {
                z zVar = xVar.a(0).f28241l;
                if (zVar == null) {
                    aVar.a(new z(new z.b[0]));
                } else {
                    aVar.a(zVar);
                    z10 = true;
                }
            }
        }
        return z10 ? aVar.k() : C9967v.E();
    }

    private boolean B0() {
        Z w10 = this.f22572t.w();
        D p10 = w10.p();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            u0[] u0VarArr = this.f22553a;
            if (i10 >= u0VarArr.length) {
                return !z10;
            }
            u0 u0Var = u0VarArr[i10];
            if (X(u0Var)) {
                boolean z11 = u0Var.j() != w10.f22626c[i10];
                if (!p10.c(i10) || z11) {
                    if (!u0Var.D()) {
                        u0Var.y(D(p10.f36667c[i10]), w10.f22626c[i10], w10.n(), w10.m(), w10.f22631h.f22647a);
                        if (this.f22543O) {
                            c1(false);
                        }
                    } else if (u0Var.d()) {
                        u(i10);
                    } else {
                        z10 = true;
                    }
                }
            }
            i10++;
        }
    }

    private void B1(int i10, int i11, List<w> list) {
        this.f22532D.b(1);
        O(this.f22573u.F(i10, i11, list), false);
    }

    private long C() {
        r0 r0Var = this.f22531C;
        return E(r0Var.f22844a, r0Var.f22845b.f35620a, r0Var.f22862s);
    }

    private void C0() {
        float f10 = this.f22568p.e().f27859a;
        Z t10 = this.f22572t.t();
        Z w10 = this.f22572t.w();
        D d10 = null;
        boolean z10 = true;
        while (t10 != null && t10.f22629f) {
            r0 r0Var = this.f22531C;
            D z11 = t10.z(f10, r0Var.f22844a, r0Var.f22855l);
            if (t10 == this.f22572t.t()) {
                d10 = z11;
            }
            if (!z11.a(t10.p())) {
                if (z10) {
                    Z t11 = this.f22572t.t();
                    boolean M10 = this.f22572t.M(t11);
                    boolean[] zArr = new boolean[this.f22553a.length];
                    long b10 = t11.b((D) C5950a.e(d10), this.f22531C.f22862s, M10, zArr);
                    r0 r0Var2 = this.f22531C;
                    boolean z12 = (r0Var2.f22848e == 4 || b10 == r0Var2.f22862s) ? false : true;
                    r0 r0Var3 = this.f22531C;
                    long j10 = b10;
                    this.f22531C = S(r0Var3.f22845b, b10, r0Var3.f22846c, r0Var3.f22847d, z12, 5);
                    if (z12) {
                        G0(j10);
                    }
                    boolean[] zArr2 = new boolean[this.f22553a.length];
                    int i10 = 0;
                    while (true) {
                        u0[] u0VarArr = this.f22553a;
                        if (i10 >= u0VarArr.length) {
                            break;
                        }
                        u0 u0Var = u0VarArr[i10];
                        boolean X10 = X(u0Var);
                        zArr2[i10] = X10;
                        a0 a0Var = t11.f22626c[i10];
                        if (X10) {
                            if (a0Var != u0Var.j()) {
                                u(i10);
                            } else if (zArr[i10]) {
                                u0Var.Q(this.f22546R);
                            }
                        }
                        i10++;
                    }
                    y(zArr2, this.f22546R);
                } else {
                    this.f22572t.M(t10);
                    if (t10.f22629f) {
                        t10.a(z11, Math.max(t10.f22631h.f22648b, t10.C(this.f22546R)), false);
                    }
                }
                M(true);
                if (this.f22531C.f22848e != 4) {
                    d0();
                    D1();
                    this.f22561i.i(2);
                    return;
                }
                return;
            }
            if (t10 == w10) {
                z10 = false;
            }
            t10 = t10.k();
        }
    }

    private void C1() {
        if (!this.f22531C.f22844a.q() && this.f22573u.t()) {
            boolean j02 = j0();
            n0();
            o0();
            l0();
            m0(j02);
        }
    }

    private static C5807s[] D(x xVar) {
        int length = xVar != null ? xVar.length() : 0;
        C5807s[] sVarArr = new C5807s[length];
        for (int i10 = 0; i10 < length; i10++) {
            sVarArr[i10] = xVar.a(i10);
        }
        return sVarArr;
    }

    private void D0() {
        C0();
        P0(true);
    }

    private void D1() {
        Z t10 = this.f22572t.t();
        if (t10 != null) {
            long l10 = t10.f22629f ? t10.f22624a.l() : -9223372036854775807L;
            if (l10 != -9223372036854775807L) {
                if (!t10.s()) {
                    this.f22572t.M(t10);
                    M(false);
                    d0();
                }
                G0(l10);
                if (l10 != this.f22531C.f22862s) {
                    r0 r0Var = this.f22531C;
                    this.f22531C = S(r0Var.f22845b, l10, r0Var.f22846c, l10, true, 5);
                }
            } else {
                long i10 = this.f22568p.i(t10 != this.f22572t.w());
                this.f22546R = i10;
                long C10 = t10.C(i10);
                i0(this.f22531C.f22862s, C10);
                if (this.f22568p.w()) {
                    boolean z10 = !this.f22532D.f22597d;
                    r0 r0Var2 = this.f22531C;
                    this.f22531C = S(r0Var2.f22845b, C10, r0Var2.f22846c, C10, z10, 6);
                } else {
                    this.f22531C.o(C10);
                }
            }
            this.f22531C.f22860q = this.f22572t.m().j();
            this.f22531C.f22861r = I();
            r0 r0Var3 = this.f22531C;
            if (r0Var3.f22855l && r0Var3.f22848e == 3 && u1(r0Var3.f22844a, r0Var3.f22845b) && this.f22531C.f22858o.f27859a == 1.0f) {
                float b10 = this.f22574v.b(C(), this.f22531C.f22861r);
                if (this.f22568p.e().f27859a != b10) {
                    Z0(this.f22531C.f22858o.b(b10));
                    Q(this.f22531C.f22858o, this.f22568p.e().f27859a, false, false);
                }
            }
        }
    }

    private long E(q3.J j10, Object obj, long j11) {
        j10.n(j10.h(obj, this.f22565m).f27904c, this.f22564l);
        J.c cVar = this.f22564l;
        if (cVar.f27930f != -9223372036854775807L && cVar.f()) {
            J.c cVar2 = this.f22564l;
            if (cVar2.f27933i) {
                return N.P0(cVar2.a() - this.f22564l.f27930f) - (j11 + this.f22565m.n());
            }
        }
        return -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009c, code lost:
        if (r5.equals(r1.f22531C.f22845b) == false) goto L_0x009e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void E0(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            r33 = this;
            r1 = r33
            t3.m r0 = r1.f22561i
            r2 = 2
            r0.k(r2)
            r2 = 0
            r1.f22550X = r2
            r3 = 0
            r4 = 1
            r1.F1(r3, r4)
            androidx.media3.exoplayer.h r0 = r1.f22568p
            r0.h()
            r5 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            r1.f22546R = r5
            r5 = r3
        L_0x001d:
            androidx.media3.exoplayer.u0[] r6 = r1.f22553a
            int r0 = r6.length
            java.lang.String r7 = "ExoPlayerImplInternal"
            if (r5 >= r0) goto L_0x0033
            r1.u(r5)     // Catch:{ j -> 0x002a, RuntimeException -> 0x0028 }
            goto L_0x0030
        L_0x0028:
            r0 = move-exception
            goto L_0x002b
        L_0x002a:
            r0 = move-exception
        L_0x002b:
            java.lang.String r6 = "Disable failed."
            t3.q.d(r7, r6, r0)
        L_0x0030:
            int r5 = r5 + 1
            goto L_0x001d
        L_0x0033:
            if (r34 == 0) goto L_0x0051
            int r5 = r6.length
            r8 = r3
        L_0x0037:
            if (r8 >= r5) goto L_0x0051
            r0 = r6[r8]
            java.util.Set<androidx.media3.exoplayer.u0> r9 = r1.f22554b
            boolean r9 = r9.remove(r0)
            if (r9 == 0) goto L_0x004e
            r0.a()     // Catch:{ RuntimeException -> 0x0047 }
            goto L_0x004e
        L_0x0047:
            r0 = move-exception
            r9 = r0
            java.lang.String r0 = "Reset failed."
            t3.q.d(r7, r0, r9)
        L_0x004e:
            int r8 = r8 + 1
            goto L_0x0037
        L_0x0051:
            r1.f22544P = r3
            androidx.media3.exoplayer.r0 r0 = r1.f22531C
            G3.C$b r5 = r0.f22845b
            long r6 = r0.f22862s
            androidx.media3.exoplayer.r0 r0 = r1.f22531C
            G3.C$b r0 = r0.f22845b
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x0073
            androidx.media3.exoplayer.r0 r0 = r1.f22531C
            q3.J$b r8 = r1.f22565m
            boolean r0 = Z(r0, r8)
            if (r0 == 0) goto L_0x006e
            goto L_0x0073
        L_0x006e:
            androidx.media3.exoplayer.r0 r0 = r1.f22531C
            long r8 = r0.f22862s
            goto L_0x0077
        L_0x0073:
            androidx.media3.exoplayer.r0 r0 = r1.f22531C
            long r8 = r0.f22846c
        L_0x0077:
            if (r35 == 0) goto L_0x00a2
            r1.f22545Q = r2
            androidx.media3.exoplayer.r0 r0 = r1.f22531C
            q3.J r0 = r0.f22844a
            android.util.Pair r0 = r1.G(r0)
            java.lang.Object r5 = r0.first
            G3.C$b r5 = (G3.C6479C.b) r5
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r6 = r0.longValue()
            androidx.media3.exoplayer.r0 r0 = r1.f22531C
            G3.C$b r0 = r0.f22845b
            boolean r0 = r5.equals(r0)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 != 0) goto L_0x00a2
        L_0x009e:
            r28 = r6
            r9 = r8
            goto L_0x00a4
        L_0x00a2:
            r4 = r3
            goto L_0x009e
        L_0x00a4:
            androidx.media3.exoplayer.c0 r0 = r1.f22572t
            r0.f()
            r1.f22538J = r3
            androidx.media3.exoplayer.r0 r0 = r1.f22531C
            q3.J r0 = r0.f22844a
            if (r36 == 0) goto L_0x00ea
            boolean r3 = r0 instanceof androidx.media3.exoplayer.t0
            if (r3 == 0) goto L_0x00ea
            androidx.media3.exoplayer.t0 r0 = (androidx.media3.exoplayer.t0) r0
            androidx.media3.exoplayer.q0 r3 = r1.f22573u
            G3.c0 r3 = r3.q()
            androidx.media3.exoplayer.t0 r0 = r0.E(r3)
            int r3 = r5.f35621b
            r6 = -1
            if (r3 == r6) goto L_0x00ea
            java.lang.Object r3 = r5.f35620a
            q3.J$b r6 = r1.f22565m
            r0.h(r3, r6)
            q3.J$b r3 = r1.f22565m
            int r3 = r3.f27904c
            q3.J$c r6 = r1.f22564l
            q3.J$c r3 = r0.n(r3, r6)
            boolean r3 = r3.f()
            if (r3 == 0) goto L_0x00ea
            G3.C$b r3 = new G3.C$b
            java.lang.Object r6 = r5.f35620a
            long r7 = r5.f35623d
            r3.<init>(r6, r7)
            r7 = r0
            r19 = r3
            goto L_0x00ed
        L_0x00ea:
            r7 = r0
            r19 = r5
        L_0x00ed:
            androidx.media3.exoplayer.r0 r0 = new androidx.media3.exoplayer.r0
            androidx.media3.exoplayer.r0 r3 = r1.f22531C
            int r13 = r3.f22848e
            if (r37 == 0) goto L_0x00f7
        L_0x00f5:
            r14 = r2
            goto L_0x00fa
        L_0x00f7:
            androidx.media3.exoplayer.j r2 = r3.f22849f
            goto L_0x00f5
        L_0x00fa:
            if (r4 == 0) goto L_0x0101
            G3.k0 r2 = G3.k0.f35937d
        L_0x00fe:
            r16 = r2
            goto L_0x0104
        L_0x0101:
            G3.k0 r2 = r3.f22851h
            goto L_0x00fe
        L_0x0104:
            if (r4 == 0) goto L_0x010b
            I3.D r2 = r1.f22558f
        L_0x0108:
            r17 = r2
            goto L_0x010e
        L_0x010b:
            I3.D r2 = r3.f22852i
            goto L_0x0108
        L_0x010e:
            if (r4 == 0) goto L_0x0117
            kb.v r2 = kb.C9967v.E()
        L_0x0114:
            r18 = r2
            goto L_0x011a
        L_0x0117:
            java.util.List<q3.z> r2 = r3.f22853j
            goto L_0x0114
        L_0x011a:
            androidx.media3.exoplayer.r0 r2 = r1.f22531C
            boolean r3 = r2.f22855l
            r20 = r3
            int r3 = r2.f22856m
            r21 = r3
            int r3 = r2.f22857n
            r22 = r3
            q3.D r2 = r2.f22858o
            r23 = r2
            r30 = 0
            r32 = 0
            r15 = 0
            r26 = 0
            r6 = r0
            r8 = r19
            r11 = r28
            r24 = r28
            r6.<init>(r7, r8, r9, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28, r30, r32)
            r1.f22531C = r0
            if (r36 == 0) goto L_0x014b
            androidx.media3.exoplayer.c0 r0 = r1.f22572t
            r0.L()
            androidx.media3.exoplayer.q0 r0 = r1.f22573u
            r0.z()
        L_0x014b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.W.E0(boolean, boolean, boolean, boolean):void");
    }

    private void E1(q3.J j10, C6479C.b bVar, q3.J j11, C6479C.b bVar2, long j12, boolean z10) {
        if (!u1(j10, bVar)) {
            q3.D d10 = bVar.b() ? q3.D.f27856d : this.f22531C.f22858o;
            if (!this.f22568p.e().equals(d10)) {
                Z0(d10);
                Q(this.f22531C.f22858o, d10.f27859a, false, false);
                return;
            }
            return;
        }
        j10.n(j10.h(bVar.f35620a, this.f22565m).f27904c, this.f22564l);
        this.f22574v.a((w.g) N.i(this.f22564l.f27934j));
        if (j12 != -9223372036854775807L) {
            this.f22574v.e(E(j10, bVar.f35620a, j12));
            return;
        }
        if (!N.d(!j11.q() ? j11.n(j11.h(bVar2.f35620a, this.f22565m).f27904c, this.f22564l).f27925a : null, this.f22564l.f27925a) || z10) {
            this.f22574v.e(-9223372036854775807L);
        }
    }

    private long F() {
        Z w10 = this.f22572t.w();
        if (w10 == null) {
            return 0;
        }
        long m10 = w10.m();
        if (!w10.f22629f) {
            return m10;
        }
        int i10 = 0;
        while (true) {
            u0[] u0VarArr = this.f22553a;
            if (i10 >= u0VarArr.length) {
                return m10;
            }
            if (X(u0VarArr[i10]) && this.f22553a[i10].j() == w10.f22626c[i10]) {
                long P10 = this.f22553a[i10].P();
                if (P10 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                m10 = Math.max(P10, m10);
            }
            i10++;
        }
    }

    private void F0() {
        Z t10 = this.f22572t.t();
        this.f22535G = t10 != null && t10.f22631h.f22654h && this.f22534F;
    }

    private void F1(boolean z10, boolean z11) {
        this.f22536H = z10;
        this.f22537I = (!z10 || z11) ? -9223372036854775807L : this.f22570r.c();
    }

    private Pair<C6479C.b, Long> G(q3.J j10) {
        long j11 = 0;
        if (j10.q()) {
            return Pair.create(r0.l(), 0L);
        }
        q3.J j12 = j10;
        Pair<Object, Long> j13 = j12.j(this.f22564l, this.f22565m, j10.a(this.f22540L), -9223372036854775807L);
        C6479C.b P10 = this.f22572t.P(j10, j13.first, 0);
        long longValue = ((Long) j13.second).longValue();
        if (P10.b()) {
            j10.h(P10.f35620a, this.f22565m);
            if (P10.f35622c == this.f22565m.k(P10.f35621b)) {
                j11 = this.f22565m.g();
            }
            longValue = j11;
        }
        return Pair.create(P10, Long.valueOf(longValue));
    }

    private void G0(long j10) {
        Z t10 = this.f22572t.t();
        long D10 = t10 == null ? j10 + 1000000000000L : t10.D(j10);
        this.f22546R = D10;
        this.f22568p.c(D10);
        for (u0 u0Var : this.f22553a) {
            if (X(u0Var)) {
                u0Var.Q(this.f22546R);
            }
        }
        r0();
    }

    private void G1(float f10) {
        for (Z t10 = this.f22572t.t(); t10 != null; t10 = t10.k()) {
            for (x xVar : t10.p().f36667c) {
                if (xVar != null) {
                    xVar.e(f10);
                }
            }
        }
    }

    private static void H0(q3.J j10, d dVar, J.c cVar, J.b bVar) {
        int i10 = j10.n(j10.h(dVar.f22593d, bVar).f27904c, cVar).f27939o;
        Object obj = j10.g(i10, bVar, true).f27903b;
        long j11 = bVar.f27905d;
        dVar.b(i10, j11 != -9223372036854775807L ? j11 - 1 : Long.MAX_VALUE, obj);
    }

    private synchronized void H1(r<Boolean> rVar, long j10) {
        long c10 = this.f22570r.c() + j10;
        boolean z10 = false;
        while (!rVar.get().booleanValue() && j10 > 0) {
            try {
                this.f22570r.f();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = c10 - this.f22570r.c();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private long I() {
        return J(this.f22531C.f22860q);
    }

    private static boolean I0(d dVar, q3.J j10, q3.J j11, int i10, boolean z10, J.c cVar, J.b bVar) {
        d dVar2 = dVar;
        q3.J j12 = j10;
        q3.J j13 = j11;
        J.c cVar2 = cVar;
        J.b bVar2 = bVar;
        Object obj = dVar2.f22593d;
        if (obj == null) {
            Pair<Object, Long> L02 = L0(j10, new h(dVar2.f22590a.h(), dVar2.f22590a.d(), dVar2.f22590a.f() == Long.MIN_VALUE ? -9223372036854775807L : N.P0(dVar2.f22590a.f())), false, i10, z10, cVar, bVar);
            if (L02 == null) {
                return false;
            }
            dVar.b(j12.b(L02.first), ((Long) L02.second).longValue(), L02.first);
            if (dVar2.f22590a.f() == Long.MIN_VALUE) {
                H0(j12, dVar, cVar2, bVar2);
            }
            return true;
        }
        int b10 = j12.b(obj);
        if (b10 == -1) {
            return false;
        }
        if (dVar2.f22590a.f() == Long.MIN_VALUE) {
            H0(j12, dVar, cVar2, bVar2);
            return true;
        }
        dVar2.f22591b = b10;
        j13.h(dVar2.f22593d, bVar2);
        if (bVar2.f27907f && j13.n(bVar2.f27904c, cVar2).f27938n == j13.b(dVar2.f22593d)) {
            Pair<Object, Long> j14 = j10.j(cVar, bVar, j12.h(dVar2.f22593d, bVar2).f27904c, dVar2.f22592c + bVar.n());
            dVar.b(j12.b(j14.first), ((Long) j14.second).longValue(), j14.first);
        }
        return true;
    }

    private long J(long j10) {
        Z m10 = this.f22572t.m();
        if (m10 == null) {
            return 0;
        }
        return Math.max(0, j10 - m10.C(this.f22546R));
    }

    private void J0(q3.J j10, q3.J j11) {
        if (!j10.q() || !j11.q()) {
            for (int size = this.f22569q.size() - 1; size >= 0; size--) {
                if (!I0(this.f22569q.get(size), j10, j11, this.f22539K, this.f22540L, this.f22564l, this.f22565m)) {
                    this.f22569q.get(size).f22590a.k(false);
                    this.f22569q.remove(size);
                }
            }
            Collections.sort(this.f22569q);
        }
    }

    private void K(C6478B b10) {
        if (this.f22572t.D(b10)) {
            this.f22572t.J(this.f22546R);
            d0();
        } else if (this.f22572t.E(b10)) {
            e0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.media3.exoplayer.W.g K0(q3.J r30, androidx.media3.exoplayer.r0 r31, androidx.media3.exoplayer.W.h r32, androidx.media3.exoplayer.c0 r33, int r34, boolean r35, q3.J.c r36, q3.J.b r37) {
        /*
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r35
            r11 = r37
            boolean r0 = r30.q()
            if (r0 == 0) goto L_0x0025
            androidx.media3.exoplayer.W$g r0 = new androidx.media3.exoplayer.W$g
            G3.C$b r2 = androidx.media3.exoplayer.r0.l()
            r8 = 1
            r9 = 0
            r3 = 0
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 0
            r1 = r0
            r1.<init>(r2, r3, r5, r7, r8, r9)
            return r0
        L_0x0025:
            G3.C$b r14 = r8.f22845b
            java.lang.Object r12 = r14.f35620a
            boolean r13 = Z(r8, r11)
            G3.C$b r0 = r8.f22845b
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x003c
            if (r13 == 0) goto L_0x0038
            goto L_0x003c
        L_0x0038:
            long r0 = r8.f22862s
        L_0x003a:
            r15 = r0
            goto L_0x003f
        L_0x003c:
            long r0 = r8.f22846c
            goto L_0x003a
        L_0x003f:
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r19 = 0
            r6 = -1
            r20 = 1
            if (r9 == 0) goto L_0x00a5
            r2 = 1
            r0 = r30
            r1 = r32
            r3 = r34
            r4 = r35
            r5 = r36
            r21 = r14
            r14 = r6
            r6 = r37
            android.util.Pair r0 = L0(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x006d
            int r0 = r7.a(r10)
            r6 = r0
            r0 = r15
            r2 = r19
            r3 = r2
            r4 = r20
            goto L_0x0098
        L_0x006d:
            long r1 = r9.f22607c
            int r1 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r1 != 0) goto L_0x007f
            java.lang.Object r0 = r0.first
            q3.J$b r0 = r7.h(r0, r11)
            int r6 = r0.f27904c
            r0 = r15
            r2 = r19
            goto L_0x008c
        L_0x007f:
            java.lang.Object r12 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r6 = r14
            r2 = r20
        L_0x008c:
            int r3 = r8.f22848e
            r4 = 4
            if (r3 != r4) goto L_0x0094
            r3 = r20
            goto L_0x0096
        L_0x0094:
            r3 = r19
        L_0x0096:
            r4 = r19
        L_0x0098:
            r9 = r36
            r29 = r2
            r27 = r3
            r28 = r4
            r3 = r6
        L_0x00a1:
            r6 = r21
            goto L_0x014e
        L_0x00a5:
            r21 = r14
            r14 = r6
            q3.J r0 = r8.f22844a
            boolean r0 = r0.q()
            if (r0 == 0) goto L_0x00bf
            int r0 = r7.a(r10)
        L_0x00b4:
            r9 = r36
            r3 = r0
            r0 = r15
            r27 = r19
            r28 = r27
            r29 = r28
            goto L_0x00a1
        L_0x00bf:
            int r0 = r7.b(r12)
            if (r0 != r14) goto L_0x00ec
            q3.J r5 = r8.f22844a
            r0 = r36
            r1 = r37
            r2 = r34
            r3 = r35
            r4 = r12
            r6 = r30
            int r0 = M0(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r14) goto L_0x00df
            int r0 = r7.a(r10)
            r4 = r20
            goto L_0x00e1
        L_0x00df:
            r4 = r19
        L_0x00e1:
            r9 = r36
            r3 = r0
            r28 = r4
            r0 = r15
            r27 = r19
            r29 = r27
            goto L_0x00a1
        L_0x00ec:
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x00f7
            q3.J$b r0 = r7.h(r12, r11)
            int r0 = r0.f27904c
            goto L_0x00b4
        L_0x00f7:
            if (r13 == 0) goto L_0x0142
            q3.J r0 = r8.f22844a
            r6 = r21
            java.lang.Object r1 = r6.f35620a
            r0.h(r1, r11)
            q3.J r0 = r8.f22844a
            int r1 = r11.f27904c
            r9 = r36
            q3.J$c r0 = r0.n(r1, r9)
            int r0 = r0.f27938n
            q3.J r1 = r8.f22844a
            java.lang.Object r2 = r6.f35620a
            int r1 = r1.b(r2)
            if (r0 != r1) goto L_0x0139
            long r0 = r37.n()
            long r4 = r15 + r0
            q3.J$b r0 = r7.h(r12, r11)
            int r3 = r0.f27904c
            r0 = r30
            r1 = r36
            r2 = r37
            android.util.Pair r0 = r0.j(r1, r2, r3, r4)
            java.lang.Object r12 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            goto L_0x013a
        L_0x0139:
            r0 = r15
        L_0x013a:
            r3 = r14
            r27 = r19
            r28 = r27
            r29 = r20
            goto L_0x014e
        L_0x0142:
            r9 = r36
            r6 = r21
            r3 = r14
            r0 = r15
            r27 = r19
            r28 = r27
            r29 = r28
        L_0x014e:
            if (r3 == r14) goto L_0x016e
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r30
            r1 = r36
            r2 = r37
            android.util.Pair r0 = r0.j(r1, r2, r3, r4)
            java.lang.Object r12 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2 = r33
            r25 = r17
            goto L_0x0172
        L_0x016e:
            r2 = r33
            r25 = r0
        L_0x0172:
            G3.C$b r2 = r2.P(r7, r12, r0)
            int r3 = r2.f35624e
            if (r3 == r14) goto L_0x0184
            int r4 = r6.f35624e
            if (r4 == r14) goto L_0x0181
            if (r3 < r4) goto L_0x0181
            goto L_0x0184
        L_0x0181:
            r3 = r19
            goto L_0x0186
        L_0x0184:
            r3 = r20
        L_0x0186:
            java.lang.Object r4 = r6.f35620a
            boolean r4 = r4.equals(r12)
            if (r4 == 0) goto L_0x019d
            boolean r4 = r6.b()
            if (r4 != 0) goto L_0x019d
            boolean r4 = r2.b()
            if (r4 != 0) goto L_0x019d
            if (r3 == 0) goto L_0x019d
            goto L_0x019f
        L_0x019d:
            r20 = r19
        L_0x019f:
            q3.J$b r17 = r7.h(r12, r11)
            r12 = r13
            r13 = r6
            r3 = r6
            r14 = r15
            r16 = r2
            r18 = r25
            boolean r4 = V(r12, r13, r14, r16, r17, r18)
            if (r20 != 0) goto L_0x01b3
            if (r4 == 0) goto L_0x01b4
        L_0x01b3:
            r2 = r3
        L_0x01b4:
            boolean r4 = r2.b()
            if (r4 == 0) goto L_0x01c2
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L_0x01c5
            long r0 = r8.f22862s
        L_0x01c2:
            r23 = r0
            goto L_0x01dc
        L_0x01c5:
            java.lang.Object r0 = r2.f35620a
            r7.h(r0, r11)
            int r0 = r2.f35622c
            int r1 = r2.f35621b
            int r1 = r11.k(r1)
            if (r0 != r1) goto L_0x01d9
            long r0 = r37.g()
            goto L_0x01c2
        L_0x01d9:
            r0 = 0
            goto L_0x01c2
        L_0x01dc:
            androidx.media3.exoplayer.W$g r0 = new androidx.media3.exoplayer.W$g
            r21 = r0
            r22 = r2
            r21.<init>(r22, r23, r25, r27, r28, r29)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.W.K0(q3.J, androidx.media3.exoplayer.r0, androidx.media3.exoplayer.W$h, androidx.media3.exoplayer.c0, int, boolean, q3.J$c, q3.J$b):androidx.media3.exoplayer.W$g");
    }

    private void L(IOException iOException, int i10) {
        C5233j c10 = C5233j.c(iOException, i10);
        Z t10 = this.f22572t.t();
        if (t10 != null) {
            c10 = c10.a(t10.f22631h.f22647a);
        }
        q.d("ExoPlayerImplInternal", "Playback error", c10);
        x1(false, false);
        this.f22531C = this.f22531C.f(c10);
    }

    private static Pair<Object, Long> L0(q3.J j10, h hVar, boolean z10, int i10, boolean z11, J.c cVar, J.b bVar) {
        int M02;
        q3.J j11 = j10;
        h hVar2 = hVar;
        J.b bVar2 = bVar;
        q3.J j12 = hVar2.f22605a;
        if (j10.q()) {
            return null;
        }
        q3.J j13 = j12.q() ? j11 : j12;
        try {
            Pair<Object, Long> j14 = j13.j(cVar, bVar, hVar2.f22606b, hVar2.f22607c);
            if (j10.equals(j13)) {
                return j14;
            }
            if (j10.b(j14.first) == -1) {
                J.c cVar2 = cVar;
                if (z10 && (M02 = M0(cVar, bVar, i10, z11, j14.first, j13, j10)) != -1) {
                    return j10.j(cVar, bVar, M02, -9223372036854775807L);
                }
                return null;
            } else if (!j13.h(j14.first, bVar2).f27907f || j13.n(bVar2.f27904c, cVar).f27938n != j13.b(j14.first)) {
                return j14;
            } else {
                return j10.j(cVar, bVar, j10.h(j14.first, bVar2).f27904c, hVar2.f22607c);
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    private void M(boolean z10) {
        Z m10 = this.f22572t.m();
        C6479C.b bVar = m10 == null ? this.f22531C.f22845b : m10.f22631h.f22647a;
        boolean equals = this.f22531C.f22854k.equals(bVar);
        if (!equals) {
            this.f22531C = this.f22531C.c(bVar);
        }
        r0 r0Var = this.f22531C;
        r0Var.f22860q = m10 == null ? r0Var.f22862s : m10.j();
        this.f22531C.f22861r = I();
        if ((!equals || z10) && m10 != null && m10.f22629f) {
            A1(m10.f22631h.f22647a, m10.o(), m10.p());
        }
    }

    static int M0(J.c cVar, J.b bVar, int i10, boolean z10, Object obj, q3.J j10, q3.J j11) {
        Object obj2 = j10.n(j10.h(obj, bVar).f27904c, cVar).f27925a;
        for (int i11 = 0; i11 < j11.p(); i11++) {
            if (j11.n(i11, cVar).f27925a.equals(obj2)) {
                return i11;
            }
        }
        int b10 = j10.b(obj);
        int i12 = j10.i();
        int i13 = b10;
        int i14 = -1;
        for (int i15 = 0; i15 < i12 && i14 == -1; i15++) {
            i13 = j10.d(i13, bVar, cVar, i10, z10);
            if (i13 == -1) {
                break;
            }
            i14 = j11.b(j10.m(i13));
        }
        if (i14 == -1) {
            return -1;
        }
        return j11.f(i14, bVar).f27904c;
    }

    private void N(Z z10) {
        if (!z10.f22629f) {
            float f10 = this.f22568p.e().f27859a;
            r0 r0Var = this.f22531C;
            z10.q(f10, r0Var.f22844a, r0Var.f22855l);
        }
        A1(z10.f22631h.f22647a, z10.o(), z10.p());
        if (z10 == this.f22572t.t()) {
            G0(z10.f22631h.f22648b);
            x();
            r0 r0Var2 = this.f22531C;
            C6479C.b bVar = r0Var2.f22845b;
            long j10 = z10.f22631h.f22648b;
            this.f22531C = S(bVar, j10, r0Var2.f22846c, j10, false, 5);
        }
        d0();
    }

    private void N0(long j10) {
        long j11 = (this.f22531C.f22848e != 3 || (!this.f22577y && s1())) ? f22528A0 : 1000;
        if (this.f22577y && s1()) {
            for (u0 u0Var : this.f22553a) {
                if (X(u0Var)) {
                    j11 = Math.min(j11, N.q1(u0Var.H(this.f22546R, this.f22547S)));
                }
            }
        }
        this.f22561i.j(2, j10 + j11);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x019d A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void O(q3.J r28, boolean r29) {
        /*
            r27 = this;
            r11 = r27
            r12 = r28
            androidx.media3.exoplayer.r0 r2 = r11.f22531C
            androidx.media3.exoplayer.W$h r3 = r11.f22545Q
            androidx.media3.exoplayer.c0 r4 = r11.f22572t
            int r5 = r11.f22539K
            boolean r6 = r11.f22540L
            q3.J$c r7 = r11.f22564l
            q3.J$b r8 = r11.f22565m
            r1 = r28
            androidx.media3.exoplayer.W$g r7 = K0(r1, r2, r3, r4, r5, r6, r7, r8)
            G3.C$b r9 = r7.f22599a
            long r13 = r7.f22601c
            boolean r0 = r7.f22602d
            long r5 = r7.f22600b
            androidx.media3.exoplayer.r0 r1 = r11.f22531C
            G3.C$b r1 = r1.f22845b
            boolean r1 = r1.equals(r9)
            r10 = 1
            r15 = 0
            if (r1 == 0) goto L_0x0038
            androidx.media3.exoplayer.r0 r1 = r11.f22531C
            long r1 = r1.f22862s
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0035
            goto L_0x0038
        L_0x0035:
            r16 = r15
            goto L_0x003a
        L_0x0038:
            r16 = r10
        L_0x003a:
            r8 = 2
            r17 = 3
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2 = 4
            boolean r1 = r7.f22603e     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x005c
            androidx.media3.exoplayer.r0 r1 = r11.f22531C     // Catch:{ all -> 0x0051 }
            int r1 = r1.f22848e     // Catch:{ all -> 0x0051 }
            if (r1 == r10) goto L_0x0059
            r11.p1(r2)     // Catch:{ all -> 0x0051 }
            goto L_0x0059
        L_0x0051:
            r0 = move-exception
            r20 = r2
            r4 = r8
            r8 = 0
            r10 = -1
            goto L_0x0166
        L_0x0059:
            r11.E0(r15, r15, r15, r10)     // Catch:{ all -> 0x0051 }
        L_0x005c:
            androidx.media3.exoplayer.u0[] r1 = r11.f22553a     // Catch:{ all -> 0x0051 }
            int r2 = r1.length     // Catch:{ all -> 0x006a }
            r3 = r15
        L_0x0060:
            if (r3 >= r2) goto L_0x0072
            r4 = r1[r3]     // Catch:{ all -> 0x006a }
            r4.m(r12)     // Catch:{ all -> 0x006a }
            int r3 = r3 + 1
            goto L_0x0060
        L_0x006a:
            r0 = move-exception
            r4 = r8
            r8 = 0
            r10 = -1
            r20 = 4
            goto L_0x0166
        L_0x0072:
            if (r16 != 0) goto L_0x00a0
            androidx.media3.exoplayer.c0 r1 = r11.f22572t     // Catch:{ all -> 0x0098 }
            long r3 = r11.f22546R     // Catch:{ all -> 0x0098 }
            long r23 = r27.F()     // Catch:{ all -> 0x0098 }
            r20 = 4
            r2 = r28
            r10 = -1
            r25 = r5
            r5 = r23
            boolean r0 = r1.V(r2, r3, r5)     // Catch:{ all -> 0x0091 }
            if (r0 != 0) goto L_0x008e
            r11.P0(r15)     // Catch:{ all -> 0x0091 }
        L_0x008e:
            r5 = r25
            goto L_0x00de
        L_0x0091:
            r0 = move-exception
            r4 = r8
            r5 = r25
        L_0x0095:
            r8 = 0
            goto L_0x0166
        L_0x0098:
            r0 = move-exception
            r25 = r5
            r10 = -1
            r20 = 4
        L_0x009e:
            r4 = r8
            goto L_0x0095
        L_0x00a0:
            r25 = r5
            r10 = -1
            r20 = 4
            boolean r1 = r28.q()     // Catch:{ all -> 0x0091 }
            if (r1 != 0) goto L_0x008e
            androidx.media3.exoplayer.c0 r1 = r11.f22572t     // Catch:{ all -> 0x00da }
            androidx.media3.exoplayer.Z r1 = r1.t()     // Catch:{ all -> 0x00da }
        L_0x00b1:
            if (r1 == 0) goto L_0x00cf
            androidx.media3.exoplayer.a0 r2 = r1.f22631h     // Catch:{ all -> 0x0091 }
            G3.C$b r2 = r2.f22647a     // Catch:{ all -> 0x0091 }
            boolean r2 = r2.equals(r9)     // Catch:{ all -> 0x0091 }
            if (r2 == 0) goto L_0x00ca
            androidx.media3.exoplayer.c0 r2 = r11.f22572t     // Catch:{ all -> 0x0091 }
            androidx.media3.exoplayer.a0 r3 = r1.f22631h     // Catch:{ all -> 0x0091 }
            androidx.media3.exoplayer.a0 r2 = r2.x(r12, r3)     // Catch:{ all -> 0x0091 }
            r1.f22631h = r2     // Catch:{ all -> 0x0091 }
            r1.E()     // Catch:{ all -> 0x0091 }
        L_0x00ca:
            androidx.media3.exoplayer.Z r1 = r1.k()     // Catch:{ all -> 0x0091 }
            goto L_0x00b1
        L_0x00cf:
            r5 = r25
            long r0 = r11.R0(r9, r5, r0)     // Catch:{ all -> 0x00d8 }
            r22 = r0
            goto L_0x00e0
        L_0x00d8:
            r0 = move-exception
            goto L_0x009e
        L_0x00da:
            r0 = move-exception
            r5 = r25
            goto L_0x009e
        L_0x00de:
            r22 = r5
        L_0x00e0:
            androidx.media3.exoplayer.r0 r0 = r11.f22531C
            q3.J r4 = r0.f22844a
            G3.C$b r5 = r0.f22845b
            boolean r0 = r7.f22604f
            if (r0 == 0) goto L_0x00ed
            r6 = r22
            goto L_0x00ef
        L_0x00ed:
            r6 = r18
        L_0x00ef:
            r0 = 0
            r1 = r27
            r2 = r28
            r3 = r9
            r8 = r0
            r1.E1(r2, r3, r4, r5, r6, r8)
            if (r16 != 0) goto L_0x0103
            androidx.media3.exoplayer.r0 r0 = r11.f22531C
            long r0 = r0.f22846c
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0141
        L_0x0103:
            androidx.media3.exoplayer.r0 r0 = r11.f22531C
            G3.C$b r1 = r0.f22845b
            java.lang.Object r1 = r1.f35620a
            q3.J r0 = r0.f22844a
            if (r16 == 0) goto L_0x0122
            if (r29 == 0) goto L_0x0122
            boolean r2 = r0.q()
            if (r2 != 0) goto L_0x0122
            q3.J$b r2 = r11.f22565m
            q3.J$b r0 = r0.h(r1, r2)
            boolean r0 = r0.f27907f
            if (r0 != 0) goto L_0x0122
            r21 = 1
            goto L_0x0124
        L_0x0122:
            r21 = r15
        L_0x0124:
            androidx.media3.exoplayer.r0 r0 = r11.f22531C
            long r7 = r0.f22847d
            int r0 = r12.b(r1)
            if (r0 != r10) goto L_0x0131
            r10 = r20
            goto L_0x0133
        L_0x0131:
            r10 = r17
        L_0x0133:
            r1 = r27
            r2 = r9
            r3 = r22
            r5 = r13
            r9 = r21
            androidx.media3.exoplayer.r0 r0 = r1.S(r2, r3, r5, r7, r9, r10)
            r11.f22531C = r0
        L_0x0141:
            r27.F0()
            androidx.media3.exoplayer.r0 r0 = r11.f22531C
            q3.J r0 = r0.f22844a
            r11.J0(r12, r0)
            androidx.media3.exoplayer.r0 r0 = r11.f22531C
            androidx.media3.exoplayer.r0 r0 = r0.j(r12)
            r11.f22531C = r0
            boolean r0 = r28.q()
            if (r0 != 0) goto L_0x015c
            r8 = 0
            r11.f22545Q = r8
        L_0x015c:
            r11.M(r15)
            t3.m r0 = r11.f22561i
            r4 = 2
            r0.i(r4)
            return
        L_0x0166:
            androidx.media3.exoplayer.r0 r1 = r11.f22531C
            q3.J r3 = r1.f22844a
            G3.C$b r2 = r1.f22845b
            boolean r1 = r7.f22604f
            if (r1 == 0) goto L_0x0172
            r18 = r5
        L_0x0172:
            r22 = 0
            r1 = r27
            r7 = r2
            r2 = r28
            r23 = r3
            r3 = r9
            r4 = r23
            r23 = r5
            r5 = r7
            r6 = r18
            r15 = r8
            r8 = r22
            r1.E1(r2, r3, r4, r5, r6, r8)
            if (r16 != 0) goto L_0x0193
            androidx.media3.exoplayer.r0 r1 = r11.f22531C
            long r1 = r1.f22846c
            int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x01d1
        L_0x0193:
            androidx.media3.exoplayer.r0 r1 = r11.f22531C
            G3.C$b r2 = r1.f22845b
            java.lang.Object r2 = r2.f35620a
            q3.J r1 = r1.f22844a
            if (r16 == 0) goto L_0x01b2
            if (r29 == 0) goto L_0x01b2
            boolean r3 = r1.q()
            if (r3 != 0) goto L_0x01b2
            q3.J$b r3 = r11.f22565m
            q3.J$b r1 = r1.h(r2, r3)
            boolean r1 = r1.f27907f
            if (r1 != 0) goto L_0x01b2
            r21 = 1
            goto L_0x01b4
        L_0x01b2:
            r21 = 0
        L_0x01b4:
            androidx.media3.exoplayer.r0 r1 = r11.f22531C
            long r7 = r1.f22847d
            int r1 = r12.b(r2)
            if (r1 != r10) goto L_0x01c1
            r10 = r20
            goto L_0x01c3
        L_0x01c1:
            r10 = r17
        L_0x01c3:
            r1 = r27
            r2 = r9
            r3 = r23
            r5 = r13
            r9 = r21
            androidx.media3.exoplayer.r0 r1 = r1.S(r2, r3, r5, r7, r9, r10)
            r11.f22531C = r1
        L_0x01d1:
            r27.F0()
            androidx.media3.exoplayer.r0 r1 = r11.f22531C
            q3.J r1 = r1.f22844a
            r11.J0(r12, r1)
            androidx.media3.exoplayer.r0 r1 = r11.f22531C
            androidx.media3.exoplayer.r0 r1 = r1.j(r12)
            r11.f22531C = r1
            boolean r1 = r28.q()
            if (r1 != 0) goto L_0x01eb
            r11.f22545Q = r15
        L_0x01eb:
            r1 = 0
            r11.M(r1)
            t3.m r1 = r11.f22561i
            r2 = 2
            r1.i(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.W.O(q3.J, boolean):void");
    }

    private void P(C6478B b10) {
        if (this.f22572t.D(b10)) {
            N((Z) C5950a.e(this.f22572t.m()));
            return;
        }
        Z u10 = this.f22572t.u(b10);
        if (u10 != null) {
            C5950a.g(!u10.f22629f);
            float f10 = this.f22568p.e().f27859a;
            r0 r0Var = this.f22531C;
            u10.q(f10, r0Var.f22844a, r0Var.f22855l);
            if (this.f22572t.E(b10)) {
                e0();
            }
        }
    }

    private void P0(boolean z10) {
        C6479C.b bVar = this.f22572t.t().f22631h.f22647a;
        long S02 = S0(bVar, this.f22531C.f22862s, true, false);
        if (S02 != this.f22531C.f22862s) {
            r0 r0Var = this.f22531C;
            this.f22531C = S(bVar, S02, r0Var.f22846c, r0Var.f22847d, z10, 5);
        }
    }

    private void Q(q3.D d10, float f10, boolean z10, boolean z11) {
        if (z10) {
            if (z11) {
                this.f22532D.b(1);
            }
            this.f22531C = this.f22531C.g(d10);
        }
        G1(d10.f27859a);
        for (u0 u0Var : this.f22553a) {
            if (u0Var != null) {
                u0Var.M(f10, d10.f27859a);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ac A[Catch:{ all -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b3 A[Catch:{ all -> 0x00af }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void Q0(androidx.media3.exoplayer.W.h r19) {
        /*
            r18 = this;
            r11 = r18
            r0 = r19
            androidx.media3.exoplayer.W$e r1 = r11.f22532D
            r8 = 1
            r1.b(r8)
            androidx.media3.exoplayer.r0 r1 = r11.f22531C
            q3.J r1 = r1.f22844a
            int r4 = r11.f22539K
            boolean r5 = r11.f22540L
            q3.J$c r6 = r11.f22564l
            q3.J$b r7 = r11.f22565m
            r3 = 1
            r2 = r19
            android.util.Pair r1 = L0(r1, r2, r3, r4, r5, r6, r7)
            r2 = 0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 0
            if (r1 != 0) goto L_0x004c
            androidx.media3.exoplayer.r0 r7 = r11.f22531C
            q3.J r7 = r7.f22844a
            android.util.Pair r7 = r11.G(r7)
            java.lang.Object r9 = r7.first
            G3.C$b r9 = (G3.C6479C.b) r9
            java.lang.Object r7 = r7.second
            java.lang.Long r7 = (java.lang.Long) r7
            long r12 = r7.longValue()
            androidx.media3.exoplayer.r0 r7 = r11.f22531C
            q3.J r7 = r7.f22844a
            boolean r7 = r7.q()
            r7 = r7 ^ r8
            r10 = r7
            r16 = r4
        L_0x0047:
            r4 = r12
            r12 = r16
            goto L_0x00a2
        L_0x004c:
            java.lang.Object r7 = r1.first
            java.lang.Object r9 = r1.second
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            long r9 = r0.f22607c
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 != 0) goto L_0x005e
            r9 = r4
            goto L_0x005f
        L_0x005e:
            r9 = r12
        L_0x005f:
            androidx.media3.exoplayer.c0 r14 = r11.f22572t
            androidx.media3.exoplayer.r0 r15 = r11.f22531C
            q3.J r15 = r15.f22844a
            G3.C$b r7 = r14.P(r15, r7, r12)
            boolean r14 = r7.b()
            if (r14 == 0) goto L_0x0094
            androidx.media3.exoplayer.r0 r4 = r11.f22531C
            q3.J r4 = r4.f22844a
            java.lang.Object r5 = r7.f35620a
            q3.J$b r12 = r11.f22565m
            r4.h(r5, r12)
            q3.J$b r4 = r11.f22565m
            int r5 = r7.f35621b
            int r4 = r4.k(r5)
            int r5 = r7.f35622c
            if (r4 != r5) goto L_0x008e
            q3.J$b r4 = r11.f22565m
            long r4 = r4.g()
            r12 = r4
            goto L_0x008f
        L_0x008e:
            r12 = r2
        L_0x008f:
            r4 = r12
            r12 = r9
            r9 = r7
            r10 = r8
            goto L_0x00a2
        L_0x0094:
            long r14 = r0.f22607c
            int r4 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x009c
            r4 = r8
            goto L_0x009d
        L_0x009c:
            r4 = r6
        L_0x009d:
            r16 = r9
            r10 = r4
            r9 = r7
            goto L_0x0047
        L_0x00a2:
            androidx.media3.exoplayer.r0 r7 = r11.f22531C     // Catch:{ all -> 0x00af }
            q3.J r7 = r7.f22844a     // Catch:{ all -> 0x00af }
            boolean r7 = r7.q()     // Catch:{ all -> 0x00af }
            if (r7 == 0) goto L_0x00b3
            r11.f22545Q = r0     // Catch:{ all -> 0x00af }
            goto L_0x00c2
        L_0x00af:
            r0 = move-exception
            r7 = r4
            goto L_0x014a
        L_0x00b3:
            r0 = 4
            if (r1 != 0) goto L_0x00c5
            androidx.media3.exoplayer.r0 r1 = r11.f22531C     // Catch:{ all -> 0x00af }
            int r1 = r1.f22848e     // Catch:{ all -> 0x00af }
            if (r1 == r8) goto L_0x00bf
            r11.p1(r0)     // Catch:{ all -> 0x00af }
        L_0x00bf:
            r11.E0(r6, r8, r6, r8)     // Catch:{ all -> 0x00af }
        L_0x00c2:
            r7 = r4
            goto L_0x0139
        L_0x00c5:
            androidx.media3.exoplayer.r0 r1 = r11.f22531C     // Catch:{ all -> 0x00af }
            G3.C$b r1 = r1.f22845b     // Catch:{ all -> 0x00af }
            boolean r1 = r9.equals(r1)     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x0114
            androidx.media3.exoplayer.c0 r1 = r11.f22572t     // Catch:{ all -> 0x00af }
            androidx.media3.exoplayer.Z r1 = r1.t()     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x00e8
            boolean r7 = r1.f22629f     // Catch:{ all -> 0x00af }
            if (r7 == 0) goto L_0x00e8
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00e8
            G3.B r1 = r1.f22624a     // Catch:{ all -> 0x00af }
            z3.J r2 = r11.f22530B     // Catch:{ all -> 0x00af }
            long r1 = r1.p(r4, r2)     // Catch:{ all -> 0x00af }
            goto L_0x00e9
        L_0x00e8:
            r1 = r4
        L_0x00e9:
            long r14 = t3.N.q1(r1)     // Catch:{ all -> 0x00af }
            androidx.media3.exoplayer.r0 r3 = r11.f22531C     // Catch:{ all -> 0x00af }
            long r6 = r3.f22862s     // Catch:{ all -> 0x00af }
            long r6 = t3.N.q1(r6)     // Catch:{ all -> 0x00af }
            int r3 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0115
            androidx.media3.exoplayer.r0 r3 = r11.f22531C     // Catch:{ all -> 0x00af }
            int r6 = r3.f22848e     // Catch:{ all -> 0x00af }
            r7 = 2
            if (r6 == r7) goto L_0x0103
            r7 = 3
            if (r6 != r7) goto L_0x0115
        L_0x0103:
            long r7 = r3.f22862s     // Catch:{ all -> 0x00af }
            r0 = 2
            r1 = r18
            r2 = r9
            r3 = r7
            r5 = r12
            r9 = r10
            r10 = r0
            androidx.media3.exoplayer.r0 r0 = r1.S(r2, r3, r5, r7, r9, r10)
            r11.f22531C = r0
            return
        L_0x0114:
            r1 = r4
        L_0x0115:
            androidx.media3.exoplayer.r0 r3 = r11.f22531C     // Catch:{ all -> 0x00af }
            int r3 = r3.f22848e     // Catch:{ all -> 0x00af }
            if (r3 != r0) goto L_0x011d
            r0 = r8
            goto L_0x011e
        L_0x011d:
            r0 = 0
        L_0x011e:
            long r14 = r11.R0(r9, r1, r0)     // Catch:{ all -> 0x00af }
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0127
            goto L_0x0128
        L_0x0127:
            r8 = 0
        L_0x0128:
            r10 = r10 | r8
            androidx.media3.exoplayer.r0 r0 = r11.f22531C     // Catch:{ all -> 0x0148 }
            q3.J r4 = r0.f22844a     // Catch:{ all -> 0x0148 }
            G3.C$b r5 = r0.f22845b     // Catch:{ all -> 0x0148 }
            r8 = 1
            r1 = r18
            r2 = r4
            r3 = r9
            r6 = r12
            r1.E1(r2, r3, r4, r5, r6, r8)     // Catch:{ all -> 0x0148 }
            r7 = r14
        L_0x0139:
            r0 = 2
            r1 = r18
            r2 = r9
            r3 = r7
            r5 = r12
            r9 = r10
            r10 = r0
            androidx.media3.exoplayer.r0 r0 = r1.S(r2, r3, r5, r7, r9, r10)
            r11.f22531C = r0
            return
        L_0x0148:
            r0 = move-exception
            r7 = r14
        L_0x014a:
            r14 = 2
            r1 = r18
            r2 = r9
            r3 = r7
            r5 = r12
            r9 = r10
            r10 = r14
            androidx.media3.exoplayer.r0 r1 = r1.S(r2, r3, r5, r7, r9, r10)
            r11.f22531C = r1
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.W.Q0(androidx.media3.exoplayer.W$h):void");
    }

    private void R(q3.D d10, boolean z10) {
        Q(d10, d10.f27859a, true, z10);
    }

    private long R0(C6479C.b bVar, long j10, boolean z10) {
        return S0(bVar, j10, this.f22572t.t() != this.f22572t.w(), z10);
    }

    private r0 S(C6479C.b bVar, long j10, long j11, long j12, boolean z10, int i10) {
        C9967v<z> vVar;
        D d10;
        k0 k0Var;
        C6479C.b bVar2 = bVar;
        long j13 = j11;
        this.f22549U = this.f22549U || j10 != this.f22531C.f22862s || !bVar.equals(this.f22531C.f22845b);
        F0();
        r0 r0Var = this.f22531C;
        k0 k0Var2 = r0Var.f22851h;
        D d11 = r0Var.f22852i;
        List<z> list = r0Var.f22853j;
        if (this.f22573u.t()) {
            Z t10 = this.f22572t.t();
            k0 o10 = t10 == null ? k0.f35937d : t10.o();
            D p10 = t10 == null ? this.f22558f : t10.p();
            C9967v<z> B10 = B(p10.f36667c);
            if (t10 != null) {
                C5224a0 a0Var = t10.f22631h;
                if (a0Var.f22649c != j13) {
                    t10.f22631h = a0Var.a(j13);
                }
            }
            k0();
            k0Var = o10;
            d10 = p10;
            vVar = B10;
        } else if (!bVar.equals(this.f22531C.f22845b)) {
            k0Var = k0.f35937d;
            d10 = this.f22558f;
            vVar = C9967v.E();
        } else {
            vVar = list;
            k0Var = k0Var2;
            d10 = d11;
        }
        if (z10) {
            this.f22532D.d(i10);
        }
        return this.f22531C.d(bVar, j10, j11, j12, I(), k0Var, d10, vVar);
    }

    private long S0(C6479C.b bVar, long j10, boolean z10, boolean z11) {
        y1();
        F1(false, true);
        if (z11 || this.f22531C.f22848e == 3) {
            p1(2);
        }
        Z t10 = this.f22572t.t();
        Z z12 = t10;
        while (z12 != null && !bVar.equals(z12.f22631h.f22647a)) {
            z12 = z12.k();
        }
        if (z10 || t10 != z12 || (z12 != null && z12.D(j10) < 0)) {
            for (int i10 = 0; i10 < this.f22553a.length; i10++) {
                u(i10);
            }
            if (z12 != null) {
                while (this.f22572t.t() != z12) {
                    this.f22572t.b();
                }
                this.f22572t.M(z12);
                z12.B(1000000000000L);
                x();
            }
        }
        if (z12 != null) {
            this.f22572t.M(z12);
            if (!z12.f22629f) {
                z12.f22631h = z12.f22631h.b(j10);
            } else if (z12.f22630g) {
                j10 = z12.f22624a.i(j10);
                z12.f22624a.u(j10 - this.f22566n, this.f22567o);
            }
            G0(j10);
            d0();
        } else {
            this.f22572t.f();
            G0(j10);
        }
        M(false);
        this.f22561i.i(2);
        return j10;
    }

    private boolean T(u0 u0Var, Z z10) {
        Z k10 = z10.k();
        return z10.f22631h.f22652f && k10.f22629f && ((u0Var instanceof i) || (u0Var instanceof F3.c) || u0Var.P() >= k10.n());
    }

    private void T0(s0 s0Var) {
        if (s0Var.f() == -9223372036854775807L) {
            U0(s0Var);
        } else if (this.f22531C.f22844a.q()) {
            this.f22569q.add(new d(s0Var));
        } else {
            d dVar = new d(s0Var);
            q3.J j10 = this.f22531C.f22844a;
            if (I0(dVar, j10, j10, this.f22539K, this.f22540L, this.f22564l, this.f22565m)) {
                this.f22569q.add(dVar);
                Collections.sort(this.f22569q);
                return;
            }
            s0Var.k(false);
        }
    }

    private boolean U() {
        Z w10 = this.f22572t.w();
        if (!w10.f22629f) {
            return false;
        }
        int i10 = 0;
        while (true) {
            u0[] u0VarArr = this.f22553a;
            if (i10 >= u0VarArr.length) {
                return true;
            }
            u0 u0Var = u0VarArr[i10];
            a0 a0Var = w10.f22626c[i10];
            if (u0Var.j() != a0Var || (a0Var != null && !u0Var.n() && !T(u0Var, w10))) {
                return false;
            }
            i10++;
        }
        return false;
    }

    private void U0(s0 s0Var) {
        if (s0Var.c() == this.f22563k) {
            t(s0Var);
            int i10 = this.f22531C.f22848e;
            if (i10 == 3 || i10 == 2) {
                this.f22561i.i(2);
                return;
            }
            return;
        }
        this.f22561i.d(15, s0Var).a();
    }

    private static boolean V(boolean z10, C6479C.b bVar, long j10, C6479C.b bVar2, J.b bVar3, long j11) {
        if (z10 || j10 != j11 || !bVar.f35620a.equals(bVar2.f35620a)) {
            return false;
        }
        return (!bVar.b() || !bVar3.r(bVar.f35621b)) ? bVar2.b() && bVar3.r(bVar2.f35621b) : (bVar3.h(bVar.f35621b, bVar.f35622c) == 4 || bVar3.h(bVar.f35621b, bVar.f35622c) == 2) ? false : true;
    }

    private void V0(s0 s0Var) {
        Looper c10 = s0Var.c();
        if (!c10.getThread().isAlive()) {
            q.h("TAG", "Trying to send message on a dead thread.");
            s0Var.k(false);
            return;
        }
        this.f22570r.e(c10, (Handler.Callback) null).h(new V(this, s0Var));
    }

    private boolean W(Z z10) {
        return (z10 == null || z10.r() || z10.l() == Long.MIN_VALUE) ? false : true;
    }

    private void W0(long j10) {
        for (u0 u0Var : this.f22553a) {
            if (u0Var.j() != null) {
                X0(u0Var, j10);
            }
        }
    }

    private static boolean X(u0 u0Var) {
        return u0Var.getState() != 0;
    }

    private void X0(u0 u0Var, long j10) {
        u0Var.q();
        if (u0Var instanceof i) {
            ((i) u0Var).J0(j10);
        }
    }

    private boolean Y() {
        Z t10 = this.f22572t.t();
        long j10 = t10.f22631h.f22651e;
        return t10.f22629f && (j10 == -9223372036854775807L || this.f22531C.f22862s < j10 || !s1());
    }

    private void Y0(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.f22541M != z10) {
            this.f22541M = z10;
            if (!z10) {
                for (u0 u0Var : this.f22553a) {
                    if (!X(u0Var) && this.f22554b.remove(u0Var)) {
                        u0Var.a();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private static boolean Z(r0 r0Var, J.b bVar) {
        C6479C.b bVar2 = r0Var.f22845b;
        q3.J j10 = r0Var.f22844a;
        return j10.q() || j10.h(bVar2.f35620a, bVar).f27907f;
    }

    private void Z0(q3.D d10) {
        this.f22561i.k(16);
        this.f22568p.g(d10);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a0(int i10, boolean z10) {
        this.f22579z.e0(i10, this.f22553a[i10].i(), z10);
    }

    private void a1(b bVar) {
        this.f22532D.b(1);
        if (bVar.f22584c != -1) {
            this.f22545Q = new h(new t0(bVar.f22582a, bVar.f22583b), bVar.f22584c, bVar.f22585d);
        }
        O(this.f22573u.D(bVar.f22582a, bVar.f22583b), false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean b0() {
        return Boolean.valueOf(this.f22533E);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c0(s0 s0Var) {
        try {
            t(s0Var);
        } catch (C5233j e10) {
            q.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    private void c1(boolean z10) {
        if (z10 != this.f22543O) {
            this.f22543O = z10;
            if (!z10 && this.f22531C.f22859p) {
                this.f22561i.i(2);
            }
        }
    }

    private void d0() {
        boolean r12 = r1();
        this.f22538J = r12;
        if (r12) {
            Z z10 = (Z) C5950a.e(this.f22572t.m());
            z10.e(new Y.b().f(z10.C(this.f22546R)).g(this.f22568p.e().f27859a).e(this.f22537I).d());
        }
        z1();
    }

    private void d1(boolean z10) {
        this.f22534F = z10;
        F0();
        if (this.f22535G && this.f22572t.w() != this.f22572t.t()) {
            P0(true);
            M(false);
        }
    }

    private void e0() {
        this.f22572t.H();
        Z v10 = this.f22572t.v();
        if (v10 == null) {
            return;
        }
        if ((!v10.f22628e || v10.f22629f) && !v10.f22624a.a()) {
            if (this.f22559g.o(this.f22531C.f22844a, v10.f22631h.f22647a, v10.f22629f ? v10.f22624a.d() : 0)) {
                if (!v10.f22628e) {
                    v10.v(this, v10.f22631h.f22648b);
                } else {
                    v10.e(new Y.b().f(v10.C(this.f22546R)).g(this.f22568p.e().f27859a).e(this.f22537I).d());
                }
            }
        }
    }

    private void f0() {
        this.f22532D.c(this.f22531C);
        if (this.f22532D.f22594a) {
            this.f22571s.a(this.f22532D);
            this.f22532D = new e(this.f22531C);
        }
    }

    private void f1(boolean z10, int i10, boolean z11, int i11) {
        this.f22532D.b(z11 ? 1 : 0);
        this.f22531C = this.f22531C.e(z10, i11, i10);
        F1(false, false);
        s0(z10);
        if (!s1()) {
            y1();
            D1();
            return;
        }
        int i12 = this.f22531C.f22848e;
        if (i12 == 3) {
            this.f22568p.f();
            v1();
            this.f22561i.i(2);
        } else if (i12 == 2) {
            this.f22561i.i(2);
        }
    }

    private void g0(int i10) {
        u0 u0Var = this.f22553a[i10];
        try {
            u0Var.z();
        } catch (IOException | RuntimeException e10) {
            int i11 = u0Var.i();
            if (i11 == 3 || i11 == 5) {
                D p10 = this.f22572t.t().p();
                q.d("ExoPlayerImplInternal", "Disabling track due to error: " + C5807s.i(p10.f36667c[i10].l()), e10);
                D d10 = new D((H[]) p10.f36666b.clone(), (x[]) p10.f36667c.clone(), p10.f36668d, p10.f36669e);
                d10.f36666b[i10] = null;
                d10.f36667c[i10] = null;
                u(i10);
                this.f22572t.t().a(d10, this.f22531C.f22862s, false);
                return;
            }
            throw e10;
        }
    }

    private void h0(int i10, boolean z10) {
        boolean[] zArr = this.f22556d;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.f22529A.h(new T(this, i10, z10));
        }
    }

    private void h1(q3.D d10) {
        Z0(d10);
        R(this.f22568p.e(), true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0078 A[EDGE_INSN: B:72:0x0078->B:25:0x0078 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i0(long r9, long r11) {
        /*
            r8 = this;
            java.util.ArrayList<androidx.media3.exoplayer.W$d> r0 = r8.f22569q
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00fc
            androidx.media3.exoplayer.r0 r0 = r8.f22531C
            G3.C$b r0 = r0.f22845b
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0014
            goto L_0x00fc
        L_0x0014:
            boolean r0 = r8.f22549U
            if (r0 == 0) goto L_0x001e
            r0 = 1
            long r9 = r9 - r0
            r0 = 0
            r8.f22549U = r0
        L_0x001e:
            androidx.media3.exoplayer.r0 r0 = r8.f22531C
            q3.J r1 = r0.f22844a
            G3.C$b r0 = r0.f22845b
            java.lang.Object r0 = r0.f35620a
            int r0 = r1.b(r0)
            int r1 = r8.f22548T
            java.util.ArrayList<androidx.media3.exoplayer.W$d> r2 = r8.f22569q
            int r2 = r2.size()
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            if (r1 <= 0) goto L_0x0044
            java.util.ArrayList<androidx.media3.exoplayer.W$d> r3 = r8.f22569q
            int r4 = r1 + -1
            java.lang.Object r3 = r3.get(r4)
            androidx.media3.exoplayer.W$d r3 = (androidx.media3.exoplayer.W.d) r3
            goto L_0x0045
        L_0x0044:
            r3 = r2
        L_0x0045:
            if (r3 == 0) goto L_0x0067
            int r4 = r3.f22591b
            if (r4 > r0) goto L_0x0053
            if (r4 != r0) goto L_0x0067
            long r3 = r3.f22592c
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x0067
        L_0x0053:
            int r3 = r1 + -1
            if (r3 <= 0) goto L_0x0062
            java.util.ArrayList<androidx.media3.exoplayer.W$d> r4 = r8.f22569q
            int r1 = r1 + -2
            java.lang.Object r1 = r4.get(r1)
            androidx.media3.exoplayer.W$d r1 = (androidx.media3.exoplayer.W.d) r1
            goto L_0x0063
        L_0x0062:
            r1 = r2
        L_0x0063:
            r7 = r3
            r3 = r1
            r1 = r7
            goto L_0x0045
        L_0x0067:
            java.util.ArrayList<androidx.media3.exoplayer.W$d> r3 = r8.f22569q
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0078
            java.util.ArrayList<androidx.media3.exoplayer.W$d> r3 = r8.f22569q
            java.lang.Object r3 = r3.get(r1)
            androidx.media3.exoplayer.W$d r3 = (androidx.media3.exoplayer.W.d) r3
            goto L_0x0079
        L_0x0078:
            r3 = r2
        L_0x0079:
            if (r3 == 0) goto L_0x009e
            java.lang.Object r4 = r3.f22593d
            if (r4 == 0) goto L_0x009e
            int r4 = r3.f22591b
            if (r4 < r0) goto L_0x008b
            if (r4 != r0) goto L_0x009e
            long r4 = r3.f22592c
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 > 0) goto L_0x009e
        L_0x008b:
            int r1 = r1 + 1
            java.util.ArrayList<androidx.media3.exoplayer.W$d> r3 = r8.f22569q
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0078
            java.util.ArrayList<androidx.media3.exoplayer.W$d> r3 = r8.f22569q
            java.lang.Object r3 = r3.get(r1)
            androidx.media3.exoplayer.W$d r3 = (androidx.media3.exoplayer.W.d) r3
            goto L_0x0079
        L_0x009e:
            if (r3 == 0) goto L_0x00fa
            java.lang.Object r4 = r3.f22593d
            if (r4 == 0) goto L_0x00fa
            int r4 = r3.f22591b
            if (r4 != r0) goto L_0x00fa
            long r4 = r3.f22592c
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x00fa
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 > 0) goto L_0x00fa
            androidx.media3.exoplayer.s0 r4 = r3.f22590a     // Catch:{ all -> 0x00e3 }
            r8.U0(r4)     // Catch:{ all -> 0x00e3 }
            androidx.media3.exoplayer.s0 r4 = r3.f22590a
            boolean r4 = r4.b()
            if (r4 != 0) goto L_0x00cb
            androidx.media3.exoplayer.s0 r3 = r3.f22590a
            boolean r3 = r3.j()
            if (r3 == 0) goto L_0x00c8
            goto L_0x00cb
        L_0x00c8:
            int r1 = r1 + 1
            goto L_0x00d0
        L_0x00cb:
            java.util.ArrayList<androidx.media3.exoplayer.W$d> r3 = r8.f22569q
            r3.remove(r1)
        L_0x00d0:
            java.util.ArrayList<androidx.media3.exoplayer.W$d> r3 = r8.f22569q
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x00e1
            java.util.ArrayList<androidx.media3.exoplayer.W$d> r3 = r8.f22569q
            java.lang.Object r3 = r3.get(r1)
            androidx.media3.exoplayer.W$d r3 = (androidx.media3.exoplayer.W.d) r3
            goto L_0x009e
        L_0x00e1:
            r3 = r2
            goto L_0x009e
        L_0x00e3:
            r9 = move-exception
            androidx.media3.exoplayer.s0 r10 = r3.f22590a
            boolean r10 = r10.b()
            if (r10 != 0) goto L_0x00f4
            androidx.media3.exoplayer.s0 r10 = r3.f22590a
            boolean r10 = r10.j()
            if (r10 == 0) goto L_0x00f9
        L_0x00f4:
            java.util.ArrayList<androidx.media3.exoplayer.W$d> r10 = r8.f22569q
            r10.remove(r1)
        L_0x00f9:
            throw r9
        L_0x00fa:
            r8.f22548T = r1
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.W.i0(long, long):void");
    }

    private void i1(ExoPlayer.c cVar) {
        this.f22578y0 = cVar;
        this.f22572t.U(this.f22531C.f22844a, cVar);
    }

    private boolean j0() {
        C5224a0 s10;
        this.f22572t.J(this.f22546R);
        boolean z10 = false;
        if (this.f22572t.S() && (s10 = this.f22572t.s(this.f22546R, this.f22531C)) != null) {
            Z g10 = this.f22572t.g(s10);
            if (!g10.f22628e) {
                g10.v(this, s10.f22648b);
            } else if (g10.f22629f) {
                this.f22561i.d(8, g10.f22624a).a();
            }
            if (this.f22572t.t() == g10) {
                G0(s10.f22648b);
            }
            M(false);
            z10 = true;
        }
        if (this.f22538J) {
            this.f22538J = W(this.f22572t.m());
            z1();
        } else {
            d0();
        }
        return z10;
    }

    private void k0() {
        boolean z10;
        Z t10 = this.f22572t.t();
        if (t10 != null) {
            D p10 = t10.p();
            boolean z11 = false;
            int i10 = 0;
            boolean z12 = false;
            while (true) {
                if (i10 >= this.f22553a.length) {
                    z10 = true;
                    break;
                }
                if (p10.c(i10)) {
                    if (this.f22553a[i10].i() != 1) {
                        z10 = false;
                        break;
                    } else if (p10.f36666b[i10].f32389a != 0) {
                        z12 = true;
                    }
                }
                i10++;
            }
            if (z12 && z10) {
                z11 = true;
            }
            c1(z11);
        }
    }

    private void k1(int i10) {
        this.f22539K = i10;
        if (!this.f22572t.W(this.f22531C.f22844a, i10)) {
            P0(true);
        }
        M(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void l0() {
        /*
            r14 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            boolean r2 = r14.q1()
            if (r2 == 0) goto L_0x006e
            if (r1 == 0) goto L_0x000d
            r14.f0()
        L_0x000d:
            androidx.media3.exoplayer.c0 r1 = r14.f22572t
            androidx.media3.exoplayer.Z r1 = r1.b()
            java.lang.Object r1 = t3.C5950a.e(r1)
            androidx.media3.exoplayer.Z r1 = (androidx.media3.exoplayer.Z) r1
            androidx.media3.exoplayer.r0 r2 = r14.f22531C
            G3.C$b r2 = r2.f22845b
            java.lang.Object r2 = r2.f35620a
            androidx.media3.exoplayer.a0 r3 = r1.f22631h
            G3.C$b r3 = r3.f22647a
            java.lang.Object r3 = r3.f35620a
            boolean r2 = r2.equals(r3)
            r3 = 1
            if (r2 == 0) goto L_0x0045
            androidx.media3.exoplayer.r0 r2 = r14.f22531C
            G3.C$b r2 = r2.f22845b
            int r4 = r2.f35621b
            r5 = -1
            if (r4 != r5) goto L_0x0045
            androidx.media3.exoplayer.a0 r4 = r1.f22631h
            G3.C$b r4 = r4.f22647a
            int r6 = r4.f35621b
            if (r6 != r5) goto L_0x0045
            int r2 = r2.f35624e
            int r4 = r4.f35624e
            if (r2 == r4) goto L_0x0045
            r2 = r3
            goto L_0x0046
        L_0x0045:
            r2 = r0
        L_0x0046:
            androidx.media3.exoplayer.a0 r1 = r1.f22631h
            G3.C$b r5 = r1.f22647a
            long r10 = r1.f22648b
            long r8 = r1.f22649c
            r12 = r2 ^ 1
            r13 = 0
            r4 = r14
            r6 = r10
            androidx.media3.exoplayer.r0 r1 = r4.S(r5, r6, r8, r10, r12, r13)
            r14.f22531C = r1
            r14.F0()
            r14.D1()
            androidx.media3.exoplayer.r0 r1 = r14.f22531C
            int r1 = r1.f22848e
            r2 = 3
            if (r1 != r2) goto L_0x0069
            r14.v1()
        L_0x0069:
            r14.q()
            r1 = r3
            goto L_0x0002
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.W.l0():void");
    }

    private void l1(z3.J j10) {
        this.f22530B = j10;
    }

    private void m0(boolean z10) {
        if (this.f22578y0.f22421a != -9223372036854775807L) {
            if (z10 || !this.f22531C.f22844a.equals(this.f22580z0)) {
                q3.J j10 = this.f22531C.f22844a;
                this.f22580z0 = j10;
                this.f22572t.z(j10);
            }
            e0();
        }
    }

    private void n0() {
        Z w10 = this.f22572t.w();
        if (w10 != null) {
            int i10 = 0;
            if (w10.k() == null || this.f22535G) {
                if (w10.f22631h.f22655i || this.f22535G) {
                    while (true) {
                        u0[] u0VarArr = this.f22553a;
                        if (i10 < u0VarArr.length) {
                            u0 u0Var = u0VarArr[i10];
                            a0 a0Var = w10.f22626c[i10];
                            if (a0Var != null && u0Var.j() == a0Var && u0Var.n()) {
                                long j10 = w10.f22631h.f22651e;
                                X0(u0Var, (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? -9223372036854775807L : w10.m() + w10.f22631h.f22651e);
                            }
                            i10++;
                        } else {
                            return;
                        }
                    }
                }
            } else if (U()) {
                if (w10.k().f22629f || this.f22546R >= w10.k().n()) {
                    D p10 = w10.p();
                    Z c10 = this.f22572t.c();
                    D p11 = c10.p();
                    q3.J j11 = this.f22531C.f22844a;
                    E1(j11, c10.f22631h.f22647a, j11, w10.f22631h.f22647a, -9223372036854775807L, false);
                    if (!c10.f22629f || c10.f22624a.l() == -9223372036854775807L) {
                        for (int i11 = 0; i11 < this.f22553a.length; i11++) {
                            boolean c11 = p10.c(i11);
                            boolean c12 = p11.c(i11);
                            if (c11 && !this.f22553a[i11].D()) {
                                boolean z10 = this.f22555c[i11].i() == -2;
                                H h10 = p10.f36666b[i11];
                                H h11 = p11.f36666b[i11];
                                if (!c12 || !h11.equals(h10) || z10) {
                                    X0(this.f22553a[i11], c10.n());
                                }
                            }
                        }
                        return;
                    }
                    W0(c10.n());
                    if (!c10.s()) {
                        this.f22572t.M(c10);
                        M(false);
                        d0();
                    }
                }
            }
        }
    }

    private void n1(boolean z10) {
        this.f22540L = z10;
        if (!this.f22572t.X(this.f22531C.f22844a, z10)) {
            P0(true);
        }
        M(false);
    }

    private void o(b bVar, int i10) {
        this.f22532D.b(1);
        q0 q0Var = this.f22573u;
        if (i10 == -1) {
            i10 = q0Var.r();
        }
        O(q0Var.f(i10, bVar.f22582a, bVar.f22583b), false);
    }

    private void o0() {
        Z w10 = this.f22572t.w();
        if (w10 != null && this.f22572t.t() != w10 && !w10.f22632i && B0()) {
            x();
        }
    }

    private void o1(c0 c0Var) {
        this.f22532D.b(1);
        O(this.f22573u.E(c0Var), false);
    }

    private void p0() {
        O(this.f22573u.i(), true);
    }

    private void p1(int i10) {
        r0 r0Var = this.f22531C;
        if (r0Var.f22848e != i10) {
            if (i10 != 2) {
                this.f22552Z = -9223372036854775807L;
            }
            this.f22531C = r0Var.h(i10);
        }
    }

    private void q() {
        D p10 = this.f22572t.t().p();
        for (int i10 = 0; i10 < this.f22553a.length; i10++) {
            if (p10.c(i10)) {
                this.f22553a[i10].h();
            }
        }
    }

    private void q0(c cVar) {
        this.f22532D.b(1);
        O(this.f22573u.w(cVar.f22586a, cVar.f22587b, cVar.f22588c, cVar.f22589d), false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        r0 = (r0 = r6.f22572t.t()).k();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean q1() {
        /*
            r6 = this;
            boolean r0 = r6.s1()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r6.f22535G
            if (r0 == 0) goto L_0x000d
            return r1
        L_0x000d:
            androidx.media3.exoplayer.c0 r0 = r6.f22572t
            androidx.media3.exoplayer.Z r0 = r0.t()
            if (r0 != 0) goto L_0x0016
            return r1
        L_0x0016:
            androidx.media3.exoplayer.Z r0 = r0.k()
            if (r0 == 0) goto L_0x002b
            long r2 = r6.f22546R
            long r4 = r0.n()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x002b
            boolean r0 = r0.f22632i
            if (r0 == 0) goto L_0x002b
            r1 = 1
        L_0x002b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.W.q1():boolean");
    }

    private void r() {
        D0();
    }

    private void r0() {
        for (Z t10 = this.f22572t.t(); t10 != null; t10 = t10.k()) {
            for (x xVar : t10.p().f36667c) {
                if (xVar != null) {
                    xVar.f();
                }
            }
        }
    }

    private boolean r1() {
        if (!W(this.f22572t.m())) {
            return false;
        }
        Z m10 = this.f22572t.m();
        long J10 = J(m10.l());
        X.a aVar = r5;
        X.a aVar2 = new X.a(this.f22576x, this.f22531C.f22844a, m10.f22631h.f22647a, m10 == this.f22572t.t() ? m10.C(this.f22546R) : m10.C(this.f22546R) - m10.f22631h.f22648b, J10, this.f22568p.e().f27859a, this.f22531C.f22855l, this.f22536H, u1(this.f22531C.f22844a, m10.f22631h.f22647a) ? this.f22574v.c() : -9223372036854775807L);
        boolean l10 = this.f22559g.l(aVar);
        Z t10 = this.f22572t.t();
        if (l10 || !t10.f22629f || J10 >= 500000) {
            return l10;
        }
        if (this.f22566n <= 0 && !this.f22567o) {
            return l10;
        }
        t10.f22624a.u(this.f22531C.f22862s, false);
        return this.f22559g.l(aVar);
    }

    /* access modifiers changed from: private */
    public Z s(C5224a0 a0Var, long j10) {
        return new Z(this.f22555c, j10, this.f22557e, this.f22559g.i(), this.f22573u, a0Var, this.f22558f, this.f22578y0.f22421a);
    }

    private void s0(boolean z10) {
        for (Z t10 = this.f22572t.t(); t10 != null; t10 = t10.k()) {
            for (x xVar : t10.p().f36667c) {
                if (xVar != null) {
                    xVar.i(z10);
                }
            }
        }
    }

    private boolean s1() {
        r0 r0Var = this.f22531C;
        return r0Var.f22855l && r0Var.f22857n == 0;
    }

    private void t(s0 s0Var) {
        if (!s0Var.j()) {
            try {
                s0Var.g().x(s0Var.i(), s0Var.e());
            } finally {
                s0Var.k(true);
            }
        }
    }

    private void t0() {
        for (Z t10 = this.f22572t.t(); t10 != null; t10 = t10.k()) {
            for (x xVar : t10.p().f36667c) {
                if (xVar != null) {
                    xVar.m();
                }
            }
        }
    }

    private boolean t1(boolean z10) {
        if (this.f22544P == 0) {
            return Y();
        }
        boolean z11 = false;
        if (!z10) {
            return false;
        }
        if (!this.f22531C.f22850g) {
            return true;
        }
        Z t10 = this.f22572t.t();
        long c10 = u1(this.f22531C.f22844a, t10.f22631h.f22647a) ? this.f22574v.c() : -9223372036854775807L;
        Z m10 = this.f22572t.m();
        boolean z12 = m10.s() && m10.f22631h.f22655i;
        if (m10.f22631h.f22647a.b() && !m10.f22629f) {
            z11 = true;
        }
        if (z12 || z11) {
            return true;
        }
        return this.f22559g.a(new X.a(this.f22576x, this.f22531C.f22844a, t10.f22631h.f22647a, t10.C(this.f22546R), J(m10.j()), this.f22568p.e().f27859a, this.f22531C.f22855l, this.f22536H, c10));
    }

    private void u(int i10) {
        u0 u0Var = this.f22553a[i10];
        if (X(u0Var)) {
            h0(i10, false);
            this.f22568p.a(u0Var);
            z(u0Var);
            u0Var.c();
            this.f22544P--;
        }
    }

    private boolean u1(q3.J j10, C6479C.b bVar) {
        if (bVar.b() || j10.q()) {
            return false;
        }
        j10.n(j10.h(bVar.f35620a, this.f22565m).f27904c, this.f22564l);
        if (!this.f22564l.f()) {
            return false;
        }
        J.c cVar = this.f22564l;
        return cVar.f27933i && cVar.f27930f != -9223372036854775807L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void v() {
        /*
            r16 = this;
            r0 = r16
            t3.d r1 = r0.f22570r
            long r1 = r1.d()
            t3.m r3 = r0.f22561i
            r4 = 2
            r3.k(r4)
            r16.C1()
            androidx.media3.exoplayer.r0 r3 = r0.f22531C
            int r3 = r3.f22848e
            r5 = 1
            if (r3 == r5) goto L_0x0201
            r6 = 4
            if (r3 != r6) goto L_0x001d
            goto L_0x0201
        L_0x001d:
            androidx.media3.exoplayer.c0 r3 = r0.f22572t
            androidx.media3.exoplayer.Z r3 = r3.t()
            if (r3 != 0) goto L_0x0029
            r0.N0(r1)
            return
        L_0x0029:
            java.lang.String r7 = "doSomeWork"
            t3.I.a(r7)
            r16.D1()
            boolean r7 = r3.f22629f
            r8 = 0
            if (r7 == 0) goto L_0x00b4
            t3.d r7 = r0.f22570r
            long r9 = r7.c()
            long r9 = t3.N.P0(r9)
            r0.f22547S = r9
            G3.B r7 = r3.f22624a
            androidx.media3.exoplayer.r0 r9 = r0.f22531C
            long r9 = r9.f22862s
            long r11 = r0.f22566n
            long r9 = r9 - r11
            boolean r11 = r0.f22567o
            r7.u(r9, r11)
            r9 = r5
            r10 = r9
            r7 = r8
        L_0x0053:
            androidx.media3.exoplayer.u0[] r11 = r0.f22553a
            int r12 = r11.length
            if (r7 >= r12) goto L_0x00bb
            r11 = r11[r7]
            boolean r12 = X(r11)
            if (r12 != 0) goto L_0x0064
            r0.h0(r7, r8)
            goto L_0x00b1
        L_0x0064:
            long r12 = r0.f22546R
            long r14 = r0.f22547S
            r11.k(r12, r14)
            if (r9 == 0) goto L_0x0075
            boolean r9 = r11.d()
            if (r9 == 0) goto L_0x0075
            r9 = r5
            goto L_0x0076
        L_0x0075:
            r9 = r8
        L_0x0076:
            G3.a0[] r12 = r3.f22626c
            r12 = r12[r7]
            G3.a0 r13 = r11.j()
            if (r12 == r13) goto L_0x0082
            r12 = r5
            goto L_0x0083
        L_0x0082:
            r12 = r8
        L_0x0083:
            if (r12 != 0) goto L_0x008d
            boolean r13 = r11.n()
            if (r13 == 0) goto L_0x008d
            r13 = r5
            goto L_0x008e
        L_0x008d:
            r13 = r8
        L_0x008e:
            if (r12 != 0) goto L_0x00a1
            if (r13 != 0) goto L_0x00a1
            boolean r12 = r11.f()
            if (r12 != 0) goto L_0x00a1
            boolean r11 = r11.d()
            if (r11 == 0) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            r11 = r8
            goto L_0x00a2
        L_0x00a1:
            r11 = r5
        L_0x00a2:
            r0.h0(r7, r11)
            if (r10 == 0) goto L_0x00ab
            if (r11 == 0) goto L_0x00ab
            r10 = r5
            goto L_0x00ac
        L_0x00ab:
            r10 = r8
        L_0x00ac:
            if (r11 != 0) goto L_0x00b1
            r0.g0(r7)
        L_0x00b1:
            int r7 = r7 + 1
            goto L_0x0053
        L_0x00b4:
            G3.B r7 = r3.f22624a
            r7.o()
            r9 = r5
            r10 = r9
        L_0x00bb:
            androidx.media3.exoplayer.a0 r7 = r3.f22631h
            long r11 = r7.f22651e
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r9 == 0) goto L_0x00d8
            boolean r7 = r3.f22629f
            if (r7 == 0) goto L_0x00d8
            int r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x00d6
            androidx.media3.exoplayer.r0 r7 = r0.f22531C
            long r13 = r7.f22862s
            int r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r7 > 0) goto L_0x00d8
        L_0x00d6:
            r7 = r5
            goto L_0x00d9
        L_0x00d8:
            r7 = r8
        L_0x00d9:
            if (r7 == 0) goto L_0x00e9
            boolean r9 = r0.f22535G
            if (r9 == 0) goto L_0x00e9
            r0.f22535G = r8
            androidx.media3.exoplayer.r0 r9 = r0.f22531C
            int r9 = r9.f22857n
            r11 = 5
            r0.f1(r8, r9, r8, r11)
        L_0x00e9:
            r9 = 3
            if (r7 == 0) goto L_0x00f9
            androidx.media3.exoplayer.a0 r7 = r3.f22631h
            boolean r7 = r7.f22655i
            if (r7 == 0) goto L_0x00f9
            r0.p1(r6)
            r16.y1()
            goto L_0x0149
        L_0x00f9:
            androidx.media3.exoplayer.r0 r7 = r0.f22531C
            int r7 = r7.f22848e
            if (r7 != r4) goto L_0x011d
            boolean r7 = r0.t1(r10)
            if (r7 == 0) goto L_0x011d
            r0.p1(r9)
            r7 = 0
            r0.f22550X = r7
            boolean r7 = r16.s1()
            if (r7 == 0) goto L_0x0149
            r0.F1(r8, r8)
            androidx.media3.exoplayer.h r7 = r0.f22568p
            r7.f()
            r16.v1()
            goto L_0x0149
        L_0x011d:
            androidx.media3.exoplayer.r0 r7 = r0.f22531C
            int r7 = r7.f22848e
            if (r7 != r9) goto L_0x0149
            int r7 = r0.f22544P
            if (r7 != 0) goto L_0x012e
            boolean r7 = r16.Y()
            if (r7 == 0) goto L_0x0130
            goto L_0x0149
        L_0x012e:
            if (r10 != 0) goto L_0x0149
        L_0x0130:
            boolean r7 = r16.s1()
            r0.F1(r7, r8)
            r0.p1(r4)
            boolean r7 = r0.f22536H
            if (r7 == 0) goto L_0x0146
            r16.t0()
            z3.E r7 = r0.f22574v
            r7.d()
        L_0x0146:
            r16.y1()
        L_0x0149:
            androidx.media3.exoplayer.r0 r7 = r0.f22531C
            int r7 = r7.f22848e
            if (r7 != r4) goto L_0x01b8
            r7 = r8
        L_0x0150:
            androidx.media3.exoplayer.u0[] r10 = r0.f22553a
            int r11 = r10.length
            if (r7 >= r11) goto L_0x0171
            r10 = r10[r7]
            boolean r10 = X(r10)
            if (r10 == 0) goto L_0x016e
            androidx.media3.exoplayer.u0[] r10 = r0.f22553a
            r10 = r10[r7]
            G3.a0 r10 = r10.j()
            G3.a0[] r11 = r3.f22626c
            r11 = r11[r7]
            if (r10 != r11) goto L_0x016e
            r0.g0(r7)
        L_0x016e:
            int r7 = r7 + 1
            goto L_0x0150
        L_0x0171:
            androidx.media3.exoplayer.r0 r3 = r0.f22531C
            boolean r7 = r3.f22850g
            if (r7 != 0) goto L_0x01b8
            long r10 = r3.f22861r
            r12 = 500000(0x7a120, double:2.47033E-318)
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x01b8
            androidx.media3.exoplayer.c0 r3 = r0.f22572t
            androidx.media3.exoplayer.Z r3 = r3.m()
            boolean r3 = r0.W(r3)
            if (r3 == 0) goto L_0x01b8
            long r10 = r0.f22552Z
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 != 0) goto L_0x01a0
            t3.d r3 = r0.f22570r
            long r10 = r3.c()
            r0.f22552Z = r10
            goto L_0x01bf
        L_0x01a0:
            t3.d r3 = r0.f22570r
            long r10 = r3.c()
            long r12 = r0.f22552Z
            long r10 = r10 - r12
            r12 = 4000(0xfa0, double:1.9763E-320)
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x01b0
            goto L_0x01bf
        L_0x01b0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Playback stuck buffering and not loading"
            r1.<init>(r2)
            throw r1
        L_0x01b8:
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f22552Z = r10
        L_0x01bf:
            boolean r3 = r16.s1()
            if (r3 == 0) goto L_0x01cd
            androidx.media3.exoplayer.r0 r3 = r0.f22531C
            int r3 = r3.f22848e
            if (r3 != r9) goto L_0x01cd
            r3 = r5
            goto L_0x01ce
        L_0x01cd:
            r3 = r8
        L_0x01ce:
            boolean r7 = r0.f22543O
            if (r7 == 0) goto L_0x01d9
            boolean r7 = r0.f22542N
            if (r7 == 0) goto L_0x01d9
            if (r3 == 0) goto L_0x01d9
            goto L_0x01da
        L_0x01d9:
            r5 = r8
        L_0x01da:
            androidx.media3.exoplayer.r0 r7 = r0.f22531C
            boolean r10 = r7.f22859p
            if (r10 == r5) goto L_0x01e6
            androidx.media3.exoplayer.r0 r7 = r7.i(r5)
            r0.f22531C = r7
        L_0x01e6:
            r0.f22542N = r8
            if (r5 != 0) goto L_0x01fe
            androidx.media3.exoplayer.r0 r5 = r0.f22531C
            int r5 = r5.f22848e
            if (r5 != r6) goto L_0x01f1
            goto L_0x01fe
        L_0x01f1:
            if (r3 != 0) goto L_0x01fb
            if (r5 == r4) goto L_0x01fb
            if (r5 != r9) goto L_0x01fe
            int r3 = r0.f22544P
            if (r3 == 0) goto L_0x01fe
        L_0x01fb:
            r0.N0(r1)
        L_0x01fe:
            t3.I.b()
        L_0x0201:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.W.v():void");
    }

    private void v1() {
        Z t10 = this.f22572t.t();
        if (t10 != null) {
            D p10 = t10.p();
            for (int i10 = 0; i10 < this.f22553a.length; i10++) {
                if (p10.c(i10) && this.f22553a[i10].getState() == 1) {
                    this.f22553a[i10].start();
                }
            }
        }
    }

    private void w(int i10, boolean z10, long j10) {
        u0 u0Var = this.f22553a[i10];
        if (!X(u0Var)) {
            Z w10 = this.f22572t.w();
            boolean z11 = w10 == this.f22572t.t();
            D p10 = w10.p();
            H h10 = p10.f36666b[i10];
            C5807s[] D10 = D(p10.f36667c[i10]);
            boolean z12 = s1() && this.f22531C.f22848e == 3;
            boolean z13 = !z10 && z12;
            this.f22544P++;
            this.f22554b.add(u0Var);
            u0Var.E(h10, D10, w10.f22626c[i10], this.f22546R, z13, z11, j10, w10.m(), w10.f22631h.f22647a);
            u0Var.x(11, new a());
            this.f22568p.b(u0Var);
            if (z12 && z11) {
                u0Var.start();
            }
        }
    }

    private void w0() {
        this.f22532D.b(1);
        E0(false, false, false, true);
        this.f22559g.g(this.f22576x);
        p1(this.f22531C.f22844a.q() ? 4 : 2);
        this.f22573u.x(this.f22560h.c());
        this.f22561i.i(2);
    }

    private void x() {
        y(new boolean[this.f22553a.length], this.f22572t.w().n());
    }

    private void x1(boolean z10, boolean z11) {
        E0(z10 || !this.f22541M, false, true, false);
        this.f22532D.b(z11 ? 1 : 0);
        this.f22559g.c(this.f22576x);
        p1(1);
    }

    private void y(boolean[] zArr, long j10) {
        Z w10 = this.f22572t.w();
        D p10 = w10.p();
        for (int i10 = 0; i10 < this.f22553a.length; i10++) {
            if (!p10.c(i10) && this.f22554b.remove(this.f22553a[i10])) {
                this.f22553a[i10].a();
            }
        }
        for (int i11 = 0; i11 < this.f22553a.length; i11++) {
            if (p10.c(i11)) {
                w(i11, zArr[i11], j10);
            }
        }
        w10.f22632i = true;
    }

    private void y0() {
        try {
            E0(true, false, true, false);
            z0();
            this.f22559g.d(this.f22576x);
            p1(1);
            this.f22562j.b();
            synchronized (this) {
                this.f22533E = true;
                notifyAll();
            }
        } catch (Throwable th2) {
            this.f22562j.b();
            synchronized (this) {
                this.f22533E = true;
                notifyAll();
                throw th2;
            }
        }
    }

    private void y1() {
        this.f22568p.h();
        for (u0 u0Var : this.f22553a) {
            if (X(u0Var)) {
                z(u0Var);
            }
        }
    }

    private void z(u0 u0Var) {
        if (u0Var.getState() == 2) {
            u0Var.stop();
        }
    }

    private void z0() {
        for (int i10 = 0; i10 < this.f22553a.length; i10++) {
            this.f22555c[i10].l();
            this.f22553a[i10].release();
        }
    }

    private void z1() {
        Z m10 = this.f22572t.m();
        boolean z10 = this.f22538J || (m10 != null && m10.f22624a.a());
        r0 r0Var = this.f22531C;
        if (z10 != r0Var.f22850g) {
            this.f22531C = r0Var.b(z10);
        }
    }

    public void A(long j10) {
        this.f22551Y = j10;
    }

    public Looper H() {
        return this.f22563k;
    }

    public void O0(q3.J j10, int i10, long j11) {
        this.f22561i.d(3, new h(j10, i10, j11)).a();
    }

    public void a(u0 u0Var) {
        this.f22561i.i(26);
    }

    public void b() {
        this.f22561i.i(10);
    }

    public void b1(List<q0.c> list, int i10, long j10, c0 c0Var) {
        this.f22561i.d(17, new b(list, c0Var, i10, j10, (a) null)).a();
    }

    public void c() {
        this.f22561i.k(2);
        this.f22561i.i(22);
    }

    public synchronized void d(s0 s0Var) {
        if (!this.f22533E) {
            if (this.f22563k.getThread().isAlive()) {
                this.f22561i.d(14, s0Var).a();
                return;
            }
        }
        q.h("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        s0Var.k(false);
    }

    public void e1(boolean z10, int i10, int i11) {
        this.f22561i.g(1, z10 ? 1 : 0, i10 | (i11 << 4)).a();
    }

    public void f(C6478B b10) {
        this.f22561i.d(8, b10).a();
    }

    public void g1(q3.D d10) {
        this.f22561i.d(4, d10).a();
    }

    public boolean handleMessage(Message message) {
        int i10;
        Z w10;
        int i11;
        int i12 = 1000;
        try {
            switch (message.what) {
                case 1:
                    boolean z10 = message.arg1 != 0;
                    int i13 = message.arg2;
                    f1(z10, i13 >> 4, true, i13 & 15);
                    break;
                case 2:
                    v();
                    break;
                case 3:
                    Q0((h) message.obj);
                    break;
                case 4:
                    h1((q3.D) message.obj);
                    break;
                case 5:
                    l1((z3.J) message.obj);
                    break;
                case 6:
                    x1(false, true);
                    break;
                case 7:
                    y0();
                    return true;
                case 8:
                    P((C6478B) message.obj);
                    break;
                case 9:
                    K((C6478B) message.obj);
                    break;
                case 10:
                    C0();
                    break;
                case 11:
                    k1(message.arg1);
                    break;
                case 12:
                    n1(message.arg1 != 0);
                    break;
                case 13:
                    Y0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    T0((s0) message.obj);
                    break;
                case 15:
                    V0((s0) message.obj);
                    break;
                case 16:
                    R((q3.D) message.obj, false);
                    break;
                case 17:
                    a1((b) message.obj);
                    break;
                case 18:
                    o((b) message.obj, message.arg1);
                    break;
                case 19:
                    q0((c) message.obj);
                    break;
                case 20:
                    A0(message.arg1, message.arg2, (c0) message.obj);
                    break;
                case 21:
                    o1((c0) message.obj);
                    break;
                case 22:
                    p0();
                    break;
                case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER /*23*/:
                    d1(message.arg1 != 0);
                    break;
                case 25:
                    r();
                    break;
                case 26:
                    D0();
                    break;
                case 27:
                    B1(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    i1((ExoPlayer.c) message.obj);
                    break;
                case 29:
                    w0();
                    break;
                default:
                    return false;
            }
        } catch (C5233j e10) {
            e = e10;
            if (e.f22783j == 1 && (w10 = this.f22572t.w()) != null) {
                e = e.a(w10.f22631h.f22647a);
            }
            if (!e.f22789p || !(this.f22550X == null || (i10 = e.f27853a) == 5004 || i10 == 5003)) {
                C5233j jVar = this.f22550X;
                if (jVar != null) {
                    jVar.addSuppressed(e);
                    e = this.f22550X;
                }
                q.d("ExoPlayerImplInternal", "Playback error", e);
                if (e.f22783j == 1 && this.f22572t.t() != this.f22572t.w()) {
                    while (this.f22572t.t() != this.f22572t.w()) {
                        this.f22572t.b();
                    }
                    f0();
                    C5224a0 a0Var = ((Z) C5950a.e(this.f22572t.t())).f22631h;
                    C6479C.b bVar = a0Var.f22647a;
                    long j10 = a0Var.f22648b;
                    this.f22531C = S(bVar, j10, a0Var.f22649c, j10, true, 0);
                }
                x1(true, false);
                this.f22531C = this.f22531C.f(e);
            } else {
                q.i("ExoPlayerImplInternal", "Recoverable renderer error", e);
                C5233j jVar2 = this.f22550X;
                if (jVar2 != null) {
                    jVar2.addSuppressed(e);
                    e = this.f22550X;
                } else {
                    this.f22550X = e;
                }
                C5962m mVar = this.f22561i;
                mVar.c(mVar.d(25, e));
            }
        } catch (C6422m.a e11) {
            L(e11, e11.f33662a);
        } catch (B e12) {
            int i14 = e12.f27846b;
            if (i14 == 1) {
                i11 = e12.f27845a ? 3001 : 3003;
            } else {
                if (i14 == 4) {
                    i11 = e12.f27845a ? 3002 : 3004;
                }
                L(e12, i12);
            }
            i12 = i11;
            L(e12, i12);
        } catch (w3.h e13) {
            L(e13, e13.f31426a);
        } catch (IOException e14) {
            L(e14, 2000);
        } catch (RuntimeException e15) {
            if ((e15 instanceof IllegalStateException) || (e15 instanceof IllegalArgumentException)) {
                i12 = 1004;
            }
            C5233j d10 = C5233j.d(e15, i12);
            q.d("ExoPlayerImplInternal", "Playback error", d10);
            x1(true, false);
            this.f22531C = this.f22531C.f(d10);
        }
        f0();
        return true;
    }

    public void j1(int i10) {
        this.f22561i.g(11, i10, 0).a();
    }

    public void m1(boolean z10) {
        this.f22561i.g(12, z10 ? 1 : 0, 0).a();
    }

    public void p(q3.D d10) {
        this.f22561i.d(16, d10).a();
    }

    /* renamed from: u0 */
    public void h(C6478B b10) {
        this.f22561i.d(9, b10).a();
    }

    public void v0() {
        this.f22561i.a(29).a();
    }

    public void w1() {
        this.f22561i.a(6).a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean x0() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f22533E     // Catch:{ all -> 0x0026 }
            if (r0 != 0) goto L_0x0028
            android.os.Looper r0 = r3.f22563k     // Catch:{ all -> 0x0026 }
            java.lang.Thread r0 = r0.getThread()     // Catch:{ all -> 0x0026 }
            boolean r0 = r0.isAlive()     // Catch:{ all -> 0x0026 }
            if (r0 != 0) goto L_0x0012
            goto L_0x0028
        L_0x0012:
            t3.m r0 = r3.f22561i     // Catch:{ all -> 0x0026 }
            r1 = 7
            r0.i(r1)     // Catch:{ all -> 0x0026 }
            androidx.media3.exoplayer.S r0 = new androidx.media3.exoplayer.S     // Catch:{ all -> 0x0026 }
            r0.<init>(r3)     // Catch:{ all -> 0x0026 }
            long r1 = r3.f22575w     // Catch:{ all -> 0x0026 }
            r3.H1(r0, r1)     // Catch:{ all -> 0x0026 }
            boolean r0 = r3.f22533E     // Catch:{ all -> 0x0026 }
            monitor-exit(r3)
            return r0
        L_0x0026:
            r0 = move-exception
            goto L_0x002b
        L_0x0028:
            monitor-exit(r3)
            r0 = 1
            return r0
        L_0x002b:
            monitor-exit(r3)     // Catch:{ all -> 0x0026 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.W.x0():boolean");
    }
}
