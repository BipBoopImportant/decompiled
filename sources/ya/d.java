package ya;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;

public class d {
    public static int a(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable("Vision", 3)) {
            return Log.d("Vision", String.format(str, objArr));
        }
        return 0;
    }

    public static int b(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable("Vision", 6)) {
            return Log.e("Vision", String.format(str, objArr));
        }
        return 0;
    }

    @SuppressLint({"LogTagMismatch"})
    public static int c(@RecentlyNonNull Throwable th2, @RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (!Log.isLoggable("Vision", 6)) {
            return 0;
        }
        if (Log.isLoggable("Vision", 3)) {
            return Log.e("Vision", String.format(str, objArr), th2);
        }
        String format = String.format(str, objArr);
        String valueOf = String.valueOf(th2);
        StringBuilder sb2 = new StringBuilder(format.length() + 2 + valueOf.length());
        sb2.append(format);
        sb2.append(": ");
        sb2.append(valueOf);
        return Log.e("Vision", sb2.toString());
    }

    public static int d(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable("Vision", 4)) {
            return Log.i("Vision", String.format(str, objArr));
        }
        return 0;
    }

    public static int e(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable("Vision", 2)) {
            return Log.v("Vision", String.format(str, objArr));
        }
        return 0;
    }
}
