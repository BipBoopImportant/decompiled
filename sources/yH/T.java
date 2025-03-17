package YH;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17693a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LYH/T;", "T", "", "LYH/Q;", "iterator", "<init>", "(Ljava/util/Iterator;)V", "", "hasNext", "()Z", "c", "()LYH/Q;", "a", "Ljava/util/Iterator;", "", "b", "I", "index", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class T<T> implements Iterator<Q<? extends T>>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private final Iterator<T> f140424a;

    /* renamed from: b  reason: collision with root package name */
    private int f140425b;

    public T(Iterator<? extends T> it) {
        C17542s.j(it, "iterator");
        this.f140424a = it;
    }

    /* renamed from: c */
    public final Q<T> next() {
        int i10 = this.f140425b;
        this.f140425b = i10 + 1;
        if (i10 < 0) {
            C16877v.x();
        }
        return new Q<>(i10, this.f140424a.next());
    }

    public final boolean hasNext() {
        return this.f140424a.hasNext();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
