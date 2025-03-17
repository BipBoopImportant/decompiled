package com.google.firebase.remoteconfig;

import Fb.f;
import Hc.h;
import Jb.b;
import Kb.C9128c;
import Kb.C9129d;
import Kb.E;
import Kb.q;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.abt.component.a;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import nc.e;

@Keep
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* access modifiers changed from: private */
    public static /* synthetic */ c lambda$getComponents$0(E e10, C9129d dVar) {
        return new c((Context) dVar.a(Context.class), (ScheduledExecutorService) dVar.b(e10), (f) dVar.a(f.class), (e) dVar.a(e.class), ((a) dVar.a(a.class)).b("frc"), dVar.e(Ib.a.class));
    }

    public List<C9128c<?>> getComponents() {
        E<ScheduledExecutorService> a10 = E.a(b.class, ScheduledExecutorService.class);
        return Arrays.asList(new C9128c[]{C9128c.f(c.class, Kc.a.class).h(LIBRARY_NAME).b(q.l(Context.class)).b(q.k(a10)).b(q.l(f.class)).b(q.l(e.class)).b(q.l(a.class)).b(q.j(Ib.a.class)).f(new Ic.q(a10)).e().d(), h.b(LIBRARY_NAME, "22.1.0")});
    }
}
