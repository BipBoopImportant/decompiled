package JH;

import XH.C16807N;
import YH.C16877v;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00150\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0012J/\u0010\u001a\u001a\u00020\u00182\u001e\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b$\u0010\u0014R,\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0004X\u0004¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"LJH/y;", "LJH/v;", "", "caseInsensitiveName", "", "", "", "values", "<init>", "(ZLjava/util/Map;)V", "name", "e", "(Ljava/lang/String;)Ljava/util/List;", "get", "(Ljava/lang/String;)Ljava/lang/String;", "c", "", "names", "()Ljava/util/Set;", "isEmpty", "()Z", "", "a", "Lkotlin/Function2;", "LXH/N;", "body", "d", "(LnI/p;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Z", "b", "Ljava/util/Map;", "getValues", "()Ljava/util/Map;", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class y implements v {

    /* renamed from: c  reason: collision with root package name */
    private final boolean f135744c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, List<String>> f135745d;

    public y(boolean z10, Map<String, ? extends List<String>> map) {
        C17542s.j(map, "values");
        this.f135744c = z10;
        Map<String, List<String>> a10 = z10 ? l.a() : new LinkedHashMap<>();
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            List list = (List) next.getValue();
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add((String) list.get(i10));
            }
            a10.put(str, arrayList);
        }
        this.f135745d = a10;
    }

    private final List<String> e(String str) {
        return this.f135745d.get(str);
    }

    public Set<Map.Entry<String, List<String>>> a() {
        return k.a(this.f135745d.entrySet());
    }

    public final boolean b() {
        return this.f135744c;
    }

    public List<String> c(String str) {
        C17542s.j(str, "name");
        return e(str);
    }

    public void d(p<? super String, ? super List<String>, C16807N> pVar) {
        C17542s.j(pVar, "body");
        for (Map.Entry next : this.f135745d.entrySet()) {
            pVar.invoke((String) next.getKey(), (List) next.getValue());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f135744c != vVar.b()) {
            return false;
        }
        return z.d(a(), vVar.a());
    }

    public String get(String str) {
        C17542s.j(str, "name");
        List<String> e10 = e(str);
        if (e10 != null) {
            return (String) C16877v.y0(e10);
        }
        return null;
    }

    public int hashCode() {
        return z.e(a(), Boolean.hashCode(this.f135744c) * 31);
    }

    public boolean isEmpty() {
        return this.f135745d.isEmpty();
    }

    public Set<String> names() {
        return k.a(this.f135745d.keySet());
    }
}
