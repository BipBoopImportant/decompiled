package wu;

import VL.C16704f;
import VL.C16709k;
import VL.s;
import com.ingka.ikea.instore.wayfinding.datalayer.impl.network.model.StoreWayfindingDetailsRemote;
import com.ingka.ikea.instore.wayfinding.datalayer.impl.network.model.WayfindingProductLocationRemote;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lwu/a;", "", "", "storeId", "productId", "Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote;", "a", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/StoreWayfindingDetailsRemote;", "b", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wu.a  reason: case insensitive filesystem */
public interface C12303a {
    @C16704f("range/v6/{cc}/{lc}/stores/{storeId}/wayfinding/products/{productId}")
    Object a(@s("storeId") String str, @s("productId") String str2, C17164e<? super WayfindingProductLocationRemote> eVar);

    @C16704f("/range/v6/{cc}/{lc}/stores/{storeId}/wayfinding")
    @C16709k({"x-api-version: 2"})
    Object b(@s("storeId") String str, C17164e<? super StoreWayfindingDetailsRemote> eVar);
}
