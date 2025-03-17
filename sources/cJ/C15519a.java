package CJ;

import HJ.C15854t;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.C17542s;

/* renamed from: CJ.a  reason: case insensitive filesystem */
public final class C15519a {
    public static final String a(String str) {
        char charAt;
        C17542s.j(str, "<this>");
        if (str.length() == 0 || 'a' > (charAt = str.charAt(0)) || charAt >= '{') {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        sb2.append(Character.toUpperCase(charAt));
        sb2.append(str, 1, str.length());
        return sb2.toString();
    }

    public static final String b(String str) {
        char charAt;
        C17542s.j(str, "<this>");
        if (str.length() == 0 || 'A' > (charAt = str.charAt(0)) || charAt >= '[') {
            return str;
        }
        char lowerCase = Character.toLowerCase(charAt);
        String substring = str.substring(1);
        C17542s.i(substring, "substring(...)");
        return lowerCase + substring;
    }

    public static final String c(String str, boolean z10) {
        Object obj;
        C17542s.j(str, "<this>");
        if (str.length() == 0 || !d(str, 0, z10)) {
            return str;
        }
        if (str.length() != 1 && d(str, 1, z10)) {
            Iterator it = C15854t.l0(str).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (!d(str, ((Number) obj).intValue(), z10)) {
                    break;
                }
            }
            Integer num = (Integer) obj;
            if (num == null) {
                return e(str, z10);
            }
            int intValue = num.intValue() - 1;
            StringBuilder sb2 = new StringBuilder();
            String substring = str.substring(0, intValue);
            C17542s.i(substring, "substring(...)");
            sb2.append(e(substring, z10));
            String substring2 = str.substring(intValue);
            C17542s.i(substring2, "substring(...)");
            sb2.append(substring2);
            return sb2.toString();
        } else if (z10) {
            return b(str);
        } else {
            if (str.length() <= 0) {
                return str;
            }
            char lowerCase = Character.toLowerCase(str.charAt(0));
            String substring3 = str.substring(1);
            C17542s.i(substring3, "substring(...)");
            return lowerCase + substring3;
        }
    }

    private static final boolean d(String str, int i10, boolean z10) {
        char charAt = str.charAt(i10);
        return z10 ? 'A' <= charAt && charAt < '[' : Character.isUpperCase(charAt);
    }

    private static final String e(String str, boolean z10) {
        if (z10) {
            return f(str);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C17542s.i(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static final String f(String str) {
        C17542s.j(str, "<this>");
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if ('A' <= charAt && charAt < '[') {
                charAt = Character.toLowerCase(charAt);
            }
            sb2.append(charAt);
        }
        String sb3 = sb2.toString();
        C17542s.i(sb3, "toString(...)");
        return sb3;
    }
}
