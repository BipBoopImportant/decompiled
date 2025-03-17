package com.google.firebase.datatransport;

import Hc.h;
import Kb.C9128c;
import Kb.E;
import Kb.q;
import android.content.Context;
import androidx.annotation.Keep;
import bc.C9422a;
import bc.C9423b;
import bc.C9424c;
import bc.C9425d;
import bc.C9426e;
import com.google.firebase.components.ComponentRegistrar;
import j9.j;
import java.util.Arrays;
import java.util.List;

@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public List<C9128c<?>> getComponents() {
        Class<j> cls = j.class;
        Class<Context> cls2 = Context.class;
        return Arrays.asList(new C9128c[]{C9128c.e(cls).h(LIBRARY_NAME).b(q.l(cls2)).f(new C9424c()).d(), C9128c.c(E.a(C9422a.class, cls)).b(q.l(cls2)).f(new C9425d()).d(), C9128c.c(E.a(C9423b.class, cls)).b(q.l(cls2)).f(new C9426e()).d(), h.b(LIBRARY_NAME, "19.0.0")});
    }
}
