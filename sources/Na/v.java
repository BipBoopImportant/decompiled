package na;

import K9.C6620s;

public final class v {
    public static int a(int i10) {
        boolean z10 = true;
        if (!(i10 == 0 || i10 == 1)) {
            if (i10 == 2) {
                i10 = 2;
            } else {
                z10 = false;
            }
        }
        C6620s.c(z10, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i10));
        return i10;
    }

    public static String b(int i10) {
        if (i10 == 0) {
            return "THROTTLE_BACKGROUND";
        }
        if (i10 == 1) {
            return "THROTTLE_ALWAYS";
        }
        if (i10 == 2) {
            return "THROTTLE_NEVER";
        }
        throw new IllegalArgumentException();
    }
}
