package YH;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17693a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\nJ \u0010\u0010\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u001aR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001f"}, d2 = {"LYH/d0;", "T", "LYH/h;", "", "delegate", "<init>", "(Ljava/util/List;)V", "", "index", "get", "(I)Ljava/lang/Object;", "LXH/N;", "clear", "()V", "b", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "add", "(ILjava/lang/Object;)V", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "a", "Ljava/util/List;", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class d0<T> extends C16864h<T> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final List<T> f140436a;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0010+\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0010R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"YH/d0$a", "", "", "hasNext", "()Z", "hasPrevious", "next", "()Ljava/lang/Object;", "", "nextIndex", "()I", "previous", "previousIndex", "element", "LXH/N;", "add", "(Ljava/lang/Object;)V", "remove", "()V", "set", "a", "Ljava/util/ListIterator;", "getDelegateIterator", "()Ljava/util/ListIterator;", "delegateIterator", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements ListIterator<T>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        private final ListIterator<T> f140437a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d0<T> f140438b;

        a(d0<T> d0Var, int i10) {
            this.f140438b = d0Var;
            this.f140437a = d0Var.f140436a.listIterator(C16847D.Z(d0Var, i10));
        }

        public void add(T t10) {
            this.f140437a.add(t10);
            this.f140437a.previous();
        }

        public boolean hasNext() {
            return this.f140437a.hasPrevious();
        }

        public boolean hasPrevious() {
            return this.f140437a.hasNext();
        }

        public T next() {
            return this.f140437a.previous();
        }

        public int nextIndex() {
            return C16847D.Y(this.f140438b, this.f140437a.previousIndex());
        }

        public T previous() {
            return this.f140437a.next();
        }

        public int previousIndex() {
            return C16847D.Y(this.f140438b, this.f140437a.nextIndex());
        }

        public void remove() {
            this.f140437a.remove();
        }

        public void set(T t10) {
            this.f140437a.set(t10);
        }
    }

    public d0(List<T> list) {
        C17542s.j(list, "delegate");
        this.f140436a = list;
    }

    public int a() {
        return this.f140436a.size();
    }

    public void add(int i10, T t10) {
        this.f140436a.add(C16847D.Z(this, i10), t10);
    }

    public T b(int i10) {
        return this.f140436a.remove(C16847D.X(this, i10));
    }

    public void clear() {
        this.f140436a.clear();
    }

    public T get(int i10) {
        return this.f140436a.get(C16847D.X(this, i10));
    }

    public Iterator<T> iterator() {
        return listIterator(0);
    }

    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    public T set(int i10, T t10) {
        return this.f140436a.set(C16847D.X(this, i10), t10);
    }

    public ListIterator<T> listIterator(int i10) {
        return new a(this, i10);
    }
}
