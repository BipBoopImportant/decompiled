package pm;

import Nd.c;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lm.C11550a;
import qm.C11798b;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J8\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lpm/b;", "Lpm/a;", "Lqm/b;", "backInStockPushRemoteDataSource", "LNd/c;", "abTesting", "<init>", "(Lqm/b;LNd/c;)V", "Llm/a$c;", "fulfilmentOption", "Llm/a$a;", "contactType", "", "itemNo", "itemType", "pushToken", "LXH/N;", "a", "(Llm/a$c;Llm/a$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lqm/b;", "b", "LNd/c;", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pm.b  reason: case insensitive filesystem */
public final class C11760b implements C11759a {

    /* renamed from: a  reason: collision with root package name */
    private final C11798b f101358a;

    /* renamed from: b  reason: collision with root package name */
    private final c f101359b;

    public C11760b(C11798b bVar, c cVar) {
        C17542s.j(bVar, "backInStockPushRemoteDataSource");
        C17542s.j(cVar, "abTesting");
        this.f101358a = bVar;
        this.f101359b = cVar;
    }

    public Object a(C11550a.c cVar, C11550a.C2253a aVar, String str, String str2, String str3, C17164e<? super C16807N> eVar) {
        c.a.a(this.f101359b, "subscribe_back_in_stock", (Map) null, (Map) null, 6, (Object) null);
        Object a10 = this.f101358a.a(cVar, aVar, str, str2, str3, eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }
}
