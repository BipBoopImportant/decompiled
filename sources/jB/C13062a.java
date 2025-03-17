package JB;

import VL.C16704f;
import VL.s;
import com.ingka.ikea.store.impl.data.remotemodel.PopularTimesLiveRemote;
import com.ingka.ikea.store.impl.data.remotemodel.PopularTimesTrendRemote;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"LJB/a;", "", "", "storeId", "Lcom/ingka/ikea/store/impl/data/remotemodel/PopularTimesTrendRemote;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/store/impl/data/remotemodel/PopularTimesLiveRemote;", "b", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: JB.a  reason: case insensitive filesystem */
public interface C13062a {
    @C16704f("range/v6/{cc}/{lc}/stores/{storeId}/trends")
    Object a(@s("storeId") String str, C17164e<? super PopularTimesTrendRemote> eVar);

    @C16704f("range/v6/{cc}/{lc}/stores/{storeId}/live")
    Object b(@s("storeId") String str, C17164e<? super PopularTimesLiveRemote> eVar);
}
