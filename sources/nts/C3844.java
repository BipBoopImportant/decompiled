package nts;

/* renamed from: nts.ጅ  reason: contains not printable characters */
public class C3844 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public int f1610;

    /* renamed from: ગ  reason: contains not printable characters */
    public int f1611;

    /* renamed from: ഇ  reason: contains not printable characters */
    public byte[] f1612;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public C3771 f1613;

    public C3844() {
        this.f1612 = C3596.f365;
        this.f1611 = 0;
        this.f1613 = null;
        this.f1610 = 0;
        this.f1613 = m1744();
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public int m1731() {
        return this.f1611 - this.f1610;
    }

    /* renamed from: Е  reason: contains not printable characters */
    public void m1734(int i10) {
        m1749((long) i10, 3);
    }

    /* renamed from: и  reason: contains not printable characters */
    public int m1735() {
        return (int) (m1762(2) & 65535);
    }

    /* renamed from: ࡏ  reason: contains not printable characters */
    public void m1737(int i10) {
        m1745((byte) i10);
    }

    /* renamed from: ࡑ  reason: contains not printable characters */
    public byte[] m1738() {
        return m1732(this.f1611 - this.f1610);
    }

    /* renamed from: ખ  reason: contains not printable characters */
    public void m1740(int i10) {
        m1749((long) i10, 2);
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public byte[] m1743() {
        return this.f1612;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1750(String str) {
        String str2 = C3823.f1540;
        byte[] bytes = str.getBytes();
        int i10 = 0;
        while (i10 < bytes.length && bytes[i10] != 0) {
            i10++;
        }
        m1742(bytes, 0, i10);
        if (i10 == bytes.length) {
            m1745((byte) 0);
        }
    }

    /* renamed from: ᅯ  reason: contains not printable characters */
    public byte[] m1754() {
        return m1732((m1733() + 7) / 8);
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public byte[] m1755() {
        int i10 = this.f1611;
        byte[] bArr = this.f1612;
        if (i10 == bArr.length) {
            return bArr;
        }
        return C3823.m1630(bArr, 0, i10);
    }

    /* renamed from: ᖑ  reason: contains not printable characters */
    public void m1757() {
        this.f1612 = C3596.f365;
        this.f1611 = 0;
        this.f1610 = 0;
    }

    /* renamed from: ᘺ  reason: contains not printable characters */
    public String m1758() {
        byte[] r02 = m1732(m1733());
        String str = C3823.f1540;
        return new String(r02);
    }

    /* renamed from: ⴸ  reason: contains not printable characters */
    public void m1759(int i10) {
        m1749((long) i10, 4);
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public byte m1761() {
        m1746(1);
        byte[] bArr = this.f1612;
        int i10 = this.f1610;
        this.f1610 = i10 + 1;
        return bArr[i10];
    }

    /* renamed from: ⶏ  reason: contains not printable characters */
    public void m1764(int i10) {
        this.f1610 += i10;
    }

    /* renamed from: Е  reason: contains not printable characters */
    public int m1733() {
        return (int) m1762(4);
    }

    /* renamed from: ࡏ  reason: contains not printable characters */
    public short m1736() {
        return (short) ((int) m1762(2));
    }

    /* renamed from: ખ  reason: contains not printable characters */
    public int m1739() {
        return (int) m1762(3);
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m1741(int i10) {
        int i11 = this.f1610;
        byte[] bArr = this.f1612;
        int length = (i10 + i11) - bArr.length;
        if (length > 0) {
            byte[] bArr2 = new byte[(bArr.length + length)];
            System.arraycopy(bArr, 0, bArr2, 0, i11);
            this.f1612 = bArr2;
        }
    }

    /* renamed from: ⴸ  reason: contains not printable characters */
    public byte[] m1760() {
        return m1732(m1733());
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: ⶏ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String m1763() {
        /*
            r5 = this;
            int r0 = r5.f1610
        L_0x0002:
            int r1 = r5.f1611
            if (r0 >= r1) goto L_0x000f
            byte[] r2 = r5.f1612
            byte r2 = r2[r0]
            if (r2 == 0) goto L_0x000f
            int r0 = r0 + 1
            goto L_0x0002
        L_0x000f:
            if (r0 > r1) goto L_0x0023
            byte[] r1 = r5.f1612
            int r2 = r5.f1610
            int r3 = r0 - r2
            java.lang.String r4 = nts.C3823.f1540
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1, r2, r3)
            int r0 = r0 + 1
            r5.f1610 = r0
            return r4
        L_0x0023:
            r0 = 42
            r1 = 20
            java.lang.String r2 = "sCBKBR\u0005PDE\t[GA_X\u001dlAX@O\nGGS\u0006CMMF\u0001NJRQ\u001cO_KU^XT@\\@\u0011V`|-x`f`("
            r3 = 17
            java.lang.String r0 = nts.C3727.m1052((java.lang.String) r2, (int) r3, (int) r0, (int) r1)
            nts.Ԕ r1 = new nts.Ԕ
            r2 = 0
            r3 = 0
            r1.<init>(r2, r3, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C3844.m1763():java.lang.String");
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public byte[] m1732(int i10) {
        m1746(i10);
        byte[] bArr = new byte[i10];
        int min = Math.min(this.f1611 - this.f1610, i10);
        System.arraycopy(this.f1612, this.f1610, bArr, 0, min);
        this.f1610 += min;
        return bArr;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public byte[] m1756(int i10) {
        return C3823.m1630(this.f1612, i10, this.f1611 - i10);
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public long m1762(int i10) {
        m1746(i10);
        long r02 = this.f1613.m1235(this.f1612, this.f1610, i10);
        this.f1610 += i10;
        return r02;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m1742(byte[] bArr, int i10, int i11) {
        m1741(i11);
        System.arraycopy(bArr, i10, this.f1612, this.f1610, i11);
        this.f1610 += i11;
        this.f1611 += i11;
    }

    public C3844(byte[] bArr, int i10, int i11) {
        this();
        m1753(bArr, i10, i11);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public C3771 m1744() {
        return new C4121();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1747(int i10, int i11) {
        int i12 = i10 + i11;
        byte[] bArr = this.f1612;
        if (i12 <= bArr.length) {
            int length = bArr.length - i11;
            byte[] bArr2 = new byte[length];
            if (i10 > 0) {
                System.arraycopy(bArr, 0, bArr2, 0, i10);
            }
            System.arraycopy(this.f1612, i12, bArr2, i10, length - i10);
            this.f1612 = bArr2;
            this.f1610 = length;
            this.f1611 = length;
            return;
        }
        throw new C3625((Throwable) null, 0, "");
    }

    public C3844(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public C3844(int i10) {
        this(new byte[i10]);
        this.f1611 = 0;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1753(byte[] bArr, int i10, int i11) {
        if (i10 == 0 && i11 == bArr.length) {
            this.f1612 = bArr;
            this.f1611 = bArr.length;
            return;
        }
        byte[] r22 = C3823.m1630(bArr, i10, i11);
        this.f1612 = r22;
        this.f1611 = r22.length;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1748(int i10, long j10) {
        this.f1613.m1236(j10, this.f1612, i10, 2);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1752(byte[] bArr) {
        m1742(bArr, 0, bArr.length);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1745(byte b10) {
        m1741(1);
        byte[] bArr = this.f1612;
        int i10 = this.f1610;
        this.f1610 = i10 + 1;
        bArr[i10] = b10;
        this.f1611++;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1751(short s10) {
        m1749((long) s10, 2);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final void m1749(long j10, int i10) {
        m1741(i10);
        this.f1613.m1236(j10, this.f1612, this.f1610, i10);
        this.f1610 += i10;
        this.f1611 += i10;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1746(int i10) {
        if (this.f1610 + i10 > this.f1611) {
            throw new C3625((Throwable) null, 0, C3727.m1052("sCBKBR\u0005PDE\t[GA_X\u001dlAX@O\nGGS\u0006CMMF\u0001NJRQ\u001cO_KU^XT@\\@\u0011V`|-x`f`(", 0, 17, 50));
        }
    }
}
