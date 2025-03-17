package D2;

import android.os.Build;
import android.os.Bundle;

public final class c {

    static class a {
        static <T> T a(Bundle bundle, String str, Class<T> cls) {
            return bundle.getParcelable(str, cls);
        }
    }

    public static <T> T a(Bundle bundle, String str, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(bundle, str, cls);
        }
        T parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }
}
