package Qh;

import Ae.e;
import Ae.g;
import Ae.k;
import Ae.p;
import De.a;
import XH.C16796C;
import YH.X;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.analytics.Interaction$ContextComponent;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mp.C11588a;
import uq.C12078d;
import uq.g;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010\u0012J\u000f\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010!J\u000f\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010!J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0015H\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b(\u0010\u0012J\u000f\u0010)\u001a\u00020\u000eH\u0016¢\u0006\u0004\b)\u0010!J\u000f\u0010*\u001a\u00020\u000eH\u0016¢\u0006\u0004\b*\u0010!J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b,\u0010\u0012J\u000f\u0010-\u001a\u00020\u000eH\u0016¢\u0006\u0004\b-\u0010!J\u000f\u0010.\u001a\u00020\u000eH\u0016¢\u0006\u0004\b.\u0010!J-\u00102\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\b2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\b002\u0006\u0010\u000b\u001a\u00020\u0015H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b4\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u00106¨\u00067"}, d2 = {"LQh/b;", "LQh/a;", "LAe/e;", "analytics", "Luq/d;", "episodAnalytics", "<init>", "(LAe/e;Luq/d;)V", "", "itemNo", "LDe/a;", "component", "", "has3dButton", "LXH/N;", "i", "(Ljava/lang/String;LDe/a;Z)V", "t", "(Ljava/lang/String;)V", "storeAvailability", "o", "Lcom/ingka/ikea/analytics/Interaction$Component;", "onlineAvailability", "m", "(Lcom/ingka/ikea/analytics/Interaction$Component;Ljava/lang/String;)V", "Lmp/a;", "inspirationFeedItem", "b", "(Lmp/a;)V", "e", "(Ljava/lang/String;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "q", "r", "()V", "f", "j", "h", "s", "(Lcom/ingka/ikea/analytics/Interaction$Component;)V", "componentValue", "g", "p", "a", "analyticsComponentValue", "d", "l", "n", "id", "", "includedItemNos", "c", "(Ljava/lang/String;Ljava/util/List;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "k", "LAe/e;", "Luq/d;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final e f63119a;

    /* renamed from: b  reason: collision with root package name */
    private final C12078d f63120b;

    public b(e eVar, C12078d dVar) {
        C17542s.j(eVar, "analytics");
        C17542s.j(dVar, "episodAnalytics");
        this.f63119a = eVar;
        this.f63120b = dVar;
    }

    public void a() {
        e.c.b(this.f63119a, Interaction$Component.VIEW_COLORS, (String) null, (Map) null, (e.b) null, 14, (Object) null);
    }

    public void b(C11588a aVar) {
        C17542s.j(aVar, "inspirationFeedItem");
        C12078d dVar = this.f63120b;
        String f10 = aVar.f();
        Interaction$Component interaction$Component = Interaction$Component.PIP_INSPIRE_FEED;
        dVar.a(new g.i(f10, interaction$Component.getValue(), interaction$Component.getValue()));
    }

    public void c(String str, List<String> list, Interaction$Component interaction$Component) {
        C17542s.j(str, "id");
        C17542s.j(list, "includedItemNos");
        C17542s.j(interaction$Component, "component");
        g.a.d(this.f63119a, str, list, "rec_panel", interaction$Component, (Map) null, 16, (Object) null);
    }

    public void d(String str) {
        C17542s.j(str, "analyticsComponentValue");
        this.f63119a.o(X.m(C16796C.a("component_value", str), C16796C.a("app_location", "PIP")), Interaction$Component.ASSEMBLY_AVAILABILITY);
    }

    public void e(String str, Interaction$Component interaction$Component) {
        C17542s.j(str, "itemNo");
        C17542s.j(interaction$Component, "component");
        g.a.a(this.f63119a, str, (Map) null, interaction$Component, (String) null, (e.b) null, 26, (Object) null);
    }

    public void f() {
        e.c.b(this.f63119a, Interaction$Component.PIP_PRODUCT_INFORMATION, (String) null, X.f(C16796C.a("component_value", "safety_and_compliance")), (e.b) null, 10, (Object) null);
    }

    public void g(String str) {
        e.c.b(this.f63119a, Interaction$Component.PIP_POSTAL_CODE_ADDED, (String) null, X.f(C16796C.a("component_value", str)), (e.b) null, 10, (Object) null);
    }

    public void h() {
        e.c.b(this.f63119a, Interaction$Component.PIP_MENU, (String) null, X.m(C16796C.a("component_value", "delivery_and_pickup"), C16796C.a("action_type", k.QUESTION_MARK.b())), (e.b) null, 10, (Object) null);
    }

    public void i(String str, a aVar, boolean z10) {
        C17542s.j(str, "itemNo");
        C17542s.j(aVar, "component");
        this.f63119a.l(str, X.f(C16796C.a(Interaction$Component.PIP_HAS_3D_BUTTON.getValue(), z10 ? "true" : "false")), aVar);
        this.f63120b.a(new g.j(str, aVar.getValue()));
    }

    public void j() {
        e.c.b(this.f63119a, Interaction$Component.PIP_MENU, (String) null, X.f(C16796C.a("component_value", "store_details")), (e.b) null, 10, (Object) null);
    }

    public void k(String str) {
        C17542s.j(str, "itemNo");
        e.c.b(this.f63119a, Interaction$Component.PIP_PRODUCT_INFORMATION, (String) null, X.f(C16796C.a("component_value", "ratings_and_reviews")), new e.b("pip", str, (String) null, (Interaction$ContextComponent) null, (String) null, 28, (DefaultConstructorMarker) null), 2, (Object) null);
    }

    public void l() {
        this.f63119a.o(X.f(C16796C.a("component_value", "financial_services")), Interaction$Component.PIP_MENU);
    }

    public void m(Interaction$Component interaction$Component, String str) {
        C17542s.j(interaction$Component, "component");
        C17542s.j(str, "onlineAvailability");
        this.f63119a.o(X.f(C16796C.a("component_value", str)), interaction$Component);
    }

    public void n() {
        e.c.b(this.f63119a, Interaction$Component.PIP_MENU, (String) null, X.f(C16796C.a("component_value", "financial_services")), (e.b) null, 10, (Object) null);
    }

    public void o(String str) {
        C17542s.j(str, "storeAvailability");
        this.f63119a.o(X.f(C16796C.a("component_value", str)), Interaction$Component.PIP_STORE_AVAILABILITY);
    }

    public void p() {
        e.c.b(this.f63119a, Interaction$Component.ASSEMBLY_SERVICE, (String) null, X.f(C16796C.a("app_location", "PIP")), (e.b) null, 10, (Object) null);
    }

    public void q(String str) {
        C17542s.j(str, "itemNo");
        g.a.a(this.f63119a, str, (Map) null, Interaction$Component.UPSELL, (String) null, (e.b) null, 26, (Object) null);
    }

    public void r() {
        this.f63119a.p(p.DEEPLINK);
    }

    public void s(Interaction$Component interaction$Component) {
        C17542s.j(interaction$Component, "component");
        e.c.b(this.f63119a, interaction$Component, (String) null, X.f(C16796C.a("component_value", "change_store")), (e.b) null, 10, (Object) null);
    }

    public void t(String str) {
        C17542s.j(str, "itemNo");
        g.a.a(this.f63119a, str, (Map) null, Interaction$Component.COLOR_PICKER, (String) null, (e.b) null, 26, (Object) null);
    }
}
