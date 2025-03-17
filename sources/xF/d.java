package Xf;

import VL.C16704f;
import VL.t;
import com.ingka.ikea.app.cart.impl.data.ReplacementRecommendationsRemote;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LXf/d;", "", "", "itemNo", "Lcom/ingka/ikea/app/cart/impl/data/ReplacementRecommendationsRemote;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d {
    @C16704f("recommendations/v6/{cc}/{lc}/replacement-recommendations")
    Object a(@t("itemNo") String str, C17164e<? super ReplacementRecommendationsRemote> eVar);
}
