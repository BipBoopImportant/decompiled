package Cy;

import Ae.e;
import Ae.j;
import XH.C16796C;
import YH.X;
import com.ingka.ikea.analytics.Interaction$Component;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LCy/a;", "", "LAe/e;", "iAnalytics", "<init>", "(LAe/e;)V", "", "storeId", "LXH/N;", "c", "(Ljava/lang/String;)V", "b", "a", "LAe/e;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final e f108468a;

    public a(e eVar) {
        C17542s.j(eVar, "iAnalytics");
        this.f108468a = eVar;
    }

    public final void a(String str) {
        C17542s.j(str, "storeId");
        e.c.c(this.f108468a, j.SHOP_AND_GO_TAP.b(), X.f(C16796C.a("store_id", str)), Interaction$Component.FULLSERVE_CART_INFO_CLOSE_BUTTON, (e.b) null, 8, (Object) null);
    }

    public final void b(String str) {
        C17542s.j(str, "storeId");
        e.c.c(this.f108468a, j.SHOP_AND_GO_TAP.b(), X.f(C16796C.a("store_id", str)), Interaction$Component.FULLSERVE_CART_INFO_CTA_BUTTON, (e.b) null, 8, (Object) null);
    }

    public final void c(String str) {
        C17542s.j(str, "storeId");
        e.c.c(this.f108468a, j.SHOP_AND_GO_VIEWED.b(), X.f(C16796C.a("store_id", str)), Interaction$Component.FULLSERVE_CART_INFO_SECTION, (e.b) null, 8, (Object) null);
    }
}
