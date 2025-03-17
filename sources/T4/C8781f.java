package t4;

import N3.C6665c;
import N3.O;
import N3.r;
import q3.C5807s;
import t3.A;
import t3.B;
import t3.C5950a;
import t4.L;

/* renamed from: t4.f  reason: case insensitive filesystem */
public final class C8781f implements C8788m {

    /* renamed from: a  reason: collision with root package name */
    private final A f56268a;

    /* renamed from: b  reason: collision with root package name */
    private final B f56269b;

    /* renamed from: c  reason: collision with root package name */
    private final String f56270c;

    /* renamed from: d  reason: collision with root package name */
    private final int f56271d;

    /* renamed from: e  reason: collision with root package name */
    private String f56272e;

    /* renamed from: f  reason: collision with root package name */
    private O f56273f;

    /* renamed from: g  reason: collision with root package name */
    private int f56274g;

    /* renamed from: h  reason: collision with root package name */
    private int f56275h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f56276i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f56277j;

    /* renamed from: k  reason: collision with root package name */
    private long f56278k;

    /* renamed from: l  reason: collision with root package name */
    private C5807s f56279l;

    /* renamed from: m  reason: collision with root package name */
    private int f56280m;

    /* renamed from: n  reason: collision with root package name */
    private long f56281n;

    public C8781f() {
        this((String) null, 0);
    }

    private boolean b(B b10, byte[] bArr, int i10) {
        int min = Math.min(b10.a(), i10 - this.f56275h);
        b10.l(bArr, this.f56275h, min);
        int i11 = this.f56275h + min;
        this.f56275h = i11;
        return i11 == i10;
    }

    private void g() {
        this.f56268a.p(0);
        C6665c.C0612c f10 = C6665c.f(this.f56268a);
        C5807s sVar = this.f56279l;
        if (sVar == null || f10.f38836c != sVar.f28219D || f10.f38835b != sVar.f28220E || !"audio/ac4".equals(sVar.f28244o)) {
            C5807s M10 = new C5807s.b().e0(this.f56272e).s0("audio/ac4").Q(f10.f38836c).t0(f10.f38835b).i0(this.f56270c).q0(this.f56271d).M();
            this.f56279l = M10;
            this.f56273f.e(M10);
        }
        this.f56280m = f10.f38837d;
        this.f56278k = (((long) f10.f38838e) * 1000000) / ((long) this.f56279l.f28220E);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean h(t3.B r6) {
        /*
            r5 = this;
        L_0x0000:
            int r0 = r6.a()
            r1 = 0
            if (r0 <= 0) goto L_0x0031
            boolean r0 = r5.f56276i
            r2 = 172(0xac, float:2.41E-43)
            r3 = 1
            if (r0 != 0) goto L_0x0018
            int r0 = r6.H()
            if (r0 != r2) goto L_0x0015
            r1 = r3
        L_0x0015:
            r5.f56276i = r1
            goto L_0x0000
        L_0x0018:
            int r0 = r6.H()
            if (r0 != r2) goto L_0x0020
            r2 = r3
            goto L_0x0021
        L_0x0020:
            r2 = r1
        L_0x0021:
            r5.f56276i = r2
            r2 = 64
            r4 = 65
            if (r0 == r2) goto L_0x002b
            if (r0 != r4) goto L_0x0000
        L_0x002b:
            if (r0 != r4) goto L_0x002e
            r1 = r3
        L_0x002e:
            r5.f56277j = r1
            return r3
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.C8781f.h(t3.B):boolean");
    }

    public void a(B b10) {
        C5950a.i(this.f56273f);
        while (b10.a() > 0) {
            int i10 = this.f56274g;
            boolean z10 = true;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(b10.a(), this.f56280m - this.f56275h);
                        this.f56273f.a(b10, min);
                        int i11 = this.f56275h + min;
                        this.f56275h = i11;
                        if (i11 == this.f56280m) {
                            if (this.f56281n == -9223372036854775807L) {
                                z10 = false;
                            }
                            C5950a.g(z10);
                            this.f56273f.c(this.f56281n, 1, this.f56280m, 0, (O.a) null);
                            this.f56281n += this.f56278k;
                            this.f56274g = 0;
                        }
                    }
                } else if (b(b10, this.f56269b.e(), 16)) {
                    g();
                    this.f56269b.W(0);
                    this.f56273f.a(this.f56269b, 16);
                    this.f56274g = 2;
                }
            } else if (h(b10)) {
                this.f56274g = 1;
                this.f56269b.e()[0] = -84;
                this.f56269b.e()[1] = (byte) (this.f56277j ? 65 : 64);
                this.f56275h = 2;
            }
        }
    }

    public void c() {
        this.f56274g = 0;
        this.f56275h = 0;
        this.f56276i = false;
        this.f56277j = false;
        this.f56281n = -9223372036854775807L;
    }

    public void d(r rVar, L.d dVar) {
        dVar.a();
        this.f56272e = dVar.b();
        this.f56273f = rVar.t(dVar.c(), 1);
    }

    public void e(boolean z10) {
    }

    public void f(long j10, int i10) {
        this.f56281n = j10;
    }

    public C8781f(String str, int i10) {
        A a10 = new A(new byte[16]);
        this.f56268a = a10;
        this.f56269b = new B(a10.f29434a);
        this.f56274g = 0;
        this.f56275h = 0;
        this.f56276i = false;
        this.f56277j = false;
        this.f56281n = -9223372036854775807L;
        this.f56270c = str;
        this.f56271d = i10;
    }
}
