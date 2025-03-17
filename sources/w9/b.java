package W9;

import android.content.SharedPreferences;
import android.util.Log;
import da.C7783d;

public final class b extends a<Boolean> {
    public static Boolean a(SharedPreferences sharedPreferences, String str, Boolean bool) {
        try {
            return (Boolean) C7783d.a(new c(sharedPreferences, str, bool));
        } catch (Exception e10) {
            String valueOf = String.valueOf(e10.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return bool;
        }
    }
}
