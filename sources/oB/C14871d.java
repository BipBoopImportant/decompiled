package oB;

import com.ingka.ikea.shoppinglist.listpicker.impl.navigation.ListPickerRoutes$ListSelector;
import com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import x4.C;
import x4.C8951o;
import x4.I;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"LoB/d;", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "LoB/a;", "argumentMapper", "<init>", "(LoB/a;)V", "Lx4/o;", "navController", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation;", "operation", "", "requestKey", "LXH/N;", "a", "(Lx4/o;Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation;Ljava/lang/String;)V", "LoB/a;", "listpicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: oB.d  reason: case insensitive filesystem */
public final class C14871d implements ListPickerNavigation {

    /* renamed from: a  reason: collision with root package name */
    private final C14868a f129973a;

    public C14871d(C14868a aVar) {
        C17542s.j(aVar, "argumentMapper");
        this.f129973a = aVar;
    }

    public void a(C8951o oVar, ListPickerNavigation.Operation operation, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(operation, "operation");
        C17542s.j(str, "requestKey");
        C8951o.f0(oVar, new ListPickerRoutes$ListSelector(str, this.f129973a.a(operation)), (C) null, (I.a) null, 6, (Object) null);
    }
}
