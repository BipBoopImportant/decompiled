package nts;

/* renamed from: nts.ᚃ  reason: contains not printable characters */
public class C3948 {

    /* renamed from: ഇ  reason: contains not printable characters */
    public StringBuffer f2269 = new StringBuffer();

    /* renamed from: ഇ  reason: contains not printable characters */
    public static char m2134(byte b10) {
        return (char) (b10 & 255);
    }

    public boolean equals(Object obj) {
        return obj instanceof String ? m2151((String) obj) : super.equals(obj);
    }

    public String toString() {
        return this.f2269.toString();
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public int m2139(String str) {
        if (str == null) {
            str = "";
        }
        this.f2269.setLength(0);
        this.f2269.append(str);
        return 0;
    }

    /* renamed from: ࡏ  reason: contains not printable characters */
    public int m2143() {
        this.f2269.setLength(0);
        return 0;
    }

    /* renamed from: ખ  reason: contains not printable characters */
    public int m2144() {
        int i10 = 0;
        while (m2145(i10) == ' ') {
            i10++;
        }
        if (i10 > this.f2269.length()) {
            i10 = this.f2269.length();
        }
        m2139(this.f2269.substring(i10));
        int length = this.f2269.length();
        while (length > 0 && m2145(length - 1) == ' ') {
            length--;
        }
        return m2171(length);
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public int m2149(String str, int i10) {
        if (str == null) {
            str = "";
        }
        if (i10 >= 0) {
            m2139(str.substring(0, i10));
        }
        return 0;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public int m2167(byte[] bArr, int i10) {
        if (bArr == null) {
            m2143();
        } else if (i10 >= 0) {
            m2139(m2133(bArr, 0, i10));
        }
        return 0;
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public void m2172() {
        int length = this.f2269.length();
        for (int i10 = 0; i10 < length; i10++) {
            this.f2269.setCharAt(i10, 0);
        }
        this.f2269.delete(0, length);
    }

    /* renamed from: ⶏ  reason: contains not printable characters */
    public int m2175(int i10) {
        m2139(this.f2269.substring(i10));
        return 0;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public int m2147(char c10) {
        this.f2269.append(c10);
        return 0;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m2158(String str) {
        if (str == null) {
            return 0;
        }
        this.f2269.append(str);
        return 0;
    }

    /* renamed from: ⶏ  reason: contains not printable characters */
    public int m2174() {
        return this.f2269.length();
    }

    /* renamed from: ⶏ  reason: contains not printable characters */
    public static byte[] m2138(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            bArr[i10] = (byte) str.charAt(i10);
        }
        return bArr;
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public int m2140(byte[] bArr) {
        if (bArr == null) {
            m2143();
            return 0;
        }
        m2139(m2133(bArr, 0, bArr.length));
        return 0;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public int m2146(byte b10) {
        this.f2269.append(m2134(b10));
        return 0;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m2159(String str, int i10) {
        if (i10 > 0) {
            this.f2269.append(str.substring(0, i10));
        }
        return 0;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public boolean m2170(byte[] bArr) {
        return C3874.m1912(m2153(), bArr);
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public byte[] m2153() {
        return m2138(this.f2269.toString());
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m2162(byte[] bArr) {
        if (bArr != null) {
            this.f2269.append(m2133(bArr, 0, bArr.length));
        }
        return 0;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public int m2166() {
        int i10;
        String stringBuffer = this.f2269.toString();
        int i11 = 0;
        if (stringBuffer == null || stringBuffer.length() == 0) {
            return 0;
        }
        int i12 = 1;
        if ('-' == stringBuffer.charAt(0)) {
            i10 = -1;
        } else {
            i10 = 1;
            i12 = 0;
        }
        while (i12 < stringBuffer.length() && stringBuffer.charAt(i12) >= '0' && stringBuffer.charAt(i12) <= '9') {
            i11 = (i11 * 10) + (stringBuffer.charAt(i12) - '0');
            i12++;
        }
        return i11 * i10;
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public boolean m2173(String str) {
        if (str == null) {
            str = "";
        }
        return this.f2269.toString().startsWith(str);
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public long m2141() {
        long j10;
        String stringBuffer = this.f2269.toString();
        long j11 = 0;
        if (stringBuffer == null || stringBuffer.length() == 0) {
            return 0;
        }
        int i10 = 0;
        if ('-' == stringBuffer.charAt(0)) {
            i10 = 1;
            j10 = -1;
        } else {
            j10 = 1;
        }
        while (i10 < stringBuffer.length() && stringBuffer.charAt(i10) >= '0' && stringBuffer.charAt(i10) <= '9') {
            j11 = (j11 * 10) + ((long) (stringBuffer.charAt(i10) - '0'));
            i10++;
        }
        return j11 * j10;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public boolean m2151(String str) {
        if (str == null) {
            str = "";
        }
        return this.f2269.toString().equals(str);
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m2171(int i10) {
        if (this.f2269.length() == i10) {
            return 0;
        }
        if (this.f2269.length() > i10) {
            m2157(0, i10);
            return 0;
        }
        for (int length = this.f2269.length(); length < i10; length++) {
            m2147(' ');
        }
        return 0;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m2163(byte[] bArr, int i10) {
        if (i10 > 0) {
            this.f2269.append(m2133(bArr, 0, i10));
        }
        return 0;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public char m2145(int i10) {
        if (i10 >= this.f2269.length()) {
            return 0;
        }
        return this.f2269.toString().charAt(i10);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m2155(int i10) {
        StringBuffer stringBuffer = this.f2269;
        stringBuffer.append("" + i10);
        return 0;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m2157(int i10, int i11) {
        m2139(this.f2269.substring(i10, i11));
        return 0;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m2154(char c10) {
        StringBuffer stringBuffer = this.f2269;
        return stringBuffer.indexOf("" + c10);
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public boolean m2169(String str) {
        if (str == null) {
            str = "";
        }
        String stringBuffer = this.f2269.toString();
        String str2 = C3823.f1540;
        return stringBuffer.equalsIgnoreCase(str);
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public boolean m2152(byte[] bArr, int i10) {
        if (this.f2269.length() != i10 || bArr.length < i10) {
            return false;
        }
        return C3874.m1912(m2153(), C3823.m1630(bArr, 0, i10));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m2160(String str, String str2) {
        if (!(str == null || str.length() == 0)) {
            int i10 = 0;
            while (i10 >= 0) {
                i10 = this.f2269.indexOf(str, i10);
                if (i10 >= 0) {
                    this.f2269.replace(i10, str.length() + i10, str2);
                    i10 += str2.length();
                }
            }
        }
        return 0;
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public byte[] m2142(int i10) {
        if (i10 < 0 || i10 >= this.f2269.length()) {
            return null;
        }
        return m2138(m2168(i10));
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public String m2168(int i10) {
        return (i10 < 0 || i10 >= this.f2269.length()) ? "" : this.f2269.substring(i10);
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public int m2148(int i10, byte b10) {
        if (this.f2269.length() <= i10) {
            m2171(i10 + 1);
        }
        this.f2269.setCharAt(i10, m2134(b10));
        return 0;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public String m2165() {
        return this.f2269.toString();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m2161(C3948 r22) {
        m2149(r22.f2269.toString(), r22.f2269.length());
        return 0;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public int m2150(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        int i10 = 0;
        if (bArr2.length != 0) {
            byte[] bArr3 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
            byte[] r22 = C3823.m1620(C3727.m1052("XYZ[\\]^_PQRSTUVWHIJKLMNO@ABCDEFGxyz{|}~pqrstuvwhijklmno`abcdefg\u0018\u0019\u001a\u0005#8.$ .k\"))&4n&,)?2:x/;7!0x\u0017\r\u0005\u000f}f\u0011,.j/'=#,8s!%\">82t|\u001d\u001bQJ\u001eQSI\u0012@EAFXFAOO\u0006¶ØÐÊÎ", 0, 67, 59));
            byte[] r82 = C3823.m1630(r22, 0, r22.length);
            int i11 = ((length + 15) / 16) * 16;
            int i12 = 0;
            while (i12 < i11) {
                int i13 = i10;
                while (i13 < 16) {
                    if (i12 < length) {
                        byte b10 = bArr2[i12];
                        int i14 = i13 * 3;
                        int i15 = i13 + 51;
                        r82[i14] = bArr3[(b10 & 255) >> 4];
                        r82[i14 + 1] = bArr3[b10 & 15];
                        if (b10 < 32 || b10 > 126) {
                            b10 = 46;
                        }
                        r82[i15] = b10;
                    }
                    i13++;
                    i12++;
                }
                if (!C3823.m1590("")) {
                    m2158("");
                }
                m2158(C3823.m1609((long) (i12 - 16), 4, true));
                m2158("  ");
                m2158(C3823.m1611(r82));
                if (i12 < length) {
                    m2158("\r\n");
                }
                r82 = C3823.m1630(r22, 0, r22.length);
                i10 = 0;
            }
        }
        return i10;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m2156(int i10, byte b10) {
        char r32 = m2134(b10);
        while (i10 > 0) {
            this.f2269.append(r32);
            i10--;
        }
        return 0;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m2164(byte[] bArr, int i10, int i11) {
        m2158(new String(C3823.m1619(8, bArr, i10, i11, true)));
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0173, code lost:
        if (r2 != 'A') goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x01af, code lost:
        if (r13 != 's') goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x01c9, code lost:
        if (r2 != 'n') goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x01ed, code lost:
        if (r14.length() == 0) goto L_0x03e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0132, code lost:
        if (r13 != 's') goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x013a, code lost:
        if (r2.equals("l") == false) goto L_0x00f3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x03ea A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x03ea A[SYNTHETIC] */
    /* renamed from: ഇ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m2137(java.lang.String r17, java.lang.Object... r18) {
        /*
            r0 = r17
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r3 = 0
            r4 = 0
        L_0x0009:
            int r5 = r17.length()
            if (r3 >= r5) goto L_0x0424
            char r5 = r0.charAt(r3)
            r6 = 37
            r7 = 1
            if (r5 != r6) goto L_0x001f
            int r8 = r17.length()
            int r8 = r8 - r7
            if (r3 != r8) goto L_0x0022
        L_0x001f:
            r6 = 0
            goto L_0x041d
        L_0x0022:
            int r5 = r3 + 1
            char r8 = r0.charAt(r5)
            if (r8 != r6) goto L_0x0032
            r1.append(r6)
            r3 = r5
            r2 = r7
        L_0x002f:
            r6 = 0
            goto L_0x0421
        L_0x0032:
            char r6 = r0.charAt(r5)
            r8 = 45
            r9 = 32
            r10 = 48
            if (r6 == r8) goto L_0x004d
            r11 = 43
            if (r6 == r11) goto L_0x004d
            if (r6 == r9) goto L_0x004d
            r11 = 35
            if (r6 == r11) goto L_0x004d
            if (r6 != r10) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r6 = 0
            goto L_0x004f
        L_0x004d:
            int r5 = r3 + 2
        L_0x004f:
            char r11 = r0.charAt(r5)
            r12 = -1
            r13 = 57
            if (r11 < r10) goto L_0x0080
            char r11 = r0.charAt(r5)
            if (r11 > r13) goto L_0x0080
            char r11 = r0.charAt(r5)
            int r11 = r11 - r10
        L_0x0063:
            int r5 = r5 + 1
            int r14 = r17.length()
            if (r5 >= r14) goto L_0x0081
            char r14 = r0.charAt(r5)
            if (r14 < r10) goto L_0x0081
            char r14 = r0.charAt(r5)
            if (r14 > r13) goto L_0x0081
            int r11 = r11 * 10
            char r14 = r0.charAt(r5)
            int r14 = r14 - r10
            int r11 = r11 + r14
            goto L_0x0063
        L_0x0080:
            r11 = r12
        L_0x0081:
            char r14 = r0.charAt(r5)
            r15 = 46
            if (r14 != r15) goto L_0x00bc
            int r14 = r5 + 1
            char r15 = r0.charAt(r14)
            if (r15 < r10) goto L_0x00bb
            char r15 = r0.charAt(r14)
            if (r15 > r13) goto L_0x00bb
            char r12 = r0.charAt(r14)
            int r12 = r12 - r10
            int r5 = r5 + 2
        L_0x009e:
            int r14 = r17.length()
            if (r5 >= r14) goto L_0x00bc
            char r14 = r0.charAt(r5)
            if (r14 < r10) goto L_0x00bc
            char r14 = r0.charAt(r5)
            if (r14 > r13) goto L_0x00bc
            int r12 = r12 * 10
            char r14 = r0.charAt(r5)
            int r14 = r14 - r10
            int r12 = r12 + r14
            int r5 = r5 + 1
            goto L_0x009e
        L_0x00bb:
            r5 = r14
        L_0x00bc:
            char r13 = r0.charAt(r5)
            r14 = 104(0x68, float:1.46E-43)
            r10 = 117(0x75, float:1.64E-43)
            r15 = 120(0x78, float:1.68E-43)
            r8 = 105(0x69, float:1.47E-43)
            r9 = 100
            r7 = 111(0x6f, float:1.56E-43)
            if (r13 != r14) goto L_0x00fc
            int r13 = r5 + 1
            char r14 = r0.charAt(r13)
            r2 = 104(0x68, float:1.46E-43)
            if (r14 != r2) goto L_0x00db
            int r5 = r5 + 2
            goto L_0x00dc
        L_0x00db:
            r5 = r13
        L_0x00dc:
            char r13 = r0.charAt(r5)
            if (r13 == r9) goto L_0x00f7
            if (r13 == r8) goto L_0x00f7
            if (r13 == r10) goto L_0x00f7
            if (r13 == r7) goto L_0x00f7
            if (r13 == r15) goto L_0x00f7
            r2 = 88
            if (r13 == r2) goto L_0x00f7
            r2 = 110(0x6e, float:1.54E-43)
            if (r13 != r2) goto L_0x00f3
            goto L_0x00f7
        L_0x00f3:
            r2 = 0
            r13 = 0
            goto L_0x01cc
        L_0x00f7:
            int r5 = r5 + 1
        L_0x00f9:
            r2 = 1
            goto L_0x01cc
        L_0x00fc:
            r2 = 108(0x6c, float:1.51E-43)
            if (r13 != r2) goto L_0x013d
            int r2 = r5 + 1
            char r13 = r0.charAt(r2)
            r14 = 108(0x6c, float:1.51E-43)
            if (r13 != r14) goto L_0x010f
            int r5 = r5 + 2
            java.lang.String r2 = "ll"
            goto L_0x0116
        L_0x010f:
            java.lang.String r5 = "l"
            r16 = r5
            r5 = r2
            r2 = r16
        L_0x0116:
            char r13 = r0.charAt(r5)
            if (r13 == r9) goto L_0x00f9
            if (r13 == r8) goto L_0x00f9
            if (r13 == r10) goto L_0x00f9
            if (r13 == r7) goto L_0x00f9
            if (r13 == r15) goto L_0x00f9
            r10 = 88
            if (r13 == r10) goto L_0x00f9
            r10 = 110(0x6e, float:1.54E-43)
            if (r13 == r10) goto L_0x00f9
            r10 = 99
            if (r13 == r10) goto L_0x0134
            r10 = 115(0x73, float:1.61E-43)
            if (r13 != r10) goto L_0x00f3
        L_0x0134:
            java.lang.String r10 = "l"
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L_0x00f3
            goto L_0x00f9
        L_0x013d:
            r2 = 106(0x6a, float:1.49E-43)
            if (r13 == r2) goto L_0x01b3
            r2 = 122(0x7a, float:1.71E-43)
            if (r13 == r2) goto L_0x01b3
            r2 = 116(0x74, float:1.63E-43)
            if (r13 != r2) goto L_0x014b
            goto L_0x01b3
        L_0x014b:
            r2 = 76
            if (r13 != r2) goto L_0x0177
            int r5 = r5 + 1
            char r2 = r0.charAt(r5)
            r10 = 102(0x66, float:1.43E-43)
            if (r2 == r10) goto L_0x0175
            r10 = 70
            if (r2 == r10) goto L_0x0175
            r10 = 101(0x65, float:1.42E-43)
            if (r2 == r10) goto L_0x0175
            r10 = 69
            if (r2 == r10) goto L_0x0175
            r10 = 103(0x67, float:1.44E-43)
            if (r2 == r10) goto L_0x0175
            r10 = 71
            if (r2 == r10) goto L_0x0175
            r10 = 97
            if (r2 == r10) goto L_0x0175
            r10 = 65
            if (r2 != r10) goto L_0x00f3
        L_0x0175:
            r13 = r2
            goto L_0x00f9
        L_0x0177:
            if (r13 == r9) goto L_0x00f9
            if (r13 == r8) goto L_0x00f9
            if (r13 == r10) goto L_0x00f9
            if (r13 == r7) goto L_0x00f9
            if (r13 == r15) goto L_0x00f9
            r2 = 88
            if (r13 == r2) goto L_0x00f9
            r2 = 110(0x6e, float:1.54E-43)
            if (r13 == r2) goto L_0x00f9
            r2 = 102(0x66, float:1.43E-43)
            if (r13 == r2) goto L_0x00f9
            r2 = 70
            if (r13 == r2) goto L_0x00f9
            r2 = 101(0x65, float:1.42E-43)
            if (r13 == r2) goto L_0x00f9
            r2 = 69
            if (r13 == r2) goto L_0x00f9
            r2 = 103(0x67, float:1.44E-43)
            if (r13 == r2) goto L_0x00f9
            r2 = 71
            if (r13 == r2) goto L_0x00f9
            r2 = 97
            if (r13 == r2) goto L_0x00f9
            r2 = 65
            if (r13 == r2) goto L_0x00f9
            r2 = 99
            if (r13 == r2) goto L_0x00f9
            r2 = 115(0x73, float:1.61E-43)
            if (r13 != r2) goto L_0x00f3
            goto L_0x00f9
        L_0x01b3:
            int r5 = r5 + 1
            char r2 = r0.charAt(r5)
            if (r2 == r9) goto L_0x0175
            if (r2 == r8) goto L_0x0175
            if (r2 == r10) goto L_0x0175
            if (r2 == r7) goto L_0x0175
            if (r2 == r15) goto L_0x0175
            r10 = 88
            if (r2 == r10) goto L_0x0175
            r10 = 110(0x6e, float:1.54E-43)
            if (r2 != r10) goto L_0x00f3
            goto L_0x0175
        L_0x01cc:
            java.lang.String r10 = "XYZ[\\]^_PQRSTUVWHIJKLMNO@ABCDEFGxyz{|}~pqrstuvwhijklmno`abcdefg\u0018\u0019\u001a\u0005#8.$ .k\"))&4n&,)?2:x/;7!0x\u0017\r\u0005\u000f}f\u0011,.j/'=#,8s!%\">82t|\u001d\u001bQJ\u001eQSI\u0012@EAFXFAOO\u0006¶ØÐÊÎ"
            if (r2 == 0) goto L_0x03ea
            int r2 = r4 + 1
            r4 = r18[r4]
            java.lang.String r14 = ""
            r7 = 115(0x73, float:1.61E-43)
            if (r13 != r7) goto L_0x01f1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r14)
            java.lang.String r14 = r7.toString()
            int r4 = r14.length()
            if (r4 != 0) goto L_0x02f9
            goto L_0x03e5
        L_0x01f1:
            r7 = 99
            if (r13 != r7) goto L_0x0231
            boolean r7 = r4 instanceof java.lang.Character
            if (r7 == 0) goto L_0x020a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r14)
            java.lang.String r4 = r7.toString()
            goto L_0x037e
        L_0x020a:
            boolean r7 = r4 instanceof java.lang.Integer
            if (r7 == 0) goto L_0x02f9
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 < 0) goto L_0x02f9
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r4 > r7) goto L_0x02f9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r8
            char r4 = (char) r4
            r7.append(r4)
            r7.append(r14)
            java.lang.String r14 = r7.toString()
            goto L_0x02f9
        L_0x0231:
            if (r13 == r9) goto L_0x0235
            if (r13 != r8) goto L_0x0238
        L_0x0235:
            r7 = 0
            goto L_0x0345
        L_0x0238:
            if (r13 == r15) goto L_0x0242
            r7 = 111(0x6f, float:1.56E-43)
            if (r13 == r7) goto L_0x0242
            r7 = 88
            if (r13 != r7) goto L_0x0245
        L_0x0242:
            r7 = 1
            goto L_0x030e
        L_0x0245:
            r7 = 102(0x66, float:1.43E-43)
            if (r13 == r7) goto L_0x024d
            r7 = 70
            if (r13 != r7) goto L_0x02f9
        L_0x024d:
            boolean r7 = r4 instanceof java.lang.Float
            if (r7 == 0) goto L_0x0258
            java.lang.Float r4 = (java.lang.Float) r4
            double r7 = r4.doubleValue()
            goto L_0x0262
        L_0x0258:
            boolean r7 = r4 instanceof java.lang.Double
            if (r7 == 0) goto L_0x02fc
            java.lang.Double r4 = (java.lang.Double) r4
            double r7 = r4.doubleValue()
        L_0x0262:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            r4.append(r14)
            java.lang.String r14 = r4.toString()
            if (r12 <= 0) goto L_0x02f9
            java.lang.String r4 = "."
            int r4 = r14.indexOf(r4)
            if (r4 >= 0) goto L_0x0297
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r14)
            java.lang.String r7 = "."
            r4.append(r7)
            r7 = 48
            java.lang.String r8 = m2136((char) r7, (int) r12)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            goto L_0x037e
        L_0x0297:
            int r7 = r14.length()
            int r7 = r7 - r4
            r8 = 1
            int r7 = r7 - r8
            if (r7 >= r12) goto L_0x02b8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r14)
            int r12 = r12 - r7
            r7 = 48
            java.lang.String r8 = m2136((char) r7, (int) r12)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            goto L_0x037e
        L_0x02b8:
            if (r7 <= r12) goto L_0x02f9
            int r4 = r4 + r12
            java.lang.String r7 = r14.substring(r4)
            r8 = 0
            java.lang.String r4 = r14.substring(r8, r4)
            r9 = 1
            char r12 = r7.charAt(r9)
            r13 = 53
            if (r12 < r13) goto L_0x02e4
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r4)
            char r4 = r7.charAt(r8)
            int r4 = r4 + r9
            char r4 = (char) r4
            r12.append(r4)
            java.lang.String r4 = r12.toString()
            goto L_0x037e
        L_0x02e4:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r4)
            char r4 = r7.charAt(r8)
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            goto L_0x037e
        L_0x02f9:
            r4 = r14
            goto L_0x037e
        L_0x02fc:
            nts.Ԕ r0 = new nts.Ԕ
            r1 = 27
            r2 = 20
            r3 = 67
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r10, (int) r3, (int) r1, (int) r2)
            r2 = 0
            r3 = 0
            r0.<init>(r2, r3, r1)
            throw r0
        L_0x030e:
            long r8 = m2135((java.lang.Object) r4, (boolean) r7)
            r4 = 111(0x6f, float:1.56E-43)
            if (r13 != r4) goto L_0x031b
            java.lang.String r7 = java.lang.Long.toOctalString(r8)
            goto L_0x031f
        L_0x031b:
            java.lang.String r7 = java.lang.Long.toHexString(r8)
        L_0x031f:
            r8 = 35
            if (r6 != r8) goto L_0x033c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            if (r13 != r4) goto L_0x032d
            java.lang.String r4 = "0"
            goto L_0x032f
        L_0x032d:
            java.lang.String r4 = "0x"
        L_0x032f:
            r8.append(r4)
            r8.append(r7)
            java.lang.String r4 = r8.toString()
        L_0x0339:
            r7 = 88
            goto L_0x033e
        L_0x033c:
            r4 = r7
            goto L_0x0339
        L_0x033e:
            if (r13 != r7) goto L_0x037e
            java.lang.String r4 = r4.toUpperCase()
            goto L_0x037e
        L_0x0345:
            long r8 = m2135((java.lang.Object) r4, (boolean) r7)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r8)
            r4.append(r14)
            java.lang.String r4 = r4.toString()
            int r7 = r4.length()
            if (r7 <= 0) goto L_0x037e
            r7 = 32
            if (r6 == r7) goto L_0x0366
            r7 = 43
            if (r6 != r7) goto L_0x037e
        L_0x0366:
            r7 = 0
            char r8 = r4.charAt(r7)
            r7 = 45
            if (r8 == r7) goto L_0x037e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
        L_0x037e:
            int r7 = r4.length()
            if (r7 <= 0) goto L_0x03ea
            int r3 = r4.length()
            if (r11 <= r3) goto L_0x03e2
            r3 = 45
            if (r6 != r3) goto L_0x03a9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            int r4 = r4.length()
            int r11 = r11 - r4
            r4 = 32
            java.lang.String r4 = m2136((char) r4, (int) r11)
            r3.append(r4)
            java.lang.String r4 = r3.toString()
            goto L_0x03e2
        L_0x03a9:
            r3 = 48
            if (r6 != r3) goto L_0x03c6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r7 = r4.length()
            int r11 = r11 - r7
            java.lang.String r3 = m2136((char) r3, (int) r11)
            r6.append(r3)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            goto L_0x03e2
        L_0x03c6:
            if (r6 != 0) goto L_0x03e2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r6 = r4.length()
            int r11 = r11 - r6
            r6 = 32
            java.lang.String r6 = m2136((char) r6, (int) r11)
            r3.append(r6)
            r3.append(r4)
            java.lang.String r4 = r3.toString()
        L_0x03e2:
            r1.append(r4)
        L_0x03e5:
            r4 = r2
            r3 = r5
            r2 = 1
            goto L_0x002f
        L_0x03ea:
            nts.Ԕ r1 = new nts.Ԕ
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r4 = 25
            r6 = 4
            r7 = 94
            java.lang.String r4 = nts.C3727.m1052((java.lang.String) r10, (int) r7, (int) r4, (int) r6)
            r2.append(r4)
            r4 = 1
            int r5 = r5 + r4
            java.lang.String r0 = r0.substring(r3, r5)
            r2.append(r0)
            r0 = 19
            r3 = 94
            r4 = 119(0x77, float:1.67E-43)
            java.lang.String r0 = nts.C3727.m1052((java.lang.String) r10, (int) r4, (int) r0, (int) r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = 0
            r6 = 0
            r1.<init>(r2, r6, r0)
            throw r1
        L_0x041d:
            r1.append(r5)
            r2 = 1
        L_0x0421:
            int r3 = r3 + r2
            goto L_0x0009
        L_0x0424:
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C3948.m2137(java.lang.String, java.lang.Object[]):java.lang.String");
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public static String m2133(byte[] bArr, int i10, int i11) {
        StringBuffer stringBuffer = new StringBuffer();
        int i12 = i10;
        while (i12 < i10 + i11 && i12 < bArr.length) {
            stringBuffer.append(m2134(bArr[i12]));
            i12++;
        }
        return stringBuffer.toString();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static String m2136(char c10, int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append(c10);
        }
        return sb2.toString();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static long m2135(Object obj, boolean z10) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            return z10 ? ((long) intValue) & 4294967295L : (long) intValue;
        } else if (obj instanceof Short) {
            short shortValue = ((Short) obj).shortValue();
            return z10 ? ((long) shortValue) & 65535 : (long) shortValue;
        } else if (obj instanceof Character) {
            char charValue = ((Character) obj).charValue();
            if (z10) {
                charValue &= 65535;
            }
            return (long) charValue;
        } else if (obj instanceof Long) {
            return ((Long) obj).longValue();
        } else {
            if (obj instanceof Byte) {
                return (long) (((Byte) obj).byteValue() & 255);
            }
            throw new C3625((Throwable) null, 0, C3727.m1052("XYZ[\\]^_PQRSTUVWHIJKLMNO@ABCDEFGxyz{|}~pqrstuvwhijklmno`abcdefg\u0018\u0019\u001a\u0005#8.$ .k\"))&4n&,)?2:x/;7!0x\u0017\r\u0005\u000f}f\u0011,.j/'=#,8s!%\">82t|\u001d\u001bQJ\u001eQSI\u0012@EAFXFAOO\u0006¶ØÐÊÎ", 138, 23, 98) + obj.toString() + "'");
        }
    }
}
