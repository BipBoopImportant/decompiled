package a9;

import kotlin.jvm.internal.C17542s;
import l8.C8541e;

public final class V1 {

    /* renamed from: a  reason: collision with root package name */
    public final C6806d0 f42338a;

    public V1(C6806d0 d0Var) {
        C17542s.j(d0Var, "eventsProvidersManager");
        this.f42338a = d0Var;
    }

    public final void a(C8541e eVar) {
        C17542s.j(eVar, "newEvent");
        C6806d0 d0Var = this.f42338a;
        synchronized (d0Var) {
            C17542s.j(eVar, "event");
            d0Var.f42497a.add(eVar);
        }
    }
}
