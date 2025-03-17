package androidx.media3.exoplayer;

import G3.C6479C;
import G3.k0;
import I3.D;
import android.os.SystemClock;
import java.util.List;
import kb.C9967v;
import q3.J;
import q3.z;
import t3.N;

final class r0 {

    /* renamed from: u  reason: collision with root package name */
    private static final C6479C.b f22843u = new C6479C.b(new Object());

    /* renamed from: a  reason: collision with root package name */
    public final J f22844a;

    /* renamed from: b  reason: collision with root package name */
    public final C6479C.b f22845b;

    /* renamed from: c  reason: collision with root package name */
    public final long f22846c;

    /* renamed from: d  reason: collision with root package name */
    public final long f22847d;

    /* renamed from: e  reason: collision with root package name */
    public final int f22848e;

    /* renamed from: f  reason: collision with root package name */
    public final C5233j f22849f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f22850g;

    /* renamed from: h  reason: collision with root package name */
    public final k0 f22851h;

    /* renamed from: i  reason: collision with root package name */
    public final D f22852i;

    /* renamed from: j  reason: collision with root package name */
    public final List<z> f22853j;

    /* renamed from: k  reason: collision with root package name */
    public final C6479C.b f22854k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f22855l;

    /* renamed from: m  reason: collision with root package name */
    public final int f22856m;

    /* renamed from: n  reason: collision with root package name */
    public final int f22857n;

    /* renamed from: o  reason: collision with root package name */
    public final q3.D f22858o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f22859p;

    /* renamed from: q  reason: collision with root package name */
    public volatile long f22860q;

    /* renamed from: r  reason: collision with root package name */
    public volatile long f22861r;

    /* renamed from: s  reason: collision with root package name */
    public volatile long f22862s;

    /* renamed from: t  reason: collision with root package name */
    public volatile long f22863t;

    public r0(J j10, C6479C.b bVar, long j11, long j12, int i10, C5233j jVar, boolean z10, k0 k0Var, D d10, List<z> list, C6479C.b bVar2, boolean z11, int i11, int i12, q3.D d11, long j13, long j14, long j15, long j16, boolean z12) {
        this.f22844a = j10;
        this.f22845b = bVar;
        this.f22846c = j11;
        this.f22847d = j12;
        this.f22848e = i10;
        this.f22849f = jVar;
        this.f22850g = z10;
        this.f22851h = k0Var;
        this.f22852i = d10;
        this.f22853j = list;
        this.f22854k = bVar2;
        this.f22855l = z11;
        this.f22856m = i11;
        this.f22857n = i12;
        this.f22858o = d11;
        this.f22860q = j13;
        this.f22861r = j14;
        this.f22862s = j15;
        this.f22863t = j16;
        this.f22859p = z12;
    }

    public static r0 k(D d10) {
        J j10 = J.f27893a;
        C6479C.b bVar = f22843u;
        return new r0(j10, bVar, -9223372036854775807L, 0, 1, (C5233j) null, false, k0.f35937d, d10, C9967v.E(), bVar, false, 1, 0, q3.D.f27856d, 0, 0, 0, 0, false);
    }

    public static C6479C.b l() {
        return f22843u;
    }

    public r0 a() {
        return new r0(this.f22844a, this.f22845b, this.f22846c, this.f22847d, this.f22848e, this.f22849f, this.f22850g, this.f22851h, this.f22852i, this.f22853j, this.f22854k, this.f22855l, this.f22856m, this.f22857n, this.f22858o, this.f22860q, this.f22861r, m(), SystemClock.elapsedRealtime(), this.f22859p);
    }

    public r0 b(boolean z10) {
        J j10 = this.f22844a;
        return new r0(j10, this.f22845b, this.f22846c, this.f22847d, this.f22848e, this.f22849f, z10, this.f22851h, this.f22852i, this.f22853j, this.f22854k, this.f22855l, this.f22856m, this.f22857n, this.f22858o, this.f22860q, this.f22861r, this.f22862s, this.f22863t, this.f22859p);
    }

