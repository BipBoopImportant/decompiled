package androidx.media3.exoplayer;

import A3.C6298a;
import G3.C6478B;
import G3.C6479C;
import android.util.Pair;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.Z;
import java.util.ArrayList;
import java.util.List;
import kb.C9967v;
import q3.J;
import t3.C5950a;
import t3.C5962m;

final class c0 {

    /* renamed from: a  reason: collision with root package name */
    private final J.b f22662a = new J.b();

    /* renamed from: b  reason: collision with root package name */
    private final J.c f22663b = new J.c();

    /* renamed from: c  reason: collision with root package name */
    private final C6298a f22664c;

    /* renamed from: d  reason: collision with root package name */
    private final C5962m f22665d;

    /* renamed from: e  reason: collision with root package name */
    private final Z.a f22666e;

    /* renamed from: f  reason: collision with root package name */
    private long f22667f;

    /* renamed from: g  reason: collision with root package name */
    private int f22668g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f22669h;

    /* renamed from: i  reason: collision with root package name */
    private ExoPlayer.c f22670i;

    /* renamed from: j  reason: collision with root package name */
    private Z f22671j;

    /* renamed from: k  reason: collision with root package name */
    private Z f22672k;

    /* renamed from: l  reason: collision with root package name */
    private Z f22673l;

    /* renamed from: m  reason: collision with root package name */
    private Z f22674m;

    /* renamed from: n  reason: collision with root package name */
    private int f22675n;

    /* renamed from: o  reason: collision with root package name */
    private Object f22676o;

    /* renamed from: p  reason: collision with root package name */
    private long f22677p;

    /* renamed from: q  reason: collision with root package name */
    private List<Z> f22678q = new ArrayList();

    public c0(C6298a aVar, C5962m mVar, Z.a aVar2, ExoPlayer.c cVar) {
        this.f22664c = aVar;
        this.f22665d = mVar;
        this.f22666e = aVar2;
        this.f22670i = cVar;
    }

    private boolean A(C6479C.b bVar) {
        return !bVar.b() && bVar.f35624e == -1;
    }

    private boolean B(J j10, C6479C.b bVar, boolean z10) {
        int b10 = j10.b(bVar.f35620a);
        if (!j10.n(j10.f(b10, this.f22662a).f27904c, this.f22663b).f27933i) {
            return j10.r(b10, this.f22662a, this.f22663b, this.f22668g, this.f22669h) && z10;
        }
    }

    private boolean C(J j10, C6479C.b bVar) {
        if (!A(bVar)) {
            return false;
        }
        return j10.n(j10.h(bVar.f35620a, this.f22662a).f27904c, this.f22663b).f27939o == j10.b(bVar.f35620a);
    }

