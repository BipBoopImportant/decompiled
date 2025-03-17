package GA;

import Ae.e;
import Ae.g;
import Ae.j;
import XH.C16796C;
import YH.X;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.analytics.Interaction$ContextComponent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\fJ'\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\fJ'\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00068\u0002XD¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0014"}, d2 = {"LGA/b;", "LGA/a;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "", "itemNo", "screenId", "screenType", "LXH/N;", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "b", "inspirationId", "a", "c", "LAe/e;", "Ljava/lang/String;", "screenName", "shoppableimage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: GA.b  reason: case insensitive filesystem */
public final class C12915b implements C12914a {

    /* renamed from: a  reason: collision with root package name */
    private final e f110237a;

    /* renamed from: b  reason: collision with root package name */
    private final String f110238b = "shoppable_image";

    public C12915b(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f110237a = eVar;
    }

    public void a(String str, String str2, String str3) {
        C17542s.j(str, "inspirationId");
        C17542s.j(str2, "screenId");
        String str4 = str3;
        C17542s.j(str4, "screenType");
        e eVar = this.f110237a;
        e eVar2 = eVar;
        g.a.c(eVar2, str, (String) null, (Map) null, Interaction$Component.INSPIRE_FEED, new e.b(this.f110238b, str2, str4, (Interaction$ContextComponent) null, (String) null, 24, (DefaultConstructorMarker) null), 6, (Object) null);
    }

    public void b(String str, String str2, String str3) {
        C17542s.j(str, "itemNo");
        C17542s.j(str2, "screenId");
        String str4 = str3;
        C17542s.j(str4, "screenType");
        e eVar = this.f110237a;
        e eVar2 = eVar;
        g.a.a(eVar2, str, (Map) null, Interaction$Component.PRODUCT_LISTING, (String) null, new e.b(this.f110238b, str2, str4, (Interaction$ContextComponent) null, (String) null, 24, (DefaultConstructorMarker) null), 10, (Object) null);
    }

    public void c(String str, String str2, String str3) {
        C17542s.j(str, "itemNo");
        C17542s.j(str2, "screenId");
        C17542s.j(str3, "screenType");
        e.c.c(this.f110237a, j.ACTION_SWIPE.b(), X.p(C16796C.a("items", X.p(C16796C.a("item_id", str))), C16796C.a("context_screen_id", str2), C16796C.a("context_screen_type", str3)), Interaction$Component.CONTEXTUAL_IMAGE, (e.b) null, 8, (Object) null);
    }

    public void d(String str, String str2, String str3) {
        C17542s.j(str, "itemNo");
        C17542s.j(str2, "screenId");
        String str4 = str3;
        C17542s.j(str4, "screenType");
        e eVar = this.f110237a;
        e eVar2 = eVar;
        g.a.a(eVar2, str, (Map) null, Interaction$Component.SHOPPABLE_IMAGE_DOT, (String) null, new e.b(this.f110238b, str2, str4, (Interaction$ContextComponent) null, (String) null, 24, (DefaultConstructorMarker) null), 10, (Object) null);
    }
}
