package androidx.datastore.preferences.protobuf;

import androidx.recyclerview.widget.RecyclerView;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.h  reason: case insensitive filesystem */
public abstract class C5155h {

    /* renamed from: f  reason: collision with root package name */
    private static volatile int f21324f = 100;

    /* renamed from: a  reason: collision with root package name */
    int f21325a;

    /* renamed from: b  reason: collision with root package name */
    int f21326b;

    /* renamed from: c  reason: collision with root package name */
    int f21327c;

    /* renamed from: d  reason: collision with root package name */
    C5156i f21328d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f21329e;

    /* renamed from: androidx.datastore.preferences.protobuf.h$b */
    private static final class b extends C5155h {

        /* renamed from: g  reason: collision with root package name */
        private final byte[] f21330g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f21331h;

        /* renamed from: i  reason: collision with root package name */
        private int f21332i;

        /* renamed from: j  reason: collision with root package name */
        private int f21333j;

        /* renamed from: k  reason: collision with root package name */
        private int f21334k;

        /* renamed from: l  reason: collision with root package name */
        private int f21335l;

        /* renamed from: m  reason: collision with root package name */
        private int f21336m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f21337n;

        /* renamed from: o  reason: collision with root package name */
        private int f21338o;

        private void O() {
            int i10 = this.f21332i + this.f21333j;
            this.f21332i = i10;
            int i11 = i10 - this.f21335l;
            int i12 = this.f21338o;
            if (i11 > i12) {
                int i13 = i11 - i12;
                this.f21333j = i13;
                this.f21332i = i10 - i13;
                return;
            }
            this.f21333j = 0;
        }

        private void Q() {
            if (this.f21332i - this.f21334k >= 10) {
                R();
            } else {
                S();
            }
        }

        private void R() {
            int i10 = 0;
            while (i10 < 10) {
                byte[] bArr = this.f21330g;
                int i11 = this.f21334k;
                this.f21334k = i11 + 1;
                if (bArr[i11] < 0) {
                    i10++;
                } else {
                    return;
                }
            }
            throw A.f();
        }

        private void S() {
            int i10 = 0;
            while (i10 < 10) {
                if (H() < 0) {
                    i10++;
                } else {
                    return;
                }
            }
            throw A.f();
        }

        public String A() {
            int L10 = L();
            if (L10 > 0) {
                int i10 = this.f21332i;
                int i11 = this.f21334k;
                if (L10 <= i10 - i11) {
                    String str = new String(this.f21330g, i11, L10, C5172z.f21469b);
                    this.f21334k += L10;
                    return str;
                }
            }
            if (L10 == 0) {
                return "";
            }
            if (L10 < 0) {
                throw A.g();
            }
            throw A.m();
        }

        public String B() {
            int L10 = L();
            if (L10 > 0) {
                int i10 = this.f21332i;
                int i11 = this.f21334k;
                if (L10 <= i10 - i11) {
                    String a10 = s0.a(this.f21330g, i11, L10);
                    this.f21334k += L10;
                    return a10;
                }
            }
            if (L10 == 0) {
                return "";
            }
            if (L10 <= 0) {
                throw A.g();
            }
            throw A.m();
        }

        public int C() {
            if (f()) {
                this.f21336m = 0;
                return 0;
            }
            int L10 = L();
            this.f21336m = L10;
            if (t0.a(L10) != 0) {
                return this.f21336m;
            }
            throw A.c();
        }

        public int D() {
            return L();
        }

        public long E() {
            return M();
        }

        public boolean F(int i10) {
            int b10 = t0.b(i10);
            if (b10 == 0) {
                Q();
                return true;
            } else if (b10 == 1) {
                P(8);
                return true;
            } else if (b10 == 2) {
                P(L());
                return true;
            } else if (b10 == 3) {
                G();
                a(t0.c(t0.a(i10), 4));
                return true;
            } else if (b10 == 4) {
                return false;
            } else {
                if (b10 == 5) {
                    P(4);
                    return true;
                }
                throw A.e();
            }
        }

        public byte H() {
            int i10 = this.f21334k;
            if (i10 != this.f21332i) {
                byte[] bArr = this.f21330g;
                this.f21334k = i10 + 1;
                return bArr[i10];
            }
            throw A.m();
        }

