package aj;

import Ae.e;
import Ae.j;
import Kj.a;
import Nd.c;
import Sy.a;
import XH.C16796C;
import XH.C16807N;
import XH.t;
import XH.v;
import YH.X;
import aA.C13909a;
import android.app.Activity;
import com.ingka.ikea.analytics.Interaction$Component;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ne.C10089a;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0016B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0015*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010 \u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u0012¢\u0006\u0004\b \u0010!J+\u0010#\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u001c¢\u0006\u0004\b%\u0010&JA\u0010*\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010)\u001a\u0004\u0018\u00010\u000f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u001c¢\u0006\u0004\b0\u0010&J3\u00101\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a2\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b1\u00102J)\u00104\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u00103\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b4\u00105J)\u00106\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u00103\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b6\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00109R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u0010:R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u0010;¨\u0006<"}, d2 = {"Laj/c;", "", "LAe/e;", "analytics", "LIl/a;", "appConfigApi", "Lne/a;", "adjustTracker", "LNd/c;", "abTesting", "LaA/a;", "sessionManager", "<init>", "(LAe/e;LIl/a;Lne/a;LNd/c;LaA/a;)V", "LKj/a$c$a$b;", "", "b", "(LKj/a$c$a$b;)Ljava/lang/String;", "Laj/a;", "storeId", "transactionId", "", "a", "(Laj/a;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;", "", "totalDiscounts", "", "purchaseItems", "LXH/N;", "f", "(Ljava/lang/String;Ljava/lang/String;DLjava/util/List;)V", "purchaseItem", "g", "(Ljava/lang/String;Ljava/lang/String;Laj/a;)V", "items", "h", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "j", "()V", "LKj/a$c$a;", "pickupInformation", "currentTimeSlotId", "l", "(Ljava/lang/String;LKj/a$c$a;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "LSy/a$e;", "appLocation", "i", "(LSy/a$e;)V", "e", "k", "(Ljava/lang/String;LKj/a$c$a$b;Ljava/util/List;Ljava/lang/String;)V", "timeSlotId", "d", "(Ljava/lang/String;LKj/a$c$a;Ljava/lang/String;)V", "c", "LAe/e;", "LIl/a;", "Lne/a;", "LNd/c;", "LaA/a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: aj.c  reason: case insensitive filesystem */
public final class C11063c {

    /* renamed from: f  reason: collision with root package name */
    public static final a f90272f = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f90273g = 8;

    /* renamed from: a  reason: collision with root package name */
    private final e f90274a;

    /* renamed from: b  reason: collision with root package name */
    private final Il.a f90275b;

    /* renamed from: c  reason: collision with root package name */
    private final C10089a f90276c;

    /* renamed from: d  reason: collision with root package name */
    private final c f90277d;

