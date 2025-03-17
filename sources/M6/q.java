package M6;

import M6.p;
import Q6.i;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "D", "LM6/p;", "LM6/k;", "customScalarAdapters", "", "withDefaultBooleanValues", "LM6/p$a;", "b", "(LM6/p;LM6/k;Z)LM6/p$a;", "a", "(LM6/k;)LM6/k;", "apollo-api"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class q {
    private static final k a(k kVar) {
        return kVar.f().a(kVar.e().a().c(Boolean.TRUE).a()).c();
    }

    public static final <D> p.a b(p<D> pVar, k kVar, boolean z10) {
        C17542s.j(pVar, "<this>");
        C17542s.j(kVar, "customScalarAdapters");
        i iVar = new i();
        iVar.C();
        if (z10) {
            kVar = a(kVar);
        }
        pVar.a(iVar, kVar);
        iVar.K();
        Object e10 = iVar.e();
        C17542s.h(e10, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        return new p.a((Map) e10);
    }
}
