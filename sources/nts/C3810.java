package nts;

import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: nts.ሉ  reason: contains not printable characters */
public class C3810 {

    /* renamed from: ഇ  reason: contains not printable characters */
    public static final byte[] f1511 = {-90, -90, -90, -90, -90, -90, -90, -90};

    /* renamed from: ગ  reason: contains not printable characters */
    public Cipher f1512;

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1548(long j10, byte[] bArr, int i10) {
        for (int i11 = 7; i11 >= 0; i11--) {
            bArr[i10 + i11] = (byte) ((int) (255 & j10));
            j10 >>>= 8;
        }
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public byte[] m1549(byte[] bArr, byte[] bArr2, int i10, int i11) {
        int i12 = i11;
        if (C3596.f367) {
            return m1551(bArr, (byte[]) null, bArr2, i10, i11, true);
        }
        byte[] bArr3 = f1511;
        if (i12 >= 16 && i12 % 8 == 0 && bArr3.length == 8) {
            C3550 r32 = new C3550();
            r32.f909 = 1;
            r32.f911 = 2;
            r32.m901(bArr);
            C4193 r33 = r32.m898();
            byte[] bArr4 = new byte[(i12 + 8)];
            byte[] bArr5 = new byte[16];
            int i13 = i12 / 8;
            System.arraycopy(bArr3, 0, bArr4, 0, 8);
            System.arraycopy(bArr2, i10, bArr4, 8, i12);
            for (int i14 = 0; i14 <= 5; i14++) {
                for (int i15 = 1; i15 <= i13; i15++) {
                    System.arraycopy(bArr4, 0, bArr5, 0, 8);
                    int i16 = i15 * 8;
                    System.arraycopy(bArr4, i16, bArr5, 8, 8);
                    r33.m3722(bArr5, 0, 16, bArr5, 0);
                    m1548((long) ((i13 * i14) + i15), bArr4, 0);
                    for (int i17 = 0; i17 < 8; i17++) {
                        bArr4[i17] = (byte) (bArr4[i17] ^ bArr5[i17]);
                    }
                    System.arraycopy(bArr5, 8, bArr4, i16, 8);
                }
            }
            return bArr4;
        }
        throw new C3738(C3727.m1052("\u000e(3%/+%`#+#+?\"g\b.5#)-#f%-%-9$a\u0001'>.+?';9a!+!&-g>83799p\u0005\u001bn,)'$$0e$\"`41&8}80*y\u001b\u001e\u0007u=2)q%!\r\u001d@vsfd\f\f\n\u0004\u001a\u0018ILYnk~bgr", 0, 15, 72));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public byte[] m1550(byte[] bArr, byte[] bArr2, int i10, int i11) {
        byte[] bArr3 = bArr2;
        int i12 = i10;
        int i13 = i11;
        if (C3596.f367) {
            return m1551(bArr, (byte[]) null, bArr2, i10, i11, false);
        }
        byte[] bArr4 = f1511;
        if (i13 >= 16 && i13 % 8 == 0 && bArr4.length == 8) {
            C3550 r72 = new C3550();
            r72.f909 = 1;
            r72.f911 = 2;
            r72.m901(bArr);
            C4193 r73 = r72.m902();
            int i14 = i13 - 8;
            byte[] bArr5 = new byte[i14];
            byte[] bArr6 = new byte[8];
            byte[] bArr7 = new byte[16];
            int i15 = (i13 / 8) - 1;
            int i16 = 0;
            System.arraycopy(bArr3, i12, bArr6, 0, 8);
            System.arraycopy(bArr3, i12 + 8, bArr5, 0, i14);
            for (int i17 = 5; i17 >= 0; i17--) {
                int i18 = i15;
                while (i18 > 0) {
                    m1548((long) ((i15 * i17) + i18), bArr7, 0);
                    for (int i19 = 0; i19 < 8; i19++) {
                        bArr7[i19] = (byte) (bArr7[i19] ^ bArr6[i19]);
                    }
                    int i20 = (i18 - 1) * 8;
                    System.arraycopy(bArr5, i20, bArr7, 8, 8);
                    r73.m3722(bArr7, 0, 16, bArr7, 0);
                    byte[] bArr8 = bArr6;
                    System.arraycopy(bArr7, 0, bArr8, 0, 8);
                    byte[] bArr9 = bArr5;
                    System.arraycopy(bArr7, 8, bArr9, i20, 8);
                    i18--;
                    bArr6 = bArr8;
                    bArr5 = bArr9;
                }
                byte[] bArr10 = bArr6;
                byte[] bArr11 = bArr5;
            }
            byte[] bArr12 = bArr6;
            byte[] bArr13 = bArr5;
            while (i16 < 8) {
                if (bArr4[i16] == bArr12[i16]) {
                    i16++;
                } else {
                    throw new C3738(C3727.m1052("\u000e(3%/+%`#+#+?\"g\b.5#)-#f%-%-9$a\u0001'>.+?';9a!+!&-g>83799p\u0005\u001bn,)'$$0e$\"`41&8}80*y\u001b\u001e\u0007u=2)q%!\r\u001d@vsfd\f\f\n\u0004\u001a\u0018ILYnk~bgr", 30, 23, 65));
                }
            }
            return bArr13;
        }
        throw new C3738(C3727.m1052("\u000e(3%/+%`#+#+?\"g\b.5#)-#f%-%-9$a\u0001'>.+?';9a!+!&-g>83799p\u0005\u001bn,)'$$0e$\"`41&8}80*y\u001b\u001e\u0007u=2)q%!\r\u001d@vsfd\f\f\n\u0004\u001a\u0018ILYnk~bgr", 15, 15, 65));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final byte[] m1551(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, int i11, boolean z10) {
        if (bArr2 == null || bArr2.length == 0 || Arrays.equals(f1511, bArr2)) {
            try {
                if (this.f1512 == null) {
                    this.f1512 = Cipher.getInstance(C3727.m1052("\u000e(3%/+%`#+#+?\"g\b.5#)-#f%-%-9$a\u0001'>.+?';9a!+!&-g>83799p\u0005\u001bn,)'$$0e$\"`41&8}80*y\u001b\u001e\u0007u=2)q%!\r\u001d@vsfd\f\f\n\u0004\u001a\u0018ILYnk~bgr", 88, 5, 106), C3727.m1052("\u000e(3%/+%`#+#+?\"g\b.5#)-#f%-%-9$a\u0001'>.+?';9a!+!&-g>83799p\u0005\u001bn,)'$$0e$\"`41&8}80*y\u001b\u001e\u0007u=2)q%!\r\u001d@vsfd\f\f\n\u0004\u001a\u0018ILYnk~bgr", 93, 6, 21));
                }
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, C3727.m1052("\u000e(3%/+%`#+#+?\"g\b.5#)-#f%-%-9$a\u0001'>.+?';9a!+!&-g>83799p\u0005\u001bn,)'$$0e$\"`41&8}80*y\u001b\u001e\u0007u=2)q%!\r\u001d@vsfd\f\f\n\u0004\u001a\u0018ILYnk~bgr", 99, 3, 72));
                if (z10) {
                    SecretKeySpec secretKeySpec2 = new SecretKeySpec(bArr3, i10, i11, C3727.m1052("\u000e(3%/+%`#+#+?\"g\b.5#)-#f%-%-9$a\u0001'>.+?';9a!+!&-g>83799p\u0005\u001bn,)'$$0e$\"`41&8}80*y\u001b\u001e\u0007u=2)q%!\r\u001d@vsfd\f\f\n\u0004\u001a\u0018ILYnk~bgr", (int) CheckoutActivity.RESULT_ERROR, 3, 106));
                    this.f1512.init(3, secretKeySpec);
                    return this.f1512.wrap(secretKeySpec2);
                }
                if (!(i10 == 0 && bArr3.length == i11)) {
                    byte[] bArr4 = new byte[i11];
                    System.arraycopy(bArr3, i10, bArr4, 0, i11);
                    bArr3 = bArr4;
                }
                this.f1512.init(4, secretKeySpec);
                return this.f1512.unwrap(bArr3, C3727.m1052("\u000e(3%/+%`#+#+?\"g\b.5#)-#f%-%-9$a\u0001'>.+?';9a!+!&-g>83799p\u0005\u001bn,)'$$0e$\"`41&8}80*y\u001b\u001e\u0007u=2)q%!\r\u001d@vsfd\f\f\n\u0004\u001a\u0018ILYnk~bgr", 105, 3, 105), 3).getEncoded();
            } catch (Exception e10) {
                throw new C3738(e10.getMessage());
            }
        } else {
            throw new C3625(0, C3727.m1052("\u000e(3%/+%`#+#+?\"g\b.5#)-#f%-%-9$a\u0001'>.+?';9a!+!&-g>83799p\u0005\u001bn,)'$$0e$\"`41&8}80*y\u001b\u001e\u0007u=2)q%!\r\u001d@vsfd\f\f\n\u0004\u001a\u0018ILYnk~bgr", 53, 35, 90));
        }
    }
}
