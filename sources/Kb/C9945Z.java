package kb;

import jb.l;

/* renamed from: kb.Z  reason: case insensitive filesystem */
final class C9945Z<E> extends C9970y<E> {

    /* renamed from: c  reason: collision with root package name */
    final transient E f74919c;

    C9945Z(E e10) {
        this.f74919c = l.j(e10);
    }

    public C9967v<E> b() {
        return C9967v.F(this.f74919c);
    }

    public boolean contains(Object obj) {
        return this.f74919c.equals(obj);
    }

    public final int hashCode() {
        return this.f74919c.hashCode();
    }

    /* access modifiers changed from: package-private */
    public int i(Object[] objArr, int i10) {
        objArr[i10] = this.f74919c;
        return i10 + 1;
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return false;
    }

    /* renamed from: q */
    public e0<E> iterator() {
        return C9923C.r(this.f74919c);
    }

    public int size() {
        return 1;
    }

    public String toString() {
        return '[' + this.f74919c.toString() + ']';
    }
}
