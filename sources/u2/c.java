package U2;

import YH.C16877v;
import YH.X;
import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LU2/c;", "", "Landroid/content/SharedPreferences;", "prefs", "", "", "keySet", "<init>", "(Landroid/content/SharedPreferences;Ljava/util/Set;)V", "", "a", "()Ljava/util/Map;", "Landroid/content/SharedPreferences;", "b", "Ljava/util/Set;", "datastore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f14232a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<String> f14233b;

    public c(SharedPreferences sharedPreferences, Set<String> set) {
        C17542s.j(sharedPreferences, "prefs");
        this.f14232a = sharedPreferences;
        this.f14233b = set;
    }

    public final Map<String, Object> a() {
        Map<String, ?> all = this.f14232a.getAll();
        C17542s.i(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : all.entrySet()) {
            String str = (String) next.getKey();
            Set<String> set = this.f14233b;
            if (set != null ? set.contains(str) : true) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(X.e(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = C16877v.y1((Iterable) value);
            }
            linkedHashMap2.put(key, value);
        }
        return linkedHashMap2;
    }
}
