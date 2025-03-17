package ea;

import java.util.NoSuchElementException;

abstract class a0 extends i0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f50943a;

    /* renamed from: b  reason: collision with root package name */
    private int f50944b;

    protected a0(int i10, int i11) {
        Y.b(i11, i10, "index");
        this.f50943a = i10;
        this.f50944b = i11;
    }

    /* access modifiers changed from: protected */
    public abstract Object a(int i10);

    public final boolean hasNext() {
        return this.f50944b < this.f50943a;
    }

    public final boolean hasPrevious() {
        return this.f50944b > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i10 = this.f50944b;
            this.f50944b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f50944b;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f50944b - 1;
            this.f50944b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f50944b - 1;
    }
}
