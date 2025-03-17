package Wd;

import XH.C16807N;
import androidx.lifecycle.F;
import com.ingka.ikea.dynamicfields.datalayer.DynamicFields$Configuration;
import java.util.Map;
import kD.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00042\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\t\u001a\u00020\u00042\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H&¢\u0006\u0004\b\t\u0010\bJ;\u0010\r\u001a\u00020\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H&¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LWd/M;", "", "Lkotlin/Function1;", "LkD/l;", "LXH/N;", "Lcom/ingka/ikea/useraccount/model/StateListener;", "stateListener", "d", "(LnI/l;)V", "b", "", "", "data", "c", "(Ljava/util/Map;LnI/l;)V", "Landroidx/lifecycle/F;", "Lcom/ingka/ikea/dynamicfields/datalayer/DynamicFields$Configuration;", "a", "()Landroidx/lifecycle/F;", "configuration", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface M {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static void a(M m10, C17642l<? super l, C16807N> lVar) {
            C17542s.j(lVar, "stateListener");
        }
    }

    F<DynamicFields$Configuration> a();

    void b(C17642l<? super l, C16807N> lVar);

    void c(Map<String, String> map, C17642l<? super l, C16807N> lVar);

    void d(C17642l<? super l, C16807N> lVar);
}
