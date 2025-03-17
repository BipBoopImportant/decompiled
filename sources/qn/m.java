package qn;

import YH.C16877v;
import com.ingka.ikea.browseandsearch.plp.datalayer.model.InjectablePriority;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0006¨\u0006\b"}, d2 = {"", "", "a", "(Ljava/lang/String;)Z", "", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/model/InjectablePriority;", "Ljava/util/List;", "defaultPriorities", "datalayer-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private static final List<InjectablePriority> f101839a = C16877v.q(InjectablePriority.CATEGORIES, InjectablePriority.CAMPAIGNS, InjectablePriority.VUGC_INSPIRATIONS, InjectablePriority.INSPIRATIONS, InjectablePriority.RELATED_SEARCHES, InjectablePriority.MOST_LOVED_PRODUCTS);

    public static final boolean a(String str) {
        C17542s.j(str, "<this>");
        return C17542s.e(str, "search");
    }
}
