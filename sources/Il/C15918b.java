package IL;

import WK.C16770e;

/* renamed from: IL.b  reason: case insensitive filesystem */
public class C15918b {
    static String a(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int codePointAt = str.codePointAt(i10);
            if (codePointAt <= 31 || codePointAt >= 127) {
                C16770e eVar = new C16770e();
                eVar.M0(str, 0, i10);
                while (i10 < length) {
                    int codePointAt2 = str.codePointAt(i10);
                    eVar.N1((codePointAt2 <= 31 || codePointAt2 >= 127) ? 63 : codePointAt2);
                    i10 += Character.charCount(codePointAt2);
                }
                return eVar.l0();
            }
            i10 += Character.charCount(codePointAt);
        }
        return str;
    }
}
