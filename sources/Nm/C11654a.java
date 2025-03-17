package nm;

import Ae.e;
import Ae.j;
import XH.C16796C;
import YH.X;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.backinstock.notification.repository.network.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lm.C11550a;
import lm.f;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0014\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018¨\u0006\u0019"}, d2 = {"Lnm/a;", "Llm/f;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "", "", "", "params", "LXH/N;", "d", "(Ljava/util/Map;)V", "itemNo", "Llm/a$c;", "fulfilmentOption", "componentValue", "a", "(Ljava/lang/String;Llm/a$c;Ljava/lang/String;)V", "storeId", "b", "(Ljava/lang/String;Ljava/lang/String;Llm/a$c;Ljava/lang/String;)V", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "LAe/e;", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: nm.a  reason: case insensitive filesystem */
public final class C11654a implements f {

    /* renamed from: a  reason: collision with root package name */
    private final e f99935a;

    public C11654a(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f99935a = eVar;
    }

    private final void d(Map<String, ? extends Object> map) {
        e.c.c(this.f99935a, j.ACTION_TAP.b(), map, Interaction$Component.BACK_IN_STOCK_NOTIFY_ME_BEGIN, (e.b) null, 8, (Object) null);
    }

    public void a(String str, C11550a.c cVar, String str2) {
        C17542s.j(str, "itemNo");
        C17542s.j(cVar, "fulfilmentOption");
        C17542s.j(str2, "componentValue");
        d(X.m(C16796C.a("component_value", str2), C16796C.a("item_id", str), C16796C.a("fulfilment", b.d(cVar))));
    }

    public void b(String str, String str2, C11550a.c cVar, String str3) {
        C17542s.j(str, "itemNo");
        C17542s.j(str2, "storeId");
        C17542s.j(cVar, "fulfilmentOption");
        C17542s.j(str3, "componentValue");
        d(X.m(C16796C.a("component_value", str3), C16796C.a("item_id", str), C16796C.a("fulfilment", b.d(cVar)), C16796C.a("store_id", str2)));
    }

    public void c(String str, String str2, String str3) {
        C17542s.j(str, "itemNo");
        C17542s.j(str2, "storeId");
        C17542s.j(str3, "componentValue");
        e.c.c(this.f99935a, j.ACTION_SUCCESS.b(), X.m(C16796C.a("component_value", str3), C16796C.a("item_id", str), C16796C.a("store_id", str2)), Interaction$Component.BACK_IN_STOCK_NOTIFY_ME_CONFIRMATION, (e.b) null, 8, (Object) null);
    }
}