    public r0 c(C6479C.b bVar) {
        J j10 = this.f22844a;
        return new r0(j10, this.f22845b, this.f22846c, this.f22847d, this.f22848e, this.f22849f, this.f22850g, this.f22851h, this.f22852i, this.f22853j, bVar, this.f22855l, this.f22856m, this.f22857n, this.f22858o, this.f22860q, this.f22861r, this.f22862s, this.f22863t, this.f22859p);
    }

    public r0 d(C6479C.b bVar, long j10, long j11, long j12, long j13, k0 k0Var, D d10, List<z> list) {
        long j14 = j10;
        k0 k0Var2 = k0Var;
        D d11 = d10;
        List<z> list2 = list;
        J j15 = this.f22844a;
        return new r0(j15, bVar, j11, j12, this.f22848e, this.f22849f, this.f22850g, k0Var2, d11, list2, this.f22854k, this.f22855l, this.f22856m, this.f22857n, this.f22858o, this.f22860q, j13, j14, SystemClock.elapsedRealtime(), this.f22859p);
    }

    public r0 e(boolean z10, int i10, int i11) {
        J j10 = this.f22844a;
        return new r0(j10, this.f22845b, this.f22846c, this.f22847d, this.f22848e, this.f22849f, this.f22850g, this.f22851h, this.f22852i, this.f22853j, this.f22854k, z10, i10, i11, this.f22858o, this.f22860q, this.f22861r, this.f22862s, this.f22863t, this.f22859p);
    }

    public r0 f(C5233j jVar) {
        J j10 = this.f22844a;
        return new r0(j10, this.f22845b, this.f22846c, this.f22847d, this.f22848e, jVar, this.f22850g, this.f22851h, this.f22852i, this.f22853j, this.f22854k, this.f22855l, this.f22856m, this.f22857n, this.f22858o, this.f22860q, this.f22861r, this.f22862s, this.f22863t, this.f22859p);
    }

    public r0 g(q3.D d10) {
        J j10 = this.f22844a;
        return new r0(j10, this.f22845b, this.f22846c, this.f22847d, this.f22848e, this.f22849f, this.f22850g, this.f22851h, this.f22852i, this.f22853j, this.f22854k, this.f22855l, this.f22856m, this.f22857n, d10, this.f22860q, this.f22861r, this.f22862s, this.f22863t, this.f22859p);
    }

    public r0 h(int i10) {
        J j10 = this.f22844a;
        return new r0(j10, this.f22845b, this.f22846c, this.f22847d, i10, this.f22849f, this.f22850g, this.f22851h, this.f22852i, this.f22853j, this.f22854k, this.f22855l, this.f22856m, this.f22857n, this.f22858o, this.f22860q, this.f22861r, this.f22862s, this.f22863t, this.f22859p);
    }

    public r0 i(boolean z10) {
        J j10 = this.f22844a;
        return new r0(j10, this.f22845b, this.f22846c, this.f22847d, this.f22848e, this.f22849f, this.f22850g, this.f22851h, this.f22852i, this.f22853j, this.f22854k, this.f22855l, this.f22856m, this.f22857n, this.f22858o, this.f22860q, this.f22861r, this.f22862s, this.f22863t, z10);
    }

    public r0 j(J j10) {
        return new r0(j10, this.f22845b, this.f22846c, this.f22847d, this.f22848e, this.f22849f, this.f22850g, this.f22851h, this.f22852i, this.f22853j, this.f22854k, this.f22855l, this.f22856m, this.f22857n, this.f22858o, this.f22860q, this.f22861r, this.f22862s, this.f22863t, this.f22859p);
    }

    public long m() {
        long j10;
        long j11;
        if (!n()) {
            return this.f22862s;
        }
        do {
            j10 = this.f22863t;
            j11 = this.f22862s;
        } while (j10 != this.f22863t);
        return N.P0(N.q1(j11) + ((long) (((float) (SystemClock.elapsedRealtime() - j10)) * this.f22858o.f27859a)));
    }

    public boolean n() {
        return this.f22848e == 3 && this.f22855l && this.f22857n == 0;
    }

    public void o(long j10) {
        this.f22862s = j10;
        this.f22863t = SystemClock.elapsedRealtime();
    }
}
