package com.google.firebase.dynamiclinks.internal;

import Fb.f;
import Hc.h;
import Ib.a;
import Kb.C9128c;
import Kb.C9129d;
import Kb.q;
import androidx.annotation.Keep;
import cc.C9450a;
import com.google.firebase.components.ComponentRegistrar;
import dc.g;
import java.util.Arrays;
import java.util.List;

@Keep
public final class FirebaseDynamicLinkRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-dl";

    /* access modifiers changed from: private */
    public static /* synthetic */ C9450a lambda$getComponents$0(C9129d dVar) {
        return new g((f) dVar.a(f.class), dVar.e(a.class));
    }

    @Keep
    public List<C9128c<?>> getComponents() {
        return Arrays.asList(new C9128c[]{C9128c.e(C9450a.class).h(LIBRARY_NAME).b(q.l(f.class)).b(q.j(a.class)).f(new dc.f()).d(), h.b(LIBRARY_NAME, "22.1.0")});
    }
}
