package com.google.firebase.installations;

import Fb.f;
import Jb.a;
import Jb.b;
import Kb.C9128c;
import Kb.C9129d;
import Kb.E;
import Kb.q;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kc.h;
import kc.i;
import nc.e;

@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$0(C9129d dVar) {
        return new c((f) dVar.a(f.class), dVar.e(i.class), (ExecutorService) dVar.b(E.a(a.class, ExecutorService.class)), Lb.i.b((Executor) dVar.b(E.a(b.class, Executor.class))));
    }

    public List<C9128c<?>> getComponents() {
        return Arrays.asList(new C9128c[]{C9128c.e(e.class).h(LIBRARY_NAME).b(q.l(f.class)).b(q.j(i.class)).b(q.k(E.a(a.class, ExecutorService.class))).b(q.k(E.a(b.class, Executor.class))).f(new nc.f()).d(), h.a(), Hc.h.b(LIBRARY_NAME, "18.0.0")});
    }
}
