package t3;

public final class C {
    public static int a(int i10, int i11) {
        for (int i12 = 1; i12 <= 2; i12++) {
            int i13 = (i10 + i12) % 3;
            if (b(i13, i11)) {
                return i13;
            }
        }
        return i10;
    }

    public static boolean b(int i10, int i11) {
        if (i10 == 0) {
            return true;
        }
        if (i10 == 1) {
            return (i11 & 1) != 0;
        }
        if (i10 != 2) {
            return false;
        }
        return (i11 & 2) != 0;
    }
}
