package ha;

import java.util.List;
import java.util.ListIterator;

final class I extends G implements ListIterator {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ J f51951d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    I(J j10) {
        super(j10);
        this.f51951d = j10;
    }

    public final void add(Object obj) {
        boolean isEmpty = this.f51951d.isEmpty();
        a();
        ((ListIterator) this.f51912a).add(obj);
        K k10 = this.f51951d.f51965f;
        k10.f51991d = k10.f51991d + 1;
        if (isEmpty) {
            this.f51951d.b();
        }
    }

    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f51912a).hasPrevious();
    }

    public final int nextIndex() {
        a();
        return ((ListIterator) this.f51912a).nextIndex();
    }

    public final Object previous() {
        a();
        return ((ListIterator) this.f51912a).previous();
    }

    public final int previousIndex() {
        a();
        return ((ListIterator) this.f51912a).previousIndex();
    }

    public final void set(Object obj) {
        a();
        ((ListIterator) this.f51912a).set(obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public I(J j10, int i10) {
        super(j10, ((List) j10.f51934b).listIterator(i10));
        this.f51951d = j10;
    }
}
