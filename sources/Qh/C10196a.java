package qh;

import Ae.k;
import Ae.l;
import Bx.a;
import HJ.C15854t;
import Iz.Y;
import MB.C13194a;
import PA.C13331a;
import XH.t;
import Zs.a;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.net.Uri;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.app.cart.b;
import com.ingka.ikea.app.shoppinglist.navigation.ShoppingListsRoutes$ListDetails;
import com.ingka.ikea.core.model.Link;
import com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation;
import com.ingka.ikea.store.datalayer.StorageType;
import com.sugarcube.core.logger.DslKt;
import gn.C11314a;
import iq.C11411a;
import iq.C11412b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lm.C11550a;
import on.C11687b;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import ru.e;
import rx.C15004a;
import rx.C15005b;
import x4.C;
import x4.C8951o;
import zk.C12529b;

@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u00002\u00020\u0001B\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J+\u0010(\u001a\u00020'2\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010&\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020'2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020'2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b,\u0010+J'\u0010/\u001a\u00020'2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J5\u00105\u001a\u00020'2\u0006\u0010#\u001a\u00020\"2\u0006\u00101\u001a\u00020$2\u0006\u00102\u001a\u00020$2\f\u00104\u001a\b\u0012\u0004\u0012\u00020$03H\u0016¢\u0006\u0004\b5\u00106J?\u0010<\u001a\u00020'2\u0006\u0010#\u001a\u00020\"2\u0006\u00107\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u00109\u001a\u0002082\u0006\u0010&\u001a\u00020$2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J9\u0010B\u001a\u00020'2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\b\u0010>\u001a\u0004\u0018\u00010$2\u0006\u0010?\u001a\u00020$2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ/\u0010G\u001a\u00020'2\u0006\u0010#\u001a\u00020\"2\u0006\u0010E\u001a\u00020D2\u0006\u0010%\u001a\u00020$2\u0006\u0010F\u001a\u00020$H\u0016¢\u0006\u0004\bG\u0010HJ7\u0010J\u001a\u00020'2\u0006\u0010#\u001a\u00020\"2\u0006\u0010E\u001a\u00020D2\u0006\u0010I\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010F\u001a\u00020$H\u0016¢\u0006\u0004\bJ\u0010KJ\u001f\u0010L\u001a\u00020'2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020'2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\bN\u0010+J\u001f\u0010O\u001a\u00020'2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\bO\u0010MJ\u001f\u0010Q\u001a\u00020'2\u0006\u0010#\u001a\u00020\"2\u0006\u0010P\u001a\u00020$H\u0016¢\u0006\u0004\bQ\u0010MJ\u0017\u0010R\u001a\u00020'2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\bR\u0010+J\u0017\u0010S\u001a\u00020'2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\bS\u0010+J'\u0010V\u001a\u00020'2\u0006\u0010#\u001a\u00020\"2\u0006\u0010T\u001a\u00020$2\u0006\u0010U\u001a\u00020@H\u0016¢\u0006\u0004\bV\u0010WJ'\u0010\\\u001a\u00020'2\u0006\u0010#\u001a\u00020\"2\u0006\u0010Y\u001a\u00020X2\u0006\u0010[\u001a\u00020ZH\u0016¢\u0006\u0004\b\\\u0010]R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010^R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\\\u0010_R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010`R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\bN\u0010aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u0010bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u0010cR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010dR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\bS\u0010eR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010fR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\bV\u0010gR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010hR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010iR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010jR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\bR\u0010kR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\bQ\u0010l¨\u0006m"}, d2 = {"Lqh/a;", "Lzk/b;", "LMB/a;", "storePickerNavigation", "LZs/a;", "inStoreNavigation", "Lcom/ingka/ikea/app/cart/b;", "cartNavigation", "LIz/Y;", "scanAndGoNavigation", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "listPickerNavigation", "Lru/e;", "wayfindingNavigation", "Llm/e;", "backInStockNavigation", "LZw/a;", "pipNavigation", "Lon/b;", "plpNavigation", "Liq/a;", "energyLabelNavigation", "LBx/a;", "accountApi", "Lgn/a;", "browseNavigation", "Lrx/b;", "productConfiguratorNavigation", "LEo/a;", "chromeCustomTabsApi", "LPA/a;", "shoppableImageNavigation", "<init>", "(LMB/a;LZs/a;Lcom/ingka/ikea/app/cart/b;LIz/Y;Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;Lru/e;Llm/e;LZw/a;Lon/b;Liq/a;LBx/a;Lgn/a;Lrx/b;LEo/a;LPA/a;)V", "Lx4/o;", "navController", "", "itemNo", "requestKey", "LXH/N;", "i", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;)V", "l", "(Lx4/o;)V", "g", "LDe/a;", "sourceComponent", "f", "(Lx4/o;Ljava/lang/String;LDe/a;)V", "id", "fallbackTitle", "", "includedItemNos", "e", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "productName", "", "quantity", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "p", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "division", "storeId", "", "fromProductModal", "q", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Llm/a$c;", "fulfilmentOption", "itemType", "k", "(Lx4/o;Llm/a$c;Ljava/lang/String;Ljava/lang/String;)V", "productTitle", "m", "(Lx4/o;Llm/a$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "c", "(Lx4/o;Ljava/lang/String;)V", "d", "a", "inspirationId", "o", "n", "h", "listId", "selectInStoreMode", "j", "(Lx4/o;Ljava/lang/String;Z)V", "Lcom/ingka/ikea/core/model/Link;", "link", "Landroid/content/Context;", "context", "b", "(Lx4/o;Lcom/ingka/ikea/core/model/Link;Landroid/content/Context;)V", "LMB/a;", "LZs/a;", "Lcom/ingka/ikea/app/cart/b;", "LIz/Y;", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "Lru/e;", "Llm/e;", "LZw/a;", "Lon/b;", "Liq/a;", "LBx/a;", "Lgn/a;", "Lrx/b;", "LEo/a;", "LPA/a;", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qh.a  reason: case insensitive filesystem */
public final class C10196a implements C12529b {

    /* renamed from: a  reason: collision with root package name */
    private final C13194a f76235a;

    /* renamed from: b  reason: collision with root package name */
    private final a f76236b;

    /* renamed from: c  reason: collision with root package name */
    private final b f76237c;

    /* renamed from: d  reason: collision with root package name */
    private final Y f76238d;

    /* renamed from: e  reason: collision with root package name */
    private final ListPickerNavigation f76239e;

    /* renamed from: f  reason: collision with root package name */
    private final e f76240f;

    /* renamed from: g  reason: collision with root package name */
    private final lm.e f76241g;

    /* renamed from: h  reason: collision with root package name */
    private final Zw.a f76242h;

    /* renamed from: i  reason: collision with root package name */
    private final C11687b f76243i;

    /* renamed from: j  reason: collision with root package name */
    private final C11411a f76244j;

    /* renamed from: k  reason: collision with root package name */
    private final Bx.a f76245k;

    /* renamed from: l  reason: collision with root package name */
    private final C11314a f76246l;

    /* renamed from: m  reason: collision with root package name */
    private final C15005b f76247m;

    /* renamed from: n  reason: collision with root package name */
    private final Eo.a f76248n;

    /* renamed from: o  reason: collision with root package name */
    private final C13331a f76249o;

    public C10196a(C13194a aVar, a aVar2, b bVar, Y y10, ListPickerNavigation listPickerNavigation, e eVar, lm.e eVar2, Zw.a aVar3, C11687b bVar2, C11411a aVar4, Bx.a aVar5, C11314a aVar6, C15005b bVar3, Eo.a aVar7, C13331a aVar8) {
        C13194a aVar9 = aVar;
        a aVar10 = aVar2;
        b bVar4 = bVar;
        Y y11 = y10;
        ListPickerNavigation listPickerNavigation2 = listPickerNavigation;
        e eVar3 = eVar;
        lm.e eVar4 = eVar2;
        Zw.a aVar11 = aVar3;
        C11687b bVar5 = bVar2;
        C11411a aVar12 = aVar4;
        Bx.a aVar13 = aVar5;
        C11314a aVar14 = aVar6;
        C15005b bVar6 = bVar3;
        Eo.a aVar15 = aVar7;
        C13331a aVar16 = aVar8;
        C17542s.j(aVar9, "storePickerNavigation");
        C17542s.j(aVar10, "inStoreNavigation");
        C17542s.j(bVar4, "cartNavigation");
        C17542s.j(y11, "scanAndGoNavigation");
        C17542s.j(listPickerNavigation2, "listPickerNavigation");
        C17542s.j(eVar3, "wayfindingNavigation");
        C17542s.j(eVar4, "backInStockNavigation");
        C17542s.j(aVar11, "pipNavigation");
        C17542s.j(bVar5, "plpNavigation");
        C17542s.j(aVar12, "energyLabelNavigation");
        C17542s.j(aVar13, "accountApi");
        C17542s.j(aVar14, "browseNavigation");
        C17542s.j(bVar6, "productConfiguratorNavigation");
        C17542s.j(aVar15, "chromeCustomTabsApi");
        C17542s.j(aVar16, "shoppableImageNavigation");
        this.f76235a = aVar9;
        this.f76236b = aVar10;
        this.f76237c = bVar4;
        this.f76238d = y11;
        this.f76239e = listPickerNavigation2;
        this.f76240f = eVar3;
        this.f76241g = eVar4;
        this.f76242h = aVar11;
        this.f76243i = bVar5;
        this.f76244j = aVar12;
        this.f76245k = aVar13;
        this.f76246l = aVar14;
        this.f76247m = bVar6;
        this.f76248n = aVar15;
        this.f76249o = aVar16;
    }

    public void a(C8951o oVar, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "itemNo");
        this.f76247m.h(oVar, str, C15004a.LIST_CART_ACTIONS);
    }

    public void b(C8951o oVar, Link link, Context context) {
        String str;
        C17542s.j(oVar, "navController");
        C17542s.j(link, "link");
        C17542s.j(context, "context");
        if (link instanceof Link.External) {
            this.f76248n.a(context, ((Link.External) link).e());
        } else if (link instanceof Link.Deeplink) {
            try {
                Uri parse = Uri.parse(((Link.Deeplink) link).e());
                C17542s.i(parse, "parse(...)");
                oVar.X(parse);
            } catch (ActivityNotFoundException e10) {
                qv.e eVar = qv.e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str2 = null;
                String str3 = null;
                for (C11819b bVar : arrayList) {
                    if (str2 == null) {
                        String a10 = C11818a.a("No Activity found to handle Intent with url: " + ((Link.Deeplink) link).e(), e10);
                        if (a10 != null) {
                            str2 = C11820c.a(a10);
                        } else {
                            return;
                        }
                    }
                    String str4 = str2;
                    if (str3 == null) {
                        str = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "ShoppingListExternalNavigationContract";
                    } else {
                        str = str3;
                    }
                    bVar.a(eVar, str, false, e10, str4);
                    str2 = str4;
                    str3 = str;
                }
            }
        } else {
            throw new t();
        }
    }

    public void c(C8951o oVar, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "itemNo");
        C11411a.C2225a.a(this.f76244j, oVar, str, (C11412b) null, 4, (Object) null);
    }

    public void d(C8951o oVar) {
        C17542s.j(oVar, "navController");
        this.f76246l.d(oVar);
    }

    public void e(C8951o oVar, String str, String str2, List<String> list) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "id");
        C17542s.j(str2, "fallbackTitle");
        List<String> list2 = list;
        C17542s.j(list2, "includedItemNos");
        C11687b bVar = this.f76243i;
        C11687b.C2346b.b(bVar, str, str2, C11687b.e.USER_RECOMMENDATION, Interaction$Component.SHOPPING_LIST_DETAILS_INSPIRATION_RECOMMENDATION, oVar, (List) null, list2, (String) null, 160, (Object) null);
    }

    public void f(C8951o oVar, String str, De.a aVar) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "itemNo");
        C17542s.j(aVar, "sourceComponent");
        this.f76242h.a(oVar, str, aVar);
    }

    public void g(C8951o oVar) {
        C17542s.j(oVar, "navController");
        this.f76238d.h(oVar, l.LIST_DETAIL);
    }

    public void h(C8951o oVar) {
        C17542s.j(oVar, "navController");
        this.f76245k.b(oVar, a.C2584a.SHOPPING_LIST);
    }

    public void i(C8951o oVar, String str, String str2) {
        C17542s.j(oVar, "navController");
        C13194a aVar = this.f76235a;
        StorageType storageType = StorageType.LOCAL;
        if (str2 == null) {
            str2 = "StorePickerFragment.Result.Key";
        }
        C13194a.C2742a.a(aVar, oVar, storageType, str, false, str2, (C) null, 40, (Object) null);
    }

    public void j(C8951o oVar, String str, boolean z10) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "listId");
        oVar.X(ShoppingListsRoutes$ListDetails.Companion.a(str, z10));
    }

    public void k(C8951o oVar, C11550a.c cVar, String str, String str2) {
        C17542s.j(oVar, "navController");
        C17542s.j(cVar, "fulfilmentOption");
        C17542s.j(str, "itemNo");
        C17542s.j(str2, "itemType");
        this.f76241g.a(oVar, cVar, str, str2);
    }

    public void l(C8951o oVar) {
        C17542s.j(oVar, "navController");
        b.a.a(this.f76237c, oVar, false, rw.b.a(oVar).a(), 2, (Object) null);
    }

    public void m(C8951o oVar, C11550a.c cVar, String str, String str2, String str3) {
        C17542s.j(oVar, "navController");
        C17542s.j(cVar, "fulfilmentOption");
        C17542s.j(str, "productTitle");
        C17542s.j(str2, "itemNo");
        C17542s.j(str3, "itemType");
        this.f76241g.b(oVar, cVar, str, str2, str3);
    }

    public void n(C8951o oVar) {
        C17542s.j(oVar, "navController");
        this.f76236b.b(oVar);
    }

    public void o(C8951o oVar, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "inspirationId");
        this.f76249o.j(oVar, str, C13331a.b.INSPIRATION);
    }

    public void p(C8951o oVar, String str, String str2, int i10, String str3, Interaction$Component interaction$Component) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "productName");
        C17542s.j(str2, "itemNo");
        C17542s.j(str3, "requestKey");
        C17542s.j(interaction$Component, "component");
        this.f76239e.a(oVar, new ListPickerNavigation.Operation.AddOrRemove(str, str2, i10, new ListPickerNavigation.Operation.Analytics(interaction$Component, k.BUTTON)), str3);
    }

    public void q(C8951o oVar, String str, String str2, String str3, boolean z10) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "itemNo");
        C17542s.j(str3, "storeId");
        this.f76240f.a(oVar, str, new e.a(str2, str3, z10 ? e.a.C2437a.SHOPPING_LIST_STORE_MODAL : e.a.C2437a.SHOPPING_LIST));
    }
}
