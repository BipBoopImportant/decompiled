package r3;

import com.adjust.sdk.Constants;
import java.nio.ShortBuffer;
import java.util.Arrays;
import t3.C5950a;

final class e {

    /* renamed from: a  reason: collision with root package name */
    private final int f28657a;

    /* renamed from: b  reason: collision with root package name */
    private final int f28658b;

    /* renamed from: c  reason: collision with root package name */
    private final float f28659c;

    /* renamed from: d  reason: collision with root package name */
    private final float f28660d;

    /* renamed from: e  reason: collision with root package name */
    private final float f28661e;

    /* renamed from: f  reason: collision with root package name */
    private final int f28662f;

    /* renamed from: g  reason: collision with root package name */
    private final int f28663g;

    /* renamed from: h  reason: collision with root package name */
    private final int f28664h;

    /* renamed from: i  reason: collision with root package name */
    private final short[] f28665i;

    /* renamed from: j  reason: collision with root package name */
    private short[] f28666j;

    /* renamed from: k  reason: collision with root package name */
    private int f28667k;

    /* renamed from: l  reason: collision with root package name */
    private short[] f28668l;

    /* renamed from: m  reason: collision with root package name */
    private int f28669m;

    /* renamed from: n  reason: collision with root package name */
    private short[] f28670n;

    /* renamed from: o  reason: collision with root package name */
    private int f28671o;

    /* renamed from: p  reason: collision with root package name */
    private int f28672p;

    /* renamed from: q  reason: collision with root package name */
    private int f28673q;

    /* renamed from: r  reason: collision with root package name */
    private int f28674r;

    /* renamed from: s  reason: collision with root package name */
    private int f28675s;

    /* renamed from: t  reason: collision with root package name */
    private int f28676t;

    /* renamed from: u  reason: collision with root package name */
    private int f28677u;

    /* renamed from: v  reason: collision with root package name */
    private int f28678v;

    /* renamed from: w  reason: collision with root package name */
    private double f28679w;

    public e(int i10, int i11, float f10, float f11, int i12) {
        this.f28657a = i10;
        this.f28658b = i11;
        this.f28659c = f10;
        this.f28660d = f11;
        this.f28661e = ((float) i10) / ((float) i12);
        this.f28662f = i10 / Constants.MINIMAL_ERROR_STATUS_CODE;
        int i13 = i10 / 65;
        this.f28663g = i13;
        int i14 = i13 * 2;
        this.f28664h = i14;
        this.f28665i = new short[i14];
        this.f28666j = new short[(i14 * i11)];
        this.f28668l = new short[(i14 * i11)];
        this.f28670n = new short[(i14 * i11)];
    }

    private void a(float f10, int i10) {
        int i11;
        int i12;
        int i13 = i10;
        if (this.f28669m != i13) {
            int i14 = this.f28657a;
            long j10 = (long) (((float) i14) / f10);
            long j11 = (long) i14;
            while (j10 != 0 && j11 != 0 && j10 % 2 == 0 && j11 % 2 == 0) {
                j10 /= 2;
                j11 /= 2;
            }
            o(i13);
            int i15 = 0;
            while (true) {
                int i16 = this.f28671o;
                boolean z10 = true;
                if (i15 < i16 - 1) {
                    while (true) {
                        i11 = this.f28672p;
                        i12 = this.f28673q;
                        if (((long) (i11 + 1)) * j10 <= ((long) i12) * j11) {
                            break;
                        }
                        this.f28668l = f(this.f28668l, this.f28669m, 1);
                        int i17 = 0;
                        while (true) {
                            int i18 = this.f28658b;
                            if (i17 >= i18) {
                                break;
                            }
                            short[] sArr = this.f28668l;
                            sArr[(this.f28669m * i18) + i17] = n(this.f28670n, (i18 * i15) + i17, j11, j10);
                            i17++;
                        }
                        this.f28673q++;
                        this.f28669m++;
                    }
                    int i19 = i11 + 1;
                    this.f28672p = i19;
                    if (((long) i19) == j11) {
                        this.f28672p = 0;
                        if (((long) i12) != j10) {
                            z10 = false;
                        }
                        C5950a.g(z10);
                        this.f28673q = 0;
                    }
                    i15++;
                } else {
                    u(i16 - 1);
                    return;
                }
            }
        }
    }

