package HJ;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tI.C17974j;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "", "c", "(C)Z", "Ljava/util/Locale;", "locale", "", "d", "(CLjava/util/Locale;)Ljava/lang/String;", "char", "", "radix", "b", "(CI)I", "a", "(I)I", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/CharsKt")
/* renamed from: HJ.b  reason: case insensitive filesystem */
class C15836b {
    public static int a(int i10) {
        if (2 <= i10 && i10 < 37) {
            return i10;
        }
        throw new IllegalArgumentException("radix " + i10 + " was not in valid range " + new C17974j(2, 36));
    }

    public static final int b(char c10, int i10) {
        return Character.digit(c10, i10);
    }

    public static boolean c(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    public static String d(char c10, Locale locale) {
        C17542s.j(locale, "locale");
        String valueOf = String.valueOf(c10);
        C17542s.h(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(locale);
        C17542s.i(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
