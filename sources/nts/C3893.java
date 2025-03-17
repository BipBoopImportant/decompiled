package nts;

/* renamed from: nts.ᓋ  reason: contains not printable characters */
public class C3893 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public C3893 f1790;

    /* renamed from: ગ  reason: contains not printable characters */
    public int f1791;

    /* renamed from: ഇ  reason: contains not printable characters */
    public int f1792;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public C3893 f1793;

    public C3893(int i10, int i11) {
        this.f1792 = i10;
        this.f1791 = i11;
        this.f1793 = null;
        this.f1790 = null;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1979(byte[] bArr, int i10) {
        C3893 r02 = this.f1793;
        if (r02 == null) {
            bArr[this.f1791] = (byte) i10;
            return;
        }
        int i11 = i10 + 1;
        r02.m1979(bArr, i11);
        this.f1790.m1979(bArr, i11);
    }

    public C3893(C3893 r12, C3893 r22) {
        this.f1793 = r12;
        this.f1790 = r22;
        this.f1792 = r12.f1792 + r22.f1792;
        this.f1791 = -1;
    }
}
