package nts;

/* renamed from: nts.ⶬ  reason: contains not printable characters */
public class C4182 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public C4010 f3991 = new C4010(160);

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C3898 f3992 = new C3898();

    /* renamed from: ᖑ  reason: contains not printable characters */
    public C4018 f3993 = new C4018();

    /* renamed from: ᜇ  reason: contains not printable characters */
    public boolean f3994 = false;

    public C4182() {
        this.f3542 = 48;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3668(C3796 r42) {
        C3796 r02 = new C3796();
        r02.m1341(C3796.m1318(this.f3992.f1400), 6);
        this.f3991.m2494(r02);
        C4018 r12 = this.f3993;
        if (r12.f3537) {
            r12.f3542 = 49;
            r12.m2590(r02);
        }
        r02.f1337 = this.f3542;
        r42.m1336(r02.m1349());
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m3669(byte[] bArr, int i10) {
        int r82 = this.f3992.m3270(bArr, i10);
        C3898 r02 = this.f3992;
        if (!r02.f3546) {
            return r82;
        }
        if (r02.f1400.equals(C4089.f3467)) {
            r82 = this.f3991.m2493(bArr, r82, new C3995());
            if (!this.f3992.f3546) {
                return r82;
            }
        } else if (this.f3992.f1400.equals(C4089.f3387)) {
            r82 = this.f3991.m2493(bArr, r82, new C3680());
            if (!this.f3992.f3546) {
                return r82;
            }
        } else if (this.f3992.f1400.equals(C4089.f3416)) {
            r82 = this.f3991.m2493(bArr, r82, new C4212());
            if (!this.f3992.f3546) {
                return r82;
            }
        } else {
            new C3625((Throwable) null, 224, C3727.m1052("!\r\u0007\u0013Q\u0006\u0012\u001e\u0014\u0018\u001e\n\u0010\u0017\u0015Z\u0000\u0016\u0015\t\u0013@\n\fM/\u0000\u0000\u001d\r\u0005\u001e\u001c:19\"~Fj`t6auysymwpr=gqrnt'mk*XiokLccFV^EE\u0019\u0015/0&'*!)!3//l\u000e!!$4<'y\u0001/'=y5968=+@\b\u0006\u0006\n\u0011\u000f\u0001\u0001\f\u0018KP|vb wcoeio{afd+qgdxb1{}<MU\\K((ZPQTtEU\f£¼ª«¦­¥­¿££à­­¨¸°«õ£«±õ¹µº´±§ÌÇ", 76, 44, 32) + this.f3992.f1400);
        }
        if (r82 < bArr.length) {
            if (!this.f3994) {
                if ((bArr[r82] & 255) == 49) {
                    this.f3993.f3537 = true;
                } else {
                    this.f3993.f3537 = false;
                }
                this.f3994 = true;
            }
            C4018 r03 = this.f3993;
            if (r03.f3537) {
                r82 = r03.m3270(bArr, r82);
            }
        }
        return m3274(bArr, r82);
    }
}
