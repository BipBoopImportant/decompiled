package JH;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import oI.C17697e;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0006J!\u0010\u0014\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\u00020\u00122\u0014\u0010\u0017\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u000fJ\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u001c\u0010\rJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u001d8VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040%8VX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R&\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000)0%8VX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010'R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000,8VX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"LJH/h;", "", "Value", "", "", "<init>", "()V", "key", "", "b", "(Ljava/lang/String;)Z", "value", "containsValue", "(Ljava/lang/Object;)Z", "c", "(Ljava/lang/String;)Ljava/lang/Object;", "isEmpty", "()Z", "LXH/N;", "clear", "i", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "putAll", "(Ljava/util/Map;)V", "k", "other", "equals", "", "hashCode", "()I", "LJH/i;", "a", "Ljava/util/Map;", "delegate", "size", "", "f", "()Ljava/util/Set;", "keys", "", "d", "entries", "", "h", "()Ljava/util/Collection;", "values", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h<Value> implements Map<String, Value>, C17697e {

    /* renamed from: a  reason: collision with root package name */
    private final Map<i, Value> f135714a = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Value", "", "LJH/i;", "", "a", "(Ljava/util/Map$Entry;)Ljava/util/Map$Entry;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<Map.Entry<i, Value>, Map.Entry<String, Value>> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f135715c = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final Map.Entry<String, Value> invoke(Map.Entry<i, Value> entry) {
            C17542s.j(entry, "$this$$receiver");
            return new p(entry.getKey().a(), entry.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010'\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Value", "", "", "LJH/i;", "a", "(Ljava/util/Map$Entry;)Ljava/util/Map$Entry;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<Map.Entry<String, Value>, Map.Entry<i, Value>> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f135716c = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final Map.Entry<i, Value> invoke(Map.Entry<String, Value> entry) {
            C17542s.j(entry, "$this$$receiver");
            return new p(C15953A.a(entry.getKey()), entry.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Value", "LJH/i;", "", "a", "(LJH/i;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17642l<i, String> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f135717c = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(i iVar) {
            C17542s.j(iVar, "$this$$receiver");
            return iVar.a();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Value", "", "LJH/i;", "a", "(Ljava/lang/String;)LJH/i;"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17642l<String, i> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f135718c = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final i invoke(String str) {
            C17542s.j(str, "$this$$receiver");
            return C15953A.a(str);
        }
    }

    public int a() {
        return this.f135714a.size();
    }

    public boolean b(String str) {
        C17542s.j(str, "key");
        return this.f135714a.containsKey(new i(str));
    }

    public Value c(String str) {
        C17542s.j(str, "key");
        return this.f135714a.get(C15953A.a(str));
    }

    public void clear() {
        this.f135714a.clear();
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return b((String) obj);
    }

    public boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f135714a.containsValue(obj);
    }

    public Set<Map.Entry<String, Value>> d() {
        return new o(this.f135714a.entrySet(), a.f135715c, b.f135716c);
    }

    public final /* bridge */ Set<Map.Entry<String, Value>> entrySet() {
        return d();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof h)) {
            return false;
        }
        return C17542s.e(((h) obj).f135714a, this.f135714a);
    }

    public Set<String> f() {
        return new o(this.f135714a.keySet(), c.f135717c, d.f135718c);
    }

    public final /* bridge */ Value get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return c((String) obj);
    }

    public Collection<Value> h() {
        return this.f135714a.values();
    }

    public int hashCode() {
        return this.f135714a.hashCode();
    }

    /* renamed from: i */
    public Value put(String str, Value value) {
        C17542s.j(str, "key");
        C17542s.j(value, "value");
        return this.f135714a.put(C15953A.a(str), value);
    }

    public boolean isEmpty() {
        return this.f135714a.isEmpty();
    }

    public Value k(String str) {
        C17542s.j(str, "key");
        return this.f135714a.remove(C15953A.a(str));
    }

    public final /* bridge */ Set<String> keySet() {
        return f();
    }

    public void putAll(Map<? extends String, ? extends Value> map) {
        C17542s.j(map, "from");
        for (Map.Entry next : map.entrySet()) {
            put((String) next.getKey(), next.getValue());
        }
    }

    public final /* bridge */ Value remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return k((String) obj);
    }

    public final /* bridge */ int size() {
        return a();
    }

    public final /* bridge */ Collection<Value> values() {
        return h();
    }
}
