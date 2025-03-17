package Jp;

import VL.C16704f;
import VL.C16707i;
import VL.t;
import com.ingka.ikea.core.remotemodel.product.ProductCarouselRemote;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LJp/d;", "", "", "appInstanceId", "recentItemNos", "Lcom/ingka/ikea/core/remotemodel/product/ProductCarouselRemote;", "a", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d {
    @C16704f("/range/v6/{cc}/{lc}/browse/offers/user/sale")
    Object a(@C16707i("app-instance-id") String str, @t("recentlyViewedProducts") String str2, C17164e<? super ProductCarouselRemote> eVar);
}
