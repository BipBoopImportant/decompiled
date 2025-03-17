package zk;

import QA.C13349a;
import QA.C13352d;
import com.ingka.ikea.app.shoppinglist.navigation.ShoppingListsRoutes$ShoppingListHost;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wk.C12276a;
import x4.C;
import x4.C8951o;
import x4.I;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lzk/c;", "LQA/d;", "Lwk/a;", "shoppingListAnalytics", "<init>", "(Lwk/a;)V", "Lx4/o;", "navController", "LQA/a;", "mode", "Lx4/C;", "navOptions", "LXH/N;", "b", "(Lx4/o;LQA/a;Lx4/C;)V", "", "listId", "", "selectInStoreMode", "a", "(Lx4/o;Ljava/lang/String;ZLx4/C;)V", "Lwk/a;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zk.c  reason: case insensitive filesystem */
public final class C12530c implements C13352d {

    /* renamed from: a  reason: collision with root package name */
    private final C12276a f107412a;

    public C12530c(C12276a aVar) {
        C17542s.j(aVar, "shoppingListAnalytics");
        this.f107412a = aVar;
    }

    public void a(C8951o oVar, String str, boolean z10, C c10) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "listId");
        this.f107412a.a(str);
        C8951o.f0(oVar, new ShoppingListsRoutes$ShoppingListHost((String) null, z10, str, 1, (DefaultConstructorMarker) null), c10, (I.a) null, 4, (Object) null);
    }

    public void b(C8951o oVar, C13349a aVar, C c10) {
        C17542s.j(oVar, "navController");
        C17542s.j(aVar, "mode");
        C8951o.f0(oVar, new ShoppingListsRoutes$ShoppingListHost(aVar.name(), false, (String) null, 6, (DefaultConstructorMarker) null), c10, (I.a) null, 4, (Object) null);
    }
}
