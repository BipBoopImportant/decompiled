package yr;

import VL.C16704f;
import VL.C16707i;
import VL.u;
import com.ingka.ikea.feature.inspire.datalayer.impl.v6.models.InspirationFeedRemoteV6;
import dI.C17164e;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J0\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lyr/a;", "", "", "apiVersion", "", "", "params", "Lcom/ingka/ikea/feature/inspire/datalayer/impl/v6/models/InspirationFeedRemoteV6;", "a", "(ILjava/util/Map;LdI/e;)Ljava/lang/Object;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yr.a  reason: case insensitive filesystem */
public interface C12501a {
    @C16704f("range/v6/{cc}/{lc}/browse/inspire-feed")
    Object a(@C16707i("x-api-version") int i10, @u(encoded = false) Map<String, Object> map, C17164e<InspirationFeedRemoteV6> eVar);
}
