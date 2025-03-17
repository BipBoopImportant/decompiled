package Ae;

import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J1\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00028\u00002\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LAe/h;", "T", "", "event", "", "", "values", "LXH/N;", "b", "(Ljava/lang/Object;Ljava/util/Map;)V", "reasonCode", "e", "(Ljava/lang/Object;Ljava/lang/String;)V", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface h<T> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(h hVar, Object obj, Map map, int i10, Object obj2) {
            if (obj2 == null) {
                if ((i10 & 2) != 0) {
                    map = null;
                }
                hVar.b(obj, map);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackEvent");
        }
    }

    void b(T t10, Map<String, ? extends Object> map);

    void e(T t10, String str);
}
