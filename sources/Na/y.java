package na;

import K9.C6620s;

public final class y {
    public static int a(int i10) {
        boolean z10 = true;
        if (!(i10 == 0 || i10 == 1)) {
            if (i10 == 2) {
                i10 = 2;
            } else {
                z10 = false;
            }
        }
        C6620s.c(z10, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i10));
        return i10;
    }

    public static String b(int i10) {
        if (i10 == 0) {
            return "GRANULARITY_PERMISSION_LEVEL";
        }
        if (i10 == 1) {
            return "GRANULARITY_COARSE";
        }
        if (i10 == 2) {
            return "GRANULARITY_FINE";
        }
        throw new IllegalArgumentException();
    }
}
