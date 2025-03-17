package a1;

import X0.g;
import YH.C16867k;
import Z0.d;
import b1.C5256c;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000 $*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001!B/\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"La1/b;", "E", "LYH/k;", "LX0/g;", "", "firstElement", "lastElement", "LZ0/d;", "La1/a;", "hashMap", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;LZ0/d;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "add", "(Ljava/lang/Object;)LX0/g;", "remove", "", "iterator", "()Ljava/util/Iterator;", "b", "Ljava/lang/Object;", "getFirstElement$runtime_release", "()Ljava/lang/Object;", "c", "getLastElement$runtime_release", "d", "LZ0/d;", "getHashMap$runtime_release", "()LZ0/d;", "", "a", "()I", "size", "e", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: a1.b  reason: case insensitive filesystem */
public final class C4983b<E> extends C16867k<E> implements g<E> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f15143e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f15144f = 8;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final C4983b f15145g;

    /* renamed from: b  reason: collision with root package name */
    private final Object f15146b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f15147c;

    /* renamed from: d  reason: collision with root package name */
    private final d<E, C4982a> f15148d;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"La1/b$a;", "", "<init>", "()V", "E", "LX0/g;", "a", "()LX0/g;", "La1/b;", "", "EMPTY", "La1/b;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: a1.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <E> g<E> a() {
            return C4983b.f15145g;
        }

        private a() {
        }
    }

    static {
        C5256c cVar = C5256c.f22939a;
        f15145g = new C4983b(cVar, cVar, d.f14915d.a());
    }

    public C4983b(Object obj, Object obj2, d<E, C4982a> dVar) {
        this.f15146b = obj;
        this.f15147c = obj2;
        this.f15148d = dVar;
    }

    public int a() {
        return this.f15148d.size();
    }

    public g<E> add(E e10) {
        if (this.f15148d.containsKey(e10)) {
            return this;
        }
        if (isEmpty()) {
            return new C4983b(e10, e10, this.f15148d.u(e10, new C4982a()));
        }
        Object obj = this.f15147c;
        C4982a aVar = this.f15148d.get(obj);
        C17542s.g(aVar);
        return new C4983b(this.f15146b, e10, this.f15148d.u(obj, aVar.e(e10)).u(e10, new C4982a(obj)));
    }

    public boolean contains(Object obj) {
        return this.f15148d.containsKey(obj);
    }

    public Iterator<E> iterator() {
        return new C4984c(this.f15146b, this.f15148d);
    }

    public g<E> remove(E e10) {
        C4982a aVar = this.f15148d.get(e10);
        if (aVar == null) {
            return this;
        }
        d<E, C4982a> w10 = this.f15148d.w(e10);
        if (aVar.b()) {
            C4982a aVar2 = w10.get(aVar.d());
            C17542s.g(aVar2);
            w10 = w10.u(aVar.d(), aVar2.e(aVar.c()));
        }
        if (aVar.a()) {
            C4982a aVar3 = w10.get(aVar.c());
            C17542s.g(aVar3);
            w10 = w10.u(aVar.c(), aVar3.f(aVar.d()));
        }
        return new C4983b(!aVar.b() ? aVar.c() : this.f15146b, !aVar.a() ? aVar.d() : this.f15147c, w10);
    }
}
