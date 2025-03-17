package U0;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LU0/E;", "T", "LU0/G1;", "Lkotlin/Function1;", "LU0/w;", "compute", "<init>", "(LnI/l;)V", "LU0/B0;", "map", "a", "(LU0/B0;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LnI/l;", "b", "()LnI/l;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class E<T> implements G1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<C4908w, T> f13743a;

    public E(C17642l<? super C4908w, ? extends T> lVar) {
        this.f13743a = lVar;
    }

    public T a(B0 b02) {
        return this.f13743a.invoke(b02);
    }

    public final C17642l<C4908w, T> b() {
        return this.f13743a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof E) && C17542s.e(this.f13743a, ((E) obj).f13743a);
    }

    public int hashCode() {
        return this.f13743a.hashCode();
    }

    public String toString() {
        return "ComputedValueHolder(compute=" + this.f13743a + ')';
    }
}
