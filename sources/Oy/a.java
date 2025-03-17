package Oy;

import Ae.e;
import Ae.j;
import XH.C16796C;
import YH.X;
import androidx.lifecycle.f0;
import com.ingka.ikea.analytics.Interaction$Component;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LOy/a;", "Landroidx/lifecycle/f0;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "", "componentValue", "LXH/N;", "h", "(Ljava/lang/String;)V", "E", "()V", "C", "D", "m", "LAe/e;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final e f113632m;

    public a(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f113632m = eVar;
    }

    private final void h(String str) {
        e.c.c(this.f113632m, j.ACTION_TAP.b(), X.f(C16796C.a("component_value", str)), Interaction$Component.DUAL_BAG_ONBOARDING, (e.b) null, 8, (Object) null);
    }

    public final void C() {
        h("button");
    }

    public final void D() {
        h("swipe");
    }

    public final void E() {
        this.f113632m.o((Map<String, ? extends Object>) null, Interaction$Component.DUAL_BAG_ONBOARDING);
    }
}
