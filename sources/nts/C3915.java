package nts;

/* renamed from: nts.ᖫ  reason: contains not printable characters */
public class C3915 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public C4106 f1866 = new C4106();

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C3753 f1867 = new C3753();

    /* renamed from: ഗ  reason: contains not printable characters */
    public C3787 f1868 = new C3787();

    /* renamed from: ᖑ  reason: contains not printable characters */
    public C3947 f1869 = new C3947();

    /* renamed from: ᜇ  reason: contains not printable characters */
    public C3914 f1870 = new C3914();

    /* renamed from: ᢼ  reason: contains not printable characters */
    public C4195 f1871 = new C4195();

    /* renamed from: ṧ  reason: contains not printable characters */
    public boolean f1872 = false;

    /* renamed from: ⱑ  reason: contains not printable characters */
    public boolean f1873 = false;

    public C3915() {
        this.f3542 = 48;
        this.f1870.f3542 = 160;
        this.f1871.m3271(false);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2042(C3796 r42) {
        C3796 r02 = new C3796();
        C3753 r12 = this.f1867;
        r12.f1252 = 1;
        r02.m1334(1, r12.f3542);
        this.f1866.m3256(r02);
        this.f1869.m2131(r02);
        C3914 r13 = this.f1870;
        if (r13.f3537) {
            r13.f3542 = 160;
            r13.m2040(r02);
        }
        C4195 r14 = this.f1871;
        if (r14.f3537) {
            r14.f3542 = 161;
            r02.m1346(r14.f3541, 161);
        }
        this.f1868.m1285(r02);
        r02.f1337 = this.f3542;
        r42.m1336(r02.m1349());
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m2043(byte[] bArr, int i10) {
        C3753 r02 = this.f1867;
        if (!r02.f3546) {
            i10 = r02.m3270(bArr, i10);
            if (!this.f1867.f3546) {
                return i10;
            }
        }
        C4106 r03 = this.f1866;
        if (!r03.f3546) {
            i10 = r03.m3270(bArr, i10);
            if (!this.f1866.f3546) {
                return i10;
            }
        }
        C3947 r04 = this.f1869;
        if (!r04.f3546) {
            i10 = r04.m3270(bArr, i10);
            if (!this.f1869.f3546) {
                return i10;
            }
        }
        if (!this.f1873) {
            if (i10 >= bArr.length) {
                return i10;
            }
            if ((bArr[i10] & 255) == 160) {
                this.f1870.f3537 = true;
            } else {
                this.f1870.f3537 = false;
            }
            this.f1873 = true;
        }
        C3914 r05 = this.f1870;
        if (r05.f3537 && !r05.f3546) {
            i10 = r05.m3270(bArr, i10);
            if (!this.f1870.f3546) {
                return i10;
            }
        }
        if (!this.f1872) {
            if (i10 >= bArr.length) {
                return i10;
            }
            if ((bArr[i10] & 255) == 161) {
                this.f1871.f3537 = true;
            } else {
                this.f1871.f3537 = false;
            }
            this.f1872 = true;
        }
        C4195 r06 = this.f1871;
        if (r06.f3537 && !r06.f3546) {
            i10 = r06.m3270(bArr, i10);
            if (!this.f1871.f3546) {
                return i10;
            }
        }
        C3787 r07 = this.f1868;
        if (!r07.f3546) {
            i10 = r07.m3270(bArr, i10);
            if (!this.f1868.f3546) {
                return i10;
            }
        }
        return m3274(bArr, i10);
    }

    public C3915(C3646 r32) {
        this.f1869 = new C3947(r32);
        this.f3542 = 48;
        this.f1870.f3542 = 160;
        this.f1871.m3271(false);
    }
}
