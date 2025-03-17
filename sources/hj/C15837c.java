package HJ;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\n\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\f\u001a\u00020\b*\u00020\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "", "e", "(C)I", "", "h", "(C)Ljava/lang/String;", "other", "", "ignoreCase", "f", "(CCZ)Z", "g", "(C)Z", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/CharsKt")
/* renamed from: HJ.c  reason: case insensitive filesystem */
class C15837c extends C15836b {
    public static int e(char c10) {
        int b10 = C15836b.b(c10, 10);
        if (b10 >= 0) {
            return b10;
        }
        throw new IllegalArgumentException("Char " + c10 + " is not a decimal digit");
    }

    public static final boolean f(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static boolean g(char c10) {
        return 55296 <= c10 && c10 < 57344;
    }

    public static String h(char c10) {
        return C15834O.a(c10);
    }
}
