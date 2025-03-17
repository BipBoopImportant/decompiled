package nts;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: nts.カ  reason: contains not printable characters */
public class C4204 {

    /* renamed from: ગ  reason: contains not printable characters */
    public C4070 f4062;

    /* renamed from: ഇ  reason: contains not printable characters */
    public byte[] f4063;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public C3590 f4064;

    public C4204(C3590 r12, C4070 r22) {
        this.f4064 = r12;
        this.f4063 = new byte[RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT];
        this.f4062 = r22;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final int m3760() {
        int i10;
        int i11;
        C4070 r02 = this.f4062;
        byte[] bArr = this.f4063;
        int length = bArr.length;
        C4035 r03 = (C4035) r02;
        if (!r03.f3346.m3245()) {
            i10 = r03.f3346.m3242(bArr, 0, length);
            r03.f3345 += (long) i10;
        } else {
            int i12 = r03.f3350;
            int i13 = r03.f3351;
            if (i12 < i13) {
                int i14 = r03.f3349;
                if ((i13 + i14) - i12 >= 65535) {
                    int i15 = r03.f3347 - 32768;
                    byte[] bArr2 = r03.f3348;
                    System.arraycopy(bArr2, i15, bArr2, 0, i14 - i15);
                    for (int i16 = 0; i16 < 16384; i16++) {
                        short[] sArr = r03.f2805;
                        short s10 = sArr[i16];
                        short s11 = s10 & 65535;
                        if (s11 != 65535) {
                            if (s11 < i15) {
                                sArr[i16] = -1;
                            } else {
                                sArr[i16] = (short) (s10 - ((short) i15));
                            }
                        }
                    }
                    int i17 = i15;
                    while (true) {
                        i11 = r03.f3347;
                        if (i17 >= i11) {
                            break;
                        }
                        short[] sArr2 = r03.f2808;
                        short s12 = sArr2[i17] & 65535;
                        if (s12 == 65535 || s12 < i15) {
                            sArr2[i17 - i15] = -1;
                        } else {
                            sArr2[i17 - i15] = (short) (s12 - i15);
                        }
                        i17++;
                    }
                    r03.f3347 = i11 - i15;
                    r03.f3349 -= i15;
                }
                int min = Math.min(65535 - r03.f3349, r03.f3351 - r03.f3350);
                System.arraycopy(r03.f3343, r03.f3350, r03.f3348, r03.f3349, min);
                r03.f3349 += min;
                r03.f3350 += min;
            }
            if (r03.f3347 + 257 > r03.f3349 || !r03.m2680(true)) {
                int i18 = r03.f3344;
                int i19 = 2;
                if (i18 == 1 || i18 == 3) {
                    r03.m2680(false);
                    if (r03.f3347 != r03.f3349) {
                        r03.f2807.m112(r03.f3346, false);
                        r03.f2807.m111();
                        i10 = r03.f3346.m3242(bArr, 0, length);
                        r03.f3345 += (long) i10;
                    } else {
                        r03.f2807.m112(r03.f3346, r03.f3344 == 1);
                        r03.f2807.m111();
                        if (r03.f3344 == 1) {
                            r03.f3346.m3243();
                        }
                        if (r03.f3344 != 1) {
                            i19 = 0;
                        }
                        r03.f3344 = i19;
                        i10 = r03.f3346.m3242(bArr, 0, length);
                        r03.f3345 += (long) i10;
                    }
                } else if (i18 == 2) {
                    i10 = r03.f3346.m3242(bArr, 0, length);
                    r03.f3345 += (long) i10;
                } else {
                    i10 = 0;
                }
            } else {
                r03.f2807.m112(r03.f3346, false);
                r03.f2807.m111();
                i10 = r03.f3346.m3242(bArr, 0, length);
                r03.f3345 += (long) i10;
            }
        }
        byte[] bArr3 = this.f4063;
        if (i10 > 0) {
            this.f4064.m348(bArr3, 0, i10);
        }
        return i10;
    }

    public C4204(C3590 r22) {
        this(r22, new C4035());
    }
}
