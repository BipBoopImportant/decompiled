package a9;

import E8.b;
import E8.c;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.m0  reason: case insensitive filesystem */
public final class C6878m0 {

    /* renamed from: a  reason: collision with root package name */
    public final C6806d0 f42702a;

    /* renamed from: b  reason: collision with root package name */
    public final c f42703b;

    /* renamed from: c  reason: collision with root package name */
    public final D8.c f42704c = new D8.c("StartStopEventProvider");

    public C6878m0(C6806d0 d0Var, c cVar) {
        C17542s.j(d0Var, "eventsProvidersManager");
        C17542s.j(cVar, "preferencesStore");
        this.f42702a = d0Var;
        this.f42703b = cVar;
    }

    public final synchronized void a(boolean z10) {
        C6987z6 z6Var;
        try {
            boolean b10 = this.f42703b.b(b.LOCAL_SESSION_REPLAY_MODE, false);
            if (!this.f42703b.b(b.SESSION_REPLAY_FORCE_START, false)) {
                if (!b10) {
                    z6Var = C6987z6.REGULAR;
                    this.f42702a.b(new C6931s6(System.currentTimeMillis(), z6Var, z10));
                    D8.c cVar = this.f42704c;
                    cVar.f("Session Replay start event added: " + z6Var);
                }
            }
            z6Var = C6987z6.FORCED;
            this.f42702a.b(new C6931s6(System.currentTimeMillis(), z6Var, z10));
            D8.c cVar2 = this.f42704c;
            cVar2.f("Session Replay start event added: " + z6Var);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }
}
