package jb;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: jb.b  reason: case insensitive filesystem */
abstract class C9891b<T> implements Iterator<T> {

    /* renamed from: a  reason: collision with root package name */
    private a f74781a = a.NOT_READY;

    /* renamed from: b  reason: collision with root package name */
    private T f74782b;

    /* renamed from: jb.b$a */
    private enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected C9891b() {
    }

    private boolean d() {
        this.f74781a = a.FAILED;
        this.f74782b = a();
        if (this.f74781a == a.DONE) {
            return false;
        }
        this.f74781a = a.READY;
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract T a();

    /* access modifiers changed from: protected */
    public final T c() {
        this.f74781a = a.DONE;
        return null;
    }

    public final boolean hasNext() {
        l.o(this.f74781a != a.FAILED);
        int ordinal = this.f74781a.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 2) {
            return d();
        }
        return false;
    }

    public final T next() {
        if (hasNext()) {
            this.f74781a = a.NOT_READY;
            T a10 = i.a(this.f74782b);
            this.f74782b = null;
            return a10;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
