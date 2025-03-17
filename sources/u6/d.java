package U6;

import M6.l;
import Q6.a;
import WK.C16772g;
import XH.C16796C;
import YH.C16877v;
import YH.X;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.W;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\b2\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJC\u0010\u000f\u001a\u00020\b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u0002`\f2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u00062\u0006\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u0014J9\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u00062\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u0003R&\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u0002`\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR)\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\"R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020%0)8\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b&\u0010+R$\u00101\u001a\u00020-2\u0006\u0010.\u001a\u00020-8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0013\u0010/\u001a\u0004\b \u00100R$\u00102\u001a\u00020-2\u0006\u0010.\u001a\u00020-8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u001a\u0010/\u001a\u0004\b*\u00100¨\u00063"}, d2 = {"LU6/d;", "", "<init>", "()V", "", "", "Lcom/apollographql/apollo3/internal/JsonMap;", "incrementalItem", "LXH/N;", "h", "(Ljava/util/Map;)V", "", "Lcom/apollographql/apollo3/internal/MutableJsonMap;", "destination", "map", "a", "(Ljava/util/Map;Ljava/util/Map;)V", "LWK/g;", "json", "e", "(LWK/g;)Ljava/util/Map;", "", "path", "i", "(Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "payload", "f", "g", "(Ljava/util/Map;)Ljava/util/Map;", "j", "Ljava/util/Map;", "_merged", "b", "getMerged", "()Ljava/util/Map;", "merged", "", "LM6/l;", "c", "Ljava/util/Set;", "_mergedFragmentIds", "", "d", "()Ljava/util/Set;", "mergedFragmentIds", "", "<set-?>", "Z", "()Z", "hasNext", "isEmptyPayload", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f40262a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Object> f40263b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<l> f40264c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<l> f40265d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f40266e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f40267f;

    public d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f40262a = linkedHashMap;
        this.f40263b = linkedHashMap;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f40264c = linkedHashSet;
        this.f40265d = linkedHashSet;
    }

    private final void a(Map<String, Object> map, Map<String, ? extends Object> map2) {
        for (Map.Entry next : map2.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (!map.containsKey(str) || !W.q(map.get(str))) {
                map.put(str, value);
            } else {
                Object obj = map.get(str);
                C17542s.h(obj, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>{ com.apollographql.apollo3.internal.DeferredJsonMergerKt.MutableJsonMap }");
                Map d10 = W.d(obj);
                Map map3 = value instanceof Map ? (Map) value : null;
                if (map3 != null) {
                    a(d10, map3);
                } else {
                    throw new IllegalStateException(('\'' + str + "' is an object in destination but not in map").toString());
                }
            }
        }
    }

    private final Map<String, Object> e(C16772g gVar) {
        Object d10 = a.d(new Q6.d(gVar));
        C17542s.h(d10, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>{ com.apollographql.apollo3.internal.DeferredJsonMergerKt.JsonMap }");
        return (Map) d10;
    }

    private final void h(Map<String, ? extends Object> map) {
        Map map2 = (Map) map.get("data");
        Object obj = map.get("path");
        C17542s.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = this.f40263b.get("data");
        C17542s.h(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>{ com.apollographql.apollo3.internal.DeferredJsonMergerKt.JsonMap }");
        Map map3 = (Map) obj2;
        if (map2 != null) {
            Object i10 = i(map3, list);
            C17542s.h(i10, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>{ com.apollographql.apollo3.internal.DeferredJsonMergerKt.MutableJsonMap }");
            a(W.d(i10), map2);
            this.f40264c.add(new l(list, (String) map.get("label")));
        }
    }

    private final Object i(Map<String, ? extends Object> map, List<? extends Object> list) {
        Object obj;
        Object obj2 = map;
        for (Object next : list) {
            if (obj2 instanceof List) {
                C17542s.h(next, "null cannot be cast to non-null type kotlin.Int");
                obj = ((List) obj2).get(((Integer) next).intValue());
            } else {
                C17542s.h(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>{ com.apollographql.apollo3.internal.DeferredJsonMergerKt.JsonMap }");
                obj = ((Map) obj2).get(next);
            }
            obj2 = obj;
        }
        return obj2;
    }

    public final boolean b() {
        return this.f40266e;
    }

    public final Set<l> c() {
        return this.f40265d;
    }

    public final boolean d() {
        return this.f40267f;
    }

    public final Map<String, Object> f(C16772g gVar) {
        C17542s.j(gVar, "payload");
        return g(e(gVar));
    }

    public final Map<String, Object> g(Map<String, ? extends Object> map) {
        C17542s.j(map, "payload");
        if (this.f40263b.isEmpty()) {
            this.f40262a.putAll(map);
            return this.f40263b;
        }
        Object obj = map.get("incremental");
        List<Map> list = obj instanceof List ? (List) obj : null;
        boolean z10 = false;
        if (list == null) {
            this.f40267f = true;
        } else {
            this.f40267f = false;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map map2 : list) {
                h(map2);
                Object obj2 = map2.get("errors");
                List list2 = obj2 instanceof List ? (List) obj2 : null;
                if (list2 != null) {
                    C16877v.E(arrayList, list2);
                }
                Object obj3 = map2.get("extensions");
                Map map3 = obj3 instanceof Map ? (Map) obj3 : null;
                if (map3 != null) {
                    arrayList2.add(map3);
                }
            }
            if (!arrayList.isEmpty()) {
                this.f40262a.put("errors", arrayList);
            } else {
                this.f40262a.remove("errors");
            }
            if (!arrayList2.isEmpty()) {
                this.f40262a.put("extensions", X.f(C16796C.a("incremental", arrayList2)));
            } else {
                this.f40262a.remove("extensions");
            }
        }
        Boolean bool = (Boolean) map.get("hasNext");
        if (bool != null) {
            z10 = bool.booleanValue();
        }
        this.f40266e = z10;
        return this.f40263b;
    }

    public final void j() {
        this.f40262a.clear();
        this.f40264c.clear();
        this.f40266e = true;
        this.f40267f = false;
    }
}
