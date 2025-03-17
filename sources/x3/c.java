package x3;

import android.net.Uri;
import java.io.File;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import q3.G;
import t3.C5950a;
import t3.N;
import w3.B;
import w3.C;
import w3.f;
import w3.g;
import w3.h;
import w3.k;
import w3.p;
import w3.x;
import w3.y;
import x3.a;
import x3.b;

public final class c implements g {

    /* renamed from: a  reason: collision with root package name */
    private final a f31875a;

    /* renamed from: b  reason: collision with root package name */
    private final g f31876b;

    /* renamed from: c  reason: collision with root package name */
    private final g f31877c;

    /* renamed from: d  reason: collision with root package name */
    private final g f31878d;

    /* renamed from: e  reason: collision with root package name */
    private final h f31879e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f31880f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f31881g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f31882h;

    /* renamed from: i  reason: collision with root package name */
    private Uri f31883i;

    /* renamed from: j  reason: collision with root package name */
    private k f31884j;

    /* renamed from: k  reason: collision with root package name */
    private k f31885k;

    /* renamed from: l  reason: collision with root package name */
    private g f31886l;

    /* renamed from: m  reason: collision with root package name */
    private long f31887m;

    /* renamed from: n  reason: collision with root package name */
    private long f31888n;

    /* renamed from: o  reason: collision with root package name */
    private long f31889o;

    /* renamed from: p  reason: collision with root package name */
    private i f31890p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f31891q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f31892r;

    /* renamed from: s  reason: collision with root package name */
    private long f31893s;

    /* renamed from: t  reason: collision with root package name */
    private long f31894t;

    public interface b {
    }

    /* renamed from: x3.c$c  reason: collision with other inner class name */
    public static final class C0495c implements g.a {

        /* renamed from: a  reason: collision with root package name */
        private a f31895a;

        /* renamed from: b  reason: collision with root package name */
        private g.a f31896b = new p.a();

        /* renamed from: c  reason: collision with root package name */
        private f.a f31897c;

        /* renamed from: d  reason: collision with root package name */
        private h f31898d = h.f31909a;

        /* renamed from: e  reason: collision with root package name */
        private boolean f31899e;

        /* renamed from: f  reason: collision with root package name */
        private g.a f31900f;

        /* renamed from: g  reason: collision with root package name */
        private G f31901g;

        /* renamed from: h  reason: collision with root package name */
        private int f31902h;

        /* renamed from: i  reason: collision with root package name */
        private int f31903i;

        private c c(g gVar, int i10, int i11) {
            f fVar;
            a aVar = (a) C5950a.e(this.f31895a);
            if (this.f31899e || gVar == null) {
                fVar = null;
            } else {
                f.a aVar2 = this.f31897c;
                fVar = aVar2 != null ? aVar2.a() : new b.C0494b().b(aVar).a();
            }
            return new c(aVar, gVar, this.f31896b.a(), fVar, this.f31898d, i10, this.f31901g, i11, (b) null);
        }

        /* renamed from: b */
        public c a() {
            g.a aVar = this.f31900f;
            return c(aVar != null ? aVar.a() : null, this.f31903i, this.f31902h);
        }

        public C0495c d(a aVar) {
            this.f31895a = aVar;
            return this;
        }

        public C0495c e(g.a aVar) {
            this.f31900f = aVar;
            return this;
        }
    }

    private int A(k kVar) {
        if (!this.f31881g || !this.f31891q) {
            return (!this.f31882h || kVar.f31440h != -1) ? -1 : 1;
        }
        return 0;
    }

    private void p() {
        g gVar = this.f31886l;
        if (gVar != null) {
            try {
                gVar.close();
            } finally {
                this.f31885k = null;
                this.f31886l = null;
                i iVar = this.f31890p;
                if (iVar != null) {
                    this.f31875a.f(iVar);
                    this.f31890p = null;
                }
            }
        }
    }

    private static Uri q(a aVar, String str, Uri uri) {
        Uri a10 = l.a(aVar.b(str));
        return a10 != null ? a10 : uri;
    }

    private void r(Throwable th2) {
        if (t() || (th2 instanceof a.C0493a)) {
            this.f31891q = true;
        }
    }

    private boolean s() {
        return this.f31886l == this.f31878d;
    }

    private boolean t() {
        return this.f31886l == this.f31876b;
    }

    private boolean u() {
        return !t();
    }

    private boolean v() {
        return this.f31886l == this.f31877c;
    }

    private void w() {
    }

    private void x(int i10) {
    }

