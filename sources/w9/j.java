package W9;

import android.content.Context;
import android.content.SharedPreferences;
import da.C7783d;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static SharedPreferences f40556a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f40556a == null) {
                    f40556a = (SharedPreferences) C7783d.a(new k(context));
                }
                sharedPreferences = f40556a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }
}
