package androidx.media3.exoplayer;

import q3.D;
import t3.C5950a;
import t3.C5953d;
import z3.F;
import z3.K;

/* renamed from: androidx.media3.exoplayer.h  reason: case insensitive filesystem */
final class C5231h implements F {

    /* renamed from: a  reason: collision with root package name */
    private final K f22753a;

    /* renamed from: b  reason: collision with root package name */
    private final a f22754b;

    /* renamed from: c  reason: collision with root package name */
    private u0 f22755c;

    /* renamed from: d  reason: collision with root package name */
    private F f22756d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f22757e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f22758f;

    /* renamed from: androidx.media3.exoplayer.h$a */
    public interface a {
        void p(D d10);
    }

    public C5231h(a aVar, C5953d dVar) {
        this.f22754b = aVar;
        this.f22753a = new K(dVar);
    }

    private boolean d(boolean z10) {
        u0 u0Var = this.f22755c;
        return u0Var == null || u0Var.d() || (z10 && this.f22755c.getState() != 2) || (!this.f22755c.f() && (z10 || this.f22755c.n()));
    }

    private void j(boolean z10) {
        if (d(z10)) {
            this.f22757e = true;
            if (this.f22758f) {
                this.f22753a.b();
                return;
            }
            return;
        }
        F f10 = (F) C5950a.e(this.f22756d);
        long L10 = f10.L();
        if (this.f22757e) {
            if (L10 < this.f22753a.L()) {
                this.f22753a.c();
                return;
            }
            this.f22757e = false;
            if (this.f22758f) {
                this.f22753a.b();
            }
        }
        this.f22753a.a(L10);
        D e10 = f10.e();
        if (!e10.equals(this.f22753a.e())) {
            this.f22753a.g(e10);
            this.f22754b.p(e10);
        }
    }

    public long L() {
        return this.f22757e ? this.f22753a.L() : ((F) C5950a.e(this.f22756d)).L();
    }

    public void a(u0 u0Var) {
        if (u0Var == this.f22755c) {
            this.f22756d = null;
            this.f22755c = null;
            this.f22757e = true;
        }
    }

    public void b(u0 u0Var) {
        F f10;
        F R10 = u0Var.R();
        if (R10 != null && R10 != (f10 = this.f22756d)) {
            if (f10 == null) {
                this.f22756d = R10;
                this.f22755c = u0Var;
                R10.g(this.f22753a.e());
                return;
            }
            throw C5233j.d(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    public void c(long j10) {
        this.f22753a.a(j10);
    }

    public D e() {
        F f10 = this.f22756d;
        return f10 != null ? f10.e() : this.f22753a.e();
    }

    public void f() {
        this.f22758f = true;
        this.f22753a.b();
    }

    public void g(D d10) {
        F f10 = this.f22756d;
        if (f10 != null) {
            f10.g(d10);
            d10 = this.f22756d.e();
        }
        this.f22753a.g(d10);
    }

    public void h() {
        this.f22758f = false;
        this.f22753a.c();
    }

    public long i(boolean z10) {
        j(z10);
        return L();
    }

    public boolean w() {
        return this.f22757e ? this.f22753a.w() : ((F) C5950a.e(this.f22756d)).w();
    }
}
