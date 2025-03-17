package eJ;

import androidx.recyclerview.widget.RecyclerView;
import com.adjust.sdk.Constants;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import eJ.C17206q;
import java.io.InputStream;
import java.util.ArrayList;

/* renamed from: eJ.e  reason: case insensitive filesystem */
public final class C17194e {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f143021a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f143022b;

    /* renamed from: c  reason: collision with root package name */
    private int f143023c;

    /* renamed from: d  reason: collision with root package name */
    private int f143024d;

    /* renamed from: e  reason: collision with root package name */
    private int f143025e;

    /* renamed from: f  reason: collision with root package name */
    private final InputStream f143026f;

    /* renamed from: g  reason: collision with root package name */
    private int f143027g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f143028h;

    /* renamed from: i  reason: collision with root package name */
    private int f143029i;

    /* renamed from: j  reason: collision with root package name */
    private int f143030j;

    /* renamed from: k  reason: collision with root package name */
    private int f143031k;

    /* renamed from: l  reason: collision with root package name */
    private int f143032l;

    /* renamed from: m  reason: collision with root package name */
    private int f143033m;

    private C17194e(InputStream inputStream) {
        this.f143028h = false;
        this.f143030j = Integer.MAX_VALUE;
        this.f143032l = 64;
        this.f143033m = 67108864;
        this.f143021a = new byte[RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT];
        this.f143023c = 0;
        this.f143025e = 0;
        this.f143029i = 0;
        this.f143026f = inputStream;
        this.f143022b = false;
    }

