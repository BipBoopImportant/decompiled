package androidx.media3.exoplayer.video.spherical;

import androidx.media3.exoplayer.video.spherical.c;
import java.util.ArrayList;
import java.util.zip.Inflater;
import t3.A;
import t3.B;
import t3.N;

final class d {
    public static c a(byte[] bArr, int i10) {
        ArrayList<c.a> arrayList;
        B b10 = new B(bArr);
        try {
            arrayList = c(b10) ? f(b10) : e(b10);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size == 1) {
            return new c(arrayList.get(0), i10);
        }
        if (size != 2) {
            return null;
        }
        return new c(arrayList.get(0), arrayList.get(1), i10);
    }

    private static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >> 1);
    }

    private static boolean c(B b10) {
        b10.X(4);
        int q10 = b10.q();
        b10.W(0);
        return q10 == 1886547818;
    }

    private static c.a d(B b10) {
        int q10 = b10.q();
        if (q10 > 10000) {
            return null;
        }
        float[] fArr = new float[q10];
        for (int i10 = 0; i10 < q10; i10++) {
            fArr[i10] = b10.p();
        }
        int q11 = b10.q();
        if (q11 > 32000) {
            return null;
        }
        double d10 = 2.0d;
        double log = Math.log(2.0d);
        int ceil = (int) Math.ceil(Math.log(((double) q10) * 2.0d) / log);
        A a10 = new A(b10.e());
        int i11 = 8;
        a10.p(b10.f() * 8);
        float[] fArr2 = new float[(q11 * 5)];
        int i12 = 5;
        int[] iArr = new int[5];
        int i13 = 0;
        int i14 = 0;
        while (i13 < q11) {
            int i15 = 0;
            while (i15 < i12) {
                int b11 = iArr[i15] + b(a10.h(ceil));
                if (b11 >= q10 || b11 < 0) {
                    return null;
                }
                fArr2[i14] = fArr[b11];
                iArr[i15] = b11;
                i15++;
                i14++;
                i12 = 5;
            }
            i13++;
            i12 = 5;
        }
        a10.p((a10.e() + 7) & -8);
        int i16 = 32;
        int h10 = a10.h(32);
        c.b[] bVarArr = new c.b[h10];
        int i17 = 0;
        while (i17 < h10) {
            int h11 = a10.h(i11);
            int h12 = a10.h(i11);
            int h13 = a10.h(i16);
            if (h13 > 128000) {
                return null;
            }
            int i18 = h11;
            int ceil2 = (int) Math.ceil(Math.log(((double) q11) * d10) / log);
            float[] fArr3 = new float[(h13 * 3)];
            float[] fArr4 = new float[(h13 * 2)];
            int i19 = 0;
            for (int i20 = 0; i20 < h13; i20++) {
                i19 += b(a10.h(ceil2));
                if (i19 < 0 || i19 >= q11) {
                    return null;
                }
                int i21 = i20 * 3;
                int i22 = i19 * 5;
                fArr3[i21] = fArr2[i22];
                fArr3[i21 + 1] = fArr2[i22 + 1];
                fArr3[i21 + 2] = fArr2[i22 + 2];
                int i23 = i20 * 2;
                fArr4[i23] = fArr2[i22 + 3];
                fArr4[i23 + 1] = fArr2[i22 + 4];
            }
            bVarArr[i17] = new c.b(i18, fArr3, fArr4, h12);
            i17++;
            i16 = 32;
            d10 = 2.0d;
            i11 = 8;
        }
        return new c.a(bVarArr);
    }

    private static ArrayList<c.a> e(B b10) {
        if (b10.H() != 0) {
            return null;
        }
        b10.X(7);
        int q10 = b10.q();
        if (q10 == 1684433976) {
            B b11 = new B();
            Inflater inflater = new Inflater(true);
            try {
                if (!N.z0(b10, b11, inflater)) {
                    return null;
                }
                inflater.end();
                b10 = b11;
            } finally {
                inflater.end();
            }
        } else if (q10 != 1918990112) {
            return null;
        }
        return g(b10);
    }

    private static ArrayList<c.a> f(B b10) {
        int q10;
        b10.X(8);
        int f10 = b10.f();
        int g10 = b10.g();
        while (f10 < g10 && (q10 = b10.q() + f10) > f10 && q10 <= g10) {
            int q11 = b10.q();
            if (q11 == 2037673328 || q11 == 1836279920) {
                b10.V(q10);
                return e(b10);
            }
            b10.W(q10);
            f10 = q10;
        }
        return null;
    }

    private static ArrayList<c.a> g(B b10) {
        ArrayList<c.a> arrayList = new ArrayList<>();
        int f10 = b10.f();
        int g10 = b10.g();
        while (f10 < g10) {
            int q10 = b10.q() + f10;
            if (q10 <= f10 || q10 > g10) {
                return null;
            }
            if (b10.q() == 1835365224) {
                c.a d10 = d(b10);
                if (d10 == null) {
                    return null;
                }
                arrayList.add(d10);
            }
            b10.W(q10);
            f10 = q10;
        }
        return arrayList;
    }
}
