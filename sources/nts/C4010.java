package nts;

/* renamed from: nts.ᨦ  reason: contains not printable characters */
public class C4010 extends C4114 {

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C4114 f2703 = null;

    public C4010(int i10) {
        this.f3542 = i10;
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public int m2492(byte[] bArr, int i10) {
        if (this.f3546) {
            return i10;
        }
        int r32 = super.m3270(bArr, i10);
        if (this.f2703 == null) {
            this.f2703 = new C4114();
        }
        int r33 = this.f2703.m3270(bArr, r32);
        return !this.f2703.f3546 ? r33 : m3274(bArr, r33);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2494(C3796 r32) {
        C3796 r02 = new C3796();
        this.f2703.m3277(r02);
        r02.f1337 = this.f3542;
        r32.m1336(r02.m1349());
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m2495(byte[] bArr, int i10) {
        return i10;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m2493(byte[] bArr, int i10, C4114 r42) {
        int r32 = super.m3270(bArr, i10);
        if (this.f2703 == null) {
            this.f2703 = r42;
        }
        C4114 r43 = this.f2703;
        if (!r43.f3546) {
            r32 = r43.m3270(bArr, r32);
            if (!this.f2703.f3546) {
                return r32;
            }
        }
        return m3274(bArr, r32);
    }
}
