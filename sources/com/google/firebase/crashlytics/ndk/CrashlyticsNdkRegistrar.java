package com.google.firebase.crashlytics.ndk;

import Hc.h;
import Kb.C9128c;
import Kb.C9129d;
import Kb.q;
import Nb.a;
import Nb.f;
import ac.C9405a;
import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

public class CrashlyticsNdkRegistrar implements ComponentRegistrar {
    /* access modifiers changed from: private */
    public a b(C9129d dVar) {
        Context context = (Context) dVar.a(Context.class);
        return c.f(context, !f.g(context));
    }

    public List<C9128c<?>> getComponents() {
        return Arrays.asList(new C9128c[]{C9128c.e(a.class).h("fire-cls-ndk").b(q.l(Context.class)).f(new C9405a(this)).e().d(), h.b("fire-cls-ndk", "19.4.0")});
    }
}
