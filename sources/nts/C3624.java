package nts;

import java.util.Vector;

/* renamed from: nts.ԏ  reason: contains not printable characters */
public class C3624 {

    /* renamed from: ગ  reason: contains not printable characters */
    public String f603;

    /* renamed from: ഇ  reason: contains not printable characters */
    public String f604;

    public C3624(String str, String str2) {
        this.f604 = str;
        this.f603 = str2;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static String m588(char[] cArr, int i10, int i11, boolean z10, boolean z11) {
        if (z10) {
            while (i10 < cArr.length && Character.isWhitespace(cArr[i10])) {
                i10++;
            }
            while (i11 > i10 && Character.isWhitespace(cArr[i11 - 1])) {
                i11--;
            }
        }
        if (z11) {
            if (i10 < i11 && cArr[i10] == '\"') {
                i10++;
            }
            if (i10 < i11 && cArr[i11 - 1] == '\"') {
                i11--;
            }
        }
        return new String(cArr, i10, i11 - i10);
    }

    public String toString() {
        return this.f604 + "=\"" + this.f603 + "\"";
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static String m587(Vector vector, String str) {
        for (int i10 = 0; i10 < vector.size(); i10++) {
            C3624 r12 = (C3624) vector.elementAt(i10);
            if (str.equalsIgnoreCase(r12.f604)) {
                return r12.f603;
            }
        }
        return "";
    }
}