    /* renamed from: e  reason: collision with root package name */
    private final C13909a f90278e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Laj/c$a;", "", "<init>", "()V", "", "VIEW_NAME_CHECKOUT", "Ljava/lang/String;", "VIEW_NAME_PAYMENT_IN_PROGRESS", "VIEW_NAME_EXIT_CODE", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: aj.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C11063c(e eVar, Il.a aVar, C10089a aVar2, c cVar, C13909a aVar3) {
        C17542s.j(eVar, "analytics");
        C17542s.j(aVar, "appConfigApi");
        C17542s.j(aVar2, "adjustTracker");
        C17542s.j(cVar, "abTesting");
        C17542s.j(aVar3, "sessionManager");
        this.f90274a = eVar;
        this.f90275b = aVar;
        this.f90276c = aVar2;
        this.f90277d = cVar;
        this.f90278e = aVar3;
    }

    private final Map<String, String> a(C11061a aVar, String str, String str2) {
        return X.m(C16796C.a("store_id", str), C16796C.a("item_id", aVar.a()), C16796C.a("value", String.valueOf(aVar.g())), C16796C.a("quantity", String.valueOf(aVar.e())), C16796C.a("currency", this.f90275b.s().b()), C16796C.a("transaction_id", str2), C16796C.a("fullserve", aVar.f() ? "yes" : "no"), C16796C.a("product_assortment_type", aVar.c().j()));
    }

    private final String b(a.c.C1636a.b bVar) {
        String c10 = bVar.c();
        String b10 = bVar.b();
        return c10 + " - " + b10;
    }

    public final void c(String str, a.c.C1636a aVar, String str2) {
        String str3 = str;
        a.c.C1636a aVar2 = aVar;
        C17542s.j(str3, "storeId");
        if (aVar2 instanceof a.c.C1636a.C1637a) {
            e.c.c(this.f90274a, j.SHOP_AND_GO_TAP.b(), X.m(C16796C.a("store_id", str3), C16796C.a("order_no", ((a.c.C1636a.C1637a) aVar2).a())), Interaction$Component.FULLSERVE_PAYMENT_COMPLETED_CTA_BUTTON, (e.b) null, 8, (Object) null);
        } else if (aVar2 instanceof a.c.C1636a.b) {
            Interaction$Component interaction$Component = str2 == null ? Interaction$Component.PAYMENT_COMPLETED_PREVIOUS_ORDER_DETAILS : Interaction$Component.PAYMENT_COMPLETED_CURRENT_ORDER_DETAILS_CTA_BUTTON;
            e eVar = this.f90274a;
            String b10 = j.SHOP_AND_GO_TAP.b();
            v a10 = C16796C.a("store_id", str3);
            a.c.C1636a.b bVar = (a.c.C1636a.b) aVar2;
            v a11 = C16796C.a("order_no", bVar.a());
            String lowerCase = bVar.d().j().toLowerCase(Locale.ROOT);
            C17542s.i(lowerCase, "toLowerCase(...)");
            e.c.c(eVar, b10, X.m(a10, a11, C16796C.a("order_status", lowerCase), C16796C.a("collection_time", b(bVar))), interaction$Component, (e.b) null, 8, (Object) null);
        } else if (aVar2 == null) {
            e.c.c(this.f90274a, j.SHOP_AND_GO_TAP.b(), X.f(C16796C.a("store_id", str3)), Interaction$Component.PAYMENT_COMPLETED_CTA_BUTTON, (e.b) null, 8, (Object) null);
        } else {
            throw new t();
        }
    }

    public final void d(String str, a.c.C1636a aVar, String str2) {
        String str3 = str;
        a.c.C1636a aVar2 = aVar;
        C17542s.j(str3, "storeId");
        if (aVar2 instanceof a.c.C1636a.C1637a) {
            e.c.c(this.f90274a, j.SHOP_AND_GO_TAP.b(), X.m(C16796C.a("store_id", str3), C16796C.a("order_no", ((a.c.C1636a.C1637a) aVar2).a())), Interaction$Component.FULLSERVE_PAYMENT_COMPLETED_CLOSE_BUTTON, (e.b) null, 8, (Object) null);
        } else if (aVar2 instanceof a.c.C1636a.b) {
            Interaction$Component interaction$Component = str2 == null ? Interaction$Component.PAYMENT_COMPLETED_PREVIOUS_ORDER_DETAILS_CLOSE_BUTTON : Interaction$Component.PAYMENT_COMPLETED_CURRENT_ORDER_DETAILS_CLOSE_BUTTON;
            e eVar = this.f90274a;
            String b10 = j.SHOP_AND_GO_TAP.b();
            v a10 = C16796C.a("store_id", str3);
            a.c.C1636a.b bVar = (a.c.C1636a.b) aVar2;
            v a11 = C16796C.a("order_no", bVar.a());
            String lowerCase = bVar.d().j().toLowerCase(Locale.ROOT);
            C17542s.i(lowerCase, "toLowerCase(...)");
            e.c.c(eVar, b10, X.m(a10, a11, C16796C.a("order_status", lowerCase), C16796C.a("collection_time", b(bVar))), interaction$Component, (e.b) null, 8, (Object) null);
        } else if (aVar2 == null) {
            e.c.c(this.f90274a, j.SHOP_AND_GO_TAP.b(), X.f(C16796C.a("store_id", str3)), Interaction$Component.PAYMENT_COMPLETED_CLOSE_BUTTON, (e.b) null, 8, (Object) null);
        } else {
            throw new t();
        }
    }

    public final void e() {
        this.f90274a.e((Activity) null, "sg_payment_in_progress");
    }

    public final void f(String str, String str2, double d10, List<C11061a> list) {
        String str3 = str;
        String str4 = str2;
        List<C11061a> list2 = list;
        C17542s.j(str3, "storeId");
        C17542s.j(str4, "transactionId");
        C17542s.j(list2, "purchaseItems");
        Iterable<C11061a> iterable = list2;
        int i10 = 0;
        for (C11061a e10 : iterable) {
            i10 += e10.e();
        }
        double d11 = 0.0d;
        for (C11061a g10 : iterable) {
            d11 += g10.g();
        }
        this.f90274a.track(j.SHOP_AND_GO_PURCHASE.b(), X.m(C16796C.a("store_id", str3), C16796C.a("value", Double.valueOf(d11)), C16796C.a("quantity", Integer.valueOf(i10)), C16796C.a("currency", this.f90275b.s().b()), C16796C.a("transaction_id", str4), C16796C.a("discount", Double.valueOf(d10)), C16796C.a("is_coworker", Boolean.valueOf(this.f90278e.d()))));
        this.f90276c.a(new C11064d(str4, d11));
        this.f90277d.a(d11, list.size(), str2, c.b.SHOP_GO);
    }

    public final void g(String str, String str2, C11061a aVar) {
        C17542s.j(str, "storeId");
        C17542s.j(str2, "transactionId");
        C17542s.j(aVar, "purchaseItem");
        e eVar = this.f90274a;
        String b10 = j.SHOP_AND_GO_PURCHASE_ITEM.b();
        Map p10 = X.p(C16796C.a("store_id", str), C16796C.a("item_id", aVar.a()), C16796C.a("product_type", aVar.d()), C16796C.a("value", Double.valueOf(aVar.g())), C16796C.a("quantity", Integer.valueOf(aVar.e())), C16796C.a("currency", this.f90275b.s().b()), C16796C.a("transaction_id", str2), C16796C.a("fullserve", aVar.f() ? "yes" : "no"), C16796C.a("product_assortment_type", aVar.c().j()));
        a.b b11 = aVar.b();
        if (b11 != null) {
            p10.put("product_assortment_special_type", b11.j());
        }
        C16807N n10 = C16807N.f139792a;
        eVar.track(b10, p10);
    }

    public final void h(String str, String str2, List<C11061a> list) {
        C17542s.j(str, "storeId");
        C17542s.j(str2, "transactionId");
        C17542s.j(list, "items");
        for (C11061a g10 : list) {
            g(str, str2, g10);
        }
    }

    public final void i(a.e eVar) {
        C17542s.j(eVar, "appLocation");
        e eVar2 = this.f90274a;
        Interaction$Component interaction$Component = Interaction$Component.FAMILY_CARD;
        e.c.b(eVar2, interaction$Component, (String) null, X.m(C16796C.a("component_value", interaction$Component.getValue()), C16796C.a("app_location", eVar.b())), (e.b) null, 10, (Object) null);
    }

    public final void j() {
        this.f90274a.e((Activity) null, "sg_checkout");
    }

    public final void k(String str, a.c.C1636a.b bVar, List<C11061a> list, String str2) {
        C17542s.j(str, "storeId");
        C17542s.j(bVar, "pickupInformation");
        C17542s.j(list, "purchaseItems");
        C17542s.j(str2, "transactionId");
        String lowerCase = bVar.d().j().toLowerCase(Locale.ROOT);
        C17542s.i(lowerCase, "toLowerCase(...)");
        String b10 = b(bVar);
        e.c.c(this.f90274a, j.SHOP_AND_GO_VIEWED.b(), X.m(C16796C.a("store_id", str), C16796C.a("order_no", bVar.a()), C16796C.a("order_status", lowerCase), C16796C.a("collection_time", b10)), Interaction$Component.FULLSERVE_EARLY_PAYMENT_COMPLETED, (e.b) null, 8, (Object) null);
        for (C11061a a10 : list) {
            Map p10 = X.p(C16796C.a("collection_time", b10));
            p10.putAll(a(a10, str, str2));
            e.c.c(this.f90274a, j.SHOP_AND_GO_PURCHASE_ITEM.b(), p10, Interaction$Component.FULLSERVE_EARLY_PAYMENT_COMPLETED_ITEM, (e.b) null, 8, (Object) null);
        }
    }

    public final void l(String str, a.c.C1636a aVar, String str2, List<C11061a> list, String str3) {
        String str4 = str;
        a.c.C1636a aVar2 = aVar;
        List<C11061a> list2 = list;
        C17542s.j(str4, "storeId");
        C17542s.j(list2, "purchaseItems");
        this.f90274a.e((Activity) null, "sg_post_purchase");
        e eVar = this.f90274a;
        j jVar = j.SHOP_AND_GO_VIEWED;
        e.c.c(eVar, jVar.b(), X.f(C16796C.a("store_id", str4)), Interaction$Component.SHOP_AND_EXIT_QR_CODE, (e.b) null, 8, (Object) null);
        if (aVar2 instanceof a.c.C1636a.C1637a) {
            e.c.c(this.f90274a, jVar.b(), X.m(C16796C.a("store_id", str4), C16796C.a("order_no", ((a.c.C1636a.C1637a) aVar2).a())), Interaction$Component.FULLSERVE_PAYMENT_COMPLETED, (e.b) null, 8, (Object) null);
            for (C11061a a10 : list2) {
                e.c.c(this.f90274a, j.SHOP_AND_GO_PURCHASE_ITEM.b(), a(a10, str4, str3 == null ? "" : str3), Interaction$Component.FULLSERVE_PAYMENT_COMPLETED_ITEM, (e.b) null, 8, (Object) null);
            }
        } else if (aVar2 instanceof a.c.C1636a.b) {
            Interaction$Component interaction$Component = str2 == null ? Interaction$Component.PAYMENT_COMPLETED_PREVIOUS_ORDER_DETAILS : Interaction$Component.PAYMENT_COMPLETED_CURRENT_ORDER_DETAILS;
            e eVar2 = this.f90274a;
            String b10 = jVar.b();
            v a11 = C16796C.a("store_id", str4);
            a.c.C1636a.b bVar = (a.c.C1636a.b) aVar2;
            v a12 = C16796C.a("order_no", bVar.a());
            String lowerCase = bVar.d().j().toLowerCase(Locale.ROOT);
            C17542s.i(lowerCase, "toLowerCase(...)");
            Object obj = "collection_time";
            e.c.c(eVar2, b10, X.m(a11, a12, C16796C.a("order_status", lowerCase), C16796C.a("collection_time", b(bVar))), interaction$Component, (e.b) null, 8, (Object) null);
            for (C11061a aVar3 : list2) {
                Map p10 = X.p(C16796C.a(obj, b(bVar)));
                p10.putAll(a(aVar3, str4, str3 == null ? "" : str3));
                e.c.c(this.f90274a, j.SHOP_AND_GO_PURCHASE_ITEM.b(), p10, interaction$Component, (e.b) null, 8, (Object) null);
            }
        } else if (aVar2 == null) {
            e.c.c(this.f90274a, jVar.b(), X.f(C16796C.a("store_id", str4)), Interaction$Component.PAYMENT_COMPLETED, (e.b) null, 8, (Object) null);
            for (C11061a a13 : list2) {
                e.c.c(this.f90274a, j.SHOP_AND_GO_PURCHASE_ITEM.b(), a(a13, str4, str3 == null ? "" : str3), Interaction$Component.PAYMENT_COMPLETED_ITEM, (e.b) null, 8, (Object) null);
            }
        } else {
            throw new t();
        }
    }
}
