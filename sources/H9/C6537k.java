package H9;

import H9.C6536j;
import K9.C6620s;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: H9.k  reason: case insensitive filesystem */
public class C6537k {
    public static <L> C6536j<L> a(L l10, Looper looper, String str) {
        C6620s.m(l10, "Listener must not be null");
        C6620s.m(looper, "Looper must not be null");
        C6620s.m(str, "Listener type must not be null");
        return new C6536j<>(looper, l10, str);
    }

    public static <L> C6536j<L> b(L l10, Executor executor, String str) {
        C6620s.m(l10, "Listener must not be null");
        C6620s.m(executor, "Executor must not be null");
        C6620s.m(str, "Listener type must not be null");
        return new C6536j<>(executor, l10, str);
    }

    public static <L> C6536j.a<L> c(L l10, String str) {
        C6620s.m(l10, "Listener must not be null");
        C6620s.m(str, "Listener type must not be null");
        C6620s.g(str, "Listener type must not be empty");
        return new C6536j.a<>(l10, str);
    }
}
