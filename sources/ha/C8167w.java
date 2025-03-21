package ha;

/* renamed from: ha.w  reason: case insensitive filesystem */
public final class C8167w {
    public static int a(int i10, int i11, String str) {
        String str2;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            str2 = C8177x.a("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else if (i11 < 0) {
            throw new IllegalArgumentException("negative size: " + i11);
        } else {
            str2 = C8177x.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(str2);
    }

    public static int b(int i10, int i11, String str) {
        if (i10 >= 0 && i10 <= i11) {
            return i10;
        }
        throw new IndexOutOfBoundsException(f(i10, i11, "index"));
    }

    public static void c(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void d(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? f(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? f(i11, i12, "end index") : C8177x.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    public static void e(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String f(int i10, int i11, String str) {
        if (i10 < 0) {
            return C8177x.a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return C8177x.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }
}
