package K6;

import android.util.Log;

final class y {
    static void a(Exception exc) {
        try {
            if (x.f37734b.length() < 10000) {
                x.f37734b += ";" + P.c(b(exc));
            }
        } catch (Exception unused) {
        }
    }

    private static String b(Exception exc) {
        String stackTraceString = Log.getStackTraceString(exc);
        return (stackTraceString == null || stackTraceString.length() <= 500) ? stackTraceString : stackTraceString.substring(0, 500);
    }
}
