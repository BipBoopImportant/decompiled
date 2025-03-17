package ee;

import XH.C16807N;
import androidx.lifecycle.F;
import cD.C14029a;
import com.ingka.ikea.dynamicfields.datalayer.DynamicFields$Configuration;
import java.util.Map;
import kD.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u0013\u001a\u00020\n2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00112\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\n2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lee/r;", "Lee/b;", "LcD/a;", "repository", "", "addressId", "<init>", "(LcD/a;Ljava/lang/String;)V", "Lkotlin/Function1;", "LkD/l;", "LXH/N;", "Lcom/ingka/ikea/useraccount/model/StateListener;", "stateListener", "Landroidx/lifecycle/F;", "Lcom/ingka/ikea/dynamicfields/datalayer/DynamicFields$Configuration;", "f", "(LnI/l;)Landroidx/lifecycle/F;", "", "data", "j", "(Ljava/util/Map;LnI/l;)V", "d", "(LnI/l;)V", "Ljava/lang/String;", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r extends b {

    /* renamed from: d  reason: collision with root package name */
    private final String f72647d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(C14029a aVar, String str) {
        super(aVar);
        C17542s.j(aVar, "repository");
        C17542s.j(str, "addressId");
        this.f72647d = str;
    }

    public void d(C17642l<? super l, C16807N> lVar) {
        C17542s.j(lVar, "stateListener");
        h().w(this.f72647d, lVar);
    }

    public F<DynamicFields$Configuration> f(C17642l<? super l, C16807N> lVar) {
        C17542s.j(lVar, "stateListener");
        return h().s(this.f72647d, lVar);
    }

    public void j(Map<String, String> map, C17642l<? super l, C16807N> lVar) {
        C17542s.j(map, "data");
        C17542s.j(lVar, "stateListener");
        h().f(this.f72647d, map, lVar);
    }
}
