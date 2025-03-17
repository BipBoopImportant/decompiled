package dB;

import VL.C16704f;
import VL.t;
import com.ingka.ikea.shoppinglist.datalayer.impl.recommendations.remote.model.ListProductRecommendationsRemote;
import com.ingka.ikea.shoppinglist.datalayer.impl.recommendations.remote.model.ShoppingListRecommendationsRemote;
import com.ingka.ikea.shoppinglist.datalayer.impl.recommendations.remote.model.UserRecommendationsCarouselRemote;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\t\u0010\nJ$\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b\r\u0010\u0007¨\u0006\u000e"}, d2 = {"LdB/a;", "", "", "listId", "storeId", "Lcom/ingka/ikea/shoppinglist/datalayer/impl/recommendations/remote/model/ShoppingListRecommendationsRemote;", "b", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/shoppinglist/datalayer/impl/recommendations/remote/model/UserRecommendationsCarouselRemote;", "c", "(LdI/e;)Ljava/lang/Object;", "itemNo", "Lcom/ingka/ikea/shoppinglist/datalayer/impl/recommendations/remote/model/ListProductRecommendationsRemote;", "a", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dB.a  reason: case insensitive filesystem */
public interface C14335a {
    @C16704f("customer/v6/{cc}/{lc}/favs/recommendations/similar")
    Object a(@t("store") String str, @t("baseProducts") String str2, C17164e<? super ListProductRecommendationsRemote> eVar);

    @C16704f("/customer/v6/{cc}/{lc}/favs/recommendations/similar/inspire-feed")
    Object b(@t("wishListId") String str, @t("store") String str2, C17164e<? super ShoppingListRecommendationsRemote> eVar);

    @C16704f("/customer/v6/{cc}/{lc}/favs/recommendations/accessories?limit=8")
    Object c(C17164e<? super UserRecommendationsCarouselRemote> eVar);
}
