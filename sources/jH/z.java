package JH;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0019\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001aO\u0010\u000b\u001a\u00020\n2\u001e\u0010\b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00070\u00050\u00042\u001e\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00070\u00050\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u0010\u001a\u00020\u000e2\u001e\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00070\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LJH/w;", "builder", "c", "(LJH/w;LJH/w;)LJH/w;", "", "", "", "", "a", "b", "", "d", "(Ljava/util/Set;Ljava/util/Set;)Z", "entries", "", "seed", "e", "(Ljava/util/Set;I)I", "ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class z {
    public static final w c(w wVar, w wVar2) {
        C17542s.j(wVar, "<this>");
        C17542s.j(wVar2, "builder");
        for (Map.Entry entry : wVar2.a()) {
            wVar.e((String) entry.getKey(), (List) entry.getValue());
        }
        return wVar;
    }

    /* access modifiers changed from: private */
    public static final boolean d(Set<? extends Map.Entry<String, ? extends List<String>>> set, Set<? extends Map.Entry<String, ? extends List<String>>> set2) {
        return C17542s.e(set, set2);
    }

    /* access modifiers changed from: private */
    public static final int e(Set<? extends Map.Entry<String, ? extends List<String>>> set, int i10) {
        return (i10 * 31) + set.hashCode();
    }
}
