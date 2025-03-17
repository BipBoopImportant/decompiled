package t4;

import N3.O;
import N3.r;
import java.util.Arrays;
import java.util.Collections;
import q3.C5807s;
import t3.A;
import t3.B;
import t3.C5950a;
import t3.N;
import t3.q;
import t4.L;
import u3.e;

public final class o implements C8788m {

    /* renamed from: l  reason: collision with root package name */
    private static final float[] f56364l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private final N f56365a;

    /* renamed from: b  reason: collision with root package name */
    private final B f56366b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean[] f56367c = new boolean[4];

    /* renamed from: d  reason: collision with root package name */
    private final a f56368d = new a(128);

    /* renamed from: e  reason: collision with root package name */
    private final w f56369e;

    /* renamed from: f  reason: collision with root package name */
    private b f56370f;

    /* renamed from: g  reason: collision with root package name */
    private long f56371g;

    /* renamed from: h  reason: collision with root package name */
    private String f56372h;

    /* renamed from: i  reason: collision with root package name */
    private O f56373i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f56374j;

    /* renamed from: k  reason: collision with root package name */
    private long f56375k = -9223372036854775807L;

    private static final class a {

        /* renamed from: f  reason: collision with root package name */
        private static final byte[] f56376f = {0, 0, 1};

        /* renamed from: a  reason: collision with root package name */
        private boolean f56377a;

        /* renamed from: b  reason: collision with root package name */
        private int f56378b;

        /* renamed from: c  reason: collision with root package name */
        public int f56379c;

        /* renamed from: d  reason: collision with root package name */
        public int f56380d;

        /* renamed from: e  reason: collision with root package name */
        public byte[] f56381e;

        public a(int i10) {
            this.f56381e = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f56377a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f56381e;
                int length = bArr2.length;
                int i13 = this.f56379c;
                if (length < i13 + i12) {
                    this.f56381e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f56381e, this.f56379c, i12);
                this.f56379c += i12;
            }
        }

