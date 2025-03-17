package lh;

import Ae.k;
import Ae.l;
import Ae.p;
import Bx.a;
import Fs.a;
import Ht.c;
import Iz.Y;
import LD.C13183a;
import MB.C13194a;
import QA.C13349a;
import QA.C13352d;
import Rd.a;
import XH.t;
import YH.C16877v;
import Zs.c;
import android.app.Activity;
import ax.d;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation;
import com.ingka.ikea.store.datalayer.StorageType;
import fC.C14445a;
import iq.C11411a;
import iq.C11412b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import on.C11687b;
import ru.e;
import rx.C15004a;
import rx.C15005b;
import x4.C;
import x4.C8951o;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bG\b\u0001\u0018\u00002\u00020\u0001B\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020(2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020(2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b/\u0010.J\u0017\u00100\u001a\u00020(2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b0\u0010.J\u001f\u00103\u001a\u00020(2\u0006\u0010,\u001a\u00020+2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00106\u001a\u00020(2\u0006\u0010,\u001a\u00020+2\u0006\u00105\u001a\u000201H\u0016¢\u0006\u0004\b6\u00104J'\u0010;\u001a\u00020(2\u0006\u0010,\u001a\u00020+2\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u001f\u0010?\u001a\u00020(2\u0006\u0010,\u001a\u00020+2\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020(2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\bA\u0010.J\u0017\u0010B\u001a\u00020(2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\bB\u0010.J)\u0010D\u001a\u00020(2\u0006\u0010,\u001a\u00020+2\b\u0010C\u001a\u0004\u0018\u0001012\u0006\u00105\u001a\u000201H\u0016¢\u0006\u0004\bD\u0010EJ\u001f\u0010G\u001a\u00020(2\u0006\u0010,\u001a\u00020+2\u0006\u0010F\u001a\u000201H\u0016¢\u0006\u0004\bG\u00104J)\u0010I\u001a\u00020(2\u0006\u0010,\u001a\u00020+2\u0006\u00105\u001a\u0002012\b\u0010H\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\bI\u0010EJ\u001f\u0010J\u001a\u00020(2\u0006\u0010,\u001a\u00020+2\u0006\u00105\u001a\u000201H\u0016¢\u0006\u0004\bJ\u00104J\u001f\u0010K\u001a\u00020(2\u0006\u0010,\u001a\u00020+2\u0006\u0010C\u001a\u000201H\u0016¢\u0006\u0004\bK\u00104J\u001f\u0010L\u001a\u00020(2\u0006\u0010,\u001a\u00020+2\u0006\u0010C\u001a\u000201H\u0016¢\u0006\u0004\bL\u00104J)\u0010N\u001a\u00020(2\u0006\u0010,\u001a\u00020+2\b\u0010M\u001a\u0004\u0018\u0001012\u0006\u0010C\u001a\u000201H\u0016¢\u0006\u0004\bN\u0010EJ\u001f\u0010O\u001a\u00020(2\u0006\u0010,\u001a\u00020+2\u0006\u0010C\u001a\u000201H\u0016¢\u0006\u0004\bO\u00104J\u0017\u0010P\u001a\u00020(2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\bP\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bK\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bB\u0010T\u001a\u0004\bU\u0010VR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bL\u0010W\u001a\u0004\bX\u0010YR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010Z\u001a\u0004\b[\u0010\\R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b-\u0010]\u001a\u0004\b^\u0010_R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b/\u0010`\u001a\u0004\ba\u0010bR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bO\u0010c\u001a\u0004\bd\u0010eR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bP\u0010f\u001a\u0004\bg\u0010hR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b3\u0010i\u001a\u0004\bj\u0010kR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bJ\u0010l\u001a\u0004\bm\u0010nR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bN\u0010o\u001a\u0004\bp\u0010qR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bG\u0010r\u001a\u0004\bs\u0010tR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b0\u0010u\u001a\u0004\bv\u0010wR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b6\u0010x\u001a\u0004\by\u0010zR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b;\u0010{\u001a\u0004\b|\u0010}R\u0018\u0010!\u001a\u00020 8\u0006¢\u0006\r\n\u0004\bA\u0010~\u001a\u0005\b\u0010\u0001R\u001a\u0010#\u001a\u00020\"8\u0006¢\u0006\u000f\n\u0005\bI\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, d2 = {"Llh/a;", "LHt/c;", "LRd/a;", "accountNavigation", "LLD/a;", "walletNavigation", "LQA/d;", "shoppingListNavigation", "LfC/a;", "storeDetailsNavigation", "Lon/b;", "plpNavigation", "LIz/Y;", "scanAndGoNavigation", "LMB/a;", "storePickerNavigation", "LFs/a;", "inboxNavigation", "Lru/e;", "wayfindingNavigation", "LAt/a;", "foodMobileNavigation", "LZs/c;", "storeEventsNavigation", "Lax/d;", "popularTimesNavigation", "Lrx/b;", "productConfiguratorNavigation", "Liq/a;", "energyLabelNavigation", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "listPickerNavigation", "LZw/a;", "pipNavigation", "LBx/a;", "accountApi", "<init>", "(LRd/a;LLD/a;LQA/d;LfC/a;Lon/b;LIz/Y;LMB/a;LFs/a;Lru/e;LAt/a;LZs/c;Lax/d;Lrx/b;Liq/a;Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;LZw/a;LBx/a;)V", "Landroid/app/Activity;", "activity", "LXH/N;", "d", "(Landroid/app/Activity;)V", "Lx4/o;", "navController", "e", "(Lx4/o;)V", "f", "m", "", "listId", "i", "(Lx4/o;Ljava/lang/String;)V", "storeId", "n", "LHt/c$a;", "type", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "o", "(Lx4/o;LHt/c$a;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "LAe/l;", "entryPoint", "r", "(Lx4/o;LAe/l;)V", "p", "b", "itemNo", "s", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;)V", "url", "l", "eventId", "q", "j", "a", "c", "productName", "k", "g", "h", "LRd/a;", "getAccountNavigation", "()LRd/a;", "LLD/a;", "getWalletNavigation", "()LLD/a;", "LQA/d;", "getShoppingListNavigation", "()LQA/d;", "LfC/a;", "getStoreDetailsNavigation", "()LfC/a;", "Lon/b;", "getPlpNavigation", "()Lon/b;", "LIz/Y;", "getScanAndGoNavigation", "()LIz/Y;", "LMB/a;", "getStorePickerNavigation", "()LMB/a;", "LFs/a;", "getInboxNavigation", "()LFs/a;", "Lru/e;", "getWayfindingNavigation", "()Lru/e;", "LAt/a;", "getFoodMobileNavigation", "()LAt/a;", "LZs/c;", "getStoreEventsNavigation", "()LZs/c;", "Lax/d;", "getPopularTimesNavigation", "()Lax/d;", "Lrx/b;", "getProductConfiguratorNavigation", "()Lrx/b;", "Liq/a;", "getEnergyLabelNavigation", "()Liq/a;", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "getListPickerNavigation", "()Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "LZw/a;", "getPipNavigation", "()LZw/a;", "LBx/a;", "getAccountApi", "()LBx/a;", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lh.a  reason: case insensitive filesystem */
public final class C10029a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final a f75305a;

    /* renamed from: b  reason: collision with root package name */
    private final C13183a f75306b;

    /* renamed from: c  reason: collision with root package name */
    private final C13352d f75307c;

    /* renamed from: d  reason: collision with root package name */
    private final C14445a f75308d;

    /* renamed from: e  reason: collision with root package name */
    private final C11687b f75309e;

    /* renamed from: f  reason: collision with root package name */
    private final Y f75310f;

    /* renamed from: g  reason: collision with root package name */
    private final C13194a f75311g;

    /* renamed from: h  reason: collision with root package name */
    private final Fs.a f75312h;

    /* renamed from: i  reason: collision with root package name */
    private final e f75313i;

    /* renamed from: j  reason: collision with root package name */
    private final At.a f75314j;

    /* renamed from: k  reason: collision with root package name */
    private final Zs.c f75315k;

    /* renamed from: l  reason: collision with root package name */
    private final d f75316l;

    /* renamed from: m  reason: collision with root package name */
    private final C15005b f75317m;

    /* renamed from: n  reason: collision with root package name */
    private final C11411a f75318n;

    /* renamed from: o  reason: collision with root package name */
    private final ListPickerNavigation f75319o;

    /* renamed from: p  reason: collision with root package name */
    private final Zw.a f75320p;

    /* renamed from: q  reason: collision with root package name */
    private final Bx.a f75321q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lh.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C1371a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f75322a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                Ht.c$a[] r0 = Ht.c.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Ht.c$a r1 = Ht.c.a.FAMILY_OFFERS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Ht.c$a r1 = Ht.c.a.NEW_LOWER_PRICE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Ht.c$a r1 = Ht.c.a.REDUCED_PRICE_OR_BTI     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f75322a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lh.C10029a.C1371a.<clinit>():void");
        }
    }

    public C10029a(a aVar, C13183a aVar2, C13352d dVar, C14445a aVar3, C11687b bVar, Y y10, C13194a aVar4, Fs.a aVar5, e eVar, At.a aVar6, Zs.c cVar, d dVar2, C15005b bVar2, C11411a aVar7, ListPickerNavigation listPickerNavigation, Zw.a aVar8, Bx.a aVar9) {
        a aVar10 = aVar;
        C13183a aVar11 = aVar2;
        C13352d dVar3 = dVar;
        C14445a aVar12 = aVar3;
        C11687b bVar3 = bVar;
        Y y11 = y10;
        C13194a aVar13 = aVar4;
        Fs.a aVar14 = aVar5;
        e eVar2 = eVar;
        At.a aVar15 = aVar6;
        Zs.c cVar2 = cVar;
        d dVar4 = dVar2;
        C15005b bVar4 = bVar2;
        C11411a aVar16 = aVar7;
        Zw.a aVar17 = aVar8;
        C17542s.j(aVar10, "accountNavigation");
        C17542s.j(aVar11, "walletNavigation");
        C17542s.j(dVar3, "shoppingListNavigation");
        C17542s.j(aVar12, "storeDetailsNavigation");
        C17542s.j(bVar3, "plpNavigation");
        C17542s.j(y11, "scanAndGoNavigation");
        C17542s.j(aVar13, "storePickerNavigation");
        C17542s.j(aVar14, "inboxNavigation");
        C17542s.j(eVar2, "wayfindingNavigation");
        C17542s.j(aVar15, "foodMobileNavigation");
        C17542s.j(cVar2, "storeEventsNavigation");
        C17542s.j(dVar4, "popularTimesNavigation");
        C17542s.j(bVar4, "productConfiguratorNavigation");
        C17542s.j(aVar16, "energyLabelNavigation");
        C17542s.j(listPickerNavigation, "listPickerNavigation");
        C17542s.j(aVar8, "pipNavigation");
        C17542s.j(aVar9, "accountApi");
        this.f75305a = aVar10;
        this.f75306b = aVar11;
        this.f75307c = dVar3;
        this.f75308d = aVar12;
        this.f75309e = bVar3;
        this.f75310f = y11;
        this.f75311g = aVar13;
        this.f75312h = aVar14;
        this.f75313i = eVar2;
        this.f75314j = aVar15;
        this.f75315k = cVar2;
        this.f75316l = dVar4;
        this.f75317m = bVar4;
        this.f75318n = aVar16;
        this.f75319o = listPickerNavigation;
        this.f75320p = aVar8;
        this.f75321q = aVar9;
    }

    public void a(C8951o oVar, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "itemNo");
        this.f75317m.h(oVar, str, C15004a.LIST_CART_ACTIONS);
    }

    public void b(C8951o oVar) {
        C17542s.j(oVar, "navController");
        a.C1575a.a(this.f75312h, oVar, (C) null, 2, (Object) null);
    }

    public void c(C8951o oVar, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "itemNo");
        C11411a.C2225a.a(this.f75318n, oVar, str, (C11412b) null, 4, (Object) null);
    }

    public void d(Activity activity) {
        C17542s.j(activity, "activity");
        this.f75305a.d(activity);
    }

    public void e(C8951o oVar) {
        C17542s.j(oVar, "navController");
        this.f75306b.a(oVar, rw.c.f28698a.d().a());
    }

    public void f(C8951o oVar) {
        C17542s.j(oVar, "navController");
        this.f75305a.f(oVar);
    }

    public void g(C8951o oVar, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "itemNo");
        this.f75320p.a(oVar, str, Interaction$Component.OFFERS_CAROUSEL);
    }

    public void h(C8951o oVar) {
        C17542s.j(oVar, "navController");
        this.f75321q.b(oVar, a.C2584a.SHOPPING_LIST);
    }

    public void i(C8951o oVar, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "listId");
        C13352d.a.a(this.f75307c, oVar, str, true, (C) null, 8, (Object) null);
    }

    public void j(C8951o oVar, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "storeId");
        this.f75316l.a(oVar, str, "hourly_chart_shortcut");
    }

    public void k(C8951o oVar, String str, String str2) {
        C17542s.j(oVar, "navController");
        C17542s.j(str2, "itemNo");
        ListPickerNavigation.a.a(this.f75319o, oVar, new ListPickerNavigation.Operation.AddOrRemove(str, str2, 0, new ListPickerNavigation.Operation.Analytics(Interaction$Component.OFFERS_CAROUSEL, k.BUTTON), 4, (DefaultConstructorMarker) null), (String) null, 4, (Object) null);
    }

    public void l(C8951o oVar, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "url");
        this.f75314j.a(str, p.INSTORE.j(), oVar);
    }

    public void m(C8951o oVar) {
        C17542s.j(oVar, "navController");
        C13352d.a.b(this.f75307c, oVar, C13349a.STORE, (C) null, 4, (Object) null);
    }

    public void n(C8951o oVar, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "storeId");
        C14445a.C3107a.a(this.f75308d, oVar, str, (C) null, 4, (Object) null);
    }

    public void o(C8951o oVar, c.a aVar, Interaction$Component interaction$Component) {
        C11687b.c cVar;
        C17542s.j(oVar, "navController");
        C17542s.j(aVar, "type");
        C17542s.j(interaction$Component, "component");
        C11687b bVar = this.f75309e;
        int i10 = C1371a.f75322a[aVar.ordinal()];
        if (i10 == 1) {
            cVar = C11687b.c.FAMILY_OFFERS_CATEGORY_ID;
        } else if (i10 == 2) {
            cVar = C11687b.c.NEW_LOWER_PRICE;
        } else if (i10 == 3) {
            cVar = C11687b.c.REDUCED_PRICE_OR_BTI;
        } else {
            throw new t();
        }
        C11687b.C2346b.b(bVar, cVar.b(), (String) null, C11687b.e.CATEGORY, interaction$Component, oVar, C16877v.e(C11687b.d.c.f100629d), (List) null, (String) null, 194, (Object) null);
    }

    public void p(C8951o oVar) {
        C17542s.j(oVar, "navController");
        C13194a.C2742a.a(this.f75311g, oVar, StorageType.LOCAL, (String) null, false, (String) null, (C) null, 60, (Object) null);
    }

    public void q(C8951o oVar, String str, String str2) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "storeId");
        c.a.a(this.f75315k, oVar, str, str2, (C) null, 8, (Object) null);
    }

    public void r(C8951o oVar, l lVar) {
        C17542s.j(oVar, "navController");
        C17542s.j(lVar, "entryPoint");
        this.f75310f.h(oVar, lVar);
    }

    public void s(C8951o oVar, String str, String str2) {
        C17542s.j(oVar, "navController");
        C17542s.j(str2, "storeId");
        this.f75313i.a(oVar, str, new e.a((String) null, str2, e.a.C2437a.STORE_PAGE, 1, (DefaultConstructorMarker) null));
    }
}
