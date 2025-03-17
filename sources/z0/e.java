package Z0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import oI.C17693a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B;\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u001e\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00028\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u0015R2\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b0\u00078\u0004X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010$\u001a\u00020\f8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\f\n\u0004\b\u0013\u0010%\u0012\u0004\b&\u0010\u0012¨\u0006'"}, d2 = {"LZ0/e;", "K", "V", "T", "", "LZ0/t;", "node", "", "LZ0/u;", "path", "<init>", "(LZ0/t;[LZ0/u;)V", "", "pathIndex", "i", "(I)I", "LXH/N;", "f", "()V", "c", "d", "()Ljava/lang/Object;", "", "hasNext", "()Z", "next", "a", "[LZ0/u;", "h", "()[LZ0/u;", "b", "I", "getPathLastIndex", "()I", "k", "(I)V", "pathLastIndex", "Z", "getHasNext$annotations", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class e<K, V, T> implements Iterator<T>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private final u<K, V, T>[] f14920a;

    /* renamed from: b  reason: collision with root package name */
    private int f14921b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f14922c = true;

    public e(t<K, V> tVar, u<K, V, T>[] uVarArr) {
        this.f14920a = uVarArr;
        uVarArr[0].n(tVar.p(), tVar.m() * 2);
        this.f14921b = 0;
        f();
    }

    private final void c() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void f() {
        if (!this.f14920a[this.f14921b].i()) {
            for (int i10 = this.f14921b; -1 < i10; i10--) {
                int i11 = i(i10);
                if (i11 == -1 && this.f14920a[i10].k()) {
                    this.f14920a[i10].m();
                    i11 = i(i10);
                }
                if (i11 != -1) {
                    this.f14921b = i11;
                    return;
                }
                if (i10 > 0) {
                    this.f14920a[i10 - 1].m();
                }
                this.f14920a[i10].n(t.f14940e.a().p(), 0);
            }
            this.f14922c = false;
        }
    }

    private final int i(int i10) {
        if (this.f14920a[i10].i()) {
            return i10;
        }
        if (!this.f14920a[i10].k()) {
            return -1;
        }
        t<? extends K, ? extends V> d10 = this.f14920a[i10].d();
        if (i10 == 6) {
            this.f14920a[i10 + 1].n(d10.p(), d10.p().length);
        } else {
            this.f14920a[i10 + 1].n(d10.p(), d10.m() * 2);
        }
        return i(i10 + 1);
    }

    /* access modifiers changed from: protected */
    public final K d() {
        c();
        return this.f14920a[this.f14921b].c();
    }

    /* access modifiers changed from: protected */
    public final u<K, V, T>[] h() {
        return this.f14920a;
    }

    public boolean hasNext() {
        return this.f14922c;
    }

    /* access modifiers changed from: protected */
    public final void k(int i10) {
        this.f14921b = i10;
    }

    public T next() {
        c();
        T next = this.f14920a[this.f14921b].next();
        f();
        return next;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
