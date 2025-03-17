package D2;

import android.content.res.Configuration;
import android.os.LocaleList;

public final class f {

    static class a {
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    public static j a(Configuration configuration) {
        return j.h(a.a(configuration));
    }
}
