package nts;

/* renamed from: nts.ဃ  reason: contains not printable characters */
public class C3765 extends C3793 {

    /* renamed from: ᘺ  reason: contains not printable characters */
    public int[] f1224;

    public C3765(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        super(bArr2, bArr2.length, bArr2.length, i10, i11, i12);
        int[] iArr = new int[4];
        this.f1224 = iArr;
        C3739.m1128(bArr, iArr);
        this.f104 = true;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m1213() {
        int i10 = this.f109;
        if (i10 == 4 || i10 == 3) {
            C3739.m1131(this.f99, this.f1224);
            return;
        }
        byte[] bArr = this.f99;
        int[] iArr = this.f1224;
        int length = bArr.length >>> 2;
        int[] iArr2 = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr2[i11] = C3739.m1129(bArr, i11 * 4);
        }
        int i12 = iArr2[0];
        for (int i13 = ((52 / length) + 6) * -1640531527; i13 != 0; i13 -= -1640531527) {
            int i14 = (i13 >>> 2) & 3;
            int i15 = length - 1;
            int i16 = i15;
            while (i16 > 0) {
                int i17 = iArr2[i16 - 1];
                i12 = iArr2[i16] - (((i12 ^ i13) + (iArr[(i16 & 3) ^ i14] ^ i17)) ^ (((i17 >>> 5) ^ (i12 << 2)) + ((i12 >>> 3) ^ (i17 << 4))));
                iArr2[i16] = i12;
                i16--;
            }
            int i18 = iArr2[i15];
            i12 = iArr2[0] - (((i12 ^ i13) + (iArr[i14 ^ (i16 & 3)] ^ i18)) ^ (((i18 >>> 5) ^ (i12 << 2)) + ((i12 >>> 3) ^ (i18 << 4))));
            iArr2[0] = i12;
        }
        for (int i19 = 0; i19 < length; i19++) {
            C3739.m1130(iArr2[i19], bArr, i19 * 4);
        }
    }
}
