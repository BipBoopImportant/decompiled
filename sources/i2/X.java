package I2;

import YH.C16877v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import nI.C17642l;
import oI.C17693a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017¨\u0006\u0019"}, d2 = {"LI2/X;", "T", "", "rootIterator", "Lkotlin/Function1;", "getChildIterator", "<init>", "(Ljava/util/Iterator;LnI/l;)V", "item", "LXH/N;", "c", "(Ljava/lang/Object;)V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "a", "LnI/l;", "", "b", "Ljava/util/List;", "stack", "Ljava/util/Iterator;", "iterator", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class X<T> implements Iterator<T>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<T, Iterator<T>> f8610a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Iterator<T>> f8611b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private Iterator<? extends T> f8612c;

    public X(Iterator<? extends T> it, C17642l<? super T, ? extends Iterator<? extends T>> lVar) {
        this.f8610a = lVar;
        this.f8612c = it;
    }

    private final void c(T t10) {
        Iterator<? extends T> invoke = this.f8610a.invoke(t10);
        if (invoke == null || !invoke.hasNext()) {
            while (!this.f8612c.hasNext() && !this.f8611b.isEmpty()) {
                this.f8612c = (Iterator) C16877v.I0(this.f8611b);
                C16877v.O(this.f8611b);
            }
            return;
        }
        this.f8611b.add(this.f8612c);
        this.f8612c = invoke;
    }

    public boolean hasNext() {
        return this.f8612c.hasNext();
    }

    public T next() {
        T next = this.f8612c.next();
        c(next);
        return next;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
