package g1;

import XH.C16820k;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.Metadata;
import oI.C17693a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0018\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0012J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u000bJ\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010 R\u0016\u0010$\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010 ¨\u0006%"}, d2 = {"Lg1/B;", "T", "", "Lg1/v;", "list", "", "offset", "<init>", "(Lg1/v;I)V", "LXH/N;", "c", "()V", "", "hasPrevious", "()Z", "nextIndex", "()I", "previous", "()Ljava/lang/Object;", "previousIndex", "element", "add", "(Ljava/lang/Object;)V", "hasNext", "next", "remove", "set", "a", "Lg1/v;", "getList", "()Lg1/v;", "b", "I", "index", "lastRequested", "d", "structure", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g1.B  reason: case insensitive filesystem */
final class C5321B<T> implements ListIterator<T>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private final C5353v<T> f23336a;

    /* renamed from: b  reason: collision with root package name */
    private int f23337b;

    /* renamed from: c  reason: collision with root package name */
    private int f23338c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f23339d;

    public C5321B(C5353v<T> vVar, int i10) {
        this.f23336a = vVar;
        this.f23337b = i10 - 1;
        this.f23339d = vVar.k();
    }

    private final void c() {
        if (this.f23336a.k() != this.f23339d) {
            throw new ConcurrentModificationException();
        }
    }

    public void add(T t10) {
        c();
        this.f23336a.add(this.f23337b + 1, t10);
        this.f23338c = -1;
        this.f23337b++;
        this.f23339d = this.f23336a.k();
    }

    public boolean hasNext() {
        return this.f23337b < this.f23336a.size() - 1;
    }

    public boolean hasPrevious() {
        return this.f23337b >= 0;
    }

    public T next() {
        c();
        int i10 = this.f23337b + 1;
        this.f23338c = i10;
        C5354w.g(i10, this.f23336a.size());
        T t10 = this.f23336a.get(i10);
        this.f23337b = i10;
        return t10;
    }

    public int nextIndex() {
        return this.f23337b + 1;
    }

    public T previous() {
        c();
        C5354w.g(this.f23337b, this.f23336a.size());
        int i10 = this.f23337b;
        this.f23338c = i10;
        this.f23337b--;
        return this.f23336a.get(i10);
    }

    public int previousIndex() {
        return this.f23337b;
    }

    public void remove() {
        c();
        this.f23336a.remove(this.f23337b);
        this.f23337b--;
        this.f23338c = -1;
        this.f23339d = this.f23336a.k();
    }

    public void set(T t10) {
        c();
        int i10 = this.f23338c;
        if (i10 >= 0) {
            this.f23336a.set(i10, t10);
            this.f23339d = this.f23336a.k();
            return;
        }
        Void unused = C5354w.e();
        throw new C16820k();
    }
}
