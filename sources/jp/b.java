package Jp;

import VL.C16704f;
import VL.u;
import com.ingka.ikea.datalayer.impl.OfferHubRemote;
import com.ingka.ikea.datalayer.impl.SurpriseOffersRemote;
import dI.C17164e;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\t\u001a\u00020\b2\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LJp/b;", "", "Lcom/ingka/ikea/datalayer/impl/OfferHubRemote;", "b", "(LdI/e;)Ljava/lang/Object;", "", "", "params", "Lcom/ingka/ikea/datalayer/impl/SurpriseOffersRemote;", "a", "(Ljava/util/Map;LdI/e;)Ljava/lang/Object;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface b {
    @C16704f("/range/v6/{cc}/{lc}/browse/offers/surprise")
    Object a(@u(encoded = true) Map<String, String> map, C17164e<? super SurpriseOffersRemote> eVar);

    @C16704f("/range/v6/{cc}/{lc}/browse/offers")
    Object b(C17164e<? super OfferHubRemote> eVar);
}
