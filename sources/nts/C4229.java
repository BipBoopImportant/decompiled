package nts;

/* renamed from: nts.ㆌ  reason: contains not printable characters */
public class C4229 extends C3793 {

    /* renamed from: ᘺ  reason: contains not printable characters */
    public int[] f4236;

    public C4229(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        super(bArr2, 8, 8, i10, i11, i12);
        int[] iArr = new int[32];
        this.f4236 = iArr;
        C3576.m321(bArr, 0, iArr);
        this.f104 = true;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m3853() {
        int i10 = this.f109;
        if (i10 == 4 || i10 == 3) {
            C3576.m322(this.f99, this.f4236);
            return;
        }
        byte[] bArr = this.f99;
        int[] iArr = this.f4236;
        int[] iArr2 = new int[2];
        int i11 = 0;
        for (int i12 = 0; i12 < 2; i12++) {
            byte b10 = ((bArr[i11 + 1] << 8) & 65280) | (bArr[i11] & 255);
            int i13 = i11 + 3;
            i11 += 4;
            iArr2[i12] = b10 | ((bArr[i11 + 2] << 16) & 16711680) | ((bArr[i13] << 24) & -16777216);
        }
        C3576.m323(iArr2, iArr);
        int i14 = 0;
        for (int i15 = 0; i15 < 2; i15++) {
            int i16 = iArr2[i15];
            bArr[i14] = (byte) i16;
            bArr[i14 + 1] = (byte) (i16 >>> 8);
            int i17 = i14 + 3;
            bArr[i14 + 2] = (byte) (i16 >>> 16);
            i14 += 4;
            bArr[i17] = (byte) (i16 >>> 24);
        }
    }
}
