package ia;

import android.os.SystemClock;

public final class I5 {
    public static void a(C8386x5 x5Var, int i10, int i11, long j10, int i12, int i13, int i14, int i15) {
        x5Var.c(b(i10, i11, j10, i12, i13, i14, i15), F3.INPUT_IMAGE_CONSTRUCTION);
    }

    private static H5 b(int i10, int i11, long j10, int i12, int i13, int i14, int i15) {
        return new H5(i10, i11, i14, i12, i13, SystemClock.elapsedRealtime() - j10, i15);
    }
}
