package t4;

import N3.C6678p;
import N3.C6679q;
import N3.I;
import N3.J;
import N3.r;
import N3.u;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import t3.A;
import t3.B;
import t3.C5950a;
import t3.H;
import t4.L;

/* renamed from: t4.C  reason: case insensitive filesystem */
public final class C8775C implements C6678p {

    /* renamed from: l  reason: collision with root package name */
    public static final u f56160l = new C8774B();

    /* renamed from: a  reason: collision with root package name */
    private final H f56161a;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<a> f56162b;

    /* renamed from: c  reason: collision with root package name */
    private final B f56163c;

    /* renamed from: d  reason: collision with root package name */
    private final C8773A f56164d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f56165e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f56166f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f56167g;

    /* renamed from: h  reason: collision with root package name */
    private long f56168h;

    /* renamed from: i  reason: collision with root package name */
    private z f56169i;

    /* renamed from: j  reason: collision with root package name */
    private r f56170j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f56171k;

    /* renamed from: t4.C$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C8788m f56172a;

        /* renamed from: b  reason: collision with root package name */
        private final H f56173b;

        /* renamed from: c  reason: collision with root package name */
        private final A f56174c = new A(new byte[64]);

        /* renamed from: d  reason: collision with root package name */
        private boolean f56175d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f56176e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f56177f;

        /* renamed from: g  reason: collision with root package name */
        private int f56178g;

        /* renamed from: h  reason: collision with root package name */
        private long f56179h;

        public a(C8788m mVar, H h10) {
            this.f56172a = mVar;
            this.f56173b = h10;
        }

        private void b() {
            this.f56174c.r(8);
            this.f56175d = this.f56174c.g();
            this.f56176e = this.f56174c.g();
            this.f56174c.r(6);
            this.f56178g = this.f56174c.h(8);
        }

        private void c() {
            this.f56179h = 0;
            if (this.f56175d) {
                this.f56174c.r(4);
                this.f56174c.r(1);
                this.f56174c.r(1);
                long h10 = (((long) this.f56174c.h(3)) << 30) | ((long) (this.f56174c.h(15) << 15)) | ((long) this.f56174c.h(15));
                this.f56174c.r(1);
                if (!this.f56177f && this.f56176e) {
                    this.f56174c.r(4);
                    this.f56174c.r(1);
                    this.f56174c.r(1);
                    this.f56174c.r(1);
                    this.f56173b.b((((long) this.f56174c.h(3)) << 30) | ((long) (this.f56174c.h(15) << 15)) | ((long) this.f56174c.h(15)));
                    this.f56177f = true;
                }
                this.f56179h = this.f56173b.b(h10);
            }
        }

        public void a(B b10) {
            b10.l(this.f56174c.f29434a, 0, 3);
            this.f56174c.p(0);
            b();
            b10.l(this.f56174c.f29434a, 0, this.f56178g);
            this.f56174c.p(0);
            c();
            this.f56172a.f(this.f56179h, 4);
            this.f56172a.a(b10);
            this.f56172a.e(false);
        }

        public void d() {
            this.f56177f = false;
            this.f56172a.c();
        }
    }

    public C8775C() {
        this(new H(0));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C6678p[] e() {
        return new C6678p[]{new C8775C()};
    }

    private void f(long j10) {
        if (!this.f56171k) {
            this.f56171k = true;
            if (this.f56164d.c() != -9223372036854775807L) {
                z zVar = new z(this.f56164d.d(), this.f56164d.c(), j10);
                this.f56169i = zVar;
                this.f56170j.n(zVar.b());
                return;
            }
            this.f56170j.n(new J.b(this.f56164d.c()));
        }
    }

    public void a(long j10, long j11) {
        boolean z10 = true;
        boolean z11 = this.f56161a.f() == -9223372036854775807L;
        if (!z11) {
            long d10 = this.f56161a.d();
            if (d10 == -9223372036854775807L || d10 == 0 || d10 == j11) {
                z10 = false;
            }
            z11 = z10;
        }
        if (z11) {
            this.f56161a.i(j11);
        }
        z zVar = this.f56169i;
        if (zVar != null) {
            zVar.h(j11);
        }
        for (int i10 = 0; i10 < this.f56162b.size(); i10++) {
            this.f56162b.valueAt(i10).d();
        }
    }

    public void b(r rVar) {
        this.f56170j = rVar;
    }

    public boolean h(C6679q qVar) {
        byte[] bArr = new byte[14];
        qVar.o(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        qVar.i(bArr[13] & 7);
        qVar.o(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    public int j(C6679q qVar, I i10) {
        C8788m mVar;
        C5950a.i(this.f56170j);
        long length = qVar.getLength();
        int i11 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
        if (i11 != 0 && !this.f56164d.e()) {
            return this.f56164d.g(qVar, i10);
        }
        f(length);
        z zVar = this.f56169i;
        if (zVar != null && zVar.d()) {
            return this.f56169i.c(qVar, i10);
        }
        qVar.f();
        long h10 = i11 != 0 ? length - qVar.h() : -1;
        if ((h10 != -1 && h10 < 4) || !qVar.d(this.f56163c.e(), 0, 4, true)) {
            return -1;
        }
        this.f56163c.W(0);
        int q10 = this.f56163c.q();
        if (q10 == 441) {
            return -1;
        }
        if (q10 == 442) {
            qVar.o(this.f56163c.e(), 0, 10);
            this.f56163c.W(9);
            qVar.k((this.f56163c.H() & 7) + 14);
            return 0;
        } else if (q10 == 443) {
            qVar.o(this.f56163c.e(), 0, 2);
            this.f56163c.W(0);
            qVar.k(this.f56163c.P() + 6);
            return 0;
        } else if (((q10 & -256) >> 8) != 1) {
            qVar.k(1);
            return 0;
        } else {
            int i12 = q10 & 255;
            a aVar = this.f56162b.get(i12);
            if (!this.f56165e) {
                if (aVar == null) {
                    if (i12 == 189) {
                        mVar = new C8778c();
                        this.f56166f = true;
                        this.f56168h = qVar.getPosition();
                    } else if ((q10 & 224) == 192) {
                        mVar = new t();
                        this.f56166f = true;
                        this.f56168h = qVar.getPosition();
                    } else if ((q10 & 240) == 224) {
                        mVar = new C8789n();
                        this.f56167g = true;
                        this.f56168h = qVar.getPosition();
                    } else {
                        mVar = null;
                    }
                    if (mVar != null) {
                        mVar.d(this.f56170j, new L.d(i12, 256));
                        aVar = new a(mVar, this.f56161a);
                        this.f56162b.put(i12, aVar);
                    }
                }
                if (qVar.getPosition() > ((!this.f56166f || !this.f56167g) ? 1048576 : this.f56168h + 8192)) {
                    this.f56165e = true;
                    this.f56170j.r();
                }
            }
            qVar.o(this.f56163c.e(), 0, 2);
            this.f56163c.W(0);
            int P10 = this.f56163c.P() + 6;
            if (aVar == null) {
                qVar.k(P10);
            } else {
                this.f56163c.S(P10);
                qVar.readFully(this.f56163c.e(), 0, P10);
                this.f56163c.W(6);
                aVar.a(this.f56163c);
                B b10 = this.f56163c;
                b10.V(b10.b());
            }
            return 0;
        }
    }

    public void release() {
    }

    public C8775C(H h10) {
        this.f56161a = h10;
        this.f56163c = new B((int) RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT);
        this.f56162b = new SparseArray<>();
        this.f56164d = new C8773A();
    }
}
