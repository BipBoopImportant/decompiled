package Kf;

import Ae.k;
import HJ.C15854t;
import Ln.d;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation;
import com.sugarcube.core.logger.DslKt;
import hg.v;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import x4.C8951o;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u0012\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J?\u0010\u0016\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LKf/a;", "", "<init>", "()V", "Lx4/o;", "navController", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "listPickerNavigation", "", "itemNo", "productName", "", "quantity", "LAe/k;", "actionType", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "LXH/N;", "a", "(Lx4/o;Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;Ljava/lang/String;Ljava/lang/String;ILAe/k;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "Lhg/v;", "cartViewModel", "b", "(Lx4/o;Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;Lhg/v;Ljava/lang/String;LAe/k;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Kf.a  reason: case insensitive filesystem */
public final class C9132a {
    private final void a(C8951o oVar, ListPickerNavigation listPickerNavigation, String str, String str2, int i10, k kVar, Interaction$Component interaction$Component) {
        ListPickerNavigation.Operation.AddOrRemove addOrRemove = new ListPickerNavigation.Operation.AddOrRemove(str2, str, i10, new ListPickerNavigation.Operation.Analytics(interaction$Component, kVar));
        if (oVar != null) {
            ListPickerNavigation.a.a(listPickerNavigation, oVar, addOrRemove, (String) null, 4, (Object) null);
        }
    }

    public final void b(C8951o oVar, ListPickerNavigation listPickerNavigation, v vVar, String str, k kVar, Interaction$Component interaction$Component) {
        String str2 = str;
        ListPickerNavigation listPickerNavigation2 = listPickerNavigation;
        C17542s.j(listPickerNavigation, "listPickerNavigation");
        v vVar2 = vVar;
        C17542s.j(vVar, "cartViewModel");
        C17542s.j(str, "itemNo");
        C17542s.j(kVar, "actionType");
        C17542s.j(interaction$Component, "component");
        d C02 = vVar.C0(str);
        if (C02 == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unable to find item to move: " + str);
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar : arrayList) {
                if (str3 == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 != null) {
                        str3 = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                if (str4 == null) {
                    String name = C9132a.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                bVar.a(eVar, str4, false, illegalArgumentException, str3);
            }
            return;
        }
        a(oVar, listPickerNavigation, C02.j(), C02.i().i(), C02.l(), kVar, interaction$Component);
    }
}