        public byte[] I(int i10) {
            if (i10 > 0) {
                int i11 = this.f21332i;
                int i12 = this.f21334k;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f21334k = i13;
                    return Arrays.copyOfRange(this.f21330g, i12, i13);
                }
            }
            if (i10 > 0) {
                throw A.m();
            } else if (i10 == 0) {
                return C5172z.f21471d;
            } else {
                throw A.g();
            }
        }

        public int J() {
            int i10 = this.f21334k;
            if (this.f21332i - i10 >= 4) {
                byte[] bArr = this.f21330g;
                this.f21334k = i10 + 4;
                return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
            }
            throw A.m();
        }

        public long K() {
            int i10 = this.f21334k;
            if (this.f21332i - i10 >= 8) {
                byte[] bArr = this.f21330g;
                this.f21334k = i10 + 8;
                return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
            }
            throw A.m();
        }

        public int L() {
            byte b10;
            byte b11;
            int i10 = this.f21334k;
            int i11 = this.f21332i;
            if (i11 != i10) {
                byte[] bArr = this.f21330g;
                int i12 = i10 + 1;
                byte b12 = bArr[i10];
                if (b12 >= 0) {
                    this.f21334k = i12;
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
                    this.f21334k = i13;
                    return b10;
                }
            }
            return (int) N();
        }

