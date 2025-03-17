package nts;

/* renamed from: nts.โ  reason: contains not printable characters */
public class C3754 extends C3793 {

    /* renamed from: ࡑ  reason: contains not printable characters */
    public int f1148 = 32;

    /* renamed from: ᘺ  reason: contains not printable characters */
    public int[] f1149;

    public C3754(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13) {
        super(bArr2, 8, 8, i10, i11, i13);
        int[] iArr = new int[4];
        this.f1149 = iArr;
        C3835.m1687(bArr, iArr);
        this.f1148 = i12;
        this.f104 = true;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m1171() {
        int i10 = this.f109;
        if (i10 == 4 || i10 == 3) {
            C3835.m1688(this.f99, this.f1149, this.f1148);
            return;
        }
        byte[] bArr = this.f99;
        int[] iArr = this.f1149;
        int i11 = this.f1148;
        int i12 = i11 == 32 ? -957401312 : i11 * -1640531527;
        int r82 = C3835.m1685(bArr, 0);
        int r92 = C3835.m1685(bArr, 4);
        for (int i13 = 0; i13 < i11; i13++) {
            r92 -= (((r82 << 4) + iArr[2]) ^ (r82 + i12)) ^ ((r82 >>> 5) + iArr[3]);
            r82 -= (((r92 << 4) + iArr[0]) ^ (r92 + i12)) ^ ((r92 >>> 5) + iArr[1]);
            i12 -= -1640531527;
        }
        C3835.m1686(r82, bArr, 0);
        C3835.m1686(r92, bArr, 4);
    }
}
