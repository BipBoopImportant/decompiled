package nts;

import java.io.OutputStream;
import java.util.Date;

/* renamed from: nts.ṿ  reason: contains not printable characters */
public class C4080 extends C3664 {

    /* renamed from: ⶊ  reason: contains not printable characters */
    public static byte[] f3364 = {31, -117};

    /* renamed from: Е  reason: contains not printable characters */
    public String f3365 = "";

    /* renamed from: ࡏ  reason: contains not printable characters */
    public long f3366 = 0;

    /* renamed from: ખ  reason: contains not printable characters */
    public String f3367 = "";

    /* renamed from: ᅯ  reason: contains not printable characters */
    public C4021 f3368 = new C4021();

    /* renamed from: ⴸ  reason: contains not printable characters */
    public String f3369 = "";

    /* renamed from: ⶏ  reason: contains not printable characters */
    public long f3370;

    public C4080(OutputStream outputStream, String str, C3883 r62) {
        C3590 r63 = new C3590(outputStream, (C3883) null);
        this.f779 = r63;
        this.f780 = new C4204(r63);
        this.f781 = false;
        this.f3370 = 0;
        this.f3369 = str;
    }

    public void write(byte[] bArr, int i10, int i11) {
        super.write(bArr, i10, i11);
        this.f3368.m2599(bArr, i10, i11);
        this.f3370 += (long) i11;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m3205() {
        this.f779.m348(f3364, 0, 2);
        this.f779.m347(8);
        int i10 = this.f3367.length() > 0 ? 16 : 0;
        if (this.f3365.length() > 0) {
            i10 |= 8;
        }
        this.f779.m347(i10);
        if (this.f3366 == 0) {
            this.f3366 = new Date().getTime() / 1000;
        }
        m720((int) this.f3366);
        this.f779.m347(0);
        this.f779.m347(255);
        if (this.f3365.length() > 0) {
            byte[] bytes = C3823.m1590(this.f3369) ? this.f3365.getBytes() : C3823.m1621(this.f3365, this.f3369);
            this.f779.m348(bytes, 0, bytes.length);
            this.f779.m347(0);
        }
        if (this.f3367.length() > 0) {
            byte[] bytes2 = C3823.m1590(this.f3369) ? this.f3367.getBytes() : C3823.m1621(this.f3367, this.f3369);
            this.f779.m348(bytes2, 0, bytes2.length);
            this.f779.m347(0);
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3206() {
        m720((int) ((long) this.f3368.f2743));
        m720((int) this.f3370);
    }
}
