package Fi;

import Hx.c;
import IC.C13023e;
import IC.C13026h;
import Oo.b;
import RC.m;
import Vg.a;
import XH.C16807N;
import YH.C16877v;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wi.C12272a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"LFi/h;", "LFi/g;", "LVg/a;", "getOrderSummaryUseCase", "<init>", "(LVg/a;)V", "", "LVg/a$a$e;", "b", "(D)LVg/a$a$e;", "LHx/c$a;", "costs", "LRC/m;", "a", "(LHx/c$a;)LRC/m;", "LVg/a;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    private final a f80865a;

    public h(a aVar) {
        C17542s.j(aVar, "getOrderSummaryUseCase");
        this.f80865a = aVar;
    }

    private final a.C1128a.e b(double d10) {
        return new a.C1128a.e(Double.valueOf(d10), d10, (Double) null);
    }

    public m a(c.a aVar) {
        C17542s.j(aVar, "costs");
        Double f10 = aVar.f();
        if (f10 == null) {
            return null;
        }
        double doubleValue = f10.doubleValue();
        Double e10 = aVar.e();
        a.C1128a.e eVar = new a.C1128a.e(f10, doubleValue - (e10 != null ? e10.doubleValue() : 0.0d), aVar.e());
        Double d10 = aVar.d();
        a.C1128a.e b10 = d10 != null ? b(d10.doubleValue()) : null;
        List c10 = C16877v.c();
        Double b11 = aVar.b();
        if (b11 != null) {
            c10.add(new a.C1128a.d(Math.abs(b11.doubleValue()), (String) null, C13026h.a(b.f84574Z6)));
        }
        C16807N n10 = C16807N.f139792a;
        List a10 = C16877v.a(c10);
        Double c11 = aVar.c();
        a.C1128a.e b12 = c11 != null ? b(c11.doubleValue()) : null;
        Double a11 = aVar.a();
        return this.f80865a.a(new a.C1128a(eVar, b10, (Double) null, (Double) null, (Double) null, (a.C1128a.c) null, a10, b12, a11 != null ? new a.C1128a.b(C13026h.a(C12272a.f105815f1), b(a11.doubleValue())) : null, C16877v.n(), (a.C1128a.C1129a) null, (m.b) null, RecyclerView.n.FLAG_MOVED, (DefaultConstructorMarker) null), (C13023e) null, C16877v.n(), new a.b(false, false, true, false, false, true));
    }
}
