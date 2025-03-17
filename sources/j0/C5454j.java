package j0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import k0.d;
import kotlin.Metadata;
import oI.C17693a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0003H$¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0003H$¢\u0006\u0004\b\u000b\u0010\u0006J\u0010\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0017¨\u0006\u0019"}, d2 = {"Lj0/j;", "T", "", "", "startingSize", "<init>", "(I)V", "index", "c", "(I)Ljava/lang/Object;", "LXH/N;", "d", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "remove", "()V", "a", "I", "size", "b", "Z", "canRemove", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: j0.j  reason: case insensitive filesystem */
public abstract class C5454j<T> implements Iterator<T>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private int f24621a;

    /* renamed from: b  reason: collision with root package name */
    private int f24622b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f24623c;

    public C5454j(int i10) {
        this.f24621a = i10;
    }

    /* access modifiers changed from: protected */
    public abstract T c(int i10);

    /* access modifiers changed from: protected */
    public abstract void d(int i10);

    public boolean hasNext() {
        return this.f24622b < this.f24621a;
    }

    public T next() {
        if (hasNext()) {
            T c10 = c(this.f24622b);
            this.f24622b++;
            this.f24623c = true;
            return c10;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        if (!this.f24623c) {
            d.b("Call next() before removing an element.");
        }
        int i10 = this.f24622b - 1;
        this.f24622b = i10;
        d(i10);
        this.f24621a--;
        this.f24623c = false;
    }
}
