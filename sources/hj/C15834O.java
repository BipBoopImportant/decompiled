package HJ;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\f\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "", "a", "(C)Ljava/lang/String;", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: HJ.O  reason: case insensitive filesystem */
public final class C15834O {
    public static final String a(char c10) {
        String valueOf = String.valueOf(c10);
        C17542s.h(valueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        C17542s.i(upperCase, "toUpperCase(...)");
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c10));
        }
        if (c10 == 329) {
            return upperCase;
        }
        char charAt = upperCase.charAt(0);
        C17542s.h(upperCase, "null cannot be cast to non-null type java.lang.String");
        String substring = upperCase.substring(1);
        C17542s.i(substring, "substring(...)");
        C17542s.h(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase(locale);
        C17542s.i(lowerCase, "toLowerCase(...)");
        return charAt + lowerCase;
    }
}
