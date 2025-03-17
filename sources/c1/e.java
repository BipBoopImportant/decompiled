package c1;

import U0.B0;
import U0.C4906v;
import U0.C4914z;
import U0.G1;
import Z0.d;
import Z0.f;
import Z0.t;
import b1.C5258e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00162\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u0005:\u0002\u0017\u000eB3\u0012\"\u0010\u0007\u001a\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\u00020\u00052\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lc1/e;", "LZ0/d;", "LU0/v;", "", "LU0/G1;", "LU0/B0;", "LZ0/t;", "node", "", "size", "<init>", "(LZ0/t;I)V", "T", "key", "b", "(LU0/v;)Ljava/lang/Object;", "value", "y", "(LU0/v;LU0/G1;)LU0/B0;", "Lc1/e$a;", "z", "()Lc1/e$a;", "g", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e extends d<C4906v<Object>, G1<Object>> implements B0 {

    /* renamed from: g  reason: collision with root package name */
    public static final b f23017g = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final e f23018h;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lc1/e$a;", "LZ0/f;", "LU0/v;", "", "LU0/G1;", "LU0/B0$a;", "Lc1/e;", "map", "<init>", "(Lc1/e;)V", "p", "()Lc1/e;", "g", "Lc1/e;", "getMap$runtime_release", "setMap$runtime_release", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends f<C4906v<Object>, G1<Object>> implements B0.a {

        /* renamed from: g  reason: collision with root package name */
        private e f23019g;

        public a(e eVar) {
            super(eVar);
            this.f23019g = eVar;
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof C4906v)) {
                return false;
            }
            return q((C4906v) obj);
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof G1)) {
                return false;
            }
            return s((G1) obj);
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (!(obj instanceof C4906v)) {
                return null;
            }
            return t((C4906v) obj);
        }

        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof C4906v) ? obj2 : u((C4906v) obj, (G1) obj2);
        }

        /* renamed from: p */
        public e g() {
            e eVar;
            if (i() == this.f23019g.s()) {
                eVar = this.f23019g;
            } else {
                n(new C5258e());
                eVar = new e(i(), size());
            }
            this.f23019g = eVar;
            return eVar;
        }

        public /* bridge */ boolean q(C4906v<Object> vVar) {
            return super.containsKey(vVar);
        }

        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (!(obj instanceof C4906v)) {
                return null;
            }
            return w((C4906v) obj);
        }

        public /* bridge */ boolean s(G1<Object> g12) {
            return super.containsValue(g12);
        }

        public /* bridge */ G1<Object> t(C4906v<Object> vVar) {
            return (G1) super.get(vVar);
        }

        public /* bridge */ G1<Object> u(C4906v<Object> vVar, G1<Object> g12) {
            return (G1) super.getOrDefault(vVar, g12);
        }

        public /* bridge */ G1<Object> w(C4906v<Object> vVar) {
            return (G1) super.remove(vVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lc1/e$b;", "", "<init>", "()V", "Lc1/e;", "Empty", "Lc1/e;", "a", "()Lc1/e;", "getEmpty$annotations", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            return e.f23018h;
        }

        private b() {
        }
    }

    static {
        t a10 = t.f14940e.a();
        C17542s.h(a10, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.ValueHolder<kotlin.Any?>>");
        f23018h = new e(a10, 0);
    }

    public e(t<C4906v<Object>, G1<Object>> tVar, int i10) {
        super(tVar, i10);
    }

    public /* bridge */ boolean A(C4906v<Object> vVar) {
        return super.containsKey(vVar);
    }

    public /* bridge */ boolean B(G1<Object> g12) {
        return super.containsValue(g12);
    }

    public /* bridge */ G1<Object> C(C4906v<Object> vVar) {
        return (G1) super.get(vVar);
    }

    public /* bridge */ G1<Object> D(C4906v<Object> vVar, G1<Object> g12) {
        return (G1) super.getOrDefault(vVar, g12);
    }

    public <T> T b(C4906v<T> vVar) {
        return C4914z.b(this, vVar);
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof C4906v)) {
            return false;
        }
        return A((C4906v) obj);
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof G1)) {
            return false;
        }
        return B((G1) obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof C4906v)) {
            return null;
        }
        return C((C4906v) obj);
    }

    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof C4906v) ? obj2 : D((C4906v) obj, (G1) obj2);
    }

    public B0 y(C4906v<Object> vVar, G1<Object> g12) {
        t.b<K, V> P10 = s().P(vVar.hashCode(), vVar, g12, 0);
        return P10 == null ? this : new e(P10.a(), size() + P10.b());
    }

    /* renamed from: z */
    public a o() {
        return new a(this);
    }
}