    public static int B(int i10, InputStream inputStream) {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int read = inputStream.read();
            if (read != -1) {
                i11 |= (read & 127) << i12;
                if ((read & 128) == 0) {
                    return i11;
                }
                i12 += 7;
            } else {
                throw C17200k.k();
            }
        }
        while (i12 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw C17200k.k();
            } else if ((read2 & 128) == 0) {
                return i11;
            } else {
                i12 += 7;
            }
        }
        throw C17200k.f();
    }

    private void N() {
        int i10 = this.f143023c + this.f143024d;
        this.f143023c = i10;
        int i11 = this.f143029i + i10;
        int i12 = this.f143030j;
        if (i11 > i12) {
            int i13 = i11 - i12;
            this.f143024d = i13;
            this.f143023c = i10 - i13;
            return;
        }
        this.f143024d = 0;
    }

    private void O(int i10) {
        if (!T(i10)) {
            throw C17200k.k();
        }
    }

    private void S(int i10) {
        if (i10 >= 0) {
            int i11 = this.f143029i;
            int i12 = this.f143025e;
            int i13 = i11 + i12 + i10;
            int i14 = this.f143030j;
            if (i13 <= i14) {
                int i15 = this.f143023c;
                int i16 = i15 - i12;
                this.f143025e = i15;
                O(1);
                while (true) {
                    int i17 = i10 - i16;
                    int i18 = this.f143023c;
                    if (i17 > i18) {
                        i16 += i18;
                        this.f143025e = i18;
                        O(1);
                    } else {
                        this.f143025e = i17;
                        return;
                    }
                }
            } else {
                R((i14 - i11) - i12);
                throw C17200k.k();
            }
        } else {
            throw C17200k.g();
        }
    }

    private boolean T(int i10) {
        int i11 = this.f143025e;
        int i12 = i11 + i10;
        int i13 = this.f143023c;
        if (i12 > i13) {
            if (this.f143029i + i11 + i10 <= this.f143030j && this.f143026f != null) {
                if (i11 > 0) {
                    if (i13 > i11) {
                        byte[] bArr = this.f143021a;
                        System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                    }
                    this.f143029i += i11;
                    this.f143023c -= i11;
                    this.f143025e = 0;
                }
                InputStream inputStream = this.f143026f;
                byte[] bArr2 = this.f143021a;
                int i14 = this.f143023c;
                int read = inputStream.read(bArr2, i14, bArr2.length - i14);
                if (read == 0 || read < -1 || read > this.f143021a.length) {
                    StringBuilder sb2 = new StringBuilder(CheckoutActivity.RESULT_ERROR);
                    sb2.append("InputStream#read(byte[]) returned invalid result: ");
                    sb2.append(read);
                    sb2.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb2.toString());
                } else if (read > 0) {
                    this.f143023c += read;
                    if ((this.f143029i + i10) - this.f143033m <= 0) {
                        N();
                        if (this.f143023c >= i10) {
                            return true;
                        }
                        return T(i10);
                    }
                    throw C17200k.j();
                }
            }
            return false;
        }
        StringBuilder sb3 = new StringBuilder(77);
        sb3.append("refillBuffer() called when ");
        sb3.append(i10);
        sb3.append(" bytes were already available in buffer");
        throw new IllegalStateException(sb3.toString());
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    private void d(int i10) {
        if (this.f143023c - this.f143025e < i10) {
            O(i10);
        }
    }

    static C17194e g(C17205p pVar) {
        C17194e eVar = new C17194e(pVar);
        try {
            eVar.j(pVar.size());
            return eVar;
        } catch (C17200k e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static C17194e h(InputStream inputStream) {
        return new C17194e(inputStream);
    }

    private byte[] x(int i10) {
        if (i10 > 0) {
            int i11 = this.f143029i;
            int i12 = this.f143025e;
            int i13 = i11 + i12 + i10;
            int i14 = this.f143030j;
            if (i13 > i14) {
                R((i14 - i11) - i12);
                throw C17200k.k();
            } else if (i10 < 4096) {
                byte[] bArr = new byte[i10];
                int i15 = this.f143023c - i12;
                System.arraycopy(this.f143021a, i12, bArr, 0, i15);
                this.f143025e = this.f143023c;
                int i16 = i10 - i15;
                d(i16);
                System.arraycopy(this.f143021a, 0, bArr, i15, i16);
                this.f143025e = i16;
                return bArr;
            } else {
                int i17 = this.f143023c;
                this.f143029i = i11 + i17;
                this.f143025e = 0;
                this.f143023c = 0;
                int i18 = i17 - i12;
                int i19 = i10 - i18;
                ArrayList<byte[]> arrayList = new ArrayList<>();
                while (i19 > 0) {
                    int min = Math.min(i19, RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT);
                    byte[] bArr2 = new byte[min];
                    int i20 = 0;
                    while (i20 < min) {
                        InputStream inputStream = this.f143026f;
                        int read = inputStream == null ? -1 : inputStream.read(bArr2, i20, min - i20);
                        if (read != -1) {
                            this.f143029i += read;
                            i20 += read;
                        } else {
                            throw C17200k.k();
                        }
                    }
                    i19 -= min;
                    arrayList.add(bArr2);
                }
                byte[] bArr3 = new byte[i10];
                System.arraycopy(this.f143021a, i12, bArr3, 0, i18);
                for (byte[] bArr4 : arrayList) {
                    System.arraycopy(bArr4, 0, bArr3, i18, bArr4.length);
                    i18 += bArr4.length;
                }
                return bArr3;
            }
        } else if (i10 == 0) {
            return C17199j.f143069a;
        } else {
            throw C17200k.g();
        }
    }

    public int A() {
        int i10;
        int i11;
        int i12 = this.f143025e;
        int i13 = this.f143023c;
        if (i13 != i12) {
            byte[] bArr = this.f143021a;
            int i14 = i12 + 1;
            byte b10 = bArr[i12];
            if (b10 >= 0) {
                this.f143025e = i14;
                return b10;
            } else if (i13 - i14 >= 9) {
                int i15 = i12 + 2;
                byte b11 = (bArr[i14] << 7) ^ b10;
                long j10 = (long) b11;
                if (j10 < 0) {
                    i10 = (int) (-128 ^ j10);
                } else {
                    int i16 = i12 + 3;
                    byte b12 = (bArr[i15] << 14) ^ b11;
                    long j11 = (long) b12;
                    if (j11 >= 0) {
                        i11 = (int) (16256 ^ j11);
                    } else {
                        int i17 = i12 + 4;
                        byte b13 = b12 ^ (bArr[i16] << 21);
                        long j12 = (long) b13;
                        if (j12 < 0) {
                            i10 = (int) (-2080896 ^ j12);
                        } else {
                            i16 = i12 + 5;
                            byte b14 = bArr[i17];
                            int i18 = (int) (((long) (b13 ^ (b14 << 28))) ^ 266354560);
                            if (b14 < 0) {
                                i17 = i12 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i12 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i12 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i12 + 9;
                                            if (bArr[i17] < 0) {
                                                int i19 = i12 + 10;
                                                if (bArr[i16] >= 0) {
                                                    int i20 = i18;
                                                    i15 = i19;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i18;
                            }
                            i11 = i18;
                        }
                        i15 = i17;
                    }
                    i15 = i16;
                }
                this.f143025e = i15;
                return i10;
            }
        }
        return (int) D();
    }

    public long C() {
        long j10;
        long j11;
        long j12;
        int i10 = this.f143025e;
        int i11 = this.f143023c;
        if (i11 != i10) {
            byte[] bArr = this.f143021a;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f143025e = i12;
                return (long) b10;
            } else if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                long j13 = (long) ((bArr[i12] << 7) ^ b10);
                if (j13 < 0) {
                    j11 = -128;
                } else {
                    int i14 = i10 + 3;
                    long j14 = j13 ^ ((long) (bArr[i13] << 14));
                    if (j14 >= 0) {
                        j12 = 16256;
                    } else {
                        i13 = i10 + 4;
                        j13 = j14 ^ ((long) (bArr[i14] << 21));
                        if (j13 < 0) {
                            j11 = -2080896;
                        } else {
                            i14 = i10 + 5;
                            j14 = j13 ^ (((long) bArr[i13]) << 28);
                            if (j14 >= 0) {
                                j12 = 266354560;
                            } else {
                                i13 = i10 + 6;
                                j13 = j14 ^ (((long) bArr[i14]) << 35);
                                if (j13 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i14 = i10 + 7;
                                    j14 = j13 ^ (((long) bArr[i13]) << 42);
                                    if (j14 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i13 = i10 + 8;
                                        j13 = j14 ^ (((long) bArr[i14]) << 49);
                                        if (j13 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i14 = i10 + 9;
                                            long j15 = (j13 ^ (((long) bArr[i13]) << 56)) ^ 71499008037633920L;
                                            if (j15 < 0) {
                                                i13 = i10 + 10;
                                                if (((long) bArr[i14]) >= 0) {
                                                    j10 = j15;
                                                    this.f143025e = i13;
                                                    return j10;
                                                }
                                            } else {
                                                j10 = j15;
                                                i13 = i14;
                                                this.f143025e = i13;
                                                return j10;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    j10 = j14 ^ j12;
                    i13 = i14;
                    this.f143025e = i13;
                    return j10;
                }
                j10 = j13 ^ j11;
                this.f143025e = i13;
                return j10;
            }
        }
        return D();
    }

    /* access modifiers changed from: package-private */
    public long D() {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte w10 = w();
            j10 |= ((long) (w10 & Byte.MAX_VALUE)) << i10;
            if ((w10 & 128) == 0) {
                return j10;
            }
        }
        throw C17200k.f();
    }

    public int E() {
        return y();
    }

    public long F() {
        return z();
    }

    public int G() {
        return b(A());
    }

    public long H() {
        return c(C());
    }

    public String I() {
        int A10 = A();
        int i10 = this.f143023c;
        int i11 = this.f143025e;
        if (A10 > i10 - i11 || A10 <= 0) {
            return A10 == 0 ? "" : new String(x(A10), Constants.ENCODING);
        }
        String str = new String(this.f143021a, i11, A10, Constants.ENCODING);
        this.f143025e += A10;
        return str;
    }

    public String J() {
        byte[] bArr;
        int A10 = A();
        int i10 = this.f143025e;
        if (A10 <= this.f143023c - i10 && A10 > 0) {
            bArr = this.f143021a;
            this.f143025e = i10 + A10;
        } else if (A10 == 0) {
            return "";
        } else {
            bArr = x(A10);
            i10 = 0;
        }
        if (C17214y.f(bArr, i10, i10 + A10)) {
            return new String(bArr, i10, A10, Constants.ENCODING);
        }
        throw C17200k.d();
    }

    public int K() {
        if (f()) {
            this.f143027g = 0;
            return 0;
        }
        int A10 = A();
        this.f143027g = A10;
        if (C17215z.a(A10) != 0) {
            return this.f143027g;
        }
        throw C17200k.c();
    }

    public int L() {
        return A();
    }

    public long M() {
        return C();
    }

    public boolean P(int i10, C17195f fVar) {
        int b10 = C17215z.b(i10);
        if (b10 == 0) {
            long t10 = t();
            fVar.o0(i10);
            fVar.z0(t10);
            return true;
        } else if (b10 == 1) {
            long z10 = z();
            fVar.o0(i10);
            fVar.V(z10);
            return true;
        } else if (b10 == 2) {
            C17193d l10 = l();
            fVar.o0(i10);
            fVar.P(l10);
            return true;
        } else if (b10 == 3) {
            fVar.o0(i10);
            Q(fVar);
            int c10 = C17215z.c(C17215z.a(i10), 4);
            a(c10);
            fVar.o0(c10);
            return true;
        } else if (b10 == 4) {
            return false;
        } else {
            if (b10 == 5) {
                int y10 = y();
                fVar.o0(i10);
                fVar.U(y10);
                return true;
            }
            throw C17200k.e();
        }
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public void Q(eJ.C17195f r2) {
        /*
            r1 = this;
        L_0x0000:
            int r0 = r1.K()
            if (r0 == 0) goto L_0x000c
            boolean r0 = r1.P(r0, r2)
            if (r0 != 0) goto L_0x0000
        L_0x000c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eJ.C17194e.Q(eJ.f):void");
    }

    public void R(int i10) {
        int i11 = this.f143023c;
        int i12 = this.f143025e;
        if (i10 > i11 - i12 || i10 < 0) {
            S(i10);
        } else {
            this.f143025e = i12 + i10;
        }
    }

    public void a(int i10) {
        if (this.f143027g != i10) {
            throw C17200k.b();
        }
    }

    public int e() {
        int i10 = this.f143030j;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.f143029i + this.f143025e);
    }

    public boolean f() {
        return this.f143025e == this.f143023c && !T(1);
    }

    public void i(int i10) {
        this.f143030j = i10;
        N();
    }

    public int j(int i10) {
        if (i10 >= 0) {
            int i11 = i10 + this.f143029i + this.f143025e;
            int i12 = this.f143030j;
            if (i11 <= i12) {
                this.f143030j = i11;
                N();
                return i12;
            }
            throw C17200k.k();
        }
        throw C17200k.g();
    }

    public boolean k() {
        return C() != 0;
    }

    public C17193d l() {
        int A10 = A();
        int i10 = this.f143023c;
        int i11 = this.f143025e;
        if (A10 > i10 - i11 || A10 <= 0) {
            return A10 == 0 ? C17193d.f143014a : new C17205p(x(A10));
        }
        C17193d m10 = (!this.f143022b || !this.f143028h) ? C17193d.m(this.f143021a, i11, A10) : new C17192c(this.f143021a, this.f143025e, A10);
        this.f143025e += A10;
        return m10;
    }

    public double m() {
        return Double.longBitsToDouble(z());
    }

    public int n() {
        return A();
    }

    public int o() {
        return y();
    }

    public long p() {
        return z();
    }

    public float q() {
        return Float.intBitsToFloat(y());
    }

    public void r(int i10, C17206q.a aVar, C17196g gVar) {
        int i11 = this.f143031k;
        if (i11 < this.f143032l) {
            this.f143031k = i11 + 1;
            aVar.o1(this, gVar);
            a(C17215z.c(i10, 4));
            this.f143031k--;
            return;
        }
        throw C17200k.h();
    }

    public int s() {
        return A();
    }

    public long t() {
        return C();
    }

    public <T extends C17206q> T u(C17208s<T> sVar, C17196g gVar) {
        int A10 = A();
        if (this.f143031k < this.f143032l) {
            int j10 = j(A10);
            this.f143031k++;
            T t10 = (C17206q) sVar.c(this, gVar);
            a(0);
            this.f143031k--;
            i(j10);
            return t10;
        }
        throw C17200k.h();
    }

    public void v(C17206q.a aVar, C17196g gVar) {
        int A10 = A();
        if (this.f143031k < this.f143032l) {
            int j10 = j(A10);
            this.f143031k++;
            aVar.o1(this, gVar);
            a(0);
            this.f143031k--;
            i(j10);
            return;
        }
        throw C17200k.h();
    }

    public byte w() {
        if (this.f143025e == this.f143023c) {
            O(1);
        }
        byte[] bArr = this.f143021a;
        int i10 = this.f143025e;
        this.f143025e = i10 + 1;
        return bArr[i10];
    }

    public int y() {
        int i10 = this.f143025e;
        if (this.f143023c - i10 < 4) {
            O(4);
            i10 = this.f143025e;
        }
        byte[] bArr = this.f143021a;
        this.f143025e = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public long z() {
        int i10 = this.f143025e;
        if (this.f143023c - i10 < 8) {
            O(8);
            i10 = this.f143025e;
        }
        byte[] bArr = this.f143021a;
        this.f143025e = i10 + 8;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    private C17194e(C17205p pVar) {
        this.f143028h = false;
        this.f143030j = Integer.MAX_VALUE;
        this.f143032l = 64;
        this.f143033m = 67108864;
        this.f143021a = pVar.f143081b;
        int M10 = pVar.M();
        this.f143025e = M10;
        this.f143023c = M10 + pVar.size();
        this.f143029i = -this.f143025e;
        this.f143026f = null;
        this.f143022b = true;
    }
}
