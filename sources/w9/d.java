package W9;

import android.content.SharedPreferences;
import android.util.Log;
import da.C7783d;

public final class d extends a<Integer> {
    public static Integer a(SharedPreferences sharedPreferences, String str, Integer num) {
        try {
            return (Integer) C7783d.a(new e(sharedPreferences, str, num));
        } catch (Exception e10) {
            String valueOf = String.valueOf(e10.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return num;
        }
    }
}
