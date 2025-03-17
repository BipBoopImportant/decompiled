package hb;

import android.content.Context;
import android.content.SharedPreferences;

public class e {
    public static SharedPreferences a(Context context) {
        return context.getApplicationContext().getSharedPreferences("com.google.androidbrowserhelper", 0);
    }
}
