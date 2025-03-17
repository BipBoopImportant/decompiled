package s4;

import java.util.regex.Pattern;
import t3.B;
import t3.N;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f55855a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(B b10) {
        String s10 = b10.s();
        return s10 != null && s10.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        String[] i12 = N.i1(str, "\\.");
        long j10 = 0;
        for (String parseLong : N.h1(i12[0], ":")) {
            j10 = (j10 * 60) + Long.parseLong(parseLong);
        }
        long j11 = j10 * 1000;
        if (i12.length == 2) {
            j11 += Long.parseLong(i12[1]);
        }
        return j11 * 1000;
    }

    public static void d(B b10) {
        int f10 = b10.f();
        if (!a(b10)) {
            b10.W(f10);
            throw q3.B.a("Expected WEBVTT. Got " + b10.s(), (Throwable) null);
        }
    }
}
