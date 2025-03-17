package nts;

/* renamed from: nts.එ  reason: contains not printable characters */
public class C3739 extends C3935 {
    public C3739() {
        this.f910 = new C4124[]{new C4124(128, 128, 0)};
        this.f916 = new C4124[]{new C4124(64, 2147483615, 32)};
        this.f912 = 64;
        this.f914 = 64;
        this.f913 = 128;
        this.f911 = 1;
        this.f909 = 1;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public static void m1128(byte[] bArr, int[] iArr) {
        for (int i10 = 0; i10 < 4; i10++) {
            iArr[i10] = m1129(bArr, i10 * 4);
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static int m1129(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] << 24) & -16777216) | ((bArr[i10 + 1] << 16) & 16711680) | ((bArr[i10 + 2] << 8) & 65280);
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m1132() {
        m901(C3990.m2428(this.f913 / 8));
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m1135() {
        m905(C3990.m2428(this.f912 / 8));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1130(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) (i10 >>> 24);
        bArr[i11 + 1] = (byte) (i10 >>> 16);
        bArr[i11 + 2] = (byte) (i10 >>> 8);
        bArr[i11 + 3] = (byte) i10;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public C4193 m1133(byte[] bArr, byte[] bArr2) {
        return new C3572(bArr, bArr2, this.f911, this.f909, this.f914);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public C4193 m1134(byte[] bArr, byte[] bArr2) {
        return new C3765(bArr, bArr2, this.f911, this.f909, this.f914);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1131(byte[] bArr, int[] iArr) {
        byte[] bArr2 = bArr;
        int length = bArr2.length >>> 2;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr2[i10] = m1129(bArr2, i10 * 4);
        }
        int i11 = length - 1;
        int i12 = iArr2[i11];
        int i13 = 0;
        for (int i14 = (52 / length) + 6; i14 > 0; i14--) {
            i13 -= 1640531527;
            int i15 = (i13 >>> 2) & 3;
            int i16 = 0;
            while (i16 < i11) {
                int i17 = i16 + 1;
                int i18 = iArr2[i17];
                i12 = ((((i12 >>> 5) ^ (i18 << 2)) + ((i18 >>> 3) ^ (i12 << 4))) ^ ((i18 ^ i13) + (i12 ^ iArr[(i16 & 3) ^ i15]))) + iArr2[i16];
                iArr2[i16] = i12;
                i16 = i17;
            }
            int i19 = iArr2[0];
            i12 = ((((i12 >>> 5) ^ (i19 << 2)) + ((i19 >>> 3) ^ (i12 << 4))) ^ ((i19 ^ i13) + (i12 ^ iArr[i15 ^ (i16 & 3)]))) + iArr2[i11];
            iArr2[i11] = i12;
        }
        for (int i20 = 0; i20 < length; i20++) {
            m1130(iArr2[i20], bArr2, i20 * 4);
        }
    }
}
