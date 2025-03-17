package K6;

import android.util.Log;

/* renamed from: K6.p  reason: case insensitive filesystem */
public final class C6595p {

    /* renamed from: b  reason: collision with root package name */
    public static final C6595p f37700b = new C6595p();

    /* renamed from: a  reason: collision with root package name */
    public int f37701a = 5;

    private static void a(int i10, String str, String str2) {
        String concat = "BMP:".concat(String.valueOf(str));
        if (str2.length() > 4000) {
            int length = str2.length() / 4000;
            int i11 = 0;
            while (i11 <= length) {
                int i12 = i11 + 1;
                int i13 = i12 * 4000;
                if (i13 >= str2.length()) {
                    Log.println(i10, concat, "Part " + i11 + ": " + str2.substring(i11 * 4000));
                } else {
                    Log.println(i10, concat, "Part " + i11 + ": " + str2.substring(i11 * 4000, i13));
                }
                i11 = i12;
            }
            return;
        }
        Log.println(i10, concat, str2);
    }

    private void b(int i10, String str, String str2, Throwable... thArr) {
        if (i10 >= this.f37701a) {
            if (thArr.length > 0) {
                a(i10, str, str2 + 10 + Log.getStackTraceString(thArr[0]));
                return;
            }
            a(i10, str, str2);
        }
    }

    public static void c(String str, String str2, Throwable... thArr) {
        f37700b.b(4, str, str2, thArr);
    }

    public static void d(String str, String str2, Throwable... thArr) {
        f37700b.b(5, str, str2, thArr);
    }

    public static void e(String str, String str2, Throwable... thArr) {
        f37700b.b(6, str, str2, thArr);
    }
}
