package u4;

import N3.C6678p;
import N3.C6679q;
import N3.I;
import N3.O;
import N3.T;
import N3.r;
import N3.u;
import android.util.Pair;
import q3.C5807s;
import t3.B;
import t3.C5950a;
import t3.N;
import t3.q;

public final class b implements C6678p {

    /* renamed from: h  reason: collision with root package name */
    public static final u f56796h = new C8876a();

    /* renamed from: a  reason: collision with root package name */
    private r f56797a;

    /* renamed from: b  reason: collision with root package name */
    private O f56798b;

    /* renamed from: c  reason: collision with root package name */
    private int f56799c = 0;

    /* renamed from: d  reason: collision with root package name */
    private long f56800d = -1;

    /* renamed from: e  reason: collision with root package name */
    private C0912b f56801e;

    /* renamed from: f  reason: collision with root package name */
    private int f56802f = -1;

    /* renamed from: g  reason: collision with root package name */
    private long f56803g = -1;

    private static final class a implements C0912b {

        /* renamed from: m  reason: collision with root package name */
        private static final int[] f56804m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n  reason: collision with root package name */
        private static final int[] f56805n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a  reason: collision with root package name */
        private final r f56806a;

        /* renamed from: b  reason: collision with root package name */
        private final O f56807b;

        /* renamed from: c  reason: collision with root package name */
        private final c f56808c;

        /* renamed from: d  reason: collision with root package name */
        private final int f56809d;

        /* renamed from: e  reason: collision with root package name */
        private final byte[] f56810e;

        /* renamed from: f  reason: collision with root package name */
        private final B f56811f;

        /* renamed from: g  reason: collision with root package name */
        private final int f56812g;

        /* renamed from: h  reason: collision with root package name */
        private final C5807s f56813h;

        /* renamed from: i  reason: collision with root package name */
        private int f56814i;

        /* renamed from: j  reason: collision with root package name */
        private long f56815j;

        /* renamed from: k  reason: collision with root package name */
        private int f56816k;

        /* renamed from: l  reason: collision with root package name */
        private long f56817l;

        public a(r rVar, O o10, c cVar) {
            this.f56806a = rVar;
            this.f56807b = o10;
            this.f56808c = cVar;
            int max = Math.max(1, cVar.f56828c / 10);
            this.f56812g = max;
            B b10 = new B(cVar.f56832g);
            b10.z();
            int z10 = b10.z();
            this.f56809d = z10;
            int i10 = cVar.f56827b;
            int i11 = (((cVar.f56830e - (i10 * 4)) * 8) / (cVar.f56831f * i10)) + 1;
            if (z10 == i11) {
                int k10 = N.k(max, z10);
                this.f56810e = new byte[(cVar.f56830e * k10)];
                this.f56811f = new B(k10 * h(z10, i10));
                int i12 = ((cVar.f56828c * cVar.f56830e) * 8) / z10;
                this.f56813h = new C5807s.b().s0("audio/raw").P(i12).n0(i12).j0(h(max, i10)).Q(cVar.f56827b).t0(cVar.f56828c).m0(2).M();
                return;
            }
            throw q3.B.a("Expected frames per block: " + i11 + "; got: " + z10, (Throwable) null);
        }

