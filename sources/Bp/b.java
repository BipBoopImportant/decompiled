package Bp;

import XH.C16807N;
import dI.C17164e;
import java.util.Map;
import kotlin.Metadata;
import up.C12071a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J.\u0010\b\u001a\u00020\u00072\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0004H¦B¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LBp/b;", "", "", "Lup/a;", "", "entries", "showPreferencesHint", "LXH/N;", "a", "(Ljava/util/Map;ZLdI/e;)Ljava/lang/Object;", "dataconsent_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ Object a(b bVar, Map map, boolean z10, C17164e eVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    z10 = false;
                }
                return bVar.a(map, z10, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
    }

    Object a(Map<C12071a, Boolean> map, boolean z10, C17164e<? super C16807N> eVar);
}
