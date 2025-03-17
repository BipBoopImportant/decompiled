package nts;

/* renamed from: nts.ᗂ  reason: contains not printable characters */
public class C3917 extends C3793 {

    /* renamed from: и  reason: contains not printable characters */
    public int f1879 = 0;

    /* renamed from: ࡑ  reason: contains not printable characters */
    public int f1880 = 32;

    /* renamed from: ᘺ  reason: contains not printable characters */
    public int[] f1881;

    public C3917(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, int i14) {
        super(bArr2, 8, 8, i10, i11, i14);
        int[] iArr = new int[4];
        this.f1881 = iArr;
        C4059.m2844(bArr, iArr);
        this.f1880 = i12;
        this.f1879 = i13;
        this.f104 = true;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m2044() {
        int i10 = this.f109;
        if (i10 == 4 || i10 == 3) {
            C4059.m2845(this.f99, this.f1881, this.f1880, this.f1879);
            return;
        }
        byte[] bArr = this.f99;
        int[] iArr = this.f1881;
        int i11 = this.f1880;
        int i12 = this.f1879;
        int i13 = i11 == 32 ? -957401312 : i11 * -1640531527;
        int r92 = C4059.m2842(bArr, 0);
        int r10 = C4059.m2842(bArr, 4);
        if (i12 == 0) {
            for (int i14 = 0; i14 < i11; i14++) {
                r10 -= ((r92 << 4) ^ ((r92 >>> 5) + r92)) ^ (iArr[(i13 >>> 11) & 3] + i13);
                i13 -= -1640531527;
                r92 -= ((r10 << 4) ^ ((r10 >>> 5) + r10)) ^ (iArr[i13 & 3] + i13);
            }
        } else {
            for (int i15 = 0; i15 < i11; i15++) {
                r10 -= (((r92 << 4) ^ (r92 >>> 5)) + r92) ^ (iArr[(i13 >>> 11) & 3] + i13);
                i13 -= -1640531527;
                r92 -= (((r10 << 4) ^ (r10 >>> 5)) + r10) ^ (iArr[i13 & 3] + i13);
            }
        }
        C4059.m2843(r92, bArr, 0);
        C4059.m2843(r10, bArr, 4);
    }
}
