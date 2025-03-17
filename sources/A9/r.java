package a9;

import kotlin.jvm.internal.C17542s;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final C6806d0 f42823a;

    public r(C6806d0 d0Var) {
        C17542s.j(d0Var, "eventsProvidersManager");
        this.f42823a = d0Var;
    }

    public final void a(U0 u02) {
        C17542s.j(u02, "newEvent");
        C6806d0 d0Var = this.f42823a;
        synchronized (d0Var) {
            C17542s.j(u02, "event");
            d0Var.f42497a.add(u02);
        }
    }
}
