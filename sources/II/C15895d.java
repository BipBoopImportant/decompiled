package II;

import HJ.C15854t;
import JI.C15958B;
import JI.q;
import MI.C16076u;
import TI.C16503g;
import TI.u;
import cJ.C17065b;
import cJ.C17066c;
import java.util.Set;
import kotlin.jvm.internal.C17542s;

/* renamed from: II.d  reason: case insensitive filesystem */
public final class C15895d implements C16076u {

    /* renamed from: a  reason: collision with root package name */
    private final ClassLoader f135482a;

    public C15895d(ClassLoader classLoader) {
        C17542s.j(classLoader, "classLoader");
        this.f135482a = classLoader;
    }

    public C16503g a(C16076u.a aVar) {
        C17542s.j(aVar, "request");
        C17065b a10 = aVar.a();
        C17066c f10 = a10.f();
        String P10 = C15854t.P(a10.g().a(), '.', '$', false, 4, (Object) null);
        if (!f10.c()) {
            P10 = f10.a() + '.' + P10;
        }
        Class<?> a11 = C15896e.a(this.f135482a, P10);
        if (a11 != null) {
            return new q(a11);
        }
        return null;
    }

    public Set<String> b(C17066c cVar) {
        C17542s.j(cVar, "packageFqName");
        return null;
    }

    public u c(C17066c cVar, boolean z10) {
        C17542s.j(cVar, "fqName");
        return new C15958B(cVar);
    }
}
