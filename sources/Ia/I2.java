package ia;

import java.util.NoSuchElementException;

abstract class I2 extends C8241d {

    /* renamed from: a  reason: collision with root package name */
    private final int f53278a;

    /* renamed from: b  reason: collision with root package name */
    private int f53279b;

    protected I2(int i10, int i11) {
        G1.b(i11, i10, "index");
        this.f53278a = i10;
        this.f53279b = i11;
    }

    /* access modifiers changed from: protected */
    public abstract Object a(int i10);

    public final boolean hasNext() {
        return this.f53279b < this.f53278a;
    }

    public final boolean hasPrevious() {
        return this.f53279b > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i10 = this.f53279b;
            this.f53279b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f53279b;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f53279b - 1;
            this.f53279b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f53279b - 1;
    }
}
