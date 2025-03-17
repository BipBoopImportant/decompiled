package iJ;

import DI.C15538I;
import java.util.Arrays;
import kotlin.jvm.internal.C17542s;
import uJ.C18113f0;

/* renamed from: iJ.e  reason: case insensitive filesystem */
public final class C17371e extends C17384r<Character> {
    public C17371e(char c10) {
        super(Character.valueOf(c10));
    }

    private final String c(char c10) {
        switch (c10) {
            case 8:
                return "\\b";
            case 9:
                return "\\t";
            case 10:
                return "\\n";
            case 12:
                return "\\f";
            case 13:
                return "\\r";
            default:
                return e(c10) ? String.valueOf(c10) : "?";
        }
    }

    private final boolean e(char c10) {
        byte type = (byte) Character.getType(c10);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    /* renamed from: d */
    public C18113f0 a(C15538I i10) {
        C17542s.j(i10, "module");
        C18113f0 v10 = i10.p().v();
        C17542s.i(v10, "getCharType(...)");
        return v10;
    }

    public String toString() {
        String format = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(((Character) b()).charValue()), c(((Character) b()).charValue())}, 2));
        C17542s.i(format, "format(...)");
        return format;
    }
}
