package com.google.mlkit.vision.barcode.internal;

import Kb.C9128c;
import Kb.q;
import Zc.C9395d;
import Zc.C9400i;
import com.google.firebase.components.ComponentRegistrar;
import ed.C9636d;
import ed.C9637e;
import ed.C9638f;
import ed.C9639g;
import ha.C8059l0;
import java.util.List;

public class BarcodeRegistrar implements ComponentRegistrar {
    public final List getComponents() {
        Class<C9639g> cls = C9639g.class;
        Class<C9400i> cls2 = C9400i.class;
        return C8059l0.r(C9128c.e(cls).b(q.l(cls2)).f(C9636d.f72594a).d(), C9128c.e(C9638f.class).b(q.l(cls)).b(q.l(C9395d.class)).b(q.l(cls2)).f(C9637e.f72595a).d());
    }
}
