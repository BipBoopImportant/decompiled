package com.google.firebase.crashlytics;

import Hc.h;
import Jb.c;
import Kb.C9128c;
import Kb.C9129d;
import Kb.E;
import Kb.q;
import Nb.g;
import Nc.a;
import Nc.b;
import Rb.f;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import nc.e;

public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* renamed from: a  reason: collision with root package name */
    private final E<ExecutorService> f68226a;

    /* renamed from: b  reason: collision with root package name */
    private final E<ExecutorService> f68227b;

    /* renamed from: c  reason: collision with root package name */
    private final E<ExecutorService> f68228c;

    static {
        a.a(b.a.CRASHLYTICS);
    }

    public CrashlyticsRegistrar() {
        Class<ExecutorService> cls = ExecutorService.class;
        this.f68226a = E.a(Jb.a.class, cls);
        this.f68227b = E.a(Jb.b.class, cls);
        this.f68228c = E.a(c.class, cls);
    }

    /* access modifiers changed from: private */
    public FirebaseCrashlytics b(C9129d dVar) {
        f.f(false);
        long currentTimeMillis = System.currentTimeMillis();
        FirebaseCrashlytics b10 = FirebaseCrashlytics.b((Fb.f) dVar.a(Fb.f.class), (e) dVar.a(e.class), dVar.i(Nb.a.class), dVar.i(Ib.a.class), dVar.i(Kc.a.class), (ExecutorService) dVar.b(this.f68226a), (ExecutorService) dVar.b(this.f68227b), (ExecutorService) dVar.b(this.f68228c));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis2 > 16) {
            g f10 = g.f();
            f10.b("Initializing Crashlytics blocked main for " + currentTimeMillis2 + " ms");
        }
        return b10;
    }

    public List<C9128c<?>> getComponents() {
        return Arrays.asList(new C9128c[]{C9128c.e(FirebaseCrashlytics.class).h("fire-cls").b(q.l(Fb.f.class)).b(q.l(e.class)).b(q.k(this.f68226a)).b(q.k(this.f68227b)).b(q.k(this.f68228c)).b(q.a(Nb.a.class)).b(q.a(Ib.a.class)).b(q.a(Kc.a.class)).f(new Mb.f(this)).e().d(), h.b("fire-cls", "19.4.0")});
    }
}
