package nts;

/* renamed from: nts.ᡲ  reason: contains not printable characters */
public class C3981 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public C3689 f2555 = new C3689();

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C4036 f2556 = new C4036();

    public C3981() {
        this.f3542 = 48;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2352(C3796 r42) {
        C3796 r02 = new C3796();
        r02.m1341(C3796.m1318(this.f2556.f1400), 6);
        this.f2555.m850(r02);
        r02.f1337 = 48;
        r42.m1336(r02.m1349());
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m2353(byte[] bArr, int i10) {
        int r32 = this.f2556.m3270(bArr, i10);
        if (!this.f2556.f3546) {
            return r32;
        }
        int r33 = this.f2555.m3270(bArr, r32);
        return !this.f2555.f3546 ? r33 : m3274(bArr, r33);
    }
}
