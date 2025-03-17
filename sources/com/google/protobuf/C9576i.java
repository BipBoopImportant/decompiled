package com.google.protobuf;

import java.util.Arrays;

/* renamed from: com.google.protobuf.i  reason: case insensitive filesystem */
public abstract class C9576i {

    /* renamed from: f  reason: collision with root package name */
    private static volatile int f69298f = 100;

    /* renamed from: a  reason: collision with root package name */
    int f69299a;

    /* renamed from: b  reason: collision with root package name */
    int f69300b;

    /* renamed from: c  reason: collision with root package name */
    int f69301c;

    /* renamed from: d  reason: collision with root package name */
    C9577j f69302d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f69303e;

    /* renamed from: com.google.protobuf.i$b */
    private static final class b extends C9576i {

        /* renamed from: g  reason: collision with root package name */
        private final byte[] f69304g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f69305h;

        /* renamed from: i  reason: collision with root package name */
        private int f69306i;

        /* renamed from: j  reason: collision with root package name */
        private int f69307j;

        /* renamed from: k  reason: collision with root package name */
        private int f69308k;

        /* renamed from: l  reason: collision with root package name */
        private int f69309l;

        /* renamed from: m  reason: collision with root package name */
        private int f69310m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f69311n;

        /* renamed from: o  reason: collision with root package name */
        private int f69312o;

        private void K() {
            int i10 = this.f69306i + this.f69307j;
            this.f69306i = i10;
            int i11 = i10 - this.f69309l;
            int i12 = this.f69312o;
            if (i11 > i12) {
                int i13 = i11 - i12;
                this.f69307j = i13;
                this.f69306i = i10 - i13;
                return;
            }
            this.f69307j = 0;
        }

        private void N() {
            if (this.f69306i - this.f69308k >= 10) {
                O();
            } else {
                P();
            }
        }

        private void O() {
            int i10 = 0;
            while (i10 < 10) {
                byte[] bArr = this.f69304g;
                int i11 = this.f69308k;
                this.f69308k = i11 + 1;
                if (bArr[i11] < 0) {
                    i10++;
                } else {
                    return;
                }
            }
            throw B.f();
        }

        private void P() {
            int i10 = 0;
            while (i10 < 10) {
                if (D() < 0) {
                    i10++;
                } else {
                    return;
                }
            }
            throw B.f();
        }

        public int A() {
            return H();
        }

        public long B() {
            return I();
        }

        public boolean C(int i10) {
            int b10 = u0.b(i10);
            if (b10 == 0) {
                N();
                return true;
            } else if (b10 == 1) {
                M(8);
                return true;
            } else if (b10 == 2) {
                M(H());
                return true;
            } else if (b10 == 3) {
                L();
                a(u0.c(u0.a(i10), 4));
                return true;
            } else if (b10 == 4) {
                return false;
            } else {
                if (b10 == 5) {
                    M(4);
                    return true;
                }
                throw B.e();
            }
        }

        public byte D() {
            int i10 = this.f69308k;
            if (i10 != this.f69306i) {
                byte[] bArr = this.f69304g;
                this.f69308k = i10 + 1;
                return bArr[i10];
            }
            throw B.k();
        }

        public byte[] E(int i10) {
            if (i10 > 0) {
                int i11 = this.f69306i;
                int i12 = this.f69308k;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f69308k = i13;
                    return Arrays.copyOfRange(this.f69304g, i12, i13);
                }
            }
            if (i10 > 0) {
                throw B.k();
            } else if (i10 == 0) {
                return C9592z.f69432d;
            } else {
                throw B.g();
            }
        }

        public int F() {
            int i10 = this.f69308k;
            if (this.f69306i - i10 >= 4) {
                byte[] bArr = this.f69304g;
                this.f69308k = i10 + 4;
                return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
            }
            throw B.k();
        }

        public long G() {
            int i10 = this.f69308k;
            if (this.f69306i - i10 >= 8) {
                byte[] bArr = this.f69304g;
                this.f69308k = i10 + 8;
                return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
            }
            throw B.k();
        }

