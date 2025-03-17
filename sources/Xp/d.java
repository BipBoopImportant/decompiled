package Xp;

import Ae.e;
import IC.C13023e;
import IC.C13026h;
import Oo.b;
import Tp.a;
import U0.C4889m;
import U0.C4895p;
import XH.C16796C;
import YH.X;
import com.ingka.ikea.analytics.Interaction$Component;
import fn.C11275a;
import fn.C11277c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import uK.C18146a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00118\u0016XD¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u000f\u0010\u0013R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001a"}, d2 = {"LXp/d;", "LTp/a;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "", "selected", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "d", "(ZLandroidx/compose/ui/d;LU0/m;I)V", "b", "()V", "a", "LAe/e;", "", "Ljava/lang/String;", "()Ljava/lang/String;", "route", "", "c", "Ljava/lang/Object;", "()Ljava/lang/Object;", "typeSafeRoute", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    private final e f89223a;

    /* renamed from: b  reason: collision with root package name */
    private final String f89224b = "discover";

    /* renamed from: c  reason: collision with root package name */
    private final Object f89225c;

    public d(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f89223a = eVar;
    }

    public String a() {
        return this.f89224b;
    }

    public void b() {
        e.c.b(this.f89223a, Interaction$Component.TAB_BAR, (String) null, X.f(C16796C.a("component_value", "discover")), (e.b) null, 10, (Object) null);
    }

    public Object c() {
        return this.f89225c;
    }

    public void d(boolean z10, androidx.compose.ui.d dVar, C4889m mVar, int i10) {
        C17542s.j(dVar, "modifier");
        mVar.W(-2098010112);
        if (C4895p.J()) {
            C4895p.S(-2098010112, i10, -1, "com.ingka.ikea.discover.impl.navigation.DiscoverNavigationTabImpl.Icon (DiscoverNavigationTabImpl.kt:25)");
        }
        C11277c.b(C18146a.f148336Z1, C13026h.a(b.f84723n2), dVar, (C11275a) null, mVar, (C13023e.f110931a << 3) | ((i10 << 3) & 896), 8);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }
}
