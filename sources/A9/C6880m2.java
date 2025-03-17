package a9;

import kotlin.jvm.internal.C17542s;

/* renamed from: a9.m2  reason: case insensitive filesystem */
public final class C6880m2 {

    /* renamed from: a  reason: collision with root package name */
    public final C6806d0 f42705a;

    public C6880m2(C6806d0 d0Var) {
        C17542s.j(d0Var, "eventsProvidersManager");
        this.f42705a = d0Var;
    }

    public final void a(C6951v2 v2Var) {
        C17542s.j(v2Var, "newEvent");
        C6806d0 d0Var = this.f42705a;
        synchronized (d0Var) {
            C17542s.j(v2Var, "event");
            d0Var.f42497a.add(v2Var);
        }
    }
}
