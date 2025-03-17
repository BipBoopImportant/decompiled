package ga;

import java.util.Iterator;

/* renamed from: ga.w  reason: case insensitive filesystem */
final class C7920w extends r {

    /* renamed from: c  reason: collision with root package name */
    private final transient C7915q f51419c;

    /* renamed from: d  reason: collision with root package name */
    private final transient C7912n f51420d;

    C7920w(C7915q qVar, C7912n nVar) {
        this.f51419c = qVar;
        this.f51420d = nVar;
    }

    /* access modifiers changed from: package-private */
    public final int b(Object[] objArr, int i10) {
        return this.f51420d.b(objArr, 0);
    }

    public final boolean contains(Object obj) {
        return this.f51419c.get(obj) != null;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.f51420d.listIterator(0);
    }

    public final int size() {
        return this.f51419c.size();
    }
}
