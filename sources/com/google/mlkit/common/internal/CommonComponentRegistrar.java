package com.google.mlkit.common.internal;

import Kb.C9128c;
import Kb.q;
import Wc.a;
import Wc.b;
import Wc.d;
import Wc.e;
import Wc.f;
import Wc.g;
import Wc.h;
import Yc.c;
import Zc.C9392a;
import Zc.C9393b;
import Zc.C9395d;
import Zc.C9400i;
import Zc.C9401j;
import Zc.n;
import ad.C9407b;
import com.google.firebase.components.ComponentRegistrar;
import ga.C7912n;
import java.util.List;

public class CommonComponentRegistrar implements ComponentRegistrar {
    public final List getComponents() {
        C9128c<?> cVar = n.f65126b;
        Class<C9400i> cls = C9400i.class;
        C9128c<C9407b> d10 = C9128c.e(C9407b.class).b(q.l(cls)).f(a.f64632a).d();
        Class<C9401j> cls2 = C9401j.class;
        C9128c<C9401j> d11 = C9128c.e(cls2).f(b.f64633a).d();
        Class<c.a> cls3 = c.a.class;
        C9128c<c> d12 = C9128c.e(c.class).b(q.o(cls3)).f(Wc.c.f64634a).d();
        C9128c<C9395d> d13 = C9128c.e(C9395d.class).b(q.n(cls2)).f(d.f64635a).d();
        Class<C9392a> cls4 = C9392a.class;
        C9128c<C9392a> d14 = C9128c.e(cls4).f(e.f64636a).d();
        C9128c<C9393b> d15 = C9128c.e(C9393b.class).b(q.l(cls4)).f(f.f64637a).d();
        Class<Xc.a> cls5 = Xc.a.class;
        return C7912n.r(cVar, d10, d11, d12, d13, d14, d15, C9128c.e(cls5).b(q.l(cls)).f(g.f64638a).d(), C9128c.m(cls3).b(q.n(cls5)).f(h.f64639a).d());
    }
}
