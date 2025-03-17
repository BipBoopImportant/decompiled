package Bu;

import Ae.e;
import Ae.j;
import Ae.o;
import XH.C16796C;
import XH.v;
import YH.X;
import android.content.Context;
import android.os.BatteryManager;
import com.ingka.ikea.analytics.Interaction$Component;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import su.C11891a;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0014B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0012\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J'\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u0015J\u000f\u0010\u001d\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010 \u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001f\u001a\u00020\u0018H\u0016¢\u0006\u0004\b \u0010\u001bJ)\u0010\"\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010!\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\"\u0010#J!\u0010$\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010'¨\u0006("}, d2 = {"LBu/a;", "Lsu/a;", "Landroid/content/Context;", "context", "LAe/e;", "analytics", "<init>", "(Landroid/content/Context;LAe/e;)V", "", "j", "()I", "", "itemId", "division", "storeId", "LAe/o;", "location", "LXH/N;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LAe/o;)V", "a", "(Ljava/lang/String;)V", "c", "destinationId", "", "fromMfaqList", "e", "(Ljava/lang/String;Ljava/lang/String;Z)V", "i", "d", "()V", "confirmStoreChange", "h", "reason", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "f", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Context;", "LAe/e;", "wayfinding-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements C11891a {

    /* renamed from: c  reason: collision with root package name */
    private static final C1478a f79471c = new C1478a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f79472d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Context f79473a;

    /* renamed from: b  reason: collision with root package name */
    private final e f79474b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LBu/a$a;", "", "<init>", "()V", "", "WAYFINDING_TAP", "Ljava/lang/String;", "WAYFINDING_VIEWED", "wayfinding-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bu.a$a  reason: collision with other inner class name */
    private static final class C1478a {
        public /* synthetic */ C1478a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1478a() {
        }
    }

    public a(Context context, e eVar) {
        C17542s.j(context, "context");
        C17542s.j(eVar, "analytics");
        this.f79473a = context;
        this.f79474b = eVar;
    }

    private final int j() {
        Object systemService = this.f79473a.getSystemService("batterymanager");
        C17542s.h(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
        return ((BatteryManager) systemService).getIntProperty(4);
    }

    public void a(String str) {
        C17542s.j(str, "storeId");
        e.c.c(this.f79474b, "wayfinding_tap", X.m(C16796C.a("store_id", str), C16796C.a("battery_pct", Integer.valueOf(j()))), Interaction$Component.WAYFINDING_CLOSE_STORE_MAP, (e.b) null, 8, (Object) null);
    }

    public void b(String str, String str2, String str3, o oVar) {
        C17542s.j(str3, "storeId");
        C17542s.j(oVar, "location");
        e eVar = this.f79474b;
        v a10 = C16796C.a("store_id", str3);
        v a11 = C16796C.a("app_location", oVar.b());
        if (str == null) {
            str = "";
        }
        e.c.c(eVar, "wayfinding_tap", X.m(a10, a11, C16796C.a("item_id", str), C16796C.a("component_value", str2), C16796C.a("battery_pct", Integer.valueOf(j()))), Interaction$Component.WAYFINDING_OPEN_STORE_MAP, (e.b) null, 8, (Object) null);
    }

    public void c(String str) {
        C17542s.j(str, "storeId");
        this.f79474b.track("wayfinding_viewed", X.m(C16796C.a("store_id", str), C16796C.a("battery_pct", Integer.valueOf(j()))));
    }

    public void d() {
        e.c.c(this.f79474b, j.KOMPASS_SDK_UNSUPPORTED.b(), (Map) null, Interaction$Component.OPEN_GL_UNSUPPORTED, (e.b) null, 10, (Object) null);
    }

    public void e(String str, String str2, boolean z10) {
        C17542s.j(str, "storeId");
        C17542s.j(str2, "destinationId");
        String str3 = z10 ? "MFAQs" : "store_map";
        Map c10 = X.c();
        c10.put("store_id", str);
        c10.put("component_value", str2);
        c10.put("app_location", str3);
        e.c.c(this.f79474b, "wayfinding_tap", X.b(c10), Interaction$Component.WAYFINDING_SELECT_POI, (e.b) null, 8, (Object) null);
    }

    public void f(String str, String str2) {
        C17542s.j(str, "storeId");
        e eVar = this.f79474b;
        v a10 = C16796C.a("store_id", str);
        if (str2 == null) {
            str2 = "";
        }
        eVar.track("wayfinding_upptacka_success", X.m(a10, C16796C.a("item_id", str2)));
    }

    public void g(String str, String str2, String str3) {
        C17542s.j(str, "storeId");
        C17542s.j(str3, "reason");
        e eVar = this.f79474b;
        v a10 = C16796C.a("store_id", str);
        if (str2 == null) {
            str2 = "";
        }
        eVar.track("wayfinding_upptacka_fail", X.m(a10, C16796C.a("item_id", str2), C16796C.a("reason", str3)));
    }

    public void h(String str, String str2, boolean z10) {
        C17542s.j(str, "storeId");
        e eVar = this.f79474b;
        Interaction$Component interaction$Component = Interaction$Component.INSTORE_STORE_MODE_DIALOG_CHANGE_STORE;
        v a10 = C16796C.a("store_id", str);
        if (str2 == null) {
            str2 = "";
        }
        e.c.c(eVar, "wayfinding_upptacka_tap", X.m(a10, C16796C.a("item_id", str2), C16796C.a("component_value", z10 ? "change_store" : "dismiss")), interaction$Component, (e.b) null, 8, (Object) null);
    }

    public void i(String str) {
        C17542s.j(str, "storeId");
        e.c.c(this.f79474b, "wayfinding_viewed", X.f(C16796C.a("store_id", str)), Interaction$Component.WAYFINDING_STORE_MAP_LOADED, (e.b) null, 8, (Object) null);
    }
}
