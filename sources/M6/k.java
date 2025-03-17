package M6;

import M6.c;
import M6.r;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0002\u001b\u001cB1\b\u0002\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0018\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00178VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"LM6/k;", "LM6/r$c;", "", "", "LM6/b;", "customScalarAdapters", "LM6/c;", "adapterContext", "", "unsafe", "<init>", "(Ljava/util/Map;LM6/c;Z)V", "LM6/k$a;", "f", "()LM6/k$a;", "c", "LM6/c;", "e", "()LM6/c;", "d", "Z", "Ljava/util/Map;", "adaptersMap", "LM6/r$d;", "getKey", "()LM6/r$d;", "key", "a", "b", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class k implements r.c {

    /* renamed from: f  reason: collision with root package name */
    public static final b f38586f = new b((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final k f38587g = new a().c();

    /* renamed from: h  reason: collision with root package name */
    public static final k f38588h = new a().d(true).c();

    /* renamed from: c  reason: collision with root package name */
    private final c f38589c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f38590d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, C6654b<?>> f38591e;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0018¨\u0006\u0019"}, d2 = {"LM6/k$a;", "", "<init>", "()V", "LM6/k;", "customScalarAdapters", "b", "(LM6/k;)LM6/k$a;", "", "unsafe", "d", "(Z)LM6/k$a;", "c", "()LM6/k;", "LM6/c;", "adapterContext", "a", "(LM6/c;)LM6/k$a;", "", "", "LM6/b;", "Ljava/util/Map;", "adaptersMap", "LM6/c;", "Z", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, C6654b<?>> f38592a = new LinkedHashMap();

        /* renamed from: b  reason: collision with root package name */
        private c f38593b = new c.a().a();

        /* renamed from: c  reason: collision with root package name */
        private boolean f38594c;

        public final a a(c cVar) {
            C17542s.j(cVar, "adapterContext");
            this.f38593b = cVar;
            return this;
        }

        public final a b(k kVar) {
            C17542s.j(kVar, "customScalarAdapters");
            this.f38592a.putAll(kVar.f38591e);
            return this;
        }

        public final k c() {
            return new k(this.f38592a, this.f38593b, this.f38594c, (DefaultConstructorMarker) null);
        }

        public final a d(boolean z10) {
            this.f38594c = z10;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LM6/k$b;", "LM6/r$d;", "LM6/k;", "<init>", "()V", "Empty", "LM6/k;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b implements r.d<k> {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ k(Map map, c cVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, cVar, z10);
    }

    public <E extends r.c> E a(r.d<E> dVar) {
        return r.c.a.b(this, dVar);
    }

    public r b(r.d<?> dVar) {
        return r.c.a.c(this, dVar);
    }

    public r c(r rVar) {
        return r.c.a.d(this, rVar);
    }

    public final c e() {
        return this.f38589c;
    }

    public final a f() {
        return new a().b(this);
    }

    public <R> R fold(R r10, p<? super R, ? super r.c, ? extends R> pVar) {
        return r.c.a.a(this, r10, pVar);
    }

    public r.d<?> getKey() {
        return f38586f;
    }

    private k(Map<String, ? extends C6654b<?>> map, c cVar, boolean z10) {
        this.f38589c = cVar;
        this.f38590d = z10;
        this.f38591e = map;
    }
}