    private void y(k kVar, boolean z10) {
        i iVar;
        k kVar2;
        g gVar;
        long j10;
        k kVar3 = kVar;
        String str = (String) N.i(kVar3.f31441i);
        Uri uri = null;
        if (this.f31892r) {
            iVar = null;
        } else if (this.f31880f) {
            try {
                iVar = this.f31875a.g(str, this.f31888n, this.f31889o);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            iVar = this.f31875a.d(str, this.f31888n, this.f31889o);
        }
        if (iVar == null) {
            gVar = this.f31878d;
            kVar2 = kVar.a().h(this.f31888n).g(this.f31889o).a();
        } else if (iVar.f31913d) {
            Uri fromFile = Uri.fromFile((File) N.i(iVar.f31914e));
            long j11 = iVar.f31911b;
            long j12 = this.f31888n - j11;
            long j13 = iVar.f31912c - j12;
            long j14 = this.f31889o;
            if (j14 != -1) {
                j13 = Math.min(j13, j14);
            }
            kVar2 = kVar.a().i(fromFile).k(j11).h(j12).g(j13).a();
            gVar = this.f31876b;
        } else {
            if (iVar.j()) {
                j10 = this.f31889o;
            } else {
                j10 = iVar.f31912c;
                long j15 = this.f31889o;
                if (j15 != -1) {
                    j10 = Math.min(j10, j15);
                }
            }
            kVar2 = kVar.a().h(this.f31888n).g(j10).a();
            gVar = this.f31877c;
            if (gVar == null) {
                gVar = this.f31878d;
                this.f31875a.f(iVar);
                iVar = null;
            }
        }
        this.f31894t = (this.f31892r || gVar != this.f31878d) ? Long.MAX_VALUE : this.f31888n + 102400;
        if (z10) {
            C5950a.g(s());
            if (gVar != this.f31878d) {
                try {
                    p();
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    if (((i) N.i(iVar)).b()) {
                        this.f31875a.f(iVar);
                    }
                    throw th3;
                }
            } else {
                return;
            }
        }
        if (iVar != null && iVar.b()) {
            this.f31890p = iVar;
        }
        this.f31886l = gVar;
        this.f31885k = kVar2;
        this.f31887m = 0;
        long b10 = gVar.b(kVar2);
        m mVar = new m();
        if (kVar2.f31440h == -1 && b10 != -1) {
            this.f31889o = b10;
            m.g(mVar, this.f31888n + b10);
        }
        if (u()) {
            Uri n10 = gVar.n();
            this.f31883i = n10;
            if (!kVar3.f31433a.equals(n10)) {
                uri = this.f31883i;
            }
            m.h(mVar, uri);
        }
        if (v()) {
            this.f31875a.c(str, mVar);
        }
    }

    private void z(String str) {
        this.f31889o = 0;
        if (v()) {
            m mVar = new m();
            m.g(mVar, this.f31888n);
            this.f31875a.c(str, mVar);
        }
    }

    public long b(k kVar) {
        try {
            String b10 = this.f31879e.b(kVar);
            k a10 = kVar.a().f(b10).a();
            this.f31884j = a10;
            this.f31883i = q(this.f31875a, b10, a10.f31433a);
            this.f31888n = kVar.f31439g;
            int A10 = A(kVar);
            boolean z10 = A10 != -1;
            this.f31892r = z10;
            if (z10) {
                x(A10);
            }
            if (this.f31892r) {
                this.f31889o = -1;
            } else {
                long c10 = l.c(this.f31875a.b(b10));
                this.f31889o = c10;
                if (c10 != -1) {
                    long j10 = c10 - kVar.f31439g;
                    this.f31889o = j10;
                    if (j10 < 0) {
                        throw new h(2008);
                    }
                }
            }
            long j11 = kVar.f31440h;
            if (j11 != -1) {
                long j12 = this.f31889o;
                if (j12 != -1) {
                    j11 = Math.min(j12, j11);
                }
                this.f31889o = j11;
            }
            long j13 = this.f31889o;
            if (j13 > 0 || j13 == -1) {
                y(a10, false);
            }
            long j14 = kVar.f31440h;
            return j14 != -1 ? j14 : this.f31889o;
        } catch (Throwable th2) {
            r(th2);
            throw th2;
        }
    }

    public int c(byte[] bArr, int i10, int i11) {
        int i12 = i11;
        if (i12 == 0) {
            return 0;
        }
        if (this.f31889o == 0) {
            return -1;
        }
        k kVar = (k) C5950a.e(this.f31884j);
        k kVar2 = (k) C5950a.e(this.f31885k);
        try {
            if (this.f31888n >= this.f31894t) {
                y(kVar, true);
            }
            int c10 = ((g) C5950a.e(this.f31886l)).c(bArr, i10, i12);
            if (c10 != -1) {
                if (t()) {
                    this.f31893s += (long) c10;
                }
                long j10 = (long) c10;
                this.f31888n += j10;
                this.f31887m += j10;
                long j11 = this.f31889o;
                if (j11 != -1) {
                    this.f31889o = j11 - j10;
                }
            } else {
                if (u()) {
                    long j12 = kVar2.f31440h;
                    if (j12 == -1 || this.f31887m < j12) {
                        z((String) N.i(kVar.f31441i));
                    }
                }
                long j13 = this.f31889o;
                if (j13 <= 0) {
                    if (j13 == -1) {
                    }
                }
                p();
                y(kVar, false);
                return c(bArr, i10, i11);
            }
            return c10;
        } catch (Throwable th2) {
            r(th2);
            throw th2;
        }
    }

    public void close() {
        this.f31884j = null;
        this.f31883i = null;
        this.f31888n = 0;
        w();
        try {
            p();
        } catch (Throwable th2) {
            r(th2);
            throw th2;
        }
    }

    public Map<String, List<String>> e() {
        return u() ? this.f31878d.e() : Collections.emptyMap();
    }

    public void l(C c10) {
        C5950a.e(c10);
        this.f31876b.l(c10);
        this.f31878d.l(c10);
    }

    public Uri n() {
        return this.f31883i;
    }

    private c(a aVar, g gVar, g gVar2, f fVar, h hVar, int i10, G g10, int i11, b bVar) {
        this.f31875a = aVar;
        this.f31876b = gVar2;
        this.f31879e = hVar == null ? h.f31909a : hVar;
        boolean z10 = false;
        this.f31880f = (i10 & 1) != 0;
        this.f31881g = (i10 & 2) != 0;
        this.f31882h = (i10 & 4) != 0 ? true : z10;
        B b10 = null;
        if (gVar != null) {
            gVar = g10 != null ? new y(gVar, g10, i11) : gVar;
            this.f31878d = gVar;
            this.f31877c = fVar != null ? new B(gVar, fVar) : b10;
            return;
        }
        this.f31878d = x.f31510a;
        this.f31877c = null;
    }
}
