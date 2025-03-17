package C3;

import android.util.Pair;
import java.util.Map;

public final class P {
    private static long a(Map<String, String> map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    public static Pair<Long, Long> b(C6422m mVar) {
        Map<String, String> h10 = mVar.h();
        if (h10 == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(a(h10, "LicenseDurationRemaining")), Long.valueOf(a(h10, "PlaybackDurationRemaining")));
    }
}
