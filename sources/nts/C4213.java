package nts;

/* renamed from: nts.フ  reason: contains not printable characters */
public class C4213 extends C3935 {

    /* renamed from: ⴸ  reason: contains not printable characters */
    public long f4085 = 0;

    public C4213() {
        this.f910 = new C4124[]{new C4124(256, 256, 0)};
        this.f916 = new C4124[]{new C4124(512, 512, 0)};
        this.f912 = 512;
        this.f914 = 512;
        this.f913 = 256;
        this.f909 = 1;
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m3771() {
        m901(C3990.m2428(this.f913 / 8));
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public C4193 m3772(byte[] bArr, byte[] bArr2) {
        return new C3848(bArr, bArr2, this.f911, this.f909, this.f4085);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3774(byte[] bArr) {
        this.f908 = (byte[]) bArr.clone();
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m3775() {
        m3774(C3990.m2428(this.f912 / 8));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public C4193 m3773(byte[] bArr, byte[] bArr2) {
        return new C3587(bArr, bArr2, this.f911, this.f909, this.f4085);
    }
}
