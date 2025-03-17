package BB;

import VL.C16704f;
import VL.s;
import com.ingka.ikea.store.datalayer.impl.network.model.StoreListResponseRemote;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LBB/a;", "", "Lcom/ingka/ikea/store/datalayer/impl/network/model/StoreListResponseRemote;", "b", "(LdI/e;)Ljava/lang/Object;", "", "countryCode", "languageCode", "a", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: BB.a  reason: case insensitive filesystem */
public interface C12610a {
    @C16704f("range/v6/{countryCode}/{languageCode}/allstores")
    Object a(@s("countryCode") String str, @s("languageCode") String str2, C17164e<? super StoreListResponseRemote> eVar);

    @C16704f("range/v6/{cc}/{lc}/allstores")
    Object b(C17164e<? super StoreListResponseRemote> eVar);
}
