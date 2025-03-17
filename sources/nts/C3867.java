package nts;

/* renamed from: nts.ᐁ  reason: contains not printable characters */
public class C3867 extends C3910 {

    /* renamed from: nts.ᐁ$ગ  reason: contains not printable characters */
    public class C3868 extends C3755 implements C3776 {

        /* renamed from: ࡑ  reason: contains not printable characters */
        public C3870 f1694;

        /* renamed from: ᘺ  reason: contains not printable characters */
        public C3874 f1695 = new C3874();

        public C3868(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, int i11) {
            super(bArr2, 16, 16, 1, 1, i11);
            C3870 r13 = new C3870(C3867.this);
            this.f1694 = r13;
            this.f104 = true;
            this.f102 = true;
            r13.f1700 = bArr2;
            r13.f1701 = bArr;
            r13.f1702 = bArr3;
            r13.f1703 = i10 / 8;
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public byte[] m1885() {
            return this.f1694.f1699;
        }

        /* renamed from: ᅯ  reason: contains not printable characters */
        public void m1887(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
            this.f1695.m1921(bArr, i10, i11);
        }

        /* renamed from: ᐳ  reason: contains not printable characters */
        public void m1888() {
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public void m1884(byte[] bArr) {
            this.f1694.f1699 = bArr;
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public byte[] m1886(byte[] bArr, int i10, int i11) {
            this.f1695.m1921(bArr, i10, i11);
            C3870 r32 = this.f1694;
            r32.f1699 = new byte[r32.f1703];
            C3874 r42 = this.f1695;
            C4052.m2824(r32, r42.f1729, 0, r42.f1728, true);
            return this.f1695.m1923();
        }
    }

    /* renamed from: nts.ᐁ$ഇ  reason: contains not printable characters */
    public class C3869 extends C3793 implements C3776 {

        /* renamed from: ࡑ  reason: contains not printable characters */
        public C3870 f1697;

        /* renamed from: ᘺ  reason: contains not printable characters */
        public C3874 f1698 = new C3874();

        public C3869(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i10, int i11) {
            super(bArr2, 16, 16, 1, 1, i11);
            C3870 r14 = new C3870(C3867.this);
            this.f1697 = r14;
            this.f104 = true;
            this.f102 = true;
            r14.f1700 = bArr2;
            r14.f1701 = bArr;
            r14.f1702 = bArr3;
            r14.f1703 = i10 / 8;
            r14.f1699 = bArr4;
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public byte[] m1890() {
            return this.f1697.f1699;
        }

        /* renamed from: ᅯ  reason: contains not printable characters */
        public void m1892(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
            this.f1698.m1921(bArr, i10, i11);
        }

        /* renamed from: ᐳ  reason: contains not printable characters */
        public void m1893() {
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public void m1889(byte[] bArr) {
            this.f1697.f1699 = bArr;
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public byte[] m1891(byte[] bArr, int i10, int i11) {
            this.f1698.m1921(bArr, i10, i11);
            C4052.m2824(this.f1697, this.f1698.f1729, 0, i11, false);
            return this.f1698.m1923();
        }
    }

    /* renamed from: nts.ᐁ$ᐳ  reason: contains not printable characters */
    public class C3870 {

        /* renamed from: ϴ  reason: contains not printable characters */
        public byte[] f1699 = null;

        /* renamed from: ગ  reason: contains not printable characters */
        public byte[] f1700 = null;

        /* renamed from: ഇ  reason: contains not printable characters */
        public byte[] f1701 = null;

        /* renamed from: ᐳ  reason: contains not printable characters */
        public byte[] f1702 = null;

        /* renamed from: ⶊ  reason: contains not printable characters */
        public int f1703 = 12;

        public C3870(C3867 r12) {
        }
    }

    public C3867() {
        this.f916 = new C4124[]{new C4124(128, 128, 0)};
        this.f910 = new C4124[]{new C4124(128, 256, 64)};
        this.f1848 = new C4124[]{new C4124(8, 128, 8)};
        this.f913 = 256;
        this.f912 = 128;
        this.f914 = 128;
        m2030(128);
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m1880() {
        m901(C3990.m2428(this.f913 / 8));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public C3776 m1881(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return new C3868(bArr, bArr2, bArr3, this.f1850, this.f914);
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m1883() {
        m2029(C3990.m2428(11));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public C3776 m1882(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        return new C3869(bArr, bArr2, bArr3, bArr4, this.f1850, this.f914);
    }
}
