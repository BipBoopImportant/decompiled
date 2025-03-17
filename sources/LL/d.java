package Ll;

import Ml.c;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "value", "LMl/c;", "b", "(Ljava/lang/String;)LMl/c;", "appconfig-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {
    /* access modifiers changed from: private */
    public static final c b(String str) {
        T t10;
        Iterator<T> it = c.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            if (C17542s.e(((c) t10).j(), str)) {
                break;
            }
        }
        return (c) t10;
    }
}
