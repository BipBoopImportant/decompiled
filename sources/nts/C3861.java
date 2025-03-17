package nts;

/* renamed from: nts.Ꮦ  reason: contains not printable characters */
public class C3861 {

    /* renamed from: ഇ  reason: contains not printable characters */
    public C3874 f1673 = new C3874();

    public boolean equals(Object obj) {
        if (!(obj instanceof String)) {
            return super.equals(obj);
        }
        String str = (String) obj;
        if (str == null) {
            str = "";
        }
        return m1864().equals(str);
    }

    public String toString() {
        return m1864();
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public int m1860(byte[] bArr) {
        if (bArr == null) {
            m1859();
            return 0;
        }
        this.f1673.m1914(bArr);
        return 0;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m1861(String str) {
        if (str == null) {
            return 0;
        }
        this.f1673.m1920(C3823.m1620(str));
        return 0;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m1862(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        this.f1673.m1920(bArr);
        return 0;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public int m1859() {
        this.f1673.m1926();
        return 0;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m1863(byte[] bArr, int i10) {
        if (i10 > 0) {
            this.f1673.m1921(bArr, 0, i10);
        }
        return 0;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public String m1864() {
        byte[] r02 = this.f1673.m1923();
        String str = C3823.f1540;
        return new String(r02);
    }
}
