package nts;

/* renamed from: nts.τ  reason: contains not printable characters */
public class C3570 extends C3793 {

    /* renamed from: и  reason: contains not printable characters */
    public int[] f153 = new int[32];

    /* renamed from: ࡑ  reason: contains not printable characters */
    public int[] f154 = new int[32];

    /* renamed from: ᘺ  reason: contains not printable characters */
    public int[] f155;

    public C3570(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        super(bArr2, 8, 8, i10, i11, i12);
        int[] iArr = new int[32];
        this.f155 = iArr;
        C3576.m321(bArr, 0, iArr);
        C3576.m321(bArr, 8, this.f154);
        if (bArr.length == 24) {
            int[] iArr2 = new int[32];
            this.f153 = iArr2;
            C3576.m321(bArr, 16, iArr2);
        } else {
            this.f153 = this.f155;
        }
        this.f104 = true;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m219() {
        int i10 = this.f109;
        if (i10 == 4 || i10 == 3) {
            C3665.m721(this.f99, this.f155, this.f154, this.f153);
            return;
        }
        byte[] bArr = this.f99;
        int[] iArr = this.f155;
        int[] iArr2 = this.f154;
        int[] iArr3 = this.f153;
        int[] iArr4 = new int[2];
        int i11 = 0;
        for (int i12 = 0; i12 < 2; i12++) {
            byte b10 = ((bArr[i11 + 1] << 8) & 65280) | (bArr[i11] & 255);
            int i13 = i11 + 3;
            i11 += 4;
            iArr4[i12] = b10 | ((bArr[i11 + 2] << 16) & 16711680) | ((bArr[i13] << 24) & -16777216);
        }
        C3576.m323(iArr4, iArr3);
        C3576.m319(iArr4, iArr2);
        C3576.m323(iArr4, iArr);
        int i14 = 0;
        for (int i15 = 0; i15 < 2; i15++) {
            int i16 = iArr4[i15];
            bArr[i14] = (byte) i16;
            bArr[i14 + 1] = (byte) (i16 >>> 8);
            int i17 = i14 + 3;
            bArr[i14 + 2] = (byte) (i16 >>> 16);
            i14 += 4;
            bArr[i17] = (byte) (i16 >>> 24);
        }
    }
}
