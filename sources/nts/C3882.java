package nts;

/* renamed from: nts.ᑐ  reason: contains not printable characters */
public class C3882 extends C3793 {

    /* renamed from: и  reason: contains not printable characters */
    public int f1762 = 10;

    /* renamed from: ࡑ  reason: contains not printable characters */
    public int f1763;

    /* renamed from: ᘺ  reason: contains not printable characters */
    public int[] f1764;

    public C3882(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13) {
        super(bArr2, i12, i12, i10, i11, i13);
        int[] iArr = new int[120];
        this.f1764 = iArr;
        this.f1763 = i12;
        int i14 = this.f109;
        if (i14 == 4 || i14 == 3) {
            this.f1762 = C3720.m1015(bArr, i12, iArr, new int[120]);
        } else {
            this.f1762 = C3720.m1015(bArr, i12, new int[120], iArr);
        }
        this.f104 = true;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m1941() {
        int i10 = this.f109;
        if (i10 == 4 || i10 == 3) {
            C3720.m1016(this.f99, this.f1764, this.f1762, this.f1763);
            return;
        }
        byte[] bArr = this.f99;
        int[] iArr = this.f1764;
        int i11 = this.f1762;
        int i12 = this.f1763;
        if (i12 == 16) {
            C3724.m1026(bArr, iArr, i11);
            return;
        }
        int i13 = i12 / 4;
        int i14 = i13 == 4 ? 0 : i13 == 6 ? 1 : 2;
        int[] iArr2 = C3720.f984;
        int i15 = i14 * 4;
        int i16 = iArr2[i15 + 1];
        int i17 = iArr2[i15 + 2];
        int i18 = iArr2[i15 + 3];
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[i13];
        int i19 = 0;
        for (int i20 = 0; i20 < i13; i20++) {
            iArr4[i20] = C3720.m1014(bArr, i19) ^ iArr[i20];
            i19 += 4;
        }
        for (int i21 = 1; i21 < i11; i21++) {
            for (int i22 = 0; i22 < i13; i22++) {
                iArr3[i22] = (((C3720.f976[(iArr4[i22] >>> 24) & 255] ^ C3720.f978[(iArr4[(i22 + i16) % i13] >>> 16) & 255]) ^ C3720.f982[(iArr4[(i22 + i17) % i13] >>> 8) & 255]) ^ C3720.f989[iArr4[(i22 + i18) % i13] & 255]) ^ iArr[(i21 * i13) + i22];
            }
            System.arraycopy(iArr3, 0, iArr4, 0, i13);
        }
        int i23 = 0;
        int i24 = 0;
        while (i24 < i13) {
            int i25 = iArr[(i11 * i13) + i24];
            int[] iArr5 = C3720.f977;
            bArr[i23] = (byte) (iArr5[(iArr4[i24] >>> 24) & 255] ^ (i25 >>> 24));
            int[] iArr6 = iArr;
            bArr[i23 + 1] = (byte) (iArr5[(iArr4[(i24 + i16) % i13] >>> 16) & 255] ^ (i25 >>> 16));
            int i26 = i23 + 3;
            bArr[i23 + 2] = (byte) (iArr5[(iArr4[(i24 + i17) % i13] >>> 8) & 255] ^ (i25 >>> 8));
            i23 += 4;
            bArr[i26] = (byte) (i25 ^ iArr5[iArr4[(i24 + i18) % i13] & 255]);
            i24++;
            iArr = iArr6;
        }
    }
}
