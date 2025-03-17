package ga;

import java.util.NoSuchElementException;

/* renamed from: ga.f  reason: case insensitive filesystem */
abstract class C7904f extends B {

    /* renamed from: a  reason: collision with root package name */
    private final int f51393a;

    /* renamed from: b  reason: collision with root package name */
    private int f51394b;

    protected C7904f(int i10, int i11) {
        C7902d.b(i11, i10, "index");
        this.f51393a = i10;
        this.f51394b = i11;
    }

    /* access modifiers changed from: protected */
    public abstract Object a(int i10);

    public final boolean hasNext() {
        return this.f51394b < this.f51393a;
    }

    public final boolean hasPrevious() {
        return this.f51394b > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i10 = this.f51394b;
            this.f51394b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f51394b;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f51394b - 1;
            this.f51394b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f51394b - 1;
    }
}
