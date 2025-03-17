package Tj;

import Hj.C10720a;
import Sy.a;
import Tj.r;
import XH.x;
import XH.y;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.g;
import jj.C11421d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LTj/s;", "LTj/r;", "Ljj/d;", "scanFailureCounter", "LSy/a;", "scanAndGoAnalytics", "<init>", "(Ljj/d;LSy/a;)V", "", "throwable", "LXH/x;", "LTj/r$b;", "a", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "Ljj/d;", "b", "LSy/a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s implements r {

    /* renamed from: a  reason: collision with root package name */
    private final C11421d f87680a;

    /* renamed from: b  reason: collision with root package name */
    private final a f87681b;

    public s(C11421d dVar, a aVar) {
        C17542s.j(dVar, "scanFailureCounter");
        C17542s.j(aVar, "scanAndGoAnalytics");
        this.f87680a = dVar;
        this.f87681b = aVar;
    }

    public Object a(Throwable th2) {
        C17542s.j(th2, "throwable");
        if (th2 instanceof C10720a) {
            this.f87681b.s(((C10720a) th2).a(), (String) null, Interaction$Component.SHOP_AND_GO_SCANNER, a.d.CLIENT);
            if (this.f87680a.c()) {
                this.f87680a.a();
                x.a aVar = x.f139812b;
                return x.b(r.b.a.f87676a);
            }
            this.f87680a.b();
            x.a aVar2 = x.f139812b;
            return x.b(r.b.d.f87679a);
        } else if (th2 instanceof g.a) {
            x.a aVar3 = x.f139812b;
            return x.b(new r.b.C1828b(((g.a) th2).a()));
        } else if (th2 instanceof g.b) {
            x.a aVar4 = x.f139812b;
            return x.b(new r.b.c(((g.b) th2).a()));
        } else {
            x.a aVar5 = x.f139812b;
            return x.b(y.a(new r.a(th2)));
        }
    }
}
