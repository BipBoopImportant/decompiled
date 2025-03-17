package tt;

import Ae.e;
import Ae.g;
import Ae.j;
import Nd.c;
import XH.C16796C;
import XH.t;
import YH.X;
import com.ingka.ikea.analytics.Interaction$Component;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import on.C11687b;
import tt.C11991a;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 32\u00020\u0001:\u0001!B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0011H\u0016¢\u0006\u0004\b \u0010\u0015J\u000f\u0010!\u001a\u00020\u0011H\u0016¢\u0006\u0004\b!\u0010\u0015J1\u0010'\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010\f2\u0006\u0010#\u001a\u00020\b2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0011H\u0016¢\u0006\u0004\b)\u0010\u0015J\u000f\u0010*\u001a\u00020\u0011H\u0016¢\u0006\u0004\b*\u0010\u0015J\u0017\u0010,\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b.\u0010/J/\u00101\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u00100\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b1\u00102J/\u00103\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u00102J\u001d\u00106\u001a\u00020\u00112\f\u00105\u001a\b\u0012\u0004\u0012\u00020\f04H\u0016¢\u0006\u0004\b6\u00107J\u001f\u0010:\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\f2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0011H\u0016¢\u0006\u0004\b<\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010=R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010>¨\u0006?"}, d2 = {"Ltt/b;", "Ltt/a;", "LAe/e;", "analytics", "LNd/c;", "abTesting", "<init>", "(LAe/e;LNd/c;)V", "", "isGuest", "isFamilyMember", "storeModeEnabled", "", "r", "(ZZZ)Ljava/lang/String;", "Ltt/a$a;", "origin", "LXH/N;", "o", "(Ltt/a$a;)V", "p", "()V", "Ltt/a$f;", "type", "j", "(Ltt/a$f;)V", "Ltt/a$b;", "g", "(Ltt/a$b;)V", "Ltt/a$c;", "m", "(Ltt/a$c;)V", "i", "a", "orderId", "storeOpen", "Ltt/a$d;", "location", "storeId", "l", "(Ljava/lang/String;ZLtt/a$d;Ljava/lang/String;)V", "h", "q", "Ltt/a$g;", "n", "(Ltt/a$g;)V", "e", "(Ljava/lang/String;)V", "isFamily", "d", "(Ljava/lang/String;ZZZ)V", "c", "", "itemNos", "f", "(Ljava/util/List;)V", "Ltt/a$e;", "componentValue", "k", "(Ljava/lang/String;Ltt/a$e;)V", "b", "LAe/e;", "LNd/c;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: tt.b  reason: case insensitive filesystem */
public final class C11992b implements C11991a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f103411c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f103412d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final e f103413a;

    /* renamed from: b  reason: collision with root package name */
    private final c f103414b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Ltt/b$a;", "", "<init>", "()V", "", "VALUE_GUEST_JOIN_IN_STORE", "Ljava/lang/String;", "VALUE_GUEST_JOIN_AT_HOME", "VALUE_REGULAR_JOIN_IN_STORE", "VALUE_REGULAR_JOIN_AT_HOME", "VALUE_FAMILY_BEVERAGE_IN_STORE", "VALUE_FAMILY_BEVERAGE_AT_HOME", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: tt.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C11992b(e eVar, c cVar) {
        C17542s.j(eVar, "analytics");
        C17542s.j(cVar, "abTesting");
        this.f103413a = eVar;
        this.f103414b = cVar;
    }

    private final String r(boolean z10, boolean z11, boolean z12) {
        return (!z10 || !z12) ? z10 ? "guest_user_join_ikea_family_home" : (!z11 || !z12) ? z11 ? "free_beverage_home" : (z10 || !z12) ? "regular_user_join_ikea_family_home" : "regular_user_join_ikea_family_store" : "free_beverage_store" : "guest_user_join_ikea_family_store";
    }

    public void a() {
        e.c.b(this.f103413a, Interaction$Component.LOGIN_BUTTON, (String) null, X.f(C16796C.a("app_location", "store_page")), (e.b) null, 10, (Object) null);
    }

    public void b() {
        e.c.b(this.f103413a, Interaction$Component.HOME_SCREEN, (String) null, X.f(C16796C.a("component_value", "scanner")), (e.b) null, 10, (Object) null);
    }

    public void c(String str, boolean z10, boolean z11, boolean z12) {
        C17542s.j(str, "storeId");
        e.c.b(this.f103413a, (z10 || !z11) ? Interaction$Component.FAMILY_BENEFITS_SHEET_JOIN_BUTTON : Interaction$Component.FAMILY_BENEFITS_SHEET_SCAN_BUTTON, (String) null, X.m(C16796C.a("store_id", str), C16796C.a("component_value", r(z10, z11, z12))), (e.b) null, 10, (Object) null);
    }

    public void d(String str, boolean z10, boolean z11, boolean z12) {
        C17542s.j(str, "storeId");
        e.c.b(this.f103413a, Interaction$Component.FAMILY_BENEFIT_COFFEE_MUG, (String) null, X.m(C16796C.a("store_id", str), C16796C.a("component_value", r(z10, z11, z12))), (e.b) null, 10, (Object) null);
    }

    public void e(String str) {
        C17542s.j(str, "storeId");
        e.c.b(this.f103413a, Interaction$Component.EVENT_REMINDER_DETAILS_BUTTON, (String) null, X.f(C16796C.a("store_id", str)), (e.b) null, 10, (Object) null);
    }

    public void f(List<String> list) {
        C17542s.j(list, "itemNos");
        g.a.d(this.f103413a, C11687b.c.REDUCED_PRICE_OR_BTI.b(), list, "rec_panel", Interaction$Component.COMMUNICATION_POSTS, (Map) null, 16, (Object) null);
    }

    public void g(C11991a.b bVar) {
        C17542s.j(bVar, "origin");
        e.c.c(this.f103413a, j.ACTION_TAP.b(), X.m(C16796C.a("component_value", bVar.b()), C16796C.a("app_location", "store_page")), Interaction$Component.FAMILY_CARD, (e.b) null, 8, (Object) null);
    }

    public void h() {
        e.c.c(this.f103413a, j.ACTION_TAP.b(), X.m(C16796C.a("component_value", "new_lower_price"), C16796C.a("app_location", "store_page")), Interaction$Component.COMMUNICATION_POSTS, (e.b) null, 8, (Object) null);
    }

    public void i() {
        e.c.c(this.f103413a, j.ACTION_TAP.b(), X.m(C16796C.a("component_value", "family_offer"), C16796C.a("app_location", "store_page")), Interaction$Component.COMMUNICATION_POSTS, (e.b) null, 8, (Object) null);
    }

    public void j(C11991a.f fVar) {
        C17542s.j(fVar, "type");
        e.c.c(this.f103413a, j.ACTION_TAP.b(), X.f(C16796C.a("component_value", fVar.b())), Interaction$Component.INSTORE_STORE_INFO, (e.b) null, 8, (Object) null);
    }

    public void k(String str, C11991a.e eVar) {
        C17542s.j(str, "storeId");
        C17542s.j(eVar, "componentValue");
        e.c.b(this.f103413a, Interaction$Component.INSTORE_SMALL_STORE_BANNER, (String) null, X.m(C16796C.a("component_value", eVar.b()), C16796C.a("store_id", str)), (e.b) null, 10, (Object) null);
    }

    public void l(String str, boolean z10, C11991a.d dVar, String str2) {
        C17542s.j(dVar, "location");
        C17542s.j(str2, "storeId");
        e.c.b(this.f103413a, !z10 ? Interaction$Component.INSTORE_CHECK_FOOD_MENU : str != null ? Interaction$Component.INSTORE_ORDER_FOOD_AGAIN : Interaction$Component.INSTORE_ORDER_FOOD, (String) null, X.m(C16796C.a("store_id", str2), C16796C.a("component_value", dVar.b())), (e.b) null, 10, (Object) null);
    }

    public void m(C11991a.c cVar) {
        C17542s.j(cVar, "origin");
        e.c.c(this.f103413a, j.ACTION_TAP.b(), X.f(C16796C.a("component_value", cVar.b())), Interaction$Component.INSTORE_FAVOURITE_LIST, (e.b) null, 8, (Object) null);
    }

    public void n(C11991a.g gVar) {
        C17542s.j(gVar, "origin");
        if (C17542s.e(gVar, C11991a.g.b.f103410a)) {
            g.a.c(this.f103413a, C11687b.c.REDUCED_PRICE_OR_BTI.b(), (String) null, (Map) null, Interaction$Component.COMMUNICATION_POSTS, (e.b) null, 22, (Object) null);
        } else if (gVar instanceof C11991a.g.C2462a) {
            g.a.a(this.f103413a, ((C11991a.g.C2462a) gVar).a(), (Map) null, Interaction$Component.COMMUNICATION_POSTS, (String) null, (e.b) null, 26, (Object) null);
        } else {
            throw new t();
        }
    }

    public void o(C11991a.C2461a aVar) {
        C17542s.j(aVar, "origin");
        e.c.c(this.f103413a, j.ACTION_TAP.b(), X.f(C16796C.a("component_value", aVar.b())), Interaction$Component.LOCAL_STORE_SELECTION, (e.b) null, 8, (Object) null);
    }

    public void p() {
        e.c.c(this.f103413a, j.ACTION_TAP.b(), X.f(C16796C.a("app_location", "store_page")), Interaction$Component.UPGRADE_BUTTON, (e.b) null, 8, (Object) null);
    }

    public void q() {
        e.c.b(this.f103413a, Interaction$Component.VIEW_COLORS, (String) null, (Map) null, (e.b) null, 14, (Object) null);
    }
}
