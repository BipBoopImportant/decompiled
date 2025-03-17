package Y0;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import oI.C17693a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010*\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0011R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"LY0/a;", "E", "", "", "index", "size", "<init>", "(II)V", "", "hasNext", "()Z", "hasPrevious", "nextIndex", "()I", "previousIndex", "LXH/N;", "c", "()V", "d", "a", "I", "f", "h", "(I)V", "b", "i", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class a<E> implements ListIterator<E>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private int f14703a;

    /* renamed from: b  reason: collision with root package name */
    private int f14704b;

    public a(int i10, int i11) {
        this.f14703a = i10;
        this.f14704b = i11;
    }

    public final int a() {
        return this.f14704b;
    }

    public void add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void c() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final void d() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
    }

    public final int f() {
        return this.f14703a;
    }

    public final void h(int i10) {
        this.f14703a = i10;
    }

    public boolean hasNext() {
        return this.f14703a < this.f14704b;
    }

    public boolean hasPrevious() {
        return this.f14703a > 0;
    }

    public final void i(int i10) {
        this.f14704b = i10;
    }

    public int nextIndex() {
        return this.f14703a;
    }

    public int previousIndex() {
        return this.f14703a - 1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void set(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
