package nts;

/* renamed from: nts.ҁ  reason: contains not printable characters */
public class C3605 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public C4126 f461 = new C4126();

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C4203 f462 = new C4203();

    /* renamed from: ᖑ  reason: contains not printable characters */
    public C4050 f463 = new C4050();

    public C3605() {
        this.f3542 = 48;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m461(C3796 r32) {
        C3796 r02 = new C3796();
        this.f462.m3758(r02);
        this.f461.m3311(r02);
        this.f463.m2745(r02);
        r02.f1337 = this.f3542;
        r32.m1336(r02.m1349());
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m462(byte[] bArr, int i10) {
        int r32 = this.f462.m3270(bArr, i10);
        if (!this.f462.f3546) {
            return r32;
        }
        int r33 = this.f461.m3270(bArr, r32);
        if (!this.f461.f3546) {
            return r33;
        }
        int r34 = this.f463.m3270(bArr, r33);
        return !this.f463.f3546 ? r34 : m3274(bArr, r34);
    }
}
