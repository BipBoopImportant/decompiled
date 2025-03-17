package Ac;

import java.util.Locale;

public class a {

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f58672c;

    /* renamed from: a  reason: collision with root package name */
    private final c f58673a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f58674b;

    public a(c cVar) {
        this.f58674b = false;
        this.f58673a = cVar == null ? c.c() : cVar;
    }

    public static a e() {
        if (f58672c == null) {
            synchronized (a.class) {
                try {
                    if (f58672c == null) {
                        f58672c = new a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f58672c;
    }

    public void a(String str) {
        if (this.f58674b) {
            this.f58673a.a(str);
        }
    }

    public void b(String str, Object... objArr) {
        if (this.f58674b) {
            this.f58673a.a(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void c(String str) {
        if (this.f58674b) {
            this.f58673a.b(str);
        }
    }

    public void d(String str, Object... objArr) {
        if (this.f58674b) {
            this.f58673a.b(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void f(String str) {
        if (this.f58674b) {
            this.f58673a.d(str);
        }
    }

    public void g(String str, Object... objArr) {
        if (this.f58674b) {
            this.f58673a.d(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public boolean h() {
        return this.f58674b;
    }

    public void i(boolean z10) {
        this.f58674b = z10;
    }

    public void j(String str) {
        if (this.f58674b) {
            this.f58673a.e(str);
        }
    }

    public void k(String str, Object... objArr) {
        if (this.f58674b) {
            this.f58673a.e(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    private a() {
        this((c) null);
    }
}
