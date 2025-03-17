package yr;

import VL.C16704f;
import VL.C16707i;
import VL.C16709k;
import VL.u;
import com.ingka.ikea.feature.inspire.datalayer.impl.v6.models.InspirationFeedRemoteV6;
import dI.C17164e;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J:\u0010\t\u001a\u00020\b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0003H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lyr/b;", "", "", "", "params", "", "apiVersion", "appInstanceId", "Lcom/ingka/ikea/feature/inspire/datalayer/impl/v6/models/InspirationFeedRemoteV6;", "a", "(Ljava/util/Map;ILjava/lang/String;LdI/e;)Ljava/lang/Object;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface b {
    @C16704f("range/v6/{cc}/{lc}/browse/user/inspire-feed")
    @C16709k({"Content-Type: application/json"})
    Object a(@u(encoded = true) Map<String, String> map, @C16707i("x-api-version") int i10, @C16707i("app-instance-id") String str, C17164e<? super InspirationFeedRemoteV6> eVar);
}
