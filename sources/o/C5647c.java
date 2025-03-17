package o;

import java.util.concurrent.Executor;

/* renamed from: o.c  reason: case insensitive filesystem */
public class C5647c extends C5649e {

    /* renamed from: c  reason: collision with root package name */
    private static volatile C5647c f26586c;

    /* renamed from: d  reason: collision with root package name */
    private static final Executor f26587d = new C5645a();

    /* renamed from: e  reason: collision with root package name */
    private static final Executor f26588e = new C5646b();

    /* renamed from: a  reason: collision with root package name */
    private C5649e f26589a;

    /* renamed from: b  reason: collision with root package name */
    private final C5649e f26590b;

    private C5647c() {
        C5648d dVar = new C5648d();
        this.f26590b = dVar;
        this.f26589a = dVar;
    }

    public static Executor g() {
        return f26588e;
    }

    public static C5647c h() {
        if (f26586c != null) {
            return f26586c;
        }
        synchronized (C5647c.class) {
            try {
                if (f26586c == null) {
                    f26586c = new C5647c();
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return f26586c;
    }

    public void a(Runnable runnable) {
        this.f26589a.a(runnable);
    }

    public boolean c() {
        return this.f26589a.c();
    }

    public void d(Runnable runnable) {
        this.f26589a.d(runnable);
    }
}
