package Y0;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17693a;
import tI.C17978n;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\fJ\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001b¨\u0006#"}, d2 = {"LY0/h;", "T", "", "LY0/a;", "LY0/f;", "builder", "", "index", "<init>", "(LY0/f;I)V", "LXH/N;", "m", "()V", "n", "k", "l", "previous", "()Ljava/lang/Object;", "next", "element", "add", "(Ljava/lang/Object;)V", "remove", "set", "c", "LY0/f;", "d", "I", "expectedModCount", "LY0/k;", "e", "LY0/k;", "trieIterator", "f", "lastIteratedIndex", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h<T> extends a<T> implements ListIterator<T>, C17693a {

    /* renamed from: c  reason: collision with root package name */
    private final f<T> f14723c;

    /* renamed from: d  reason: collision with root package name */
    private int f14724d;

    /* renamed from: e  reason: collision with root package name */
    private k<? extends T> f14725e;

    /* renamed from: f  reason: collision with root package name */
    private int f14726f = -1;

    public h(f<T> fVar, int i10) {
        super(i10, fVar.size());
        this.f14723c = fVar;
        this.f14724d = fVar.m();
        n();
    }

    private final void k() {
        if (this.f14724d != this.f14723c.m()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void l() {
        if (this.f14726f == -1) {
            throw new IllegalStateException();
        }
    }

    private final void m() {
        i(this.f14723c.size());
        this.f14724d = this.f14723c.m();
        this.f14726f = -1;
        n();
    }

    private final void n() {
        Object[] p10 = this.f14723c.p();
        if (p10 == null) {
            this.f14725e = null;
            return;
        }
        int d10 = l.d(this.f14723c.size());
        int i10 = C17978n.i(f(), d10);
        int q10 = (this.f14723c.q() / 5) + 1;
        k<? extends T> kVar = this.f14725e;
        if (kVar == null) {
            this.f14725e = new k<>(p10, i10, d10, q10);
            return;
        }
        C17542s.g(kVar);
        kVar.n(p10, i10, d10, q10);
    }

    public void add(T t10) {
        k();
        this.f14723c.add(f(), t10);
        h(f() + 1);
        m();
    }

    public T next() {
        k();
        c();
        this.f14726f = f();
        k<? extends T> kVar = this.f14725e;
        if (kVar == null) {
            T[] s10 = this.f14723c.s();
            int f10 = f();
            h(f10 + 1);
            return s10[f10];
        } else if (kVar.hasNext()) {
            h(f() + 1);
            return kVar.next();
        } else {
            T[] s11 = this.f14723c.s();
            int f11 = f();
            h(f11 + 1);
            return s11[f11 - kVar.a()];
        }
    }

    public T previous() {
        k();
        d();
        this.f14726f = f() - 1;
        k<? extends T> kVar = this.f14725e;
        if (kVar == null) {
            T[] s10 = this.f14723c.s();
            h(f() - 1);
            return s10[f()];
        } else if (f() > kVar.a()) {
            T[] s11 = this.f14723c.s();
            h(f() - 1);
            return s11[f() - kVar.a()];
        } else {
            h(f() - 1);
            return kVar.previous();
        }
    }

    public void remove() {
        k();
        l();
        this.f14723c.remove(this.f14726f);
        if (this.f14726f < f()) {
            h(this.f14726f);
        }
        m();
    }

    public void set(T t10) {
        k();
        l();
        this.f14723c.set(this.f14726f, t10);
        this.f14724d = this.f14723c.m();
        n();
    }
}
