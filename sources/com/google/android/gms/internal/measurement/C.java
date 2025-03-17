package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public final class C {

    /* renamed from: a  reason: collision with root package name */
    private final D1 f48561a;

    /* renamed from: b  reason: collision with root package name */
    private C7275d3 f48562b;

    /* renamed from: c  reason: collision with root package name */
    private C7271d f48563c;

    /* renamed from: d  reason: collision with root package name */
    private final C7253b f48564d;

    public C() {
        this(new D1());
    }

    public static /* synthetic */ C7361n b(C c10) {
        return new E4(c10.f48563c);
    }

    public static /* synthetic */ C7361n f(C c10) {
        return new J7(c10.f48564d);
    }

    public final C7271d a() {
        return this.f48563c;
    }

    public final void c(T2 t22) {
        C7361n nVar;
        try {
            this.f48562b = this.f48561a.f48636b.d();
            if (!(this.f48561a.a(this.f48562b, (U2[]) t22.L().toArray(new U2[0])) instanceof C7343l)) {
                for (S2 next : t22.J().L()) {
                    List<U2> L10 = next.L();
                    String K10 = next.K();
                    Iterator<U2> it = L10.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            C7400s a10 = this.f48561a.a(this.f48562b, it.next());
                            if (a10 instanceof r) {
                                C7275d3 d3Var = this.f48562b;
                                if (!d3Var.g(K10)) {
                                    nVar = null;
                                } else {
                                    C7400s c10 = d3Var.c(K10);
                                    if (c10 instanceof C7361n) {
                                        nVar = (C7361n) c10;
                                    } else {
                                        throw new IllegalStateException("Invalid function name: " + K10);
                                    }
                                }
                                if (nVar != null) {
                                    nVar.a(this.f48562b, Collections.singletonList(a10));
                                } else {
                                    throw new IllegalStateException("Rule function is undefined: " + K10);
                                }
                            } else {
                                throw new IllegalArgumentException("Invalid rule definition");
                            }
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th2) {
            throw new C7281e0(th2);
        }
    }

    public final void d(String str, Callable<? extends C7361n> callable) {
        this.f48561a.b(str, callable);
    }

    public final boolean e(C7280e eVar) {
        try {
            this.f48563c.b(eVar);
            this.f48561a.f48637c.h("runtime.counter", new C7334k(Double.valueOf(0.0d)));
            this.f48564d.b(this.f48562b.d(), this.f48563c);
            return h() || g();
        } catch (Throwable th2) {
            throw new C7281e0(th2);
        }
    }

    public final boolean g() {
        return !this.f48563c.f().isEmpty();
    }

    public final boolean h() {
        return !this.f48563c.d().equals(this.f48563c.a());
    }

    private C(D1 d12) {
        this.f48561a = d12;
        this.f48562b = d12.f48636b.d();
        this.f48563c = new C7271d();
        this.f48564d = new C7253b();
        d12.b("internal.registerCallback", new C7244a(this));
        d12.b("internal.eventLogger", new E0(this));
    }
}
