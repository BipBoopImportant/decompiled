package nts;

/* renamed from: nts.ᰟ  reason: contains not printable characters */
public class C4037 extends C4175 {

    /* renamed from: Е  reason: contains not printable characters */
    public int[] f2813;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public byte[] f2814;

    /* renamed from: ખ  reason: contains not printable characters */
    public int[] f2815;

    /* renamed from: ⴸ  reason: contains not printable characters */
    public int f2816 = 0;

    public C4037(int i10, int i11) {
        super(i10, i11);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2682(C4096 r42, C4175 r52) {
        r52.f3863 = r42;
        for (int i10 = 0; i10 < this.f2816; i10++) {
            r52.m3509(this.f2814[i10]);
            if (this.f2814[i10] > 15) {
                r42.m3244(this.f2815[i10], this.f2813[i10]);
            }
        }
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m2684() {
        byte[] bArr = this.f3862;
        this.f2814 = new byte[bArr.length];
        this.f2815 = new int[bArr.length];
        this.f2813 = new int[bArr.length];
        int i10 = 0;
        while (true) {
            byte[] bArr2 = this.f3862;
            if (i10 < bArr2.length) {
                byte b10 = bArr2[i10];
                if (b10 == 0) {
                    int i11 = i10 + 1;
                    int r32 = m2681(0, i11, 137);
                    int i12 = r32 + 1;
                    i10 += i12;
                    if (i10 == this.f3862.length) {
                        int i13 = this.f2816;
                        if (i13 == 0) {
                            byte[] bArr3 = this.f2814;
                            this.f2816 = i13 + 1;
                            bArr3[i13] = 0;
                            return;
                        }
                        return;
                    } else if (i12 >= 11) {
                        int[] iArr = this.f2813;
                        int i14 = this.f2816;
                        iArr[i14] = 7;
                        this.f2815[i14] = r32 - 10;
                        byte[] bArr4 = this.f2814;
                        this.f2816 = i14 + 1;
                        bArr4[i14] = 18;
                    } else if (i12 >= 3) {
                        int[] iArr2 = this.f2813;
                        int i15 = this.f2816;
                        iArr2[i15] = 3;
                        this.f2815[i15] = r32 - 2;
                        byte[] bArr5 = this.f2814;
                        this.f2816 = i15 + 1;
                        bArr5[i15] = 17;
                    } else {
                        byte[] bArr6 = this.f2814;
                        int i16 = this.f2816;
                        this.f2816 = i16 + 1;
                        bArr6[i16] = 0;
                        i10 = i11;
                    }
                } else {
                    int i17 = i10 + 1;
                    int r22 = m2681(b10, i17, 6);
                    int i18 = r22 + 1;
                    byte[] bArr7 = this.f2814;
                    int i19 = this.f2816;
                    int i20 = i19 + 1;
                    this.f2816 = i20;
                    bArr7[i19] = this.f3862[i10];
                    if (i18 >= 4) {
                        this.f2815[i20] = (byte) (r22 - 3);
                        this.f2813[i20] = 2;
                        this.f2816 = i19 + 2;
                        bArr7[i20] = 16;
                        i17 += r22;
                    }
                    i10 = i17;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final int m2681(int i10, int i11, int i12) {
        int i13 = 0;
        while (true) {
            byte[] bArr = this.f3862;
            if (i11 >= bArr.length || i13 >= i12) {
                break;
            }
            int i14 = i11 + 1;
            if (bArr[i11] != i10) {
                break;
            }
            i13++;
            i11 = i14;
        }
        return i13;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2683(C4175 r52) {
        for (int i10 = 0; i10 < this.f2816; i10++) {
            short[] sArr = r52.f3861;
            byte b10 = this.f2814[i10];
            sArr[b10] = (short) (sArr[b10] + 1);
        }
    }
}
