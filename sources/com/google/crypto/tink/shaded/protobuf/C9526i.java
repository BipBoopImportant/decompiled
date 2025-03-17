package com.google.crypto.tink.shaded.protobuf;

import androidx.recyclerview.widget.RecyclerView;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.crypto.tink.shaded.protobuf.i  reason: case insensitive filesystem */
public abstract class C9526i {

    /* renamed from: f  reason: collision with root package name */
    private static volatile int f67999f = 100;

    /* renamed from: a  reason: collision with root package name */
    int f68000a;

    /* renamed from: b  reason: collision with root package name */
    int f68001b;

    /* renamed from: c  reason: collision with root package name */
    int f68002c;

    /* renamed from: d  reason: collision with root package name */
    C9527j f68003d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f68004e;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$b */
    private static final class b extends C9526i {

        /* renamed from: g  reason: collision with root package name */
        private final byte[] f68005g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f68006h;

        /* renamed from: i  reason: collision with root package name */
        private int f68007i;

        /* renamed from: j  reason: collision with root package name */
        private int f68008j;

        /* renamed from: k  reason: collision with root package name */
        private int f68009k;

        /* renamed from: l  reason: collision with root package name */
        private int f68010l;

        /* renamed from: m  reason: collision with root package name */
        private int f68011m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f68012n;

        /* renamed from: o  reason: collision with root package name */
        private int f68013o;

        private void M() {
            int i10 = this.f68007i + this.f68008j;
            this.f68007i = i10;
            int i11 = i10 - this.f68010l;
            int i12 = this.f68013o;
            if (i11 > i12) {
                int i13 = i11 - i12;
                this.f68008j = i13;
                this.f68007i = i10 - i13;
                return;
            }
            this.f68008j = 0;
        }

        private void P() {
            if (this.f68007i - this.f68009k >= 10) {
                Q();
            } else {
                R();
            }
        }

        private void Q() {
            int i10 = 0;
            while (i10 < 10) {
                byte[] bArr = this.f68005g;
                int i11 = this.f68009k;
                this.f68009k = i11 + 1;
                if (bArr[i11] < 0) {
                    i10++;
                } else {
                    return;
                }
            }
            throw B.f();
        }

        private void R() {
            int i10 = 0;
            while (i10 < 10) {
                if (F() < 0) {
                    i10++;
                } else {
                    return;
                }
            }
            throw B.f();
        }

        public String A() {
            int J10 = J();
            if (J10 > 0) {
                int i10 = this.f68007i;
                int i11 = this.f68009k;
                if (J10 <= i10 - i11) {
                    String e10 = t0.e(this.f68005g, i11, J10);
                    this.f68009k += J10;
                    return e10;
                }
            }
            if (J10 == 0) {
                return "";
            }
            if (J10 <= 0) {
                throw B.g();
            }
            throw B.m();
        }

        public int B() {
            if (e()) {
                this.f68011m = 0;
                return 0;
            }
            int J10 = J();
            this.f68011m = J10;
            if (u0.a(J10) != 0) {
                return this.f68011m;
            }
            throw B.c();
        }

        public int C() {
            return J();
        }

        public long D() {
            return K();
        }

        public boolean E(int i10) {
            int b10 = u0.b(i10);
            if (b10 == 0) {
                P();
                return true;
            } else if (b10 == 1) {
                O(8);
                return true;
            } else if (b10 == 2) {
                O(J());
                return true;
            } else if (b10 == 3) {
                N();
                a(u0.c(u0.a(i10), 4));
                return true;
            } else if (b10 == 4) {
                return false;
            } else {
                if (b10 == 5) {
                    O(4);
                    return true;
                }
                throw B.e();
            }
        }

        public byte F() {
            int i10 = this.f68009k;
            if (i10 != this.f68007i) {
                byte[] bArr = this.f68005g;
                this.f68009k = i10 + 1;
                return bArr[i10];
            }
            throw B.m();
        }

