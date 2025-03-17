package Q6;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LQ6/g;", "", "value", "LXH/N;", "a", "(LQ6/g;Ljava/lang/Object;)V", "apollo-api"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class b {
    public static final void a(g gVar, Object obj) {
        C17542s.j(gVar, "<this>");
        if (obj == null) {
            gVar.e3();
        } else if (obj instanceof Map) {
            gVar.C();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                gVar.q1(String.valueOf(key));
                a(gVar, value);
            }
            gVar.K();
        } else if (obj instanceof List) {
            gVar.G();
            for (Object a10 : (Iterable) obj) {
                a(gVar, a10);
            }
            gVar.E();
        } else if (obj instanceof Boolean) {
            gVar.z0(((Boolean) obj).booleanValue());
        } else if (obj instanceof Integer) {
            gVar.X(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            gVar.V(((Number) obj).longValue());
        } else if (obj instanceof Double) {
            gVar.c0(((Number) obj).doubleValue());
        } else if (obj instanceof e) {
            gVar.m1((e) obj);
        } else if (obj instanceof String) {
            gVar.T1((String) obj);
        } else {
            throw new IllegalStateException(("Cannot write " + obj + " to Json").toString());
        }
    }
}
