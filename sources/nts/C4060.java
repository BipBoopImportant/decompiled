package nts;

import java.util.Vector;
import org.slf4j.Marker;

/* renamed from: nts.ᵪ  reason: contains not printable characters */
public class C4060 extends C3987 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public C4060 f2980;

    /* renamed from: Е  reason: contains not printable characters */
    public Vector f2981;

    /* renamed from: и  reason: contains not printable characters */
    public int f2982;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public C4060 f2983;

    /* renamed from: ࡑ  reason: contains not printable characters */
    public int f2984;

    /* renamed from: ખ  reason: contains not printable characters */
    public C4060 f2985;

    /* renamed from: ᅯ  reason: contains not printable characters */
    public Vector f2986;

    /* renamed from: ᖑ  reason: contains not printable characters */
    public int f2987;

    /* renamed from: ᘺ  reason: contains not printable characters */
    public StringBuilder f2988;

    /* renamed from: ᜇ  reason: contains not printable characters */
    public C3953 f2989;

    /* renamed from: ⴸ  reason: contains not printable characters */
    public Vector f2990;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public C4060 f2991;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public C4060 f2992;

    public C4060() {
        this.f2981 = new Vector();
        this.f2990 = new Vector();
        this.f2989 = new C3953();
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public static int m2850(String str) {
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            i10 = (i10 * 10) + (str.charAt(i11) - '0');
        }
        return i10;
    }

    public Object clone() {
        return super.clone();
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public String m2852() {
        String str;
        C4060 r02 = this.f2980;
        if (r02 != null) {
            str = r02.m2852();
        } else {
            str = "";
        }
        return str + "/" + this.f2989.f2326;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0103, code lost:
        if (r1 != 1) goto L_0x0105;
     */
    /* renamed from: ഇ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public nts.C4060 m2854(java.util.StringTokenizer r14, boolean r15) {
        /*
            r13 = this;
            java.lang.String r0 = r14.nextToken()
            java.lang.String r1 = "."
            boolean r1 = r0.equals(r1)
            r2 = 0
            if (r1 == 0) goto L_0x0010
            r0 = r13
            goto L_0x01d2
        L_0x0010:
            java.lang.String r1 = ".."
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x001c
            nts.ᵪ r0 = r13.f2980
            goto L_0x01d2
        L_0x001c:
            java.lang.String r1 = "["
            int r1 = r0.indexOf(r1)
            java.lang.String r3 = ""
            r4 = -1
            if (r1 <= r4) goto L_0x0040
            java.lang.String r5 = "]"
            int r5 = r0.indexOf(r5, r1)
            int r6 = r1 + 1
            java.lang.String r5 = r0.substring(r6, r5)
            java.lang.String r5 = r5.trim()
            java.lang.String r0 = r0.substring(r2, r1)
            java.lang.String r0 = r0.trim()
            goto L_0x0041
        L_0x0040:
            r5 = r3
        L_0x0041:
            java.lang.String r1 = ":"
            int r1 = r0.indexOf(r1)
            r6 = 1
            r7 = 0
            if (r1 == r4) goto L_0x008d
            java.lang.String r8 = r0.substring(r2, r1)
            java.lang.String r8 = r8.trim()
            java.lang.String r8 = r13.m2859(r8)
            int r9 = r8.length()
            if (r9 != 0) goto L_0x005e
            return r7
        L_0x005e:
            java.lang.String r9 = "/"
            boolean r10 = r8.endsWith(r9)
            if (r10 != 0) goto L_0x0075
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r8)
            r10.append(r9)
            java.lang.String r8 = r10.toString()
        L_0x0075:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            int r1 = r1 + r6
            java.lang.String r0 = r0.substring(r1)
            java.lang.String r0 = r0.trim()
            r9.append(r0)
            java.lang.String r0 = r9.toString()
        L_0x008d:
            if (r15 == 0) goto L_0x009c
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x009c
            boolean r1 = r13.m2858(r0)
            if (r1 != 0) goto L_0x009c
            return r7
        L_0x009c:
            int r1 = r5.length()
            if (r1 <= 0) goto L_0x01bf
            nts.ᵪ r1 = r13.f2983
            if (r1 != 0) goto L_0x00a8
            if (r15 == 0) goto L_0x01bf
        L_0x00a8:
            boolean r1 = m2851(r5)
            if (r1 == 0) goto L_0x0106
            int r1 = m2850(r5)
            nts.ᵪ r3 = r13.f2983
            if (r3 != 0) goto L_0x00bb
            if (r15 == 0) goto L_0x00bb
            if (r1 == r6) goto L_0x01d1
            return r7
        L_0x00bb:
            if (r1 < r6) goto L_0x0105
            int r3 = r13.f2987
            if (r1 <= r3) goto L_0x00c2
            goto L_0x0105
        L_0x00c2:
            if (r15 != 0) goto L_0x0103
            int r3 = r0.length()
            if (r3 != 0) goto L_0x00ee
            java.util.Vector r0 = r13.f2986
            if (r0 != 0) goto L_0x00e3
            java.util.Vector r0 = new java.util.Vector
            int r3 = r13.f2987
            r0.<init>(r3)
            r13.f2986 = r0
            nts.ᵪ r0 = r13.f2983
        L_0x00d9:
            if (r0 == 0) goto L_0x00e3
            java.util.Vector r3 = r13.f2986
            r3.add(r0)
            nts.ᵪ r0 = r0.f2992
            goto L_0x00d9
        L_0x00e3:
            java.util.Vector r0 = r13.f2986
            int r1 = r1 - r6
            java.lang.Object r0 = r0.get(r1)
            nts.ᵪ r0 = (nts.C4060) r0
            goto L_0x01d2
        L_0x00ee:
            nts.ᵪ r3 = r13.f2983
        L_0x00f0:
            if (r3 == 0) goto L_0x0100
            boolean r4 = r3.m2858(r0)
            if (r4 == 0) goto L_0x00fa
            int r1 = r1 + -1
        L_0x00fa:
            if (r1 != 0) goto L_0x00fd
            goto L_0x0100
        L_0x00fd:
            nts.ᵪ r3 = r3.f2992
            goto L_0x00f0
        L_0x0100:
            r0 = r3
            goto L_0x01d2
        L_0x0103:
            if (r1 == r6) goto L_0x01d1
        L_0x0105:
            return r7
        L_0x0106:
            java.lang.String r1 = "@"
            boolean r1 = r5.startsWith(r1)
            if (r1 == 0) goto L_0x017e
            java.lang.String r1 = "="
            int r1 = r5.indexOf(r1, r6)
            if (r1 <= r6) goto L_0x0154
            java.lang.String r3 = r5.substring(r6, r1)
            java.lang.String r3 = r3.trim()
            int r1 = r1 + r6
            int r4 = r5.length()
            int r4 = r4 - r6
            char r8 = r5.charAt(r4)
            r9 = 39
            r10 = 34
            if (r8 == r10) goto L_0x0130
            if (r8 != r9) goto L_0x0139
        L_0x0130:
            char r11 = r5.charAt(r1)
            if (r11 != r8) goto L_0x0139
            int r1 = r1 + 1
            goto L_0x0130
        L_0x0139:
            char r8 = r5.charAt(r4)
            if (r8 == r10) goto L_0x0141
            if (r8 != r9) goto L_0x014a
        L_0x0141:
            char r9 = r5.charAt(r4)
            if (r9 != r8) goto L_0x014a
            int r4 = r4 + -1
            goto L_0x0141
        L_0x014a:
            int r4 = r4 + r6
            java.lang.String r1 = r5.substring(r1, r4)
            java.lang.String r1 = r1.trim()
            goto L_0x015f
        L_0x0154:
            java.lang.String r1 = r5.substring(r6)
            java.lang.String r1 = r1.trim()
            r12 = r3
            r3 = r1
            r1 = r12
        L_0x015f:
            if (r15 != 0) goto L_0x0177
            nts.ᵪ r4 = r13.f2983
        L_0x0163:
            if (r4 == 0) goto L_0x0175
            boolean r5 = r4.m2858(r0)
            if (r5 == 0) goto L_0x0172
            boolean r5 = r4.m2856((java.lang.String) r3, (java.lang.String) r1)
            if (r5 == 0) goto L_0x0172
            goto L_0x0175
        L_0x0172:
            nts.ᵪ r4 = r4.f2992
            goto L_0x0163
        L_0x0175:
            r0 = r4
            goto L_0x01d2
        L_0x0177:
            boolean r0 = r13.m2856((java.lang.String) r3, (java.lang.String) r1)
            if (r0 != 0) goto L_0x01d1
            return r7
        L_0x017e:
            r1 = 6
            r3 = 38
            java.lang.String r8 = "L@QW\f\f"
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r8, (int) r2, (int) r1, (int) r3)
            boolean r1 = r5.startsWith(r1)
            if (r1 == 0) goto L_0x01be
            java.lang.String r1 = "-"
            int r1 = r5.indexOf(r1)
            if (r1 <= r4) goto L_0x01aa
            int r1 = r1 + r6
            java.lang.String r1 = r5.substring(r1)
            java.lang.String r1 = r1.trim()
            boolean r3 = m2851(r1)
            if (r3 == 0) goto L_0x01a9
            int r1 = m2850(r1)
            goto L_0x01ab
        L_0x01a9:
            return r7
        L_0x01aa:
            r1 = r2
        L_0x01ab:
            nts.ᵪ r3 = r13.f2985
        L_0x01ad:
            if (r3 == 0) goto L_0x0100
            boolean r4 = r3.m2858(r0)
            if (r4 == 0) goto L_0x01bb
            if (r1 != 0) goto L_0x01b9
            goto L_0x0100
        L_0x01b9:
            int r1 = r1 + -1
        L_0x01bb:
            nts.ᵪ r3 = r3.f2991
            goto L_0x01ad
        L_0x01be:
            return r7
        L_0x01bf:
            if (r15 != 0) goto L_0x01d1
            nts.ᵪ r1 = r13.f2983
        L_0x01c3:
            if (r1 == 0) goto L_0x01cf
            boolean r3 = r1.m2858(r0)
            if (r3 == 0) goto L_0x01cc
            goto L_0x01cf
        L_0x01cc:
            nts.ᵪ r1 = r1.f2992
            goto L_0x01c3
        L_0x01cf:
            r0 = r1
            goto L_0x01d2
        L_0x01d1:
            r0 = r7
        L_0x01d2:
            if (r15 == 0) goto L_0x01d5
            r0 = r13
        L_0x01d5:
            boolean r15 = r14.hasMoreTokens()
            if (r15 == 0) goto L_0x01e2
            if (r0 == 0) goto L_0x01e2
            nts.ᵪ r14 = r0.m2854((java.util.StringTokenizer) r14, (boolean) r2)
            return r14
        L_0x01e2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C4060.m2854(java.util.StringTokenizer, boolean):nts.ᵪ");
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public boolean m2858(String str) {
        if (str.length() == 0 || str.equals(Marker.ANY_MARKER)) {
            return true;
        }
        C3953 r02 = this.f2989;
        if (r02.f2326.equalsIgnoreCase(str) || r02.f2328.equalsIgnoreCase(str)) {
            return true;
        }
        String str2 = r02.f2328;
        if (r02.f2329.length() > 0 && !r02.f2329.endsWith("/")) {
            str2 = "/" + str2;
        }
        if (str.equalsIgnoreCase(r02.f2329 + str2)) {
            return true;
        }
        return false;
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public String m2859(String str) {
        for (int i10 = 0; i10 < this.f2981.size(); i10++) {
            C3609 r12 = (C3609) this.f2981.get(i10);
            if (r12.f491.equals(str) || r12.f490.equals(str)) {
                return r12.f490;
            }
        }
        C4060 r02 = this.f2980;
        return r02 != null ? r02.m2859(str) : "";
    }

    public C4060(C4060 r12, C3953 r22, Vector vector, Vector vector2, int i10, int i11) {
        this.f2980 = r12;
        this.f2989 = r22;
        this.f2990 = vector;
        this.f2981 = vector2;
        this.f2984 = i11;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public static boolean m2851(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (!Character.isDigit(str.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public String m2857() {
        StringBuilder sb2 = this.f2988;
        return sb2 == null ? "" : sb2.toString();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public boolean m2856(String str, String str2) {
        String str3;
        int indexOf = str.indexOf(":");
        if (indexOf >= 0) {
            str3 = str.substring(0, indexOf);
            str = str.substring(indexOf + 1);
        } else {
            str3 = "";
        }
        for (int i10 = 0; i10 < this.f2990.size(); i10++) {
            C4221 r42 = (C4221) this.f2990.elementAt(i10);
            if ((str3.length() <= 0 || r42.f4171.equals(str3)) && r42.f4168.equals(str) && r42.f4169.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public C4060 m2853(int i10) {
        C4060 r02 = this.f2983;
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0 || r02 == null) {
                return r02;
            }
            r02 = r02.f2992;
            i10 = i11;
        }
        return r02;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2855(String str) {
        if (this.f2988 == null) {
            this.f2988 = new StringBuilder();
        }
        this.f2988.append(str);
    }
}
