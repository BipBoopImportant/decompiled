package yx;

import VL.C16704f;
import VL.C16709k;
import VL.s;
import VL.t;
import com.ingka.ikea.productprovider.data.model.ProductListLiteResponse;
import com.ingka.ikea.productprovider.data.model.RecommendationsRemote;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J(\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lyx/e;", "", "", "itemNo", "filter", "Lcom/ingka/ikea/productprovider/data/model/RecommendationsRemote;", "b", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "itemNos", "Lcom/ingka/ikea/productprovider/data/model/ProductListLiteResponse;", "c", "productprovider-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ Object a(e eVar, String str, C17164e eVar2, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    str = "easyPick";
                }
                return eVar.a(str, eVar2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRecommendationsEasyPick");
        }
    }

    @C16704f("range/v6/{cc}/{lc}/browse/recommendations")
    @C16709k({"Content-Type: application/json"})
    Object a(@t("filter") String str, C17164e<? super RecommendationsRemote> eVar);

    @C16704f("range/v6/{cc}/{lc}/browse/recommendations/{itemNo}")
    @C16709k({"Content-Type: application/json"})
    Object b(@s("itemNo") String str, @t("filter") String str2, C17164e<? super RecommendationsRemote> eVar);

    @C16704f("range/v6/{cc}/{lc}/browse/products/{itemNos}")
    Object c(@s("itemNos") String str, C17164e<? super ProductListLiteResponse> eVar);
}
