package yx;

import VL.C16704f;
import VL.C16707i;
import VL.s;
import com.ingka.ikea.core.remotemodel.product.ProductDetailsResponseRemote;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lyx/b;", "", "", "id", "", "apiVersion", "Lcom/ingka/ikea/core/remotemodel/product/ProductDetailsResponseRemote;", "a", "(Ljava/lang/String;ILdI/e;)Ljava/lang/Object;", "productprovider-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yx.b  reason: case insensitive filesystem */
public interface C15312b {
    @C16704f("/range/v6/{cc}/{lc}/browse/product-details/{id}")
    Object a(@s("id") String str, @C16707i("x-api-version") int i10, C17164e<? super ProductDetailsResponseRemote> eVar);
}
