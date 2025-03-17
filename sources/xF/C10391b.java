package xf;

import Ae.e;
import Ae.g;
import Nd.c;
import XH.C16796C;
import YH.X;
import com.ingka.ikea.analytics.Interaction$Component;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\fJ\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\fJ\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0011J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u0019J-\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001d2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"¨\u0006#"}, d2 = {"Lxf/b;", "Lxf/a;", "LAe/e;", "analytics", "LNd/c;", "abTesting", "<init>", "(LAe/e;LNd/c;)V", "", "categoryType", "LXH/N;", "b", "(Ljava/lang/String;)V", "categoryId", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "a", "(Ljava/lang/String;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "f", "itemNo", "g", "promotionId", "j", "h", "e", "()V", "i", "d", "id", "", "includedItemNos", "c", "(Ljava/lang/String;Ljava/util/List;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "LAe/e;", "LNd/c;", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xf.b  reason: case insensitive filesystem */
public final class C10391b implements C10390a {

    /* renamed from: a  reason: collision with root package name */
    private final e f77754a;

    /* renamed from: b  reason: collision with root package name */
    private final c f77755b;

    public C10391b(e eVar, c cVar) {
        C17542s.j(eVar, "analytics");
        C17542s.j(cVar, "abTesting");
        this.f77754a = eVar;
        this.f77755b = cVar;
    }

    public void a(String str, Interaction$Component interaction$Component) {
        C17542s.j(str, "categoryId");
        C17542s.j(interaction$Component, "component");
        g.a.c(this.f77754a, str, (String) null, (Map) null, interaction$Component, (e.b) null, 22, (Object) null);
    }

    public void b(String str) {
        C17542s.j(str, "categoryType");
        e.c.b(this.f77754a, Interaction$Component.BROWSE_TYPE, (String) null, X.f(C16796C.a("component_value", str)), (e.b) null, 10, (Object) null);
    }

    public void c(String str, List<String> list, Interaction$Component interaction$Component) {
        C17542s.j(str, "id");
        C17542s.j(list, "includedItemNos");
        C17542s.j(interaction$Component, "component");
        g.a.d(this.f77754a, str, list, "rec_panel", interaction$Component, (Map) null, 16, (Object) null);
    }

    public void d() {
        e.c.b(this.f77754a, Interaction$Component.CATEGORIES_CAROUSEL, (String) null, X.f(C16796C.a("component_value", "offers_and_deals")), (e.b) null, 10, (Object) null);
    }

    public void e() {
        e.c.b(this.f77754a, Interaction$Component.VIEW_COLORS, (String) null, (Map) null, (e.b) null, 14, (Object) null);
    }

    public void f(String str) {
        C17542s.j(str, "categoryType");
        e.c.b(this.f77754a, Interaction$Component.SHOW_MORE, (String) null, X.f(C16796C.a("component_value", str)), (e.b) null, 10, (Object) null);
    }

    public void g(String str) {
        C17542s.j(str, "itemNo");
        g.a.a(this.f77754a, str, (Map) null, Interaction$Component.RECENTLY_VIEWED, (String) null, (e.b) null, 26, (Object) null);
    }

    public void h(String str, Interaction$Component interaction$Component) {
        C17542s.j(str, "itemNo");
        C17542s.j(interaction$Component, "component");
        g.a.a(this.f77754a, str, (Map) null, interaction$Component, (String) null, (e.b) null, 26, (Object) null);
    }

    public void i() {
        e.c.b(this.f77754a, Interaction$Component.SEARCH_BAR, (String) null, X.f(C16796C.a("component_value", "browse_search_bar")), (e.b) null, 10, (Object) null);
        c.a.a(this.f77755b, "action_tap_search_bar", (Map) null, (Map) null, 6, (Object) null);
    }

    public void j(String str) {
        C17542s.j(str, "promotionId");
        g.a.c(this.f77754a, str, (String) null, (Map) null, Interaction$Component.LAST_CHANCE_CAROUSEL, (e.b) null, 22, (Object) null);
    }
}
