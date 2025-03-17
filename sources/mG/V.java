package mg;

import GK.C15784c;
import GK.C15804w;
import QL.h;
import YH.C16877v;
import aA.C13909a;
import java.util.List;
import java.util.Set;
import jm.C11429a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tw.c;
import tw.d;
import tw.k;
import tw.l;
import tw.n;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J_\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0016\u0010\u0017JO\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0001\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0010H\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001bH\u0007¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lmg/V;", "", "<init>", "()V", "LGK/c;", "cache", "", "LGK/w;", "retrofitInterceptors", "retrofitNetworkInterceptors", "", "debugInterceptors", "Ljm/a;", "backendUrls", "LQL/h$a;", "aggregatedConverterFactory", "Ltw/k;", "d", "(LGK/c;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Ljm/a;LQL/h$a;)Ltw/k;", "LaA/a;", "sessionManager", "Ltw/n;", "f", "(LGK/c;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Ljm/a;LaA/a;LQL/h$a;)Ltw/n;", "baseInterceptors", "Ltw/d;", "refererInterceptor", "Ltw/c;", "b", "(LGK/c;Ljava/util/List;Ljava/util/Set;Ltw/d;Ljm/a;LQL/h$a;)Ltw/c;", "client", "Ltw/l;", "c", "(Ltw/k;)Ltw/l;", "e", "(Ltw/n;)Ltw/l;", "a", "(Ltw/c;)Ltw/l;", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class V {
    public final l a(c cVar) {
        C17542s.j(cVar, "client");
        return cVar;
    }

    public final c b(C15784c cVar, List<C15804w> list, Set<C15804w> set, d dVar, C11429a aVar, h.a aVar2) {
        C17542s.j(cVar, "cache");
        C17542s.j(list, "baseInterceptors");
        C17542s.j(set, "debugInterceptors");
        C17542s.j(dVar, "refererInterceptor");
        C17542s.j(aVar, "backendUrls");
        C17542s.j(aVar2, "aggregatedConverterFactory");
        return new c(cVar, 60, C16877v.W0(C16877v.V0(list, set), dVar), aVar, aVar2);
    }

    public final l c(k kVar) {
        C17542s.j(kVar, "client");
        return kVar;
    }

    public final k d(C15784c cVar, List<C15804w> list, List<C15804w> list2, Set<C15804w> set, C11429a aVar, h.a aVar2) {
        C17542s.j(cVar, "cache");
        C17542s.j(list, "retrofitInterceptors");
        C17542s.j(list2, "retrofitNetworkInterceptors");
        C17542s.j(set, "debugInterceptors");
        C17542s.j(aVar, "backendUrls");
        C17542s.j(aVar2, "aggregatedConverterFactory");
        return new k(cVar, 60, C16877v.V0(list, set), list2, aVar, aVar2);
    }

    public final l e(n nVar) {
        C17542s.j(nVar, "client");
        return nVar;
    }

    public final n f(C15784c cVar, List<C15804w> list, List<C15804w> list2, Set<C15804w> set, C11429a aVar, C13909a aVar2, h.a aVar3) {
        Set<C15804w> set2 = set;
        C17542s.j(cVar, "cache");
        C17542s.j(list, "retrofitInterceptors");
        C17542s.j(list2, "retrofitNetworkInterceptors");
        C17542s.j(set2, "debugInterceptors");
        C11429a aVar4 = aVar;
        C17542s.j(aVar4, "backendUrls");
        C13909a aVar5 = aVar2;
        C17542s.j(aVar5, "sessionManager");
        h.a aVar6 = aVar3;
        C17542s.j(aVar6, "aggregatedConverterFactory");
        return new n(cVar, 60, C16877v.V0(list, set2), list2, aVar4, aVar5, aVar6);
    }
}
