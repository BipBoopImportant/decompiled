package rt;

import VL.C16704f;
import VL.u;
import com.ingka.ikea.instore.datalayer.storeoffers.network.model.StoreOffersRemote;
import dI.C17164e;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u00020\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lrt/a;", "", "", "", "params", "Lcom/ingka/ikea/instore/datalayer/storeoffers/network/model/StoreOffersRemote;", "a", "(Ljava/util/Map;LdI/e;)Ljava/lang/Object;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rt.a  reason: case insensitive filesystem */
public interface C11846a {
    @C16704f("/range/v6/{cc}/{lc}/browse/categories/reduced_price_or_breath_taking")
    Object a(@u(encoded = false) Map<String, String> map, C17164e<? super StoreOffersRemote> eVar);
}
