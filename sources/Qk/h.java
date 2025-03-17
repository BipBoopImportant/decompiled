package qk;

import Ae.k;
import com.ingka.ikea.analytics.Interaction$Component;
import gB.C14500b;
import gB.C14505g;
import jB.C14613b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pk.s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lqk/h;", "", "LjB/b;", "shoppingListRepository", "<init>", "(LjB/b;)V", "", "listId", "LgB/g;", "item", "LAe/k;", "actionType", "Lpk/s$i;", "a", "(Ljava/lang/String;LgB/g;LAe/k;)Lpk/s$i;", "LjB/b;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final C14613b f101652a;

    public h(C14613b bVar) {
        C17542s.j(bVar, "shoppingListRepository");
        this.f101652a = bVar;
    }

    public final s.i a(String str, C14505g gVar, k kVar) {
        C17542s.j(str, "listId");
        C17542s.j(gVar, "item");
        C17542s.j(kVar, "actionType");
        this.f101652a.l(str, new C14613b.C3151b(gVar.b(), gVar.g()), Interaction$Component.SHOPPING_LIST_DETAILS, kVar);
        String b10 = gVar.b();
        C14500b f10 = gVar.f();
        String f11 = f10 != null ? f10.f() : null;
        if (f11 == null) {
            f11 = "";
        }
        return new s.i.a(b10, f11);
    }
}
