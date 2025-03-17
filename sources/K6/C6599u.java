package K6;

import android.os.SystemClock;

/* renamed from: K6.u  reason: case insensitive filesystem */
public final class C6599u {

    /* renamed from: a  reason: collision with root package name */
    public static long f37709a = System.currentTimeMillis();

    /* renamed from: b  reason: collision with root package name */
    public static String f37710b = "sensor_data";

    /* renamed from: c  reason: collision with root package name */
    public static long f37711c = 0;

    /* renamed from: d  reason: collision with root package name */
    static int f37712d = 0;

    /* renamed from: e  reason: collision with root package name */
    static int f37713e = 0;

    /* renamed from: f  reason: collision with root package name */
    static long f37714f = 0;

    /* renamed from: g  reason: collision with root package name */
    static int f37715g = -1;

    static void a() {
        C6595p.c("Constants", "Resetting values", new Throwable[0]);
        f37711c = SystemClock.uptimeMillis();
        f37709a = System.currentTimeMillis();
    }
}
