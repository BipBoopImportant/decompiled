package a9;

import D8.c;
import YH.C16877v;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.f  reason: case insensitive filesystem */
public final class C6821f {

    /* renamed from: a  reason: collision with root package name */
    public final c f42543a = new c("TimeCollector");

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f42544b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f42545c = new LinkedHashMap();

    public static void a(C6821f fVar, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        fVar.getClass();
        C17542s.j(str, "key");
        if (fVar.f42544b.containsKey(str)) {
            c cVar = fVar.f42543a;
            cVar.f("Time measurement with key \"" + str + "\" already in progress");
            return;
        }
        fVar.f42544b.put(str, Long.valueOf(currentTimeMillis));
    }

    public static void b(C6821f fVar, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        fVar.getClass();
        C17542s.j(str, "key");
        if (!fVar.f42544b.containsKey(str)) {
            c cVar = fVar.f42543a;
            cVar.f("Time measurement with key \"" + str + "\" not started");
            return;
        }
        Long l10 = (Long) fVar.f42544b.get(str);
        if (l10 != null) {
            long longValue = currentTimeMillis - l10.longValue();
            if (fVar.f42545c.containsKey(str)) {
                List list = (List) fVar.f42545c.get(str);
                if (list != null) {
                    list.add(Long.valueOf(longValue));
                }
            } else {
                fVar.f42545c.put(str, C16877v.t(Long.valueOf(longValue)));
            }
            Long l11 = (Long) fVar.f42544b.remove(str);
        }
    }
}