    private void b(double d10) {
        int m10;
        int i10 = this.f28667k;
        if (i10 >= this.f28664h) {
            int i11 = 0;
            do {
                if (this.f28674r > 0) {
                    m10 = c(i11);
                } else {
                    int g10 = g(this.f28666j, i11);
                    if (d10 > 1.0d) {
                        i11 += g10 + w(this.f28666j, i11, d10, g10);
                    } else {
                        m10 = m(this.f28666j, i11, d10, g10);
                    }
                }
                i11 += m10;
            } while (this.f28664h + i11 <= i10);
            v(i11);
        }
    }

    private int c(int i10) {
        int min = Math.min(this.f28664h, this.f28674r);
        d(this.f28666j, i10, min);
        this.f28674r -= min;
        return min;
    }

    private void d(short[] sArr, int i10, int i11) {
        short[] f10 = f(this.f28668l, this.f28669m, i11);
        this.f28668l = f10;
        int i12 = this.f28658b;
        System.arraycopy(sArr, i10 * i12, f10, this.f28669m * i12, i12 * i11);
        this.f28669m += i11;
    }

    private void e(short[] sArr, int i10, int i11) {
        int i12 = this.f28664h / i11;
        int i13 = this.f28658b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f28665i[i16] = (short) (i17 / i14);
        }
    }

    private short[] f(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f28658b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    private int g(short[] sArr, int i10) {
        int i11;
        int i12 = this.f28657a;
        int i13 = i12 > 4000 ? i12 / 4000 : 1;
        if (this.f28658b == 1 && i13 == 1) {
            i11 = h(sArr, i10, this.f28662f, this.f28663g);
        } else {
            e(sArr, i10, i13);
            int h10 = h(this.f28665i, 0, this.f28662f / i13, this.f28663g / i13);
            if (i13 != 1) {
                int i14 = h10 * i13;
                int i15 = i13 * 4;
                int i16 = i14 - i15;
                int i17 = i14 + i15;
                int i18 = this.f28662f;
                if (i16 < i18) {
                    i16 = i18;
                }
                int i19 = this.f28663g;
                if (i17 > i19) {
                    i17 = i19;
                }
                if (this.f28658b == 1) {
                    i11 = h(sArr, i10, i16, i17);
                } else {
                    e(sArr, i10, 1);
                    i11 = h(this.f28665i, 0, i16, i17);
                }
            } else {
                i11 = h10;
            }
        }
        int i20 = q(this.f28677u, this.f28678v) ? this.f28675s : i11;
        this.f28676t = this.f28677u;
        this.f28675s = i11;
        return i20;
    }

    private int h(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f28658b;
        int i14 = 255;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                i18 += Math.abs(sArr[i13 + i19] - sArr[(i13 + i11) + i19]);
            }
            if (i18 * i16 < i15 * i11) {
                i16 = i11;
                i15 = i18;
            }
            if (i18 * i14 > i17 * i11) {
                i14 = i11;
                i17 = i18;
            }
            i11++;
        }
        this.f28677u = i15 / i16;
        this.f28678v = i17 / i14;
        return i16;
    }

    private int m(short[] sArr, int i10, double d10, int i11) {
        int i12;
        int i13 = i11;
        if (d10 < 0.5d) {
            double d11 = ((((double) i13) * d10) / (1.0d - d10)) + this.f28679w;
            i12 = (int) Math.round(d11);
            this.f28679w = d11 - ((double) i12);
        } else {
            double d12 = ((((double) i13) * ((2.0d * d10) - 1.0d)) / (1.0d - d10)) + this.f28679w;
            int round = (int) Math.round(d12);
            this.f28674r = round;
            this.f28679w = d12 - ((double) round);
            i12 = i13;
        }
        int i14 = i13 + i12;
        short[] f10 = f(this.f28668l, this.f28669m, i14);
        this.f28668l = f10;
        int i15 = this.f28658b;
        short[] sArr2 = sArr;
        System.arraycopy(sArr2, i10 * i15, f10, this.f28669m * i15, i15 * i13);
        p(i12, this.f28658b, this.f28668l, this.f28669m + i13, sArr, i10 + i13, sArr2, i10);
        this.f28669m += i14;
        return i12;
    }

    private short n(short[] sArr, int i10, long j10, long j11) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f28658b];
        long j12 = ((long) this.f28673q) * j10;
        int i11 = this.f28672p;
        long j13 = ((long) i11) * j11;
        long j14 = ((long) (i11 + 1)) * j11;
        long j15 = j14 - j12;
        long j16 = j14 - j13;
        return (short) ((int) (((((long) s10) * j15) + ((j16 - j15) * ((long) s11))) / j16));
    }

    private void o(int i10) {
        int i11 = this.f28669m - i10;
        short[] f10 = f(this.f28670n, this.f28671o, i11);
        this.f28670n = f10;
        short[] sArr = this.f28668l;
        int i12 = this.f28658b;
        System.arraycopy(sArr, i10 * i12, f10, this.f28671o * i12, i12 * i11);
        this.f28669m = i10;
        this.f28671o += i11;
    }

    private static void p(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr2[i18] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    private boolean q(int i10, int i11) {
        return i10 != 0 && this.f28675s != 0 && i11 <= i10 * 3 && i10 * 2 > this.f28676t * 3;
    }

    private void r() {
        int i10 = this.f28669m;
        float f10 = this.f28659c;
        float f11 = this.f28660d;
        double d10 = (double) (f10 / f11);
        float f12 = this.f28661e * f11;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            b(d10);
        } else {
            d(this.f28666j, 0, this.f28667k);
            this.f28667k = 0;
        }
        if (f12 != 1.0f) {
            a(f12, i10);
        }
    }

    private void u(int i10) {
        if (i10 != 0) {
            short[] sArr = this.f28670n;
            int i11 = this.f28658b;
            System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f28671o - i10) * i11);
            this.f28671o -= i10;
        }
    }

    private void v(int i10) {
        int i11 = this.f28667k - i10;
        short[] sArr = this.f28666j;
        int i12 = this.f28658b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f28667k = i11;
    }

    private int w(short[] sArr, int i10, double d10, int i11) {
        int i12;
        int i13 = i11;
        if (d10 >= 2.0d) {
            double d11 = (((double) i13) / (d10 - 1.0d)) + this.f28679w;
            i12 = (int) Math.round(d11);
            this.f28679w = d11 - ((double) i12);
        } else {
            double d12 = ((((double) i13) * (2.0d - d10)) / (d10 - 1.0d)) + this.f28679w;
            int round = (int) Math.round(d12);
            this.f28674r = round;
            this.f28679w = d12 - ((double) round);
            i12 = i13;
        }
        short[] f10 = f(this.f28668l, this.f28669m, i12);
        this.f28668l = f10;
        p(i12, this.f28658b, f10, this.f28669m, sArr, i10, sArr, i10 + i13);
        this.f28669m += i12;
        return i12;
    }

    public void i() {
        this.f28667k = 0;
        this.f28669m = 0;
        this.f28671o = 0;
        this.f28672p = 0;
        this.f28673q = 0;
        this.f28674r = 0;
        this.f28675s = 0;
        this.f28676t = 0;
        this.f28677u = 0;
        this.f28678v = 0;
        this.f28679w = 0.0d;
    }

    public void j(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f28658b, this.f28669m);
        shortBuffer.put(this.f28668l, 0, this.f28658b * min);
        int i10 = this.f28669m - min;
        this.f28669m = i10;
        short[] sArr = this.f28668l;
        int i11 = this.f28658b;
        System.arraycopy(sArr, min * i11, sArr, 0, i10 * i11);
    }

    public int k() {
        return this.f28669m * this.f28658b * 2;
    }

    public int l() {
        return this.f28667k * this.f28658b * 2;
    }

    public void s() {
        int i10;
        int i11 = this.f28667k;
        float f10 = this.f28659c;
        float f11 = this.f28660d;
        int i12 = this.f28674r;
        int i13 = this.f28669m + ((int) ((((((((double) (i11 - i12)) / ((double) (f10 / f11))) + ((double) i12)) + this.f28679w) + ((double) this.f28671o)) / ((double) (this.f28661e * f11))) + 0.5d));
        this.f28679w = 0.0d;
        this.f28666j = f(this.f28666j, i11, (this.f28664h * 2) + i11);
        int i14 = 0;
        while (true) {
            i10 = this.f28664h;
            int i15 = this.f28658b;
            if (i14 >= i10 * 2 * i15) {
                break;
            }
            this.f28666j[(i15 * i11) + i14] = 0;
            i14++;
        }
        this.f28667k += i10 * 2;
        r();
        if (this.f28669m > i13) {
            this.f28669m = i13;
        }
        this.f28667k = 0;
        this.f28674r = 0;
        this.f28671o = 0;
    }

    public void t(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i10 = this.f28658b;
        int i11 = remaining / i10;
        short[] f10 = f(this.f28666j, this.f28667k, i11);
        this.f28666j = f10;
        shortBuffer.get(f10, this.f28667k * this.f28658b, ((i10 * i11) * 2) / 2);
        this.f28667k += i11;
        r();
    }
}
