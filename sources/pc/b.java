package Pc;

import Kb.C9128c;
import Kb.C9129d;
import Kb.i;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

public class b implements i {
    /* access modifiers changed from: private */
    public static /* synthetic */ Object c(String str, C9128c cVar, C9129d dVar) {
        try {
            c.b(str);
            return cVar.h().a(dVar);
        } finally {
            c.a();
        }
    }

    public List<C9128c<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C9128c next : componentRegistrar.getComponents()) {
            String i10 = next.i();
            if (i10 != null) {
                next = next.t(new a(i10, next));
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
