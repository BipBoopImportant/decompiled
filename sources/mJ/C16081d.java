package MJ;

import KJ.C15986b;
import KJ.C15989e;
import KJ.C15991g;
import NJ.C16106a;
import NJ.C16108c;
import NJ.C16109d;
import YH.C16862f;
import com.sugarcube.core.logger.DslKt;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 1*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001*B#\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u000fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0014\u0010\u0019\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b!\u0010\u0015J\u000f\u0010\"\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010#R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0000X\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010#R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u000eR\u001a\u00100\u001a\b\u0012\u0004\u0012\u00028\u00010-8VX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"LMJ/d;", "K", "V", "LYH/f;", "LKJ/g;", "LMJ/t;", "node", "", "size", "<init>", "(LMJ/t;I)V", "LKJ/e;", "", "p", "()LKJ/e;", "", "f", "()Ljava/util/Set;", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "m", "putAll", "(Ljava/util/Map;)LKJ/g;", "LMJ/f;", "o", "()LMJ/f;", "", "other", "equals", "hashCode", "()I", "b", "LMJ/t;", "s", "()LMJ/t;", "c", "I", "a", "q", "keys", "LKJ/b;", "t", "()LKJ/b;", "values", "d", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: MJ.d  reason: case insensitive filesystem */
public final class C16081d<K, V> extends C16862f<K, V> implements C15991g<K, V> {

    /* renamed from: d  reason: collision with root package name */
    public static final a f136411d = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final C16081d f136412e = new C16081d(t.f136443e.a(), 0);

    /* renamed from: b  reason: collision with root package name */
    private final t<K, V> f136413b;

    /* renamed from: c  reason: collision with root package name */
    private final int f136414c;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LMJ/d$a;", "", "<init>", "()V", "K", "V", "LMJ/d;", "a", "()LMJ/d;", "", "EMPTY", "LMJ/d;", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: MJ.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <K, V> C16081d<K, V> a() {
            C16081d<K, V> n10 = C16081d.f136412e;
            C17542s.h(n10, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return n10;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00012\u0010\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003H\n¢\u0006\u0004\b\u0002\u0010\u0007"}, d2 = {"K", "V", "a", "LNJ/a;", "", "b", "", "(Ljava/lang/Object;LNJ/a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: MJ.d$b */
    static final class b extends C17544u implements p<V, ?, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f136415c = new b();

        b() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean invoke(V v10, C16106a<? extends Object> aVar) {
            C17542s.j(aVar, DslKt.INDICATOR_BACKGROUND);
            return Boolean.valueOf(C17542s.e(v10, aVar.e()));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00012\u0010\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003H\n¢\u0006\u0004\b\u0002\u0010\u0007"}, d2 = {"K", "V", "a", "LNJ/a;", "", "b", "", "(Ljava/lang/Object;LNJ/a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: MJ.d$c */
    static final class c extends C17544u implements p<V, ?, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f136416c = new c();

        c() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean invoke(V v10, C16106a<? extends Object> aVar) {
            C17542s.j(aVar, DslKt.INDICATOR_BACKGROUND);
            return Boolean.valueOf(C17542s.e(v10, aVar.e()));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0002\u0010\u0006"}, d2 = {"K", "V", "a", "", "b", "", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: MJ.d$d  reason: collision with other inner class name */
    static final class C3352d extends C17544u implements p<V, ?, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final C3352d f136417c = new C3352d();

        C3352d() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean invoke(V v10, Object obj) {
            return Boolean.valueOf(C17542s.e(v10, obj));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0002\u0010\u0006"}, d2 = {"K", "V", "a", "", "b", "", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: MJ.d$e */
    static final class e extends C17544u implements p<V, ?, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final e f136418c = new e();

        e() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean invoke(V v10, Object obj) {
            return Boolean.valueOf(C17542s.e(v10, obj));
        }
    }

    public C16081d(t<K, V> tVar, int i10) {
        C17542s.j(tVar, "node");
        this.f136413b = tVar;
        this.f136414c = i10;
    }

    private final C15989e<Map.Entry<K, V>> p() {
        return new n(this);
    }

    public int a() {
        return this.f136414c;
    }

    public boolean containsKey(Object obj) {
        return this.f136413b.g(obj != null ? obj.hashCode() : 0, obj, 0);
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
        return map instanceof C16108c ? this.f136413b.k(((C16108c) obj).q().f136413b, b.f136415c) : map instanceof C16109d ? this.f136413b.k(((C16109d) obj).h().k(), c.f136416c) : map instanceof C16081d ? this.f136413b.k(((C16081d) obj).f136413b, C3352d.f136417c) : map instanceof C16083f ? this.f136413b.k(((C16083f) obj).k(), e.f136418c) : super.equals(obj);
    }

    public final Set<Map.Entry<K, V>> f() {
        return p();
    }

    public V get(Object obj) {
        return this.f136413b.l(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* renamed from: o */
    public C16083f<K, V> e() {
        return new C16083f<>(this);
    }

    public C15991g<K, V> putAll(Map<? extends K, ? extends V> map) {
        C17542s.j(map, DslKt.INDICATOR_MAIN);
        if (map.isEmpty()) {
            return this;
        }
        C17542s.h(this, "null cannot be cast to non-null type kotlinx.collections.immutable.PersistentMap<K of kotlinx.collections.immutable.ExtensionsKt.mutate, V of kotlinx.collections.immutable.ExtensionsKt.mutate>");
        C15991g.a e10 = e();
        e10.putAll(map);
        return e10.g();
    }

    /* renamed from: q */
    public C15989e<K> h() {
        return new p(this);
    }

    public final t<K, V> s() {
        return this.f136413b;
    }

    /* renamed from: t */
    public C15986b<V> i() {
        return new r(this);
    }
}
