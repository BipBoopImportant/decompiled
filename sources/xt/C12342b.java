package xt;

import Ae.e;
import Ae.j;
import EB.C12832d;
import FB.C12860a;
import XH.C16796C;
import YH.X;
import com.ingka.ikea.analytics.Interaction$Component;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0015"}, d2 = {"Lxt/b;", "Lxt/a;", "LFB/a;", "localStoreSelectionRepository", "LAe/e;", "analytics", "<init>", "(LFB/a;LAe/e;)V", "LXH/N;", "b", "()V", "e", "", "currentUrlPath", "newUrlPath", "d", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "c", "LFB/a;", "LAe/e;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xt.b  reason: case insensitive filesystem */
public final class C12342b implements C12341a {

    /* renamed from: a  reason: collision with root package name */
    private final C12860a f106281a;

    /* renamed from: b  reason: collision with root package name */
    private final e f106282b;

    public C12342b(C12860a aVar, e eVar) {
        C17542s.j(aVar, "localStoreSelectionRepository");
        C17542s.j(eVar, "analytics");
        this.f106281a = aVar;
        this.f106282b = eVar;
    }

    public void a() {
        C12832d c10 = this.f106281a.c();
        e.c.b(this.f106282b, Interaction$Component.FOODMOBILE_CLOSE_BUTTON, (String) null, X.f(C16796C.a("store_id", c10 != null ? c10.e() : null)), (e.b) null, 10, (Object) null);
    }

    public void b() {
        C12832d c10 = this.f106281a.c();
        e.c.b(this.f106282b, Interaction$Component.FOODMOBILE_CONTINUE_ORDER, (String) null, X.f(C16796C.a("store_id", c10 != null ? c10.e() : null)), (e.b) null, 10, (Object) null);
    }

    public void c() {
        C12832d c10 = this.f106281a.c();
        this.f106282b.track(j.ACTION_SUCCESS.b(), X.m(C16796C.a("store_id", c10 != null ? c10.e() : null), C16796C.a("component", Interaction$Component.FOODMOBILE_LEAVE.getValue())));
    }

    public void d(String str, String str2) {
        C17542s.j(str, "currentUrlPath");
        C17542s.j(str2, "newUrlPath");
        C12832d c10 = this.f106281a.c();
        e.c.b(this.f106282b, Interaction$Component.FOODMOBILE_BACK_BUTTON, (String) null, X.m(C16796C.a("component_value", str), C16796C.a("id", str2), C16796C.a("store_id", c10 != null ? c10.e() : null)), (e.b) null, 10, (Object) null);
    }

    public void e() {
        c();
        C12832d c10 = this.f106281a.c();
        e.c.b(this.f106282b, Interaction$Component.FOODMOBILE_CANCEL_ORDER, (String) null, X.f(C16796C.a("store_id", c10 != null ? c10.e() : null)), (e.b) null, 10, (Object) null);
    }
}
