package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import java.util.Collections;
import java.util.Set;

class h {

    private static class a {
        static Set<int[]> a() {
            return b.a();
        }
    }

    private static class b {
        @SuppressLint({"BanUncheckedReflection"})
        static Set<int[]> a() {
            try {
                Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", (Class[]) null).invoke((Object) null, (Object[]) null);
                if (invoke == null) {
                    return Collections.emptySet();
                }
                Set<int[]> set = (Set) invoke;
                for (int[] iArr : set) {
                    if (!(iArr instanceof int[])) {
                        return Collections.emptySet();
                    }
                }
                return set;
            } catch (Throwable unused) {
                return Collections.emptySet();
            }
        }
    }

    static Set<int[]> a() {
        return Build.VERSION.SDK_INT >= 34 ? a.a() : b.a();
    }
}
