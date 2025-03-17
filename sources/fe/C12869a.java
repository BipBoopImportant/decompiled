package FE;

/* renamed from: FE.a  reason: case insensitive filesystem */
public class C12869a {
    public static boolean a(Object obj) {
        if (obj instanceof Integer) {
            return ((double) Math.abs(((Integer) obj).intValue())) <= Math.pow(2.0d, 53.0d);
        }
        if ((obj instanceof Double) || (obj instanceof Float)) {
            double doubleValue = ((Number) obj).doubleValue();
            Double valueOf = Double.valueOf(doubleValue);
            return !valueOf.isNaN() && !valueOf.isInfinite() && Math.abs(doubleValue) <= Math.pow(2.0d, 53.0d);
        } else if (obj instanceof Long) {
            return ((double) Math.abs(((Long) obj).longValue())) <= Math.pow(2.0d, 53.0d);
        } else {
            return false;
        }
    }

    public static Integer b(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str, 10));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static boolean c(String str) {
        return str == null || str.isEmpty();
    }
}
