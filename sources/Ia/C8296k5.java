package ia;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: ia.k5  reason: case insensitive filesystem */
public class C8296k5 implements Closeable {

    /* renamed from: h  reason: collision with root package name */
    private static final Map f53662h = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final String f53663a;

    /* renamed from: b  reason: collision with root package name */
    private int f53664b;

    /* renamed from: c  reason: collision with root package name */
    private double f53665c;

    /* renamed from: d  reason: collision with root package name */
    private long f53666d;

    /* renamed from: e  reason: collision with root package name */
    private long f53667e;

    /* renamed from: f  reason: collision with root package name */
    private long f53668f;

    /* renamed from: g  reason: collision with root package name */
    private long f53669g;

    private C8296k5(String str) {
        this.f53668f = 2147483647L;
        this.f53669g = -2147483648L;
        this.f53663a = str;
    }

    private final void c() {
        this.f53664b = 0;
        this.f53665c = 0.0d;
        this.f53666d = 0;
        this.f53668f = 2147483647L;
        this.f53669g = -2147483648L;
    }

    public static C8296k5 g(String str) {
        K5.a();
        if (!K5.b()) {
            return C8282i5.f53631i;
        }
        Map map = f53662h;
        if (map.get("detectorTaskWithResource#run") == null) {
            map.put("detectorTaskWithResource#run", new C8296k5("detectorTaskWithResource#run"));
        }
        return (C8296k5) map.get("detectorTaskWithResource#run");
    }

    public void close() {
        long j10 = this.f53666d;
        if (j10 != 0) {
            f(j10);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }

    public C8296k5 d() {
        this.f53666d = SystemClock.elapsedRealtimeNanos() / 1000;
        return this;
    }

    public void e(long j10) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j11 = this.f53667e;
        if (j11 != 0 && elapsedRealtimeNanos - j11 >= 1000000) {
            c();
        }
        this.f53667e = elapsedRealtimeNanos;
        this.f53664b++;
        this.f53665c += (double) j10;
        this.f53668f = Math.min(this.f53668f, j10);
        this.f53669g = Math.max(this.f53669g, j10);
        if (this.f53664b % 50 == 0) {
            String.format(Locale.US, "[%s] cur=%dus, counts=%d, min=%dus, max=%dus, avg=%dus", new Object[]{this.f53663a, Long.valueOf(j10), Integer.valueOf(this.f53664b), Long.valueOf(this.f53668f), Long.valueOf(this.f53669g), Integer.valueOf((int) (this.f53665c / ((double) this.f53664b)))});
            K5.a();
        }
        if (this.f53664b % 500 == 0) {
            c();
        }
    }

    public void f(long j10) {
        e((SystemClock.elapsedRealtimeNanos() / 1000) - j10);
    }
}
