package W9;

import android.content.SharedPreferences;
import android.util.Log;
import da.C7783d;

public final class f extends a<Long> {
    public static Long a(SharedPreferences sharedPreferences, String str, Long l10) {
        try {
            return (Long) C7783d.a(new g(sharedPreferences, str, l10));
        } catch (Exception e10) {
            String valueOf = String.valueOf(e10.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return l10;
        }
    }
}
