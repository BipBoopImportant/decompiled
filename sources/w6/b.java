package W6;

import GK.C15802u;
import GK.z;
import L6.b;
import N6.d;
import X6.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\b\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LL6/b$a;", "LGK/z;", "okHttpClient", "a", "(LL6/b$a;LGK/z;)LL6/b$a;", "", "LN6/d;", "LGK/u;", "b", "(Ljava/util/List;)LGK/u;", "apollo-runtime"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class b {
    public static final b.a a(b.a aVar, z zVar) {
        C17542s.j(aVar, "<this>");
        C17542s.j(zVar, "okHttpClient");
        aVar.i(new a(zVar));
        aVar.k(new Y6.a(zVar));
        return aVar;
    }

    public static final C15802u b(List<d> list) {
        C17542s.j(list, "<this>");
        C15802u.a aVar = new C15802u.a();
        for (d dVar : list) {
            aVar.a(dVar.a(), dVar.b());
        }
        return aVar.f();
    }
}
