package nts;

/* renamed from: nts.ᾼ  reason: contains not printable characters */
public class C4112 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public C4054 f3532 = new C4054();

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C4123 f3533 = new C4123();

    /* renamed from: ᖑ  reason: contains not printable characters */
    public C4090 f3534;

    public C4112() {
        this.f3542 = 48;
        C4090 r02 = new C4090();
        this.f3534 = r02;
        r02.m3276(128);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3268(C3796 r42) {
        C3796 r02 = new C3796();
        r02.m1341(C3796.m1318(this.f3533.f1400), 6);
        this.f3532.m3311(r02);
        this.f3534.m3227(r02);
        r02.f1337 = this.f3542;
        r42.m1336(r02.m1349());
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m3269(byte[] bArr, int i10) {
        int r32 = this.f3533.m3270(bArr, i10);
        if (!this.f3533.f3546) {
            return r32;
        }
        int r33 = this.f3532.m3270(bArr, r32);
        if (!this.f3532.f3546) {
            return r33;
        }
        int r34 = this.f3534.m3270(bArr, r33);
        return !this.f3534.f3546 ? r34 : m3274(bArr, r34);
    }

    public C4112(C3646 r22) {
        this.f3542 = 48;
        C4090 r02 = new C4090(r22);
        this.f3534 = r02;
        r02.m3276(160);
    }
}
