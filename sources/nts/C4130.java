package nts;

/* renamed from: nts.Ⰼ  reason: contains not printable characters */
public class C4130 extends C4138 {

    /* renamed from: ࡏ  reason: contains not printable characters */
    public int f3590 = 0;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public int f3591 = 0;

    /* renamed from: ഇ  reason: contains not printable characters */
    public byte[] m3330() {
        C3844 r02 = new C3844();
        r02.m1759(this.f3591);
        r02.m1745((byte) this.f3590);
        this.f3713 = 2;
        this.f3716 = r02.m1755();
        return super.m3419();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3329(byte[] bArr) {
        super.m3418(bArr);
        C3844 r22 = new C3844(this.f3716);
        this.f3591 = r22.m1733();
        this.f3590 = r22.m1761() & 255;
    }
}
