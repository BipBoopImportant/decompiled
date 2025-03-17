package W9;

import android.content.SharedPreferences;
import android.util.Log;
import da.C7783d;

public final class h extends a<String> {
    public static String a(SharedPreferences sharedPreferences, String str, String str2) {
        try {
            return (String) C7783d.a(new i(sharedPreferences, str, str2));
        } catch (Exception e10) {
            String valueOf = String.valueOf(e10.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return str2;
        }
    }
}
