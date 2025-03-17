package t4;

import N3.C6660F;
import N3.O;
import N3.r;
import androidx.recyclerview.widget.RecyclerView;
import q3.C5807s;
import t3.B;
import t3.C5950a;
import t4.L;

public final class t implements C8788m {

    /* renamed from: a  reason: collision with root package name */
    private final B f56495a;

    /* renamed from: b  reason: collision with root package name */
    private final C6660F.a f56496b;

    /* renamed from: c  reason: collision with root package name */
    private final String f56497c;

    /* renamed from: d  reason: collision with root package name */
    private final int f56498d;

    /* renamed from: e  reason: collision with root package name */
    private O f56499e;

    /* renamed from: f  reason: collision with root package name */
    private String f56500f;

    /* renamed from: g  reason: collision with root package name */
    private int f56501g;

    /* renamed from: h  reason: collision with root package name */
    private int f56502h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f56503i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f56504j;

    /* renamed from: k  reason: collision with root package name */
    private long f56505k;

    /* renamed from: l  reason: collision with root package name */
    private int f56506l;

    /* renamed from: m  reason: collision with root package name */
    private long f56507m;

    public t() {
        this((String) null, 0);
    }

    private void b(B b10) {
        byte[] e10 = b10.e();
        int g10 = b10.g();
        for (int f10 = b10.f(); f10 < g10; f10++) {
            byte b11 = e10[f10];
            boolean z10 = (b11 & 255) == 255;
            boolean z11 = this.f56504j && (b11 & 224) == 224;
            this.f56504j = z10;
            if (z11) {
                b10.W(f10 + 1);
                this.f56504j = false;
                this.f56495a.e()[1] = e10[f10];
                this.f56502h = 2;
                this.f56501g = 1;
                return;
            }
        }
        b10.W(g10);
    }

    private void g(B b10) {
        int min = Math.min(b10.a(), this.f56506l - this.f56502h);
        this.f56499e.a(b10, min);
        int i10 = this.f56502h + min;
        this.f56502h = i10;
        if (i10 >= this.f56506l) {
            C5950a.g(this.f56507m != -9223372036854775807L);
            this.f56499e.c(this.f56507m, 1, this.f56506l, 0, (O.a) null);
            this.f56507m += this.f56505k;
            this.f56502h = 0;
            this.f56501g = 0;
        }
    }

    private void h(B b10) {
        int min = Math.min(b10.a(), 4 - this.f56502h);
        b10.l(this.f56495a.e(), this.f56502h, min);
        int i10 = this.f56502h + min;
        this.f56502h = i10;
        if (i10 >= 4) {
            this.f56495a.W(0);
            if (!this.f56496b.a(this.f56495a.q())) {
                this.f56502h = 0;
                this.f56501g = 1;
                return;
            }
            C6660F.a aVar = this.f56496b;
            this.f56506l = aVar.f38755c;
            if (!this.f56503i) {
                this.f56505k = (((long) aVar.f38759g) * 1000000) / ((long) aVar.f38756d);
                this.f56499e.e(new C5807s.b().e0(this.f56500f).s0(this.f56496b.f38754b).j0(RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT).Q(this.f56496b.f38757e).t0(this.f56496b.f38756d).i0(this.f56497c).q0(this.f56498d).M());
                this.f56503i = true;
            }
            this.f56495a.W(0);
            this.f56499e.a(this.f56495a, 4);
            this.f56501g = 2;
        }
    }

    public void a(B b10) {
        C5950a.i(this.f56499e);
        while (b10.a() > 0) {
            int i10 = this.f56501g;
            if (i10 == 0) {
                b(b10);
            } else if (i10 == 1) {
                h(b10);
            } else if (i10 == 2) {
                g(b10);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public void c() {
        this.f56501g = 0;
        this.f56502h = 0;
        this.f56504j = false;
        this.f56507m = -9223372036854775807L;
    }

    public void d(r rVar, L.d dVar) {
        dVar.a();
        this.f56500f = dVar.b();
        this.f56499e = rVar.t(dVar.c(), 1);
    }

    public void e(boolean z10) {
    }

    public void f(long j10, int i10) {
        this.f56507m = j10;
    }

    public t(String str, int i10) {
        this.f56501g = 0;
        B b10 = new B(4);
        this.f56495a = b10;
        b10.e()[0] = -1;
        this.f56496b = new C6660F.a();
        this.f56507m = -9223372036854775807L;
        this.f56497c = str;
        this.f56498d = i10;
    }
}
