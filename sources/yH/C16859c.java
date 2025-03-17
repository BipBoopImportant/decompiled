package YH;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import oI.C17693a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u0010\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH$¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LYH/c;", "T", "", "<init>", "()V", "", "h", "()Z", "hasNext", "next", "()Ljava/lang/Object;", "LXH/N;", "c", "value", "f", "(Ljava/lang/Object;)V", "d", "", "a", "I", "state", "b", "Ljava/lang/Object;", "nextValue", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: YH.c  reason: case insensitive filesystem */
public abstract class C16859c<T> implements Iterator<T>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private int f140427a;

    /* renamed from: b  reason: collision with root package name */
    private T f140428b;

    private final boolean h() {
        this.f140427a = 3;
        c();
        return this.f140427a == 1;
    }

    /* access modifiers changed from: protected */
    public abstract void c();

    /* access modifiers changed from: protected */
    public final void d() {
        this.f140427a = 2;
    }

    /* access modifiers changed from: protected */
    public final void f(T t10) {
        this.f140428b = t10;
        this.f140427a = 1;
    }

    public boolean hasNext() {
        int i10 = this.f140427a;
        if (i10 == 0) {
            return h();
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    public T next() {
        int i10 = this.f140427a;
        if (i10 == 1) {
            this.f140427a = 0;
            return this.f140428b;
        } else if (i10 == 2 || !h()) {
            throw new NoSuchElementException();
        } else {
            this.f140427a = 0;
            return this.f140428b;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
