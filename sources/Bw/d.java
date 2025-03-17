package Bw;

import Bw.i;
import Mp.e;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LBw/i$d;", "", "filterCategoryId", "filterId", "", "b", "(LBw/i$d;Ljava/lang/String;Ljava/lang/String;)Z", "offerhub-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {
    /* access modifiers changed from: private */
    public static final boolean b(i.d dVar, String str, String str2) {
        String str3;
        Object obj;
        if (C17542s.e(dVar.b().c().a(), str)) {
            Iterator it = dVar.b().c().c().iterator();
            while (true) {
                str3 = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((e.b) obj).c()) {
                    break;
                }
            }
            e.b bVar = (e.b) obj;
            if (bVar != null) {
                str3 = bVar.a();
            }
            if (C17542s.e(str3, str2)) {
                return true;
            }
        }
        return false;
    }
}