        public int H() {
            byte b10;
            byte b11;
            int i10 = this.f69308k;
            int i11 = this.f69306i;
            if (i11 != i10) {
                byte[] bArr = this.f69304g;
                int i12 = i10 + 1;
                byte b12 = bArr[i10];
                if (b12 >= 0) {
                    this.f69308k = i12;
                    return b12;
                } else if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    byte b13 = (bArr[i12] << 7) ^ b12;
                    if (b13 < 0) {
                        b10 = b13 ^ Byte.MIN_VALUE;
                    } else {
                        int i14 = i10 + 3;
                        byte b14 = (bArr[i13] << 14) ^ b13;
                        if (b14 >= 0) {
                            b11 = b14 ^ 16256;
                        } else {
                            int i15 = i10 + 4;
                            byte b15 = b14 ^ (bArr[i14] << 21);
                            if (b15 < 0) {
                                b10 = -2080896 ^ b15;
                            } else {
                                i14 = i10 + 5;
                                byte b16 = bArr[i15];
                                byte b17 = (b15 ^ (b16 << 28)) ^ 266354560;
                                if (b16 < 0) {
                                    i15 = i10 + 6;
                                    if (bArr[i14] < 0) {
                                        i14 = i10 + 7;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 8;
                                            if (bArr[i14] < 0) {
                                                i14 = i10 + 9;
                                                if (bArr[i15] < 0) {
                                                    int i16 = i10 + 10;
                                                    if (bArr[i14] >= 0) {
                                                        byte b18 = b17;
                                                        i13 = i16;
                                                        b10 = b18;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    b10 = b17;
                                }
                                b11 = b17;
                            }
                            i13 = i15;
                        }
                        i13 = i14;
                    }
                    this.f69308k = i13;
                    return b10;
                }
            }
            return (int) J();
        }

        public long I() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f69308k;
            int i11 = this.f69306i;
            if (i11 != i10) {
                byte[] bArr = this.f69304g;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f69308k = i12;
                    return (long) b10;
                } else if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    byte b11 = (bArr[i12] << 7) ^ b10;
                    if (b11 < 0) {
                        j10 = (long) (b11 ^ Byte.MIN_VALUE);
                    } else {
                        int i14 = i10 + 3;
                        byte b12 = (bArr[i13] << 14) ^ b11;
                        if (b12 >= 0) {
                            j10 = (long) (b12 ^ 16256);
                            i13 = i14;
                        } else {
                            int i15 = i10 + 4;
                            byte b13 = b12 ^ (bArr[i14] << 21);
                            if (b13 < 0) {
                                i13 = i15;
                                j10 = (long) (-2080896 ^ b13);
                            } else {
                                long j13 = (long) b13;
                                int i16 = i10 + 5;
                                long j14 = j13 ^ (((long) bArr[i15]) << 28);
                                if (j14 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    int i17 = i10 + 6;
                                    long j15 = j14 ^ (((long) bArr[i16]) << 35);
                                    if (j15 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i16 = i10 + 7;
                                        j14 = j15 ^ (((long) bArr[i17]) << 42);
                                        if (j14 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i17 = i10 + 8;
                                            j15 = j14 ^ (((long) bArr[i16]) << 49);
                                            if (j15 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j16 = (j15 ^ (((long) bArr[i17]) << 56)) ^ 71499008037633920L;
                                                if (j16 < 0) {
                                                    int i18 = i10 + 10;
                                                    if (((long) bArr[i13]) >= 0) {
                                                        i13 = i18;
                                                    }
                                                }
                                                j10 = j16;
                                            }
                                        }
                                    }
                                    j10 = j15 ^ j11;
                                    i13 = i17;
                                }
                                j10 = j14 ^ j12;
                            }
                        }
                    }
                    this.f69308k = i13;
                    return j10;
                }
            }
            return J();
        }

