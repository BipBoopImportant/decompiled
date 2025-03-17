package com.google.firebase.messaging;

import Fb.f;
import Hc.h;
import Hc.i;
import Kb.C9128c;
import Kb.C9129d;
import Kb.E;
import Kb.q;
import androidx.annotation.Keep;
import bc.C9423b;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import jc.C9897d;
import kc.j;
import lc.C10007a;
import nc.e;

@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(E e10, C9129d dVar) {
        return new FirebaseMessaging((f) dVar.a(f.class), (C10007a) dVar.a(C10007a.class), dVar.e(i.class), dVar.e(j.class), (e) dVar.a(e.class), dVar.g(e10), (C9897d) dVar.a(C9897d.class));
    }

    @Keep
    public List<C9128c<?>> getComponents() {
        E<j9.j> a10 = E.a(C9423b.class, j9.j.class);
        return Arrays.asList(new C9128c[]{C9128c.e(FirebaseMessaging.class).h(LIBRARY_NAME).b(q.l(f.class)).b(q.h(C10007a.class)).b(q.j(i.class)).b(q.j(j.class)).b(q.l(e.class)).b(q.i(a10)).b(q.l(C9897d.class)).f(new B(a10)).c().d(), h.b(LIBRARY_NAME, "24.1.0")});
    }
}
