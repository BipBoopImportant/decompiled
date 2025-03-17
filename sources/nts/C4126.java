package nts;

/* renamed from: nts.Ⅹ  reason: contains not printable characters */
public class C4126 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public C4114 f3581;

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C3801 f3582 = new C3801();

    /* renamed from: ᖑ  reason: contains not printable characters */
    public boolean f3583;

    public C4126() {
        C4114 r02 = new C4114();
        this.f3581 = r02;
        this.f3583 = false;
        this.f3542 = 48;
        r02.m3278(false);
        this.f3581.m3271(true);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3311(C3796 r42) {
        C3796 r02 = new C3796();
        this.f3582.m1413(r02);
        C4114 r12 = this.f3581;
        if (r12.f3537) {
            r12.m3277(r02);
        }
        r02.f1337 = this.f3542;
        r42.m1336(r02.m1349());
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m3312(byte[] bArr, int i10) {
        boolean z10;
        int r62 = this.f3582.m3270(bArr, i10);
        C3801 r02 = this.f3582;
        if (!r02.f3546 || ((z10 = this.f3540) && r62 + 1 >= bArr.length)) {
            return r62;
        }
        if (!this.f3583) {
            int i11 = r02.f3547 + r02.f3539;
            if (z10) {
                if ((bArr[r62] & 255) == 0 && m3280(bArr, r62 + 1) == 0) {
                    this.f3581.f3537 = false;
                }
            } else if (i11 >= this.f3539) {
                this.f3581.f3537 = false;
            }
            this.f3583 = true;
        }
        if (this.f3581.f3537) {
            if (this.f3582.f1400.equals(C4089.f3390)) {
                this.f3581 = new C3663();
            } else if (this.f3582.f1400.equals(C4089.f3435)) {
                this.f3581 = new C3801();
            } else if (this.f3582.f1400.equals(C4089.f3391)) {
                this.f3581 = new C3802();
            } else if (this.f3582.f1400.equals(C4089.f3404)) {
                this.f3581 = new C3837();
            } else if (this.f3582.f1400.equals(C4089.f3454)) {
                this.f3581 = new C3756();
            } else if (this.f3582.f1400.equals(C4089.f3419) || this.f3582.f1400.equals(C4089.f3410) || this.f3582.f1400.equals(C4089.f3406)) {
                this.f3581 = new C3933();
            }
            r62 = this.f3581.m3270(bArr, r62);
            C4114 r03 = this.f3581;
            if (!r03.f3546) {
                return r62;
            }
            r03.f3542 = r03.f3548;
        }
        return m3274(bArr, r62);
    }
}
