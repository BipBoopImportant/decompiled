package com.google.firebase.analytics.connector.internal;

import Fb.f;
import Hc.h;
import Ib.a;
import Kb.C9128c;
import Kb.q;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import jc.C9897d;

@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @SuppressLint({"MissingPermission"})
    @Keep
    public List<C9128c<?>> getComponents() {
        return Arrays.asList(new C9128c[]{C9128c.e(a.class).b(q.l(f.class)).b(q.l(Context.class)).b(q.l(C9897d.class)).f(new a()).e().d(), h.b("fire-analytics", "22.2.0")});
    }
}
