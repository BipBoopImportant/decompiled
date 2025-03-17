package I6;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;
import w6.C8923e;
import w6.x;

public class c implements x {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f36948a = new HashSet();

    public void a(String str) {
        b(str, (Throwable) null);
    }

    public void b(String str, Throwable th2) {
        Set<String> set = f36948a;
        if (!set.contains(str)) {
            Log.w("LOTTIE", str, th2);
            set.add(str);
        }
    }

    public void c(String str, Throwable th2) {
        if (C8923e.f57233a) {
            Log.d("LOTTIE", str, th2);
        }
    }

    public void debug(String str) {
        c(str, (Throwable) null);
    }

    public void error(String str, Throwable th2) {
        if (C8923e.f57233a) {
            Log.d("LOTTIE", str, th2);
        }
    }
}
