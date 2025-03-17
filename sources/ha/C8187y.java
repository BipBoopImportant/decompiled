package ha;

import java.util.NoSuchElementException;

/* renamed from: ha.y  reason: case insensitive filesystem */
abstract class C8187y extends K0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f53009a;

    /* renamed from: b  reason: collision with root package name */
    private int f53010b;

    protected C8187y(int i10, int i11) {
        C8167w.b(i11, i10, "index");
        this.f53009a = i10;
        this.f53010b = i11;
    }

    /* access modifiers changed from: protected */
    public abstract Object a(int i10);

    public final boolean hasNext() {
        return this.f53010b < this.f53009a;
    }

    public final boolean hasPrevious() {
        return this.f53010b > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i10 = this.f53010b;
            this.f53010b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f53010b;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f53010b - 1;
            this.f53010b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f53010b - 1;
    }
}
