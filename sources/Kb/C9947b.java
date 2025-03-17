package kb;

import java.util.NoSuchElementException;
import jb.l;

/* renamed from: kb.b  reason: case insensitive filesystem */
public abstract class C9947b<T> extends e0<T> {

    /* renamed from: a  reason: collision with root package name */
    private a f74922a = a.NOT_READY;

    /* renamed from: b  reason: collision with root package name */
    private T f74923b;

    /* renamed from: kb.b$a */
    private enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected C9947b() {
    }

    private boolean d() {
        this.f74922a = a.FAILED;
        this.f74923b = a();
        if (this.f74922a == a.DONE) {
            return false;
        }
        this.f74922a = a.READY;
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract T a();

    /* access modifiers changed from: protected */
    public final T c() {
        this.f74922a = a.DONE;
        return null;
    }

    public final boolean hasNext() {
        l.o(this.f74922a != a.FAILED);
        int ordinal = this.f74922a.ordinal();
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
            this.f74922a = a.NOT_READY;
            T a10 = C9933M.a(this.f74923b);
            this.f74923b = null;
            return a10;
        }
        throw new NoSuchElementException();
    }
}
