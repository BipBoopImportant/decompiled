package YH;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17693a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\t\b\u0012\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"LYH/e0;", "T", "LYH/d;", "", "delegate", "<init>", "(Ljava/util/List;)V", "", "index", "get", "(I)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "b", "Ljava/util/List;", "a", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
class e0<T> extends C16860d<T> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final List<T> f140440b;

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010*\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"YH/e0$a", "", "", "hasNext", "()Z", "hasPrevious", "next", "()Ljava/lang/Object;", "", "nextIndex", "()I", "previous", "previousIndex", "a", "Ljava/util/ListIterator;", "getDelegateIterator", "()Ljava/util/ListIterator;", "delegateIterator", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements ListIterator<T>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        private final ListIterator<T> f140441a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e0<T> f140442b;

        a(e0<? extends T> e0Var, int i10) {
            this.f140442b = e0Var;
            this.f140441a = e0Var.f140440b.listIterator(C16847D.Z(e0Var, i10));
        }

        public void add(T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasNext() {
            return this.f140441a.hasPrevious();
        }

        public boolean hasPrevious() {
            return this.f140441a.hasNext();
        }

        public T next() {
            return this.f140441a.previous();
        }

        public int nextIndex() {
            return C16847D.Y(this.f140442b, this.f140441a.previousIndex());
        }

        public T previous() {
            return this.f140441a.next();
        }

        public int previousIndex() {
            return C16847D.Y(this.f140442b, this.f140441a.nextIndex());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void set(T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e0(List<? extends T> list) {
        C17542s.j(list, "delegate");
        this.f140440b = list;
    }

    public int a() {
        return this.f140440b.size();
    }

    public T get(int i10) {
        return this.f140440b.get(C16847D.X(this, i10));
    }

    public Iterator<T> iterator() {
        return listIterator(0);
    }

    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    public ListIterator<T> listIterator(int i10) {
        return new a(this, i10);
    }
}
