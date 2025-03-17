package nts;

/* renamed from: nts.ᐯ  reason: contains not printable characters */
public class C3874 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public int f1727;

    /* renamed from: ગ  reason: contains not printable characters */
    public int f1728;

    /* renamed from: ഇ  reason: contains not printable characters */
    public byte[] f1729;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public String f1730;

    public C3874() {
        this(256);
    }

    public String toString() {
        byte[] bArr = this.f1729;
        int i10 = this.f1728;
        String str = C3823.f1540;
        return new String(bArr, 0, i10);
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m1916(int i10) {
        this.f1727 = i10;
        m1926();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public C3874 m1920(byte[] bArr) {
        return m1921(bArr, 0, bArr.length);
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m1926() {
        this.f1728 = 0;
        int length = this.f1729.length;
        int i10 = this.f1727;
        if (length != i10) {
            this.f1729 = new byte[i10];
        }
    }

    public C3874(byte[] bArr, int i10, int i11) {
        this(256);
        m1915(bArr, i10, i11);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public C3874 m1921(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            int i12 = i11 - i10;
            m1922(i12);
            System.arraycopy(bArr, i10, this.f1729, this.f1728, i12);
            this.f1728 += i12;
        }
        return this;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public C3874 m1915(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = this.f1729;
        if (bArr2.length > i11) {
            System.arraycopy(bArr, i10, bArr2, 0, i11);
        } else {
            this.f1729 = C3823.m1630(bArr, i10, i11);
        }
        this.f1728 = i11;
        return this;
    }

    public C3874(int i10) {
        this.f1729 = new byte[i10];
        this.f1727 = i10;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public C3874 m1924(byte[] bArr) {
        return this.f1728 == 0 ? m1914(bArr) : m1920(bArr);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public C3874 m1918(byte b10) {
        m1922(1);
        byte[] bArr = this.f1729;
        int i10 = this.f1728;
        this.f1728 = i10 + 1;
        bArr[i10] = b10;
        return this;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public C3874 m1925(byte[] bArr, int i10, int i11) {
        return this.f1728 == 0 ? m1915(bArr, i10, i11) : m1921(bArr, i10, i11);
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public C3874 m1914(byte[] bArr) {
        return m1915(bArr, 0, bArr.length);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public C3874 m1919(int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 < i11 && i11 <= (i12 = this.f1728)) {
            byte[] bArr = this.f1729;
            System.arraycopy(bArr, i11, bArr, i10, i12 - i11);
            this.f1728 -= i11 - i10;
        }
        return this;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public static boolean m1910(byte[] bArr, byte[] bArr2) {
        if (bArr.length < bArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr2.length; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final void m1922(int i10) {
        int i11 = this.f1728;
        int i12 = i10 + i11;
        byte[] bArr = this.f1729;
        if (bArr.length < i12) {
            try {
                byte[] bArr2 = new byte[(i12 + (i12 / 4))];
                System.arraycopy(bArr, 0, bArr2, 0, i11);
                this.f1729 = bArr2;
            } catch (OutOfMemoryError unused) {
                throw new C3625(0, C3727.m1052("\t#7!g. %;j:8.-(l<'%p80u9>76*&p", 0, 30, 93));
            }
        }
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public byte[] m1917(int i10, int i11) {
        int i12 = i11 - i10;
        byte[] bArr = new byte[i12];
        System.arraycopy(this.f1729, i10, bArr, 0, i12);
        return bArr;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public String m1913() {
        return C3823.m1613(this.f1729, 0, this.f1728, this.f1730);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static int m1911(byte[] bArr, byte[] bArr2, int i10, int i11) {
        int length = (i11 - bArr2.length) + 1;
        if (bArr2.length != 0 && length >= 0) {
            byte b10 = bArr2[0];
            while (i10 < length) {
                if (bArr[i10] == b10) {
                    int i12 = 1;
                    while (i12 < bArr2.length) {
                        if (bArr[i10 + i12] == bArr2[i12]) {
                            i12++;
                        }
                    }
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public byte[] m1923() {
        int i10 = this.f1728;
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f1729, 0, bArr, 0, i10);
        return bArr;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static boolean m1912(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
        }
        return true;
    }
}
