package in;

import TJ.C16532g;
import com.ingka.ikea.core.model.product.ProductCarousel;
import dI.C17164e;
import kotlin.Metadata;
import nn.C11655a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lin/e;", "", "LTJ/g;", "Lnn/a;", "b", "()LTJ/g;", "Lcom/ingka/ikea/core/model/product/ProductCarousel;", "c", "(LdI/e;)Ljava/lang/Object;", "", "clearDataBeforeFetching", "a", "(ZLdI/e;)Ljava/lang/Object;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ Object a(e eVar, boolean z10, C17164e eVar2, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    z10 = false;
                }
                return eVar.a(z10, eVar2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: syncContent");
        }
    }

    Object a(boolean z10, C17164e<? super Boolean> eVar);

    C16532g<C11655a> b();

    Object c(C17164e<? super ProductCarousel> eVar);
}
