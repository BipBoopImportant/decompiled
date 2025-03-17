package com.google.firebase.abt.component;

import Hc.h;
import Ib.a;
import Kb.C9128c;
import Kb.C9129d;
import Kb.q;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

@Keep
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(C9129d dVar) {
        return new a((Context) dVar.a(Context.class), dVar.e(a.class));
    }

    public List<C9128c<?>> getComponents() {
        return Arrays.asList(new C9128c[]{C9128c.e(a.class).h(LIBRARY_NAME).b(q.l(Context.class)).b(q.j(a.class)).f(new Hb.a()).d(), h.b(LIBRARY_NAME, "21.1.1")});
    }
}
