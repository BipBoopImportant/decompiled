package MI;

import AI.C15435p;
import CI.C15496c;
import XH.C16796C;
import XH.v;
import YH.C16877v;
import YH.X;
import cJ.C17065b;
import cJ.C17066c;
import cJ.C17067d;
import cJ.C17069f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C17542s;

/* renamed from: MI.j  reason: case insensitive filesystem */
public final class C16066j {

    /* renamed from: a  reason: collision with root package name */
    public static final C16066j f136376a = new C16066j();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<C17066c, C17069f> f136377b;

    /* renamed from: c  reason: collision with root package name */
    private static final Map<C17069f, List<C17069f>> f136378c;

    /* renamed from: d  reason: collision with root package name */
    private static final Set<C17066c> f136379d;

    /* renamed from: e  reason: collision with root package name */
    private static final Set<C17066c> f136380e;

    /* renamed from: f  reason: collision with root package name */
    private static final Set<C17069f> f136381f;

    static {
        C17067d dVar = C15435p.a.f133126s;
        v a10 = C16796C.a(C16067k.d(dVar, "name"), C15435p.f133035m);
        v a11 = C16796C.a(C16067k.d(dVar, "ordinal"), C17069f.v("ordinal"));
        v a12 = C16796C.a(C16067k.c(C15435p.a.f133087X, "size"), C17069f.v("size"));
        C17066c cVar = C15435p.a.f133093b0;
        Map<C17066c, C17069f> m10 = X.m(a10, a11, a12, C16796C.a(C16067k.c(cVar, "size"), C17069f.v("size")), C16796C.a(C16067k.d(C15435p.a.f133102g, "length"), C17069f.v("length")), C16796C.a(C16067k.c(cVar, "keys"), C17069f.v("keySet")), C16796C.a(C16067k.c(cVar, "values"), C17069f.v("values")), C16796C.a(C16067k.c(cVar, "entries"), C17069f.v("entrySet")));
        f136377b = m10;
        Iterable<Map.Entry> entrySet = m10.entrySet();
        ArrayList<v> arrayList = new ArrayList<>(C16877v.y(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            arrayList.add(new v(((C17066c) entry.getKey()).f(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (v vVar : arrayList) {
            C17069f fVar = (C17069f) vVar.d();
            Object obj = linkedHashMap.get(fVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(fVar, obj);
            }
            ((List) obj).add((C17069f) vVar.c());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(X.e(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), C16877v.m0((Iterable) entry2.getValue()));
        }
        f136378c = linkedHashMap2;
        Map<C17066c, C17069f> map = f136377b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry next : map.entrySet()) {
            C17065b n10 = C15496c.f133492a.n(((C17066c) next.getKey()).d().i());
            C17542s.g(n10);
            linkedHashSet.add(n10.a().b((C17069f) next.getValue()));
        }
        f136379d = linkedHashSet;
        Set<C17066c> keySet = f136377b.keySet();
        f136380e = keySet;
        Iterable<C17066c> iterable = keySet;
        ArrayList arrayList2 = new ArrayList(C16877v.y(iterable, 10));
        for (C17066c f10 : iterable) {
            arrayList2.add(f10.f());
        }
        f136381f = C16877v.y1(arrayList2);
    }

    private C16066j() {
    }

    public final Map<C17066c, C17069f> a() {
        return f136377b;
    }

    public final List<C17069f> b(C17069f fVar) {
        C17542s.j(fVar, "name1");
        List<C17069f> list = f136378c.get(fVar);
        return list == null ? C16877v.n() : list;
    }

    public final Set<C17066c> c() {
        return f136380e;
    }

    public final Set<C17069f> d() {
        return f136381f;
    }
}
