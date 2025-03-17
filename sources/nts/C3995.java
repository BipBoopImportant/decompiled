package nts;

/* renamed from: nts.ᤔ  reason: contains not printable characters */
public class C3995 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public C3837 f2648 = new C3837();

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C3832 f2649 = new C3832();

    public C3995() {
        this.f3542 = 48;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2454(C3796 r32) {
        C3796 r02 = new C3796();
        this.f2649.m3311(r02);
        this.f2648.m1694(r02);
        r02.f1337 = this.f3542;
        r32.m1336(r02.m1349());
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m2455(byte[] bArr, int i10) {
        int r32 = this.f2649.m3270(bArr, i10);
        if (!this.f2649.f3546) {
            return r32;
        }
        int r33 = this.f2648.m3270(bArr, r32);
        return !this.f2648.f3546 ? r33 : m3274(bArr, r33);
    }
}
