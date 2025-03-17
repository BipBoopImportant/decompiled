package Gi;

import Ae.e;
import XH.C16796C;
import YH.X;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.analytics.Interaction$ContextComponent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0016"}, d2 = {"LGi/d;", "LGi/c;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "", "screenId", "LXH/N;", "a", "(Ljava/lang/String;)V", "sortingValue", "itemNo", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "", "translateReview", "b", "(ZLjava/lang/String;)V", "isHelpful", "d", "LAe/e;", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Gi.d  reason: case insensitive filesystem */
public final class C10717d implements C10716c {

    /* renamed from: a  reason: collision with root package name */
    private final e f81102a;

    public C10717d(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f81102a = eVar;
    }

    public void a(String str) {
        C17542s.j(str, "screenId");
        e.c.b(this.f81102a, Interaction$Component.REVIEW_SORT_BUTTON, (String) null, (Map) null, new e.b("ratings_and_reviews", str, (String) null, (Interaction$ContextComponent) null, (String) null, 28, (DefaultConstructorMarker) null), 6, (Object) null);
    }

    public void b(boolean z10, String str) {
        C17542s.j(str, "itemNo");
        e.c.b(this.f81102a, Interaction$Component.REVIEW_TRANSLATE_TOGGLE, (String) null, X.f(C16796C.a("component_value", z10 ? "on" : "off")), new e.b("ratings_and_reviews", str, (String) null, (Interaction$ContextComponent) null, (String) null, 28, (DefaultConstructorMarker) null), 2, (Object) null);
    }

    public void c(String str, String str2) {
        C17542s.j(str, "sortingValue");
        C17542s.j(str2, "itemNo");
        e.c.b(this.f81102a, Interaction$Component.REVIEW_SORT_OPTIONS, (String) null, X.f(C16796C.a("component_value", str)), new e.b("ratings_and_reviews", str2, (String) null, (Interaction$ContextComponent) null, (String) null, 28, (DefaultConstructorMarker) null), 2, (Object) null);
    }

    public void d(boolean z10, String str) {
        C17542s.j(str, "itemNo");
        e.c.b(this.f81102a, Interaction$Component.REVIEW_HELPFUL_BUTTON, (String) null, X.f(C16796C.a("component_value", z10 ? "yes" : "undo")), new e.b("ratings_and_reviews", str, (String) null, (Interaction$ContextComponent) null, (String) null, 28, (DefaultConstructorMarker) null), 2, (Object) null);
    }
}
