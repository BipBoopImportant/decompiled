package JH;

import HJ.C15854t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "c", "(Ljava/lang/String;)Ljava/lang/String;", "", "ch", "b", "(C)C", "LJH/i;", "a", "(Ljava/lang/String;)LJH/i;", "ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: JH.A  reason: case insensitive filesystem */
public final class C15953A {
    public static final i a(String str) {
        C17542s.j(str, "<this>");
        return new i(str);
    }

    private static final char b(char c10) {
        return ('A' > c10 || c10 >= '[') ? (c10 < 0 || c10 >= 128) ? Character.toLowerCase(c10) : c10 : (char) (c10 + ' ');
    }

    public static final String c(String str) {
        C17542s.j(str, "<this>");
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            char charAt = str.charAt(i10);
            if (b(charAt) != charAt) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        sb2.append(str, 0, i10);
        int m02 = C15854t.m0(str);
        if (i10 <= m02) {
            while (true) {
                sb2.append(b(str.charAt(i10)));
                if (i10 == m02) {
                    break;
                }
                i10++;
            }
        }
        String sb3 = sb2.toString();
        C17542s.i(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
