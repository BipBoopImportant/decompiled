package a9;

import kotlin.jvm.internal.C17542s;

/* renamed from: a9.l  reason: case insensitive filesystem */
public final class C6869l {

    /* renamed from: a  reason: collision with root package name */
    public final C6806d0 f42671a;

    public C6869l(C6806d0 d0Var) {
        C17542s.j(d0Var, "eventsProvidersManager");
        this.f42671a = d0Var;
    }

    public final void a(C6940u uVar) {
        C17542s.j(uVar, "newEvent");
        C6806d0 d0Var = this.f42671a;
        synchronized (d0Var) {
            C17542s.j(uVar, "event");
            d0Var.f42497a.add(uVar);
        }
    }
}
