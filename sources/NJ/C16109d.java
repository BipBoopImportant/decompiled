package NJ;

import KJ.C15991g;
import MJ.C16081d;
import MJ.C16083f;
import PJ.C16207a;
import PJ.C16209c;
import PJ.C16211e;
import YH.C16865i;
import com.sugarcube.core.logger.DslKt;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.p;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u000fJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010\"\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!R(\u0010(\u001a\u0004\u0018\u00010\u001a2\b\u0010#\u001a\u0004\u0018\u00010\u001a8\u0000@BX\u000e¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010%R,\u00101\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010,0+8\u0000X\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0014\u00102\u001a\u00020\u001d8VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001fR&\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000104038VX\u0004¢\u0006\u0006\u001a\u0004\b$\u00105R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00028\u0000038VX\u0004¢\u0006\u0006\u001a\u0004\b)\u00105R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00028\u0001088VX\u0004¢\u0006\u0006\u001a\u0004\b-\u00109¨\u0006;"}, d2 = {"LNJ/d;", "K", "V", "LYH/i;", "LKJ/g$a;", "LNJ/c;", "map", "<init>", "(LNJ/c;)V", "LKJ/g;", "g", "()LKJ/g;", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "LXH/N;", "clear", "()V", "", "other", "equals", "", "hashCode", "()I", "a", "LNJ/c;", "builtMap", "<set-?>", "b", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "firstKey", "c", "lastKey", "LMJ/f;", "LNJ/a;", "d", "LMJ/f;", "h", "()LMJ/f;", "hashMapBuilder", "size", "", "", "()Ljava/util/Set;", "entries", "keys", "", "()Ljava/util/Collection;", "values", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: NJ.d  reason: case insensitive filesystem */
public final class C16109d<K, V> extends C16865i<K, V> implements C15991g.a<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private C16108c<K, V> f136591a;

    /* renamed from: b  reason: collision with root package name */
    private Object f136592b;

    /* renamed from: c  reason: collision with root package name */
    private Object f136593c;

    /* renamed from: d  reason: collision with root package name */
    private final C16083f<K, C16106a<V>> f136594d;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0010\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0007"}, d2 = {"K", "V", "LNJ/a;", "a", "", "b", "", "(LNJ/a;LNJ/a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: NJ.d$a */
    static final class a extends C17544u implements p<C16106a<V>, ?, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f136595c = new a();

        a() {
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
    /* renamed from: NJ.d$b */
    static final class b extends C17544u implements p<C16106a<V>, ?, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f136596c = new b();

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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0003\u0010\u0007"}, d2 = {"K", "V", "LNJ/a;", "a", "", "b", "", "(LNJ/a;Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: NJ.d$c */
    static final class c extends C17544u implements p<C16106a<V>, ?, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f136597c = new c();

        c() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean invoke(C16106a<V> aVar, Object obj) {
            C17542s.j(aVar, "a");
            return Boolean.valueOf(C17542s.e(aVar.e(), obj));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0003\u0010\u0007"}, d2 = {"K", "V", "LNJ/a;", "a", "", "b", "", "(LNJ/a;Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: NJ.d$d  reason: collision with other inner class name */
    static final class C3357d extends C17544u implements p<C16106a<V>, ?, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final C3357d f136598c = new C3357d();

        C3357d() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean invoke(C16106a<V> aVar, Object obj) {
            C17542s.j(aVar, "a");
            return Boolean.valueOf(C17542s.e(aVar.e(), obj));
        }
    }

    public C16109d(C16108c<K, V> cVar) {
        C17542s.j(cVar, "map");
        this.f136591a = cVar;
        this.f136592b = cVar.p();
        this.f136593c = cVar.t();
        this.f136594d = cVar.q().e();
    }

    public int a() {
        return this.f136594d.size();
    }

    public Set<Map.Entry<K, V>> b() {
        return new C16110e(this);
    }

    public Set<K> c() {
        return new C16112g(this);
    }

    public void clear() {
        if (!this.f136594d.isEmpty()) {
            this.f136591a = null;
        }
        this.f136594d.clear();
        C16209c cVar = C16209c.f137201a;
        this.f136592b = cVar;
        this.f136593c = cVar;
    }

    public boolean containsKey(Object obj) {
        return this.f136594d.containsKey(obj);
    }

    public Collection<V> d() {
        return new C16115j(this);
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
        return map instanceof C16108c ? this.f136594d.k().k(((C16108c) obj).q().s(), a.f136595c) : map instanceof C16109d ? this.f136594d.k().k(((C16109d) obj).f136594d.k(), b.f136596c) : map instanceof C16081d ? this.f136594d.k().k(((C16081d) obj).s(), c.f136597c) : map instanceof C16083f ? this.f136594d.k().k(((C16083f) obj).k(), C3357d.f136598c) : C16211e.f137203a.b(this, map);
    }

    public final Object f() {
        return this.f136592b;
    }

    public C15991g<K, V> g() {
        C16108c<K, V> cVar = this.f136591a;
        boolean z10 = false;
        if (cVar != null) {
            C16207a.a(this.f136594d.h() != null);
            C16207a.a(this.f136592b == cVar.p());
            if (this.f136593c == cVar.t()) {
                z10 = true;
            }
            C16207a.a(z10);
            return cVar;
        }
        if (this.f136594d.h() == null) {
            z10 = true;
        }
        C16207a.a(z10);
        C16108c<K, V> cVar2 = new C16108c<>(this.f136592b, this.f136593c, this.f136594d.g());
        this.f136591a = cVar2;
        return cVar2;
    }

    public V get(Object obj) {
        C16106a aVar = this.f136594d.get(obj);
        if (aVar != null) {
            return aVar.e();
        }
        return null;
    }

    public final C16083f<K, C16106a<V>> h() {
        return this.f136594d;
    }

    public int hashCode() {
        return C16211e.f137203a.c(this);
    }

    public V put(K k10, V v10) {
        C16106a aVar = this.f136594d.get(k10);
        if (aVar == null) {
            this.f136591a = null;
            if (isEmpty()) {
                this.f136592b = k10;
                this.f136593c = k10;
                this.f136594d.put(k10, new C16106a(v10));
            } else {
                Object obj = this.f136593c;
                C16106a<V> aVar2 = this.f136594d.get(obj);
                C17542s.g(aVar2);
                C16106a aVar3 = aVar2;
                C16207a.a(!aVar3.a());
                this.f136594d.put(obj, aVar3.f(k10));
                this.f136594d.put(k10, new C16106a(v10, obj));
                this.f136593c = k10;
            }
            return null;
        } else if (aVar.e() == v10) {
            return v10;
        } else {
            this.f136591a = null;
            this.f136594d.put(k10, aVar.h(v10));
            return aVar.e();
        }
    }

    public V remove(Object obj) {
        C16106a remove = this.f136594d.remove(obj);
        if (remove == null) {
            return null;
        }
        this.f136591a = null;
        if (remove.b()) {
            C16106a<V> aVar = this.f136594d.get(remove.d());
            C17542s.g(aVar);
            this.f136594d.put(remove.d(), aVar.f(remove.c()));
        } else {
            this.f136592b = remove.c();
        }
        if (remove.a()) {
            C16106a<V> aVar2 = this.f136594d.get(remove.c());
            C17542s.g(aVar2);
            this.f136594d.put(remove.c(), aVar2.g(remove.d()));
        } else {
            this.f136593c = remove.d();
        }
        return remove.e();
    }

    public final boolean remove(Object obj, Object obj2) {
        C16106a aVar = this.f136594d.get(obj);
        if (aVar == null || !C17542s.e(aVar.e(), obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
