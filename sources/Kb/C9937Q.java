package kb;

import java.util.Objects;
import jb.l;

/* renamed from: kb.Q  reason: case insensitive filesystem */
class C9937Q<E> extends C9967v<E> {

    /* renamed from: e  reason: collision with root package name */
    static final C9967v<Object> f74882e = new C9937Q(new Object[0], 0);

    /* renamed from: c  reason: collision with root package name */
    final transient Object[] f74883c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f74884d;

    C9937Q(Object[] objArr, int i10) {
        this.f74883c = objArr;
        this.f74884d = i10;
    }

    public E get(int i10) {
        l.h(i10, this.f74884d);
        E e10 = this.f74883c[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    /* access modifiers changed from: package-private */
    public int i(Object[] objArr, int i10) {
        System.arraycopy(this.f74883c, 0, objArr, i10, this.f74884d);
        return i10 + this.f74884d;
    }

    /* access modifiers changed from: package-private */
    public Object[] j() {
        return this.f74883c;
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return this.f74884d;
    }

    /* access modifiers changed from: package-private */
    public int m() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return false;
    }

    public int size() {
        return this.f74884d;
    }
}
