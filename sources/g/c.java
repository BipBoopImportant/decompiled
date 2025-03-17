package G;

import C.C4391e0;

public final class c {
    public static int a(int i10, int i11, boolean z10) {
        int i12 = z10 ? ((i11 - i10) + 360) % 360 : (i11 + i10) % 360;
        if (C4391e0.h("CameraOrientationUtil")) {
            C4391e0.a("CameraOrientationUtil", String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10), Integer.valueOf(i12)}));
        }
        return i12;
    }

    public static int b(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 90;
        }
        if (i10 == 2) {
            return 180;
        }
        if (i10 == 3) {
            return 270;
        }
        throw new IllegalArgumentException("Unsupported surface rotation: " + i10);
    }
}
