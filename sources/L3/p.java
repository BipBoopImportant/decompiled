package L3;

import android.content.Context;
import android.view.Surface;
import t3.C5950a;
import t3.C5953d;
import t3.N;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final b f38195a;

    /* renamed from: b  reason: collision with root package name */
    private final r f38196b;

    /* renamed from: c  reason: collision with root package name */
    private final long f38197c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f38198d;

    /* renamed from: e  reason: collision with root package name */
    private int f38199e = 0;

    /* renamed from: f  reason: collision with root package name */
    private long f38200f = -9223372036854775807L;

    /* renamed from: g  reason: collision with root package name */
    private long f38201g;

    /* renamed from: h  reason: collision with root package name */
    private long f38202h = -9223372036854775807L;

    /* renamed from: i  reason: collision with root package name */
    private long f38203i = -9223372036854775807L;

    /* renamed from: j  reason: collision with root package name */
    private boolean f38204j;

    /* renamed from: k  reason: collision with root package name */
    private float f38205k = 1.0f;

    /* renamed from: l  reason: collision with root package name */
    private C5953d f38206l = C5953d.f29483a;

    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public long f38207a = -9223372036854775807L;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public long f38208b = -9223372036854775807L;

        /* access modifiers changed from: private */
        public void h() {
            this.f38207a = -9223372036854775807L;
            this.f38208b = -9223372036854775807L;
        }

        public long f() {
            return this.f38207a;
        }

        public long g() {
            return this.f38208b;
        }
    }

    public interface b {
        boolean C(long j10, long j11);

        boolean F(long j10, long j11, long j12, boolean z10, boolean z11);

        boolean N(long j10, long j11, boolean z10);
    }

    public p(Context context, b bVar, long j10) {
        this.f38195a = bVar;
        this.f38197c = j10;
        this.f38196b = new r(context);
    }

    private long b(long j10, long j11, long j12) {
        long j13 = (long) (((double) (j12 - j10)) / ((double) this.f38205k));
        return this.f38198d ? j13 - (N.P0(this.f38206l.c()) - j11) : j13;
    }

    private void f(int i10) {
        this.f38199e = Math.min(this.f38199e, i10);
    }

    private boolean s(long j10, long j11, long j12) {
        if (this.f38203i != -9223372036854775807L && !this.f38204j) {
            return false;
        }
        int i10 = this.f38199e;
        if (i10 == 0) {
            return this.f38198d;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return j10 >= j12;
        }
        if (i10 == 3) {
            return this.f38198d && this.f38195a.C(j11, N.P0(this.f38206l.c()) - this.f38201g);
        }
        throw new IllegalStateException();
    }

    public void a() {
        if (this.f38199e == 0) {
            this.f38199e = 1;
        }
    }

    public int c(long j10, long j11, long j12, long j13, boolean z10, a aVar) {
        long j14 = j10;
        long j15 = j11;
        a aVar2 = aVar;
        aVar.h();
        if (this.f38200f == -9223372036854775807L) {
            this.f38200f = j15;
        }
        if (this.f38202h != j14) {
            this.f38196b.h(j14);
            this.f38202h = j14;
        }
        long unused = aVar2.f38207a = b(j11, j12, j10);
        boolean z11 = false;
        if (s(j11, aVar.f38207a, j13)) {
            return 0;
        }
        if (!this.f38198d || j15 == this.f38200f) {
            return 5;
        }
        long b10 = this.f38206l.b();
        long unused2 = aVar2.f38208b = this.f38196b.b((aVar.f38207a * 1000) + b10);
        long unused3 = aVar2.f38207a = (aVar.f38208b - b10) / 1000;
        if (this.f38203i != -9223372036854775807L && !this.f38204j) {
            z11 = true;
        }
        if (this.f38195a.F(aVar.f38207a, j11, j12, z10, z11)) {
            return 4;
        }
        return this.f38195a.N(aVar.f38207a, j12, z10) ? z11 ? 3 : 2 : aVar.f38207a > 50000 ? 5 : 1;
    }

    public boolean d(boolean z10) {
        if (z10 && this.f38199e == 3) {
            this.f38203i = -9223372036854775807L;
            return true;
        } else if (this.f38203i == -9223372036854775807L) {
            return false;
        } else {
            if (this.f38206l.c() < this.f38203i) {
                return true;
            }
            this.f38203i = -9223372036854775807L;
            return false;
        }
    }

    public void e(boolean z10) {
        this.f38204j = z10;
        this.f38203i = this.f38197c > 0 ? this.f38206l.c() + this.f38197c : -9223372036854775807L;
    }

    public void g() {
        f(0);
    }

    public void h(boolean z10) {
        this.f38199e = z10 ? 1 : 0;
    }

    public boolean i() {
        boolean z10 = this.f38199e != 3;
        this.f38199e = 3;
        this.f38201g = N.P0(this.f38206l.c());
        return z10;
    }

    public void j() {
        f(2);
    }

    public void k() {
        this.f38198d = true;
        this.f38201g = N.P0(this.f38206l.c());
        this.f38196b.k();
    }

    public void l() {
        this.f38198d = false;
        this.f38203i = -9223372036854775807L;
        this.f38196b.l();
    }

    public void m() {
        this.f38196b.j();
        this.f38202h = -9223372036854775807L;
        this.f38200f = -9223372036854775807L;
        f(1);
        this.f38203i = -9223372036854775807L;
    }

    public void n(int i10) {
        this.f38196b.o(i10);
    }

    public void o(C5953d dVar) {
        this.f38206l = dVar;
    }

    public void p(float f10) {
        this.f38196b.g(f10);
    }

    public void q(Surface surface) {
        this.f38196b.m(surface);
        f(1);
    }

    public void r(float f10) {
        C5950a.a(f10 > 0.0f);
        if (f10 != this.f38205k) {
            this.f38205k = f10;
            this.f38196b.i(f10);
        }
    }
}
