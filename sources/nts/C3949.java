package nts;

/* renamed from: nts.ᚋ  reason: contains not printable characters */
public class C3949 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public C3989 f2270 = new C3989();

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C3630 f2271 = new C3630();

    public C3949() {
        this.f3542 = 48;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2176(C3796 r42) {
        C3796 r02 = new C3796();
        C3630 r12 = this.f2271;
        byte[] bArr = r12.f612;
        if (bArr != null) {
            r02.m1339(bArr);
        } else {
            r12.f611.m3264(r02);
        }
        this.f2270.m2409(r02);
        r02.f1337 = this.f3542;
        r42.m1336(r02.m1349());
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m2177(byte[] bArr, int i10) {
        int r32 = this.f2271.m598(bArr, i10);
        if (!this.f2271.f3546) {
            return r32;
        }
        int r33 = this.f2270.m3270(bArr, r32);
        return !this.f2270.f3546 ? r33 : m3274(bArr, r33);
    }
}
