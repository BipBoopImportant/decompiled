package x;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final a f31530a;

    interface a {
        void a(long j10);

        void b(Surface surface);

        void c(long j10);

        void d(String str);

        String e();

        void f();

        void g(int i10);

        Surface getSurface();

        Object h();
    }

    public k(int i10, Surface surface) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            this.f31530a = new o(i10, surface);
        } else if (i11 >= 28) {
            this.f31530a = new n(i10, surface);
        } else {
            this.f31530a = new m(i10, surface);
        }
    }

    public static k j(Object obj) {
        if (obj == null) {
            return null;
        }
        int i10 = Build.VERSION.SDK_INT;
        a l10 = i10 >= 33 ? o.l((OutputConfiguration) obj) : i10 >= 28 ? n.k((OutputConfiguration) obj) : m.j((OutputConfiguration) obj);
        if (l10 == null) {
            return null;
        }
        return new k(l10);
    }

    public void a(Surface surface) {
        this.f31530a.b(surface);
    }

    public void b() {
        this.f31530a.f();
    }

    public String c() {
        return this.f31530a.e();
    }

    public Surface d() {
        return this.f31530a.getSurface();
    }

    public void e(long j10) {
        this.f31530a.c(j10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        return this.f31530a.equals(((k) obj).f31530a);
    }

    public void f(int i10) {
        this.f31530a.g(i10);
    }

    public void g(String str) {
        this.f31530a.d(str);
    }

    public void h(long j10) {
        this.f31530a.a(j10);
    }

    public int hashCode() {
        return this.f31530a.hashCode();
    }

    public Object i() {
        return this.f31530a.h();
    }

    public k(OutputConfiguration outputConfiguration) {
        this.f31530a = o.l(outputConfiguration);
    }

    private k(a aVar) {
        this.f31530a = aVar;
    }
}
