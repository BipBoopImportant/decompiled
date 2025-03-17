package qc;

import com.google.firebase.installations.i;
import java.util.concurrent.TimeUnit;

/* renamed from: qc.e  reason: case insensitive filesystem */
class C10186e {

    /* renamed from: d  reason: collision with root package name */
    private static final long f76039d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e  reason: collision with root package name */
    private static final long f76040e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a  reason: collision with root package name */
    private final i f76041a = i.c();

    /* renamed from: b  reason: collision with root package name */
    private long f76042b;

    /* renamed from: c  reason: collision with root package name */
    private int f76043c;

    C10186e() {
    }

    private synchronized long a(int i10) {
        if (!c(i10)) {
            return f76039d;
        }
        return (long) Math.min(Math.pow(2.0d, (double) this.f76043c) + ((double) this.f76041a.e()), (double) f76040e);
    }

    private static boolean c(int i10) {
        return i10 == 429 || (i10 >= 500 && i10 < 600);
    }

    private static boolean d(int i10) {
        return (i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404;
    }

    private synchronized void e() {
        this.f76043c = 0;
    }

    public synchronized boolean b() {
        return this.f76043c == 0 || this.f76041a.a() > this.f76042b;
    }

    public synchronized void f(int i10) {
        if (d(i10)) {
            e();
            return;
        }
        this.f76043c++;
        this.f76042b = this.f76041a.a() + a(i10);
    }
}
