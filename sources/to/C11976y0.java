package to;

import Eg.b;
import Eg.c;
import IC.C13023e;
import IC.C13026h;
import KJ.C15985a;
import KJ.C15990f;
import Nn.C10799b;
import Nn.C10800c;
import Nn.C10810m;
import Nn.C10811n;
import Nn.C10813p;
import Nn.G;
import Nn.M;
import Nn.O;
import Nn.P;
import Nn.u;
import Op.C10828d;
import Op.C10832f;
import RC.m;
import RC.n;
import Ur.a;
import Wn.o;
import YH.C16877v;
import Yn.F;
import bo.f;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.appconfig.model.LocationLatLng;
import go.C11334s;
import go.U;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import jo.C11435a;
import jo.C11436b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kp.C11522d;
import lo.j;
import to.B;
import to.C0;
import to.C11970v0;
import uK.C18146a;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010&R\u0017\u0010-\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u00100\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010,R\u0017\u00104\u001a\u0002018\u0006¢\u0006\f\n\u0004\b\u0018\u00102\u001a\u0004\b\"\u00103R\u0017\u00108\u001a\u0002058\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b.\u00107R\u0017\u0010>\u001a\u0002098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010C\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b\u001c\u0010BR\u0017\u0010I\u001a\u00020D8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010N\u001a\u00020J8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\b\u0010\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8\u0002X\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020[0\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0017\u0010c\u001a\u00020_8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\b)\u0010b¨\u0006d"}, d2 = {"Lto/y0;", "", "<init>", "()V", "", "LNn/m;", "LYn/F;", "k", "(Ljava/util/List;)Ljava/util/List;", "Lkp/d;", "b", "Lkp/d;", "d", "()Lkp/d;", "currencyConfig", "", "c", "Ljava/lang/String;", "getAllowedPaymentMethodsJson", "()Ljava/lang/String;", "allowedPaymentMethodsJson", "LKJ/f;", "Lbo/f$b$a$c$a;", "LKJ/f;", "j", "()LKJ/f;", "transactions", "LRC/m;", "e", "LRC/m;", "g", "()LRC/m;", "priceSummaryData", "Ljo/a;", "f", "Ljo/a;", "deliveryArrangementHolder", "LNn/G;", "LNn/G;", "pickUpPointHolder", "Llo/j;", "h", "Llo/j;", "getDeliveryArrangementHome", "()Llo/j;", "deliveryArrangementHome", "i", "getDeliveryArrangementPickup", "deliveryArrangementPickup", "Ljo/b;", "Ljo/b;", "()Ljo/b;", "deliveryDetailsUiStateHome", "LEg/c$a$c;", "LEg/c$a$c;", "()LEg/c$a$c;", "surveyDetails", "Lgo/U;", "l", "Lgo/U;", "getPickUpPointItem", "()Lgo/U;", "pickUpPointItem", "LWn/o;", "m", "LWn/o;", "()LWn/o;", "deliveryDetailsAnalytics", "Lgo/s;", "n", "Lgo/s;", "getCheckoutProduct", "()Lgo/s;", "checkoutProduct", "Lto/B$a;", "o", "Lto/B$a;", "()Lto/B$a;", "checkoutV2ScreenUiState", "LUr/a$b$a$c;", "p", "LUr/a$b$a$c;", "taxIdOption", "Lto/C0$c;", "q", "Lto/C0$c;", "idRequirementIdMethod", "Lto/C0$b;", "r", "Lto/C0$b;", "fiscalCodeEntry", "Lto/C0$a;", "s", "Ljava/util/List;", "idRequirementCountries", "Lto/C0;", "t", "Lto/C0;", "()Lto/C0;", "requiredIdConfiguration", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: to.y0  reason: case insensitive filesystem */
public final class C11976y0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C11976y0 f103268a;

    /* renamed from: b  reason: collision with root package name */
    private static final C11522d f103269b;

    /* renamed from: c  reason: collision with root package name */
    private static final String f103270c = "  [\n    {\n      \"type\": \"CARD\",\n      \"parameters\": {\n        \"allowedAuthMethods\": [\"PAN_ONLY\", \"CRYPTOGRAM_3DS\"],\n        \"allowedCardNetworks\": [\"AMEX\", \"DISCOVER\", \"JCB\", \"MASTERCARD\", \"VISA\"]\n      },\n      \"tokenizationSpecification\": {\n        \"type\": \"PAYMENT_GATEWAY\",\n        \"parameters\": {\n          \"gateway\": \"example\",\n          \"gatewayMerchantId\": \"exampleGatewayMerchantId\"\n        }\n      }\n    }\n]";

    /* renamed from: d  reason: collision with root package name */
    private static final C15990f<f.b.a.c.C1970a> f103271d = C15985a.b(new f.b.a.c.C1970a.C1971a(19.0d, "23025", "826992344", "2020-01-01"), new f.b.a.c.C1970a.C1972b("Some code"));

    /* renamed from: e  reason: collision with root package name */
    private static final m f103272e;

    /* renamed from: f  reason: collision with root package name */
    private static final C11435a f103273f;

    /* renamed from: g  reason: collision with root package name */
    private static final G f103274g;

    /* renamed from: h  reason: collision with root package name */
    private static final j f103275h;

    /* renamed from: i  reason: collision with root package name */
    private static final j f103276i;

    /* renamed from: j  reason: collision with root package name */
    private static final C11436b f103277j;

    /* renamed from: k  reason: collision with root package name */
    private static final c.a.C0984c f103278k = new c.a.C0984c(new b("Some survey id", (String) null, "Some title", "Some description", C16877v.q(new b.a("id1", "title1", 0, 3), new b.a("id2", "title2", 0, 3)), Interaction$Component.CHECKOUT_SURVEY, 0, 66, (DefaultConstructorMarker) null), new Eg.a((Cg.a) null, (Map) null, false, false, 15, (DefaultConstructorMarker) null), (Integer) null, true);

    /* renamed from: l  reason: collision with root package name */
    private static final U f103279l;

    /* renamed from: m  reason: collision with root package name */
    private static final o f103280m = new a();

    /* renamed from: n  reason: collision with root package name */
    private static final C11334s f103281n = new C11334s("12345", "Some title", "Some description", new C10828d.C1720d((String) null, (String) null), C13026h.c("Antal: 1"), C15985a.a(), (C13023e) null, 64, (DefaultConstructorMarker) null);

    /* renamed from: o  reason: collision with root package name */
    private static final B.a f103282o = new B.a(new B.a.C2452a(new n.b(C13026h.c("123:-")), C16877v.e(new B.a.C2452a.C2453a("Delivery ID", new B.a.C2452a.C2453a.C2454a(C13026h.c("Home delivery"), C13026h.c("collapsedDeliveryInformation"), C18146a.f148352a2), new B.a.C2452a.C2453a.C2454a(C13026h.c("21. sep. 10:30 - 12:30"), C13026h.c("Some description"), C18146a.f148290W0), C16877v.n()))), C16877v.q(new C11938f("TERMS_AND_CONDITIONS_ID", false, C13026h.c("Checkout terms and conditions"), "https://www.ikea.com/checkout-terms-and-conditions"), new C11938f("PRIVACY_POLICY_ID", false, C13026h.c("Privacy policy"), "https://www.ikea.com/privacy-policy")), (C0) null, new C11970v0(false, "  [\n    {\n      \"type\": \"CARD\",\n      \"parameters\": {\n        \"allowedAuthMethods\": [\"PAN_ONLY\", \"CRYPTOGRAM_3DS\"],\n        \"allowedCardNetworks\": [\"AMEX\", \"DISCOVER\", \"JCB\", \"MASTERCARD\", \"VISA\"]\n      },\n      \"tokenizationSpecification\": {\n        \"type\": \"PAYMENT_GATEWAY\",\n        \"parameters\": {\n          \"gateway\": \"example\",\n          \"gatewayMerchantId\": \"exampleGatewayMerchantId\"\n        }\n      }\n    }\n]", new C11970v0.a(C16877v.n(), C16877v.n())), (C13023e) null, (B.c) null, 52, (DefaultConstructorMarker) null);

    /* renamed from: p  reason: collision with root package name */
    private static final a.b.C1860a.c f103283p;

    /* renamed from: q  reason: collision with root package name */
    private static final C0.c f103284q;

    /* renamed from: r  reason: collision with root package name */
    private static final C0.b f103285r;

    /* renamed from: s  reason: collision with root package name */
    private static final List<C0.a> f103286s;

    /* renamed from: t  reason: collision with root package name */
    private static final C0 f103287t;

    /* renamed from: u  reason: collision with root package name */
    public static final int f103288u = 8;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"to/y0$a", "LWn/o;", "", "editParam", "LXH/N;", "b", "(Ljava/lang/String;)V", "a", "()V", "transportType", "LNn/c;", "capability", "c", "(Ljava/lang/String;LNn/c;)V", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: to.y0$a */
    public static final class a implements o {
        a() {
        }

        public void a() {
        }

        public void b(String str) {
            C17542s.j(str, "editParam");
        }

        public void c(String str, C10800c cVar) {
            C17542s.j(str, "transportType");
            C17542s.j(cVar, "capability");
        }
    }

    static {
        C11976y0 y0Var = new C11976y0();
        f103268a = y0Var;
        C11522d a10 = C10832f.f85163a.a();
        f103269b = a10;
        f103272e = new m((C13023e) null, new m.c(C13026h.c("Some product summary title"), (String) null, C16877v.e(new m.c.a(C13026h.c("Product price"), "100 kr"))), new m.c(C13026h.c("Delivery"), "10€", C16877v.n()), (m.c) null, (m.c) null, (m.c) null, new m.d(C13026h.c("Total price"), new n.a(new qx.c("10", (String) null), a10), C16877v.n()), (C13023e) null, (m.b) null, (C13023e) null, new m.c((C13023e) null, (String) null, C16877v.e(new m.c.a(C13026h.c("VISA"), "10€"))), (m.a) null, 256, (DefaultConstructorMarker) null);
        P p10 = P.TRUCK;
        List e10 = C16877v.e(new C10810m("555666", (Integer) null, (Integer) null));
        Date time = new GregorianCalendar(2018, 8, 20, 10, 30).getTime();
        C17542s.i(time, "getTime(...)");
        Date time2 = new GregorianCalendar(2018, 8, 20, 12, 30).getTime();
        C17542s.i(time2, "getTime(...)");
        M m10 = new M(time, time2, "123457", C16877v.n(), new C10811n(Double.valueOf(10.0d), Double.valueOf(8.0d)), false);
        Date time3 = new GregorianCalendar(2018, 9, 20, 10, 30).getTime();
        C17542s.i(time3, "getTime(...)");
        Date time4 = new GregorianCalendar(2018, 9, 20, 12, 30).getTime();
        C17542s.i(time4, "getTime(...)");
        M m11 = new M(time3, time4, "random del id", C16877v.n(), (C10811n) null, false);
        Date time5 = new GregorianCalendar(2018, 9, 21, 10, 30).getTime();
        C17542s.i(time5, "getTime(...)");
        Date time6 = new GregorianCalendar(2018, 9, 21, 12, 30).getTime();
        C17542s.i(time6, "getTime(...)");
        C11435a aVar = new C11435a("TRUCK ID", p10, e10, m10, new O((String) null, C16877v.q(m11, new M(time5, time6, "random del id", C16877v.n(), (C10811n) null, false)), (M) null, true), "21. sep. 10:30 - 12:30", "collapsedDeliveryInformation", (G) null, (C13023e) null);
        f103273f = aVar;
        G g10 = new G("identifier", "ICA Supermarket", (C10811n) null, new C10799b("Älmhultsvägen 1", "21212", "Malmö", (LocationLatLng) null), C16877v.n(), "12345", (Double) null, (M) null, G.b.YES);
        f103274g = g10;
        C10813p pVar = C10813p.HOME;
        u uVar = u.STANDARD;
        j jVar = new j("selectedDeliveryServiceId 1", pVar, uVar, aVar, 1, 1, false, true, new j.a(C13026h.c("Home location title"), C13026h.c("Home location label"), false));
        f103275h = jVar;
        f103276i = new j("selectedDeliveryServiceId 2", C10813p.PICKUP, uVar, C11435a.b(aVar, (String) null, (P) null, (List) null, (M) null, (O) null, (String) null, (String) null, g10, (C13023e) null, 383, (Object) null), 1, 1, false, true, new j.a(C13026h.c("Pickup location title"), C13026h.c("Pickup location label"), true));
        n.b bVar = new n.b(C13026h.c("123 kr"));
        n.b bVar2 = bVar;
        f103277j = new C11436b(bVar2, C16877v.e(jVar), true, y0Var.k(jVar.a().f()), false);
        f103279l = new U(g10, false, false, "Some address", 0, false, new n.a(new qx.c("250", "0"), a10));
        a.b.C1860a.c cVar = new a.b.C1860a.c("Passport", "PASSPORT_ID_CARD", "[A-Za-z0-9]{0,28}", true, true);
        f103283p = cVar;
        C0.c cVar2 = new C0.c(cVar.a(), cVar.d(), cVar.b(), cVar.c());
        f103284q = cVar2;
        C0.b bVar3 = new C0.b("Fiscal code", "Invalid fiscal code", new C11974x0());
        f103285r = bVar3;
        List<C0.a> q10 = C16877v.q(new C0.a("Sweden", "SE"), new C0.a("Spain", "ES"));
        f103286s = q10;
        f103287t = new C0(bVar3, C16877v.e(cVar2), q10, j1.a(C16877v.e(cVar)), C13026h.c("Type of identification"));
    }

    private C11976y0() {
    }

    /* access modifiers changed from: private */
    public static final boolean b(String str) {
        C17542s.j(str, "it");
        return true;
    }

    private final List<F> k(List<C10810m> list) {
        Iterable<C10810m> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C10810m b10 : iterable) {
            arrayList.add(new F(b10.b(), 1, "image url"));
        }
        return arrayList;
    }

    public final B.a c() {
        return f103282o;
    }

    public final C11522d d() {
        return f103269b;
    }

    public final o e() {
        return f103280m;
    }

    public final C11436b f() {
        return f103277j;
    }

    public final m g() {
        return f103272e;
    }

    public final C0 h() {
        return f103287t;
    }

    public final c.a.C0984c i() {
        return f103278k;
    }

    public final C15990f<f.b.a.c.C1970a> j() {
        return f103271d;
    }
}
