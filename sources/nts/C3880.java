package nts;

/* renamed from: nts.ᑊ  reason: contains not printable characters */
public class C3880 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public C4046 f1746 = new C4046();

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C3753 f1747 = new C3753();

    /* renamed from: ᖑ  reason: contains not printable characters */
    public C4112 f1748;

    public C3880(C3646 r22) {
        this.f3542 = 48;
        this.f1748 = new C4112(r22);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1936(C3796 r42) {
        C3796 r02 = new C3796();
        C3753 r12 = this.f1747;
        r02.m1334(r12.f1252, r12.f3542);
        this.f1746.m2737(r02);
        this.f1748.m3268(r02);
        r02.f1337 = this.f3542;
        r42.m1336(r02.m1349());
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m1937(byte[] bArr, int i10) {
        int r32 = this.f1747.m3270(bArr, i10);
        if (!this.f1747.f3546) {
            return r32;
        }
        int r33 = this.f1746.m3270(bArr, r32);
        if (!this.f1746.f3546) {
            return r33;
        }
        int r34 = this.f1748.m3270(bArr, r33);
        return !this.f1748.f3546 ? r34 : m3274(bArr, r34);
    }
}
