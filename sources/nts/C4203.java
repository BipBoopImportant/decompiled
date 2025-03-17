package nts;

/* renamed from: nts.ェ  reason: contains not printable characters */
public class C4203 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public C3989 f4049 = new C3989();

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C4010 f4050 = new C4010(160);

    /* renamed from: ഗ  reason: contains not printable characters */
    public C3630 f4051 = new C3630();

    /* renamed from: ภ  reason: contains not printable characters */
    public C4195 f4052;

    /* renamed from: ᐽ  reason: contains not printable characters */
    public C4195 f4053;

    /* renamed from: ᖑ  reason: contains not printable characters */
    public C4126 f4054 = new C4126();

    /* renamed from: ᗎ  reason: contains not printable characters */
    public boolean f4055;

    /* renamed from: ᚪ  reason: contains not printable characters */
    public boolean f4056;

    /* renamed from: ᜇ  reason: contains not printable characters */
    public C3630 f4057 = new C3630();

    /* renamed from: ᢼ  reason: contains not printable characters */
    public C4075 f4058 = new C4075();

    /* renamed from: ṧ  reason: contains not printable characters */
    public C4195 f4059;

    /* renamed from: ⱑ  reason: contains not printable characters */
    public C4178 f4060 = new C4178();

    /* renamed from: ⵜ  reason: contains not printable characters */
    public boolean f4061;

    public C4203() {
        C4195 r02 = new C4195();
        this.f4059 = r02;
        this.f4052 = new C4195();
        this.f4053 = new C4195();
        this.f4056 = false;
        this.f4061 = false;
        this.f4055 = false;
        this.f3542 = 48;
        r02.m3276(161);
        this.f4052.m3276(162);
        this.f4053.m3276(163);
        this.f4059.m3271(false);
        this.f4052.m3271(false);
        this.f4053.m3271(false);
        this.f4050.f2703 = new C3753();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3758(C3796 r42) {
        C3796 r02 = new C3796();
        C4010 r12 = this.f4050;
        if (r12.f3537) {
            r12.m2494(r02);
        }
        this.f4049.m2409(r02);
        this.f4054.m3311(r02);
        C3630 r13 = this.f4057;
        byte[] bArr = r13.f612;
        if (bArr != null) {
            r02.m1339(bArr);
        } else {
            r13.f611.m3264(r02);
        }
        this.f4058.m3200(r02);
        C3630 r14 = this.f4051;
        byte[] bArr2 = r14.f612;
        if (bArr2 != null) {
            r02.m1339(bArr2);
        } else {
            r14.f611.m3264(r02);
        }
        this.f4060.m3521(r02);
        r02.f1337 = this.f3542;
        C4195 r15 = this.f4059;
        if (r15.f3537) {
            r15.f3542 = 161;
            r02.m1346(r15.f3541, 161);
        }
        C4195 r16 = this.f4052;
        if (r16.f3537) {
            r16.f3542 = 162;
            r02.m1346(r16.f3541, 162);
        }
        C4195 r17 = this.f4053;
        if (r17.f3537) {
            r17.f3542 = 163;
            r02.m1346(r17.f3541, 163);
        }
        r42.m1336(r02.m1349());
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m3759(byte[] bArr, int i10) {
        if (i10 >= bArr.length) {
            return i10;
        }
        if ((bArr[i10] & 255) == 160) {
            i10 = this.f4050.m2492(bArr, i10);
        } else {
            C4010 r02 = this.f4050;
            if (!r02.f3546) {
                r02.f3537 = false;
            }
        }
        int r52 = this.f4049.m3270(bArr, i10);
        if (!this.f4049.f3546) {
            return r52;
        }
        int r53 = this.f4054.m3270(bArr, r52);
        if (!this.f4054.f3546) {
            return r53;
        }
        int r54 = this.f4057.m598(bArr, r53);
        if (!this.f4057.f3546) {
            return r54;
        }
        int r55 = this.f4058.m3270(bArr, r54);
        if (!this.f4058.f3546) {
            return r55;
        }
        int r56 = this.f4051.m598(bArr, r55);
        if (!this.f4051.f3546) {
            return r56;
        }
        int r57 = this.f4060.m3270(bArr, r56);
        if (!this.f4060.f3546) {
            return r57;
        }
        if (!this.f4056) {
            if (r57 >= bArr.length) {
                return r57;
            }
            if ((bArr[r57] & 255) == 161) {
                this.f4059.f3537 = true;
            }
            this.f4056 = true;
        }
        C4195 r03 = this.f4059;
        if (r03.f3537) {
            r57 = r03.m3270(bArr, r57);
        }
        if (!this.f4061) {
            if (r57 >= bArr.length) {
                return r57;
            }
            if ((bArr[r57] & 255) == 162) {
                this.f4052.f3537 = true;
            }
            this.f4061 = true;
        }
        C4195 r04 = this.f4052;
        if (r04.f3537) {
            r57 = r04.m3270(bArr, r57);
        }
        if (!this.f4055) {
            if (r57 >= bArr.length) {
                return r57;
            }
            if ((bArr[r57] & 255) == 163) {
                this.f4053.f3537 = true;
            }
            this.f4055 = true;
        }
        C4195 r05 = this.f4053;
        if (r05.f3537) {
            r57 = r05.m3270(bArr, r57);
        }
        return m3274(bArr, r57);
    }
}
