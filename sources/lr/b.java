package Lr;

import Kf.C9133b;
import Kf.y;
import XH.C16807N;
import XH.v;
import YH.C16877v;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ingka.ikea.analytics.Interaction$Component;
import com.sugarcube.app.base.external.interactions.CartInteractions;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\u00020\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000e0\rH@¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0018\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010!\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"LLr/b;", "Lcom/sugarcube/app/base/external/interactions/CartInteractions;", "LKf/b;", "cartApi", "<init>", "(LKf/b;)V", "", "productNumber", "", "quantity", "LXH/N;", "addItem", "(Ljava/lang/String;ILdI/e;)Ljava/lang/Object;", "", "LXH/v;", "productList", "addItems", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "availabilityDisclaimer", "buttonString", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Lkotlin/Function0;", "callback", "addToCartWithDisclaimer", "(Ljava/lang/String;Ljava/lang/String;Landroidx/fragment/app/FragmentManager;LnI/a;)V", "Landroid/content/Context;", "context", "Landroid/view/View;", "rootView", "", "throwable", "productName", "showAddToCartException", "(Landroid/content/Context;Landroid/view/View;Ljava/lang/Throwable;Ljava/lang/String;)V", "a", "LKf/b;", "geomagical-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements CartInteractions {

    /* renamed from: a  reason: collision with root package name */
    private final C9133b f83333a;

    public b(C9133b bVar) {
        C17542s.j(bVar, "cartApi");
        this.f83333a = bVar;
    }

    public Object addItem(String str, int i10, C17164e<? super C16807N> eVar) {
        Object a10 = C9133b.C1020b.a(this.f83333a, C16877v.e(new y(str, i10)), Interaction$Component.GEOMAGICAL_PLP, (String) null, eVar, 4, (Object) null);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public Object addItems(List<v<String, Integer>> list, C17164e<? super C16807N> eVar) {
        C9133b bVar = this.f83333a;
        Iterable<v> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (v vVar : iterable) {
            arrayList.add(new y((String) vVar.a(), ((Number) vVar.b()).intValue()));
        }
        Object a10 = C9133b.C1020b.a(bVar, arrayList, Interaction$Component.GEOMAGICAL_PLP, (String) null, eVar, 4, (Object) null);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public void addToCartWithDisclaimer(String str, String str2, FragmentManager fragmentManager, C17631a<C16807N> aVar) {
        C17542s.j(str2, "buttonString");
        C17542s.j(fragmentManager, "fragmentManager");
        C17542s.j(aVar, "callback");
        this.f83333a.addToCartWithDisclaimer(str, str2, fragmentManager, aVar);
    }

    public void showAddToCartException(Context context, View view, Throwable th2, String str) {
        C17542s.j(context, "context");
        C17542s.j(view, "rootView");
        C17542s.j(th2, "throwable");
        this.f83333a.showAddToCartException(context, view, th2, str);
    }
}