        public long M() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f21334k;
            int i11 = this.f21332i;
            if (i11 != i10) {
                byte[] bArr = this.f21330g;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f21334k = i12;
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
                    this.f21334k = i13;
                    return j10;
                }
            }
            return N();
        }

        /* access modifiers changed from: package-private */
        public long N() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte H10 = H();
                j10 |= ((long) (H10 & Byte.MAX_VALUE)) << i10;
                if ((H10 & 128) == 0) {
                    return j10;
                }
            }
            throw A.f();
        }

        public void P(int i10) {
            if (i10 >= 0) {
                int i11 = this.f21332i;
                int i12 = this.f21334k;
                if (i10 <= i11 - i12) {
                    this.f21334k = i12 + i10;
                    return;
                }
            }
            if (i10 < 0) {
                throw A.g();
            }
            throw A.m();
        }

        public void a(int i10) {
            if (this.f21336m != i10) {
                throw A.b();
            }
        }

        public int e() {
            return this.f21334k - this.f21335l;
        }

        public boolean f() {
            return this.f21334k == this.f21332i;
        }

        public void l(int i10) {
            this.f21338o = i10;
            O();
        }

        public int m(int i10) {
            if (i10 >= 0) {
                int e10 = i10 + e();
                if (e10 >= 0) {
                    int i11 = this.f21338o;
                    if (e10 <= i11) {
                        this.f21338o = e10;
                        O();
                        return i11;
                    }
                    throw A.m();
                }
                throw A.h();
            }
            throw A.g();
        }

        public boolean n() {
            return M() != 0;
        }

        public C5154g o() {
            int L10 = L();
            if (L10 > 0) {
                int i10 = this.f21332i;
                int i11 = this.f21334k;
                if (L10 <= i10 - i11) {
                    C5154g p10 = (!this.f21331h || !this.f21337n) ? C5154g.p(this.f21330g, i11, L10) : C5154g.H(this.f21330g, i11, L10);
                    this.f21334k += L10;
                    return p10;
                }
            }
            return L10 == 0 ? C5154g.f21312b : C5154g.G(I(L10));
        }

        public double p() {
            return Double.longBitsToDouble(K());
        }

        public int q() {
            return L();
        }

        public int r() {
            return J();
        }

        public long s() {
            return K();
        }

        public float t() {
            return Float.intBitsToFloat(J());
        }

        public int u() {
            return L();
        }

        public long v() {
            return M();
        }

        public int w() {
            return J();
        }

        public long x() {
            return K();
        }

        public int y() {
            return C5155h.c(L());
        }

        public long z() {
            return C5155h.d(M());
        }

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f21338o = Integer.MAX_VALUE;
            this.f21330g = bArr;
            this.f21332i = i11 + i10;
            this.f21334k = i10;
            this.f21335l = i10;
            this.f21331h = z10;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.h$c */
    private static final class c extends C5155h {

        /* renamed from: g  reason: collision with root package name */
        private final InputStream f21339g;

        /* renamed from: h  reason: collision with root package name */
        private final byte[] f21340h;

        /* renamed from: i  reason: collision with root package name */
        private int f21341i;

        /* renamed from: j  reason: collision with root package name */
        private int f21342j;

        /* renamed from: k  reason: collision with root package name */
        private int f21343k;

        /* renamed from: l  reason: collision with root package name */
        private int f21344l;

        /* renamed from: m  reason: collision with root package name */
        private int f21345m;

        /* renamed from: n  reason: collision with root package name */
        private int f21346n;

        private static int H(InputStream inputStream) {
            try {
                return inputStream.available();
            } catch (A e10) {
                e10.j();
                throw e10;
            }
        }

        private static int I(InputStream inputStream, byte[] bArr, int i10, int i11) {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (A e10) {
                e10.j();
                throw e10;
            }
        }

        private C5154g J(int i10) {
            byte[] M10 = M(i10);
            if (M10 != null) {
                return C5154g.m(M10);
            }
            int i11 = this.f21343k;
            int i12 = this.f21341i;
            int i13 = i12 - i11;
            this.f21345m += i12;
            this.f21343k = 0;
            this.f21341i = 0;
            List<byte[]> N10 = N(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f21340h, i11, bArr, 0, i13);
            for (byte[] next : N10) {
                System.arraycopy(next, 0, bArr, i13, next.length);
                i13 += next.length;
            }
            return C5154g.G(bArr);
        }

        private byte[] L(int i10, boolean z10) {
            byte[] M10 = M(i10);
            if (M10 != null) {
                return z10 ? (byte[]) M10.clone() : M10;
            }
            int i11 = this.f21343k;
            int i12 = this.f21341i;
            int i13 = i12 - i11;
            this.f21345m += i12;
            this.f21343k = 0;
            this.f21341i = 0;
            List<byte[]> N10 = N(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f21340h, i11, bArr, 0, i13);
            for (byte[] next : N10) {
                System.arraycopy(next, 0, bArr, i13, next.length);
                i13 += next.length;
            }
            return bArr;
        }

        private byte[] M(int i10) {
            if (i10 == 0) {
                return C5172z.f21471d;
            }
            if (i10 >= 0) {
                int i11 = this.f21345m;
                int i12 = this.f21343k;
                int i13 = i11 + i12 + i10;
                if (i13 - this.f21327c <= 0) {
                    int i14 = this.f21346n;
                    if (i13 <= i14) {
                        int i15 = this.f21341i - i12;
                        int i16 = i10 - i15;
                        if (i16 >= 4096 && i16 > H(this.f21339g)) {
                            return null;
                        }
                        byte[] bArr = new byte[i10];
                        System.arraycopy(this.f21340h, this.f21343k, bArr, 0, i15);
                        this.f21345m += this.f21341i;
                        this.f21343k = 0;
                        this.f21341i = 0;
                        while (i15 < i10) {
                            int I10 = I(this.f21339g, bArr, i15, i10 - i15);
                            if (I10 != -1) {
                                this.f21345m += I10;
                                i15 += I10;
                            } else {
                                throw A.m();
                            }
                        }
                        return bArr;
                    }
                    W((i14 - i11) - i12);
                    throw A.m();
                }
                throw A.l();
            }
            throw A.g();
        }

        private List<byte[]> N(int i10) {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int min = Math.min(i10, RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT);
                byte[] bArr = new byte[min];
                int i11 = 0;
                while (i11 < min) {
                    int read = this.f21339g.read(bArr, i11, min - i11);
                    if (read != -1) {
                        this.f21345m += read;
                        i11 += read;
                    } else {
                        throw A.m();
                    }
                }
                i10 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void T() {
            int i10 = this.f21341i + this.f21342j;
            this.f21341i = i10;
            int i11 = this.f21345m + i10;
            int i12 = this.f21346n;
            if (i11 > i12) {
                int i13 = i11 - i12;
                this.f21342j = i13;
                this.f21341i = i10 - i13;
                return;
            }
            this.f21342j = 0;
        }

        private void U(int i10) {
            if (b0(i10)) {
                return;
            }
            if (i10 > (this.f21327c - this.f21345m) - this.f21343k) {
                throw A.l();
            }
            throw A.m();
        }

        private static long V(InputStream inputStream, long j10) {
            try {
                return inputStream.skip(j10);
            } catch (A e10) {
                e10.j();
                throw e10;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
            throw new java.lang.IllegalStateException(r7.f21339g.getClass() + "#skip returned invalid result: " + r1 + "\nThe InputStream implementation is buggy.");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void X(int r8) {
            /*
                r7 = this;
                if (r8 < 0) goto L_0x0092
                int r0 = r7.f21345m
                int r1 = r7.f21343k
                int r2 = r0 + r1
                int r2 = r2 + r8
                int r3 = r7.f21346n
                if (r2 > r3) goto L_0x0088
                int r0 = r0 + r1
                r7.f21345m = r0
                int r0 = r7.f21341i
                int r0 = r0 - r1
                r1 = 0
                r7.f21341i = r1
                r7.f21343k = r1
            L_0x0018:
                if (r0 >= r8) goto L_0x0062
                int r1 = r8 - r0
                java.io.InputStream r2 = r7.f21339g     // Catch:{ all -> 0x0058 }
                long r3 = (long) r1     // Catch:{ all -> 0x0058 }
                long r1 = V(r2, r3)     // Catch:{ all -> 0x0058 }
                r5 = 0
                int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r5 < 0) goto L_0x0033
                int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r3 > 0) goto L_0x0033
                if (r5 != 0) goto L_0x0030
                goto L_0x0062
            L_0x0030:
                int r1 = (int) r1     // Catch:{ all -> 0x0058 }
                int r0 = r0 + r1
                goto L_0x0018
            L_0x0033:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0058 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0058 }
                r3.<init>()     // Catch:{ all -> 0x0058 }
                java.io.InputStream r4 = r7.f21339g     // Catch:{ all -> 0x0058 }
                java.lang.Class r4 = r4.getClass()     // Catch:{ all -> 0x0058 }
                r3.append(r4)     // Catch:{ all -> 0x0058 }
                java.lang.String r4 = "#skip returned invalid result: "
                r3.append(r4)     // Catch:{ all -> 0x0058 }
                r3.append(r1)     // Catch:{ all -> 0x0058 }
                java.lang.String r1 = "\nThe InputStream implementation is buggy."
                r3.append(r1)     // Catch:{ all -> 0x0058 }
                java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0058 }
                r8.<init>(r1)     // Catch:{ all -> 0x0058 }
                throw r8     // Catch:{ all -> 0x0058 }
            L_0x0058:
                r8 = move-exception
                int r1 = r7.f21345m
                int r1 = r1 + r0
                r7.f21345m = r1
                r7.T()
                throw r8
            L_0x0062:
                int r1 = r7.f21345m
                int r1 = r1 + r0
                r7.f21345m = r1
                r7.T()
                if (r0 >= r8) goto L_0x0087
                int r0 = r7.f21341i
                int r1 = r7.f21343k
                int r1 = r0 - r1
                r7.f21343k = r0
                r0 = 1
                r7.U(r0)
            L_0x0078:
                int r2 = r8 - r1
                int r3 = r7.f21341i
                if (r2 <= r3) goto L_0x0085
                int r1 = r1 + r3
                r7.f21343k = r3
                r7.U(r0)
                goto L_0x0078
            L_0x0085:
                r7.f21343k = r2
            L_0x0087:
                return
            L_0x0088:
                int r3 = r3 - r0
                int r3 = r3 - r1
                r7.W(r3)
                androidx.datastore.preferences.protobuf.A r8 = androidx.datastore.preferences.protobuf.A.m()
                throw r8
            L_0x0092:
                androidx.datastore.preferences.protobuf.A r8 = androidx.datastore.preferences.protobuf.A.g()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C5155h.c.X(int):void");
        }

        private void Y() {
            if (this.f21341i - this.f21343k >= 10) {
                Z();
            } else {
                a0();
            }
        }

        private void Z() {
            int i10 = 0;
            while (i10 < 10) {
                byte[] bArr = this.f21340h;
                int i11 = this.f21343k;
                this.f21343k = i11 + 1;
                if (bArr[i11] < 0) {
                    i10++;
                } else {
                    return;
                }
            }
            throw A.f();
        }

        private void a0() {
            int i10 = 0;
            while (i10 < 10) {
                if (K() < 0) {
                    i10++;
                } else {
                    return;
                }
            }
            throw A.f();
        }

        private boolean b0(int i10) {
            int i11 = this.f21343k;
            int i12 = i11 + i10;
            int i13 = this.f21341i;
            if (i12 > i13) {
                int i14 = this.f21327c;
                int i15 = this.f21345m;
                if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f21346n) {
                    return false;
                }
                if (i11 > 0) {
                    if (i13 > i11) {
                        byte[] bArr = this.f21340h;
                        System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                    }
                    this.f21345m += i11;
                    this.f21341i -= i11;
                    this.f21343k = 0;
                }
                InputStream inputStream = this.f21339g;
                byte[] bArr2 = this.f21340h;
                int i16 = this.f21341i;
                int I10 = I(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.f21327c - this.f21345m) - i16));
                if (I10 == 0 || I10 < -1 || I10 > this.f21340h.length) {
                    throw new IllegalStateException(this.f21339g.getClass() + "#read(byte[]) returned invalid result: " + I10 + "\nThe InputStream implementation is buggy.");
                } else if (I10 <= 0) {
                    return false;
                } else {
                    this.f21341i += I10;
                    T();
                    if (this.f21341i >= i10) {
                        return true;
                    }
                    return b0(i10);
                }
            } else {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
        }

        public String A() {
            int Q10 = Q();
            if (Q10 > 0) {
                int i10 = this.f21341i;
                int i11 = this.f21343k;
                if (Q10 <= i10 - i11) {
                    String str = new String(this.f21340h, i11, Q10, C5172z.f21469b);
                    this.f21343k += Q10;
                    return str;
                }
            }
            if (Q10 == 0) {
                return "";
            }
            if (Q10 < 0) {
                throw A.g();
            } else if (Q10 > this.f21341i) {
                return new String(L(Q10, false), C5172z.f21469b);
            } else {
                U(Q10);
                String str2 = new String(this.f21340h, this.f21343k, Q10, C5172z.f21469b);
                this.f21343k += Q10;
                return str2;
            }
        }

        public String B() {
            byte[] bArr;
            int Q10 = Q();
            int i10 = this.f21343k;
            int i11 = this.f21341i;
            if (Q10 <= i11 - i10 && Q10 > 0) {
                bArr = this.f21340h;
                this.f21343k = i10 + Q10;
            } else if (Q10 == 0) {
                return "";
            } else {
                if (Q10 >= 0) {
                    i10 = 0;
                    if (Q10 <= i11) {
                        U(Q10);
                        bArr = this.f21340h;
                        this.f21343k = Q10;
                    } else {
                        bArr = L(Q10, false);
                    }
                } else {
                    throw A.g();
                }
            }
            return s0.a(bArr, i10, Q10);
        }

        public int C() {
            if (f()) {
                this.f21344l = 0;
                return 0;
            }
            int Q10 = Q();
            this.f21344l = Q10;
            if (t0.a(Q10) != 0) {
                return this.f21344l;
            }
            throw A.c();
        }

        public int D() {
            return Q();
        }

        public long E() {
            return R();
        }

        public boolean F(int i10) {
            int b10 = t0.b(i10);
            if (b10 == 0) {
                Y();
                return true;
            } else if (b10 == 1) {
                W(8);
                return true;
            } else if (b10 == 2) {
                W(Q());
                return true;
            } else if (b10 == 3) {
                G();
                a(t0.c(t0.a(i10), 4));
                return true;
            } else if (b10 == 4) {
                return false;
            } else {
                if (b10 == 5) {
                    W(4);
                    return true;
                }
                throw A.e();
            }
        }

        public byte K() {
            if (this.f21343k == this.f21341i) {
                U(1);
            }
            byte[] bArr = this.f21340h;
            int i10 = this.f21343k;
            this.f21343k = i10 + 1;
            return bArr[i10];
        }

        public int O() {
            int i10 = this.f21343k;
            if (this.f21341i - i10 < 4) {
                U(4);
                i10 = this.f21343k;
            }
            byte[] bArr = this.f21340h;
            this.f21343k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long P() {
            int i10 = this.f21343k;
            if (this.f21341i - i10 < 8) {
                U(8);
                i10 = this.f21343k;
            }
            byte[] bArr = this.f21340h;
            this.f21343k = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public int Q() {
            byte b10;
            byte b11;
            int i10 = this.f21343k;
            int i11 = this.f21341i;
            if (i11 != i10) {
                byte[] bArr = this.f21340h;
                int i12 = i10 + 1;
                byte b12 = bArr[i10];
                if (b12 >= 0) {
                    this.f21343k = i12;
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
                    this.f21343k = i13;
                    return b10;
                }
            }
            return (int) S();
        }

        public long R() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f21343k;
            int i11 = this.f21341i;
            if (i11 != i10) {
                byte[] bArr = this.f21340h;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f21343k = i12;
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
                    this.f21343k = i13;
                    return j10;
                }
            }
            return S();
        }

        /* access modifiers changed from: package-private */
        public long S() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte K10 = K();
                j10 |= ((long) (K10 & Byte.MAX_VALUE)) << i10;
                if ((K10 & 128) == 0) {
                    return j10;
                }
            }
            throw A.f();
        }

        public void W(int i10) {
            int i11 = this.f21341i;
            int i12 = this.f21343k;
            if (i10 > i11 - i12 || i10 < 0) {
                X(i10);
            } else {
                this.f21343k = i12 + i10;
            }
        }

        public void a(int i10) {
            if (this.f21344l != i10) {
                throw A.b();
            }
        }

        public int e() {
            return this.f21345m + this.f21343k;
        }

        public boolean f() {
            return this.f21343k == this.f21341i && !b0(1);
        }

        public void l(int i10) {
            this.f21346n = i10;
            T();
        }

        public int m(int i10) {
            if (i10 >= 0) {
                int i11 = i10 + this.f21345m + this.f21343k;
                if (i11 >= 0) {
                    int i12 = this.f21346n;
                    if (i11 <= i12) {
                        this.f21346n = i11;
                        T();
                        return i12;
                    }
                    throw A.m();
                }
                throw A.h();
            }
            throw A.g();
        }

        public boolean n() {
            return R() != 0;
        }

        public C5154g o() {
            int Q10 = Q();
            int i10 = this.f21341i;
            int i11 = this.f21343k;
            if (Q10 <= i10 - i11 && Q10 > 0) {
                C5154g p10 = C5154g.p(this.f21340h, i11, Q10);
                this.f21343k += Q10;
                return p10;
            } else if (Q10 == 0) {
                return C5154g.f21312b;
            } else {
                if (Q10 >= 0) {
                    return J(Q10);
                }
                throw A.g();
            }
        }

        public double p() {
            return Double.longBitsToDouble(P());
        }

        public int q() {
            return Q();
        }

        public int r() {
            return O();
        }

        public long s() {
            return P();
        }

        public float t() {
            return Float.intBitsToFloat(O());
        }

        public int u() {
            return Q();
        }

        public long v() {
            return R();
        }

        public int w() {
            return O();
        }

        public long x() {
            return P();
        }

        public int y() {
            return C5155h.c(Q());
        }

        public long z() {
            return C5155h.d(R());
        }

        private c(InputStream inputStream, int i10) {
            super();
            this.f21346n = Integer.MAX_VALUE;
            C5172z.b(inputStream, "input");
            this.f21339g = inputStream;
            this.f21340h = new byte[i10];
            this.f21341i = 0;
            this.f21343k = 0;
            this.f21345m = 0;
        }
    }

    public static int c(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long d(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static C5155h g(InputStream inputStream) {
        return h(inputStream, RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT);
    }

    public static C5155h h(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? i(C5172z.f21471d) : new c(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static C5155h i(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static C5155h j(byte[] bArr, int i10, int i11) {
        return k(bArr, i10, i11, false);
    }

    static C5155h k(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.m(i11);
            return bVar;
        } catch (A e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract String A();

    public abstract String B();

    public abstract int C();

    public abstract int D();

    public abstract long E();

    public abstract boolean F(int i10);

    public void G() {
        int C10;
        do {
            C10 = C();
            if (C10 != 0) {
                b();
                this.f21325a++;
                this.f21325a--;
            } else {
                return;
            }
        } while (F(C10));
    }

    public abstract void a(int i10);

    public void b() {
        if (this.f21325a >= this.f21326b) {
            throw A.i();
        }
    }

    public abstract int e();

    public abstract boolean f();

    public abstract void l(int i10);

    public abstract int m(int i10);

    public abstract boolean n();

    public abstract C5154g o();

    public abstract double p();

    public abstract int q();

    public abstract int r();

    public abstract long s();

    public abstract float t();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract int y();

    public abstract long z();

    private C5155h() {
        this.f21326b = f21324f;
        this.f21327c = Integer.MAX_VALUE;
        this.f21329e = false;
    }
}
