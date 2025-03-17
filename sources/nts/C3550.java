package nts;

/* renamed from: nts.ɞ  reason: contains not printable characters */
public class C3550 extends C3935 {
    public C3550() {
        this.f910 = new C4124[]{new C4124(128, 256, 64)};
        this.f916 = new C4124[]{new C4124(128, 128, 0)};
        this.f912 = 128;
        this.f914 = 128;
        this.f913 = 256;
        this.f911 = 1;
        this.f909 = 1;
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m117() {
        m901(C3990.m2428(this.f913 / 8));
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public C4193 m118(byte[] bArr, byte[] bArr2) {
        int i10 = this.f911;
        if (i10 == 7) {
            return new C4216(bArr, true);
        }
        return new C4224(bArr, bArr2, i10, this.f909, this.f914);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public C4193 m119(byte[] bArr, byte[] bArr2) {
        int i10 = this.f911;
        if (i10 == 7) {
            return new C4216(bArr, false);
        }
        return new C3775(bArr, bArr2, i10, this.f909, this.f914);
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m120() {
        m905(C3990.m2428(this.f912 / 8));
    }
}
