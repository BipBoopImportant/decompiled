package t4;

import N3.O;
import N3.r;
import java.util.Collections;
import jb.l;
import q3.C5798i;
import q3.C5807s;
import t3.B;
import t3.C5950a;
import t3.C5954e;
import t3.N;
import t4.L;
import u3.e;

public final class q implements C8788m {

    /* renamed from: a  reason: collision with root package name */
    private final G f56440a;

    /* renamed from: b  reason: collision with root package name */
    private String f56441b;

    /* renamed from: c  reason: collision with root package name */
    private O f56442c;

    /* renamed from: d  reason: collision with root package name */
    private a f56443d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f56444e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean[] f56445f = new boolean[3];

    /* renamed from: g  reason: collision with root package name */
    private final w f56446g = new w(32, 128);

    /* renamed from: h  reason: collision with root package name */
    private final w f56447h = new w(33, 128);

    /* renamed from: i  reason: collision with root package name */
    private final w f56448i = new w(34, 128);

    /* renamed from: j  reason: collision with root package name */
    private final w f56449j = new w(39, 128);

    /* renamed from: k  reason: collision with root package name */
    private final w f56450k = new w(40, 128);

    /* renamed from: l  reason: collision with root package name */
    private long f56451l;

    /* renamed from: m  reason: collision with root package name */
    private long f56452m = -9223372036854775807L;

    /* renamed from: n  reason: collision with root package name */
    private final B f56453n = new B();

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final O f56454a;

        /* renamed from: b  reason: collision with root package name */
        private long f56455b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f56456c;

        /* renamed from: d  reason: collision with root package name */
        private int f56457d;

        /* renamed from: e  reason: collision with root package name */
        private long f56458e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f56459f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f56460g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f56461h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f56462i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f56463j;

        /* renamed from: k  reason: collision with root package name */
        private long f56464k;

        /* renamed from: l  reason: collision with root package name */
        private long f56465l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f56466m;

        public a(O o10) {
            this.f56454a = o10;
        }

        private static boolean c(int i10) {
            return (32 <= i10 && i10 <= 35) || i10 == 39;
        }

        private static boolean d(int i10) {
            return i10 < 32 || i10 == 40;
        }

        private void e(int i10) {
            long j10 = this.f56465l;
            if (j10 != -9223372036854775807L) {
                boolean z10 = this.f56466m;
                this.f56454a.c(j10, z10 ? 1 : 0, (int) (this.f56455b - this.f56464k), i10, (O.a) null);
            }
        }

        public void a(long j10) {
            this.f56466m = this.f56456c;
            e((int) (j10 - this.f56455b));
            this.f56464k = this.f56455b;
            this.f56455b = j10;
            e(0);
            this.f56462i = false;
        }

        public void b(long j10, int i10, boolean z10) {
            if (this.f56463j && this.f56460g) {
                this.f56466m = this.f56456c;
                this.f56463j = false;
            } else if (this.f56461h || this.f56460g) {
                if (z10 && this.f56462i) {
                    e(i10 + ((int) (j10 - this.f56455b)));
                }
                this.f56464k = this.f56455b;
                this.f56465l = this.f56458e;
                this.f56466m = this.f56456c;
                this.f56462i = true;
            }
        }

        public void f(byte[] bArr, int i10, int i11) {
            if (this.f56459f) {
                int i12 = this.f56457d;
                int i13 = (i10 + 2) - i12;
                if (i13 < i11) {
                    this.f56460g = (bArr[i13] & 128) != 0;
                    this.f56459f = false;
                    return;
                }
                this.f56457d = i12 + (i11 - i10);
            }
        }

        public void g() {
            this.f56459f = false;
            this.f56460g = false;
            this.f56461h = false;
            this.f56462i = false;
            this.f56463j = false;
        }

