package com.google.android.gms.internal.measurement;

public class Z4 {

    /* renamed from: a  reason: collision with root package name */
    private volatile C7406s5 f48842a;

    /* renamed from: b  reason: collision with root package name */
    private volatile C7276d4 f48843b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f48844c;

    private final C7406s5 d(C7406s5 s5Var) {
        if (this.f48842a == null) {
            synchronized (this) {
                if (this.f48842a == null) {
                    try {
                        this.f48842a = s5Var;
                        this.f48843b = C7276d4.f48892b;
                    } catch (U4 unused) {
                        this.f48844c = true;
                        this.f48842a = s5Var;
                        this.f48843b = C7276d4.f48892b;
                    }
                }
            }
        }
        return this.f48842a;
    }

    public final int a() {
        if (this.f48843b != null) {
            return this.f48843b.x();
        }
        if (this.f48842a != null) {
            return this.f48842a.a();
        }
        return 0;
    }

    public final C7406s5 b(C7406s5 s5Var) {
        C7406s5 s5Var2 = this.f48842a;
        this.f48843b = null;
        this.f48842a = s5Var;
        return s5Var2;
    }

    public final C7276d4 c() {
        if (this.f48843b != null) {
            return this.f48843b;
        }
        synchronized (this) {
            try {
                if (this.f48843b != null) {
                    C7276d4 d4Var = this.f48843b;
                    return d4Var;
                }
                if (this.f48842a == null) {
                    this.f48843b = C7276d4.f48892b;
                } else {
                    this.f48843b = this.f48842a.f();
                }
                C7276d4 d4Var2 = this.f48843b;
                return d4Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z4)) {
            return false;
        }
        Z4 z42 = (Z4) obj;
        C7406s5 s5Var = this.f48842a;
        C7406s5 s5Var2 = z42.f48842a;
        return (s5Var == null && s5Var2 == null) ? c().equals(z42.c()) : (s5Var == null || s5Var2 == null) ? s5Var != null ? s5Var.equals(z42.d(s5Var.d())) : d(s5Var2.d()).equals(s5Var2) : s5Var.equals(s5Var2);
    }

    public int hashCode() {
        return 1;
    }
}