        public byte[] G(int i10) {
            if (i10 > 0) {
                int i11 = this.f68007i;
                int i12 = this.f68009k;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f68009k = i13;
                    return Arrays.copyOfRange(this.f68005g, i12, i13);
                }
            }
            if (i10 > 0) {
                throw B.m();
            } else if (i10 == 0) {
                return A.f67909d;
            } else {
                throw B.g();
            }
        }

        public int H() {
            int i10 = this.f68009k;
            if (this.f68007i - i10 >= 4) {
                byte[] bArr = this.f68005g;
                this.f68009k = i10 + 4;
                return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
            }
            throw B.m();
        }

        public long I() {
            int i10 = this.f68009k;
            if (this.f68007i - i10 >= 8) {
                byte[] bArr = this.f68005g;
                this.f68009k = i10 + 8;
                return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
            }
            throw B.m();
        }

        public int J() {
            byte b10;
            byte b11;
            int i10 = this.f68009k;
            int i11 = this.f68007i;
            if (i11 != i10) {
                byte[] bArr = this.f68005g;
                int i12 = i10 + 1;
                byte b12 = bArr[i10];
                if (b12 >= 0) {
                    this.f68009k = i12;
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
                    this.f68009k = i13;
                    return b10;
                }
            }
            return (int) L();
        }

