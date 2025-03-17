package ha;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class X implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    int f52343a;

    /* renamed from: b  reason: collision with root package name */
    int f52344b;

    /* renamed from: c  reason: collision with root package name */
    int f52345c = -1;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C7959b0 f52346d;

    /* synthetic */ X(C7959b0 b0Var, W w10) {
        this.f52346d = b0Var;
        this.f52343a = b0Var.f52429e;
        this.f52344b = b0Var.f();
    }

    private final void c() {
        if (this.f52346d.f52429e != this.f52343a) {
            throw new ConcurrentModificationException();
        }
    }

    /* access modifiers changed from: package-private */
    public abstract Object a(int i10);

    public final boolean hasNext() {
        return this.f52344b >= 0;
    }

    public final Object next() {
        c();
        if (hasNext()) {
            int i10 = this.f52344b;
            this.f52345c = i10;
            Object a10 = a(i10);
            this.f52344b = this.f52346d.h(this.f52344b);
            return a10;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        c();
        C8167w.e(this.f52345c >= 0, "no calls to next() since the last call to remove()");
        this.f52343a += 32;
        C7959b0 b0Var = this.f52346d;
        int i10 = this.f52345c;
        Object[] objArr = b0Var.f52427c;
        objArr.getClass();
        b0Var.remove(objArr[i10]);
        this.f52344b--;
        this.f52345c = -1;
    }
}
