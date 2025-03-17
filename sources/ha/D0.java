package ha;

import java.util.Iterator;

final class D0 extends C8089o0 {

    /* renamed from: c  reason: collision with root package name */
    private final transient C8079n0 f51835c;

    /* renamed from: d  reason: collision with root package name */
    private final transient C8059l0 f51836d;

    D0(C8079n0 n0Var, C8059l0 l0Var) {
        this.f51835c = n0Var;
        this.f51836d = l0Var;
    }

    /* access modifiers changed from: package-private */
    public final int b(Object[] objArr, int i10) {
        return this.f51836d.b(objArr, i10);
    }

    public final boolean contains(Object obj) {
        return this.f51835c.get(obj) != null;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.f51836d.listIterator(0);
    }

    public final J0 k() {
        return this.f51836d.listIterator(0);
    }

    public final int size() {
        return this.f51835c.size();
    }
}
