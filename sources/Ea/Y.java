package ea;

public final class Y {
    public static int a(int i10, int i11, String str) {
        String str2;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            str2 = Z.a("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 15);
            sb2.append("negative size: ");
            sb2.append(i11);
            throw new IllegalArgumentException(sb2.toString());
        } else {
            str2 = Z.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(str2);
    }

    public static int b(int i10, int i11, String str) {
        if (i10 >= 0 && i10 <= i11) {
            return i10;
        }
        throw new IndexOutOfBoundsException(d(i10, i11, "index"));
    }

    public static void c(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? d(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? d(i11, i12, "end index") : Z.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    private static String d(int i10, int i11, String str) {
        if (i10 < 0) {
            return Z.a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return Z.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 15);
        sb2.append("negative size: ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }
}
