package fe;

import Wd.M;
import XH.C16807N;
import androidx.lifecycle.F;
import cD.C14029a;
import com.ingka.ikea.dynamicfields.datalayer.DynamicFields$Configuration;
import java.util.Map;
import kD.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\b2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u0010\u001a\u00020\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00148\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0019"}, d2 = {"Lfe/m;", "LWd/M;", "LcD/a;", "repository", "<init>", "(LcD/a;)V", "Lkotlin/Function1;", "LkD/l;", "LXH/N;", "Lcom/ingka/ikea/useraccount/model/StateListener;", "stateListener", "b", "(LnI/l;)V", "", "", "data", "c", "(Ljava/util/Map;LnI/l;)V", "a", "LcD/a;", "Landroidx/lifecycle/F;", "Lcom/ingka/ikea/dynamicfields/datalayer/DynamicFields$Configuration;", "Landroidx/lifecycle/F;", "()Landroidx/lifecycle/F;", "configuration", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m implements M {

    /* renamed from: a  reason: collision with root package name */
    private final C14029a f72988a;

    /* renamed from: b  reason: collision with root package name */
    private final F<DynamicFields$Configuration> f72989b;

    public m(C14029a aVar) {
        C17542s.j(aVar, "repository");
        this.f72988a = aVar;
        this.f72989b = aVar.p();
    }

    public F<DynamicFields$Configuration> a() {
        return this.f72989b;
    }

    public void b(C17642l<? super l, C16807N> lVar) {
        C17542s.j(lVar, "stateListener");
        this.f72988a.q(lVar);
    }

    public void c(Map<String, String> map, C17642l<? super l, C16807N> lVar) {
        C17542s.j(map, "data");
        C17542s.j(lVar, "stateListener");
        this.f72988a.t(map, lVar);
    }

    public void d(C17642l<? super l, C16807N> lVar) {
        M.a.a(this, lVar);
    }
}
