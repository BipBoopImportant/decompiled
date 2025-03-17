package nts;

/* renamed from: nts.ᘇ  reason: contains not printable characters */
public class C3934 extends C3793 {

    /* renamed from: и  reason: contains not printable characters */
    public int f2233 = 16;

    /* renamed from: ࡑ  reason: contains not printable characters */
    public byte[] f2234;

    /* renamed from: ᘺ  reason: contains not printable characters */
    public int[] f2235;

    public C3934(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        super(bArr2, 8, 8, i10, i11, i12);
        int[] iArr = new int[16];
        this.f2235 = iArr;
        byte[] bArr3 = new byte[16];
        this.f2234 = bArr3;
        this.f2233 = C3877.m1929(bArr, iArr, bArr3);
        this.f104 = true;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m2096() {
        int i10 = this.f109;
        if (i10 == 4 || i10 == 3) {
            C3877.m1932(this.f99, this.f2235, this.f2234, this.f2233);
            return;
        }
        byte[] bArr = this.f99;
        int[] iArr = this.f2235;
        byte[] bArr2 = this.f2234;
        int i11 = this.f2233;
        int r62 = C3877.m1928(bArr, 0);
        int r72 = C3877.m1928(bArr, 4);
        int i12 = i11 - 1;
        while (i12 >= 0) {
            i12--;
            int i13 = r72;
            r72 = r62 ^ C3877.m1927(i12 % 3, r72, iArr[i12], bArr2[i12]);
            r62 = i13;
        }
        C3877.m1931(r72, bArr, 0);
        C3877.m1931(r62, bArr, 4);
    }
}
