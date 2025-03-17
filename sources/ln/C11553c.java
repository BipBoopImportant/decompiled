package ln;

import VL.C16704f;
import VL.C16707i;
import VL.t;
import com.ingka.ikea.browseandsearch.browse.datalayer.impl.remote.models.UserRecommendationsCarouselRemote;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\b\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lln/c;", "", "", "appInstanceId", "Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/UserRecommendationsCarouselRemote;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "recentItemNos", "b", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ln.c  reason: case insensitive filesystem */
public interface C11553c {
    @C16704f("/range/v6/{cc}/{lc}/browse/user/recommendations/personal?limit=8")
    Object a(@C16707i("app-instance-id") String str, C17164e<? super UserRecommendationsCarouselRemote> eVar);

    @C16704f("/range/v6/{cc}/{lc}/browse/user/recommendations/similar?limit=8")
    Object b(@t("recentlyViewedProducts") String str, C17164e<? super UserRecommendationsCarouselRemote> eVar);
}
