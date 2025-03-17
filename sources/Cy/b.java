package Cy;

import Ae.e;
import Ae.j;
import HJ.C15854t;
import Nd.c;
import Sy.a;
import XH.C16796C;
import XH.t;
import YH.C16877v;
import YH.X;
import aA.C13909a;
import android.app.Activity;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.ingka.ikea.analytics.Interaction$Component;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import rz.C15014g;
import rz.C15031y;
import rz.r;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0001\u0018\u0000 ?2\u00020\u0001:\u0001\u0015B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010$\u001a\u00020\u00122\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170 2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0 2\u0006\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b$\u0010%J#\u0010&\u001a\u00020\u00122\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170 2\u0006\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b(\u0010)J/\u0010/\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00172\u0006\u0010,\u001a\u00020+2\b\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b/\u00100J\u001d\u00102\u001a\u00020\u00122\u0006\u00101\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b4\u0010)J\u001d\u00105\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0012¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\u0012¢\u0006\u0004\b9\u00108J\u0015\u0010;\u001a\u00020\u00122\u0006\u0010:\u001a\u00020+¢\u0006\u0004\b;\u0010<J\u0015\u0010>\u001a\u00020\u00122\u0006\u0010=\u001a\u00020+¢\u0006\u0004\b>\u0010<J\r\u0010?\u001a\u00020\u0012¢\u0006\u0004\b?\u00108J\u0015\u0010A\u001a\u00020\u00122\u0006\u0010@\u001a\u00020+¢\u0006\u0004\bA\u0010<J\r\u0010B\u001a\u00020\u0012¢\u0006\u0004\bB\u00108J\u0015\u0010C\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\bC\u0010)J\u0015\u0010D\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\bD\u0010)J#\u0010E\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00102\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170 ¢\u0006\u0004\bE\u0010FJ\u001d\u0010G\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\bG\u0010HR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010IR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010JR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010KR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010N¨\u0006O"}, d2 = {"LCy/b;", "", "LAe/e;", "analytics", "LIl/a;", "appConfigApi", "LHl/a;", "wifiConnector", "LaA/a;", "sessionManager", "LNd/c;", "abTesting", "<init>", "(LAe/e;LIl/a;LHl/a;LaA/a;LNd/c;)V", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "", "componentValue", "LXH/N;", "c", "(Lcom/ingka/ikea/analytics/Interaction$Component;Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "Lrz/g;", "cartItem", "storeId", "", "b", "(Lrz/g;Ljava/lang/String;)Ljava/util/Map;", "", "w", "(Lrz/g;)D", "", "itemsInCart", "Lrz/r;", "discountsInCart", "m", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "u", "(Ljava/util/List;Ljava/lang/String;)V", "n", "(Ljava/lang/String;)V", "cartItemToRemove", "", "isUnavailable", "LSy/a$b;", "specialType", "q", "(Lrz/g;ZLSy/a$b;Ljava/lang/String;)V", "sortMode", "s", "(Ljava/lang/String;Ljava/lang/String;)V", "j", "i", "(Ljava/lang/String;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "t", "()V", "r", "shownAsCombinedCart", "v", "(Z)V", "isExpanded", "h", "f", "isChecked", "e", "g", "l", "k", "p", "(Ljava/lang/String;Ljava/util/List;)V", "o", "(Ljava/lang/String;Lrz/g;)V", "LAe/e;", "LIl/a;", "LHl/a;", "d", "LaA/a;", "LNd/c;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* renamed from: f  reason: collision with root package name */
    public static final a f108469f = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f108470g = 8;

    /* renamed from: a  reason: collision with root package name */
    private final e f108471a;

    /* renamed from: b  reason: collision with root package name */
    private final Il.a f108472b;

    /* renamed from: c  reason: collision with root package name */
    private final Hl.a f108473c;

    /* renamed from: d  reason: collision with root package name */
    private final C13909a f108474d;

    /* renamed from: e  reason: collision with root package name */
    private final c f108475e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"LCy/b$a;", "", "<init>", "()V", "", "DUAL_CART", "Ljava/lang/String;", "REGULAR_CART", "YES", "NO", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Cy.b$b  reason: collision with other inner class name */
    public /* synthetic */ class C2599b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f108476a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                Hl.a$a[] r0 = Hl.a.C1585a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Hl.a$a r1 = Hl.a.C1585a.CELLULAR     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Hl.a$a r1 = Hl.a.C1585a.WIFI     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Hl.a$a r1 = Hl.a.C1585a.OTHER     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f108476a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Cy.b.C2599b.<clinit>():void");
        }
    }

    public b(e eVar, Il.a aVar, Hl.a aVar2, C13909a aVar3, c cVar) {
        C17542s.j(eVar, "analytics");
        C17542s.j(aVar, "appConfigApi");
        C17542s.j(aVar2, "wifiConnector");
        C17542s.j(aVar3, "sessionManager");
        C17542s.j(cVar, "abTesting");
        this.f108471a = eVar;
        this.f108472b = aVar;
        this.f108473c = aVar2;
        this.f108474d = aVar3;
        this.f108475e = cVar;
    }

    private final String a() {
        int i10 = C2599b.f108476a[this.f108473c.a().ordinal()];
        if (i10 == 1) {
            return "Mobile";
        }
        if (i10 == 2) {
            return "Wi-Fi";
        }
        if (i10 == 3) {
            return "Other";
        }
        throw new t();
    }

    private final Map<String, Object> b(C15014g gVar, String str) {
        return X.m(C16796C.a("store_id", str), C16796C.a("item_id", gVar.g().f()), C16796C.a("fullserve", gVar.d() ? "yes" : "no"), C16796C.a("product_assortment_type", gVar.f().j()), C16796C.a("quantity", Integer.valueOf(gVar.h().c())), C16796C.a("value", Double.valueOf(w(gVar))), C16796C.a("currency", this.f108472b.s().b()));
    }

    private final void c(Interaction$Component interaction$Component, String str) {
        e.c.c(this.f108471a, j.ACTION_TAP.b(), str != null ? X.f(C16796C.a("component_value", str)) : null, interaction$Component, (e.b) null, 8, (Object) null);
    }

    static /* synthetic */ void d(b bVar, Interaction$Component interaction$Component, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        bVar.c(interaction$Component, str);
    }

    private final double w(C15014g gVar) {
        return ((double) gVar.h().c()) * gVar.g().e().g().e().c();
    }

    public final void e(boolean z10) {
        e.c.c(this.f108471a, j.SHOP_AND_GO_TAP.b(), (Map) null, z10 ? Interaction$Component.COWORKER_DISCOUNT_CHECKED : Interaction$Component.COWORKER_DISCOUNT_UNCHECKED, (e.b) null, 10, (Object) null);
    }

    public final void f() {
        e.c.c(this.f108471a, j.SHOP_AND_GO_TAP.b(), (Map) null, Interaction$Component.COWORKER_DISCOUNT_READ_MORE, (e.b) null, 10, (Object) null);
    }

    public final void g() {
        e.c.c(this.f108471a, j.SHOP_AND_GO_TAP.b(), (Map) null, Interaction$Component.COWORKER_DISCOUNT_READ_MORE_CLOSED, (e.b) null, 10, (Object) null);
    }

    public final void h(boolean z10) {
        e.c.c(this.f108471a, j.SHOP_AND_GO_TAP.b(), (Map) null, z10 ? Interaction$Component.COWORKER_DISCOUNT_EXPANDED : Interaction$Component.COWORKER_DISCOUNT_COLLAPSED, (e.b) null, 10, (Object) null);
    }

    public final void i(String str, Interaction$Component interaction$Component) {
        String str2 = str;
        Interaction$Component interaction$Component2 = interaction$Component;
        C17542s.j(str2, "storeId");
        C17542s.j(interaction$Component2, "component");
        Interaction$Component interaction$Component3 = C16877v.e(Interaction$Component.LOGIN_BUTTON).contains(interaction$Component2) ? interaction$Component2 : null;
        if (interaction$Component3 != null) {
            e.c.b(this.f108471a, interaction$Component3, (String) null, (Map) null, (e.b) null, 14, (Object) null);
        } else {
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar : arrayList) {
                if (str3 == null) {
                    String a10 = C11818a.a("Family banner clicked with component " + interaction$Component.getValue(), (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str3 = C11820c.a(a10);
                }
                if (str4 == null) {
                    String name = b.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                bVar.a(eVar, str4, false, (Throwable) null, str3);
            }
        }
        e.c.c(this.f108471a, j.SHOP_AND_GO_TAP.b(), X.f(C16796C.a("store_id", str2)), Interaction$Component.SHOP_AND_GO_FAMILY_BANNER, (e.b) null, 8, (Object) null);
    }

    public final void j(String str) {
        C17542s.j(str, "storeId");
        e.c.c(this.f108471a, j.SHOP_AND_GO_VIEWED.b(), X.f(C16796C.a("store_id", str)), Interaction$Component.SHOP_AND_GO_FAMILY_BANNER, (e.b) null, 8, (Object) null);
    }

    public final void k(String str) {
        C17542s.j(str, "storeId");
        e.c.c(this.f108471a, j.SHOP_AND_GO_TAP.b(), X.f(C16796C.a("store_id", str)), Interaction$Component.FULLSERVE_CART_INFO_ICON, (e.b) null, 8, (Object) null);
    }

    public final void l(String str) {
        C17542s.j(str, "storeId");
        e.c.c(this.f108471a, j.SHOP_AND_GO_VIEWED.b(), X.f(C16796C.a("store_id", str)), Interaction$Component.FULLSERVE_CART_SECTION, (e.b) null, 8, (Object) null);
    }

    public final void m(List<C15014g> list, List<r> list2, String str) {
        List<C15014g> list3 = list;
        List<r> list4 = list2;
        String str2 = str;
        C17542s.j(list3, "itemsInCart");
        C17542s.j(list4, "discountsInCart");
        C17542s.j(str2, "storeId");
        int size = list.size();
        Iterable<C15014g> iterable = list3;
        int i10 = 0;
        for (C15014g h10 : iterable) {
            i10 += h10.h().c();
        }
        double d10 = 0.0d;
        double d11 = 0.0d;
        for (C15014g gVar : iterable) {
            d11 += gVar.g().e().g().e().c() * ((double) gVar.h().c());
        }
        int size2 = list2.size();
        for (r b10 : list4) {
            d10 += b10.b();
        }
        e.c.c(this.f108471a, j.SHOP_AND_GO_TAP.b(), X.m(C16796C.a("store_id", str2), C16796C.a("value", Double.valueOf(d11)), C16796C.a("quantity", Integer.valueOf(i10)), C16796C.a("currency", this.f108472b.s().b()), C16796C.a("discount", Double.valueOf(d10)), C16796C.a("discount_quantity", Integer.valueOf(size2)), C16796C.a("shopgo_article_amt", Integer.valueOf(size)), C16796C.a("connection_type", a()), C16796C.a("is_coworker", Boolean.valueOf(this.f108474d.d()))), Interaction$Component.SHOP_AND_GO_PURCHASE, (e.b) null, 8, (Object) null);
    }

    public final void n(String str) {
        C17542s.j(str, "storeId");
        e.c.c(this.f108471a, j.SHOP_AND_GO_VIEWED.b(), X.f(C16796C.a("store_id", str)), Interaction$Component.SHOP_AND_GO_UNAVAILABLE_ITEMS, (e.b) null, 8, (Object) null);
    }

    public final void o(String str, C15014g gVar) {
        String str2 = str;
        C15014g gVar2 = gVar;
        C17542s.j(str2, "storeId");
        C17542s.j(gVar2, "cartItem");
        e.c.c(this.f108471a, j.SHOP_AND_GO_TAP.b(), b(gVar2, str2), Interaction$Component.SHOP_AND_GO_CART_ITEM_OVERFLOW_MENU, (e.b) null, 8, (Object) null);
        c.a.a(this.f108475e, "shopgo_cart_item_overflow_menu", b(gVar2, str2), (Map) null, 4, (Object) null);
    }

    public final void p(String str, List<C15014g> list) {
        C17542s.j(str, "storeId");
        C17542s.j(list, "itemsInCart");
        e.c.c(this.f108471a, j.SHOP_AND_GO_TAP.b(), X.m(C16796C.a("store_id", str), C16796C.a("connection_type", a())), Interaction$Component.EARLY_PAYMENT_BUTTON, (e.b) null, 8, (Object) null);
        for (C15014g b10 : list) {
            e.c.c(this.f108471a, j.SHOP_AND_GO_PURCHASE_ITEM.b(), b(b10, str), Interaction$Component.EARLY_PAYMENT_BUTTON_ITEM, (e.b) null, 8, (Object) null);
        }
    }

    public final void q(C15014g gVar, boolean z10, a.b bVar, String str) {
        C17542s.j(gVar, "cartItemToRemove");
        C17542s.j(str, "storeId");
        Map p10 = X.p(C16796C.a("store_id", str), C16796C.a("item_id", gVar.g().f()), C16796C.a("product_type", gVar.g().g()), C16796C.a("value", Double.valueOf(gVar.g().e().g().e().c() * ((double) gVar.h().c()))), C16796C.a("quantity", Integer.valueOf(gVar.h().c())), C16796C.a("currency", this.f108472b.s().b()), C16796C.a("product_assortment_type", gVar.f().j()));
        if (bVar != null) {
            p10.put("product_assortment_special_type", bVar.j());
        }
        if (z10) {
            p10.put("component_value", Interaction$Component.SHOP_AND_GO_UNAVAILABLE_ITEM.getValue());
        }
        Map map = p10;
        e.c.c(this.f108471a, j.SHOP_AND_GO_TAP.b(), map, Interaction$Component.SHOP_AND_GO_REMOVE_FROM_CART, (e.b) null, 8, (Object) null);
        c.a.a(this.f108475e, "remove_from_cart", map, (Map) null, 4, (Object) null);
    }

    public final void r() {
        c(Interaction$Component.DUAL_BAG_TOGGLE, "online");
    }

    public final void s(String str, String str2) {
        C17542s.j(str, "sortMode");
        C17542s.j(str2, "storeId");
        e.c.c(this.f108471a, j.SHOP_AND_GO_TAP.b(), X.m(C16796C.a("store_id", str2), C16796C.a("component_value", str)), Interaction$Component.SHOP_AND_GO_SORT_FILTER, (e.b) null, 8, (Object) null);
    }

    public final void t() {
        d(this, Interaction$Component.DUAL_BAG_INFO, (String) null, 2, (Object) null);
    }

    public final void u(List<C15014g> list, String str) {
        boolean z10;
        List<C15014g> list2 = list;
        String str2 = str;
        C17542s.j(list2, "itemsInCart");
        C17542s.j(str2, "storeId");
        Iterable<C15014g> iterable = list2;
        boolean z11 = false;
        int i10 = 0;
        for (C15014g h10 : iterable) {
            i10 += h10.h().c();
        }
        double d10 = 0.0d;
        for (C15014g gVar : iterable) {
            d10 += gVar.g().e().g().e().c() * ((double) gVar.h().c());
        }
        String b10 = this.f108472b.s().b();
        boolean z12 = iterable instanceof Collection;
        if (!z12 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C15014g) it.next()).i() == C15031y.FULL_SERVE) {
                        z10 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z10 = false;
        String b11 = j.SHOP_AND_GO_CART_VIEWED.b();
        Map p10 = X.p(C16796C.a("store_id", str2), C16796C.a("value", Double.valueOf(d10)), C16796C.a("quantity", Integer.valueOf(i10)), C16796C.a("currency", b10));
        if (!z12 || !((Collection) iterable).isEmpty()) {
            Iterator it2 = iterable.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((C15014g) it2.next()).j()) {
                        z11 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z10) {
            p10.put("component_value", z11 ? "unavailable" : "available");
            e.c.c(this.f108471a, b11, p10, Interaction$Component.SHOP_AND_GO_FULLSERVE, (e.b) null, 8, (Object) null);
        } else {
            this.f108471a.track(b11, p10);
        }
        c.a.a(this.f108475e, "shopgo_bag_view", p10, (Map) null, 4, (Object) null);
    }

    public final void v(boolean z10) {
        this.f108471a.e((Activity) null, z10 ? "sg_dual_bag" : "sg_cart");
        if (z10) {
            this.f108471a.track("view_cart", X.m(C16796C.a("component", PlaceTypes.STORE), C16796C.a("is_coworker", Boolean.valueOf(this.f108474d.d()))));
        }
    }
}
