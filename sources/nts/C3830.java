package nts;

/* renamed from: nts.እ  reason: contains not printable characters */
public class C3830 extends C3793 {

    /* renamed from: ᘺ  reason: contains not printable characters */
    public int[] f1585;

    public C3830(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        super(bArr2, 8, 8, i10, i11, i12);
        this.f1585 = C4225.m3845(bArr);
        this.f104 = true;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m1671() {
        int i10 = this.f109;
        if (i10 == 4 || i10 == 3) {
            C4225.m3843(this.f99, this.f1585);
            return;
        }
        byte[] bArr = this.f99;
        int[] iArr = this.f1585;
        int[] iArr2 = new int[4];
        for (int i11 = 0; i11 < 4; i11++) {
            iArr2[i11] = C4225.m3840(bArr, i11 * 2);
        }
        int i12 = 63;
        for (int i13 = 0; i13 < 5; i13++) {
            i12 = C4225.m3838(iArr2, iArr, i12);
        }
        C4225.m3839(iArr2, 3, iArr);
        C4225.m3839(iArr2, 2, iArr);
        C4225.m3839(iArr2, 1, iArr);
        C4225.m3839(iArr2, 0, iArr);
        for (int i14 = 0; i14 < 6; i14++) {
            i12 = C4225.m3838(iArr2, iArr, i12);
        }
        C4225.m3839(iArr2, 3, iArr);
        C4225.m3839(iArr2, 2, iArr);
        C4225.m3839(iArr2, 1, iArr);
        C4225.m3839(iArr2, 0, iArr);
        for (int i15 = 0; i15 < 5; i15++) {
            i12 = C4225.m3838(iArr2, iArr, i12) & 255;
        }
        for (int i16 = 0; i16 < 4; i16++) {
            int i17 = iArr2[i16];
            int i18 = i16 * 2;
            bArr[i18] = (byte) i17;
            bArr[i18 + 1] = (byte) (i17 >>> 8);
        }
    }
}
