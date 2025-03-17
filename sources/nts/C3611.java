package nts;

/* renamed from: nts.Ҽ  reason: contains not printable characters */
public class C3611 implements C3851 {

    /* renamed from: ગ  reason: contains not printable characters */
    public byte[] f500 = new byte[0];

    /* renamed from: ഇ  reason: contains not printable characters */
    public C3764 f501;

    public Object clone() {
        C3611 r02 = new C3611();
        try {
            r02.f501 = (C3764) this.f501.clone();
            return r02;
        } catch (Exception e10) {
            throw new C3625((Throwable) e10, C3625.m589(e10));
        }
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public byte[] m482() {
        return this.f500;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m485(byte[] bArr, int i10, int i11, boolean z10) {
        if (z10) {
            C3764 r52 = this.f501;
            r52.m1211(bArr, i10, i11);
            r52.f624 = r52.m1212();
            System.arraycopy(bArr, i10, new byte[i11], 0, i11);
            this.f500 = this.f501.f624;
            return;
        }
        this.f501.m1211(bArr, i10, i11);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m483() {
        this.f501.m1210();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m484(String str) {
        if (C3727.m1052("OU_\r\n\r\u0005\u001f\u0015X@AD='-}\\FL\u0001\u0019\u001f\u001fOU_\f\u0000\reu8!+$pj`564MW]\u0010\u000f\n\n", 0, 6, 58).equals(str)) {
            str = C3727.m1052("OU_\r\n\r\u0005\u001f\u0015X@AD='-}\\FL\u0001\u0019\u001f\u001fOU_\f\u0000\reu8!+$pj`564MW]\u0010\u000f\n\n", 6, 7, 119);
        } else if (C3727.m1052("OU_\r\n\r\u0005\u001f\u0015X@AD='-}\\FL\u0001\u0019\u001f\u001fOU_\f\u0000\reu8!+$pj`564MW]\u0010\u000f\n\n", 13, 6, 69).equals(str)) {
            str = C3727.m1052("OU_\r\n\r\u0005\u001f\u0015X@AD='-}\\FL\u0001\u0019\u001f\u001fOU_\f\u0000\reu8!+$pj`564MW]\u0010\u000f\n\n", 19, 7, 59);
        } else if (C3727.m1052("OU_\r\n\r\u0005\u001f\u0015X@AD='-}\\FL\u0001\u0019\u001f\u001fOU_\f\u0000\reu8!+$pj`564MW]\u0010\u000f\n\n", 26, 6, 32).equals(str)) {
            str = C3727.m1052("OU_\r\n\r\u0005\u001f\u0015X@AD='-}\\FL\u0001\u0019\u001f\u001fOU_\f\u0000\reu8!+$pj`564MW]\u0010\u000f\n\n", 32, 7, 49);
        } else if (C3727.m1052("OU_\r\n\r\u0005\u001f\u0015X@AD='-}\\FL\u0001\u0019\u001f\u001fOU_\f\u0000\reu8!+$pj`564MW]\u0010\u000f\n\n", 39, 6, 34).equals(str)) {
            str = C3727.m1052("OU_\r\n\r\u0005\u001f\u0015X@AD='-}\\FL\u0001\u0019\u001f\u001fOU_\f\u0000\reu8!+$pj`564MW]\u0010\u000f\n\n", 45, 7, 20);
        }
        C3764 r02 = new C3764(str, (String) null);
        this.f501 = r02;
        r02.m1210();
    }
}
