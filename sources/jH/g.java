package JH;

import XH.C16807N;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\u001aW\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"K", "V", "Lkotlin/Function1;", "supplier", "LXH/N;", "close", "", "maxSize", "", "a", "(LnI/l;LnI/l;I)Ljava/util/Map;", "ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g {
    public static final <K, V> Map<K, V> a(C17642l<? super K, ? extends V> lVar, C17642l<? super V, C16807N> lVar2, int i10) {
        C17542s.j(lVar, "supplier");
        C17542s.j(lVar2, "close");
        Map<K, V> synchronizedMap = Collections.synchronizedMap(new r(lVar, lVar2, i10));
        C17542s.i(synchronizedMap, "synchronizedMap(LRUCache…upplier, close, maxSize))");
        return synchronizedMap;
    }
}
