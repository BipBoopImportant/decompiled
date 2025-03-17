package Nr;

import Ae.k;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation;
import com.sugarcube.app.base.external.shoppinglist.AddToShoppingListUseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x4.C8951o;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J:\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LNr/a;", "Lcom/sugarcube/app/base/external/shoppinglist/AddToShoppingListUseCase;", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "listPickerNavigation", "<init>", "(Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;)V", "Lx4/o;", "navController", "", "productName", "itemNo", "itemType", "", "quantity", "LXH/N;", "invoke", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "a", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "geomagical-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements AddToShoppingListUseCase {

    /* renamed from: a  reason: collision with root package name */
    private final ListPickerNavigation f84254a;

    public a(ListPickerNavigation listPickerNavigation) {
        C17542s.j(listPickerNavigation, "listPickerNavigation");
        this.f84254a = listPickerNavigation;
    }

    public void invoke(C8951o oVar, String str, String str2, String str3, int i10) {
        C17542s.j(oVar, "navController");
        C17542s.j(str2, "itemNo");
        C17542s.j(str3, "itemType");
        ListPickerNavigation.a.a(this.f84254a, oVar, new ListPickerNavigation.Operation.AddOrRemove(str, str2, 0, new ListPickerNavigation.Operation.Analytics(Interaction$Component.GEOMAGICAL_PLP, k.BUTTON), 4, (DefaultConstructorMarker) null), (String) null, 4, (Object) null);
    }
}
