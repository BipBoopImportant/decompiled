package ip;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "a", "(Ljava/lang/String;)Ljava/lang/String;", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o {
    public static final String a(String str) {
        C17542s.j(str, "<this>");
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String valueOf = String.valueOf(str.charAt(0));
        C17542s.h(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        C17542s.i(upperCase, "toUpperCase(...)");
        sb2.append(upperCase);
        String substring = str.substring(1);
        C17542s.i(substring, "substring(...)");
        sb2.append(substring);
        return sb2.toString();
    }
}
