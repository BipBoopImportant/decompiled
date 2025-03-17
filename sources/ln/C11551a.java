package ln;

import VL.C16704f;
import VL.t;
import com.ingka.ikea.browseandsearch.browse.datalayer.impl.remote.models.BrowseContentRemote;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lln/a;", "", "", "offers", "Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/BrowseContentRemote;", "a", "(Ljava/lang/Boolean;LdI/e;)Ljava/lang/Object;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ln.a  reason: case insensitive filesystem */
public interface C11551a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ln.a$a  reason: collision with other inner class name */
    public static final class C2263a {
        public static /* synthetic */ Object a(C11551a aVar, Boolean bool, C17164e eVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    bool = null;
                }
                return aVar.a(bool, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBrowseContent");
        }
    }

    @C16704f("/range/v6/{cc}/{lc}/browse")
    Object a(@t("offers") Boolean bool, C17164e<? super BrowseContentRemote> eVar);
}
