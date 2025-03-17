package nts;

import java.io.InputStream;

/* renamed from: nts.ץ  reason: contains not printable characters */
public class C3636 extends InputStream {

    /* renamed from: ગ  reason: contains not printable characters */
    public int f619 = -1;

    /* renamed from: ഇ  reason: contains not printable characters */
    public C3874 f620 = new C3874();

    public int available() {
        int i10 = this.f619;
        return i10 < 0 ? this.f620.f1728 : (this.f620.f1728 - i10) - 1;
    }

    public void close() {
        this.f620.m1926();
        this.f619 = -1;
    }

    public int read() {
        int i10 = this.f619 + 1;
        this.f619 = i10;
        if (i10 >= 0) {
            C3874 r12 = this.f620;
            if (i10 < r12.f1728) {
                return r12.f1729[i10] & 255;
            }
        }
        this.f619 = -1;
        this.f620.m1926();
        return -1;
    }
}
