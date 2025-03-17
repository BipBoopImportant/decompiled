package nts;

/* renamed from: nts.ߧ  reason: contains not printable characters */
public class C3665 extends C3580 {
    public C3665() {
        this.f910 = new C4124[]{new C4124(128, 192, 64)};
        this.f913 = 128;
        this.f912 = 64;
        this.f914 = 64;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m721(byte[] bArr, int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[2];
        int i10 = 0;
        for (int i11 = 0; i11 < 2; i11++) {
            byte b10 = ((bArr[i10 + 1] << 8) & 65280) | (bArr[i10] & 255);
            int i12 = i10 + 3;
            i10 += 4;
            iArr4[i11] = b10 | ((bArr[i10 + 2] << 16) & 16711680) | ((bArr[i12] << 24) & -16777216);
        }
        C3576.m319(iArr4, iArr);
        C3576.m323(iArr4, iArr2);
        C3576.m319(iArr4, iArr3);
        int i13 = 0;
        for (int i14 = 0; i14 < 2; i14++) {
            int i15 = iArr4[i14];
            bArr[i13] = (byte) i15;
            bArr[i13 + 1] = (byte) (i15 >>> 8);
            int i16 = i13 + 3;
            bArr[i13 + 2] = (byte) (i15 >>> 16);
            i13 += 4;
            bArr[i16] = (byte) (i15 >>> 24);
        }
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public C4193 m722(byte[] bArr, byte[] bArr2) {
        return new C3606(bArr, bArr2, this.f911, this.f909, this.f914);
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m723(byte[] bArr) {
        super.m340(bArr);
        C3580.m337(this.f915);
        C3580.m337(this.f915);
        byte[] bArr2 = this.f915;
        if (bArr2.length == 24) {
            C3580.m337(bArr2);
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public C4193 m724(byte[] bArr, byte[] bArr2) {
        return new C3570(bArr, bArr2, this.f911, this.f909, this.f914);
    }
}
