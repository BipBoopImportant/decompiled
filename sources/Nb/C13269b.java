package NB;

import Ae.e;
import XH.C16796C;
import YH.X;
import com.ingka.ikea.analytics.Interaction$Component;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013¨\u0006\u0014"}, d2 = {"LNB/b;", "LNB/a;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "", "storeId", "LXH/N;", "d", "(Ljava/lang/String;)V", "a", "()V", "g", "e", "c", "grantedPermission", "b", "f", "LAe/e;", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: NB.b  reason: case insensitive filesystem */
public final class C13269b implements C13268a {

    /* renamed from: a  reason: collision with root package name */
    private final e f112383a;

    public C13269b(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f112383a = eVar;
    }

    public void a() {
        e.c.b(this.f112383a, Interaction$Component.INSTORE_STORE_INFO, (String) null, X.f(C16796C.a("component_value", "changestore_detailsbutton")), (e.b) null, 10, (Object) null);
    }

    public void b(String str) {
        C17542s.j(str, "grantedPermission");
        e.c.b(this.f112383a, Interaction$Component.LOCATION_ALLOW, (String) null, X.f(C16796C.a("component_value", str)), (e.b) null, 10, (Object) null);
    }

    public void c() {
        e.c.b(this.f112383a, Interaction$Component.STORE_PICKER_FIND_NEARBY_BUTTON, (String) null, (Map) null, (e.b) null, 14, (Object) null);
    }

    public void d(String str) {
        C17542s.j(str, "storeId");
        e.c.b(this.f112383a, Interaction$Component.STORE_PICKER_CONFIRM_SELECTION, (String) null, X.f(C16796C.a("store_id", str)), (e.b) null, 10, (Object) null);
    }

    public void e() {
        this.f112383a.o((Map<String, ? extends Object>) null, Interaction$Component.STORE_PICKER_NO_LOCATION_PERMISSION);
    }

    public void f() {
        e.c.b(this.f112383a, Interaction$Component.LOCATION_DENY, (String) null, (Map) null, (e.b) null, 14, (Object) null);
    }

    public void g() {
        this.f112383a.o((Map<String, ? extends Object>) null, Interaction$Component.STORE_PICKER_SELECTION_SUCCESS);
    }
}