        /* access modifiers changed from: package-private */
        public long J() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte D10 = D();
                j10 |= ((long) (D10 & Byte.MAX_VALUE)) << i10;
                if ((D10 & 128) == 0) {
                    return j10;
                }
            }
            throw B.f();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public void L() {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.z()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.C(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C9576i.b.L():void");
        }

        public void M(int i10) {
            if (i10 >= 0) {
                int i11 = this.f69306i;
                int i12 = this.f69308k;
                if (i10 <= i11 - i12) {
                    this.f69308k = i12 + i10;
                    return;
                }
            }
            if (i10 < 0) {
                throw B.g();
            }
            throw B.k();
        }

        public void a(int i10) {
            if (this.f69310m != i10) {
                throw B.b();
            }
        }

        public int d() {
            return this.f69308k - this.f69309l;
        }

        public boolean e() {
            return this.f69308k == this.f69306i;
        }

        public void i(int i10) {
            this.f69312o = i10;
            K();
        }

        public int j(int i10) {
            if (i10 >= 0) {
                int d10 = i10 + d();
                if (d10 >= 0) {
                    int i11 = this.f69312o;
                    if (d10 <= i11) {
                        this.f69312o = d10;
                        K();
                        return i11;
                    }
                    throw B.k();
                }
                throw B.h();
            }
            throw B.g();
        }

        public boolean k() {
            return I() != 0;
        }

        public C9575h l() {
            int H10 = H();
            if (H10 > 0) {
                int i10 = this.f69306i;
                int i11 = this.f69308k;
                if (H10 <= i10 - i11) {
                    C9575h p10 = (!this.f69305h || !this.f69311n) ? C9575h.p(this.f69304g, i11, H10) : C9575h.J(this.f69304g, i11, H10);
                    this.f69308k += H10;
                    return p10;
                }
            }
            return H10 == 0 ? C9575h.f69286b : C9575h.I(E(H10));
        }

        public double m() {
            return Double.longBitsToDouble(G());
        }

        public int n() {
            return H();
        }

        public int o() {
            return F();
        }

        public long p() {
            return G();
        }

        public float q() {
            return Float.intBitsToFloat(F());
        }

        public int r() {
            return H();
        }

        public long s() {
            return I();
        }

        public int t() {
            return F();
        }

        public long u() {
            return G();
        }

        public int v() {
            return C9576i.b(H());
        }

        public long w() {
            return C9576i.c(I());
        }

        public String x() {
            int H10 = H();
            if (H10 > 0) {
                int i10 = this.f69306i;
                int i11 = this.f69308k;
                if (H10 <= i10 - i11) {
                    String str = new String(this.f69304g, i11, H10, C9592z.f69430b);
                    this.f69308k += H10;
                    return str;
                }
            }
            if (H10 == 0) {
                return "";
            }
            if (H10 < 0) {
                throw B.g();
            }
            throw B.k();
        }

        public String y() {
            int H10 = H();
            if (H10 > 0) {
                int i10 = this.f69306i;
                int i11 = this.f69308k;
                if (H10 <= i10 - i11) {
                    String e10 = t0.e(this.f69304g, i11, H10);
                    this.f69308k += H10;
                    return e10;
                }
            }
            if (H10 == 0) {
                return "";
            }
            if (H10 <= 0) {
                throw B.g();
            }
            throw B.k();
        }

        public int z() {
            if (e()) {
                this.f69310m = 0;
                return 0;
            }
            int H10 = H();
            this.f69310m = H10;
            if (u0.a(H10) != 0) {
                return this.f69310m;
            }
            throw B.c();
        }

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f69312o = Integer.MAX_VALUE;
            this.f69304g = bArr;
            this.f69306i = i11 + i10;
            this.f69308k = i10;
            this.f69309l = i10;
            this.f69305h = z10;
        }
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static C9576i f(byte[] bArr) {
        return g(bArr, 0, bArr.length);
    }

    public static C9576i g(byte[] bArr, int i10, int i11) {
        return h(bArr, i10, i11, false);
    }

    static C9576i h(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.j(i11);
            return bVar;
        } catch (B e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract int A();

    public abstract long B();

    public abstract boolean C(int i10);

    public abstract void a(int i10);

    public abstract int d();

    public abstract boolean e();

    public abstract void i(int i10);

    public abstract int j(int i10);

    public abstract boolean k();

    public abstract C9575h l();

    public abstract double m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract float q();

    public abstract int r();

    public abstract long s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract String x();

    public abstract String y();

    public abstract int z();

    private C9576i() {
        this.f69300b = f69298f;
        this.f69301c = Integer.MAX_VALUE;
        this.f69303e = false;
    }
}
