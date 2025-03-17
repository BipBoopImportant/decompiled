package Iw;

import Dw.c;
import com.optimizely.ab.config.FeatureVariable;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LIw/b;", "", "<init>", "()V", "", "string", "LDw/c;", "a", "(Ljava/lang/String;)LDw/c;", "ongoinginstoreordersrepository-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {
    public final c a(String str) {
        T t10;
        C17542s.j(str, FeatureVariable.STRING_TYPE);
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
        c cVar = (c) t10;
        return cVar == null ? c.UNKNOWN : cVar;
    }
}
