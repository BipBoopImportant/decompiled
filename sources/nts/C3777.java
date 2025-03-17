package nts;

/* renamed from: nts.რ  reason: contains not printable characters */
public class C3777 extends C3793 {

    /* renamed from: и  reason: contains not printable characters */
    public int[] f1255;

    /* renamed from: ࡑ  reason: contains not printable characters */
    public int[] f1256;

    /* renamed from: ᖑ  reason: contains not printable characters */
    public int[] f1257;

    /* renamed from: ᘺ  reason: contains not printable characters */
    public int[] f1258;

    /* renamed from: ᜇ  reason: contains not printable characters */
    public int[] f1259;

    public C3777(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        super(bArr2, 8, 8, i10, i11, i12);
        int[] iArr = new int[18];
        this.f1258 = iArr;
        int[] iArr2 = new int[256];
        this.f1256 = iArr2;
        int[] iArr3 = new int[256];
        this.f1255 = iArr3;
        int[] iArr4 = new int[256];
        this.f1257 = iArr4;
        int[] iArr5 = new int[256];
        this.f1259 = iArr5;
        C3608.m468(bArr, iArr, iArr2, iArr3, iArr4, iArr5);
        this.f104 = true;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m1257() {
        int i10 = this.f109;
        if (i10 == 4 || i10 == 3) {
            C3608.m475(this.f99, this.f1258, this.f1256, this.f1255, this.f1257, this.f1259);
            return;
        }
        byte[] bArr = this.f99;
        int[] iArr = this.f1258;
        int[] iArr2 = this.f1256;
        int[] iArr3 = this.f1255;
        int[] iArr4 = this.f1257;
        int[] iArr5 = this.f1259;
        int i11 = 0;
        int[] iArr6 = {C3608.m469(bArr, 0)};
        int[] iArr7 = {C3608.m469(bArr, 4)};
        iArr6[0] = iArr6[0] ^ iArr[17];
        int i12 = 16;
        while (i12 > 0) {
            int[] iArr8 = iArr;
            int[] iArr9 = iArr2;
            int[] iArr10 = iArr3;
            int[] iArr11 = iArr4;
            int[] iArr12 = iArr5;
            int[] iArr13 = iArr7;
            int i13 = i11;
            int[] iArr14 = iArr6;
            int r92 = C3608.m471(iArr8, iArr9, iArr10, iArr11, iArr12, iArr7[i11], iArr6[i11], i12);
            iArr13[i13] = r92;
            iArr14[i13] = C3608.m471(iArr8, iArr9, iArr10, iArr11, iArr12, iArr14[i13], r92, i12 - 1);
            i12 -= 2;
            i11 = i13;
            iArr6 = iArr14;
            iArr7 = iArr13;
        }
        int[] iArr15 = iArr7;
        int i14 = i11;
        int[] iArr16 = iArr6;
        int i15 = iArr15[i14] ^ iArr[i14];
        iArr15[i14] = i15;
        int i16 = iArr16[i14];
        iArr16[i14] = i15;
        iArr15[i14] = i16;
        C3608.m472(iArr16[i14], bArr, i14);
        C3608.m472(iArr15[i14], bArr, 4);
    }
}
