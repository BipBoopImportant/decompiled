package wk;

import Ae.e;
import Ae.j;
import XH.C16796C;
import YH.X;
import com.ingka.ikea.analytics.Interaction$Component;
import gB.C14504f;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0010"}, d2 = {"Lwk/b;", "Lwk/a;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "", "listId", "LXH/N;", "a", "(Ljava/lang/String;)V", "LgB/f;", "cardSizeSelected", "b", "(LgB/f;)V", "LAe/e;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wk.b  reason: case insensitive filesystem */
public final class C12277b implements C12276a {

    /* renamed from: a  reason: collision with root package name */
    private final e f105865a;

    public C12277b(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f105865a = eVar;
    }

    public void a(String str) {
        C17542s.j(str, "listId");
        e.c.c(this.f105865a, j.VIEW_ITEM_LIST.b(), X.f(C16796C.a("item_list_id", str)), Interaction$Component.SHOPPING_LISTS, (e.b) null, 8, (Object) null);
    }

    public void b(C14504f fVar) {
        C17542s.j(fVar, "cardSizeSelected");
        e.c.c(this.f105865a, j.ACTION_TAP.b(), X.f(C16796C.a("component_value", fVar.b())), Interaction$Component.LIST_VIEW_TOGGLE, (e.b) null, 8, (Object) null);
    }
}
