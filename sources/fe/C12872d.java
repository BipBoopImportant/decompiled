package FE;

import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* renamed from: FE.d  reason: case insensitive filesystem */
public final class C12872d {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f109757a = LoggerFactory.getLogger((Class<?>) C12872d.class);

    public static Double a(Map<String, ?> map) {
        Double d10 = null;
        if (map != null) {
            C12876h hVar = C12876h.VALUE;
            if (map.containsKey(hVar.toString())) {
                Object obj = map.get(hVar.toString());
                if (obj instanceof Number) {
                    Double valueOf = Double.valueOf(((Number) obj).doubleValue());
                    if (valueOf.isInfinite() || valueOf.isNaN()) {
                        f109757a.warn("Failed to parse numeric metric value \"{}\" from event tags.", (Object) obj);
                    } else {
                        d10 = valueOf;
                    }
                    f109757a.info("Parsed numeric metric value \"{}\" from event tags.", (Object) d10);
                } else {
                    f109757a.warn("Failed to parse numeric metric value \"{}\" from event tags.", (Object) obj);
                }
            }
        }
        return d10;
    }

    public static Long b(Map<String, ?> map) {
        if (map != null) {
            C12876h hVar = C12876h.REVENUE;
            if (map.containsKey(hVar.toString())) {
                Object obj = map.get(hVar.toString());
                if (Long.class.isInstance(obj)) {
                    Long l10 = (Long) obj;
                    f109757a.info("Parsed revenue value \"{}\" from event tags.", (Object) l10);
                    return l10;
                } else if (Integer.class.isInstance(obj)) {
                    Long valueOf = Long.valueOf(((Integer) obj).longValue());
                    f109757a.info("Parsed revenue value \"{}\" from event tags.", (Object) valueOf);
                    return valueOf;
                } else {
                    f109757a.warn("Failed to parse revenue value \"{}\" from event tags.", (Object) obj);
                }
            }
        }
        return null;
    }
}
