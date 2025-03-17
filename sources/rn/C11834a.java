package rn;

import VL.C16704f;
import VL.C16707i;
import VL.s;
import VL.u;
import com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.PlpDetailResponseV6;
import dI.C17164e;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001JD\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\nJ:\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lrn/a;", "", "", "type", "id", "", "params", "appInstanceId", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/PlpDetailResponseV6;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "recommendationType", "b", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rn.a  reason: case insensitive filesystem */
public interface C11834a {
    @C16704f("/range/v6/{cc}/{lc}/browse/{type}/{id}")
    Object a(@s(encoded = true, value = "type") String str, @s("id") String str2, @u(encoded = false) Map<String, Object> map, @C16707i("app-instance-id") String str3, C17164e<PlpDetailResponseV6> eVar);

    @C16704f("/range/v6/{cc}/{lc}/browse/user/recommendations/{recommendation-type}")
    Object b(@s(encoded = true, value = "recommendation-type") String str, @u(encoded = false) Map<String, Object> map, @C16707i("app-instance-id") String str2, C17164e<PlpDetailResponseV6> eVar);
}
