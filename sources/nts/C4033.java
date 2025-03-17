package nts;

/* renamed from: nts.ᰐ  reason: contains not printable characters */
public class C4033 extends C3880 {

    /* renamed from: ഗ  reason: contains not printable characters */
    public C4195 f2795 = new C4195();

    /* renamed from: ᜇ  reason: contains not printable characters */
    public C3546 f2796;

    /* renamed from: ᢼ  reason: contains not printable characters */
    public C3837 f2797 = new C3837();

    /* renamed from: ṧ  reason: contains not printable characters */
    public boolean f2798 = false;

    /* renamed from: ⱑ  reason: contains not printable characters */
    public boolean f2799 = false;

    public C4033(C3646 r32) {
        super(r32);
        C3546 r33 = new C3546();
        this.f2796 = r33;
        r33.m3271(false);
        this.f2796.f3542 = 161;
        this.f2795.m3271(false);
        this.f2795.f3542 = 162;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2670(C3796 r42) {
        C3796 r02 = new C3796();
        C3753 r12 = this.f1747;
        r02.m1334(r12.f1252, r12.f3542);
        this.f1746.m2737(r02);
        this.f1748.m3268(r02);
        C3546 r13 = this.f2796;
        if (r13.f3537) {
            r13.f3542 = 161;
            r13.m104(r02);
        }
        this.f2797.m1694(r02);
        C4195 r14 = this.f2795;
        if (r14.f3537) {
            r14.f3542 = 162;
            r02.m1346(r14.f3541, 162);
        }
        r02.f1337 = this.f3542;
        r42.m1336(r02.m1349());
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m2671(byte[] bArr, int i10) {
        int r62 = this.f1747.m3270(bArr, i10);
        if (!this.f1747.f3546) {
            return r62;
        }
        int r63 = this.f1746.m3270(bArr, r62);
        if (!this.f1746.f3546) {
            return r63;
        }
        int r64 = this.f1748.m3270(bArr, r63);
        if (!this.f1748.f3546) {
            return r64;
        }
        if (!this.f2799) {
            if (r64 >= bArr.length) {
                return r64;
            }
            if ((bArr[r64] & 255) == 161) {
                this.f2796.f3537 = true;
            } else {
                this.f2796.f3537 = false;
            }
            this.f2799 = true;
        }
        C3546 r02 = this.f2796;
        if (r02.f3537) {
            r64 = r02.m103(bArr, r64);
        }
        int r65 = this.f2797.m3270(bArr, r64);
        if (!this.f2797.f3546) {
            return r65;
        }
        if (r65 < bArr.length) {
            if (!this.f2798) {
                if ((bArr[r65] & 255) == 162) {
                    this.f2795.f3537 = true;
                } else {
                    this.f2795.f3537 = false;
                }
                this.f2798 = true;
            }
            C4195 r03 = this.f2795;
            if (r03.f3537) {
                r65 = r03.m3270(bArr, r65);
            }
        }
        return m3274(bArr, r65);
    }
}
