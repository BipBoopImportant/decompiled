package ee;

import XH.C16807N;
import XH.t;
import androidx.lifecycle.F;
import cD.C14029a;
import com.ingka.ikea.dynamicfields.datalayer.DynamicFields$Configuration;
import com.ingka.ikea.useraccount.model.Address;
import java.util.Map;
import kD.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u0014\u001a\u00020\n2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00112\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lee/i;", "Lee/b;", "LcD/a;", "repository", "Lcom/ingka/ikea/useraccount/model/Address$Type;", "addressType", "<init>", "(LcD/a;Lcom/ingka/ikea/useraccount/model/Address$Type;)V", "Lkotlin/Function1;", "LkD/l;", "LXH/N;", "Lcom/ingka/ikea/useraccount/model/StateListener;", "stateListener", "Landroidx/lifecycle/F;", "Lcom/ingka/ikea/dynamicfields/datalayer/DynamicFields$Configuration;", "f", "(LnI/l;)Landroidx/lifecycle/F;", "", "", "data", "j", "(Ljava/util/Map;LnI/l;)V", "d", "Lcom/ingka/ikea/useraccount/model/Address$Type;", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i extends b {

    /* renamed from: d  reason: collision with root package name */
    private final Address.Type f72639d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f72640a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.ingka.ikea.useraccount.model.Address$Type[] r0 = com.ingka.ikea.useraccount.model.Address.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.useraccount.model.Address$Type r1 = com.ingka.ikea.useraccount.model.Address.Type.DELIVERY_DEST     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.useraccount.model.Address$Type r1 = com.ingka.ikea.useraccount.model.Address.Type.INVOICE_DEST     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f72640a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ee.i.a.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(C14029a aVar, Address.Type type) {
        super(aVar);
        C17542s.j(aVar, "repository");
        C17542s.j(type, "addressType");
        this.f72639d = type;
    }

    public F<DynamicFields$Configuration> f(C17642l<? super l, C16807N> lVar) {
        C17542s.j(lVar, "stateListener");
        int i10 = a.f72640a[this.f72639d.ordinal()];
        if (i10 == 1) {
            return h().k(lVar);
        }
        if (i10 == 2) {
            return h().g(lVar);
        }
        throw new t();
    }

    public void j(Map<String, String> map, C17642l<? super l, C16807N> lVar) {
        C17542s.j(map, "data");
        C17542s.j(lVar, "stateListener");
        h().u(map, lVar);
    }
}
