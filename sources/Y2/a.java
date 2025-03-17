package Y2;

import android.os.SystemClock;
import android.view.Choreographer;
import j0.b0;
import java.util.ArrayList;

class a {

    /* renamed from: g  reason: collision with root package name */
    public static final ThreadLocal<a> f14831g = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    private final b0<b, Long> f14832a = new b0<>();

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<b> f14833b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final C0215a f14834c = new C0215a();

    /* renamed from: d  reason: collision with root package name */
    private c f14835d;

    /* renamed from: e  reason: collision with root package name */
    long f14836e = 0;

    /* renamed from: f  reason: collision with root package name */
    private boolean f14837f = false;

    /* renamed from: Y2.a$a  reason: collision with other inner class name */
    class C0215a {
        C0215a() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            a.this.f14836e = SystemClock.uptimeMillis();
            a aVar = a.this;
            aVar.c(aVar.f14836e);
            if (a.this.f14833b.size() > 0) {
                a.this.e().a();
            }
        }
    }

    interface b {
        boolean a(long j10);
    }

    static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final C0215a f14839a;

        c(C0215a aVar) {
            this.f14839a = aVar;
        }

        /* access modifiers changed from: package-private */
        public abstract void a();
    }

    private static class d extends c {

        /* renamed from: b  reason: collision with root package name */
        private final Choreographer f14840b = Choreographer.getInstance();

        /* renamed from: c  reason: collision with root package name */
        private final Choreographer.FrameCallback f14841c = new C0216a();

        /* renamed from: Y2.a$d$a  reason: collision with other inner class name */
        class C0216a implements Choreographer.FrameCallback {
            C0216a() {
            }

            public void doFrame(long j10) {
                d.this.f14839a.a();
            }
        }

        d(C0215a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f14840b.postFrameCallback(this.f14841c);
        }
    }

    a() {
    }

    private void b() {
        if (this.f14837f) {
            for (int size = this.f14833b.size() - 1; size >= 0; size--) {
                if (this.f14833b.get(size) == null) {
                    this.f14833b.remove(size);
                }
            }
            this.f14837f = false;
        }
    }

    public static a d() {
        ThreadLocal<a> threadLocal = f14831g;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        return threadLocal.get();
    }

    private boolean f(b bVar, long j10) {
        Long l10 = this.f14832a.get(bVar);
        if (l10 == null) {
            return true;
        }
        if (l10.longValue() >= j10) {
            return false;
        }
        this.f14832a.remove(bVar);
        return true;
    }

    public void a(b bVar, long j10) {
        if (this.f14833b.size() == 0) {
            e().a();
        }
        if (!this.f14833b.contains(bVar)) {
            this.f14833b.add(bVar);
        }
        if (j10 > 0) {
            this.f14832a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j10));
        }
    }

    /* access modifiers changed from: package-private */
    public void c(long j10) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i10 = 0; i10 < this.f14833b.size(); i10++) {
            b bVar = this.f14833b.get(i10);
            if (bVar != null && f(bVar, uptimeMillis)) {
                bVar.a(j10);
            }
        }
        b();
    }

    /* access modifiers changed from: package-private */
    public c e() {
        if (this.f14835d == null) {
            this.f14835d = new d(this.f14834c);
        }
        return this.f14835d;
    }

    public void g(b bVar) {
        this.f14832a.remove(bVar);
        int indexOf = this.f14833b.indexOf(bVar);
        if (indexOf >= 0) {
            this.f14833b.set(indexOf, (Object) null);
            this.f14837f = true;
        }
    }
}
