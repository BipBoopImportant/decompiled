package WJ;

import QJ.c1;
import dI.C17168i;
import dI.C17169j;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\b2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0016\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u0015*\u00020\u00142\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00028\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"LWJ/L;", "T", "LQJ/c1;", "value", "Ljava/lang/ThreadLocal;", "threadLocal", "<init>", "(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V", "LdI/i;", "context", "t0", "(LdI/i;)Ljava/lang/Object;", "oldState", "LXH/N;", "N", "(LdI/i;Ljava/lang/Object;)V", "LdI/i$c;", "key", "minusKey", "(LdI/i$c;)LdI/i;", "LdI/i$b;", "E", "get", "(LdI/i$c;)LdI/i$b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Object;", "b", "Ljava/lang/ThreadLocal;", "c", "LdI/i$c;", "getKey", "()LdI/i$c;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class L<T> implements c1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f139534a;

    /* renamed from: b  reason: collision with root package name */
    private final ThreadLocal<T> f139535b;

    /* renamed from: c  reason: collision with root package name */
    private final C17168i.c<?> f139536c;

    public L(T t10, ThreadLocal<T> threadLocal) {
        this.f139534a = t10;
        this.f139535b = threadLocal;
        this.f139536c = new M(threadLocal);
    }

    public void N(C17168i iVar, T t10) {
        this.f139535b.set(t10);
    }

    public <R> R fold(R r10, p<? super R, ? super C17168i.b, ? extends R> pVar) {
        return c1.a.a(this, r10, pVar);
    }

    public <E extends C17168i.b> E get(C17168i.c<E> cVar) {
        if (!C17542s.e(getKey(), cVar)) {
            return null;
        }
        C17542s.h(this, "null cannot be cast to non-null type E of kotlinx.coroutines.internal.ThreadLocalElement.get");
        return this;
    }

    public C17168i.c<?> getKey() {
        return this.f139536c;
    }

    public C17168i minusKey(C17168i.c<?> cVar) {
        return C17542s.e(getKey(), cVar) ? C17169j.f142968a : this;
    }

    public C17168i plus(C17168i iVar) {
        return c1.a.b(this, iVar);
    }

    public T t0(C17168i iVar) {
        T t10 = this.f139535b.get();
        this.f139535b.set(this.f139534a);
        return t10;
    }

    public String toString() {
        return "ThreadLocal(value=" + this.f139534a + ", threadLocal = " + this.f139535b + ')';
    }
}
