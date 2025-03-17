package com.google.firebase.perf;

import Fb.f;
import Fb.o;
import Hc.h;
import Jb.d;
import Kb.C9128c;
import Kb.C9129d;
import Kb.E;
import Kb.q;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.remoteconfig.c;
import j9.j;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import nc.e;
import wc.C10353b;
import wc.C10354c;
import wc.C10355d;
import wc.C10356e;
import xc.C10383a;
import yc.C10427a;

@Keep
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    /* access modifiers changed from: private */
    public static /* synthetic */ C10353b lambda$getComponents$0(E e10, C9129d dVar) {
        return new C10353b((f) dVar.a(f.class), dVar.e(o.class).get(), (Executor) dVar.b(e10));
    }

    /* access modifiers changed from: private */
    public static C10356e providesFirebasePerformance(C9129d dVar) {
        dVar.a(C10353b.class);
        return C10383a.a().b(new C10427a((f) dVar.a(f.class), (e) dVar.a(e.class), dVar.e(c.class), dVar.e(j.class))).a().a();
    }

    @Keep
    public List<C9128c<?>> getComponents() {
        E<Executor> a10 = E.a(d.class, Executor.class);
        Class<f> cls = f.class;
        Class<C10353b> cls2 = C10353b.class;
        return Arrays.asList(new C9128c[]{C9128c.e(C10356e.class).h(LIBRARY_NAME).b(q.l(cls)).b(q.n(c.class)).b(q.l(e.class)).b(q.n(j.class)).b(q.l(cls2)).f(new C10354c()).d(), C9128c.e(cls2).h(EARLY_LIBRARY_NAME).b(q.l(cls)).b(q.j(o.class)).b(q.k(a10)).e().f(new C10355d(a10)).d(), h.b(LIBRARY_NAME, "21.0.4")});
    }
}
