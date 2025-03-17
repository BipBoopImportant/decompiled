package nts;

/* renamed from: nts.ᙲ  reason: contains not printable characters */
public class C3946 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public C3674 f2262 = new C3674();

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C3753 f2263 = new C3753();

    /* renamed from: ᖑ  reason: contains not printable characters */
    public C3947 f2264 = new C3947();

    public C3946(C3646 r22) {
        this.f3542 = 48;
        this.f2264 = new C3947(r22);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2129(C3796 r42) {
        C3796 r02 = new C3796();
        C3753 r12 = this.f2263;
        r02.m1334(r12.f1252, r12.f3542);
        this.f2262.m3311(r02);
        this.f2264.m2131(r02);
        r02.f1337 = this.f3542;
        r42.m1336(r02.m1349());
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m2130(byte[] bArr, int i10) {
        int r32 = this.f2263.m3270(bArr, i10);
        if (!this.f2263.f3546) {
            return r32;
        }
        int r33 = this.f2262.m3270(bArr, r32);
        if (!this.f2262.f3546) {
            return r33;
        }
        int r34 = this.f2264.m3270(bArr, r33);
        return !this.f2264.f3546 ? r34 : m3274(bArr, r34);
    }
}
