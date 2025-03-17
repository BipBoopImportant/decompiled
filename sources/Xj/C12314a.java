package xj;

import Ae.e;
import Ae.j;
import Il.a;
import Nd.c;
import Sy.a;
import Tj.D;
import XH.C16807N;
import YH.X;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.app.base.ProductKey;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rz.C15031y;
import rz.I;
import rz.O;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 (2\u00020\u0001:\u0001\u001fB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J/\u0010!\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lxj/a;", "", "LAe/e;", "analytics", "LNd/c;", "abTesting", "LIl/a;", "appConfigApi", "LHl/a;", "iWifiConnector", "<init>", "(LAe/e;LNd/c;LIl/a;LHl/a;)V", "Lcom/ingka/ikea/app/base/ProductKey;", "productKey", "Lrz/y;", "productPickupType", "", "isPartiallyUnavailable", "LXH/N;", "b", "(Lcom/ingka/ikea/app/base/ProductKey;Lrz/y;Z)V", "Lrz/I;", "scanAndGoProduct", "", "quantity", "LSy/a$b;", "productAssortmentSpecialType", "", "storeId", "Lrz/O;", "scanType", "a", "(Lrz/I;ILSy/a$b;Ljava/lang/String;Lrz/O;)V", "c", "(Lrz/I;Ljava/lang/String;Lrz/O;LSy/a$b;)V", "LAe/e;", "LNd/c;", "LIl/a;", "d", "LHl/a;", "e", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xj.a  reason: case insensitive filesystem */
public final class C12314a {

    /* renamed from: e  reason: collision with root package name */
    public static final C2517a f105996e = new C2517a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f105997f = 8;

    /* renamed from: a  reason: collision with root package name */
    private final e f105998a;

    /* renamed from: b  reason: collision with root package name */
    private final c f105999b;

    /* renamed from: c  reason: collision with root package name */
    private final a f106000c;

    /* renamed from: d  reason: collision with root package name */
    private final Hl.a f106001d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lxj/a$a;", "", "<init>", "()V", "", "YES", "Ljava/lang/String;", "NO", "SCO", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xj.a$a  reason: collision with other inner class name */
    public static final class C2517a {
        public /* synthetic */ C2517a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2517a() {
        }
    }

    public C12314a(e eVar, c cVar, a aVar, Hl.a aVar2) {
        C17542s.j(eVar, "analytics");
        C17542s.j(cVar, "abTesting");
        C17542s.j(aVar, "appConfigApi");
        C17542s.j(aVar2, "iWifiConnector");
        this.f105998a = eVar;
        this.f105999b = cVar;
        this.f106000c = aVar;
        this.f106001d = aVar2;
    }

    public final void a(I i10, int i11, a.b bVar, String str, O o10) {
        String str2 = str;
        C17542s.j(i10, "scanAndGoProduct");
        C17542s.j(str2, "storeId");
        C17542s.j(o10, "scanType");
        ProductKey l10 = i10.l();
        e eVar = this.f105998a;
        String b10 = j.SHOP_AND_GO_TAP.b();
        Map c10 = X.c();
        c10.put("store_id", str2);
        c10.put("item_id", l10.getProductNo());
        c10.put("fullserve", D.a(i10.p()).m());
        c10.put("product_type", l10.getProductType());
        c10.put("value", Double.valueOf(((double) i11) * i10.k().e().g().e().c()));
        c10.put("quantity", Integer.valueOf(i11));
        c10.put("currency", this.f106000c.s().b());
        c10.put("stock_quantity", Integer.valueOf(i10.m().b()));
        c10.put("product_assortment_type", D.a(i10.p()).j());
        String b11 = o10.b();
        if (b11 == null) {
            b11 = "manual_input";
        }
        c10.put("barcode_type", b11);
        if (bVar != null) {
            c10.put("product_assortment_special_type", bVar.j());
        }
        C16807N n10 = C16807N.f139792a;
        e.c.c(eVar, b10, X.b(c10), Interaction$Component.SHOP_AND_GO_ADD_TO_CART, (e.b) null, 8, (Object) null);
        c.a.a(this.f105999b, "shopgo_tap_add_to_cart", (Map) null, (Map) null, 6, (Object) null);
    }

    public final void b(ProductKey productKey, C15031y yVar, boolean z10) {
        String str;
        C17542s.j(productKey, "productKey");
        C17542s.j(yVar, "productPickupType");
        if (yVar == C15031y.COMBINATION) {
            str = "SCO";
        } else {
            str = productKey.getProductType().toUpperCase(Locale.ROOT);
            C17542s.i(str, "toUpperCase(...)");
        }
        e eVar = this.f105998a;
        String b10 = j.SHOP_AND_GO_VIEWED.b();
        Map c10 = X.c();
        c10.put("item_id", productKey.getProductNo());
        c10.put("app_location", a.e.SHOP_GO_PIP.b());
        c10.put("product_type", str);
        c10.put("product_assortment_type", D.a(yVar).j());
        c10.put("partial_availability", z10 ? "yes" : "no");
        C16807N n10 = C16807N.f139792a;
        e.c.c(eVar, b10, X.b(c10), Interaction$Component.SHOP_AND_GO_UNAVAILABLE_ITEMS, (e.b) null, 8, (Object) null);
    }

    public final void c(I i10, String str, O o10, a.b bVar) {
        C17542s.j(i10, "scanAndGoProduct");
        C17542s.j(str, "storeId");
        C17542s.j(o10, "scanType");
        ProductKey l10 = i10.l();
        double c10 = i10.k().e().g().e().c() * ((double) i10.m().c());
        a.c a10 = D.a(i10.p());
        e eVar = this.f105998a;
        String b10 = j.SHOP_AND_GO_VIEW_ITEM.b();
        Map c11 = X.c();
        c11.put("store_id", str);
        c11.put("item_id", l10.getProductNo());
        c11.put("fullserve", a10.m());
        c11.put("product_type", l10.getProductType());
        c11.put("value", Double.valueOf(c10));
        c11.put("stock_quantity", Integer.valueOf(i10.m().b()));
        c11.put("quantity", Integer.valueOf(i10.m().c()));
        c11.put("currency", this.f106000c.s().b());
        c11.put("connection_type", this.f106001d.a().b());
        c11.put("product_assortment_type", a10.j());
        if (bVar != null) {
            c11.put("product_assortment_special_type", bVar.j());
        }
        String b11 = o10.b();
        if (b11 == null) {
            b11 = "manual_input";
        }
        c11.put("barcode_type", b11);
        C16807N n10 = C16807N.f139792a;
        e.c.c(eVar, b10, X.b(c11), o10 == O.MANUAL_INPUT ? Interaction$Component.SHOP_AND_GO_MANUAL_ENTRY : Interaction$Component.SHOP_AND_GO_SCANNER, (e.b) null, 8, (Object) null);
    }
}
