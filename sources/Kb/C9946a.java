package kb;

import java.util.NoSuchElementException;
import jb.l;

/* renamed from: kb.a  reason: case insensitive filesystem */
abstract class C9946a<E> extends f0<E> {

    /* renamed from: a  reason: collision with root package name */
    private final int f74920a;

    /* renamed from: b  reason: collision with root package name */
    private int f74921b;

    protected C9946a(int i10, int i11) {
        l.l(i11, i10);
        this.f74920a = i10;
        this.f74921b = i11;
    }

    /* access modifiers changed from: protected */
    public abstract E a(int i10);

    public final boolean hasNext() {
        return this.f74921b < this.f74920a;
    }

    public final boolean hasPrevious() {
        return this.f74921b > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i10 = this.f74921b;
            this.f74921b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f74921b;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i10 = this.f74921b - 1;
            this.f74921b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f74921b - 1;
    }
}
