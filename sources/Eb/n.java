package eb;

import fb.C9693i;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private static final Map f72583a = new HashMap();

    static {
        new HashSet(Arrays.asList(new String[]{"native", "unity"}));
        new C9693i("PlayCoreVersion");
    }

    public static synchronized Map a() {
        Map map;
        synchronized (n.class) {
            map = f72583a;
            map.put("java", 20002);
        }
        return map;
    }
}
