package G4;

import android.content.Context;
import android.content.SharedPreferences;

public class b {
    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences(c(context), b());
    }

    private static int b() {
        return 0;
    }

    private static String c(Context context) {
        return context.getPackageName() + "_preferences";
    }
}
