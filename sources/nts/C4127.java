package nts;

import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;

/* renamed from: nts.Ⅼ  reason: contains not printable characters */
public class C4127 {

    /* renamed from: ഇ  reason: contains not printable characters */
    public short[] f3584;

    public C4127(byte[] bArr) {
        m3314(bArr);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final void m3314(byte[] bArr) {
        int i10;
        int i11;
        byte[] bArr2 = bArr;
        int[] iArr = new int[16];
        for (int i12 = 0; i12 < 16; i12++) {
            iArr[i12] = 0;
        }
        int[] iArr2 = new int[16];
        for (int i13 = 0; i13 < 16; i13++) {
            iArr2[i13] = 0;
        }
        for (byte b10 : bArr2) {
            if (b10 > 0) {
                iArr[b10] = iArr[b10] + 1;
            }
        }
        int i14 = 512;
        int i15 = 0;
        int i16 = 1;
        while (true) {
            i11 = 15;
            if (i16 > 15) {
                break;
            }
            iArr2[i16] = i15;
            int i17 = 16 - i16;
            int i18 = (iArr[i16] << i17) + i15;
            if (i16 >= 10) {
                i14 += ((i18 & 130944) - (i15 & 130944)) >> i17;
            }
            i16++;
            i15 = i18;
        }
        if ((i15 & 32767) == 0) {
            this.f3584 = new short[i14];
            int i19 = 512;
            for (i10 = 10; i11 >= i10; i10 = 10) {
                int i20 = i15 & 130944;
                i15 -= iArr[i11] << (16 - i11);
                for (int i21 = i15 & 130944; i21 < i20; i21 += 128) {
                    this.f3584[C4175.m3507(i21)] = (short) (((-i19) << 4) | i11);
                    i19 += 1 << (i11 - 9);
                }
                i11--;
            }
            for (int i22 = 0; i22 < bArr2.length; i22++) {
                byte b11 = bArr2[i22];
                if (b11 != 0) {
                    int i23 = iArr2[b11];
                    int r82 = C4175.m3507(i23);
                    if (b11 <= 9) {
                        do {
                            this.f3584[r82] = (short) ((i22 << 4) | b11);
                            r82 += 1 << b11;
                        } while (r82 < 512);
                    } else {
                        short s10 = this.f3584[r82 & 511];
                        int i24 = 1 << (s10 & 15);
                        int i25 = -(s10 >> 4);
                        do {
                            this.f3584[(r82 >> 9) | i25] = (short) ((i22 << 4) | b11);
                            r82 += 1 << b11;
                        } while (r82 < i24);
                    }
                    iArr2[b11] = i23 + (1 << (16 - b11));
                }
            }
            return;
        }
        throw new C3625((Throwable) null, CheckoutActivity.RESULT_CANCELED, C3727.m1052("}PXX\u001aW]WQC\\F\u0012W__\t[\fLNO\b\\V\u0007", 0, 26, 36));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m3313(C3860 r72) {
        short s10;
        int r12 = r72.m1853(9);
        if (r12 >= 0) {
            short s11 = this.f3584[r12];
            if (s11 >= 0) {
                r72.m1857(s11 & 15);
                return s11 >> 4;
            }
            int i10 = -(s11 >> 4);
            int r13 = r72.m1853(s11 & 15);
            if (r13 >= 0) {
                short s12 = this.f3584[(r13 >> 9) | i10];
                r72.m1857(s12 & 15);
                return s12 >> 4;
            }
            int i11 = r72.f1672;
            short s13 = this.f3584[(r72.m1853(i11) >> 9) | i10];
            short s14 = s13 & 15;
            if (s14 > i11) {
                return -1;
            }
            r72.m1857(s14);
            return s13 >> 4;
        }
        int i12 = r72.f1672;
        short s15 = this.f3584[r72.m1853(i12)];
        if (s15 < 0 || (s10 = s15 & 15) > i12) {
            return -1;
        }
        r72.m1857(s10);
        return s15 >> 4;
    }
}
