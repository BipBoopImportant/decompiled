package androidx.media3.exoplayer;

import A3.v1;
import G3.C6479C;
import G3.a0;
import androidx.media3.exoplayer.v0;
import q3.C5807s;
import q3.J;
import t3.C5950a;
import t3.C5953d;
import t3.N;
import y3.f;
import z3.D;
import z3.F;
import z3.H;

/* renamed from: androidx.media3.exoplayer.e  reason: case insensitive filesystem */
public abstract class C5228e implements u0, v0 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f22690a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final int f22691b;

    /* renamed from: c  reason: collision with root package name */
    private final D f22692c;

    /* renamed from: d  reason: collision with root package name */
    private H f22693d;

    /* renamed from: e  reason: collision with root package name */
    private int f22694e;

    /* renamed from: f  reason: collision with root package name */
    private v1 f22695f;

    /* renamed from: g  reason: collision with root package name */
    private C5953d f22696g;

    /* renamed from: h  reason: collision with root package name */
    private int f22697h;

    /* renamed from: i  reason: collision with root package name */
    private a0 f22698i;

    /* renamed from: j  reason: collision with root package name */
    private C5807s[] f22699j;

    /* renamed from: k  reason: collision with root package name */
    private long f22700k;

    /* renamed from: l  reason: collision with root package name */
    private long f22701l;

    /* renamed from: m  reason: collision with root package name */
    private long f22702m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f22703n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f22704o;

    /* renamed from: p  reason: collision with root package name */
    private J f22705p;

    /* renamed from: q  reason: collision with root package name */
    private v0.a f22706q;

    public C5228e(int i10) {
        this.f22691b = i10;
        this.f22692c = new D();
        this.f22702m = Long.MIN_VALUE;
        this.f22705p = J.f27893a;
    }

    private void r0(long j10, boolean z10) {
        this.f22703n = false;
        this.f22701l = j10;
        this.f22702m = j10;
        i0(j10, z10);
    }

    public final void A(int i10, v1 v1Var, C5953d dVar) {
        this.f22694e = i10;
        this.f22695f = v1Var;
        this.f22696g = dVar;
        h0();
    }

    public final boolean D() {
        return this.f22703n;
    }

    public final void E(H h10, C5807s[] sVarArr, a0 a0Var, long j10, boolean z10, boolean z11, long j11, long j12, C6479C.b bVar) {
        boolean z12 = z10;
        C5950a.g(this.f22697h == 0);
        this.f22693d = h10;
        this.f22697h = 1;
        g0(z12, z11);
        y(sVarArr, a0Var, j11, j12, bVar);
        r0(j11, z12);
    }

    public final v0 J() {
        return this;
    }

    public final void K(v0.a aVar) {
        synchronized (this.f22690a) {
            this.f22706q = aVar;
        }
    }

    public int O() {
        return 0;
    }

    public final long P() {
        return this.f22702m;
    }

    public final void Q(long j10) {
        r0(j10, false);
    }

    public F R() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final C5233j T(Throwable th2, C5807s sVar, int i10) {
        return U(th2, sVar, false, i10);
    }

    /* access modifiers changed from: protected */
    public final C5233j U(Throwable th2, C5807s sVar, boolean z10, int i10) {
        int i11;
        if (sVar != null && !this.f22704o) {
            this.f22704o = true;
            try {
                i11 = v0.S(b(sVar));
            } catch (C5233j unused) {
            } finally {
                this.f22704o = false;
            }
            return C5233j.b(th2, getName(), Y(), sVar, i11, z10, i10);
        }
        i11 = 4;
        return C5233j.b(th2, getName(), Y(), sVar, i11, z10, i10);
    }

    /* access modifiers changed from: protected */
    public final C5953d V() {
        return (C5953d) C5950a.e(this.f22696g);
    }

    /* access modifiers changed from: protected */
    public final H W() {
        return (H) C5950a.e(this.f22693d);
    }

    /* access modifiers changed from: protected */
    public final D X() {
        this.f22692c.a();
        return this.f22692c;
    }

    /* access modifiers changed from: protected */
    public final int Y() {
        return this.f22694e;
    }

    /* access modifiers changed from: protected */
    public final long Z() {
        return this.f22701l;
    }

    public final void a() {
        C5950a.g(this.f22697h == 0);
        this.f22692c.a();
        l0();
    }

    /* access modifiers changed from: protected */
    public final v1 a0() {
        return (v1) C5950a.e(this.f22695f);
    }

    /* access modifiers changed from: protected */
    public final C5807s[] b0() {
        return (C5807s[]) C5950a.e(this.f22699j);
    }

    public final void c() {
        boolean z10 = true;
        if (this.f22697h != 1) {
            z10 = false;
        }
        C5950a.g(z10);
        this.f22692c.a();
        this.f22697h = 0;
        this.f22698i = null;
        this.f22699j = null;
        this.f22703n = false;
        f0();
    }

    /* access modifiers changed from: protected */
    public final long c0() {
        return this.f22700k;
    }

    /* access modifiers changed from: protected */
    public final J d0() {
        return this.f22705p;
    }

    /* access modifiers changed from: protected */
    public final boolean e0() {
        return n() ? this.f22703n : ((a0) C5950a.e(this.f22698i)).f();
    }

    /* access modifiers changed from: protected */
    public abstract void f0();

    /* access modifiers changed from: protected */
    public void g0(boolean z10, boolean z11) {
    }

    public final int getState() {
        return this.f22697h;
    }

    /* access modifiers changed from: protected */
    public void h0() {
    }

    public final int i() {
        return this.f22691b;
    }

    /* access modifiers changed from: protected */
    public abstract void i0(long j10, boolean z10);

    public final a0 j() {
        return this.f22698i;
    }

    /* access modifiers changed from: protected */
    public void j0() {
    }

    /* access modifiers changed from: protected */
    public final void k0() {
        v0.a aVar;
        synchronized (this.f22690a) {
            aVar = this.f22706q;
        }
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public final void l() {
        synchronized (this.f22690a) {
            this.f22706q = null;
        }
    }

    /* access modifiers changed from: protected */
    public void l0() {
    }

    public final void m(J j10) {
        if (!N.d(this.f22705p, j10)) {
            this.f22705p = j10;
            p0(j10);
        }
    }

    /* access modifiers changed from: protected */
    public void m0() {
    }

    public final boolean n() {
        return this.f22702m == Long.MIN_VALUE;
    }

    /* access modifiers changed from: protected */
    public void n0() {
    }

    /* access modifiers changed from: protected */
    public void o0(C5807s[] sVarArr, long j10, long j11, C6479C.b bVar) {
    }

    /* access modifiers changed from: protected */
    public void p0(J j10) {
    }

    public final void q() {
        this.f22703n = true;
    }

    /* access modifiers changed from: protected */
    public final int q0(D d10, f fVar, int i10) {
        int h10 = ((a0) C5950a.e(this.f22698i)).h(d10, fVar, i10);
        if (h10 == -4) {
            if (fVar.D()) {
                this.f22702m = Long.MIN_VALUE;
                return this.f22703n ? -4 : -3;
            }
            long j10 = fVar.f32281f + this.f22700k;
            fVar.f32281f = j10;
            this.f22702m = Math.max(this.f22702m, j10);
        } else if (h10 == -5) {
            C5807s sVar = (C5807s) C5950a.e(d10.f32383b);
            if (sVar.f28249t != Long.MAX_VALUE) {
                d10.f32383b = sVar.b().w0(sVar.f28249t + this.f22700k).M();
            }
        }
        return h10;
    }

    public final void release() {
        C5950a.g(this.f22697h == 0);
        j0();
    }

    /* access modifiers changed from: protected */
    public int s0(long j10) {
        return ((a0) C5950a.e(this.f22698i)).i(j10 - this.f22700k);
    }

    public final void start() {
        boolean z10 = true;
        if (this.f22697h != 1) {
            z10 = false;
        }
        C5950a.g(z10);
        this.f22697h = 2;
        m0();
    }

    public final void stop() {
        C5950a.g(this.f22697h == 2);
        this.f22697h = 1;
        n0();
    }

    public void x(int i10, Object obj) {
    }

    public final void y(C5807s[] sVarArr, a0 a0Var, long j10, long j11, C6479C.b bVar) {
        C5950a.g(!this.f22703n);
        this.f22698i = a0Var;
        if (this.f22702m == Long.MIN_VALUE) {
            this.f22702m = j10;
        }
        this.f22699j = sVarArr;
        this.f22700k = j11;
        o0(sVarArr, j10, j11, bVar);
    }

    public final void z() {
        ((a0) C5950a.e(this.f22698i)).g();
    }
}
