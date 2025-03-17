package nts;

/* renamed from: nts.ぼ  reason: contains not printable characters */
public class C4201 extends C3749 {

    /* renamed from: ગ  reason: contains not printable characters */
    public int[] f4047;

    /* renamed from: ഇ  reason: contains not printable characters */
    public int[] f4048 = new int[256];

    public C4201() {
        int[] iArr = new int[2];
        this.f4047 = iArr;
        iArr[1] = 0;
        iArr[0] = 0;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m3754(byte[] bArr) {
        int[] iArr = this.f4047;
        iArr[1] = 0;
        iArr[0] = 0;
        if (bArr != null && bArr.length != 0) {
            for (int i10 = 0; i10 < 256; i10++) {
                this.f4048[i10] = i10;
            }
            int i11 = 0;
            for (int i12 = 0; i12 < 256; i12++) {
                int[] iArr2 = this.f4048;
                int i13 = iArr2[i12];
                i11 = (i11 + i13 + bArr[i12 % bArr.length]) & 255;
                iArr2[i12] = iArr2[i11];
                iArr2[i11] = i13;
            }
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3755(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            int[] iArr = this.f4047;
            int i10 = iArr[0];
            int i11 = iArr[1];
            for (int i12 = 0; i12 < bArr.length; i12++) {
                i10 = (i10 + 1) & 255;
                int[] iArr2 = this.f4048;
                int i13 = iArr2[i10];
                i11 = (i11 + i13) & 255;
                iArr2[i10] = iArr2[i11];
                iArr2[i11] = i13;
                bArr[i12] = (byte) (iArr2[(iArr2[i10] + i13) & 255] & 255);
            }
            int[] iArr3 = this.f4047;
            iArr3[0] = i10;
            iArr3[1] = i11;
        }
    }
}
