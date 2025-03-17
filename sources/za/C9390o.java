package Za;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: Za.o  reason: case insensitive filesystem */
public final class C9390o {

    /* renamed from: a  reason: collision with root package name */
    private static final Set f65039a = new HashSet(Arrays.asList(new String[]{"app_update", "review"}));

    /* renamed from: b  reason: collision with root package name */
    private static final Set f65040b = new HashSet(Arrays.asList(new String[]{"native", "unity"}));

    /* renamed from: c  reason: collision with root package name */
    private static final Map f65041c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private static final s f65042d = new s("PlayCoreVersion");

    public static synchronized Map a(String str) {
        Map map;
        synchronized (C9390o.class) {
            try {
                Map map2 = f65041c;
                if (!map2.containsKey("app_update")) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("java", 11004);
                    map2.put("app_update", hashMap);
                }
                map = (Map) map2.get("app_update");
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return map;
    }
}
