package nts;

/* renamed from: nts.ह  reason: contains not printable characters */
public class C3680 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public C4010 f812 = new C4010(160);

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C3938 f813 = new C3938();

    public C3680() {
        this.f3542 = 48;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m803(C3796 r42) {
        C3796 r02 = new C3796();
        r02.m1341(C3796.m1318(this.f813.f1400), 6);
        this.f812.m2494(r02);
        r02.f1337 = this.f3542;
        r42.m1336(r02.m1349());
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m804(byte[] bArr, int i10) {
        int r82 = this.f813.m3270(bArr, i10);
        C3938 r02 = this.f813;
        if (!r02.f3546) {
            return r82;
        }
        if (r02.f1400.equals(C4089.f3421)) {
            r82 = this.f812.m2493(bArr, r82, new C3706());
            if (!this.f812.f3546) {
                return r82;
            }
        } else {
            new C3625((Throwable) null, 224, C3727.m1052("!\r\u0007\u0013Q\u0006\u0012\u001e\u0014\u0018\u001e\n\u0010\u0017\u0015Z\u0000\u0016\u0015\t\u0013@\n\fM/\u0000\u0000\u001d\r\u0005\u001e\u001c:19\"~Fj`t6auysymwpr=gqrnt'mk*XiokLccFV^EE\u0019\u0015/0&'*!)!3//l\u000e!!$4<'y\u0001/'=y5968=+@\b\u0006\u0006\n\u0011\u000f\u0001\u0001\f\u0018KP|vb wcoeio{afd+qgdxb1{}<MU\\K((ZPQTtEU\f£¼ª«¦­¥­¿££à­­¨¸°«õ£«±õ¹µº´±§ÌÇ", 159, 44, 127) + this.f813.f1400);
        }
        return m3274(bArr, r82);
    }
}
