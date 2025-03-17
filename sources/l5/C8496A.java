package l5;

import YH.C16877v;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import s5.C8731m;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013¨\u0006\u0015"}, d2 = {"Ll5/A;", "Ll5/z;", "<init>", "()V", "Ls5/m;", "id", "Ll5/y;", "d", "(Ls5/m;)Ll5/y;", "f", "", "workSpecId", "", "remove", "(Ljava/lang/String;)Ljava/util/List;", "", "b", "(Ls5/m;)Z", "", "Ljava/util/Map;", "runs", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: l5.A  reason: case insensitive filesystem */
final class C8496A implements z {

    /* renamed from: b  reason: collision with root package name */
    private final Map<C8731m, C8528y> f54597b = new LinkedHashMap();

    public boolean b(C8731m mVar) {
        C17542s.j(mVar, "id");
        return this.f54597b.containsKey(mVar);
    }

    public C8528y d(C8731m mVar) {
        C17542s.j(mVar, "id");
        Map<C8731m, C8528y> map = this.f54597b;
        C8528y yVar = map.get(mVar);
        if (yVar == null) {
            yVar = new C8528y(mVar);
            map.put(mVar, yVar);
        }
        return yVar;
    }

    public C8528y f(C8731m mVar) {
        C17542s.j(mVar, "id");
        return this.f54597b.remove(mVar);
    }

    public List<C8528y> remove(String str) {
        C17542s.j(str, "workSpecId");
        Map<C8731m, C8528y> map = this.f54597b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            if (C17542s.e(((C8731m) next.getKey()).b(), str)) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        for (C8731m remove : linkedHashMap.keySet()) {
            this.f54597b.remove(remove);
        }
        return C16877v.t1(linkedHashMap.values());
    }
}
