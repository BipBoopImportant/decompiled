package U0;

import h1.b;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import oI.C17693a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017¨\u0006\u001c"}, d2 = {"LU0/T;", "", "Lh1/b;", "LU0/c1;", "table", "", "start", "end", "<init>", "(LU0/c1;II)V", "LXH/N;", "d", "()V", "", "hasNext", "()Z", "c", "()Lh1/b;", "a", "LU0/c1;", "getTable", "()LU0/c1;", "b", "I", "getEnd", "()I", "index", "version", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class T implements Iterator<b>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private final C4865c1 f13878a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13879b;

    /* renamed from: c  reason: collision with root package name */
    private int f13880c;

    /* renamed from: d  reason: collision with root package name */
    private final int f13881d;

    public T(C4865c1 c1Var, int i10, int i11) {
        this.f13878a = c1Var;
        this.f13879b = i11;
        this.f13880c = i10;
        this.f13881d = c1Var.F();
        if (c1Var.G()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void d() {
        if (this.f13878a.F() != this.f13881d) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: c */
    public b next() {
        d();
        int i10 = this.f13880c;
        this.f13880c = C4871e1.I(this.f13878a.A(), i10) + i10;
        return new C4868d1(this.f13878a, i10, this.f13881d);
    }

    public boolean hasNext() {
        return this.f13880c < this.f13879b;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
