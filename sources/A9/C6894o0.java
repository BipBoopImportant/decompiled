package a9;

import kotlin.jvm.internal.C17542s;

/* renamed from: a9.o0  reason: case insensitive filesystem */
public final class C6894o0 {

    /* renamed from: a  reason: collision with root package name */
    public final C6806d0 f42749a;

    public C6894o0(C6806d0 d0Var) {
        C17542s.j(d0Var, "eventsProvidersManager");
        this.f42749a = d0Var;
    }

    public final void a(N n10) {
        C17542s.j(n10, "newEvent");
        C6806d0 d0Var = this.f42749a;
        synchronized (d0Var) {
            C17542s.j(n10, "event");
            d0Var.f42497a.add(n10);
        }
    }
}
