package Up;

import VL.C16704f;
import VL.C16707i;
import VL.t;
import com.ingka.ikea.core.remotemodel.product.ProductCarouselRemote;
import com.ingka.ikea.discover.impl.DiscoveriesRemote;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\b\u001a\u00020\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"LUp/e;", "", "", "publisherToken", "prioritiser", "Lcom/ingka/ikea/discover/impl/DiscoveriesRemote;", "b", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "appInstanceId", "recentItemNos", "Lcom/ingka/ikea/core/remotemodel/product/ProductCarouselRemote;", "a", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface e {
    @C16704f("/range/v6/{cc}/{lc}/browse/offers/user/sale-or-new")
    Object a(@C16707i("app-instance-id") String str, @t("recentlyViewedProducts") String str2, C17164e<? super ProductCarouselRemote> eVar);

    @C16704f("/range/v6/{cc}/{lc}/browse/publisher/sso/discoveries")
    Object b(@C16707i("publisher-authorization") String str, @t("prioritiser") String str2, C17164e<? super DiscoveriesRemote> eVar);
}
