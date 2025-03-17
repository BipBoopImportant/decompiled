package nts;

import java.util.Vector;
import org.slf4j.Marker;

/* renamed from: nts.ᐗ  reason: contains not printable characters */
public class C3871 extends C3987 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public C3871 f1704;

    /* renamed from: Е  reason: contains not printable characters */
    public StringBuffer f1705;

    /* renamed from: и  reason: contains not printable characters */
    public String f1706;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public C3871 f1707;

    /* renamed from: ࡑ  reason: contains not printable characters */
    public int f1708;

    /* renamed from: ખ  reason: contains not printable characters */
    public C3871 f1709;

    /* renamed from: ᅯ  reason: contains not printable characters */
    public int f1710;

    /* renamed from: ᖑ  reason: contains not printable characters */
    public int f1711;

    /* renamed from: ᘺ  reason: contains not printable characters */
    public int f1712;

    /* renamed from: ᜇ  reason: contains not printable characters */
    public int f1713;

    /* renamed from: ⴸ  reason: contains not printable characters */
    public int f1714;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public C3871 f1715;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public C3871 f1716;

    public C3871() {
        this.f1705 = new StringBuffer();
        this.f1708 = 0;
        this.f1706 = "";
        this.f1711 = 0;
        this.f1713 = 0;
    }

    public Object clone() {
        return super.clone();
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public String m1897() {
        String str;
        C3871 r02 = this.f1704;
        String r03 = r02 != null ? r02.m1897() : "";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(r03);
        sb2.append("/");
        if (this.f1706.length() > 0) {
            str = this.f1706;
        } else {
            str = "[" + this.f1711 + "]";
        }
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public String m1898() {
        String str;
        String str2;
        C3871 r02 = this.f1704;
        if (r02 != null) {
            str = r02.m1898();
        } else {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        if (this.f1706.length() <= 0) {
            str2 = "[" + this.f1711 + "]";
        } else if (this.f1706.equals(C3727.m1052("]EZZvzkm66jfwq**", 0, 4, 51))) {
            str2 = "$";
        } else {
            str2 = "['" + this.f1706 + "']";
        }
        sb2.append(str2);
        return sb2.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        if (r3 != 1) goto L_0x0068;
     */
    /* renamed from: ഇ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public nts.C3871 m1900(java.util.StringTokenizer r11, boolean r12, boolean r13) {
        /*
            r10 = this;
            java.lang.String r0 = r11.nextToken()
            java.lang.String r1 = "."
            boolean r1 = r0.equals(r1)
            r2 = 0
            if (r1 == 0) goto L_0x0010
            r1 = r10
            goto L_0x00c6
        L_0x0010:
            java.lang.String r1 = ".."
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x001c
            nts.ᐗ r1 = r10.f1704
            goto L_0x00c6
        L_0x001c:
            java.lang.String r1 = ""
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.lang.String r0 = m1894(r0, r1)
            r1 = r1[r2]
            int r3 = r1.length()
            r4 = 0
            if (r3 <= 0) goto L_0x00b6
            nts.ᐗ r3 = r10.f1707
            if (r3 == 0) goto L_0x00b6
            boolean r3 = m1895((java.lang.String) r1)
            r5 = 1
            if (r3 == 0) goto L_0x0069
            int r3 = m1896(r1)
            if (r13 == 0) goto L_0x0042
            int r3 = r3 + 1
        L_0x0042:
            if (r3 < r5) goto L_0x0068
            int r6 = r10.f1708
            if (r3 <= r6) goto L_0x0049
            goto L_0x0068
        L_0x0049:
            if (r12 != 0) goto L_0x0066
            nts.ᐗ r4 = r10.f1707
        L_0x004d:
            if (r4 == 0) goto L_0x005d
            boolean r5 = r4.m1899(r0)
            if (r5 == 0) goto L_0x0057
            int r3 = r3 + -1
        L_0x0057:
            if (r3 != 0) goto L_0x005a
            goto L_0x005d
        L_0x005a:
            nts.ᐗ r4 = r4.f1716
            goto L_0x004d
        L_0x005d:
            int r1 = m1896(r1)
            r4.f1711 = r1
        L_0x0063:
            r1 = r4
            goto L_0x00c6
        L_0x0066:
            if (r3 == r5) goto L_0x0063
        L_0x0068:
            return r4
        L_0x0069:
            r3 = 6
            r6 = 24
            java.lang.String r7 = "]EZZvzkm66jfwq**"
            r8 = 4
            java.lang.String r3 = nts.C3727.m1052((java.lang.String) r7, (int) r8, (int) r3, (int) r6)
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x00b5
            r3 = 45
            int r3 = r1.indexOf(r3)
            r6 = -1
            if (r3 <= r6) goto L_0x0097
            int r3 = r3 + r5
            java.lang.String r1 = r1.substring(r3)
            java.lang.String r1 = r1.trim()
            boolean r3 = m1895((java.lang.String) r1)
            if (r3 == 0) goto L_0x0096
            int r1 = m1896(r1)
            goto L_0x0098
        L_0x0096:
            return r4
        L_0x0097:
            r1 = r2
        L_0x0098:
            nts.ᐗ r3 = r10.f1709
            nts.ᐗ r4 = r3.f1704
            int r4 = r4.f1708
            int r4 = r4 - r1
            r9 = r3
            r3 = r1
            r1 = r9
        L_0x00a2:
            if (r1 == 0) goto L_0x00b2
            boolean r5 = r1.m1899(r0)
            if (r5 == 0) goto L_0x00af
            if (r3 != 0) goto L_0x00ad
            goto L_0x00b2
        L_0x00ad:
            int r3 = r3 + -1
        L_0x00af:
            nts.ᐗ r1 = r1.f1715
            goto L_0x00a2
        L_0x00b2:
            r1.f1711 = r4
            goto L_0x00c6
        L_0x00b5:
            return r4
        L_0x00b6:
            if (r12 != 0) goto L_0x0063
            nts.ᐗ r1 = r10.f1707
        L_0x00ba:
            if (r1 == 0) goto L_0x00c6
            boolean r3 = r1.m1899(r0)
            if (r3 == 0) goto L_0x00c3
            goto L_0x00c6
        L_0x00c3:
            nts.ᐗ r1 = r1.f1716
            goto L_0x00ba
        L_0x00c6:
            if (r12 == 0) goto L_0x00cf
            boolean r12 = r10.m1899(r0)
            if (r12 == 0) goto L_0x00cf
            r1 = r10
        L_0x00cf:
            boolean r12 = r11.hasMoreTokens()
            if (r12 == 0) goto L_0x00dc
            if (r1 == 0) goto L_0x00dc
            nts.ᐗ r11 = r1.m1900(r11, r2, r13)
            return r11
        L_0x00dc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C3871.m1900(java.util.StringTokenizer, boolean, boolean):nts.ᐗ");
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public String m1902() {
        return this.f1706;
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public String m1903() {
        return this.f1705.toString();
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public static int m1896(String str) {
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            i10 = (i10 * 10) + (str.charAt(i11) - '0');
        }
        return i10;
    }

    public C3871(C3871 r22, String str, int i10) {
        this.f1705 = new StringBuffer();
        this.f1708 = 0;
        this.f1711 = 0;
        this.f1713 = 0;
        this.f1706 = str;
        this.f1704 = r22;
        this.f1714 = i10;
        this.f1712 = i10;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public boolean m1899(String str) {
        if (str.length() == 0 || str.equals(Marker.ANY_MARKER)) {
            return true;
        }
        return this.f1706.equalsIgnoreCase(str);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static String m1894(String str, String[] strArr) {
        int indexOf;
        int indexOf2;
        int indexOf3;
        int i10;
        char charAt;
        if (str.contains("\\")) {
            StringBuffer stringBuffer = new StringBuffer();
            int i11 = 0;
            while (true) {
                if (i11 >= str.length()) {
                    break;
                }
                char charAt2 = str.charAt(i11);
                if (charAt2 != '\\' || (i10 = i11 + 1) >= str.length() || ((charAt = str.charAt(i10)) != '[' && charAt != ']' && charAt != '\\')) {
                    if (charAt2 == '[' && (indexOf3 = str.indexOf("]", i11)) > i11) {
                        strArr[0] = str.substring(i11 + 1, indexOf3);
                        break;
                    }
                    stringBuffer.append(charAt2);
                } else {
                    stringBuffer.append(str.charAt(i10));
                    i11 = i10;
                }
                i11++;
            }
            return stringBuffer.toString();
        } else if (!str.contains("[") || (indexOf2 = str.indexOf("]", indexOf)) <= (indexOf = str.indexOf("["))) {
            return str;
        } else {
            strArr[0] = str.substring(indexOf + 1, indexOf2);
            return str.substring(0, indexOf);
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static boolean m1895(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (!Character.isDigit(str.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public C3871 m1901(C4085 r82) {
        String str;
        C3871 r12;
        if (r82.f3378 == null || !r82.m3216()) {
            str = null;
        } else {
            Vector<String> vector = r82.f3378;
            int i10 = r82.f3377;
            r82.f3377 = i10 + 1;
            str = vector.get(i10);
        }
        if (str.equals("@") || str.equals("$")) {
            r12 = this;
        } else if (str.equals("..")) {
            return null;
        } else {
            String[] strArr = {""};
            String r02 = m1894(str, strArr);
            int i11 = 0;
            String str2 = strArr[0];
            if (str2.length() <= 0 || this.f1707 == null) {
                C3871 r13 = this.f1707;
                while (r12 != null && !r12.m1899(r02)) {
                    r13 = r12.f1716;
                }
            } else if (m1895(str2)) {
                int r32 = m1896(str2);
                if (r32 < 0 || r32 >= this.f1708) {
                    return null;
                }
                r12 = this.f1707;
                while (r12 != null) {
                    if (r12.m1899(r02)) {
                        r32--;
                    }
                    if (r32 < 0) {
                        break;
                    }
                    r12 = r12.f1716;
                }
                r12.f1711 = m1896(str2);
            } else if (!str2.startsWith(C3727.m1052("]EZZvzkm66jfwq**", 10, 6, 10))) {
                return null;
            } else {
                int indexOf = str2.indexOf("-");
                if (indexOf > -1) {
                    String trim = str2.substring(indexOf + 1).trim();
                    if (!m1895(trim)) {
                        return null;
                    }
                    i11 = m1896(trim);
                }
                C3871 r14 = this.f1709;
                int i12 = r14.f1704.f1708 - i11;
                while (r12 != null) {
                    if (r12.m1899(r02)) {
                        if (i11 == 0) {
                            break;
                        }
                        i11--;
                    }
                    r14 = r12.f1715;
                }
                r12.f1711 = i12;
            }
        }
        return (!r82.m3216() || r12 == null) ? r12 : r12.m1901(r82);
    }
}