    private static boolean F(J.b bVar) {
        int c10 = bVar.c();
        if (c10 == 0) {
            return false;
        }
        if ((c10 == 1 && bVar.q(0)) || !bVar.r(bVar.o())) {
            return false;
        }
        long j10 = 0;
        if (bVar.e(0) != -1) {
            return false;
        }
        if (bVar.f27905d == 0) {
            return true;
        }
        int i10 = c10 - (bVar.q(c10 + -1) ? 2 : 1);
        for (int i11 = 0; i11 <= i10; i11++) {
            j10 += bVar.i(i11);
        }
        return bVar.f27905d <= j10;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void G(C9967v.a aVar, C6479C.b bVar) {
        this.f22664c.J(aVar.k(), bVar);
    }

    private void I() {
        C9967v.a t10 = C9967v.t();
        for (Z z10 = this.f22671j; z10 != null; z10 = z10.k()) {
            t10.a(z10.f22631h.f22647a);
        }
        Z z11 = this.f22672k;
        this.f22665d.h(new b0(this, t10, z11 == null ? null : z11.f22631h.f22647a));
    }

    private void K(List<Z> list) {
        for (int i10 = 0; i10 < this.f22678q.size(); i10++) {
            this.f22678q.get(i10).x();
        }
        this.f22678q = list;
        this.f22674m = null;
        H();
    }

    private Z N(C5224a0 a0Var) {
        for (int i10 = 0; i10 < this.f22678q.size(); i10++) {
            if (this.f22678q.get(i10).d(a0Var)) {
                return this.f22678q.remove(i10);
            }
        }
        return null;
    }

    private static C6479C.b O(J j10, Object obj, long j11, long j12, J.c cVar, J.b bVar) {
        j10.h(obj, bVar);
        j10.n(bVar.f27904c, cVar);
        int b10 = j10.b(obj);
        Object obj2 = obj;
        while (F(bVar) && b10 <= cVar.f27939o) {
            j10.g(b10, bVar, true);
            obj2 = C5950a.e(bVar.f27903b);
            b10++;
        }
        j10.h(obj2, bVar);
        int e10 = bVar.e(j11);
        return e10 == -1 ? new C6479C.b(obj2, j12, bVar.d(j11)) : new C6479C.b(obj2, e10, bVar.k(e10), j12);
    }

    private long Q(J j10, Object obj) {
        int b10;
        int i10 = j10.h(obj, this.f22662a).f27904c;
        Object obj2 = this.f22676o;
        if (obj2 != null && (b10 = j10.b(obj2)) != -1 && j10.f(b10, this.f22662a).f27904c == i10) {
            return this.f22677p;
        }
        for (Z z10 = this.f22671j; z10 != null; z10 = z10.k()) {
            if (z10.f22625b.equals(obj)) {
                return z10.f22631h.f22647a.f35623d;
            }
        }
        for (Z z11 = this.f22671j; z11 != null; z11 = z11.k()) {
            int b11 = j10.b(z11.f22625b);
            if (b11 != -1 && j10.f(b11, this.f22662a).f27904c == i10) {
                return z11.f22631h.f22647a.f35623d;
            }
        }
        long R10 = R(obj);
        if (R10 != -1) {
            return R10;
        }
        long j11 = this.f22667f;
        this.f22667f = 1 + j11;
        if (this.f22671j == null) {
            this.f22676o = obj;
            this.f22677p = j11;
        }
        return j11;
    }

    private long R(Object obj) {
        for (int i10 = 0; i10 < this.f22678q.size(); i10++) {
            Z z10 = this.f22678q.get(i10);
            if (z10.f22625b.equals(obj)) {
                return z10.f22631h.f22647a.f35623d;
            }
        }
        return -1;
    }

    private boolean T(J j10) {
        Z z10 = this.f22671j;
        if (z10 == null) {
            return true;
        }
        int b10 = j10.b(z10.f22625b);
        while (true) {
            b10 = j10.d(b10, this.f22662a, this.f22663b, this.f22668g, this.f22669h);
            while (((Z) C5950a.e(z10)).k() != null && !z10.f22631h.f22653g) {
                z10 = z10.k();
            }
            Z k10 = z10.k();
            if (b10 == -1 || k10 == null || j10.b(k10.f22625b) != b10) {
                boolean M10 = M(z10);
                z10.f22631h = x(j10, z10.f22631h);
            } else {
                z10 = k10;
            }
        }
        boolean M102 = M(z10);
        z10.f22631h = x(j10, z10.f22631h);
        return !M102;
    }

    static boolean d(long j10, long j11) {
        return j10 == -9223372036854775807L || j10 == j11;
    }

    private boolean e(C5224a0 a0Var, C5224a0 a0Var2) {
        return a0Var.f22648b == a0Var2.f22648b && a0Var.f22647a.equals(a0Var2.f22647a);
    }

    private Pair<Object, Long> h(J j10, Object obj, long j11) {
        int e10 = j10.e(j10.h(obj, this.f22662a).f27904c, this.f22668g, this.f22669h);
        if (e10 == -1) {
            return null;
        }
        return j10.k(this.f22663b, this.f22662a, e10, -9223372036854775807L, j11);
    }

    private C5224a0 i(r0 r0Var) {
        return n(r0Var.f22844a, r0Var.f22845b, r0Var.f22846c, r0Var.f22862s);
    }

    private C5224a0 j(J j10, Z z10, long j11) {
        long j12;
        Object obj;
        long j13;
        long j14;
        C5224a0 a0Var;
        long j15;
        long R10;
        J j16 = j10;
        C5224a0 a0Var2 = z10.f22631h;
        int d10 = j10.d(j16.b(a0Var2.f22647a.f35620a), this.f22662a, this.f22663b, this.f22668g, this.f22669h);
        if (d10 == -1) {
            return null;
        }
        int i10 = j16.g(d10, this.f22662a, true).f27904c;
        Object e10 = C5950a.e(this.f22662a.f27903b);
        long j17 = a0Var2.f22647a.f35623d;
        if (j16.n(i10, this.f22663b).f27938n == d10) {
            a0Var = a0Var2;
            Pair<Object, Long> k10 = j10.k(this.f22663b, this.f22662a, i10, -9223372036854775807L, Math.max(0, j11));
            if (k10 == null) {
                return null;
            }
            Object obj2 = k10.first;
            long longValue = ((Long) k10.second).longValue();
            Z k11 = z10.k();
            if (k11 == null || !k11.f22625b.equals(obj2)) {
                R10 = R(obj2);
                if (R10 == -1) {
                    R10 = this.f22667f;
                    this.f22667f = 1 + R10;
                }
            } else {
                R10 = k11.f22631h.f22647a.f35623d;
            }
            j12 = R10;
            j13 = -9223372036854775807L;
            obj = obj2;
            j14 = longValue;
        } else {
            a0Var = a0Var2;
            j12 = j17;
            j13 = 0;
            obj = e10;
            j14 = 0;
        }
        C6479C.b O10 = O(j10, obj, j14, j12, this.f22663b, this.f22662a);
        if (!(j13 == -9223372036854775807L || a0Var.f22649c == -9223372036854775807L)) {
            boolean y10 = y(a0Var.f22647a.f35620a, j16);
            if (O10.b() && y10) {
                j13 = a0Var.f22649c;
            } else if (y10) {
                j15 = a0Var.f22649c;
                return n(j10, O10, j13, j15);
            }
        }
        j15 = j14;
        return n(j10, O10, j13, j15);
    }

    private C5224a0 k(J j10, Z z10, long j11) {
        C5224a0 a0Var = z10.f22631h;
        long m10 = (z10.m() + a0Var.f22651e) - j11;
        return a0Var.f22653g ? j(j10, z10, m10) : l(j10, z10, m10);
    }

    private C5224a0 l(J j10, Z z10, long j11) {
        J j12 = j10;
        C5224a0 a0Var = z10.f22631h;
        C6479C.b bVar = a0Var.f22647a;
        j10.h(bVar.f35620a, this.f22662a);
        if (bVar.b()) {
            int i10 = bVar.f35621b;
            int a10 = this.f22662a.a(i10);
            if (a10 == -1) {
                return null;
            }
            int l10 = this.f22662a.l(i10, bVar.f35622c);
            if (l10 < a10) {
                return o(j10, bVar.f35620a, i10, l10, a0Var.f22649c, bVar.f35623d);
            }
            long j13 = a0Var.f22649c;
            if (j13 == -9223372036854775807L) {
                J.c cVar = this.f22663b;
                J.b bVar2 = this.f22662a;
                Pair<Object, Long> k10 = j10.k(cVar, bVar2, bVar2.f27904c, -9223372036854775807L, Math.max(0, j11));
                if (k10 == null) {
                    return null;
                }
                j13 = ((Long) k10.second).longValue();
            }
            return p(j10, bVar.f35620a, Math.max(r(j10, bVar.f35620a, bVar.f35621b), j13), a0Var.f22649c, bVar.f35623d);
        }
        long j14 = j11;
        int i11 = bVar.f35624e;
        if (i11 != -1 && this.f22662a.q(i11)) {
            return j(j10, z10, j11);
        }
        int k11 = this.f22662a.k(bVar.f35624e);
        boolean z11 = this.f22662a.r(bVar.f35624e) && this.f22662a.h(bVar.f35624e, k11) == 3;
        if (k11 == this.f22662a.a(bVar.f35624e) || z11) {
            return p(j10, bVar.f35620a, r(j10, bVar.f35620a, bVar.f35624e), a0Var.f22651e, bVar.f35623d);
        }
        return o(j10, bVar.f35620a, bVar.f35624e, k11, a0Var.f22651e, bVar.f35623d);
    }

    private C5224a0 n(J j10, C6479C.b bVar, long j11, long j12) {
        C6479C.b bVar2 = bVar;
        J j13 = j10;
        j10.h(bVar2.f35620a, this.f22662a);
        if (bVar.b()) {
            return o(j10, bVar2.f35620a, bVar2.f35621b, bVar2.f35622c, j11, bVar2.f35623d);
        }
        return p(j10, bVar2.f35620a, j12, j11, bVar2.f35623d);
    }

    private C5224a0 o(J j10, Object obj, int i10, int i11, long j11, long j12) {
        int i12 = i11;
        C6479C.b bVar = new C6479C.b(obj, i10, i12, j12);
        long b10 = j10.h(bVar.f35620a, this.f22662a).b(bVar.f35621b, bVar.f35622c);
        long g10 = i12 == this.f22662a.k(i10) ? this.f22662a.g() : 0;
        return new C5224a0(bVar, (b10 == -9223372036854775807L || g10 < b10) ? g10 : Math.max(0, b10 - 1), j11, -9223372036854775807L, b10, this.f22662a.r(bVar.f35621b), false, false, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0086 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.media3.exoplayer.C5224a0 p(q3.J r26, java.lang.Object r27, long r28, long r30, long r32) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            q3.J$b r5 = r0.f22662a
            r1.h(r2, r5)
            q3.J$b r5 = r0.f22662a
            int r5 = r5.d(r3)
            r6 = 0
            r7 = 1
            r8 = -1
            if (r5 == r8) goto L_0x0022
            q3.J$b r9 = r0.f22662a
            boolean r9 = r9.q(r5)
            if (r9 == 0) goto L_0x0022
            r9 = r7
            goto L_0x0023
        L_0x0022:
            r9 = r6
        L_0x0023:
            if (r5 != r8) goto L_0x003b
            q3.J$b r10 = r0.f22662a
            int r10 = r10.c()
            if (r10 <= 0) goto L_0x005a
            q3.J$b r10 = r0.f22662a
            int r11 = r10.o()
            boolean r10 = r10.r(r11)
            if (r10 == 0) goto L_0x005a
            r10 = r7
            goto L_0x005b
        L_0x003b:
            q3.J$b r10 = r0.f22662a
            boolean r10 = r10.r(r5)
            if (r10 == 0) goto L_0x005a
            q3.J$b r10 = r0.f22662a
            long r10 = r10.f(r5)
            q3.J$b r12 = r0.f22662a
            long r13 = r12.f27905d
            int r10 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r10 != 0) goto L_0x005a
            boolean r10 = r12.p(r5)
            if (r10 == 0) goto L_0x005a
            r10 = r7
            r5 = r8
            goto L_0x005b
        L_0x005a:
            r10 = r6
        L_0x005b:
            G3.C$b r12 = new G3.C$b
            r13 = r32
            r12.<init>(r2, r13, r5)
            boolean r2 = r0.A(r12)
            boolean r23 = r0.C(r1, r12)
            boolean r24 = r0.B(r1, r12, r2)
            if (r5 == r8) goto L_0x007d
            q3.J$b r1 = r0.f22662a
            boolean r1 = r1.r(r5)
            if (r1 == 0) goto L_0x007d
            if (r9 != 0) goto L_0x007d
            r21 = r7
            goto L_0x007f
        L_0x007d:
            r21 = r6
        L_0x007f:
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 == r8) goto L_0x0091
            if (r9 != 0) goto L_0x0091
            q3.J$b r1 = r0.f22662a
            long r8 = r1.f(r5)
        L_0x008e:
            r17 = r8
            goto L_0x009a
        L_0x0091:
            if (r10 == 0) goto L_0x0098
            q3.J$b r1 = r0.f22662a
            long r8 = r1.f27905d
            goto L_0x008e
        L_0x0098:
            r17 = r13
        L_0x009a:
            int r1 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r1 == 0) goto L_0x00a8
            r8 = -9223372036854775808
            int r1 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x00a5
            goto L_0x00a8
        L_0x00a5:
            r19 = r17
            goto L_0x00ae
        L_0x00a8:
            q3.J$b r1 = r0.f22662a
            long r8 = r1.f27905d
            r19 = r8
        L_0x00ae:
            int r1 = (r19 > r13 ? 1 : (r19 == r13 ? 0 : -1))
            if (r1 == 0) goto L_0x00c4
            int r1 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r1 < 0) goto L_0x00c4
            if (r24 != 0) goto L_0x00ba
            if (r10 != 0) goto L_0x00bb
        L_0x00ba:
            r6 = r7
        L_0x00bb:
            long r3 = (long) r6
            long r3 = r19 - r3
            r5 = 0
            long r3 = java.lang.Math.max(r5, r3)
        L_0x00c4:
            r13 = r3
            androidx.media3.exoplayer.a0 r1 = new androidx.media3.exoplayer.a0
            r11 = r1
            r15 = r30
            r22 = r2
            r11.<init>(r12, r13, r15, r17, r19, r21, r22, r23, r24)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.c0.p(q3.J, java.lang.Object, long, long, long):androidx.media3.exoplayer.a0");
    }

    private C5224a0 q(J j10, Object obj, long j11, long j12) {
        C6479C.b O10 = O(j10, obj, j11, j12, this.f22663b, this.f22662a);
        if (O10.b()) {
            return o(j10, O10.f35620a, O10.f35621b, O10.f35622c, j11, O10.f35623d);
        }
        return p(j10, O10.f35620a, j11, -9223372036854775807L, O10.f35623d);
    }

    private long r(J j10, Object obj, int i10) {
        j10.h(obj, this.f22662a);
        long f10 = this.f22662a.f(i10);
        return f10 == Long.MIN_VALUE ? this.f22662a.f27905d : f10 + this.f22662a.i(i10);
    }

    private boolean y(Object obj, J j10) {
        int c10 = j10.h(obj, this.f22662a).c();
        int o10 = this.f22662a.o();
        return c10 > 0 && this.f22662a.r(o10) && (c10 > 1 || this.f22662a.f(o10) != Long.MIN_VALUE);
    }

    public boolean D(C6478B b10) {
        Z z10 = this.f22673l;
        return z10 != null && z10.f22624a == b10;
    }

    public boolean E(C6478B b10) {
        Z z10 = this.f22674m;
        return z10 != null && z10.f22624a == b10;
    }

    public void H() {
        Z z10 = this.f22674m;
        if (z10 == null || z10.t()) {
            this.f22674m = null;
            for (int i10 = 0; i10 < this.f22678q.size(); i10++) {
                Z z11 = this.f22678q.get(i10);
                if (!z11.t()) {
                    this.f22674m = z11;
                    return;
                }
            }
        }
    }

    public void J(long j10) {
        Z z10 = this.f22673l;
        if (z10 != null) {
            z10.w(j10);
        }
    }

    public void L() {
        if (!this.f22678q.isEmpty()) {
            K(new ArrayList());
        }
    }

    public boolean M(Z z10) {
        C5950a.i(z10);
        boolean z11 = false;
        if (z10.equals(this.f22673l)) {
            return false;
        }
        this.f22673l = z10;
        while (z10.k() != null) {
            z10 = (Z) C5950a.e(z10.k());
            if (z10 == this.f22672k) {
                this.f22672k = this.f22671j;
                z11 = true;
            }
            z10.x();
            this.f22675n--;
        }
        ((Z) C5950a.e(this.f22673l)).A((Z) null);
        I();
        return z11;
    }

    public C6479C.b P(J j10, Object obj, long j11) {
        long Q10 = Q(j10, obj);
        j10.h(obj, this.f22662a);
        j10.n(this.f22662a.f27904c, this.f22663b);
        boolean z10 = false;
        for (int b10 = j10.b(obj); b10 >= this.f22663b.f27938n; b10--) {
            boolean z11 = true;
            j10.g(b10, this.f22662a, true);
            if (this.f22662a.c() <= 0) {
                z11 = false;
            }
            z10 |= z11;
            J.b bVar = this.f22662a;
            if (bVar.e(bVar.f27905d) != -1) {
                obj = C5950a.e(this.f22662a.f27903b);
            }
            if (z10 && (!z11 || this.f22662a.f27905d != 0)) {
                break;
            }
        }
        return O(j10, obj, j11, Q10, this.f22663b, this.f22662a);
    }

    public boolean S() {
        Z z10 = this.f22673l;
        return z10 == null || (!z10.f22631h.f22655i && z10.s() && this.f22673l.f22631h.f22651e != -9223372036854775807L && this.f22675n < 100);
    }

    public void U(J j10, ExoPlayer.c cVar) {
        this.f22670i = cVar;
        z(j10);
    }

    public boolean V(J j10, long j11, long j12) {
        C5224a0 a0Var;
        Z z10 = this.f22671j;
        Z z11 = null;
        while (z10 != null) {
            C5224a0 a0Var2 = z10.f22631h;
            if (z11 == null) {
                a0Var = x(j10, a0Var2);
            } else {
                C5224a0 k10 = k(j10, z11, j11);
                if (k10 == null) {
                    return !M(z11);
                }
                if (!e(a0Var2, k10)) {
                    return !M(z11);
                }
                a0Var = k10;
            }
            z10.f22631h = a0Var.a(a0Var2.f22649c);
            if (!d(a0Var2.f22651e, a0Var.f22651e)) {
                z10.E();
                long j13 = a0Var.f22651e;
                return !M(z10) && !(z10 == this.f22672k && !z10.f22631h.f22652f && ((j12 > Long.MIN_VALUE ? 1 : (j12 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j12 > ((j13 > -9223372036854775807L ? 1 : (j13 == -9223372036854775807L ? 0 : -1)) == 0 ? Long.MAX_VALUE : z10.D(j13)) ? 1 : (j12 == ((j13 > -9223372036854775807L ? 1 : (j13 == -9223372036854775807L ? 0 : -1)) == 0 ? Long.MAX_VALUE : z10.D(j13)) ? 0 : -1)) >= 0));
            }
            z11 = z10;
            z10 = z10.k();
        }
        return true;
    }

    public boolean W(J j10, int i10) {
        this.f22668g = i10;
        return T(j10);
    }

    public boolean X(J j10, boolean z10) {
        this.f22669h = z10;
        return T(j10);
    }

    public Z b() {
        Z z10 = this.f22671j;
        if (z10 == null) {
            return null;
        }
        if (z10 == this.f22672k) {
            this.f22672k = z10.k();
        }
        this.f22671j.x();
        int i10 = this.f22675n - 1;
        this.f22675n = i10;
        if (i10 == 0) {
            this.f22673l = null;
            Z z11 = this.f22671j;
            this.f22676o = z11.f22625b;
            this.f22677p = z11.f22631h.f22647a.f35623d;
        }
        this.f22671j = this.f22671j.k();
        I();
        return this.f22671j;
    }

    public Z c() {
        this.f22672k = ((Z) C5950a.i(this.f22672k)).k();
        I();
        return (Z) C5950a.i(this.f22672k);
    }

    public void f() {
        if (this.f22675n != 0) {
            Z z10 = (Z) C5950a.i(this.f22671j);
            this.f22676o = z10.f22625b;
            this.f22677p = z10.f22631h.f22647a.f35623d;
            while (z10 != null) {
                z10.x();
                z10 = z10.k();
            }
            this.f22671j = null;
            this.f22673l = null;
            this.f22672k = null;
            this.f22675n = 0;
            I();
        }
    }

    public Z g(C5224a0 a0Var) {
        Z z10 = this.f22673l;
        long m10 = z10 == null ? 1000000000000L : (z10.m() + this.f22673l.f22631h.f22651e) - a0Var.f22648b;
        Z N10 = N(a0Var);
        if (N10 == null) {
            N10 = this.f22666e.a(a0Var, m10);
        } else {
            N10.f22631h = a0Var;
            N10.B(m10);
        }
        Z z11 = this.f22673l;
        if (z11 != null) {
            z11.A(N10);
        } else {
            this.f22671j = N10;
            this.f22672k = N10;
        }
        this.f22676o = null;
        this.f22673l = N10;
        this.f22675n++;
        I();
        return N10;
    }

    public Z m() {
        return this.f22673l;
    }

    public C5224a0 s(long j10, r0 r0Var) {
        Z z10 = this.f22673l;
        return z10 == null ? i(r0Var) : k(r0Var.f22844a, z10, j10);
    }

    public Z t() {
        return this.f22671j;
    }

    public Z u(C6478B b10) {
        for (int i10 = 0; i10 < this.f22678q.size(); i10++) {
            Z z10 = this.f22678q.get(i10);
            if (z10.f22624a == b10) {
                return z10;
            }
        }
        return null;
    }

    public Z v() {
        return this.f22674m;
    }

    public Z w() {
        return this.f22672k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0029, code lost:
        r1 = r3.f35624e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.media3.exoplayer.C5224a0 x(q3.J r19, androidx.media3.exoplayer.C5224a0 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            G3.C$b r3 = r2.f22647a
            boolean r12 = r0.A(r3)
            boolean r13 = r0.C(r1, r3)
            boolean r14 = r0.B(r1, r3, r12)
            G3.C$b r4 = r2.f22647a
            java.lang.Object r4 = r4.f35620a
            q3.J$b r5 = r0.f22662a
            r1.h(r4, r5)
            boolean r1 = r3.b()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -1
            if (r1 != 0) goto L_0x0035
            int r1 = r3.f35624e
            if (r1 != r6) goto L_0x002e
            goto L_0x0035
        L_0x002e:
            q3.J$b r7 = r0.f22662a
            long r7 = r7.f(r1)
            goto L_0x0036
        L_0x0035:
            r7 = r4
        L_0x0036:
            boolean r1 = r3.b()
            if (r1 == 0) goto L_0x0048
            q3.J$b r1 = r0.f22662a
            int r4 = r3.f35621b
            int r5 = r3.f35622c
            long r4 = r1.b(r4, r5)
        L_0x0046:
            r9 = r4
            goto L_0x005c
        L_0x0048:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0055
            r4 = -9223372036854775808
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r9 = r7
            goto L_0x005c
        L_0x0055:
            q3.J$b r1 = r0.f22662a
            long r4 = r1.j()
            goto L_0x0046
        L_0x005c:
            boolean r1 = r3.b()
            if (r1 == 0) goto L_0x006c
            q3.J$b r1 = r0.f22662a
            int r4 = r3.f35621b
            boolean r1 = r1.r(r4)
        L_0x006a:
            r11 = r1
            goto L_0x007c
        L_0x006c:
            int r1 = r3.f35624e
            if (r1 == r6) goto L_0x007a
            q3.J$b r4 = r0.f22662a
            boolean r1 = r4.r(r1)
            if (r1 == 0) goto L_0x007a
            r1 = 1
            goto L_0x006a
        L_0x007a:
            r1 = 0
            goto L_0x006a
        L_0x007c:
            androidx.media3.exoplayer.a0 r15 = new androidx.media3.exoplayer.a0
            long r4 = r2.f22648b
            long r1 = r2.f22649c
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.c0.x(q3.J, androidx.media3.exoplayer.a0):androidx.media3.exoplayer.a0");
    }

    public void z(J j10) {
        Z z10;
        if (this.f22670i.f22421a == -9223372036854775807L || (z10 = this.f22673l) == null) {
            L();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Pair<Object, Long> h10 = h(j10, z10.f22631h.f22647a.f35620a, 0);
        if (h10 != null && !j10.n(j10.h(h10.first, this.f22662a).f27904c, this.f22663b).f()) {
            long R10 = R(h10.first);
            if (R10 == -1) {
                R10 = this.f22667f;
                this.f22667f = 1 + R10;
            }
            J j11 = j10;
            C5224a0 q10 = q(j11, h10.first, ((Long) h10.second).longValue(), R10);
            Z N10 = N(q10);
            if (N10 == null) {
                N10 = this.f22666e.a(q10, (z10.m() + z10.f22631h.f22651e) - q10.f22648b);
            }
            arrayList.add(N10);
        }
        K(arrayList);
    }
}