        public boolean b(int i10, int i11) {
            int i12 = this.f56378b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                throw new IllegalStateException();
                            } else if (i10 == 179 || i10 == 181) {
                                this.f56379c -= i11;
                                this.f56377a = false;
                                return true;
                            }
                        } else if ((i10 & 240) != 32) {
                            q.h("H263Reader", "Unexpected start code value");
                            c();
                        } else {
                            this.f56380d = this.f56379c;
                            this.f56378b = 4;
                        }
                    } else if (i10 > 31) {
                        q.h("H263Reader", "Unexpected start code value");
                        c();
                    } else {
                        this.f56378b = 3;
                    }
                } else if (i10 != 181) {
                    q.h("H263Reader", "Unexpected start code value");
                    c();
                } else {
                    this.f56378b = 2;
                }
            } else if (i10 == 176) {
                this.f56378b = 1;
                this.f56377a = true;
            }
            byte[] bArr = f56376f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f56377a = false;
            this.f56379c = 0;
            this.f56378b = 0;
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final O f56382a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f56383b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f56384c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f56385d;

        /* renamed from: e  reason: collision with root package name */
        private int f56386e;

        /* renamed from: f  reason: collision with root package name */
        private int f56387f;

        /* renamed from: g  reason: collision with root package name */
        private long f56388g;

        /* renamed from: h  reason: collision with root package name */
        private long f56389h;

        public b(O o10) {
            this.f56382a = o10;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f56384c) {
                int i12 = this.f56387f;
                int i13 = (i10 + 1) - i12;
                if (i13 < i11) {
                    this.f56385d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f56384c = false;
                    return;
                }
                this.f56387f = i12 + (i11 - i10);
            }
        }

        public void b(long j10, int i10, boolean z10) {
            C5950a.g(this.f56389h != -9223372036854775807L);
            if (this.f56386e == 182 && z10 && this.f56383b) {
                this.f56382a.c(this.f56389h, this.f56385d ? 1 : 0, (int) (j10 - this.f56388g), i10, (O.a) null);
            }
            if (this.f56386e != 179) {
                this.f56388g = j10;
            }
        }

        public void c(int i10, long j10) {
            this.f56386e = i10;
            this.f56385d = false;
            boolean z10 = true;
            this.f56383b = i10 == 182 || i10 == 179;
            if (i10 != 182) {
                z10 = false;
            }
            this.f56384c = z10;
            this.f56387f = 0;
            this.f56389h = j10;
        }

        public void d() {
            this.f56383b = false;
            this.f56384c = false;
            this.f56385d = false;
            this.f56386e = -1;
        }
    }

    o(N n10) {
        this.f56365a = n10;
        if (n10 != null) {
            this.f56369e = new w(178, 128);
            this.f56366b = new B();
            return;
        }
        this.f56369e = null;
        this.f56366b = null;
    }

    private static C5807s b(a aVar, int i10, String str) {
        byte[] copyOf = Arrays.copyOf(aVar.f56381e, aVar.f56379c);
        A a10 = new A(copyOf);
        a10.s(i10);
        a10.s(4);
        a10.q();
        a10.r(8);
        if (a10.g()) {
            a10.r(4);
            a10.r(3);
        }
        int h10 = a10.h(4);
        float f10 = 1.0f;
        if (h10 == 15) {
            int h11 = a10.h(8);
            int h12 = a10.h(8);
            if (h12 == 0) {
                q.h("H263Reader", "Invalid aspect ratio");
            } else {
                f10 = ((float) h11) / ((float) h12);
            }
        } else {
            float[] fArr = f56364l;
            if (h10 < fArr.length) {
                f10 = fArr[h10];
            } else {
                q.h("H263Reader", "Invalid aspect ratio");
            }
        }
        if (a10.g()) {
            a10.r(2);
            a10.r(1);
            if (a10.g()) {
                a10.r(15);
                a10.q();
                a10.r(15);
                a10.q();
                a10.r(15);
                a10.q();
                a10.r(3);
                a10.r(11);
                a10.q();
                a10.r(15);
                a10.q();
            }
        }
        if (a10.h(2) != 0) {
            q.h("H263Reader", "Unhandled video object layer shape");
        }
        a10.q();
        int h13 = a10.h(16);
        a10.q();
        if (a10.g()) {
            if (h13 == 0) {
                q.h("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i11 = 0;
                for (int i12 = h13 - 1; i12 > 0; i12 >>= 1) {
                    i11++;
                }
                a10.r(i11);
            }
        }
        a10.q();
        int h14 = a10.h(13);
        a10.q();
        int h15 = a10.h(13);
        a10.q();
        a10.q();
        return new C5807s.b().e0(str).s0("video/mp4v-es").x0(h14).c0(h15).o0(f10).f0(Collections.singletonList(copyOf)).M();
    }

    public void a(B b10) {
        C5950a.i(this.f56370f);
        C5950a.i(this.f56373i);
        int f10 = b10.f();
        int g10 = b10.g();
        byte[] e10 = b10.e();
        this.f56371g += (long) b10.a();
        this.f56373i.a(b10, b10.a());
        while (true) {
            int e11 = e.e(e10, f10, g10, this.f56367c);
            if (e11 == g10) {
                break;
            }
            int i10 = e11 + 3;
            byte b11 = b10.e()[i10] & 255;
            int i11 = e11 - f10;
            int i12 = 0;
            if (!this.f56374j) {
                if (i11 > 0) {
                    this.f56368d.a(e10, f10, e11);
                }
                if (this.f56368d.b(b11, i11 < 0 ? -i11 : 0)) {
                    O o10 = this.f56373i;
                    a aVar = this.f56368d;
                    o10.e(b(aVar, aVar.f56380d, (String) C5950a.e(this.f56372h)));
                    this.f56374j = true;
                }
            }
            this.f56370f.a(e10, f10, e11);
            w wVar = this.f56369e;
            if (wVar != null) {
                if (i11 > 0) {
                    wVar.a(e10, f10, e11);
                } else {
                    i12 = -i11;
                }
                if (this.f56369e.b(i12)) {
                    w wVar2 = this.f56369e;
                    ((B) N.i(this.f56366b)).U(this.f56369e.f56539d, e.I(wVar2.f56539d, wVar2.f56540e));
                    ((N) N.i(this.f56365a)).a(this.f56375k, this.f56366b);
                }
                if (b11 == 178 && b10.e()[e11 + 2] == 1) {
                    this.f56369e.e(b11);
                }
            }
            int i13 = g10 - e11;
            this.f56370f.b(this.f56371g - ((long) i13), i13, this.f56374j);
            this.f56370f.c(b11, this.f56375k);
            f10 = i10;
        }
        if (!this.f56374j) {
            this.f56368d.a(e10, f10, g10);
        }
        this.f56370f.a(e10, f10, g10);
        w wVar3 = this.f56369e;
        if (wVar3 != null) {
            wVar3.a(e10, f10, g10);
        }
    }

    public void c() {
        e.c(this.f56367c);
        this.f56368d.c();
        b bVar = this.f56370f;
        if (bVar != null) {
            bVar.d();
        }
        w wVar = this.f56369e;
        if (wVar != null) {
            wVar.d();
        }
        this.f56371g = 0;
        this.f56375k = -9223372036854775807L;
    }

    public void d(r rVar, L.d dVar) {
        dVar.a();
        this.f56372h = dVar.b();
        O t10 = rVar.t(dVar.c(), 2);
        this.f56373i = t10;
        this.f56370f = new b(t10);
        N n10 = this.f56365a;
        if (n10 != null) {
            n10.b(rVar, dVar);
        }
    }

    public void e(boolean z10) {
        C5950a.i(this.f56370f);
        if (z10) {
            this.f56370f.b(this.f56371g, 0, this.f56374j);
            this.f56370f.d();
        }
    }

    public void f(long j10, int i10) {
        this.f56375k = j10;
    }
}
