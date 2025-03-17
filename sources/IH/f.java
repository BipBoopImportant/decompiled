package IH;

import OH.C16158a;
import OH.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import uI.C18055d;
import uI.C18057f;
import uI.C18068q;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"LOH/a;", "a", "(LOH/a;)LOH/a;", "ktor-serialization-kotlinx-json"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {
    public static final C16158a a(C16158a aVar) {
        C17542s.j(aVar, "<this>");
        C18068q a10 = aVar.a();
        C17542s.g(a10);
        C18068q c10 = a10.i().get(0).c();
        C17542s.g(c10);
        C18057f e10 = c10.e();
        C17542s.h(e10, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        return new C16158a((C18055d) e10, b.a(c10), c10);
    }
}
