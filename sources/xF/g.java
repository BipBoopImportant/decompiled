package xf;

import Ae.e;
import Ae.g;
import XH.C16796C;
import YH.X;
import com.ingka.ikea.analytics.Interaction$Component;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lxf/g;", "Lxf/f;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "", "phrase", "type", "LXH/N;", "g", "(Ljava/lang/String;Ljava/lang/String;)V", "query", "b", "(Ljava/lang/String;)V", "e", "suggestion", "f", "category", "a", "itemNo", "c", "term", "d", "LAe/e;", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements C10395f {

    /* renamed from: a  reason: collision with root package name */
    private final e f77756a;

    public g(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f77756a = eVar;
    }

    private final void g(String str, String str2) {
        this.f77756a.track(Interaction$Component.SEARCH.getValue(), X.m(C16796C.a("search_term", str), C16796C.a("search_type", str2)));
    }

    public void a(String str) {
        C17542s.j(str, "category");
        Interaction$Component interaction$Component = Interaction$Component.AUTOCOMPLETE_CATEGORY;
        g(str, interaction$Component.getValue());
        g.a.c(this.f77756a, str, (String) null, (Map) null, interaction$Component, (e.b) null, 22, (Object) null);
    }

    public void b(String str) {
        C17542s.j(str, "query");
        g(str, "regular");
    }

    public void c(String str) {
        C17542s.j(str, "itemNo");
        Interaction$Component interaction$Component = Interaction$Component.AUTOCOMPLETE_PRODUCT;
        g(str, interaction$Component.getValue());
        g.a.a(this.f77756a, str, (Map) null, interaction$Component, (String) null, (e.b) null, 26, (Object) null);
    }

    public void d(String str) {
        C17542s.j(str, "term");
        g(str, Interaction$Component.POPULAR_SEARCH.getValue());
    }

    public void e(String str) {
        C17542s.j(str, "query");
        g(str, "recently_searched");
    }

    public void f(String str) {
        C17542s.j(str, "suggestion");
        Interaction$Component interaction$Component = Interaction$Component.AUTOCOMPLETE;
        g(str, interaction$Component.getValue());
        g.a.c(this.f77756a, str, (String) null, (Map) null, interaction$Component, (e.b) null, 22, (Object) null);
    }
}
