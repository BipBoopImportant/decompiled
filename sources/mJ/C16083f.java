package MJ;

import KJ.C15991g;
import NJ.C16106a;
import NJ.C16108c;
import NJ.C16109d;
import PJ.C16208b;
import PJ.C16211e;
import PJ.f;
import YH.C16865i;
import com.sugarcube.core.logger.DslKt;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\u00162\u0014\u0010\u0015\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u0010J\u001d\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010\u000eJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R@\u0010'\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00052\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00058\u0000@BX\u000e¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\nR$\u0010-\u001a\u00020(2\u0006\u0010#\u001a\u00020(8\u0000@BX\u000e¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,RB\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010.2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010.8\u0000@@X\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010<\u001a\u0004\u0018\u00018\u00018\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010B\u001a\u00020 8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010\"\"\u0004\b@\u0010AR*\u0010D\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020 8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b\t\u0010>\u001a\u0004\b$\u0010\"\"\u0004\bC\u0010AR&\u0010H\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010F0E8VX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010GR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000E8VX\u0004¢\u0006\u0006\u001a\u0004\b/\u0010GR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00010J8VX\u0004¢\u0006\u0006\u001a\u0004\b6\u0010K¨\u0006M"}, d2 = {"LMJ/f;", "K", "V", "LKJ/g$a;", "LYH/i;", "LMJ/d;", "map", "<init>", "(LMJ/d;)V", "f", "()LMJ/d;", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "LXH/N;", "putAll", "(Ljava/util/Map;)V", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "clear", "()V", "", "other", "equals", "", "hashCode", "()I", "<set-?>", "a", "LMJ/d;", "h", "builtMap", "LPJ/f;", "b", "LPJ/f;", "l", "()LPJ/f;", "ownership", "LMJ/t;", "c", "LMJ/t;", "k", "()LMJ/t;", "n", "(LMJ/t;)V", "node", "d", "Ljava/lang/Object;", "getOperationResult$kotlinx_collections_immutable", "()Ljava/lang/Object;", "o", "(Ljava/lang/Object;)V", "operationResult", "e", "I", "i", "m", "(I)V", "modCount", "p", "size", "", "", "()Ljava/util/Set;", "entries", "keys", "", "()Ljava/util/Collection;", "values", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: MJ.f  reason: case insensitive filesystem */
public final class C16083f<K, V> extends C16865i<K, V> implements C15991g.a<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private C16081d<K, V> f136422a;

    /* renamed from: b  reason: collision with root package name */
    private f f136423b = new f();

    /* renamed from: c  reason: collision with root package name */
    private t<K, V> f136424c;

    /* renamed from: d  reason: collision with root package name */
    private V f136425d;

    /* renamed from: e  reason: collision with root package name */
    private int f136426e;

    /* renamed from: f  reason: collision with root package name */
    private int f136427f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0002\u0010\u0006"}, d2 = {"K", "V", "a", "", "b", "", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: MJ.f$a */
    static final class a extends C17544u implements p<V, ?, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f136428c = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean invoke(V v10, Object obj) {
            return Boolean.valueOf(C17542s.e(v10, obj));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0002\u0010\u0006"}, d2 = {"K", "V", "a", "", "b", "", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: MJ.f$b */
    static final class b extends C17544u implements p<V, ?, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f136429c = new b();

        b() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean invoke(V v10, Object obj) {
            return Boolean.valueOf(C17542s.e(v10, obj));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00012\u0010\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003H\n¢\u0006\u0004\b\u0002\u0010\u0007"}, d2 = {"K", "V", "a", "LNJ/a;", "", "b", "", "(Ljava/lang/Object;LNJ/a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: MJ.f$c */
    static final class c extends C17544u implements p<V, ?, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f136430c = new c();

        c() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean invoke(V v10, C16106a<? extends Object> aVar) {
            C17542s.j(aVar, DslKt.INDICATOR_BACKGROUND);
            return Boolean.valueOf(C17542s.e(v10, aVar.e()));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00012\u0010\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003H\n¢\u0006\u0004\b\u0002\u0010\u0007"}, d2 = {"K", "V", "a", "LNJ/a;", "", "b", "", "(Ljava/lang/Object;LNJ/a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: MJ.f$d */
    static final class d extends C17544u implements p<V, ?, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f136431c = new d();

        d() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean invoke(V v10, C16106a<? extends Object> aVar) {
            C17542s.j(aVar, DslKt.INDICATOR_BACKGROUND);
            return Boolean.valueOf(C17542s.e(v10, aVar.e()));
        }
    }

    public C16083f(C16081d<K, V> dVar) {
        C17542s.j(dVar, "map");
        this.f136422a = dVar;
        this.f136424c = dVar.s();
        this.f136427f = dVar.size();
    }

    public int a() {
        return this.f136427f;
    }

    public Set<Map.Entry<K, V>> b() {
        return new C16085h(this);
    }

    public Set<K> c() {
        return new C16087j(this);
    }

    public void clear() {
        t a10 = t.f136443e.a();
        C17542s.h(a10, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        n(a10);
        p(0);
    }

    public boolean containsKey(Object obj) {
        return this.f136424c.g(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public Collection<V> d() {
        return new l(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        return map instanceof C16081d ? this.f136424c.k(((C16081d) obj).s(), a.f136428c) : map instanceof C16083f ? this.f136424c.k(((C16083f) obj).f136424c, b.f136429c) : map instanceof C16108c ? this.f136424c.k(((C16108c) obj).q().s(), c.f136430c) : map instanceof C16109d ? this.f136424c.k(((C16109d) obj).h().f136424c, d.f136431c) : C16211e.f137203a.b(this, map);
    }

    /* renamed from: f */
    public C16081d<K, V> g() {
        C16081d<K, V> dVar = this.f136422a;
        if (dVar != null) {
            return dVar;
        }
        C16081d<K, V> dVar2 = new C16081d<>(this.f136424c, size());
        this.f136422a = dVar2;
        this.f136423b = new f();
        return dVar2;
    }

    public V get(Object obj) {
        return this.f136424c.l(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public final C16081d<K, V> h() {
        return this.f136422a;
    }

    public int hashCode() {
        return C16211e.f137203a.c(this);
    }

    public final int i() {
        return this.f136426e;
    }

    public final t<K, V> k() {
        return this.f136424c;
    }

    public final f l() {
        return this.f136423b;
    }

    public final void m(int i10) {
        this.f136426e = i10;
    }

    public final void n(t<K, V> tVar) {
        C17542s.j(tVar, "value");
        if (tVar != this.f136424c) {
            this.f136424c = tVar;
            this.f136422a = null;
        }
    }

    public final void o(V v10) {
        this.f136425d = v10;
    }

    public void p(int i10) {
        this.f136427f = i10;
        this.f136426e++;
    }

    public V put(K k10, V v10) {
        this.f136425d = null;
        n(this.f136424c.y(k10 != null ? k10.hashCode() : 0, k10, v10, 0, this));
        return this.f136425d;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        C17542s.j(map, "from");
        if (!map.isEmpty()) {
            C16081d dVar = map instanceof C16081d ? (C16081d) map : null;
            if (dVar == null) {
                C16083f fVar = map instanceof C16083f ? (C16083f) map : null;
                dVar = fVar != null ? fVar.g() : null;
            }
            if (dVar != null) {
                C16208b bVar = new C16208b(0, 1, (DefaultConstructorMarker) null);
                int size = size();
                t<K, V> tVar = this.f136424c;
                t s10 = dVar.s();
                C17542s.h(s10, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
                n(tVar.z(s10, 0, bVar, this));
                int size2 = (dVar.size() + size) - bVar.a();
                if (size != size2) {
                    p(size2);
                    return;
                }
                return;
            }
            super.putAll(map);
        }
    }

    public V remove(Object obj) {
        this.f136425d = null;
        t<K, V> B10 = this.f136424c.B(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (B10 == null) {
            B10 = t.f136443e.a();
            C17542s.h(B10, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        n(B10);
        return this.f136425d;
    }

    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        t<K, V> C10 = this.f136424c.C(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (C10 == null) {
            C10 = t.f136443e.a();
            C17542s.h(C10, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        n(C10);
        if (size != size()) {
            return true;
        }
        return false;
    }
}
