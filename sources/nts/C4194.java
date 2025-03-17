package nts;

/* renamed from: nts.〹  reason: contains not printable characters */
public class C4194 {

    /* renamed from: ગ  reason: contains not printable characters */
    public int f4036;

    /* renamed from: ഇ  reason: contains not printable characters */
    public C3948 f4037 = new C3948();

    /* renamed from: ᐳ  reason: contains not printable characters */
    public int f4038;

    public C4194() {
        m3726();
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m3724(byte[] bArr, int i10, int i11) {
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3726() {
        this.f4037.m2143();
        this.f4036 = 0;
        this.f4038 = 0;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3727(int i10) {
        this.f4036 = i10;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m3725(byte[] bArr, int i10, int i11) {
        this.f4037.m2163(bArr, i11);
        int i12 = i10;
        while (true) {
            if (this.f4036 <= 0 || i11 <= 0) {
                break;
            }
            int length = this.f4037.f2269.length();
            int i13 = this.f4038;
            int i14 = length - i13;
            int i15 = this.f4036;
            if (i15 > i14) {
                i12 += i11;
                break;
            }
            int length2 = ((i15 + i11) + i13) - this.f4037.f2269.length();
            i12 += length2;
            i11 -= length2;
            int i16 = this.f4036;
            m3724(this.f4037.m2153(), this.f4038, i16);
            this.f4038 += i16;
        }
        return i12 - i10;
    }
}