        public long K() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f68009k;
            int i11 = this.f68007i;
            if (i11 != i10) {
                byte[] bArr = this.f68005g;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f68009k = i12;
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
                    this.f68009k = i13;
                    return j10;
                }
            }
            return L();
        }

        /* access modifiers changed from: package-private */
        public long L() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte F10 = F();
                j10 |= ((long) (F10 & Byte.MAX_VALUE)) << i10;
                if ((F10 & 128) == 0) {
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
        public void N() {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.B()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.E(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C9526i.b.N():void");
        }

        public void O(int i10) {
            if (i10 >= 0) {
                int i11 = this.f68007i;
                int i12 = this.f68009k;
                if (i10 <= i11 - i12) {
                    this.f68009k = i12 + i10;
                    return;
                }
            }
            if (i10 < 0) {
                throw B.g();
            }
            throw B.m();
        }

        public void a(int i10) {
            if (this.f68011m != i10) {
                throw B.b();
            }
        }

        public int d() {
            return this.f68009k - this.f68010l;
        }

        public boolean e() {
            return this.f68009k == this.f68007i;
        }

        public void k(int i10) {
            this.f68013o = i10;
            M();
        }

        public int l(int i10) {
            if (i10 >= 0) {
                int d10 = i10 + d();
                if (d10 >= 0) {
                    int i11 = this.f68013o;
                    if (d10 <= i11) {
                        this.f68013o = d10;
                        M();
                        return i11;
                    }
                    throw B.m();
                }
                throw B.h();
            }
            throw B.g();
        }

        public boolean m() {
            return K() != 0;
        }

        public C9525h n() {
            int J10 = J();
            if (J10 > 0) {
                int i10 = this.f68007i;
                int i11 = this.f68009k;
                if (J10 <= i10 - i11) {
                    C9525h p10 = (!this.f68006h || !this.f68012n) ? C9525h.p(this.f68005g, i11, J10) : C9525h.L(this.f68005g, i11, J10);
                    this.f68009k += J10;
                    return p10;
                }
            }
            return J10 == 0 ? C9525h.f67987b : C9525h.K(G(J10));
        }

        public double o() {
            return Double.longBitsToDouble(I());
        }

        public int p() {
            return J();
        }

        public int q() {
            return H();
        }

        public long r() {
            return I();
        }

        public float s() {
            return Float.intBitsToFloat(H());
        }

        public int t() {
            return J();
        }

        public long u() {
            return K();
        }

        public int v() {
            return H();
        }

        public long w() {
            return I();
        }

        public int x() {
            return C9526i.b(J());
        }

        public long y() {
            return C9526i.c(K());
        }

        public String z() {
            int J10 = J();
            if (J10 > 0) {
                int i10 = this.f68007i;
                int i11 = this.f68009k;
                if (J10 <= i10 - i11) {
                    String str = new String(this.f68005g, i11, J10, A.f67907b);
                    this.f68009k += J10;
                    return str;
                }
            }
            if (J10 == 0) {
                return "";
            }
            if (J10 < 0) {
                throw B.g();
            }
            throw B.m();
        }

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f68013o = Integer.MAX_VALUE;
            this.f68005g = bArr;
            this.f68007i = i11 + i10;
            this.f68009k = i10;
            this.f68010l = i10;
            this.f68006h = z10;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$c */
    private static final class c extends C9526i {

        /* renamed from: g  reason: collision with root package name */
        private final InputStream f68014g;

        /* renamed from: h  reason: collision with root package name */
        private final byte[] f68015h;

        /* renamed from: i  reason: collision with root package name */
        private int f68016i;

        /* renamed from: j  reason: collision with root package name */
        private int f68017j;

        /* renamed from: k  reason: collision with root package name */
        private int f68018k;

        /* renamed from: l  reason: collision with root package name */
        private int f68019l;

        /* renamed from: m  reason: collision with root package name */
        private int f68020m;

        /* renamed from: n  reason: collision with root package name */
        private int f68021n;

        private static int F(InputStream inputStream) {
            try {
                return inputStream.available();
            } catch (B e10) {
                e10.j();
                throw e10;
            }
        }

        private static int G(InputStream inputStream, byte[] bArr, int i10, int i11) {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (B e10) {
                e10.j();
                throw e10;
            }
        }

        private C9525h H(int i10) {
            byte[] K10 = K(i10);
            if (K10 != null) {
                return C9525h.m(K10);
            }
            int i11 = this.f68018k;
            int i12 = this.f68016i;
            int i13 = i12 - i11;
            this.f68020m += i12;
            this.f68018k = 0;
            this.f68016i = 0;
            List<byte[]> L10 = L(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f68015h, i11, bArr, 0, i13);
            for (byte[] next : L10) {
                System.arraycopy(next, 0, bArr, i13, next.length);
                i13 += next.length;
            }
            return C9525h.K(bArr);
        }

        private byte[] J(int i10, boolean z10) {
            byte[] K10 = K(i10);
            if (K10 != null) {
                return z10 ? (byte[]) K10.clone() : K10;
            }
            int i11 = this.f68018k;
            int i12 = this.f68016i;
            int i13 = i12 - i11;
            this.f68020m += i12;
            this.f68018k = 0;
            this.f68016i = 0;
            List<byte[]> L10 = L(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f68015h, i11, bArr, 0, i13);
            for (byte[] next : L10) {
                System.arraycopy(next, 0, bArr, i13, next.length);
                i13 += next.length;
            }
            return bArr;
        }

        private byte[] K(int i10) {
            if (i10 == 0) {
                return A.f67909d;
            }
            if (i10 >= 0) {
                int i11 = this.f68020m;
                int i12 = this.f68018k;
                int i13 = i11 + i12 + i10;
                if (i13 - this.f68002c <= 0) {
                    int i14 = this.f68021n;
                    if (i13 <= i14) {
                        int i15 = this.f68016i - i12;
                        int i16 = i10 - i15;
                        if (i16 >= 4096 && i16 > F(this.f68014g)) {
                            return null;
                        }
                        byte[] bArr = new byte[i10];
                        System.arraycopy(this.f68015h, this.f68018k, bArr, 0, i15);
                        this.f68020m += this.f68016i;
                        this.f68018k = 0;
                        this.f68016i = 0;
                        while (i15 < i10) {
                            int G10 = G(this.f68014g, bArr, i15, i10 - i15);
                            if (G10 != -1) {
                                this.f68020m += G10;
                                i15 += G10;
                            } else {
                                throw B.m();
                            }
                        }
                        return bArr;
                    }
                    V((i14 - i11) - i12);
                    throw B.m();
                }
                throw B.l();
            }
            throw B.g();
        }

        private List<byte[]> L(int i10) {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int min = Math.min(i10, RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT);
                byte[] bArr = new byte[min];
                int i11 = 0;
                while (i11 < min) {
                    int read = this.f68014g.read(bArr, i11, min - i11);
                    if (read != -1) {
                        this.f68020m += read;
                        i11 += read;
                    } else {
                        throw B.m();
                    }
                }
                i10 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void R() {
            int i10 = this.f68016i + this.f68017j;
            this.f68016i = i10;
            int i11 = this.f68020m + i10;
            int i12 = this.f68021n;
            if (i11 > i12) {
                int i13 = i11 - i12;
                this.f68017j = i13;
                this.f68016i = i10 - i13;
                return;
            }
            this.f68017j = 0;
        }

        private void S(int i10) {
            if (a0(i10)) {
                return;
            }
            if (i10 > (this.f68002c - this.f68020m) - this.f68018k) {
                throw B.l();
            }
            throw B.m();
        }

        private static long T(InputStream inputStream, long j10) {
            try {
                return inputStream.skip(j10);
            } catch (B e10) {
                e10.j();
                throw e10;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
            throw new java.lang.IllegalStateException(r7.f68014g.getClass() + "#skip returned invalid result: " + r1 + "\nThe InputStream implementation is buggy.");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void W(int r8) {
            /*
                r7 = this;
                if (r8 < 0) goto L_0x0092
                int r0 = r7.f68020m
                int r1 = r7.f68018k
                int r2 = r0 + r1
                int r2 = r2 + r8
                int r3 = r7.f68021n
                if (r2 > r3) goto L_0x0088
                int r0 = r0 + r1
                r7.f68020m = r0
                int r0 = r7.f68016i
                int r0 = r0 - r1
                r1 = 0
                r7.f68016i = r1
                r7.f68018k = r1
            L_0x0018:
                if (r0 >= r8) goto L_0x0062
                int r1 = r8 - r0
                java.io.InputStream r2 = r7.f68014g     // Catch:{ all -> 0x0058 }
                long r3 = (long) r1     // Catch:{ all -> 0x0058 }
                long r1 = T(r2, r3)     // Catch:{ all -> 0x0058 }
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
                java.io.InputStream r4 = r7.f68014g     // Catch:{ all -> 0x0058 }
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
                int r1 = r7.f68020m
                int r1 = r1 + r0
                r7.f68020m = r1
                r7.R()
                throw r8
            L_0x0062:
                int r1 = r7.f68020m
                int r1 = r1 + r0
                r7.f68020m = r1
                r7.R()
                if (r0 >= r8) goto L_0x0087
                int r0 = r7.f68016i
                int r1 = r7.f68018k
                int r1 = r0 - r1
                r7.f68018k = r0
                r0 = 1
                r7.S(r0)
            L_0x0078:
                int r2 = r8 - r1
                int r3 = r7.f68016i
                if (r2 <= r3) goto L_0x0085
                int r1 = r1 + r3
                r7.f68018k = r3
                r7.S(r0)
                goto L_0x0078
            L_0x0085:
                r7.f68018k = r2
            L_0x0087:
                return
            L_0x0088:
                int r3 = r3 - r0
                int r3 = r3 - r1
                r7.V(r3)
                com.google.crypto.tink.shaded.protobuf.B r8 = com.google.crypto.tink.shaded.protobuf.B.m()
                throw r8
            L_0x0092:
                com.google.crypto.tink.shaded.protobuf.B r8 = com.google.crypto.tink.shaded.protobuf.B.g()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C9526i.c.W(int):void");
        }

        private void X() {
            if (this.f68016i - this.f68018k >= 10) {
                Y();
            } else {
                Z();
            }
        }

        private void Y() {
            int i10 = 0;
            while (i10 < 10) {
                byte[] bArr = this.f68015h;
                int i11 = this.f68018k;
                this.f68018k = i11 + 1;
                if (bArr[i11] < 0) {
                    i10++;
                } else {
                    return;
                }
            }
            throw B.f();
        }

        private void Z() {
            int i10 = 0;
            while (i10 < 10) {
                if (I() < 0) {
                    i10++;
                } else {
                    return;
                }
            }
            throw B.f();
        }

        private boolean a0(int i10) {
            int i11 = this.f68018k;
            int i12 = i11 + i10;
            int i13 = this.f68016i;
            if (i12 > i13) {
                int i14 = this.f68002c;
                int i15 = this.f68020m;
                if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f68021n) {
                    return false;
                }
                if (i11 > 0) {
                    if (i13 > i11) {
                        byte[] bArr = this.f68015h;
                        System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                    }
                    this.f68020m += i11;
                    this.f68016i -= i11;
                    this.f68018k = 0;
                }
                InputStream inputStream = this.f68014g;
                byte[] bArr2 = this.f68015h;
                int i16 = this.f68016i;
                int G10 = G(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.f68002c - this.f68020m) - i16));
                if (G10 == 0 || G10 < -1 || G10 > this.f68015h.length) {
                    throw new IllegalStateException(this.f68014g.getClass() + "#read(byte[]) returned invalid result: " + G10 + "\nThe InputStream implementation is buggy.");
                } else if (G10 <= 0) {
                    return false;
                } else {
                    this.f68016i += G10;
                    R();
                    if (this.f68016i >= i10) {
                        return true;
                    }
                    return a0(i10);
                }
            } else {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
        }

        public String A() {
            byte[] bArr;
            int O10 = O();
            int i10 = this.f68018k;
            int i11 = this.f68016i;
            if (O10 <= i11 - i10 && O10 > 0) {
                bArr = this.f68015h;
                this.f68018k = i10 + O10;
            } else if (O10 == 0) {
                return "";
            } else {
                i10 = 0;
                if (O10 <= i11) {
                    S(O10);
                    bArr = this.f68015h;
                    this.f68018k = O10;
                } else {
                    bArr = J(O10, false);
                }
            }
            return t0.e(bArr, i10, O10);
        }

        public int B() {
            if (e()) {
                this.f68019l = 0;
                return 0;
            }
            int O10 = O();
            this.f68019l = O10;
            if (u0.a(O10) != 0) {
                return this.f68019l;
            }
            throw B.c();
        }

        public int C() {
            return O();
        }

        public long D() {
            return P();
        }

        public boolean E(int i10) {
            int b10 = u0.b(i10);
            if (b10 == 0) {
                X();
                return true;
            } else if (b10 == 1) {
                V(8);
                return true;
            } else if (b10 == 2) {
                V(O());
                return true;
            } else if (b10 == 3) {
                U();
                a(u0.c(u0.a(i10), 4));
                return true;
            } else if (b10 == 4) {
                return false;
            } else {
                if (b10 == 5) {
                    V(4);
                    return true;
                }
                throw B.e();
            }
        }

        public byte I() {
            if (this.f68018k == this.f68016i) {
                S(1);
            }
            byte[] bArr = this.f68015h;
            int i10 = this.f68018k;
            this.f68018k = i10 + 1;
            return bArr[i10];
        }

        public int M() {
            int i10 = this.f68018k;
            if (this.f68016i - i10 < 4) {
                S(4);
                i10 = this.f68018k;
            }
            byte[] bArr = this.f68015h;
            this.f68018k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long N() {
            int i10 = this.f68018k;
            if (this.f68016i - i10 < 8) {
                S(8);
                i10 = this.f68018k;
            }
            byte[] bArr = this.f68015h;
            this.f68018k = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public int O() {
            byte b10;
            byte b11;
            int i10 = this.f68018k;
            int i11 = this.f68016i;
            if (i11 != i10) {
                byte[] bArr = this.f68015h;
                int i12 = i10 + 1;
                byte b12 = bArr[i10];
                if (b12 >= 0) {
                    this.f68018k = i12;
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
                    this.f68018k = i13;
                    return b10;
                }
            }
            return (int) Q();
        }

        public long P() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f68018k;
            int i11 = this.f68016i;
            if (i11 != i10) {
                byte[] bArr = this.f68015h;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f68018k = i12;
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
                    this.f68018k = i13;
                    return j10;
                }
            }
            return Q();
        }

        /* access modifiers changed from: package-private */
        public long Q() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte I10 = I();
                j10 |= ((long) (I10 & Byte.MAX_VALUE)) << i10;
                if ((I10 & 128) == 0) {
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
        public void U() {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.B()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.E(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C9526i.c.U():void");
        }

        public void V(int i10) {
            int i11 = this.f68016i;
            int i12 = this.f68018k;
            if (i10 > i11 - i12 || i10 < 0) {
                W(i10);
            } else {
                this.f68018k = i12 + i10;
            }
        }

        public void a(int i10) {
            if (this.f68019l != i10) {
                throw B.b();
            }
        }

        public int d() {
            return this.f68020m + this.f68018k;
        }

        public boolean e() {
            return this.f68018k == this.f68016i && !a0(1);
        }

        public void k(int i10) {
            this.f68021n = i10;
            R();
        }

        public int l(int i10) {
            if (i10 >= 0) {
                int i11 = i10 + this.f68020m + this.f68018k;
                int i12 = this.f68021n;
                if (i11 <= i12) {
                    this.f68021n = i11;
                    R();
                    return i12;
                }
                throw B.m();
            }
            throw B.g();
        }

        public boolean m() {
            return P() != 0;
        }

        public C9525h n() {
            int O10 = O();
            int i10 = this.f68016i;
            int i11 = this.f68018k;
            if (O10 > i10 - i11 || O10 <= 0) {
                return O10 == 0 ? C9525h.f67987b : H(O10);
            }
            C9525h p10 = C9525h.p(this.f68015h, i11, O10);
            this.f68018k += O10;
            return p10;
        }

        public double o() {
            return Double.longBitsToDouble(N());
        }

        public int p() {
            return O();
        }

        public int q() {
            return M();
        }

        public long r() {
            return N();
        }

        public float s() {
            return Float.intBitsToFloat(M());
        }

        public int t() {
            return O();
        }

        public long u() {
            return P();
        }

        public int v() {
            return M();
        }

        public long w() {
            return N();
        }

        public int x() {
            return C9526i.b(O());
        }

        public long y() {
            return C9526i.c(P());
        }

        public String z() {
            int O10 = O();
            if (O10 > 0) {
                int i10 = this.f68016i;
                int i11 = this.f68018k;
                if (O10 <= i10 - i11) {
                    String str = new String(this.f68015h, i11, O10, A.f67907b);
                    this.f68018k += O10;
                    return str;
                }
            }
            if (O10 == 0) {
                return "";
            }
            if (O10 > this.f68016i) {
                return new String(J(O10, false), A.f67907b);
            }
            S(O10);
            String str2 = new String(this.f68015h, this.f68018k, O10, A.f67907b);
            this.f68018k += O10;
            return str2;
        }

        private c(InputStream inputStream, int i10) {
            super();
            this.f68021n = Integer.MAX_VALUE;
            A.b(inputStream, "input");
            this.f68014g = inputStream;
            this.f68015h = new byte[i10];
            this.f68016i = 0;
            this.f68018k = 0;
            this.f68020m = 0;
        }
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static C9526i f(InputStream inputStream) {
        return g(inputStream, RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT);
    }

    public static C9526i g(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? h(A.f67909d) : new c(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static C9526i h(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static C9526i i(byte[] bArr, int i10, int i11) {
        return j(bArr, i10, i11, false);
    }

    static C9526i j(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.l(i11);
            return bVar;
        } catch (B e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract String A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract boolean E(int i10);

    public abstract void a(int i10);

    public abstract int d();

    public abstract boolean e();

    public abstract void k(int i10);

    public abstract int l(int i10);

    public abstract boolean m();

    public abstract C9525h n();

    public abstract double o();

    public abstract int p();

    public abstract int q();

    public abstract long r();

    public abstract float s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract long y();

    public abstract String z();

    private C9526i() {
        this.f68001b = f67999f;
        this.f68002c = Integer.MAX_VALUE;
        this.f68004e = false;
    }
}
