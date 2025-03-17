package nts;

/* renamed from: nts.ᚾ  reason: contains not printable characters */
public class C3954 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public C3710 f2330 = new C3710();

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C3667 f2331 = new C3667();

    /* renamed from: ᖑ  reason: contains not printable characters */
    public C4050 f2332 = new C4050();

    public C3954() {
        this.f3542 = 48;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2193(C3796 r32) {
        C3796 r02 = new C3796();
        this.f2331.m725(r02);
        this.f2330.m3311(r02);
        this.f2332.m2745(r02);
        r02.f1337 = this.f3542;
        r32.m1336(r02.m1349());
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m2194(byte[] bArr, int i10) {
        int r32 = this.f2331.m3270(bArr, i10);
        if (!this.f2331.f3546) {
            return r32;
        }
        int r33 = this.f2330.m3270(bArr, r32);
        if (!this.f2330.f3546) {
            return r33;
        }
        int r34 = this.f2332.m3270(bArr, r33);
        return !this.f2332.f3546 ? r34 : m3274(bArr, r34);
    }
}
