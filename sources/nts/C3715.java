package nts;

/* renamed from: nts.ପ  reason: contains not printable characters */
public class C3715 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public C3559 f960 = new C3559();

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C3559 f961 = new C3559();

    public C3715() {
        this.f3542 = 48;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1007(C3796 r32) {
        C3796 r02 = new C3796();
        this.f961.m154(r02);
        this.f960.m154(r02);
        r02.f1337 = this.f3542;
        r32.m1336(r02.m1349());
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m1008(byte[] bArr, int i10) {
        int r32 = this.f961.m3270(bArr, i10);
        if (!this.f961.f3546) {
            return r32;
        }
        int r33 = this.f960.m3270(bArr, r32);
        return !this.f960.f3546 ? r33 : m3274(bArr, r33);
    }
}
