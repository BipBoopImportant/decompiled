package JB;

import VL.C16704f;
import VL.s;
import com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsResponseRemote;
import com.ingka.ikea.store.impl.data.remotemodel.StoreOpeningHoursRemote;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LJB/d;", "", "", "storeId", "Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsResponseRemote;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "date", "Lcom/ingka/ikea/store/impl/data/remotemodel/StoreOpeningHoursRemote;", "b", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: JB.d  reason: case insensitive filesystem */
public interface C13065d {
    @C16704f("range/v6/{cc}/{lc}/stores/{storeId}")
    Object a(@s("storeId") String str, C17164e<? super StoreDetailsResponseRemote> eVar);

    @C16704f("range/v6/{cc}/{lc}/stores/{storeId}/hours/{date}")
    Object b(@s("storeId") String str, @s("date") String str2, C17164e<? super StoreOpeningHoursRemote> eVar);
}
