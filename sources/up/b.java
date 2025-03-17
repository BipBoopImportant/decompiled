package Up;

import VL.C16704f;
import VL.t;
import com.ingka.ikea.core.remotemodel.product.ProductCarouselRemote;
import com.ingka.ikea.discover.impl.DiscoveriesRemote;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LUp/b;", "", "", "prioritiser", "Lcom/ingka/ikea/discover/impl/DiscoveriesRemote;", "b", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/core/remotemodel/product/ProductCarouselRemote;", "a", "(LdI/e;)Ljava/lang/Object;", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface b {
    @C16704f("/range/v6/{cc}/{lc}/browse/offers/carousel/recent")
    Object a(C17164e<? super ProductCarouselRemote> eVar);

    @C16704f("/range/v6/{cc}/{lc}/browse/discoveries")
    Object b(@t("prioritiser") String str, C17164e<? super DiscoveriesRemote> eVar);
}