        public void h(long j10, int i10, int i11, long j11, boolean z10) {
            boolean z11 = false;
            this.f56460g = false;
            this.f56461h = false;
            this.f56458e = j11;
            this.f56457d = 0;
            this.f56455b = j10;
            if (!d(i11)) {
                if (this.f56462i && !this.f56463j) {
                    if (z10) {
                        e(i10);
                    }
                    this.f56462i = false;
                }
                if (c(i11)) {
                    this.f56461h = !this.f56463j;
                    this.f56463j = true;
                }
            }
            boolean z12 = i11 >= 16 && i11 <= 21;
            this.f56456c = z12;
            if (z12 || i11 <= 9) {
                z11 = true;
            }
            this.f56459f = z11;
        }
    }

    public q(G g10) {
        this.f56440a = g10;
    }

    private void b() {
        C5950a.i(this.f56442c);
        N.i(this.f56443d);
    }

    private void g(long j10, int i10, int i11, long j11) {
        this.f56443d.b(j10, i10, this.f56444e);
        if (!this.f56444e) {
            this.f56446g.b(i11);
            this.f56447h.b(i11);
            this.f56448i.b(i11);
            if (this.f56446g.c() && this.f56447h.c() && this.f56448i.c()) {
                C5807s i12 = i(this.f56441b, this.f56446g, this.f56447h, this.f56448i);
                this.f56442c.e(i12);
                l.o(i12.f28246q != -1);
                this.f56440a.f(i12.f28246q);
                this.f56444e = true;
            }
        }
        if (this.f56449j.b(i11)) {
            w wVar = this.f56449j;
            this.f56453n.U(this.f56449j.f56539d, e.I(wVar.f56539d, wVar.f56540e));
            this.f56453n.X(5);
            this.f56440a.b(j11, this.f56453n);
        }
        if (this.f56450k.b(i11)) {
            w wVar2 = this.f56450k;
            this.f56453n.U(this.f56450k.f56539d, e.I(wVar2.f56539d, wVar2.f56540e));
            this.f56453n.X(5);
            this.f56440a.b(j11, this.f56453n);
        }
    }

    private void h(byte[] bArr, int i10, int i11) {
        this.f56443d.f(bArr, i10, i11);
        if (!this.f56444e) {
            this.f56446g.a(bArr, i10, i11);
            this.f56447h.a(bArr, i10, i11);
            this.f56448i.a(bArr, i10, i11);
        }
        this.f56449j.a(bArr, i10, i11);
        this.f56450k.a(bArr, i10, i11);
    }

    private static C5807s i(String str, w wVar, w wVar2, w wVar3) {
        int i10 = wVar.f56540e;
        byte[] bArr = new byte[(wVar2.f56540e + i10 + wVar3.f56540e)];
        System.arraycopy(wVar.f56539d, 0, bArr, 0, i10);
        System.arraycopy(wVar2.f56539d, 0, bArr, wVar.f56540e, wVar2.f56540e);
        System.arraycopy(wVar3.f56539d, 0, bArr, wVar.f56540e + wVar2.f56540e, wVar3.f56540e);
        String str2 = null;
        e.h r10 = e.r(wVar2.f56539d, 3, wVar2.f56540e, (e.k) null);
        e.c cVar = r10.f30110b;
        if (cVar != null) {
            str2 = C5954e.f(cVar.f30085a, cVar.f30086b, cVar.f30087c, cVar.f30088d, cVar.f30089e, cVar.f30090f);
        }
        return new C5807s.b().e0(str).s0("video/hevc").R(str2).x0(r10.f30115g).c0(r10.f30116h).S(new C5798i.b().d(r10.f30119k).c(r10.f30120l).e(r10.f30121m).g(r10.f30112d + 8).b(r10.f30113e + 8).a()).o0(r10.f30117i).k0(r10.f30118j).f0(Collections.singletonList(bArr)).M();
    }

    private void j(long j10, int i10, int i11, long j11) {
        this.f56443d.h(j10, i10, i11, j11, this.f56444e);
        if (!this.f56444e) {
            this.f56446g.e(i11);
            this.f56447h.e(i11);
            this.f56448i.e(i11);
        }
        this.f56449j.e(i11);
        this.f56450k.e(i11);
    }

    public void a(B b10) {
        b();
        while (b10.a() > 0) {
            int f10 = b10.f();
            int g10 = b10.g();
            byte[] e10 = b10.e();
            this.f56451l += (long) b10.a();
            this.f56442c.a(b10, b10.a());
            while (true) {
                if (f10 < g10) {
                    int e11 = e.e(e10, f10, g10, this.f56445f);
                    if (e11 == g10) {
                        h(e10, f10, g10);
                        return;
                    }
                    int i10 = e.i(e10, e11);
                    int i11 = e11 - f10;
                    if (i11 > 0) {
                        h(e10, f10, e11);
                    }
                    int i12 = g10 - e11;
                    long j10 = this.f56451l - ((long) i12);
                    int i13 = i11 < 0 ? -i11 : 0;
                    long j11 = j10;
                    int i14 = i12;
                    g(j11, i14, i13, this.f56452m);
                    j(j11, i14, i10, this.f56452m);
                    f10 = e11 + 3;
                }
            }
        }
    }

    public void c() {
        this.f56451l = 0;
        this.f56452m = -9223372036854775807L;
        e.c(this.f56445f);
        this.f56446g.d();
        this.f56447h.d();
        this.f56448i.d();
        this.f56449j.d();
        this.f56450k.d();
        this.f56440a.d();
        a aVar = this.f56443d;
        if (aVar != null) {
            aVar.g();
        }
    }

    public void d(r rVar, L.d dVar) {
        dVar.a();
        this.f56441b = dVar.b();
        O t10 = rVar.t(dVar.c(), 2);
        this.f56442c = t10;
        this.f56443d = new a(t10);
        this.f56440a.c(rVar, dVar);
    }

    public void e(boolean z10) {
        b();
        if (z10) {
            this.f56440a.d();
            this.f56443d.a(this.f56451l);
        }
    }

    public void f(long j10, int i10) {
        this.f56452m = j10;
    }
}
