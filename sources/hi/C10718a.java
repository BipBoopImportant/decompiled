package Hi;

import QL.x;
import VL.C16700b;
import VL.C16704f;
import VL.C16707i;
import VL.p;
import VL.s;
import VL.u;
import XH.C16807N;
import com.ingka.ikea.app.ratingsandreviews.data.network.remote.ProductDetailsSummaryRemote;
import com.ingka.ikea.app.ratingsandreviews.data.network.remote.ReviewsResponseRemote;
import dI.C17164e;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\bH§@¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"LHi/a;", "", "", "itemNo", "LQL/x;", "Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ProductDetailsSummaryRemote;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "", "params", "Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ReviewsResponseRemote;", "d", "(Ljava/lang/String;Ljava/util/Map;LdI/e;)Ljava/lang/Object;", "reviewId", "appInstanceId", "LXH/N;", "c", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "b", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Hi.a  reason: case insensitive filesystem */
public interface C10718a {
    @C16704f("range/v6/{cc}/{lc}/browse/products/{itemNo}/reviews/summary")
    Object a(@s("itemNo") String str, C17164e<? super x<ProductDetailsSummaryRemote>> eVar);

    @C16700b("range/v6/{cc}/{lc}/browse/reviews/{reviewId}/rate")
    Object b(@s("reviewId") String str, @C16707i("app-instance-id") String str2, C17164e<? super x<C16807N>> eVar);

    @p("range/v6/{cc}/{lc}/browse/reviews/{reviewId}/rate")
    Object c(@s("reviewId") String str, @C16707i("app-instance-id") String str2, C17164e<? super x<C16807N>> eVar);

    @C16704f("range/v6/{cc}/{lc}/browse/products/{itemNo}/reviews")
    Object d(@s("itemNo") String str, @u(encoded = false) Map<String, Object> map, C17164e<x<ReviewsResponseRemote>> eVar);
}
