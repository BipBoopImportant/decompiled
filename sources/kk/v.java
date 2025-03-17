package kK;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LkK/c;", "from", "Lkotlin/Function1;", "LkK/e;", "LXH/N;", "builderAction", "a", "(LkK/c;LnI/l;)LkK/c;", "kotlinx-serialization-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class v {
    public static final C17514c a(C17514c cVar, C17642l<? super C17516e, C16807N> lVar) {
        C17542s.j(cVar, "from");
        C17542s.j(lVar, "builderAction");
        C17516e eVar = new C17516e(cVar);
        lVar.invoke(eVar);
        return new u(eVar.a(), eVar.b());
    }

    public static /* synthetic */ C17514c b(C17514c cVar, C17642l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = C17514c.f144280d;
        }
        return a(cVar, lVar);
    }
}
