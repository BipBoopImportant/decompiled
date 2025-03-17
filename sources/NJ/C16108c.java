package NJ;

import KJ.C15986b;
import KJ.C15989e;
import KJ.C15991g;
import MJ.C16081d;
import MJ.C16083f;
import PJ.C16209c;
import YH.C16862f;
import com.sugarcube.core.logger.DslKt;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001f*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u00010B5\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e0\u0011H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0014\u0010\u001b\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00152\b\u0010!\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\"\u0010\u0017J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0000X\u0004¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R,\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\b8\u0000X\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u00101\u001a\u00020#8VX\u0004¢\u0006\u0006\u001a\u0004\b0\u0010%R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\r8VX\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0010R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00028\u0001048VX\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"LNJ/c;", "K", "V", "LYH/f;", "LKJ/g;", "", "firstKey", "lastKey", "LMJ/d;", "LNJ/a;", "hashMap", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;LMJ/d;)V", "LKJ/e;", "", "o", "()LKJ/e;", "", "f", "()Ljava/util/Set;", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "m", "putAll", "(Ljava/util/Map;)LKJ/g;", "LKJ/g$a;", "e", "()LKJ/g$a;", "other", "equals", "", "hashCode", "()I", "b", "Ljava/lang/Object;", "p", "()Ljava/lang/Object;", "c", "t", "d", "LMJ/d;", "q", "()LMJ/d;", "a", "size", "s", "keys", "LKJ/b;", "u", "()LKJ/b;", "values", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: NJ.c  reason: case insensitive filesystem */
public final class C16108c<K, V> extends C16862f<K, V> implements C15991g<K, V> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f136582e = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final C16108c f136583f;

    /* renamed from: b  reason: collision with root package name */
    private final Object f136584b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f136585c;

    /* renamed from: d  reason: collision with root package name */
    private final C16081d<K, C16106a<V>> f136586d;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LNJ/c$a;", "", "<init>", "()V", "K", "V", "LNJ/c;", "a", "()LNJ/c;", "", "EMPTY", "LNJ/c;", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: NJ.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <K, V> C16108c<K, V> a() {
            C16108c<K, V> n10 = C16108c.f136583f;
            C17542s.h(n10, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K of kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf, V of kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf>");
            return n10;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0010\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0007"}, d2 = {"K", "V", "LNJ/a;", "a", "", "b", "", "(LNJ/a;LNJ/a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: NJ.c$b */
    static final class b extends C17544u implements p<C16106a<V>, ?, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f136587c = new b();

        b() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean invoke(C16106a<V> aVar, C16106a<? extends Object> aVar2) {
            C17542s.j(aVar, "a");
            C17542s.j(aVar2, DslKt.INDICATOR_BACKGROUND);
            return Boolean.valueOf(C17542s.e(aVar.e(), aVar2.e()));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0010\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0007"}, d2 = {"K", "V", "LNJ/a;", "a", "", "b", "", "(LNJ/a;LNJ/a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: NJ.c$c  reason: collision with other inner class name */
    static final class C3356c extends C17544u implements p<C16106a<V>, ?, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final C3356c f136588c = new C3356c();

        C3356c() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean invoke(C16106a<V> aVar, C16106a<? extends Object> aVar2) {
            C17542s.j(aVar, "a");
            C17542s.j(aVar2, DslKt.INDICATOR_BACKGROUND);
            return Boolean.valueOf(C17542s.e(aVar.e(), aVar2.e()));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0003\u0010\u0007"}, d2 = {"K", "V", "LNJ/a;", "a", "", "b", "", "(LNJ/a;Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: NJ.c$d */
    static final class d extends C17544u implements p<C16106a<V>, ?, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f136589c = new d();

        d() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean invoke(C16106a<V> aVar, Object obj) {
            C17542s.j(aVar, "a");
            return Boolean.valueOf(C17542s.e(aVar.e(), obj));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0003\u0010\u0007"}, d2 = {"K", "V", "LNJ/a;", "a", "", "b", "", "(LNJ/a;Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: NJ.c$e */
    static final class e extends C17544u implements p<C16106a<V>, ?, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final e f136590c = new e();

        e() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean invoke(C16106a<V> aVar, Object obj) {
            C17542s.j(aVar, "a");
            return Boolean.valueOf(C17542s.e(aVar.e(), obj));
        }
    }

    static {
        C16209c cVar = C16209c.f137201a;
        f136583f = new C16108c(cVar, cVar, C16081d.f136411d.a());
    }

    public C16108c(Object obj, Object obj2, C16081d<K, C16106a<V>> dVar) {
        C17542s.j(dVar, "hashMap");
        this.f136584b = obj;
        this.f136585c = obj2;
        this.f136586d = dVar;
    }

    private final C15989e<Map.Entry<K, V>> o() {
        return new C16117l(this);
    }

    public int a() {
        return this.f136586d.size();
    }

    public boolean containsKey(Object obj) {
        return this.f136586d.containsKey(obj);
    }

    public C15991g.a<K, V> e() {
        return new C16109d(this);
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
        return map instanceof C16108c ? this.f136586d.s().k(((C16108c) obj).f136586d.s(), b.f136587c) : map instanceof C16109d ? this.f136586d.s().k(((C16109d) obj).h().k(), C3356c.f136588c) : map instanceof C16081d ? this.f136586d.s().k(((C16081d) obj).s(), d.f136589c) : map instanceof C16083f ? this.f136586d.s().k(((C16083f) obj).k(), e.f136590c) : super.equals(obj);
    }

    public final Set<Map.Entry<K, V>> f() {
        return o();
    }

    public V get(Object obj) {
        C16106a aVar = this.f136586d.get(obj);
        if (aVar != null) {
            return aVar.e();
        }
        return null;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public final Object p() {
        return this.f136584b;
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

    public final C16081d<K, C16106a<V>> q() {
        return this.f136586d;
    }

    /* renamed from: s */
    public C15989e<K> h() {
        return new C16119n(this);
    }

    public final Object t() {
        return this.f136585c;
    }

    /* renamed from: u */
    public C15986b<V> i() {
        return new C16122q(this);
    }
}
