package t4;

import N3.O;
import N3.r;
import java.util.Collections;
import java.util.List;
import q3.C5807s;
import t3.B;
import t3.C5950a;
import t4.L;

/* renamed from: t4.l  reason: case insensitive filesystem */
public final class C8787l implements C8788m {

    /* renamed from: a  reason: collision with root package name */
    private final List<L.a> f56336a;

    /* renamed from: b  reason: collision with root package name */
    private final O[] f56337b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f56338c;

    /* renamed from: d  reason: collision with root package name */
    private int f56339d;

    /* renamed from: e  reason: collision with root package name */
    private int f56340e;

    /* renamed from: f  reason: collision with root package name */
    private long f56341f = -9223372036854775807L;

    public C8787l(List<L.a> list) {
        this.f56336a = list;
        this.f56337b = new O[list.size()];
    }

    private boolean b(B b10, int i10) {
        if (b10.a() == 0) {
            return false;
        }
        if (b10.H() != i10) {
            this.f56338c = false;
        }
        this.f56339d--;
        return this.f56338c;
    }

    public void a(B b10) {
        if (!this.f56338c) {
            return;
        }
        if (this.f56339d != 2 || b(b10, 32)) {
            if (this.f56339d != 1 || b(b10, 0)) {
                int f10 = b10.f();
                int a10 = b10.a();
                for (O a11 : this.f56337b) {
                    b10.W(f10);
                    a11.a(b10, a10);
                }
                this.f56340e += a10;
            }
        }
    }

    public void c() {
        this.f56338c = false;
        this.f56341f = -9223372036854775807L;
    }

    public void d(r rVar, L.d dVar) {
        for (int i10 = 0; i10 < this.f56337b.length; i10++) {
            L.a aVar = this.f56336a.get(i10);
            dVar.a();
            O t10 = rVar.t(dVar.c(), 3);
            t10.e(new C5807s.b().e0(dVar.b()).s0("application/dvbsubs").f0(Collections.singletonList(aVar.f56234c)).i0(aVar.f56232a).M());
            this.f56337b[i10] = t10;
        }
    }

    public void e(boolean z10) {
        if (this.f56338c) {
            C5950a.g(this.f56341f != -9223372036854775807L);
            for (O c10 : this.f56337b) {
                c10.c(this.f56341f, 1, this.f56340e, 0, (O.a) null);
            }
            this.f56338c = false;
        }
    }

    public void f(long j10, int i10) {
        if ((i10 & 4) != 0) {
            this.f56338c = true;
            this.f56341f = j10;
            this.f56340e = 0;
            this.f56339d = 2;
        }
    }
}