        private void d(byte[] bArr, int i10, B b10) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f56808c.f56827b; i12++) {
                    e(bArr, i11, i12, b10.e());
                }
            }
            int g10 = g(this.f56809d * i10);
            b10.W(0);
            b10.V(g10);
        }

        private void e(byte[] bArr, int i10, int i11, byte[] bArr2) {
            c cVar = this.f56808c;
            int i12 = cVar.f56830e;
            int i13 = cVar.f56827b;
            int i14 = (i10 * i12) + (i11 * 4);
            int i15 = (i13 * 4) + i14;
            int i16 = (i12 / i13) - 4;
            int i17 = (short) (((bArr[i14 + 1] & 255) << 8) | (bArr[i14] & 255));
            int min = Math.min(bArr[i14 + 2] & 255, 88);
            int i18 = f56805n[min];
            int i19 = ((i10 * this.f56809d * i13) + i11) * 2;
            bArr2[i19] = (byte) (i17 & 255);
            bArr2[i19 + 1] = (byte) (i17 >> 8);
            for (int i20 = 0; i20 < i16 * 2; i20++) {
                byte b10 = bArr[((i20 / 8) * i13 * 4) + i15 + ((i20 / 2) % 4)];
                int i21 = i20 % 2 == 0 ? b10 & 15 : (b10 & 255) >> 4;
                int i22 = ((((i21 & 7) * 2) + 1) * i18) >> 3;
                if ((i21 & 8) != 0) {
                    i22 = -i22;
                }
                i17 = N.p(i17 + i22, -32768, 32767);
                i19 += i13 * 2;
                bArr2[i19] = (byte) (i17 & 255);
                bArr2[i19 + 1] = (byte) (i17 >> 8);
                int i23 = min + f56804m[i21];
                int[] iArr = f56805n;
                min = N.p(i23, 0, iArr.length - 1);
                i18 = iArr[min];
            }
        }

        private int f(int i10) {
            return i10 / (this.f56808c.f56827b * 2);
        }

        private int g(int i10) {
            return h(i10, this.f56808c.f56827b);
        }

        private static int h(int i10, int i11) {
            return i10 * 2 * i11;
        }

        private void i(int i10) {
            long Z02 = this.f56815j + N.Z0(this.f56817l, 1000000, (long) this.f56808c.f56828c);
            int g10 = g(i10);
            this.f56807b.c(Z02, 1, g10, this.f56816k - g10, (O.a) null);
            this.f56817l += (long) i10;
            this.f56816k -= g10;
        }

        public void a(int i10, long j10) {
            this.f56806a.n(new e(this.f56808c, this.f56809d, (long) i10, j10));
            this.f56807b.e(this.f56813h);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x003e A[EDGE_INSN: B:22:0x003e->B:10:0x003e ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x0020  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean b(N3.C6679q r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.f56812g
                int r1 = r6.f56816k
                int r1 = r6.f(r1)
                int r0 = r0 - r1
                int r1 = r6.f56809d
                int r0 = t3.N.k(r0, r1)
                u4.c r1 = r6.f56808c
                int r1 = r1.f56830e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L_0x001d
            L_0x001b:
                r1 = r2
                goto L_0x001e
            L_0x001d:
                r1 = 0
            L_0x001e:
                if (r1 != 0) goto L_0x003e
                int r3 = r6.f56814i
                if (r3 >= r0) goto L_0x003e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f56810e
                int r5 = r6.f56814i
                int r3 = r7.c(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L_0x0038
                goto L_0x001b
            L_0x0038:
                int r4 = r6.f56814i
                int r4 = r4 + r3
                r6.f56814i = r4
                goto L_0x001e
            L_0x003e:
                int r7 = r6.f56814i
                u4.c r8 = r6.f56808c
                int r8 = r8.f56830e
                int r7 = r7 / r8
                if (r7 <= 0) goto L_0x0075
                byte[] r8 = r6.f56810e
                t3.B r9 = r6.f56811f
                r6.d(r8, r7, r9)
                int r8 = r6.f56814i
                u4.c r9 = r6.f56808c
                int r9 = r9.f56830e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f56814i = r8
                t3.B r7 = r6.f56811f
                int r7 = r7.g()
                N3.O r8 = r6.f56807b
                t3.B r9 = r6.f56811f
                r8.a(r9, r7)
                int r8 = r6.f56816k
                int r8 = r8 + r7
                r6.f56816k = r8
                int r7 = r6.f(r8)
                int r8 = r6.f56812g
                if (r7 < r8) goto L_0x0075
                r6.i(r8)
            L_0x0075:
                if (r1 == 0) goto L_0x0082
                int r7 = r6.f56816k
                int r7 = r6.f(r7)
                if (r7 <= 0) goto L_0x0082
                r6.i(r7)
            L_0x0082:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: u4.b.a.b(N3.q, long):boolean");
        }

        public void c(long j10) {
            this.f56814i = 0;
            this.f56815j = j10;
            this.f56816k = 0;
            this.f56817l = 0;
        }
    }

    /* renamed from: u4.b$b  reason: collision with other inner class name */
    private interface C0912b {
        void a(int i10, long j10);

        boolean b(C6679q qVar, long j10);

        void c(long j10);
    }

    private static final class c implements C0912b {

        /* renamed from: a  reason: collision with root package name */
        private final r f56818a;

        /* renamed from: b  reason: collision with root package name */
        private final O f56819b;

        /* renamed from: c  reason: collision with root package name */
        private final c f56820c;

        /* renamed from: d  reason: collision with root package name */
        private final C5807s f56821d;

        /* renamed from: e  reason: collision with root package name */
        private final int f56822e;

        /* renamed from: f  reason: collision with root package name */
        private long f56823f;

        /* renamed from: g  reason: collision with root package name */
        private int f56824g;

        /* renamed from: h  reason: collision with root package name */
        private long f56825h;

        public c(r rVar, O o10, c cVar, String str, int i10) {
            this.f56818a = rVar;
            this.f56819b = o10;
            this.f56820c = cVar;
            int i11 = (cVar.f56827b * cVar.f56831f) / 8;
            if (cVar.f56830e == i11) {
                int i12 = cVar.f56828c;
                int i13 = i12 * i11 * 8;
                int max = Math.max(i11, (i12 * i11) / 10);
                this.f56822e = max;
                this.f56821d = new C5807s.b().s0(str).P(i13).n0(i13).j0(max).Q(cVar.f56827b).t0(cVar.f56828c).m0(i10).M();
                return;
            }
            throw q3.B.a("Expected block size: " + i11 + "; got: " + cVar.f56830e, (Throwable) null);
        }

        public void a(int i10, long j10) {
            this.f56818a.n(new e(this.f56820c, 1, (long) i10, j10));
            this.f56819b.e(this.f56821d);
        }

        public boolean b(C6679q qVar, long j10) {
            int i10;
            int i11;
            int i12;
            long j11 = j10;
            while (true) {
                i10 = (j11 > 0 ? 1 : (j11 == 0 ? 0 : -1));
                if (i10 <= 0 || (i11 = this.f56824g) >= (i12 = this.f56822e)) {
                    c cVar = this.f56820c;
                    int i13 = cVar.f56830e;
                    int i14 = this.f56824g / i13;
                } else {
                    int d10 = this.f56819b.d(qVar, (int) Math.min((long) (i12 - i11), j11), true);
                    if (d10 == -1) {
                        j11 = 0;
                    } else {
                        this.f56824g += d10;
                        j11 -= (long) d10;
                    }
                }
            }
            c cVar2 = this.f56820c;
            int i132 = cVar2.f56830e;
            int i142 = this.f56824g / i132;
            if (i142 > 0) {
                int i15 = i142 * i132;
                int i16 = this.f56824g - i15;
                this.f56819b.c(this.f56823f + N.Z0(this.f56825h, 1000000, (long) cVar2.f56828c), 1, i15, i16, (O.a) null);
                this.f56825h += (long) i142;
                this.f56824g = i16;
            }
            return i10 <= 0;
        }

        public void c(long j10) {
            this.f56823f = j10;
            this.f56824g = 0;
            this.f56825h = 0;
        }
    }

    private void e() {
        C5950a.i(this.f56798b);
        N.i(this.f56797a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C6678p[] f() {
        return new C6678p[]{new b()};
    }

    private void g(C6679q qVar) {
        C5950a.g(qVar.getPosition() == 0);
        int i10 = this.f56802f;
        if (i10 != -1) {
            qVar.k(i10);
            this.f56799c = 4;
        } else if (d.a(qVar)) {
            qVar.k((int) (qVar.h() - qVar.getPosition()));
            this.f56799c = 1;
        } else {
            throw q3.B.a("Unsupported or unrecognized wav file type.", (Throwable) null);
        }
    }

    private void k(C6679q qVar) {
        c b10 = d.b(qVar);
        int i10 = b10.f56826a;
        if (i10 == 17) {
            this.f56801e = new a(this.f56797a, this.f56798b, b10);
        } else if (i10 == 6) {
            this.f56801e = new c(this.f56797a, this.f56798b, b10, "audio/g711-alaw", -1);
        } else if (i10 == 7) {
            this.f56801e = new c(this.f56797a, this.f56798b, b10, "audio/g711-mlaw", -1);
        } else {
            int a10 = T.a(i10, b10.f56831f);
            if (a10 != 0) {
                this.f56801e = new c(this.f56797a, this.f56798b, b10, "audio/raw", a10);
            } else {
                throw q3.B.c("Unsupported WAV format type: " + b10.f56826a);
            }
        }
        this.f56799c = 3;
    }

    private void l(C6679q qVar) {
        this.f56800d = d.c(qVar);
        this.f56799c = 2;
    }

    private int m(C6679q qVar) {
        C5950a.g(this.f56803g != -1);
        return ((C0912b) C5950a.e(this.f56801e)).b(qVar, this.f56803g - qVar.getPosition()) ? -1 : 0;
    }

    private void n(C6679q qVar) {
        Pair<Long, Long> e10 = d.e(qVar);
        this.f56802f = ((Long) e10.first).intValue();
        long longValue = ((Long) e10.second).longValue();
        long j10 = this.f56800d;
        if (j10 != -1 && longValue == 4294967295L) {
            longValue = j10;
        }
        this.f56803g = ((long) this.f56802f) + longValue;
        long length = qVar.getLength();
        if (length != -1 && this.f56803g > length) {
            q.h("WavExtractor", "Data exceeds input length: " + this.f56803g + ", " + length);
            this.f56803g = length;
        }
        ((C0912b) C5950a.e(this.f56801e)).a(this.f56802f, this.f56803g);
        this.f56799c = 4;
    }

    public void a(long j10, long j11) {
        this.f56799c = j10 == 0 ? 0 : 4;
        C0912b bVar = this.f56801e;
        if (bVar != null) {
            bVar.c(j11);
        }
    }

    public void b(r rVar) {
        this.f56797a = rVar;
        this.f56798b = rVar.t(0, 1);
        rVar.r();
    }

    public boolean h(C6679q qVar) {
        return d.a(qVar);
    }

    public int j(C6679q qVar, I i10) {
        e();
        int i11 = this.f56799c;
        if (i11 == 0) {
            g(qVar);
            return 0;
        } else if (i11 == 1) {
            l(qVar);
            return 0;
        } else if (i11 == 2) {
            k(qVar);
            return 0;
        } else if (i11 == 3) {
            n(qVar);
            return 0;
        } else if (i11 == 4) {
            return m(qVar);
        } else {
            throw new IllegalStateException();
        }
    }

    public void release() {
    }
}
