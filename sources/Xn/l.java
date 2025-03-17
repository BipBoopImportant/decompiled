package Xn;

import Do.m;
import Nn.C10804g;
import Nn.C10813p;
import Nn.Q;
import Nn.u;
import androidx.fragment.app.FragmentManager;
import com.ingka.ikea.checkout.impl.delivery.bottomsheets.UnavailableItemsBottomSheet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003JS\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LXn/l;", "LXn/k;", "<init>", "()V", "Landroidx/fragment/app/FragmentManager;", "supportFragmentManager", "", "isSelectable", "", "LNn/Q;", "unavailableItems", "LNn/g;", "productList", "LDo/m;", "selectedDeliveryOption", "LNn/p;", "deliveryServiceType", "LNn/u;", "serviceType", "LXH/N;", "a", "(Landroidx/fragment/app/FragmentManager;ZLjava/util/List;Ljava/util/List;LDo/m;LNn/p;LNn/u;)V", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements k {
    public void a(FragmentManager fragmentManager, boolean z10, List<Q> list, List<C10804g> list2, m mVar, C10813p pVar, u uVar) {
        C17542s.j(fragmentManager, "supportFragmentManager");
        C17542s.j(list, "unavailableItems");
        C17542s.j(list2, "productList");
        C17542s.j(mVar, "selectedDeliveryOption");
        C17542s.j(pVar, "deliveryServiceType");
        C17542s.j(uVar, "serviceType");
        UnavailableItemsBottomSheet.f94509X.a(z10, list, list2, mVar, pVar, uVar).show(fragmentManager, "unavailable_items_dialog");
    }
}
